package ru.sstu.busline.presentations.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Table(name = "users",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "login"),
        })
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Getter
@Setter
public class User {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "usersrangs",
            joinColumns = @JoinColumn(name = "userid"),//тот параметр задает
            inverseJoinColumns = @JoinColumn(name = "rangid"))//inverse - то, по какому пармметры мы ищем,
    private Set<Rang> roles = new HashSet<>();
    public Long getId() {
        return id;
    }
    public String login;
    public String password;
    public String status;
}
