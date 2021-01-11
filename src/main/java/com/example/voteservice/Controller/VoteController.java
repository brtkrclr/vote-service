package com.example.voteservice.Controller;


import com.example.voteservice.Model.Vote;
import com.example.voteservice.Repository.VoteRepository;
import com.example.voteservice.Service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class VoteController {

    @Autowired
    private VoteService voteService;

    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }

    @RequestMapping(value="/vote",method = RequestMethod.POST)
    public Vote createVote(@RequestBody Vote vote){
        return voteService.save(vote);
    }

    @RequestMapping(value="/vote",method = RequestMethod.GET)
    public List<Vote> getAllVote(){
        return voteService.getAll();
    }

    @RequestMapping(value = "/vote/{id}",method = RequestMethod.GET)
    public Vote getVoteById(@PathVariable String id){
        return voteService.getVoteById(id);

    }

    @RequestMapping(value ="/vote/{id}",method = RequestMethod.DELETE)
    public String deleteVote(@PathVariable String id){
        voteService.delete(id);
        return id +"is Deleted/n" +voteService.getAll();
    }


}
