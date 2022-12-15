package br.edu.unisep.barbershop.domain.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CreateAppointmentDto {

    private Integer barberId;
    private Integer customerId;
    private LocalDateTime date;

}
