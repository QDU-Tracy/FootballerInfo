package com.springboot.demo.mapper;

import com.springboot.demo.entity.Player;
import org.apache.ibatis.annotations.*;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 添加了@Mapper注解之后这个接口在编译时会生成相应的实现类
 *
 * 需要注意的是：这个接口中不可以定义同名的方法，因为会生成相同的id
 * 也就是说这个接口是不支持重载的
 */


public interface PlayerMapper {

    //get全部
    List<Player> getAll();

    List<Player> getByName(@Param("pName") String pName);

    //get热度球员
    List<Player> getTop();

    // 动态查询(测试)
    List<Player> getDynamicPlayer(Map<String, Object> dynamicMap);
}
