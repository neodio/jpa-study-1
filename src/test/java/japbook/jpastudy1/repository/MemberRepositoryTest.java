//package japbook.jpastudy1.repository;
//
//import japbook.jpastudy1.domain.Member;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest
//public class MemberRepositoryTest {
//
//    @Autowired
//    MemberRepository memberRepository; //의존성 주입
//
//    @Test //테스트 실행 함수
//    @Transactional // 트랜잭션 추가
//    @Rollback(value = false)
//    public void MemberRepositoryTest() throws Exception {
//        //given
//        Member member = new Member();
//        member.setUsername("memberA");
//
//        //when
//        Long saveId = memberRepository.save(member);
//        Member findMember = memberRepository.find(saveId);
//
//        //then
//        assertThat(findMember.getId(), is(equalTo(member.getId())));
//        assertThat(findMember.getUsername(), equalTo(member.getUsername()));
//    }
//}
