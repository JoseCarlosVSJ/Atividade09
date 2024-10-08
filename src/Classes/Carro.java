package Classes;

import Interfaces.IMeioTransporte;

public class Carro implements IMeioTransporte {
    @Override
    public void acelerar(){
        System.out.println("Carro Acelerando");
    }
    @Override
    public void frear(){
        System.out.println("Carro Freando");
    }
}
