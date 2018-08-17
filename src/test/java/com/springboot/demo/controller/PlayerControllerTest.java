package com.springboot.demo.controller;

import com.springboot.demo.entity.Player;
import com.springboot.demo.entity.PlayerData;
import com.springboot.demo.mapper.PlayerDataMapper;
import com.springboot.demo.mapper.PlayerMapper;
import com.springboot.demo.service.PlayerDataService;
import com.springboot.demo.service.PlayerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PlayerControllerTest {

    @Autowired
    private PlayerDataService playerDataService;

    @Autowired
    private PlayerService playerService;

    @Test
    public void getPlayerByName() {
        List<Player> list = new ArrayList<>();
        list = playerService.getPlayerByName("messi");
        System.out.printf(list.toString());
    }


    @Test
    public void getPlayerDataById(){
        PlayerData playerData = new PlayerData();
        playerData = playerDataService.getPlayerDataById(1);
        System.out.println(playerData.toString());

    }

    @Test
    public void getAllPlayer(){

        List<Player> list = new ArrayList<>();
        list = playerService.getAll();
        System.out.printf(list.toString());
    }
}