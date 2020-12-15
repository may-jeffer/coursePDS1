package com.iftm.course.entities;

import java.time.Instant;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "tb_order")
public class Order {
	private Long id;
	private Instant moment;
	
	@ManyToOne
	@JoinColumn(name = "clint_id")
	private User client;
	
	public Order () {		
	}
	
	public User client;
	
	public Order() {
	}
	
	public Order(long id, Instant moment, User client) {
		super();
		this.id = id;
		this.moment = moment;
		this.client = client;
	}
}
