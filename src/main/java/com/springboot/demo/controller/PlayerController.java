package com.springboot.demo.controller;

import com.springboot.demo.entity.Player;
import com.springboot.demo.entity.PlayerData;
import com.springboot.demo.mapper.PlayerDataMapper;
import com.springboot.demo.mapper.PlayerMapper;
import com.springboot.demo.service.PlayerDataService;
import com.springboot.demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @Autowired
    private PlayerDataService playerDataService;

    @RequestMapping("/getPlayer")
    public List<Player> getPlayer(){
        List<Player> list = new ArrayList<>();

        return playerService.getAll();
    }

    @RequestMapping(value="/getPlayerByName")
    public List<Player> getPlayerByName( String pName){
//        String s = "";
//        s = s + pName;
//        System.out.printf(pName);
        if(pName == null) {
            pName="";
        }
        return playerService.getPlayerByName(pName);
    }

    @RequestMapping("/getPlayerData")
    public PlayerData getPlayerDataById(int pId){
        return playerDataService.getPlayerDataById(pId);
    }


}
