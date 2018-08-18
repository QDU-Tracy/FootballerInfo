package com.springboot.demo.service.impl;

import com.springboot.demo.entity.PlayerData;
import com.springboot.demo.mapper.PlayerDataMapper;
import com.springboot.demo.service.PlayerDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PlayerDataServiceImpl implements PlayerDataService {

    @Autowired
    private PlayerDataMapper playerDataMapper;

    @Override
    public PlayerData getPlayerDataById(int pId) {
        return playerDataMapper.getPlayerDataById(pId);
    }
}