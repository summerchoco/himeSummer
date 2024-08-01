package com.mybatis.project;

import java.util.List;

public class PrintResult {
    public void printMenuList(List<MenuDTO> menuList) {

        System.out.println("요청하신 메뉴입니다.");

        for(MenuDTO m : menuList) {
            System.out.println(m.getName() + "(" + m.getPrice() + "원");
        }
    }

    public void printMenu(MenuDTO menu) {

        System.out.println("요청하신 메뉴 목록입니다.");
        System.out.println("menu = " + menu);
    }

    public void printErrorMessage(String errorType) {

        String errorMessage = "";

        switch (errorType) {
            case "selectList" : errorMessage = "[ERROR] 메뉴 목록 조회를 실패했습니다."; break;
            case "selectOne" : errorMessage = "[ERROR] 메뉴 조회를 실패했습니다."; break;
            case "insert" : errorMessage = "[ERROR] 신규 메뉴 등록 작업을 실패했습니다."; break;
            case "update" : errorMessage = "[ERROR] 기존 메뉴의 정보를 수정하는 작업을 실패했습니다."; break;
            case "delete" : errorMessage = "[ERROR] 기존 메뉴 삭제 작업을 실패했습니다."; break;
        }

        System.out.println(errorMessage);

    }

    public void printSeccessMessage(String dmlType) {

        String SeccessMessage = "";

        switch (dmlType) {
            case "insert" : SeccessMessage = "[INFO] 신규 메뉴 등록 작업을 성공적으로 완료했습니다.."; break;
            case "update" : SeccessMessage = "[INFO] 기존 메뉴의 정보를 수정하는 작업이 성공적으로 완료됐습니다.."; break;
            case "delete" : SeccessMessage = "[INFO] 기존 메뉴의 삭제 작업이 성공적으로 완료됐습니다.."; break;
        }

        System.out.println(SeccessMessage);

    }
}
