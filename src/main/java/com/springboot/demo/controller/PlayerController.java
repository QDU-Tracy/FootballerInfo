package com.springboot.demo.controller;

import com.springboot.demo.entity.Player;
import com.springboot.demo.entity.PlayerData;
import com.springboot.demo.mapper.PlayerDataMapper;
import com.springboot.demo.mapper.PlayerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class PlayerController {

    @Autowired
    private PlayerMapper playerMapper;

    @Autowired
    private PlayerDataMapper playerDataMapper;

    @RequestMapping("/getPlayer")
    public List<Player> getPlayer(){
        List<Player> list = new ArrayList<>();

        return playerMapper.getAll();
    }

    @RequestMapping(value="/getPlayerByName")
    public List<Player> getPlayerByName( String pName){
//        String s = "";
//        s = s + pName;
//        System.out.printf(pName);
        if(pName == null) {
            pName="";
        }
        return playerMapper.getByName(pName);
    }

    @RequestMapping("/getPlayerData")
    public PlayerData getPlayerDataById(int pId){
        return playerDataMapper.getByName(pId);
    }


}
