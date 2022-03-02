import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrivialTests {
    @Test
    public void true_is_true(){
        Assertions.assertTrue(true);
    }

    @Test
    public void crear_Game(){
        Game trivial = new Game();
    }

    @Test
    public void si_al_principio_saco_un_1_voy_a_casilla_1(){
        //Arrage
        Game sut = new Game();
        sut.agregar("Maria");
        sut.agregar("Juan");

        sut.tirarDado(1);

        String expected = "La nueva posición de Maria es 1";

        //Act
        String actual = sut.nuevaPosicionJugador();

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void fue_Respuesta_Correcta(){
        jugadorActual == jugadores.size();
    }
    @Test
    public void siguienteJugador(){
        posiciones[jugadorActual] > 11;
    }
    @Test
    public void saleCarcel(){

    }
}
