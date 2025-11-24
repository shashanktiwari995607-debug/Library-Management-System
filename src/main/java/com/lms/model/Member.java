package com.lms.model;

public class Member {
    private int memberId;
    private String name;
    private String email;
    private String password;
    private String role; // MEMBER / LIBRARIAN

    public Member() {}

    public Member(int memberId, String name, String email, String password, String role) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
