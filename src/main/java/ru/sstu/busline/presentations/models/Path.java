package ru.sstu.busline.presentations.models;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.time.Duration;
import java.time.LocalDateTime;

@Table(name = "paths", schema = "public")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Setter
public  class Path {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_from_point;
    private Long id_to_point;
    private Integer distance;
    private String duration;
    private Integer status;

}
