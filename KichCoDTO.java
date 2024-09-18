package com.dunk.web_ban_hang.DTO;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data // getter , setter
public class KichCoDTO {
    private Long id;
    @Size(min = 3, message = "Ten phai tren 3 ky tu")
    @NotNull
    private String Ten;
}