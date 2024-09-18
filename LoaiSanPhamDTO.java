package com.dunk.web_ban_hang.DTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoaiSanPhamDTO {
    private Long id ;
    @Size(min=3,message="Ten phai tren 3 ky tu")
    @NotNull
    private String Ten ;
    }