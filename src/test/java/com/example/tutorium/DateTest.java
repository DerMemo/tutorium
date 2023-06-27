package com.example.tutorium;

import com.example.tutorium.controller.DateController;
import com.example.tutorium.service.DateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class DateTest {
    @Autowired
    private DateService dateService;
    private DateController dateController;

    @Test
    public void testgetTime() {
        assertThat(dateService.getTime()).isBeforeOrEqualTo(LocalTime.now());
    }

    @Test
    public void testgetDateFormatNull() {
        assertThat(dateController.getDate(null)).isEqualTo("2023-06-28");
    }
}
