package tech.csm.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @ToString
@Table(name="transaction_master")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="transaction_id")
	private Integer tId;
	@Column(name="transaction_date")
	private Date tDate;
	@Column(name="transaction_type")
	private char tType;
	
	private Double amount;
	@ManyToOne
	@JoinColumn(name="accountNo")
	private Account account;
}
