package ru.sstu.busline.presentations.views;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Subselect;
import ru.sstu.busline.presentations.models.Path;

import java.awt.*;
import java.sql.Timestamp;

@Table(name = "flights", schema = "public")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Setter
@Subselect("SELECT f.id," +
        "(SELECT id_from_point FROM paths WHERE id = f.id_path) as id_from_point, " +
        "(SELECT id_to_point FROM paths WHERE id = f.id_path) as id_to_point, " +
        "(SELECT price FROM paths WHERE id = f.id_path) as price, " +
        "f.date_out, f.date_in, f.id_bus, f.status FROM flights f")
public  class FlightView {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_from_point;
    private Long id_to_point;
    private Timestamp date_out;
    private Timestamp date_in;
    private Long id_bus;
    private Integer status;
    private Long price;


}
