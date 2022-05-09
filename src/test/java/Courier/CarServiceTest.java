package Courier;

import Destination.*;
import Utils.NumberUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

    @Test
    void deveRetornarValorDaEntregaParaOutroBairroViaCarro() {
        IDestination bairro = new District(0f);
        CarService carro = new CarService(2.0f);
        carro.setDestination(bairro);
        assertEquals(4.6f, NumberUtil.getFormattedNumber(carro.calcTotalValue()));
    }

    @Test
    void deveRetornarValorDaEntregaParaOutroCidadeViaCarro() {
        IDestination cidade = new City(0.3f);
        CarService carro = new CarService(2.5f);
        carro.setDestination(cidade);
        assertEquals(72.5f, NumberUtil.getFormattedNumber(carro.calcTotalValue()));
    }

    @Test
    void deveRetornarValorDaEntregaParaOutroEstadoViaCarro() {
        IDestination estado = new State(0.4f);
        CarService carro = new CarService(0.3f);
        carro.setDestination(estado);
        assertEquals(37.2f, NumberUtil.getFormattedNumber(carro.calcTotalValue()));
    }
}