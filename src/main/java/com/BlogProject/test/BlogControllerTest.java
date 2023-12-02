package com.BlogProject.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 스프링이 com.Blog 패키지 이하를 스캔
// 특정 어노테이션이 붙어 있는 클래스 파일들을 (IOC)해서 컨테이너에서 관리
@RestController
public class BlogControllerTest {
    @GetMapping("/test/hello")
    public String hello(){
        return "<h1> hello spring boot</h1>";
    }
}
