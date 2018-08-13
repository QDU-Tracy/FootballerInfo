package com.springboot.demo.mapper;

import com.springboot.demo.entity.Player;
import com.springboot.demo.entity.PlayerData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PlayerDataMapper {

    @Select("select * from player_data where p_id = #{pId}")
    public PlayerData getByName(int pId);

}
