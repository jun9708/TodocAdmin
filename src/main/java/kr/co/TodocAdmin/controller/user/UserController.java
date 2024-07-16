package kr.co.TodocAdmin.controller.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class UserController {
    
    //User 리스트 조회
    @GetMapping("/user")
    public String index(){
        return "/user/index";
    }

    //UserDashBoard 조회
    @GetMapping("/UserDashBoard")
    public String userDashBoard(){
        return "/user/userDashBoard";
    }

    //UserInfo 조회
    @GetMapping("/userInfo")
    public String userInfo(){
        return "/user/userInfo";
    }

    //User 증상관리 조회
    @GetMapping("/userManager")
    public String UserManager(){
        return "/user/userManager";
    }

}
