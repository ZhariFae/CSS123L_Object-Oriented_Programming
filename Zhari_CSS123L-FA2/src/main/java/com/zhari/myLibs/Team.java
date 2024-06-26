/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zhari.myLibs;

/**
 *
 * @author Zhari
 */
public class Team {
    private String name;
    private Member[] members;
    private int memberCnt;
    private int minAge;
    private int maxAge;

    public Team(String name, int maxMembers, int minAge, int maxAge) {
        this.name = name;
        this.members = new Member[maxMembers];
        this.memberCnt = 0;
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    public boolean addMember(Member member) {
        if (memberCnt < members.length && checkQualification(member)) {
            members[memberCnt++] = member;
            return true;
        }
        return false;
    }

    public boolean checkQualification(Member member) {
        return member.getAge() >= minAge && member.getAge() <= maxAge;
    }

    public int getMemberCnt() {
        return memberCnt;
    }

    public String getName() {
        return name;
    }

    public void showMembers() {
        System.out.println(getName() + " team = " + getMemberCnt());
        for (int i = 0; i < memberCnt; i++) {
            System.out.println(members[i].getName() + " (" + members[i].getAge() + ")");
        }
    }

    public boolean isFull() {
        return memberCnt >= members.length;
    }
}