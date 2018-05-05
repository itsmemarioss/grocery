package br.com.cactusteam.grocery.model;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Compra {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@OneToMany
	private List<Item> itens;
	private LocalDate data;
	
	@OneToOne
	private Estabelecimento estabelecimento;
	
	public List<Item> getItens(){
		return Collections.unmodifiableList(itens);
	}

}
