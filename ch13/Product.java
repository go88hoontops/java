package com.jh.ch13;
//제너릭 클래스 .

public class Product <T , M> {

	private T kind;
	private M model;
	
	public T getKind() {
		return kind;
	}
	public M getModel() {
		return model;
	}

	
	public void setKind(T kind) {
	System.out.println("Kind: " +kind);
		this.kind = kind;
	}

	public void setModel(M model) {
	System.out.println("Model: " +model);
		this.model = model;
	}
	
	
//	
//	public T getkind(){return this.kind; }
//	public M getmodel() {return this.model;}
//	
//	public void setKiind(T kind) { this.kind = kind;}
//	public void setModel(M model) { this.model = model; }
}
