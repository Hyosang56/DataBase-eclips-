package ch13_classes.ex07.repository;

import ch13_classes.ex07.dto.MemberDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {
    public static Map<Long, MemberDTO> memberDTOMap = new HashMap<>();
    public static long memberid = 1L;
    public static long memberKey = 1L;

    public static MemberDTO emailCheck(String memberEmail) {
        MemberDTO memberDTO = null;
        for (Long k: memberDTOMap.keySet()) {
            if(memberEmail.equals(memberDTOMap.get(k).getMemberEmail())){
                memberDTO = memberDTOMap.get(k);
            }
        }
        return memberDTO;
    }

    public boolean signup(MemberDTO memberDTO1) {
        memberDTO1.setId(memberid++);
        MemberDTO memberDTO =memberDTOMap.put(memberKey++,memberDTO1);
        if(memberDTO == null){
            return true;
        } else {
            return false;
        }
    }

    public MemberDTO login(String memberEmail, String memberPassword) {
        for (Long k: memberDTOMap.keySet()) {
            if(memberEmail.equals(memberDTOMap.get(k).getMemberEmail()) && memberPassword.equals(memberDTOMap.get(k).getMemberPassword())){
                MemberDTO memberDTO = memberDTOMap.get(k);
                return memberDTO;
            }
        }
        return null;
    }
    public static Map<Long,MemberDTO> findAll() {
        return memberDTOMap;
    }
    public boolean update(String loginEmail, String memberMobile) {
        boolean result = false;
        for (Long k: memberDTOMap.keySet()){
            if(loginEmail.equals(memberDTOMap.get(k).getMemberEmail())){
                MemberDTO memberDTO = memberDTOMap.get(k);
                memberDTO.setMemberMobile(memberMobile);
                memberDTOMap.put(k,memberDTOMap.put(k,memberDTO));
                result = true;
            }
        }
        return result;
    }
    public boolean delete(String loginEmail) {
        boolean result = false;
        for (Long k: memberDTOMap.keySet()) {
            if(loginEmail.equals(memberDTOMap.get(k).getMemberEmail())){
                memberDTOMap.remove(k);
                result = true;
            }
        }
        return result;
    }
}
