package com.HimediaSummer.project01.DTO;

public class memberDTO {
    int memNum;
    String name;
    int age;

    public memberDTO(int memNum, String name, int age) {
        this.memNum = memNum;
        this.name = name;
        this.age = age;
    }

    public int getMemNum() {
        return memNum;
    }

    public void setMemNum(int memNum) {
        this.memNum = memNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "memberDTO{" +
                "memNum=" + memNum +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
