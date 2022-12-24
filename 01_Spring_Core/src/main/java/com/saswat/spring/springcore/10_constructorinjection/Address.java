package com.saswat.spring.springcore.constructorinjection;

public class Address {
	private String at;
	private String po;

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

	@Override
	public String toString() {
		return "Address [at=" + at + ", po=" + po + "]";
	}
}
