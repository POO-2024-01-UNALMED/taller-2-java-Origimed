package test;

public class Asiento {
    String color;
    int precio;
    int registro;

    String[] coloresPermitidos = {"rojo", "verde", "amarillo", "negro", "blanco"};


    void cambiarColor(String color){

        for (String actual : coloresPermitidos){

            if (color.equals(actual)){

                this.color = color;
                break;
            }
            
        }
        
    }  
}
