package com.MyMiniProject.MiniProject.Models.Requests;


import com.MyMiniProject.MiniProject.Entities.Role;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class RegisterRequest {

    private Long id;
    private String username;
    private String password;
    private List<Role> roles;
}
