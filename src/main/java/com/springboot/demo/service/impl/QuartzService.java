package com.springboot.demo.service.impl;

import com.springboot.demo.mapper.PlayerMapper;
import com.springboot.demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
计划任务服务
 */

@Component
public class QuartzService {
    public final static long ONE_MINUTE =  60 * 1000;
    public final static long ONE_HOUR = 60 * 60 * 1000;

    @Autowired
    private PlayerService playerService;
    //    每分钟启动
    @Scheduled(fixedRate = ONE_HOUR)
    public void timerToNow(){
        playerService.cacheEvict();
        playerService.getTop();
//        System.out.println(playerService.getAll());
        System.out.println("调用了计划任务:now time:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
