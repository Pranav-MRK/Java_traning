package Day8.Serization;

import java.io.Serializable;

public class Product implements Serializable {
private int prdid;
private String name;
private int qty;
public int getPrdid() {
	return prdid;
}
public void setPrdid(int prdid) {
	this.prdid = prdid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public Product(int prdid, String name, int qty) {
	super();
	this.prdid = prdid;
	this.name = name;
	this.qty = qty;
}
@Override
public String toString() {
	return "Product [prdid=" + prdid + ", name=" + name + ", qty=" + qty + "]";
}

}
