package com.springboot.demo.service;

import com.springboot.demo.entity.Player;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PlayerService {
    List<Player> getAll();

    List<Player> getPlayerByName(@Param("pName") String pName);

    void cacheEvict();

    List<Player> getTop();

    List<Player> getDynamicPlayer(Map<String, Object> dynamicMap);

}
