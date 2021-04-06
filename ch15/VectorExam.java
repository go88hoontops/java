package com.jh.ch15;
import java.util.*;
//Board 클래스 하나생성해야함.
public class VectorExam {

	public static void main(String[] args) {

		List<Board> list = new Vector<Board>();
	
		list.add(new Board("제목1", "제목1","글쓴이1"));
		list.add(new Board("제목2", "제목2","글쓴이2"));
		list.add(new Board("제목3", "제목3","글쓴이3"));
		list.add(new Board("제목4", "제목4","글쓴이4"));
		list.add(new Board("제목5", "제목5","글쓴이5"));
		
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.sub +""+board.content+""+board.writer);
			}
		
		System.out.println("---");
		
		list.remove(1);
		list.remove(2);
		
		//???
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.sub +""+board.content+""+board.writer);
			}
		
		
		
		}

	
	}

