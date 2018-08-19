/**
 * *****************************************************
 * Copyright (C) 2018 shekho.com. All Rights Reserved
 * This file is part of shekho project.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 * ****************************************************
 **/
package com.shekho.boot.jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * 客户端测试
 *
 * @author shekho <jisuelang@sina.com>
 * @Date 08/18/2018
 **/
public class ClientTest {

    @Test
    public void TestConnection() {
        //连接本地的Redis服务
        try (Jedis jedis = new Jedis("", 6379)) {
            System.out.println("连接成功！");
            //查看服务是否运行
            System.out.println("服务是否运行：" + jedis.ping());
        } catch (Exception e) {
            System.out.print("连接失败" + e);
        }
    }
}