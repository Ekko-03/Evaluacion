package com.envios_ya.cl.enviosya.dto;

import jakarta.validation.constraints.*;
import lombok.Data;
import java.util.Date;

@Data
public class UsuarioDTO {

    @NotBlank(message = "El RUN no puede estar vacío")
    @Size(max = 13, message = "El RUN no debe exceder los 13 caracteres")
    private String run;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "El apellido es obligatorio")
    private String apellido;

    @NotNull(message = "El código postal es obligatorio")
    private Integer codigoPostal;

    @NotBlank(message = "La dirección es obligatoria")
    private String direccion;

    @NotBlank(message = "El correo es obligatorio")
    @Email(message = "Debe tener un formato de correo válido")
    private String correo;

    @NotNull(message = "El número de teléfono es obligatorio")
    private Integer numeroTelefono;

    private Date fechaNacimiento;
}
