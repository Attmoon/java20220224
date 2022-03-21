package chap10.book.s100801;

import chap10.book.s100701.Account;
import chap10.book.s100701.BalanceInsufficientExample;

public class Account2 {
	public static void main(String[] args) {
		Account account = new Account();
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액:" + account.getBalance());
		
		// 출금하기
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientExample e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
	}
}
