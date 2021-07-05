package com.javaex.phone;

import java.util.List;
import java.util.Scanner;


public class PhoneApp {

	public static void main(String[] args) {
		
		boolean flag = true;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		PhoneDao phoneDao = new PhoneDao();
		List<PersonVo> personList;
		List<PersonVo> personSearchList;
		
		personList = phoneDao.getPersonList();
		
		

		System.out.println("***************************************");
		System.out.println("*           전화번호 관리 프로그램           *");
		System.out.println("***************************************");
		
		while(flag) {
			
			System.out.println("1. 리스트  2. 등록  3. 수정  4. 삭제  5. 검색  6. 종료");
			System.out.println("----------------------------------------------");
			System.out.print("> 메뉴번호 : ");
			num = sc.nextInt();
			
			switch(num) {
				
			//리스트
			case 1 :
				System.out.println("<1.리스트>");
				personList = phoneDao.getPersonList();
				printList(personList);
				
				break;
				
			//등록
			case 2 :
				System.out.println("<2.등록>");
				sc.nextLine();
				System.out.print("이름 > ");
				String iName = sc.nextLine();
				
				System.out.print("휴대전화 > ");
				String iHp = sc.nextLine();
				
				System.out.print("회사번호 > ");
				String iCompany = sc.nextLine();
				
				PersonVo iPersonVo = new PersonVo(iName, iHp, iCompany);
				phoneDao.phoneInsert(iPersonVo);
				
				break;
				
			//수정	
			case 3 :
				System.out.println("<3.수정>");
				
				System.out.print("번호 > ");
				int uId = sc.nextInt();
				sc.nextLine();
				
				System.out.print("이름 > ");
				String uName = sc.nextLine();
				
				System.out.print("휴대전화 > ");
				String uHp = sc.nextLine();
				
				System.out.print("회사번호 > ");
				String uCompany = sc.nextLine();
				
				PersonVo uPersonVo = new PersonVo(uName, uId, uHp, uCompany);
				phoneDao.phoneUpdate(uPersonVo);
				
				break;
	
			//삭제
			case 4 :
				System.out.println("<4.삭제>");
				System.out.print("번호 : ");
				int dId = sc.nextInt();
				phoneDao.phoneDelete(dId);
				
				break;
	
			//검색
			case 5 :
				System.out.println("<5.검색>");
				System.out.print("검색어 : ");
				System.out.println("");
				
				sc.nextLine();
				String keyword = sc.nextLine();
				
				personSearchList = phoneDao.getPersonList(keyword);
				printList(personSearchList);
				
				break;
	
			//종료	
			case 6 :
				System.out.println("***************************************");
				System.out.println("*               감사합니다               *");
				System.out.println("***************************************");
				
				flag = false;
				
				break;
				
			//기타
			default :
				System.out.println("[다시 입력해주세요.]");
				break;
			}
		}
		
		
		sc.close();
	}
	
	
	public static void printList(List<PersonVo> personList) {

		for(int i=0; i<personList.size(); i++) {
			
			PersonVo personVo = personList.get(i);
			System.out.println(personVo.getPerson_id() + ".\t" + personVo.getName() + "\t" + personVo.getHp() + "\t" + personVo.getCompany());
			
		}
		
		System.out.println("");
		
	}


}
