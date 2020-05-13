package com.mtbs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Theatre")
public class Theatre {

	@Id
	@Column(name="theatre_id",length=20)
	private int id;
	@Column(name="theatre_name",length=20)
	private String name;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="city_id",referencedColumnName="city_id")
	private City city;
	
	public Theatre() {

	}

	public Theatre(int id, String name, City city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		
	}

	public int getId() {
		return id;
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

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Theatre [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}