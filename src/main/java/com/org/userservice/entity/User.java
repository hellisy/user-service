package com.org.userservice.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="user")
public class User {

    @Id
    @Column(columnDefinition = "BINARY(32)")
    private String userId;
    private String name;
    private String email;
    private String password;
    private String created;
    @Column(columnDefinition = "BINARY(32)")
    private String last_visit_id;

}
