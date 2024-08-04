package edu.icet.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {

    private Long id;
    private String username;
    private String email;
    private String role;
    private String password;

}
