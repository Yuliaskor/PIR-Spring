package com.example.PiRSpring.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "door")
@Getter
@Setter
public class Door {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    private String description;

    @ManyToOne(optional = false)
    @JoinColumn(name = "deviceId", nullable = false)
    private Device device;

    @ManyToOne(optional = false)
    @JoinColumn(name = "access_level_id", nullable = false)
    private com.example.PiRSpring.model.AccessLevel accessLevel;
}
