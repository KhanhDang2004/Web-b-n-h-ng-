package com.dunk.web_ban_hang.DTO;

import com.dunk.web_ban_hang.Entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaiKhoanDTO {

    private String ma ;
    private String email ;
    private String matKhau ;
    private Role role ;//
    private String hoVaTen ;
    private Long tongHoaDon ;
    private Long tongTien ;
    private Integer hangTaiKhoan ;
    private Integer trangThai ;

}