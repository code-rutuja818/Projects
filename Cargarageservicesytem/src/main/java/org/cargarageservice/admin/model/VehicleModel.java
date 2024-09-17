package org.cargarageservice.admin.model;

public class VehicleModel {
	private int car_id;
	private String no_plate;
	private String model;
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public String getNo_plate() {
		return no_plate;
	}
	public void setNo_plate(String no_plate) {
		this.no_plate = no_plate;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	private int cust_id;

	

}