package ch16_interface.ex02;
import java.util.ArrayList;
import java.util.List;

public class MemberRepositoryList implements MemberRepository{
    private static List<MemberDTO> memberDTOList = new ArrayList<>();
    private static long memberId = 1L;

    @Override
    public boolean save(MemberDTO memberDTO) {
        memberDTO.setId(memberId++);
        return memberDTOList.add(memberDTO);
    }

    @Override
    public MemberDTO login(String memberEmail, String memberPassword) {
        MemberDTO memberDTO = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail()) && memberPassword.equals(memberDTOList.get(i).getMemberPassword())) {
                memberDTO = memberDTOList.get(i);
            }
        }
        return memberDTO;
    }

    @Override
    public List<MemberDTO> findAll() {
        return memberDTOList;
    }

    @Override
    public boolean update(String loginEmail, String mobile) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                memberDTOList.get(i).setMemberMobile(mobile);
                result = true;
            }
        }
        return result;
    }

    @Override
    public boolean delete(String loginEmail) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                memberDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }

    @Override
    public boolean emailCheck(String memberEmail) {
        boolean result = true;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                result = false;
            }
        }
        return result;
    }
}
