package br.com.senai.manutencaosenaiapi.service;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

import br.com.senai.manutencaosenaiapi.entity.OrdemDeServico;
import br.com.senai.manutencaosenaiapi.entity.Peca;
import br.com.senai.manutencaosenaiapi.repository.OrdemDeServicoRepository;

@Service
@Validated
public class OrdemDeServicoService {

	@Autowired
	private OrdemDeServicoRepository repository;

	public OrdemDeServico inserir(@Valid 
			@NotNull(message = "A nova ordem deve ser obrigatória") OrdemDeServico novaOrdem) {
		this.validar(novaOrdem);
		OrdemDeServico ordemSalva = repository.save(novaOrdem);
		return ordemSalva;
	}

	public OrdemDeServico alterar(@Valid 
			@NotNull(message = "A ordem salva deve ser obrigatória") OrdemDeServico ordemSalva) {
		this.validar(ordemSalva);
		OrdemDeServico ordemAtualizada = repository.save(ordemSalva);
		return ordemAtualizada;
	}

	public OrdemDeServico fechar(@Valid 
			@NotNull(message = "A ordem deve ser obrigatória") OrdemDeServico ordem) {
		Preconditions.checkArgument(ordem.getDataDeEncerramentos() != null, "A data de encerramento deve ser obrigatória");
		Preconditions.checkArgument(!Strings.isNullOrEmpty(ordem.getDescricaoDoReparos()),"A descrição do reparo deve ser obrigatória");
		boolean isPosterior = ordem.getDataDeEncerramentos().isAfter(ordem.getDataDeAberturas());
		Preconditions.checkArgument(isPosterior, "a data de encerramento tem de ser posterior à data de abertura");
		
		for (Peca peca : ordem.getPecasDoReparos()) {
			int qtdeDeOcorrencias = 0;
			for (Peca outraPeca : ordem.getPecasDoReparos()) {
				
				if (peca.equals(outraPeca)) {
					qtdeDeOcorrencias++;
				}
			}
			Preconditions.checkArgument(qtdeDeOcorrencias == 1, 
					"A peça: " + peca.getDescricao() + " já foi adicionada");
		}
		
		OrdemDeServico ordemAtualizada = repository.save(ordem);
		return ordemAtualizada;
	}

	private void validar(OrdemDeServico ordem) {
		Preconditions.checkArgument(ordem.getDescricaoDoReparos() == null,
				"A descrição do reparo não deve ser informada na abertura");
		Preconditions.checkArgument(ordem.getDataDeEncerramentos() == null,
				"A data de encerramento do reparo não deve ser informada na abertura");
		Preconditions.checkArgument(ordem.getPecasDoReparos().isEmpty(), "Não podem ser informadas peças na abertura da ordem");
	}

	public List<OrdemDeServico> listarPor(
			@NotNull(message = "O id do cliente deve ser obrigatório") 
			@Min(value = 1, message = "O id deve ser maior que zero") Integer idDoCliente) {
		return null;
	}

	public void removerPor(
			@NotNull(message = "O id da ordem deve ser obrigatório")
			@Min(value = 1, message = "O id deve ser maior que zero") Integer idDaOrdem) {

	}

	public OrdemDeServico buscarPor(
			@NotNull(message = "O id da ordem deve ser obrigatório") 
			@Min(value = 1, message = "O id da ordem deve ser maior que zero") Integer id) {
		return repository.buscarPor(id);
	}
}