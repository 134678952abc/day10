package com.gff.zy2;

import java.text.SimpleDateFormat;
import java.util.Date;

// 使用线程的sleep方法 做一个控制台显示时间 ,  格式是:  2021-07-17 23:45:动态的秒
//	/// 时间是动态的...
public class Test3 {
    public static void main(String[] args) throws InterruptedException {
            int i = 0;
            //设置时间格式
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //循环
            while (true) {
                Date date = new Date();
                System.out.println("time = " + simpleDateFormat.format(date));
                Thread.sleep(1000);
            }

        }
    }


