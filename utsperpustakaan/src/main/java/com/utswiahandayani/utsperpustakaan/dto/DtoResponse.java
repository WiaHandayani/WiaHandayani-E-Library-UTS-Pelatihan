package com.utswiahandayani.utsperpustakaan.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoResponse {
    private int status;
    private Object data;
    private String message;


}
