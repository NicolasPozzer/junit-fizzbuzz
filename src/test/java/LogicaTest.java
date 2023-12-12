import org.apache.juli.logging.Log;
import org.example.Logica;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LogicaTest {

    @Test
    public void testeandoLista(){
        List<String> lista = Logica.getLista();
        Assert.assertEquals("1",lista.get(0)); //Si recibe 1 en el indice 0 esta Perfecto!
        Assert.assertEquals("2",lista.get(1));
        Assert.assertEquals("3",lista.get(2));
    }

    @Test
    public void cuando_es_multiplode_3_devuelve_fizz(){

        Logica logic = new Logica();

        List<String> lista = logic.fizzBuzz();

        Assert.assertEquals("Fizz", lista.get(2));
        Assert.assertEquals("Fizz", lista.get(5));
    }

}
