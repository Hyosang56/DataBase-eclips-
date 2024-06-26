package ch13_classes.ex06.repository;

import ch13_classes.ex06.dto.MemberDTO;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    public static List<MemberDTO> memberDTOList = new ArrayList<>();
    public static long memberid = 1L;

    public static MemberDTO emailCheck(String memberEmail) {
        MemberDTO memberDTO = null;
        for (int i = 0; i < memberDTOList.size() ; i++) {
            if(memberEmail.equals(memberDTOList.get(i).getMemberEmail())){
                memberDTO = memberDTOList.get(i);
            }
        }
        return memberDTO;
    }

    public boolean signup(MemberDTO memberDTO1) {
        memberDTO1.setId(memberid++);
        return memberDTOList.add(memberDTO1);
    }

    public MemberDTO login(String memberEmail, String memberPassword) {
        for (MemberDTO memberDTO: memberDTOList) {
            if(memberEmail.equals(memberDTO.getMemberEmail()) && memberPassword.equals(memberDTO.getMemberPassword())){
                return memberDTO;
            }
        }
        return null;
    }
    public static List<MemberDTO> findAll() {
        return memberDTOList;
    }
    public boolean update(String loginEmail, String memberMobile) {
        boolean result = false;
        for (MemberDTO memberDTO : memberDTOList){
            if(loginEmail.equals(memberDTO.getMemberEmail())){
                memberDTO.setMemberMobile(memberMobile);
                result = true;
            }
        }
        return result;
    }
    public boolean delete(String loginEmail) {
        boolean result = false;
        for (int i = 0; i <memberDTOList.size() ; i++) {
            if(loginEmail.equals(memberDTOList.get(i).getMemberEmail())){
                memberDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }
}
