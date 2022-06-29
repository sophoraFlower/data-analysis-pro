package com.houle.timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class TimerTest {
    public static void main(String[] args) {
        // 构造定时器类对象，并传递给Timer构造器
        var listener = new TimePrinter();
        // 第一个参数是一个时间间隔，即经过多长时间通知一次
        // 第二个参数是监听器对象
        var timer = new Timer(1000, listener);
        // 启动定时器
        timer.start();
        // 终止程序
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

/**
 * 定时器类，需要实现java.awt.event包的ActionListener接口
 */
class TimePrinter implements ActionListener {

    // 定时器调用的方法，即执行语句
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At this tone, this time is " + Instant.ofEpochMilli(e.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
