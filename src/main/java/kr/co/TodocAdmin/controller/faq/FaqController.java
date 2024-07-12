package kr.co.TodocAdmin.controller.faq;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class FaqController {

    //faq화면 출력
    @GetMapping("/faq")
    public String faq(){
        return "/faq/index";
    }

}
