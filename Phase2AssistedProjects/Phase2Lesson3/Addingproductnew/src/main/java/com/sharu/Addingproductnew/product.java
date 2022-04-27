package com.sharu.Addingproductnew;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "product")
public class product {
@Id
@Column(name="id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
@Column(name = "name")
String name;
@Column(name = "price")
int price;
@Column(name = "qty")
int qty;
public product() {
// TODO Auto-generated constructor stub
}
@Override
public String toString() {
return "Product [id=" + id + ",name=" + name + ",price=" + price +",qty=" +qty
+ "]";
}
public product(String name, int price,int qty) {
 //this.id=id;
this.name = name;
this.price = price;
this.qty=qty;
}
}