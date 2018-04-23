package com.jose.solutis.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {

    @RequestMapping("/")
    public String gifLists(){
        return "home";
    }

    @RequestMapping("/gif")
    @ResponseBody
    public String gifLocationPrint(){
        return "Gif location";
    }

}
