package org.example;

import java.io.IOException;
import java.net.Socket;
import java.sql.Time;
import java.time.Duration;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.*;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static final String WWW_BAIDU_COM = "www.baidu.com";

    public static void main(String[] args) throws IOException, InterruptedException {
        int a= new Integer(11111);
        int b= new Integer(11111);
        System.out.println(a==b);
        Socket socket = new Socket(WWW_BAIDU_COM,443);
        System.out.println(socket.getInetAddress());
        Scanner scanner = new Scanner(socket.getInputStream());
//        while(scanner.hasNextLine()) {
//            String s = scanner.nextLine();
//            System.out.println(s);
//        }
        Instant now = Instant.now();
        Thread.sleep(1);
        Instant end = Instant.now();
        Date nowDate = Date.from(end);
        //DateTimeFormatter.ISO_DATE.format(nowDate);
        Duration duration = Duration.between(now, end);
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());

        List<Queue<Integer>> list = new ArrayList<>();
        int pos = 0;

    }
}