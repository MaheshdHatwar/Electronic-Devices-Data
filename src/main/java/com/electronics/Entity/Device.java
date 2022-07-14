package com.electronics.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Device {

	@Id
	@GeneratedValue
	private long id;
	public Device() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Device(long id, String name, String category, long price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Device [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	private String name;
	private String category;
	private long price;
	
}
