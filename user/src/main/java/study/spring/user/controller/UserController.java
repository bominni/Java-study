package study.spring.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.BasicJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import study.spring.user.domain.User;
import study.spring.user.service.UserService;

import java.util.Base64;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String register() {
        return "user/register";
    }

    @PostMapping("/register")
    public String registerSave(
            @RequestParam(value = "email") String email
            , @RequestParam(value = "password") String password
            , @RequestParam(value = "name") String name
            , @RequestParam(value = "grade") int grade) {

        User user = new User(email, password, name, grade);
        userService.register(user);

        return "user/login";
    }

    @GetMapping("/my-login")
    public String login() {
        return "user/login";
    }

    @GetMapping("/getname")
    public User getName(@RequestParam("token") String token) {
        final String payloadJWT = token.split("\\.")[1];
        Base64.Decoder decoder = Base64.getUrlDecoder();

        final String payload = new String(decoder.decode(payloadJWT));
        JsonParser jsonParser = new BasicJsonParser();
        Map<String, Object> jsonArray = jsonParser.parseMap(payload);

        if (!jsonArray.containsKey("name")) {
            try {
                throw new Exception("유요하지 않은 AccessToken 입니다");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        User user = new User();
        user.setName(jsonArray.get("name").toString());
        return user;
    }

}