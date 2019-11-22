package com.example.owldemo.Controller;

import java.util.List;
import com.example.owldemo.SC.*;
import com.example.owldemo.DAO.SCrepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OwlController {
    private static final Logger log = LoggerFactory.getLogger(OwlController.class);
    @Autowired
    private SCrepository SC;
    @GetMapping(path = "/")
    public String welcome(){

        return "index";
    }
    @GetMapping(path = "/search")
    public String search(@RequestParam String packageName, Model model) {
        List<safetyScan> sc1 = SC.findByPackageName(packageName);
        if (sc1.size() == 0) {
            return "error";
        } else {
           safetyScan s2 = sc1.get(0);
            model.addAttribute("packageName",s2.getPackageName());
            model.addAttribute("Tags",s2.getTags());
            model.addAttribute("Description", s2.getDescription());
            model.addAttribute("baseScore", s2.getBaseSCore());
            model.addAttribute("baseSeverity", s2.getBaseSeverity());
            model.addAttribute("ErrorId",s2.getErrorID());
            model.addAttribute("URL",s2.getURL());
        }
        return "index";
    }
//    @PostMapping(path="/search")
//    public String search()
}
