package Classes;

import Interfaces.IMeioTransporte;

public class Bicicleta implements IMeioTransporte {
    @Override
    public void acelerar(){
        System.out.println("Bicicleta Acelerando");
    }
    @Override
    public void frear(){
        System.out.println("Bicicleta Freando");
    }
}
