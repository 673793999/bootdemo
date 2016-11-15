package com.jtl.common.db;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2016/10/31 0031.
 */
@Configuration
@EnableTransactionManagement
public class DataBaseConfig {
    @Autowired
    private DBSettings dbSettings;

    @Bean(name="dataSource", destroyMethod = "close", initMethod="init")
    @Primary
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(dbSettings.getUrl());
        dataSource.setDriverClassName(dbSettings.getDriverClassName());
        dataSource.setUsername(dbSettings.getUsername());
        dataSource.setPassword(dbSettings.getPassword());
        dataSource.setMaxActive(dbSettings.getMaxActive());
        dataSource.setInitialSize(dbSettings.getInitialSize());
        dataSource.setMaxWait(dbSettings.getMaxWait());
        dataSource.setMinIdle(dbSettings.getMinIdle());
        dataSource.setRemoveAbandoned(dbSettings.isRemoveAbandoned());
        dataSource.setRemoveAbandonedTimeout(dbSettings.getRemoveAbandonedTimeout());
        dataSource.setConnectionProperties(dbSettings.getConnectionProperties());

        return dataSource;
    }
}
