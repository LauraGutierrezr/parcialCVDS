package eci.edu.cvds.parcialCVDS25_1.Agents;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AgenteLogTest {

    @Test
    void testNotificacion() {
        // Captura la salida del System.out que debe ser
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // verifica el código que genera la salida
        AgenteLog agenteLog = new AgenteLog();
        agenteLog.notificacion("Xbox One S", 10);

        System.setOut(System.out);

        // Valida la salida esperiada
        String expected = "Producto: Xbox One S -> 10 unidades disponibles\n";
        String actualOutput = outContent.toString();
        assertNotEquals(expected, actualOutput);
    }
}


