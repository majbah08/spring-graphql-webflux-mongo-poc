package com.majbah.springgraphqlwebfluxmongopoc.configs;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories(basePackageClasses = {MongoConfig.class})
public class MongoConfig extends AbstractReactiveMongoConfiguration {

    @Value("${mongo.url}")
    String mongoUrl;

    public MongoClient mongoClient(){
        return MongoClients.create(mongoUrl);
    }
    @Override protected String getDatabaseName() {
        return "blog_db";
    }
}
