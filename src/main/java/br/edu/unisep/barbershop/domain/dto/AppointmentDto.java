package br.edu.unisep.barbershop.domain.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AppointmentDto {

    private Integer id;
    private String customer;
    private String barber;
    private LocalDateTime date;

}
