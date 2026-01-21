package felipe.dcx.ufpb.br;

import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestaAgenda {

    @Test
    public void  TestaAgenda(){
        AgendaAyla sitema = new AgendaAyla();
        boolean test = sitema.CadastrarContato("naclaudia",25,4);
        assertTrue(test);
        Collection<Contato> n = sitema.pesquisaAniversariantes(25,4);
        assertEquals(1,n.size());
        boolean test2 = sitema.removerContato("naclaudia");
        assertTrue(test2);


    }
}
