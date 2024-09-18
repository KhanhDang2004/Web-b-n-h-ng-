package com.dunk.web_ban_hang.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SanPhamDTO {
    private Long id;
    private String ma;
    private Long gia;
    private String ten ;
    private Long soLuongTonKho;
    private Long soLuongDaBan;
    private String moTa;
    private Integer trangThai;

    private LoaiSanPhamDTO loaiSanPham ;
    private List<String> images;

    //User  -> Upload file ảnh lên -> Lưu file vào sever -> Lưu đường dẫn vào db
    @JsonIgnore
    //Không hiển thị
    private List<MultipartFile> files;
    //MultipartFile xử lý các file được tải lên từ form HTML
}