package com.pgc.core.dao;

import com.pgc.core.entity.ExampleEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * CreateTime: 2018-12-09 18:25
 * ClassName: ExampleDao
 * Package: com.pgc.core.dao
 * Describe:
 * 测试例子的Dao层  持久层
 *
 * @author pgc
 */
@Repository
public interface ExampleDao{

    @Select("select * from user")
    List<ExampleEntity> findAll();

}
