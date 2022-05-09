package Courier;

import Destination.City;
import Destination.District;
import Destination.IDestination;
import Destination.State;
import Utils.NumberUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleServiceTest {

    @Test
    void deveRetornarValorDaEntregaParaOutroBairroViaMoto() {
        IDestination bairro = new District(0.3f);
        MotorcycleService carro = new MotorcycleService(2.0f);
        carro.setDestination(bairro);
        assertEquals(5.6f, NumberUtil.getFormattedNumber(carro.calcTotalValue()));
    }

    @Test
    void deveRetornarValorDaEntregaParaOutroCidadeViaMoto() {
        IDestination cidade = new City(0.3f);
        MotorcycleService carro = new MotorcycleService(0.5f);
        carro.setDestination(cidade);
        assertEquals(14.0, NumberUtil.getFormattedNumber(carro.calcTotalValue()));
    }

    @Test
    void deveRetornarValorDaEntregaParaOutroEstadoViaMoto() {
        IDestination estado = new State(0.2f);
        MotorcycleService carro = new MotorcycleService(0.7f);
        carro.setDestination(estado);
        assertEquals(72.8f, NumberUtil.getFormattedNumber(carro.calcTotalValue()));
    }
}