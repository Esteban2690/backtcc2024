package org.example.helpers.mensajes;

import org.example.helpers.generals.RegexValidators;

public enum MensajesMercancia {
    ID_MERCANCIA_ERRONEO("Revisa, no aceptamos id negativos"),
    VOLUMEN_OCUPADO_ERRONEO("solo positivos y maximo 100"),
    //ID_VEHICULO_NO_EXISTE("Revisa el id no existe"),
    TIPO_MERCANCIA_ERRONEO("SOLO LETRAS Y ESPACIOS"),
    PESO_MERCANCIA_ERRONEO("solo positivos maximo 1000"),
    DESCRIPCION_MERCANCIA_ERRONEA("maximo 100 caracteres"),
    AVALUO_MERCANCIA_ERRONEO("solo positivos"),
    DIRECCION_REMITENTE_ERRONEA("maximo 200"),
    DIRECCION_DESTINATARIO_ERRONEA("maximo 200");

    private String mensajeError;


    MensajesMercancia(String mensajeError) {
        this.mensajeError = mensajeError;
    }


    public String getMensajeError() {
        return mensajeError;
    }
}

