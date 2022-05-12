package br.com.senai.manutencaosenaiapi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import br.com.senai.manutencaosenaiapi.entity.Cliente;
import br.com.senai.manutencaosenaiapi.entity.OrdemDeServico;
import br.com.senai.manutencaosenaiapi.entity.Peca;
import br.com.senai.manutencaosenaiapi.entity.Tecnico;
import br.com.senai.manutencaosenaiapi.repository.PecasRepository;
import br.com.senai.manutencaosenaiapi.repository.TecnicosRepository;
import br.com.senai.manutencaosenaiapi.service.ClienteService;
import br.com.senai.manutencaosenaiapi.service.OrdemDeServicoService;
import br.com.senai.manutencaosenaiapi.service.PecaService;
import br.com.senai.manutencaosenaiapi.service.TecnicoService;

@SpringBootApplication
public class InitApp {

	public static void main(String[] args) {
		
		SpringApplication.run(InitApp.class, args);
	}
	
	/*@Autowired
	private TecnicoService service;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private PecaService pecaService;
	
	@Autowired
	private OrdemDeServicoService ordemService;
	
	@Autowired
	private PecasRepository pecasRepository;
	
	@Autowired
	private TecnicosRepository tecnicoRepository;*/
	
	@Autowired
	private TecnicoService tecnicoService;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private PecaService pecaService;
	
	@Autowired
	private OrdemDeServicoService ordemService;
	
	@Transactional
	@Bean
	public CommandLineRunner commandlinerunner(ApplicationContext ac) {
		return args -> {
			
			try {
				
				/*List<Cliente> clientes = clienteService.listarPor("j");
				Cliente clienteSelecionado = clientes.get(0);
				
				List<Tecnico> tecnicos = tecnicoService.listarPor("b");
				Tecnico tecnicoSelecionado = tecnicos.get(0);
				
				List<Peca> pecas = pecaService.listarPor("p");
				List<Peca> pecasDoReparo = new ArrayList<>();
				pecasDoReparo.add(pecas.get(0));
				pecasDoReparo.add(pecas.get(1));
				
				OrdemDeServico novaOrdem = new OrdemDeServico();
				novaOrdem.setCliente(clienteSelecionado);
				novaOrdem.setTecnico(tecnicoSelecionado);
				novaOrdem.setDataDeAbertura(LocalDate.of(2022, 5, 6));
				novaOrdem.setDescricaoDoProblema("Micro não liga");
				novaOrdem.setPecasDoReparo(pecasDoReparo);
				
				this.ordemService.inserir(novaOrdem);*/
				
				/*List<Cliente> clientes = clienteService.listarPor("j");
				OrdemDeServico ordemSalva = ordemService.buscarPor(6);
				ordemSalva.setCliente(clientes.get(2));
				ordemService.alterar(ordemSalva);
				System.out.println(ordemSalva);*/
				
				
				
				/*Tecnico novoTecnico = new Tecnico();
				novoTecnico.setNomeCompleto("Luan Lopes");
				novoTecnico.setDataDeAdmissao(LocalDate.of(2021, 4, 29));
				this.tecnicoRepository.save(novoTecnico);
				
				this.tecnicoRepository.deletarPor(4);
				//java.util.Optional<Peca> pecaEncontrada = pecasRepository.findById(11);*/
				
				/*List<Peca> pecasEncontradas = pecasRepository.listarPor("%p%");
				
				pecasEncontradas.forEach(peca -> {
					System.out.println("Peça encontrada: " + peca);
				});
				
				for (Peca peca : pecasEncontradas) {
					System.out.print("Peças do banho " + peca);
				}*/
 				
				//pecasRepository.delete(pecaEncontrada.get());
				
				    
			    /*if(pecaEncontrada.isPresent()) {
			    	System.out.println("Peça encontrada: " + pecaEncontrada.get());
			    }
			    
			    Peca pecaAlterada = pecasRepository.save(pecaEncontrada.get());
			    
			    Peca pecaEncontrada.get().setEspecificacoes("Não é tão boa");
			    
			    Peca pecaEncontrada = pecasRepository.save(pecaEncontrada.get());
			    
			    System.out.println(peca);*/
				
				/*java.util.Optional<Peca>  pecaEncontrada = pecasRepository.findById(7);
				if(pecaEncontrada.isPresent()) {
					System.out.println("Peça encontrada " + pecaEncontrada.get());
				}
				
				System.out.println("Peça encontrada: " + pecaEncontrada);
				
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
				
				OrdemDeServico ordemSalva = ordemService.buscarPor(6);
				ordemSalva.getPecasDoReparo()
						.add(ordemSalva.getPecasDoReparo().get(0));
				ordemSalva.setDescricaoDoReparo("Poeira");
				ordemSalva.setDataDeEncerramento(LocalDate.of(2022, 5, 6));
				this.ordemService.fechar(ordemSalva);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		};
	}
	public void remover() {
		
	}
}