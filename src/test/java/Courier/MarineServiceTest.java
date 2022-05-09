package Courier;

import Destination.Country;
import Destination.IDestination;
import Destination.Overseas;
import Destination.State;
import Utils.NumberUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarineServiceTest {

    @Test
    void deveRetornarValorDaEntregaParaOutroEstadoViaAviao() {
        IDestination estado = new State(0.2f);
        MarineService navio = new MarineService(2.0f);
        navio.setDestination(estado);
        assertEquals(19.95f, NumberUtil.getFormattedNumber(navio.calcTotalValue()));
    }

    @Test
    void deveRetornarValorDaEntregaParaOutroPaisViaAviao() {
        IDestination pais = new Country(0.3f);
        MarineService navio = new MarineService(2.5f);
        navio.setDestination(pais);
        assertEquals(269.4f, NumberUtil.getFormattedNumber(navio.calcTotalValue()));
    }

    @Test
    void deveRetornarValorDaEntregaParaOutroContinenteViaAviao() {
        IDestination continente = new Overseas(0.4f);
        MarineService navio = new MarineService(0.3f);
        navio.setDestination(continente);
        assertEquals(347.28f, NumberUtil.getFormattedNumber(navio.calcTotalValue()));
    }
}