package Classes;

import Interfaces.IMeioTransporte;

public class Trem implements IMeioTransporte {
    @Override
    public void acelerar(){
        System.out.println("Trem Acelerando");
    }
    @Override
    public void frear(){
        System.out.println("Trem Freando");
    }
}
