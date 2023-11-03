package tn.esps.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor /* obligatoire selon la spécification JEE */
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity // correspondance avec une table dans le base de données
@Table(name = "t_compte")
public class Compte implements Serializable /* obligatoire selon la spécification JEE */ {
	private static final long serialVersionUID = 1L;
	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
	@Include // equals() et hashCode() sont générées à base du PK
	private Integer rib;
	private float solde;
	@Column(name = "client")
	private String nomClient;
	public Compte(float solde, String nomClient) {
		super();
		this.solde = solde;
		this.nomClient = nomClient;
	}
	
//	@Transient // pas de correspondance dans la BD // valeur calculable
//	private int firas;
}