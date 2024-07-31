package com.HimediaSummer.project01.member;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        managerMent managerMent = new managerMent();

        int memNum;
        String name;
        int age;

        boolean loop = true;

        System.out.println("git upload test");
        while (loop == true) {

            System.out.println("맴버 관리 프로그램");
            System.out.println("1. 맴버 추가");
            System.out.println("2. 맴버 조회");
            System.out.println("3. 맴버 수정");
            System.out.println("4. 맴버 삭제");
            System.out.println("9. 종료");
            System.out.print("메뉴를 선택하세요: ");

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            switch (num){
                case 1:
                    System.out.print("추가할 맴버이름: ");
                    name = sc.next();
                    System.out.print("추가할 맴버코드: ");
                    memNum = sc.nextInt();
                    System.out.print("추가할 맴버나이: ");
                    age = sc.nextInt();
                    managerMent.addMember(memNum, name, age);
                    break;

                case 2:
                    System.out.print("조회할 맴버코드: ");
                    memNum = sc.nextInt();
                    System.out.println("memNum " + memNum);
                    managerMent.getMember(memNum);
                    break;

                case 3:
                    System.out.print("수정할 맴버코드 : ");
                    memNum = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("수정할 맴버이름 : ");
                    name  = sc.nextLine();
                    System.out.print("수정할 맴버나이 : ");
                    age = sc.nextInt();
                    managerMent.updateMember(memNum, name, age);
                    break;

                case 4:
                    System.out.print("삭제할 맴버코드 : ");
                    memNum = sc.nextInt();
                    managerMent.deleteMember(memNum);
                    break;

                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;

                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
