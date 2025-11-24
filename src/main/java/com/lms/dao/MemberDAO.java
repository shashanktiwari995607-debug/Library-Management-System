package com.lms.dao;

import com.lms.model.Member;
import java.util.List;

public interface MemberDAO {
    boolean addMember(Member member);
    Member getMemberByEmail(String email);
    Member getMemberById(int memberId);
    List<Member> getAllMembers();
}
