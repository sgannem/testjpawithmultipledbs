package com.example.configuration;

import org.springframework.core.env.Environment;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import java.util.HashMap;

public class DBConfigrationBase {

    public LocalContainerEntityManagerFactoryBean getLocalContainerEntityManagerFactoryBean(LocalContainerEntityManagerFactoryBean entityManagerFactoryBean, Environment env) {
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        entityManagerFactoryBean.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.show_sql",  env.getProperty("hibernate.show_sql"));
        properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
        properties.put("hibernate.cache.region.factory_class", env.getProperty("spring.jpa.properties.hibernate.cache.region.factory_class"));
        properties.put("javax.persistence.sharedCache.mode", env.getProperty("spring.jpa.properties.javax.persistence.sharedCache.mode"));
        properties.put("hibernate.cache.use_second_level_cache", env.getProperty("spring.jpa.properties.hibernate.cache.use_second_level_cache"));
        properties.put("hibernate.cache.use_query_cache", env.getProperty("spring.jpa.properties.hibernate.cache.use_query_cache"));
        properties.put("hibernate.cache.ehcache.missing_cache_strategy", env.getProperty("spring.jpa.properties.hibernate.cache.ehcache.missing_cache_strategy"));
        entityManagerFactoryBean.setJpaPropertyMap(properties);
        return entityManagerFactoryBean;
    }

}
