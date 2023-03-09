package com.example.demo.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Icecream")
public class Icecream {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	@Column(name = "Icecream_name")
	private String flavours;

	@Column(name = "Icecream_Quantity")
	private int quantity;
	@Column(name = "Icecream_Rate")
	private  int rate;
	@Column(name = "No_of_Scoops")
	private  int scoops;
	@Column(name = "toppings")
	private String toppings;
	@Column(name = "Mobile")
	private int mobileno;
	@Column(name = "Mailid")
	private String mailid;

	public Icecream() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFlavours() {
		return flavours;
	}

	public void setFlavours(String flavours) {
		this.flavours = flavours;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getScoops() {
		return scoops;
	}

	public void setScoops(int scoops) {
		this.scoops = scoops;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public Icecream(Long id, String flavours, int quantity, int rate, int scoops, String toppings, int mobileno,
			String mailid) {
		super();
		this.id = id;
		this.flavours = flavours;
		this.quantity = quantity;
		this.rate = rate;
		this.scoops = scoops;
		this.toppings = toppings;
		this.mobileno = mobileno;
		this.mailid = mailid;
	}
	
	
}

