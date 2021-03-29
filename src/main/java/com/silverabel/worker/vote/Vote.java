package com.silverabel.worker.vote;

import javax.persistence.*;

@Entity
@Table(name = "vote")
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer answer_id;

    public Vote() {}

    public Vote(Integer answer_id) {
        this.answer_id = answer_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(Integer answer_id) {
        this.answer_id = answer_id;
    }

    @Override
    public String toString() {
        return "Vote2{" +
                "id=" + id +
                ", answer_id=" + answer_id +
                '}';
    }
}
