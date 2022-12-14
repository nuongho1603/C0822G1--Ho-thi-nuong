package com.service;

import com.model.SongInfo;

import java.util.List;
import java.util.Optional;

public interface ISongInfoService {
    List<SongInfo> findAll();

    void save(SongInfo songInfo);

    Optional<SongInfo> findById(int id);
}
