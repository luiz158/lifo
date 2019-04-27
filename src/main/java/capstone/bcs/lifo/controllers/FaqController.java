package capstone.bcs.lifo.controllers;

import capstone.bcs.lifo.commands.LoginForm;
import capstone.bcs.lifo.util.ValidSessionDataUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class FaqController {

    @RequestMapping("/faq")
    public String getPage(Model model){
        model.addAttribute("LoginForm", new LoginForm());
        return "faq";
    }

    @RequestMapping("/products/faq")
    public String getPageHotFix(Model model){
        model.addAttribute("LoginForm", new LoginForm());
        return "faq";
    }

//    @RequestMapping("/faq/{id}")
//    public String getPageVar(HttpServletRequest request, @PathVariable("id") Integer id, Model model) {
//        model.addAttribute("LoginForm", new LoginForm());
//        return "redirect:" + "/faq";
//    }


}
