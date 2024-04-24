package Serzh.AK;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MController {
    @GetMapping("/enterclic")
    public String enterclic() {
        return "enterclic";
    }

    @GetMapping("/enterandsay")
    public String enterandsay(@RequestParam(name = "name", required = false) String n, Model model) {
        model.addAttribute("name", n);
        return "enter_and_say";
    }

    @GetMapping("/calculate")
//    @GetMapping("/perimetr")
    public String perimetr(@RequestParam(name = "a", defaultValue = "0") String a,
                           @RequestParam(name = "b", defaultValue = "0") String b,
                           Model model) {
        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            model.addAttribute("result", (x + y) * 2);
            model.addAttribute("ploshyad", x * y);
        } catch (
                NumberFormatException e) {
            model.addAttribute("errorMsg", "Промах, введите число");
        }
        return "calculate";
    }

//    @GetMapping("/ploshyad")
//    public String ploshyad(@RequestParam(name = "a", defaultValue = "0") String a,
//                           @RequestParam(name = "b", defaultValue = "0") String b,
//                           Model model) {
//        try {
//            int x = Integer.parseInt(a);
//            int y = Integer.parseInt(b);
//            model.addAttribute("result", x * y);
//        } catch (
//                NumberFormatException e) {
//            model.addAttribute("errorMsg", "Промах, введите число");
//        }
//        return "ploshyad";
//    }
}
//8282  IP config