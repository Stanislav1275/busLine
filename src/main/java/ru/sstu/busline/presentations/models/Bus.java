package ru.sstu.busline.presentations.models;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "busses", schema = "public")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Setter
public  class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_driver;
    private String model;
    private String number;
    private Integer seats;

}
