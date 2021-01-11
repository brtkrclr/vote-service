package com.example.voteservice.Service;

import com.example.voteservice.Model.Vote;

import java.util.List;

public interface VoteService {

    List<Vote> getAll();
    Vote getVoteById(String id);
    Vote save(Vote vote);
    void delete(String id);

}
