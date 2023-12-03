package com.thesun4sky.todoparty.dtotest;

import com.thesun4sky.todoparty.dto.TodoRequestDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TodoRequestDtoTest {
    @DisplayName("할일 카드 생성")
    @Test
    void createTodoRequestDto() {
        // Given
        String title = "과제 하기";
        String content = "심화주차 개인과제";

        // When
        TodoRequestDTO todoRequestDto = TodoRequestDTO.builder()
                .title(title)
                .content(content)
                .build();

        // Then
        assertEquals(title, todoRequestDto.getTitle());
        assertEquals(content, todoRequestDto.getContent());
    }
}
