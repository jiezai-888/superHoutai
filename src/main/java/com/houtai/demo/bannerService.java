package com.houtai.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bannerService {
    @Autowired
    bannerMapper bannerMapper;

    public t_banner[] getBanner(String name){
        return bannerMapper.getBannerUrl(name);
    }

    public void setBanner(String imgurl, String aurl,String name){

        bannerMapper.setBannerUrl(imgurl, aurl,name);
    }

}
