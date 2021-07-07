package com.bjpowernode;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        Jedis jedis = new Jedis("192.168.130.131",6379);
        jedis.set("Jedis1","aaaaa");
    }
}
