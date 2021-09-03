package Logica;

import java.util.Date;

public class Recharge {

	private float value;
	private  Date dateRecharge;
	public Recharge(float value) {
		super();
		this.value = value;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	public Date getDateRecharge() {
		return dateRecharge;
	}
	public void setDateRecharge(Date dateRecharge) {
		this.dateRecharge = dateRecharge;
	}

	
}
