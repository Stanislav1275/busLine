package ru.sstu.busline.presentations.models;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "points", schema = "public")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Setter
public  class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private Integer out_timezone;
}
