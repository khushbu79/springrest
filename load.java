package com.springrest.createconnection;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="load")
public class load {

	@Id
	@GeneratedValue
	//(strategy=GenerationType.IDENTITY)
	private long Loadid;
	
	@Column(name = "loading point")
	private String loadingPoint;
	
	@Column(name = "unloading point")
	private String unloadingPoint;
	
	@Column(name = "product type")
	private String type_prod;
	
	@Column(name = "no of trucks")
	private int noOftrucks;
	
	@Column(name = "weight")
	private int weight;
	
	@Column(name = "comment optional")
	private String comment_opt;
	
	@Column(name = "shipperId")
	private String shipperId;
	
	@Column(name = "date")
	private Date date;

	public long getLoadid() {
		return Loadid;
	}

	public void setLoadid(long loadid) {
		Loadid = loadid;
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getType() {
		return type_prod;
	}

	public void setType(String type_prod) {
		this.type_prod = type_prod;
	}

	public int getNoOftrucks() {
		return noOftrucks;
	}

	public void setNoOftrucks(int noOftrucks) {
		this.noOftrucks = noOftrucks;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getComment() {
		return comment_opt;
	}

	public void setComment(String comment_opt) {
		this.comment_opt = comment_opt;
	}

	public String getShipperId() {
		return shipperId;
	}

	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "load [Loadid=" + Loadid + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
				+ ", type=" + type_prod + ", noOftrucks=" + noOftrucks + ", weight=" + weight + ", comment=" + comment_opt
				+ ", shipperId=" + shipperId + ", date=" + date + "]";
	}

	public load(long loadid, String loadingPoint, String unloadingPoint, String type_prod, int noOftrucks, int weight,
			String comment_opt, String shipperId, Date date) {
		super();
		Loadid = loadid;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.type_prod = type_prod;
		this.noOftrucks = noOftrucks;
		this.weight = weight;
		this.comment_opt = comment_opt;
		this.shipperId = shipperId;
		this.date = date;
	}

	public load() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	
	
	
	
	
	
}
