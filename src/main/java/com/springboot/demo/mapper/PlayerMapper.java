package com.springboot.demo.mapper;

import com.springboot.demo.entity.Player;
import org.apache.ibatis.annotations.*;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 添加了@Mapper注解之后这个接口在编译时会生成相应的实现类
 *
 * 需要注意的是：这个接口中不可以定义同名的方法，因为会生成相同的id
 * 也就是说这个接口是不支持重载的
 */


public interface PlayerMapper {

    //get全部
//    @Cacheable(value = "getAll",key = "1")
//    @Select("select * from player")
    List<Player> getAll();

//    @Select("select * from player where p_name like CONCAT(CONCAT('%', #{pName}),'%')")
    List<Player> getByName(@Param("pName") String pName);

//    @Options(useGeneratedKeys=true,keyProperty="pId")
//    @Insert("insert into player(p_name,p_ca) values(#{pName},#{pCa})")
//    public Integer save(Player player);
}
