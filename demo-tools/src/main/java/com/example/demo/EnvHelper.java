package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class EnvHelper {

    public static String getIp() {
        String ip;
        try {
             ip= InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        return ip;
    }

    public static String getPort(ConfigurableApplicationContext context) {
        Environment environment = context.getBean(Environment.class);
        String port = environment.getProperty("local.server.port");
        return port;
    }

}
