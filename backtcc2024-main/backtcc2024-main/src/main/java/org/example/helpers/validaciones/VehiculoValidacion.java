package org.example.helpers.validaciones;
import org.example.helpers.generals.RegexValidators;
import org.example.helpers.mensajes.MensajesVehiculo;
import org.example.helpers.mensajes.RegexExpresiones;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VehiculoValidacion {
    private RegexValidators regexValidator = new RegexValidators();

    public boolean validarMarca(String marca)throws Exception{
        if(!regexValidator.validarRegex(marca, RegexExpresiones.VALIDAR_SOLO_LETRAS_Y_ESPACIOS.getExpresionRegular())){
           throw new Exception("error en el formato del nombre de la marca");
        }
        if(marca.length()>50){
            throw new Exception("error en el tamaño de caracteres de la marca");
        }
        return true;

    }
    public boolean validarKilometraje(String kilometraje)throws Exception{
        if(!regexValidator.validarRegex(kilometraje, RegexExpresiones.SOLO_POSITIVOS_MAX100.getExpresionRegular())){
            throw new Exception("error en el formato del kilometraje");
        }
        else{
            return true;

        }


    }

    public boolean validarColor(String color)throws Exception{
        if(!regexValidator.validarRegex(color, RegexExpresiones.SOLO_LETRAS_Y_ESPACIOSMAX20.getExpresionRegular())){
            throw new Exception("error en el formato del color");
        }
        else{
            return true;

        }


    }

    public boolean validarDescripcion(String descripcion)throws Exception{
        if(!regexValidator.validarRegex(descripcion, RegexExpresiones.MAX100_CARACTERES.getExpresionRegular())){
            throw new Exception("error en el formato del color");
        }
        else{
            return true;

        }


    }
    public boolean validarTipo(String tipo)throws Exception{
        if(!regexValidator.validarRegex(tipo, RegexExpresiones.SOLO_LETRAS_SIN_ESPACIOS.getExpresionRegular())){
            throw new Exception(MensajesVehiculo.SOLO_LETRAS_Y_ESPACIOS.getMensajeError());
        }
        else{
            return true;

        }


    }
    public boolean validarAutonomia(Integer autonomia)throws Exception{

        if(!regexValidator.validarRegex(String.valueOf(autonomia), RegexExpresiones.NUMEROS_POSITIVOS_MAX_72.getExpresionRegular())){
            throw new Exception("error en el formato del color");
        }
        else{
            return true;

        }


    }
    public boolean validarCapacidadCarga(String capacidadCarga)throws Exception{
        if(!regexValidator.validarRegex(capacidadCarga, RegexExpresiones.NUMEROS_POSITIVOS_MAX_1000.getExpresionRegular())){
            throw new Exception("error en el formato del color");
        }
        else{
            return true;

        }


    }
    public boolean validarAvaluo(String avaluo)throws Exception{
        if(!regexValidator.validarRegex(avaluo, RegexExpresiones.SOLO_POSITIVOS.getExpresionRegular())){
            throw new Exception("error en el formato del color");
        }
        else{
            return true;

        }


    }



    public boolean validarModelo(String fechaModelo)throws Exception {
        if(!regexValidator.validarRegex(fechaModelo,RegexExpresiones.FORMATO_FECHA_MM_YY.getExpresionRegular())){
            throw new Exception("errror en el formato de la fecha");
        }else{
            return true;

        }


    }





}
