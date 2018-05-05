package br.com.cactusteam.grocery.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private Produto produto;
	private int quantidade;
	private BigDecimal preco;
	
	
}
