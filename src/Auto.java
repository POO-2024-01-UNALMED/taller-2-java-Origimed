package test;

public class Auto {
    
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;




    int cantidadAsientos(){
        return asientos.length;

    }
    
    String verificarIntegridad(){

        if (registro == motor.registro){ //revision del registro del motor

            for (Asiento asientoActual: asientos){ //revision del registro de cada elemento de asientos

                if (asientoActual.registro != registro){

                    return "Las piezas no son originales";
                    
                }
                
            }
            return "Auto original"; // si se confirma que no hay ningun registro de asiento diferente
                                    // retorna que el auto es original
                                             
        }
        else{
            return"Las piezas no son originales";
        }


    }
}
