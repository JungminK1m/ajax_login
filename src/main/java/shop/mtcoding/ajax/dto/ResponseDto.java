package shop.mtcoding.ajax.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ResponseDto<T> {
    private int code; // 1 or -1
    private String msg; // 상세사유
    private T data;
}
