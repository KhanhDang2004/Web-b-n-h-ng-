package com.dunk.web_ban_hang.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HoaDonDTO {
    private Long id ;
    private String maHoaDon ;
    private Long tongSanPham ;
    private String soDienThoai ;
    private String diaChi ;
    private String hoVaTen ;
    private String maNhanVien ;
    private LocalDate ngayTao ;
    private LocalDate ngayHoanThanh;
    private String lyDoHuy ;
    private Integer trangThai ;
    private Integer loaiHoaDon ;
    private TaiKhoanDTO taiKhoan ;
}
