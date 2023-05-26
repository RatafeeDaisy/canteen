package com.canteen.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @program: vikingclient
 * @Description:
 * @author: Mr.Cheng
 * @Email: ccelephant_518@126.com
 * @date: 2023/3/22 20:09
 */
@Slf4j
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    private static final ThreadLocal<SqlSession> local = new ThreadLocal<SqlSession>();
    //使用mybatis第一步，获取sqlSessionFactory对象
    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            log.error("can not get sqlSessionFactory",e);
        }
    }

    /**
     * 既然有了sqlSessionFactory,顾名思义，我们就可以从中获得sqlSession的实例了
     * sqlSession 完全包含了面向数据库执行SQL命令所需的所有方法
     * 通过SqlSessionFactory调用openSession方法获取SqlSession对象时，可以通过参数设置事务是否自动提交：
     * 如果参数设置为true，表示自定提交事务： factory.openSession(true);
     * 如果参数设置为false，或者不设置参数，表示手动提交.
     */
    public static SqlSession getSqlSession(boolean isAutoCommit){
        SqlSession sqlSession = local.get();
        if(sqlSession == null ){
            sqlSession = sqlSessionFactory.openSession(isAutoCommit);
            local.set(sqlSession);
        }
        return sqlSession;
    }
    /**
    * @Description: 手动事务管理
    * @Param: []
    * @return: org.apache.ibatis.session.SqlSession
    * @Author: Mr.Cheng
    * @Email: ccelephant_518@126.com
    * @Date: 2023/3/31 09:10
    */
    public static SqlSession getSqlSession(){
        return getSqlSession(false);
    }

    /**
    * @Description: 获取SqlSessionFactory
    * @Param: []
    * @return: org.apache.ibatis.session.SqlSessionFactory
    * @Author: Mr.Cheng
    * @Email: ccelephant_518@126.com       
    * @Date: 2023/3/31 09:04
    */ 
    public static SqlSessionFactory getFactory(){
        return sqlSessionFactory;
    }

    /**
    * @Description: 自动事务提交
    * @Param: [c]
    * @return: T
    * @Author: Mr.Cheng
    * @Email: ccelephant_518@126.com
    * @Date: 2023/3/31 09:11
    */
    public static <T extends Object>T getMapper(Class<T> c){
        SqlSession sqlSession = getSqlSession(true);
        return sqlSession.getMapper(c);
    }
}
