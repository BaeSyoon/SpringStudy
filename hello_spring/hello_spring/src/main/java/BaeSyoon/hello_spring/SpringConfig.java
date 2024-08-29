package BaeSyoon.hello_spring;

import BaeSyoon.hello_spring.repository.MemberRepository;
import BaeSyoon.hello_spring.repository.MemoryMemberRepository;
import BaeSyoon.hello_spring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean // 스프링 빈에 등록하라.
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
