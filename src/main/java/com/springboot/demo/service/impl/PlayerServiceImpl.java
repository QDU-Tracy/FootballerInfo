package com.springboot.demo.service.impl;

import com.springboot.demo.entity.Player;
import com.springboot.demo.entity.PlayerData;
import com.springboot.demo.mapper.PlayerDataMapper;
import com.springboot.demo.mapper.PlayerMapper;
import com.springboot.demo.service.PlayerDataService;
import com.springboot.demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerMapper playerMapper;


    @Override
    public List<Player> getAll() {
        System.out.println("使用了MySql数据库");
        return playerMapper.getAll();
    }

    @Override
    public List<Player> getPlayerByName(String pName) {
        return playerMapper.getByName(pName);
    }

    @Override
    @CacheEvict(value="getTop",key = "1",allEntries = true)
    public void cacheEvict() {

    }

    @Override
    @Cacheable(value = "getTop",key = "1")
    public List<Player> getTop() {
        return playerMapper.getTop();
    }

    @Override
    public List<Player> getDynamicPlayer(Map<String, Object> dynamicMap) {

        return playerMapper.getDynamicPlayer(dynamicMap);
    }


}