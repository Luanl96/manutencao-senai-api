package br.com.senai.manutencaosenaiapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.google.common.base.Optional;

import br.com.senai.manutencaosenaiapi.entity.Peca;
import br.com.senai.manutencaosenaiapi.repository.PecasRepository;
import br.com.senai.manutencaosenaiapi.service.ClienteService;
import br.com.senai.manutencaosenaiapi.service.OrdemDeServicoService;
import br.com.senai.manutencaosenaiapi.service.PecaService;
import br.com.senai.manutencaosenaiapi.service.TecnicoService;

@SpringBootApplication
public class InitApp {

	public static void main(String[] args) {
		
		SpringApplication.run(InitApp.class, args);
	}
	
	@Autowired
	private TecnicoService service;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private PecaService pecaService;
	
	@Autowired
	private OrdemDeServicoService ordemService;
	
	@Autowired
	private PecasRepository pecasRepository;
	
	@Bean
	public CommandLineRunner commandlinerunner(ApplicationContext ac) {
		return args -> {
			
			try {
				
			    /*java.util.Optional<Peca> pecaEncontrada = pecasRepository.findById(7);
			    
			    pecaEncontrada.get().setEspecificacoes("Não é tão boa");
			    
			    Peca pecaEncontrada = pecasRepository.save(pecaEncontrada.get());
			    
			    System.out.println()*/
				
				/*java.util.Optional<Peca>  pecaEncontrada = pecasRepository.findById(7);
				if(pecaEncontrada.isPresent()) {
					System.out.println("Peça encontrada " + pecaEncontrada.get());
				}
				
				System.out.println("Peça encontrada: " + pecaEncontrada);*/
				
				/*Peca novaPeca = new Peca();
				novaPeca.setDescricao("Placa Mãe Gigabit");
				novaPeca.setEspecificacoes("Boa placa");
				novaPeca.setQtdeEmEstoque(10);
				this.pecasRepository.save(novaPeca);
				Peca pecaSalva = pecasRepository.save(novaPeca);
				System.out.println("Id da peça: " + pecaSalva.getId());*/
				/*OrdemDeServico novaOrdem = new OrdemDeServico();
				novaOrdem.setDescicaoDoProblema("Problema");
				Cliente cliente = new Cliente();
				cliente.setId(1);
				novaOrdem.setCliente(cliente);
				novaOrdem.setDataDeAbertura(LocalDate.now());         //testes
				Tecnico tecnico = new Tecnico();
				tecnico.setId(1);
				novaOrdem.setTecnico(tecnico);
				Peca peca = new Peca();
				//peca.setId(1);
				List<Peca> pecas = new ArrayList<Peca>();
				pecas.add(peca);
				novaOrdem.setPecasDoReparo(pecas);
				this.ordemService.inserir(novaOrdem);*/
				/*Tecnico novoTecnico = new Tecnico();
				novoTecnico.setNomeCompleto("Luan Lopes");
				LocalDate dataDeAdmissao = LocalDate.of(2023, 4, 7);    //testes
				novoTecnico.setDataDeAdmissao(dataDeAdmissao);
				this.service.inserir(novoTecnico);*/
				
				/*Tecnico tecnicoSalvo = new Tecnico();
				tecnicoSalvo.setId(1);
				tecnicoSalvo.setNomeCompleto("Luan Lopes");                    //testes
		 		tecnicoSalvo.setDataDeAdmissao(LocalDate.now());
				this.service.alterar(tecnicoSalvo);
				System.out.println("Técnico salvo com sucesso");*/
				//this.service.listarPor(" ");
				//this.service.removerPor(0);
				
				/*Cliente novoCliente = new Cliente();
				novoCliente.setNome("Luan");
				novoCliente.setSobrenome("Lopes");
				novoCliente.setCpf("098.535.434-53");
				novoCliente.setSexo(Sexo.MASCULINO);                            //testes
				novoCliente.setEndereco("Rua Prudente de Morais");
				novoCliente.setDataDeNascimento(LocalDate.of(2018, 9, 14));
				this.clienteService.inserir(novoCliente);
				System.out.println("Cliente salvo com sucesso");*/
				
				/*Peca novaPeca = new Peca();
				novaPeca.setDescricao("Teclado");
				novaPeca.setQtdeEmEstoque(3);
				System.out.println("Peça salva");
				this.pecaService.inserir(null);*/
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		};
	}
}