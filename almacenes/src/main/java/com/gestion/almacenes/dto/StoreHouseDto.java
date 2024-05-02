
package com.gestion.almacenes.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StoreHouseDto {

    @NotNull( message = "El campo Código es obligatorio" )
    @NotBlank( message = "El campo Código es obligatorio" )
    @Size(max = 30, message = "{field} Código {cannot.have.more.than} 30 {characters}")
    private String code;

    @NotNull( message = "El campo Nombre {is.required}" )
    @NotBlank( message = "El campo Nombre {cant.be.empty}" )
    @Size(max = 100, message = "El campo Nombre {cannot.have.more.than} 100 {characters}")
    private String name;

    @NotNull( message = "El campo Descripción {is.required}" )
    @NotBlank( message = "El campo Descripción {cant.be.empty}" )
    @Size(max = 500, message = "El campo Descripción {cannot.have.more.than} 500 {characters}")
    private String description;

}
