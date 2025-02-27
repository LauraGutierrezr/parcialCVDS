# PARCIAL CVDS PRIMER CORTE

**👥 Estudiante CVDS:**
- Laura Valentina Gutiérrez Rico


--Para hacer el primer commit tuve prblemas por el log de usuarios desde local, pero luego lo resolví, por eso no se ve reflejado el commit cuando creé las carpetasen spring


## PROCEDIMIENTO:

**Como primer paso creo un repositorio privado en Git**

![image](https://github.com/user-attachments/assets/f45aa1e6-1b87-411d-a463-1e4f966f0ee5)


**En Sprint Initializr creo un nuevo proyecto llamado parcialtercioCVDS en maven**

![image](https://github.com/user-attachments/assets/80aa0e52-d3d8-40a5-b426-ebb7358da783)

**Realizo un commit con los archivos creados y compilo, para verificar que todo está bien**




**En la especificación del parcial piden dos agentes**

  AGENTE LOG:
  
    - **Debe escribir en stdout cada vez que se modifica el stock de un producto`**:
    Implementandolo en la clase .java, quedaría**

      ```
    package eci.edu.cvds.parcialtercioCVDS25_1.Agents;
    
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

    - **Este agente debe escribir en stdout cada vez que el stock de un producto es menor a 5**

    ```
      /**
     * Esta clase es la encargada de generar las advertencias cuando el stock
     * de un producto se agota <5
    
     */
    public class AgenteAdvertenciaTest {
        
    }
    
    ```
**En la clase productoTest**

 - **`Es la encargada de realizar las pruebas para diversos casos posibles, como su creación y gestión de lo que se tiene en el stock`**

   realice varios tipos de Test

     ![image](https://github.com/user-attachments/assets/6335e421-2667-4dd5-bec2-749050a8149b)


**Una vez creados los Test tengo que modificar el archivo pom**
Ya que se tiene que verificar la versión, que Jacoco esté, en este caso, la agregué en plugin con su porcentaje minimo de cubrimiento de 80% y no refleja ningun error en la prueba

  ![image](https://github.com/user-attachments/assets/9bde99b3-3f75-4d0c-83d4-a3be137aebec)


**Pruebas compilacion proyecto**
![image](https://github.com/user-attachments/assets/fe92c94a-c58b-44bb-b4be-7893fa50a459)


MVN COMPLILE

![image](https://github.com/user-attachments/assets/d8b2bae7-69ce-4ea3-8f20-cee8e0377b12)

MVN TEST

![image](https://github.com/user-attachments/assets/2b44908e-4906-4382-bd81-1fbc848fd268)


**Pruebas de Jacoco**
con el comando mvn clean test


![image](https://github.com/user-attachments/assets/f0701e63-7366-498b-917e-2f9fbbf016bc)



