package com.springboot.demo.mapper;

import com.springboot.demo.entity.Player;
import com.springboot.demo.entity.PlayerData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface PlayerDataMapper {

//    @Select("select * from player_data where p_id = #{pId}")
    PlayerData getPlayerDataById(@Param("pId") int pId);

}
