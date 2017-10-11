package com.test.start;

import com.test.start.mapper.BlogMapper;
import com.test.start.mapper.UserMapper;
import com.test.start.model.Blog;
import com.test.start.model.BlogType;
import com.test.start.model.EnumStatus;
import com.test.start.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisStarter {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        try {
//            UserMapper userMapper = session.getMapper(UserMapper.class);
//            User user = new User();
//            user.setId("1");
//            user.setAccountID("1");
//            user.setUserName("test");
//            EnumStatus status = EnumStatus.CANCEL;
//            user.setStatusDef(status);
//            user.setStatusOrdinal(status);
//            user.setStatusCustom(status);
//            int ret = userMapper.insertUser(user);
//            System.out.println(ret);
//            user = userMapper.selectUser(1);
//            System.out.println(user);
//            session.commit();

            BlogMapper mapper = session.getMapper(BlogMapper.class);
            Blog blog = new Blog();
            blog.setId(1);
            blog.setName("xx");
            blog.setType(BlogType.INVALID);
            int ret = mapper.insertBlog(blog);
            System.out.println(ret);
            blog = mapper.selectBlog(1);
           System.out.println(blog);
        } catch (Exception e) {
            session.rollback();
            System.out.print(e.toString());
        } finally {
            session.close();
        }
    }

    @Test
    public void sqlSessionByJava() {
        //        DataSource dataSource = BlogDataSourceFactory.getBlogDataSource();
        //        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        //        Environment environment = new Environment("development", transactionFactory, dataSource);
        //        Configuration configuration = new Configuration(environment);
        //        configuration.addMapper(BlogMapper.class);
        //        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
    }
}
