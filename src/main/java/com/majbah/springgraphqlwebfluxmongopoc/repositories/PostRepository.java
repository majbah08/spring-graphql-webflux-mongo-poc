package com.majbah.springgraphqlwebfluxmongopoc.repositories;

import com.majbah.springgraphqlwebfluxmongopoc.documents.Post;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends ReactiveMongoRepository <Post,String> {

}
