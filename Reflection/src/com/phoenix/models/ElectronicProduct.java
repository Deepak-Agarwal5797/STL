package com.phoenix.models;

public class ElectronicProduct extends Product{

	public ElectronicProduct(int refId, String label) {
	
		this.refId = refId;
		this.label = label;
	}
	public int refId;
	public String label;
	
	
	public int getRefId() {
		return refId;
	}
	public void setRefId(int refId) {
		this.refId = refId;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
}
