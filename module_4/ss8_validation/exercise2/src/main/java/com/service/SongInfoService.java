package com.service;

import com.model.SongInfo;
import com.repository.ISongInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongInfoService implements ISongInfoService{
   @Autowired
   private ISongInfoRepository iSongInfoRepository;
    @Override
    public List<SongInfo> findAll() {
        return iSongInfoRepository.findAll();
    }

    @Override
    public void save(SongInfo songInfo) {
        iSongInfoRepository.save(songInfo);
    }

    @Override
    public Optional<SongInfo> findById(int id) {
        return iSongInfoRepository.findById(id);
    }

}
