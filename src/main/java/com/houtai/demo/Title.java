package com.houtai.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class Title {
    @RequestMapping("/title")
    public String inputTitle(){
        String title="你好!vue，我是spring boot后台。欢迎对接!!!";
        return title;
    }

//    @RequestMapping("/readImage")
//    public t_banner[] readImage(){
//        try{
//            String name="goodsimg";
//            t_banner t_banner=new t_banner();
//            bannerService.getBanner(name);
////            t_banner.setName(bannerService.getBanner(name).getName());
////            t_banner.setAurl(bannerService.getBanner(name).getAurl());
////            t_banner.setImgurl(bannerService.getBanner(name).getImgurl());
//            return t_banner;
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//
//        }
//        return null;
//    }

    @Autowired
    bannerService bannerService;
    @RequestMapping("/insert")
    public void read(){
        File file=null;
        String[] strings={"http://www.baidu.com",
                "http://www.jd.com",
                "http://www.taobao.com",
                "http://www.mi.com"};
        try{
            String name=null;
            String imgurl= null;
            file=new File("src/main/resources/static/img/goodsimg");
            name=file.getName();
            File[] files=file.listFiles();
            for(int i=0;i<files.length;i++){
                imgurl="http://localhost:8081/img/"+name+"/"+files[i].getName().toString();
                bannerService.setBanner(imgurl,strings[i],name.toString());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @RequestMapping("/readImage")
    public t_banner[] readImage(){
        String name="goodsimg";
        Integer i=bannerService.getBanner(name).length;
        t_banner[] t_banner= new t_banner[i];

        for (int j=0;j<i;j++){
            t_banner[j]=bannerService.getBanner(name)[j];
            System.out.println(t_banner[j]);
        }
        return t_banner;
    }


}
