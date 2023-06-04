package ru.sstu.busline.presentations.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Subselect;

import java.time.LocalDateTime;

@Table(name = "flights", schema = "public")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@NamedQuery(name = "Flight.findByPathId", query = "SELECT f FROM Flight f WHERE f.id_path = :pathId")
@Subselect("SELECT f.id, f.price f.id_path, s.des as status_des,  f.date_out,f.date_in, f.id_bus, s.des AS status " +
        "FROM flights f " +
        "JOIN statuses s ON f.status = s.id")
@Setter
public  class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_path;
    private LocalDateTime date_out;
    private LocalDateTime date_in;
    @ManyToOne
    @JoinColumn(name = "id_bus", referencedColumnName = "id", nullable=false)
    private Bus bus;
    private String status;

    private Long price;


}
