package com.blue.example;

import java.io.File;

/**
 * @author shenjie
 * @version v1.0
 * @Description
 * @Date: Create in 10:25 2018/6/21
 * @Modifide By:
 **/

//      ┏┛ ┻━━━━━┛ ┻┓
//      ┃　　　　　　 ┃
//      ┃　　　━　　　┃
//      ┃　┳┛　  ┗┳　┃
//      ┃　　　　　　 ┃
//      ┃　　　┻　　　┃
//      ┃　　　　　　 ┃
//      ┗━┓　　　┏━━━┛
//        ┃　　　┃   神兽保佑
//        ┃　　　┃   代码无BUG！
//        ┃　　　┗━━━━━━━━━┓
//        ┃　　　　　　　    ┣┓
//        ┃　　　　         ┏┛
//        ┗━┓ ┓ ┏━━━┳ ┓ ┏━┛
//          ┃ ┫ ┫   ┃ ┫ ┫
//          ┗━┻━┛   ┗━┻━┛

public class QRCodeApp {

    public static void main(String[] args) throws Exception {

        //生成带logo 的二维码
        String text = "https://www.cnblogs.com/shenjie2017";
        String fileName = null;
        fileName= QRCodeUtil.encode(text, "d:/tmp/qrcode/logo/chunchun.jpg", "d:/tmp/qrcode/img", true);

        //生成不带logo 的二维码
        String textt = "http://www.baidu.com";
        fileName = QRCodeUtil.encode(text,"","d:/tmp/qrcode/img",true);

        //指定二维码图片，解析返回数据
        System.out.println(QRCodeUtil.decode("d:/tmp/qrcode/img"+ File.separator+fileName));

    }
}