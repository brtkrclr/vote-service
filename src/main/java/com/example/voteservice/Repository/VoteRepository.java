package com.example.voteservice.Repository;

import com.example.voteservice.Model.Vote;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends MongoRepository<Vote,String> {
}
