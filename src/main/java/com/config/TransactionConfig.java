//package com.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.transaction.annotation.TransactionManagementConfigurer;
//
///**
// * Created by huyoucheng on 2018/10/20.
// */
//@Configuration
//@EnableTransactionManagement
//@AutoConfigureAfter({DruidConfig.class})
//@MapperScan(basePackages = {"com.dao"})
//public class TransactionConfig implements TransactionManagementConfigurer {
//    @Autowired
//    private DruidDataSource mDataSource;
//
//    @Override
//    public PlatformTransactionManager annotationDrivenTransactionManager() {
//        return new DataSourceTransactionManager(mDataSource);
//    }
//}
