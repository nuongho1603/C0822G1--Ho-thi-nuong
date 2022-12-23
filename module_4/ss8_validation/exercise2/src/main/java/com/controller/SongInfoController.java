package com.controller;

import com.model.SongInfo;
import com.model.dto.SongInfoDto;
import com.service.ISongInfoService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/song")
public class SongInfoController {
    @Autowired
    private ISongInfoService iSongInfoService;

    @RequestMapping("")
    public String show(Model model) {
        List<SongInfo> songInfos = iSongInfoService.findAll();
        model.addAttribute("songInfos", songInfos);
        return "list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("songDto", new SongInfoDto());
        return "create";
    }

    @PostMapping("/save")
    public String create(Model model, @Validated @ModelAttribute("songDoto") SongInfoDto songDoto, BindingResult bindingResult) {
        new SongInfoDto().validate(songDoto, bindingResult);

        if (bindingResult.hasErrors()) {
            return "create";
        }
        SongInfo songInfo = new SongInfo();
        BeanUtils.copyProperties(songDoto, songInfo);
        iSongInfoService.save(songInfo);
        model.addAttribute("mess", "Them thành công! ");
        return "list";
    }


    @GetMapping("/edit/{id}")
    public String showEdit(Model model, @PathVariable("id") int id) {
        List<SongInfo> songInfos = iSongInfoService.findAll();
        model.addAttribute("songInfos", songInfos);
        Optional<SongInfo> song = iSongInfoService.findById(id);
        model.addAttribute("song", song);
        return "/edit";
    }

    @PostMapping("/edit")
    public String edit(Model model, @ModelAttribute("song") SongInfo song, @Validated @ModelAttribute("songDoto") SongInfoDto songDoto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

//        new SongInfoDto().validate(songDoto,bindingResult);
//
//        if (bindingResult.hasErrors()) {
//            return "/edit";
//        }
////        SongInfo songInfo = new SongInfo();
//        BeanUtils.copyProperties(songDoto,song);

        iSongInfoService.save(song);
        List<SongInfo> songInfos = iSongInfoService.findAll();
        model.addAttribute("songInfos", songInfos);
        model.addAttribute("mess", "Update blog thành công! ");
        return "redirect:/song";
    }
}
