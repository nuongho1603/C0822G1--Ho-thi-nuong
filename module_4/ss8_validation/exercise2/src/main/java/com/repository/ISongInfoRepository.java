package com.repository;

import com.model.SongInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISongInfoRepository extends JpaRepository<SongInfo,Integer> {
}
