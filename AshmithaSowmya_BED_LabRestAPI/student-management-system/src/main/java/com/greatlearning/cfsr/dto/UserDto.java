package com.greatlearning.cfsr.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto
{
    private Long id;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @NotEmpty(message = "This field cann't be empty, Must have '@'")
    @Email
    private String email;
    @NotEmpty(message = "This field cann't be empty, should have a upper case, lower case, numbers and a special character.")
    private String password;
}
