package ru.moscow.bank;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories
public class DataSourceConfig {

    @Value("${spring.datasource.url:#{null}}")
    private String url;

    @Value("${spring.datasource.username:#{null}}")
    private String username;


    @Value("${spring.datasource.password:#{null}}")
    private String password;


    @Primary
    @Bean("h2DataSource")
    public DataSource h2DataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(org.h2.Driver.class.getName());
        dataSource.setUrl(url + ";DATABASE_TO_UPPER=false");
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }


}
