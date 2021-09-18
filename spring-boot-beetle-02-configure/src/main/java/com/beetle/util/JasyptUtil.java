package com.beetle.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {
    public static void main(String[] args) {

        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        //加密所需的密钥
        textEncryptor.setPassword("12345!@#");
        //要加密的数据（数据库的用户名或密码）
        String username = textEncryptor.encrypt("root");
        String password = textEncryptor.encrypt("root123");
        System.out.println("username:"+username);
        System.out.println("password:"+password);

//        username:B/Z3V4vIV9oBfKfroNxrig==
//        password:wv01RN435+v3bXT8ivEeFw==

//        username:HXW+nawgxGkVSEXeZNAsMg==
//        password:hVy9p0JBPGYuj+kI87Nbrw==

//        username:fXaDibU43L4r1AdyRp3Ptw==
//        password:3bKeYPObPuiGD+YuR+saoQ==


    }
}
