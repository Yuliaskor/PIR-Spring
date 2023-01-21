package com.example.PiRSpring.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "card")
@Getter
@Setter
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "RFID_tag")
    private Integer RFIDTag;

    @ManyToOne(optional = false)
    @JoinColumn(name = "employeeid", nullable = false)
    private Employee employee;

    @ManyToOne(optional = false)
    @JoinColumn(name = "card_statusid", nullable = false)
    private CardStatus card_status;

}
