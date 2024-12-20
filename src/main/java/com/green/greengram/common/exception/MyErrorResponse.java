package com.green.greengram.common.exception;

import com.green.greengram.common.model.ResultResponse;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.validation.FieldError;

import java.util.List;

@Getter
@SuperBuilder
public class MyErrorResponse extends ResultResponse<String> {
    //Validation 에러메세지 전달
    private final List<ValidationError> valids;

    //Validation 에러가 발생 시, 해당 에러의 메세지
    //어떤 필드였고, 에러 메세지를 묶음으로 담을 객체를 만들 때 사용
    @Getter
    @Builder
    public static class ValidationError{
        private final String field;
        private final String message;

        public static ValidationError of(final FieldError fieldError) { //of라는 static 메서드
            return ValidationError.builder()
                    .field(fieldError.getField())
                    .message(fieldError.getDefaultMessage())
                    .build();
        }
    }
}