package com.jshop.entity;

// Generated 2013-9-1 10:07:10 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ElectronicMenuCartT generated by hbm2java
 */
@Entity
@Table(name = "electronic_menu_cart_t", catalog = "jshoper3")
public class ElectronicMenuCartT implements java.io.Serializable {

	private String id;
	private String electronicMenuOrderid;
	private String goodsid;
	private String goodsname;
	private String userid;
	private String username;
	private int needquantity;
	private Double price;
	private double memberprice;
	private Double changeprice;
	private double points;
	private double subtotal;
	private Date addtime;
	private Integer quantity;
	private String picture;
	private String usersetnum;
	private String weight;
	private String state;
	private Double deliveryprice;
	private String taste;
	private String ispackaway;
	private Integer lunchbox;
	private String cookingstate;
	private String tableNumber;
	private String roomName;
	private String tablestate;
	private String electronicMenuCartid;

	public ElectronicMenuCartT() {
	}

	public ElectronicMenuCartT(String id, String goodsid, String goodsname,
			int needquantity, double memberprice, double points,
			double subtotal, Date addtime, String picture, String usersetnum,
			String weight, String state, String tableNumber, String tablestate,
			String electronicMenuCartid) {
		this.id = id;
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.needquantity = needquantity;
		this.memberprice = memberprice;
		this.points = points;
		this.subtotal = subtotal;
		this.addtime = addtime;
		this.picture = picture;
		this.usersetnum = usersetnum;
		this.weight = weight;
		this.state = state;
		this.tableNumber = tableNumber;
		this.tablestate = tablestate;
		this.electronicMenuCartid = electronicMenuCartid;
	}

	public ElectronicMenuCartT(String id, String electronicMenuOrderid,
			String goodsid, String goodsname, String userid, String username,
			int needquantity, Double price, double memberprice,
			Double changeprice, double points, double subtotal, Date addtime,
			Integer quantity, String picture, String usersetnum, String weight,
			String state, Double deliveryprice, String taste,
			String ispackaway, Integer lunchbox, String cookingstate,
			String tableNumber, String roomName, String tablestate,
			String electronicMenuCartid) {
		this.id = id;
		this.electronicMenuOrderid = electronicMenuOrderid;
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.userid = userid;
		this.username = username;
		this.needquantity = needquantity;
		this.price = price;
		this.memberprice = memberprice;
		this.changeprice = changeprice;
		this.points = points;
		this.subtotal = subtotal;
		this.addtime = addtime;
		this.quantity = quantity;
		this.picture = picture;
		this.usersetnum = usersetnum;
		this.weight = weight;
		this.state = state;
		this.deliveryprice = deliveryprice;
		this.taste = taste;
		this.ispackaway = ispackaway;
		this.lunchbox = lunchbox;
		this.cookingstate = cookingstate;
		this.tableNumber = tableNumber;
		this.roomName = roomName;
		this.tablestate = tablestate;
		this.electronicMenuCartid = electronicMenuCartid;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "ELECTRONIC_MENU_ORDERID", length = 20)
	public String getElectronicMenuOrderid() {
		return this.electronicMenuOrderid;
	}

	public void setElectronicMenuOrderid(String electronicMenuOrderid) {
		this.electronicMenuOrderid = electronicMenuOrderid;
	}

	@Column(name = "GOODSID", nullable = false, length = 20)
	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	@Column(name = "GOODSNAME", nullable = false, length = 100)
	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	@Column(name = "USERID", length = 20)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Column(name = "USERNAME", length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "NEEDQUANTITY", nullable = false)
	public int getNeedquantity() {
		return this.needquantity;
	}

	public void setNeedquantity(int needquantity) {
		this.needquantity = needquantity;
	}

	@Column(name = "PRICE", precision = 10)
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Column(name = "MEMBERPRICE", nullable = false, precision = 10)
	public double getMemberprice() {
		return this.memberprice;
	}

	public void setMemberprice(double memberprice) {
		this.memberprice = memberprice;
	}

	@Column(name = "CHANGEPRICE", precision = 10)
	public Double getChangeprice() {
		return this.changeprice;
	}

	public void setChangeprice(Double changeprice) {
		this.changeprice = changeprice;
	}

	@Column(name = "POINTS", nullable = false, precision = 10)
	public double getPoints() {
		return this.points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	@Column(name = "SUBTOTAL", nullable = false, precision = 10)
	public double getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ADDTIME", nullable = false, length = 0)
	public Date getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	@Column(name = "QUANTITY")
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name = "PICTURE", nullable = false)
	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Column(name = "USERSETNUM", nullable = false, length = 20)
	public String getUsersetnum() {
		return this.usersetnum;
	}

	public void setUsersetnum(String usersetnum) {
		this.usersetnum = usersetnum;
	}

	@Column(name = "WEIGHT", nullable = false, length = 20)
	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "DELIVERYPRICE", precision = 10)
	public Double getDeliveryprice() {
		return this.deliveryprice;
	}

	public void setDeliveryprice(Double deliveryprice) {
		this.deliveryprice = deliveryprice;
	}

	@Column(name = "TASTE", length = 500)
	public String getTaste() {
		return this.taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	@Column(name = "ISPACKAWAY", length = 1)
	public String getIspackaway() {
		return this.ispackaway;
	}

	public void setIspackaway(String ispackaway) {
		this.ispackaway = ispackaway;
	}

	@Column(name = "LUNCHBOX")
	public Integer getLunchbox() {
		return this.lunchbox;
	}

	public void setLunchbox(Integer lunchbox) {
		this.lunchbox = lunchbox;
	}

	@Column(name = "COOKINGSTATE", length = 1)
	public String getCookingstate() {
		return this.cookingstate;
	}

	public void setCookingstate(String cookingstate) {
		this.cookingstate = cookingstate;
	}

	@Column(name = "TABLE_NUMBER", nullable = false, length = 20)
	public String getTableNumber() {
		return this.tableNumber;
	}

	public void setTableNumber(String tableNumber) {
		this.tableNumber = tableNumber;
	}

	@Column(name = "ROOM_NAME", length = 45)
	public String getRoomName() {
		return this.roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	@Column(name = "TABLESTATE", nullable = false, length = 1)
	public String getTablestate() {
		return this.tablestate;
	}

	public void setTablestate(String tablestate) {
		this.tablestate = tablestate;
	}

	@Column(name = "ELECTRONIC_MENU_CARTID", nullable = false, length = 20)
	public String getElectronicMenuCartid() {
		return this.electronicMenuCartid;
	}

	public void setElectronicMenuCartid(String electronicMenuCartid) {
		this.electronicMenuCartid = electronicMenuCartid;
	}

}
