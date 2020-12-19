package mk.ukim.finki.dians.eshop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/search")
public class SearchController {
    @GetMapping
    public String getSearch(Model model, HttpServletRequest request){
        model.addAttribute("products",request.getSession().getAttribute("products"));

     return "category"  ;
    }
}
