package br.com.senai.manutencaosenaiapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import br.com.senai.manutencaosenaiapi.entity.Peca;
import br.com.senai.manutencaosenaiapi.service.ClienteService;
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
	
	@Bean
	public CommandLineRunner commandlinerunner(ApplicationContext ac) {
		return args -> {
			
			try {
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
				
				Peca novaPeca = new Peca();
				novaPeca.setDescricao("Teclado");
				novaPeca.setQtdeEmEstoque(3);
				System.out.println("Peça salva");
				this.pecaService.inserir(null);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
				
			}
		};
	}
}