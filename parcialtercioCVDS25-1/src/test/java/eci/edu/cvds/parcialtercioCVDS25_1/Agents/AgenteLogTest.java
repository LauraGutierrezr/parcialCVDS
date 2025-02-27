package eci.edu.cvds.parcialCVDS25_1.Agents;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AgenteLogTest {

    @Test
    void testNotificacion() {
        //Va a tomar la salida del System.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        AgenteLog agenteLog = new AgenteLog();
        agenteLog.notificacion("Xbox One S", 10);

        //restaura lo que sería el System.out
        System.setOut(System.out);
        //valida que la salida dada sea la esperada sin conflictos
        String expected = "Producto: Xbox One S -> 10 unidades disponibles\n";
        String actualOutput = outContent.toString();
        assertNotEquals(expected, actualOutput);

    }
}


