package br.com.senai.manutencaosenaiapi.entity;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import lombok.Data;

@Data
@Entity(name = "OrdemDeServico")
@Table(name = "ordens_servicos")
public class OrdemDeServico {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente")
	@NotNull(message = "O cliente da ordem não deve ser nulo")
	private Cliente cliente;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tecnico")
	@NotNull(message = "O técnico da ordem não deve ser nulo")
	private Tecnico tecnicos;
	
	@Column(name = "data_abertura")
	@NotNull(message = "A data de abertura é obrigatória.")
	@PastOrPresent(message = "A data de abertura da ordem não deve ser posterior a data atual")
	private LocalDate dataDeAberturas;
	
	@Column(name = "data_encerramento")
	@PastOrPresent(message = "A data de encerramento da ordem não deve ser posterior a data atual")
	private LocalDate dataDeEncerramentos;
	
	@Column(name = "descricao_problema")
	@NotNull(message = "A descrição do problema deve ser obrigatória")
	@NotBlank(message = "Você não informou a descrição do problema")
	private String descricaoDoProblemas;
	
	@Column(name = "descricao_reparo")
	private String descricaoDoReparos;
	
	@ManyToMany
	@JoinTable(name = "pecas_reparos", 
	joinColumns = @JoinColumn(name = "id_ordem"), 
	inverseJoinColumns = @JoinColumn(name = "id_peca"))
	@NotEmpty(message = "Deve haver ao menos uma peça de reparo")
	private List<Peca> pecasDoReparos;
	
}