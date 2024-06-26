package ch13_classes.ex03;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private static List<MemberDTO> memberDTOList = new ArrayList<>();
    private static long memberId = 1L;

    public boolean signup(MemberDTO memberDTO) {
        memberDTO.setId(memberId++);
        return memberDTOList.add(memberDTO);
    }

    public boolean login(String memberEmail, String memberPassword) {
        boolean result = false;
        MemberService memberService = new MemberService();
        for (int i = 0; i < memberDTOList.size() ; i++) {
            if(memberEmail.equals(memberDTOList.get(i).getMemberEmail()) && memberPassword.equals(memberDTOList.get(i).getMemberPassword())) {
                result = true;
            }
        }
        return result;
    }
    public boolean emailCheck(String memberEmail) {
        boolean result = true;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                // 중복되는 이메일이 있다.
                result = false;
            }
        }
        return result;
    }

    public List<MemberDTO> findAll() {
        return memberDTOList;
    }

    public boolean update(String loginEmail,String memberMobile) {
        boolean result = false;
        for (int i = 0; i <memberDTOList.size() ; i++) {
            if(loginEmail.equals(memberDTOList.get(i).getMemberEmail())){
                memberDTOList.get(i).setMemberMobile(memberMobile);
                result = true;
            }
        }
        return result;
    }

    public boolean delete(String memberPassword) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberPassword.equals(memberDTOList.get(i).getMemberPassword())){
                memberDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }


}
