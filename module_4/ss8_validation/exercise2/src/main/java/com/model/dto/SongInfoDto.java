package com.model.dto;

import com.sun.istack.NotNull;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SongInfoDto implements Validator {
    private int id;
    @NotBlank(message = "Không được phép bỏ trống!")
    @Size(max = 800,message = "Không vượt quá 800 ký tự")
    @NotNull
    @Pattern(regexp = "[a-zA-Z ]+",message = "Không chứa ký tự đặc biệt và số! ")
    private String nameSong;
    @NotBlank(message = "Không được phép bỏ trống!")
    @Size(max = 300,message = "Không vượt quá 300 ký tự")
    @Pattern(regexp = "[a-zA-Z ]+",message = "Không chứa ký tự đặc biệt và số! ")
    private String singer;
    @NotBlank(message = "Không được phép bỏ trống!")
    @Size(max = 1000,message = "Không vượt quá 1000 ký tự")
    @Pattern(regexp = "[a-zA-Z ,]+",message = "Không chứa ký tự đặc biệt và số(ngoại trừ dấu(,) !")
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
