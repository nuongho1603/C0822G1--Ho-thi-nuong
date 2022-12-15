package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.PortUnreachableException;

@Controller
@RequestMapping("/dictionary")
public class DictionarySimpleController {
    @RequestMapping("")
    public String display() {
        return "/form";
    }

    @RequestMapping("/simple")
    public String translate(Model model, @RequestParam("english") String english) {
        model.addAttribute("english",english);
        String viet;
        switch (english) {
            case "i":
                viet ="tôi ";
                model.addAttribute("viet",viet);
                break;
            case "you":
                viet ="bạn";
                model.addAttribute("viet",viet);
                break;
            case "play":
                viet ="chơi";
                model.addAttribute("viet",viet);
                break;
            case "banana":
                viet ="chuối";
                model.addAttribute("viet",viet);
                break;
            case "nga":
                viet ="bịp";
                model.addAttribute("viet",viet);
                break;
            default:
                viet ="Từ này không có trong từ điển của tôi rồi bạn ạ! ";
                model.addAttribute("viet",viet);
                break;
        }
        return "/form";
    }
}
