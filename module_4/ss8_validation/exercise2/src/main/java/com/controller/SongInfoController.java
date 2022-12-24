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
    public String create(Model model, @Validated @ModelAttribute("songDto") SongInfoDto songDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        new SongInfoDto().validate(songDto, bindingResult);

        if (bindingResult.hasErrors()) {
            return "create";
        }
        SongInfo songInfo = new SongInfo();
        BeanUtils.copyProperties(songDto, songInfo);
        iSongInfoService.save(songInfo);
        List<SongInfo> songInfos = iSongInfoService.findAll();
        model.addAttribute("songInfos", songInfos);
        model.addAttribute("mess", "Them thành công! ");
        return "list";
    }


    @GetMapping("/edit/{id}")
    public String showEdit(Model model, @PathVariable("id") int id) {

        Optional<SongInfo> song = iSongInfoService.findById(id);
        SongInfoDto songDto = new SongInfoDto();
        songDto.setNameSong(song.get().getNameSong());
        songDto.setSinger(song.get().getSinger());
        songDto.setKindOfMusic(song.get().getKindOfMusic());
        model.addAttribute("songDto", songDto);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(Model model, @Validated @ModelAttribute("songDto") SongInfoDto songDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        new SongInfoDto().validate(songDto, bindingResult);
        if (bindingResult.hasErrors()) {
            return "edit";
        }

        SongInfo songInfo = new SongInfo();
        BeanUtils.copyProperties(songDto, songInfo);
        iSongInfoService.save(songInfo);
        List<SongInfo> songInfos = iSongInfoService.findAll();
        model.addAttribute("songInfos", songInfos);
        model.addAttribute("mess", "Update blog thành công! ");
        return "list";
    }
}
