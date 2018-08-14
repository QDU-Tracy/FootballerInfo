package com.springboot.demo.mapper;

import com.springboot.demo.entity.Player;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@Mapper
public interface PlayerMapper {

    //get全部
    @Cacheable(value = "getAll",key = "1")
    @Select("select * from player")
    public List<Player> getAll();

    @Select("select * from player where p_name like CONCAT(CONCAT('%', #{pName}),'%')")
    public List<Player> getByName(String pName);

    @Options(useGeneratedKeys=true,keyProperty="pId")
    @Insert("insert into player(p_name,p_ca) values(#{pName},#{pCa})")
    public Integer save(Player player);
}
