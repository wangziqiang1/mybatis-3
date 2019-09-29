package org.apache.ibatis.personalTest;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {

    //使用SqlSession.getMapper(XXXMapper.class)的方式来操作
    @Test
    public void testSelect() throws IOException {
        String resource = "org/apache/ibatis/personalTest/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        try {
            TstatMapper mapper = session.getMapper(TstatMapper.class);
            Tstat tstat = mapper.selectTstatById(1);
            System.out.println(tstat);
        } finally {
            session.close();
        }
    }


    /*@Test
    public void testInsert() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        try {
            BlogMapper mapper = session.getMapper(BlogMapper.class);
            Blog blog = new Blog();
            blog.setBid(1688);
            blog.setName("测试插入");
            blog.setAuthorId(1111);
            System.out.println(mapper.insertBlog(blog));
            session.commit();
        } finally {
            session.close();
        }
    }*/

    /**
     * # 和 $ 的区别
     * @throws IOException
     */
    /*@Test
    public void testSelectByBean() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        try {
            BlogMapper mapper = session.getMapper(BlogMapper.class);
            Blog queryBean = new Blog();
            queryBean.setName("咕泡学院");
            List<Blog> blog = mapper.selectBlogByBean(queryBean);
            System.out.println("查询结果："+blog);
        } finally {
            session.close();
        }
    }*/

}
