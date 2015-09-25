package com.hzsckj.soams.service;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by 龙 on 2015/9/24.
 */
@RunWith(SpringJUnit4ClassRunner.class) // 整合
@ContextConfiguration(locations="classpath:mybatis/spring-mybatis.xml") // 加载配置
public class UserServiceTest extends AbstractTransactionalJUnit4SpringContextTests {
    @Test
    public void testFindUserByLoginName() throws Exception {

    }
}