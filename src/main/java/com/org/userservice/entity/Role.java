package com.org.userservice.entity;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "roles")
public class Role {
    @Id
    @Column(name= "id")
    @GeneratedValue
    private String roleId;
    private String name;
    private String description;
    @OneToMany(targetEntity = User.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "ru_fk",referencedColumnName = "id")
    private List<User> user;



}
