package com.gff.zy2;

import java.io.File;

public class Test1 {

    public static void main(String[] args) {
        //设置路径
        File file = new File("D:/idea练习");
        all(file);
    }
    private static void all(File file){
        File[] files = file.listFiles();
        for (File file1 : files){
            if (file1.isDirectory()) {
                all(file1);
            }else if (file1.isFile()) {
                String[] spkit = file1.getName().split("\\.");
                //指定后缀
                boolean aClass = spkit[spkit.length - 1].equals("class");//第一题
                boolean bClass = spkit[spkit.length - 1].equals("java");//第二题
                if (aClass||bClass) {
                    System.out.println("file1 = " + file1.toString());
                }
            }
        }
    }
}

