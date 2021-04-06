package com.jh.ch10;

public class FileInputStream implements AutoCloseable {

	private String file; 
	public FileInputStream(String file) {
		this.file=file;
	}
	
	public void read() {
		System.out.println(file +" 을 읽어봅니다.");
	}
	
	@Override
	public void close() throws Exception {
	
	//	System.out.println( flie + " 을 닫습니다.");
	}
}
 