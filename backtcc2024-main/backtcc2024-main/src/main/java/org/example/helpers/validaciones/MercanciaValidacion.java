package org.example.helpers.validaciones;

import org.example.helpers.generals.RegexValidators;
import org.example.helpers.mensajes.MensajesVehiculo;
import org.example.helpers.mensajes.RegexExpresiones;

public class MercanciaValidacion {

    RegexValidators regexValidators = new RegexValidators();

    public boolean validarTipo(String tipo)throws Exception{
        if(!regexValidators.validarRegex(tipo, RegexExpresiones.SOLO_LETRAS_SIN_ESPACIOS.getExpresionRegular())){
            throw new Exception(MensajesVehiculo.SOLO_LETRAS_Y_ESPACIOS.getMensajeError());
        }
        else{
            return true;

        }


    }


}
