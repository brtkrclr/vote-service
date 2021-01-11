package com.example.voteservice.Service;

import com.example.voteservice.Model.Vote;
import com.example.voteservice.Repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VoteServiceImplementation  implements VoteService{

    private VoteRepository voteRepository;

    @Autowired
    public VoteServiceImplementation(VoteRepository voteRepository){
        this.voteRepository=voteRepository;
    }

    @Override
    public Vote save(Vote vote) {
        voteRepository.save(vote);
        return vote;
    }

    @Override
    public List<Vote> getAll() {
        List<Vote> votes=new ArrayList<>();
        voteRepository.findAll().forEach(votes::add);
        return votes;
    }

    @Override
    public Vote getVoteById(String id) {

        return voteRepository.findById( id).orElse(null);
    }

    @Override
    public void delete(String id) {
    voteRepository.deleteById(id);
    }
}
