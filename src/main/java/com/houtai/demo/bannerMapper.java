package com.houtai.demo;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface bannerMapper {
    @Insert("insert into t_banner(imgurl,aurl,name)\n" +
            "values(#{imgurl},#{aurl},#{name})")
    public void setBannerUrl(String imgurl,String aurl,String name);

    @Select("select * from t_banner where name=#{name}")
    public t_banner[] getBannerUrl(String name);
}
