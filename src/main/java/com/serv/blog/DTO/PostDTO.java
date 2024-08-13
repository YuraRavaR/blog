package com.serv.blog.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PostDTO {

    @NotBlank
    String title;
    @NotBlank
    String anons;

    String full_text;

}
