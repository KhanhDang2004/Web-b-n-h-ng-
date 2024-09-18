package com.dunk.web_ban_hang.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HoaDonChiTietDTO {
    private Long id ;
    private Long donGia ;
    private Long soLuong;
    private Long thanhTien ;
    private SanPhamChiTietDTO sanPhamChiTiet ;
    private HoaDonDTO hoaDon ;

}
