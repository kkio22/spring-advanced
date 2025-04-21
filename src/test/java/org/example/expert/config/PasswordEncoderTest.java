package org.example.expert.config;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)//springextension 활성화 => jUnit 5에서 spring의 기능을 사용할 수 있도록 설정해 준다.
class PasswordEncoderTest {

 @InjectMocks
    private PasswordEncoder passwordEncoder; // PasswordEncoder는 Mock이 필요 없는, 직접 테스트 가능한 객체이기 때문입니다.

    @Test
    void matches_메서드가_정상적으로_동작한다() {
        // given
        String rawPassword = "testPassword"; // 예시 비밀번호 생성
        String encodedPassword = passwordEncoder.encode(rawPassword); //인코딩

        // when
        boolean matches = passwordEncoder.matches(rawPassword, encodedPassword); // 인코딩 비밀번호랑 입력한 비밀번호랑 같은지 true, false로 확인 매서드

        // then
        assertTrue(matches); //matches가 true인지 확인한다.
    }
}
