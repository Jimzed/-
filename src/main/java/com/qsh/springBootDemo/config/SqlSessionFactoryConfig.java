package com.qsh.springBootDemo.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SqlSessionFactoryConfig {

    @Bean
    public DataSource dataSource() throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource(
                "jdbc:mysql://127.0.0.1:3306/job_management?characterEncoding=UTF8", "root", "camishama123");
        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean(@Autowired final DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setTypeAliasesPackage("com.qsh.springBootDemo.mapper.auto");
        return bean.getObject();
    }

}
