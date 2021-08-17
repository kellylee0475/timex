package com.te.timex.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="expense")
public class Expense{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;
	
	
	private String name;
	private String amount;

	//추가안해도되나??
//	@OneToMany(mappedBy = "expense")
//	private List<ExpenseList> expenselist;
	
	
	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Expense [id=" + id + ", name=" + name + ", amount=" + amount +  "]";
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}
	
}