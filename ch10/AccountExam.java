package com.jh.ch10;

public class AccountExam {

	public static void main(String[] args) {

			Account account = new Account();
			//예금시작.
			account.deposit(10000);
			System.out.println("예금액" + account.getBalance());
			
			//출금해볼까?
			try {
				System.out.println("출급신청 합니다 30000");
				account.withdraw(30000);
			}catch(BalanceInsufficienException e) {//예외메세지 얻기
				String message = e.getMessage();
				
				System.out.println(message);
				System.out.println();
				e.printStackTrace();
			}
	}

}
