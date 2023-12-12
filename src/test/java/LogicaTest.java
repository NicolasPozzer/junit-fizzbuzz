import org.apache.juli.logging.Log;
import org.example.Logica;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LogicaTest {

    @Test
    public void cuando_es_multiplode_3o5_devuelve_string(){
        List<String> lista = Logica.getLista();
        Assert.assertEquals("1",lista.get(0)); //Si recibe 1 en el indice 0 esta Perfecto!
        Assert.assertEquals("2",lista.get(1));
        Assert.assertEquals("3",lista.get(2));
    }   

}
