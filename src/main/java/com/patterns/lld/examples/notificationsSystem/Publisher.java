package com.patterns.lld.examples.notificationsSystem;

import java.util.LinkedList;
import java.util.Queue;

public class Publisher {

        public static Queue<String> smsQueue = new LinkedList<>();
        public static Queue<String> emailQueue = new LinkedList<>();
        public static Queue<String> pushQueue = new LinkedList<>();

}
