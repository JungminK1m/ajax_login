package shop.mtcoding.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import shop.mtcoding.ajax.dto.ResponseDto;

@Controller
public class UserController {

    @GetMapping("/joinForm")
    public String joinForm() {
        return "joinForm";
    }

    // 스프링으 200만 응답 (오류가 안난다면)
    @GetMapping("/user/usernameCheck")
    public @ResponseBody ResponseDto<?> check(String username) {
        if (username == null || username.isEmpty()) {
            return new ResponseDto<>(-1, "username 쿼리스트링을 전달해 주세요", null);
        }

        if (username.equals("ssar")) {
            // 같은 게 있어
            return new ResponseDto<>(1, "동일한 username이 존재합니다.", false);
        } else {
            // 같은 게 없어
            return new ResponseDto<>(1, "동일한 username이 존재합니다.", false);
        }
    }
}
