package co.edu.app;

import java.util.*;

public class AccountApp 
{
	Account[] accounts = new Account[100]; // 계좌정보를 저장할 배열.
	
	public void execute()
	{
		Scanner scn = new Scanner(System.in);
		while(true)
		{
			System.out.println("================================================");
			System.out.println("1.계좌 생성  2.입금  3.출금  4.목록조회  5.종료");
			System.out.println("================================================");
			System.out.println("선택 >> ");
			int menu = Integer.parseInt(scn.nextLine());
			
			if(menu == 1)
			{
				createAccount();
			}
			else if(menu == 2)
			{
				deposit();
			}
			else if(menu == 3)
			{
				withdraw();
			}
			else if(menu == 4)
			{
				accountList();
			}
			else if(menu == 5)
			{
				System.out.println("프로그램을 종료합니다!!");
				break;
			}
			else
			{
				System.out.println("1 - 5번 메뉴를 선택해주세요.");
			}
		}
	}
	
	// 계좌생성 실행 메서드
	public void createAccount()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("생성할 예금주 이름 입력>");
		String accName = scn.nextLine();
		System.out.println("생성할 계좌번호 입력>");
		String accNum = scn.nextLine();
		System.out.println("초기 입금액 입력 (없다면 0 입력) >");
		int money = scn.nextInt();
				
		Account acc = new Account(accNum,accName,money);
		
		int error = -1;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i]!=null && accounts[i].getAccountNum().equals(accNum))
			{
				error = 1;
				break;
			}
			
			if(accounts[i] == null)
			{
				accounts[i] = acc;
				error = 0;
				break;
			}
		}
				
		if(error == 0)
		{
			System.out.println("===========");
			System.out.println(" 계좌생성");
			System.out.println("===========");
			System.out.println("예금주 : "+accName);
			System.out.println("계좌번호 : "+accNum);
			System.out.println("초기 입금액 : "+money);
			System.out.println("결과 : 계좌생성을 성공했습니다. ");
			System.out.println();
		}
		else if(error == 1)
		{
			System.out.println("이미 중복된 계좌번호가 있습니다.");
			System.out.println();
		}
		else
		{
			System.out.println("더이상 저장할 공간이 없습니다.");
			System.out.println();
		}
	}
	
	// 입금처리 메서드
	public void deposit()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("입금할 계좌번호를 입력하세요 > ");
		String searchNum = scn.nextLine();
		int money=0;
		boolean ok = false;
		boolean a = false;
		
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i]!=null && accounts[i].getAccountNum().equals(searchNum))
			{
				System.out.println("입금할 금액을 입력하세요 > ");
				money = Integer.parseInt(scn.nextLine());
				ok = accounts[i].plusBalance(money);
				a = true;
			}
		}
		
		if(a==false)
		{
			System.out.println("계좌 번호를 찾을 수 없습니다!");
		}
		
		if(ok)
		{
			System.out.println("===========");
			System.out.println(" 계좌입금");
			System.out.println("===========");
			System.out.println("계좌번호 : "+searchNum);
			System.out.println("예금액 : "+money);
			System.out.println("결과 : 예금을 성공했습니다. ");
			System.out.println();
		}
		else
		{
			System.out.println("===========");
			System.out.println(" 계좌입금");
			System.out.println("===========");
			System.out.println("Error : 예금을 실패했습니다.");
			System.out.println();
		}
	}
	
	// 출금처리 메서드
	public void withdraw()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("출금할 계좌번호를 입력하세요 > ");
		String searchNum = scn.nextLine();
		int money=0;
		boolean ok = false;
		
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i]!=null && accounts[i].getAccountNum().equals(searchNum))
			{
				System.out.println("출금할 금액을 입력하세요 > ");
				money = Integer.parseInt(scn.nextLine());
				if(accounts[i].getBalance() >= money)
				{
					ok = accounts[i].minusBalance(money);
				}
				else
				{
					System.out.println("잔고가 부족합니다!");
					System.out.println();
				}
			}
			else if(accounts[i]!=null)
			{
				continue;
			}
			else
			{
				System.out.println("계좌번호를 조회할 수 없습니다!!");
				System.out.println();
				break;
			}
			
		}
		if(ok)
		{
			System.out.println("===========");
			System.out.println(" 계좌출금");
			System.out.println("===========");
			System.out.println("계좌번호 : "+searchNum);
			System.out.println("출금액 : "+money);
			System.out.println("결과 : 출금을 성공했습니다. ");
			System.out.println();
		}
		else
		{
			System.out.println("===========");
			System.out.println(" 계좌출금");
			System.out.println("===========");
			System.out.println("Error : 출금을 실패했습니다.");
			System.out.println();
		}
	}
	
	// 전체목록 메서드
	public void accountList()
	{
		System.out.println("===========");
		System.out.println(" 계좌목록");
		System.out.println("===========");
		System.out.println();
		System.out.println("  계좌번호         이름          잔고");
		System.out.println("================================================");
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i]!=null)
			{
				System.out.printf("%-10s         %-5s          %-20d%n",accounts[i].getAccountNum(),accounts[i].getAccountName(),accounts[i].getBalance());
			}
		}
		System.out.println();
		System.out.println();
	}
}
