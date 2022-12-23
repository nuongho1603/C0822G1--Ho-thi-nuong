package com.model.dto;

import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class SongInfoDto implements Validator {
    private int id;
    @NotBlank(message = "Không được phép bỏ trống!")
    @Max(value = 800,message = "Không vượt quá 800 ký tự")
    @Pattern(regexp = "[/[!@#$%^&*,.]]")
    private String nameSong;
    @NotBlank(message = "Không được phép bỏ trống!")
    @Max(value = 300,message = "Không vượt quá 300 ký tự")
    @Pattern(regexp = "[/[!@#$%^&*,.]]")
    private String singer;
    @NotBlank(message = "Không được phép bỏ trống!")
    @Max(value = 1000,message = "Không vượt quá 1000 ký tự")
    @Pattern(regexp = "[/[!@#$%^&*.]]")
    private String kindOfMusic;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
