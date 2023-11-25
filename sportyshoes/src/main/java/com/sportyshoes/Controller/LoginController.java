package main.java.com.sportyshoes.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String userLogin() {

        return "login"; // Thymeleaf template for user login
    }

    @GetMapping("/admin/admin-login")
    public String adminLogin() {
        return "admin-login"; // Thymeleaf template for admin login
    }
}
