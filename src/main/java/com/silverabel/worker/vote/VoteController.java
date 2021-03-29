package com.silverabel.worker.vote;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class VoteController {

    private final VoteRepository repository;

    public VoteController(VoteRepository repository) {
        this.repository = repository;
    }

    @RabbitListener(queues = "votes")
    public void receive(Integer answer_id) {
        Vote vote = new Vote(answer_id);
        repository.save(vote);
    }
}
