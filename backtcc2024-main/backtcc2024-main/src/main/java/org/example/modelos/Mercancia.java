package org.example.modelos;
import org.example.helpers.mensajes.MensajesMercancia;
import org.example.helpers.mensajes.MensajesVehiculo;
import org.example.helpers.validaciones.MercanciaValidacion;


public class Mercancia {


    MercanciaValidacion mercanciaValidacion = new MercanciaValidacion();

    //id //solo enteros positivos
    //volumenOcupado (double)  //solo positivos y maximo 100
    //tipo (string) //solo letras sin espacios
    //peso (double) //solo positivos maximo 1000
    //descripcion (string) //maximo 100
    //avaluo (int) //solo positivos
    //direccionRemitente (string) //maximo 200
    //direccionDestinatario (string) //maximo 200

        private int id;
        private double volumenOcupado;
        private String tipo;
        private double peso;
        private String descripcion;
        private int avaluo;
        private String direccionRemitente;
        private String direccionDestinatario;


    public Mercancia(int id, double volumenOcupado, String tipo, double peso, String descripcion, int avaluo, String direccionRemitente, String direccionDestinatario) {
        setId(id);
        setVolumenOcupado(volumenOcupado);
        setTipo(tipo);
        setPeso(peso);
        setDescripcion(descripcion);
        setAvaluo(avaluo);
        setDireccionRemitente(direccionRemitente);
    }

    public Mercancia() {
    }

    public void setId(int id) {
        if (id > 0) {
            System.out.println("todo bien papa");
        } else {

            System.out.println(MensajesMercancia.ID_MERCANCIA_ERRONEO.getMensajeError());
        }
    }

        public void setVolumenOcupado(double volumenOcupado)  {

            if (volumenOcupado > 0 && volumenOcupado <= 100) {
                System.out.println("todo bien papa");
            }else{

                System.out.println(MensajesMercancia.VOLUMEN_OCUPADO_ERRONEO.getMensajeError());
            }
        }

        public void setTipo(String tipo){
            try {
                if (mercanciaValidacion.validarTipo(tipo)) {
                    System.out.println("todo bien papa");
                }
            } catch (Exception e) {
                System.out.println(MensajesVehiculo.SOLO_LETRAS_Y_ESPACIOS+e.getMessage());
            }
        }

        public void setPeso(double peso) {
                if (peso > 0 && peso <= 1000) {
                    System.out.println("todo bien papa");

            } else{
                System.out.println(MensajesMercancia.PESO_MERCANCIA_ERRONEO.getMensajeError());
            }
        }

        public void setDescripcion(String descripcion) {



            if (descripcion.length() <= 100) {
                System.out.println("todo bien papa");

        }else{
            System.out.println(MensajesMercancia.DESCRIPCION_MERCANCIA_ERRONEA.getMensajeError());
        }
        }

        public void setAvaluo(int avaluo)  {



                if (avaluo > 0) {
                    System.out.println("todo bien papa");
                }
            else {
                System.out.println(MensajesMercancia.AVALUO_MERCANCIA_ERRONEO.getMensajeError());
            }
        }

        public void setDireccionRemitente(String direccionRemitente) {



                if (direccionRemitente.length() <= 200) {
                    System.out.println("todo bien papa");
                }
            else  {
                System.out.println(MensajesMercancia.DIRECCION_REMITENTE_ERRONEA.getMensajeError());
            }
        }

        public void setDireccionDestinatario(String direccionDestinatario) {


                if (direccionDestinatario.length() <= 200) {
                    System.out.println("todo bien papa");
                }
            else {
                System.out.println(MensajesMercancia.DIRECCION_DESTINATARIO_ERRONEA.getMensajeError());
            }


        }}



