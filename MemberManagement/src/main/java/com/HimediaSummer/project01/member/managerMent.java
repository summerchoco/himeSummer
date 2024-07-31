package com.HimediaSummer.project01.member;

import com.HimediaSummer.project01.DTO.memberDTO;

public class managerMent {

    private Cafe cafe ;

    public managerMent() {
        cafe = new Cafe();
    }

    public void addMember(int memNum, String name, int age ){
        memberDTO memdto = new memberDTO(memNum, name, age);

//        cafe.addMember(memdto);
        cafe.addMember(memdto);

        System.out.println("맴버가 추가되었습니다.");

    }

    public void getMember(int memNum){

        memberDTO memdto = cafe.getMember(memNum);


        System.out.println(" 조회한 맴버 :  " + cafe.getMember(memNum));

        if (memNum == 0) {
            System.out.println("맴버를 찾을 수 없습니다.");
        }

    }

    public void updateMember(int memNum, String name, int age ){

        cafe.updateMember(memNum, name, age);
        System.out.println("맴버를 update 했습니다.");


    }

    public void deleteMember(int memNum){

        cafe.deleteMember(memNum);
        System.out.println("맴버를 delete 했습니다.");

    }


}
