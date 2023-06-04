package ru.sstu.busline.presentations.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@Table(name = "rangs")
@Setter
@Data
@Getter
public class Rang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERang name;



    public Rang(ERang name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ERang getName() {
        return name;
    }

    public void setName(ERang name) {
        this.name = name;
    }

}
