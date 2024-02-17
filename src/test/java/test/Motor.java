package test;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;
    String[] motoresPermitidos = {"electrico", "gasolina"};

    void cambiarRegistro(int registro){

        this.registro = registro;
    }

    void asignarTipo(String tipo){

        for (String actual : motoresPermitidos){ // recorre la lista comparando si el valor dado es uno permitido

            if (tipo.equals(actual)){

                this.tipo = tipo;
                break;
            }
            
        }
        

    }
    

}
