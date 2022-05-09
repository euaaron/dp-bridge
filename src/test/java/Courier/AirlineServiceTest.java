package Courier;

import Destination.Country;
import Destination.IDestination;
import Destination.Overseas;
import Destination.State;
import Utils.NumberUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineServiceTest {

    @Test
    void deveRetornarValorDaEntregaParaOutroEstadoViaAviao() {
        IDestination estado = new State(0.2f);
        AirlineService aviao = new AirlineService(2.0f);
        aviao.setDestination(estado);
        assertEquals(19.76f, NumberUtil.getFormattedNumber(aviao.calcTotalValue()));
    }

    @Test
    void deveRetornarValorDaEntregaParaOutroPaisViaAviao() {
        IDestination pais = new Country(0.3f);
        AirlineService aviao = new AirlineService(2.5f);
        aviao.setDestination(pais);
        assertEquals(267.0f, NumberUtil.getFormattedNumber(aviao.calcTotalValue()));
    }

    @Test
    void deveRetornarValorDaEntregaParaOutroContinenteViaAviao() {
        IDestination continente = new Overseas(0.4f);
        AirlineService aviao = new AirlineService(0.3f);
        aviao.setDestination(continente);
        assertEquals(344.4f, NumberUtil.getFormattedNumber(aviao.calcTotalValue()));
    }
}