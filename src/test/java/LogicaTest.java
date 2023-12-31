import org.apache.juli.logging.Log;
import org.example.Logica;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class LogicaTest {

    @Autowired
    private Logica logic;
    @Before //Con esta anotacion ejecutamos primero que todo!
    public void before(){
        logic = new Logica();
    }

    @Test
    public void testeandoLista(){
        List<String> lista = Logica.getLista();
        Assert.assertEquals("1",lista.get(0)); //Si recibe 1 en el indice 0 esta Perfecto!
        Assert.assertEquals("2",lista.get(1));
        Assert.assertEquals("3",lista.get(2));
    }

    @Test
    public void cuando_es_multiplode_3_devuelve_fizz(){

        List<String> lista = logic.fizzBuzz();

        Assert.assertEquals("Fizz", lista.get(3));
        Assert.assertEquals("Fizz", lista.get(6));
        Assert.assertEquals("Buzz",lista.get(5));
        Assert.assertEquals("FizzBuzz", lista.get(15));

    }

}
