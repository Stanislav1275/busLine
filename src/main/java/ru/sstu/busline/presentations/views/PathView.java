package ru.sstu.busline.presentations.views;

import jakarta.persistence.*;
import lombok.*;
import ru.sstu.busline.presentations.models.Point;

@Table(name = "paths", schema = "public")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Setter
public class PathView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_from_point", referencedColumnName = "id",nullable=false)
    private Point pointA;

    @ManyToOne
    @JoinColumn(name = "id_to_point", referencedColumnName = "id", nullable=false)
    private Point pointB;
    private Long distance;
    private String duration;
    private Integer status;


}
