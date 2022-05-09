package Courier;

import Destination.*;
import Utils.NumberUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckServiceTest {

    @Test
    void deveRetornarValorDaEntregaParaOutroCidadeViaCaminhao() {
        IDestination cidade = new City(0.3f);
        TruckService caminhao = new TruckService(2.5f);
        caminhao.setDestination(cidade);
        assertEquals(8.0f, NumberUtil.getFormattedNumber(caminhao.calcTotalValue()));
    }

    @Test
    void deveRetornarValorDaEntregaParaOutroEstadoViaCaminhao() {
        IDestination estado = new State(0.4f);
        TruckService caminhao = new TruckService(0.3f);
        caminhao.setDestination(estado);
        assertEquals(4.08f, NumberUtil.getFormattedNumber(caminhao.calcTotalValue()));
    }

    @Test
    void deveRetornarValorDaEntregaParaOutroPaisViaCaminhao() {
        IDestination pais = new Country(0.6f);
        TruckService caminhao = new TruckService(2.0f);
        caminhao.setDestination(pais);
        assertEquals(304.0f, NumberUtil.getFormattedNumber(caminhao.calcTotalValue()));
    }
}