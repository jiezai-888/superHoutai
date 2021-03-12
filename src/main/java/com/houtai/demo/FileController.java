//package com.houtai.demo;
//
//import ch.qos.logback.core.util.FileUtil;
//import org.springframework.boot.configurationprocessor.json.JSONObject;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.*;
//import java.net.SocketTimeoutException;
//
//@RestController
//@CrossOrigin
//public class FileController {
//    @RequestMapping("/upload")
//    public void upload(@RequestParam("file")MultipartFile file) throws IOException {
//        String filepath=file.getOriginalFilename();
//        BufferedOutputStream outputStream=new BufferedOutputStream(new FileOutputStream(filepath));
//        outputStream.flush();
//        outputStream.close();
//    }
//
//    @RequestMapping("/getfile")
//    public int getFilie() throws IOException {
//        FileInputStream fileInputStream=null;
//        int i=0;
//        byte[] bytes=new byte[3];
//       try{
//           fileInputStream=new FileInputStream("src/main/resources/fileTry/1.txt");
//
//           while(true){
//               Integer num=fileInputStream.read(bytes);
//
//               if (num==-1){
//                   break;
//               }else {
//                   i+=num;
//                   System.out.printf("该文件中有多少个字节:%d\n",i);
//                   System.out.println("byte数组中的值："+(new String(bytes,0,num)));
//                   System.out.println("还剩下多少字节："+(fileInputStream.available()));
//                   fileInputStream.skip(1);
//               }
//           }
//       }catch (FileNotFoundException e){
//           e.printStackTrace();
//       }finally {
//           if (fileInputStream !=null){
//               fileInputStream.close();
//           }
//       }
//
//        return i ;
//    }
//
//    @RequestMapping("/write")
//    public void Write(){
//        try{
//           DataOutputStream dataOutputStream=new DataOutputStream(
//                   new FileOutputStream("src/main/resources/fileTry/writeCopy6")
//           );
//           byte bytes=97;
//           String str="你好啊！";
//           boolean sex=false;
//           double d=3.14;
//           Long l=100l;
//           //写入
//            dataOutputStream.writeByte(bytes);
//            //这个写入字符串
//            dataOutputStream.writeUTF(str);
//            dataOutputStream.writeBoolean(sex);
//            dataOutputStream.writeDouble(d);
//            dataOutputStream.writeLong(l);
//
//            //刷新
//            dataOutputStream.flush();
//            dataOutputStream.close();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
////    @RequestMapping("/read")
////    public String[]  Read(){
////        FileInputStream fileInputStream=null;
////        Byte[] bytes=new Byte[1024*1024];
////        try{
////            fileInputStream=new FileInputStream(
////
////            )
////            Integer i;
////            while ((i=fileInputStream.read(bytes))!=-1){
////
////            }
////
////
////        }catch (Exception e){
////            e.printStackTrace();
////        }
////        return null;
////    }
//
//    @RequestMapping("/single")
//    public String singleImage(){
//        return "hello wold!";
//    }
//
//
//}
