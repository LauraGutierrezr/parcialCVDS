# PARCIAL CVDS PRIMER CORTE

**👥 Estudiante CVDS:**
- Laura Valentina Gutiérrez Rico

## PROCEDIMIENTO:

**Como primer paso creo un repositorio privado en Git**

![image](https://github.com/user-attachments/assets/f45aa1e6-1b87-411d-a463-1e4f966f0ee5)


**En Sprint Initializr creo un nuevo proyecto llamado parcialtercioCVDS en maven**

![image](https://github.com/user-attachments/assets/80aa0e52-d3d8-40a5-b426-ebb7358da783)

**Realizo un commit con los archivos creados y compilo, para verificar que todo está bien**


**En la especificación del parcial piden dos agentes**

  AGENTE LOG:
    - **`Debe escribir en stdout cada vez que se modifica el stock de un producto`**:
    Implementandolo en la clase .java, quedaría

          ```
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
    
            // Va a restaurar lo que sería el System.out
            System.setOut(System.out);
            //valida que la salida sea la esperada sin conflictos
            String expected = "Producto: Xbox One S -> 10 unidades disponibles\n";
            String actualOutput = outContent.toString();
            assertNotEquals(expected, actualOutput);
        }
    }
          ```
          
AGENTE ADVERTENCIA: 

          ```
          
          ```
