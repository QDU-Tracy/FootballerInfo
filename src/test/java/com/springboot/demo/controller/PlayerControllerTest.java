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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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

    @Test
    public void getDynamicPlayerTest() throws ParseException {
        List<Player> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat1.parse("1998-06-01");

        map.put("pCa", 100);
        map.put("pCountry", "Argentina");
        map.put("pBirthdate", date);
        list = playerService.getDynamicPlayer(map);
        System.out.println(list.toString());
    }
}