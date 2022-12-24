package com.saswat.spring.springcore.innerbean;

public class Address {
	private String at;
	private String po;
	private String ps;
	private String pin;

	public String getAt() {
		return at;
	}

	public void setAt(String at) {
		this.at = at;
	}

	public String getPo() {
		return po;
	}

	public void setPo(String po) {
		this.po = po;
	}

	public String getPs() {
		return ps;
	}

	public void setPs(String ps) {
		this.ps = ps;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [at=" + at + ", po=" + po + ", ps=" + ps + ", pin=" + pin + "]";
	}
}
