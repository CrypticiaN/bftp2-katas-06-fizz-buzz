package fizzbuzz;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzTest {

    // instanciando (creando un objeto que representa el juego)
    JuegoFizzBuzz juego = new JuegoFizzBuzz();

    @Test
    public void laPrimeraRespuestaEs1() {

        String respuesta = juego.responder(1);
        assertThat(respuesta, equalTo("1"));
    }

    @Test
    void laRespuestaA2Es2() {
        String respuesta = juego.responder(2);
        assertThat(respuesta, equalTo("2"));
    }

    @Test
    void laRespuestaA3EsFizz() {
        String respuesta = juego.responder(Fizz);
        assertThat(respuesta, equalTo("Fizz"));
    }

    @Test
    void laRespuestaA5EsBuzz() {
        String respuesta = juego.responder(Buzz);
        assertThat(respuesta, equalTo("Buzz"));
    }

    @Test
    void laRespuestaA15EsFizzBuzz() {
        String respuesta = juego.responder(FizzBuzz);
        assertThat(respuesta, equalTo("FizzBuzz"));
    }
}
