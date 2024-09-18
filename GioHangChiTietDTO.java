package com.dunk.web_ban_hang.DTO;

import com.dunk.web_ban_hang.Entity.GioHang;
import com.dunk.web_ban_hang.Entity.SanPhamChiTiet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GioHangChiTietDTO {
    private Long id;
    private Long soLuong;
    private Long thanhTien ;
    private SanPhamChiTietDTO sanPhamChiTiet ;
    private Long gioHangId ;
}
