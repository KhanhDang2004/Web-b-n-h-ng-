package com.dunk.web_ban_hang.DTO;

import com.dunk.web_ban_hang.Entity.TaiKhoan;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GioHangDTO {
    private Long id;
    private Long tongSanPham;
    private Long tongSoTien ;
    private TaiKhoanDTO taiKhoan ;
}
