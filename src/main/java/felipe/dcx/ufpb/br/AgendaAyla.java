package felipe.dcx.ufpb.br;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class AgendaAyla {

    private Map<String,Contato> contatosMap;
    private GravadorDeDados gravadorDeDados;

    public AgendaAyla(){
        gravadorDeDados = new GravadorDeDados();
    }

    public void salvarDados() throws IOException {
        gravadorDeDados.salvarContatos(contatosMap);
    }

    public void recuperaDados() throws IOException, ClassNotFoundException {
        gravadorDeDados.recuperarContatos();
    }

    public boolean CadastrarContato(String nome, int diaAniversario, int mesAniversario){
        if(!contatosMap.containsKey(nome)){
            Contato n = new Contato(nome,diaAniversario,mesAniversario);
            contatosMap.put(nome,n);
            return true;
        } return false;
    }

    public Collection<Contato> pesquisaAniversariantes(int dia, int mes) throws ContatoInexistenteException{
        Collection<Contato> n = new ArrayList<>();
        if (!contatosMap.containsKey(dia)){
            throw new ContatoInexistenteException("conatato inexistente");
        }
        for (Contato c: contatosMap.values()){
            if(c.getDiaAniversario()==dia&&c.getMesAniversario()==mes){
                n.add(c);
            }
        }
        return n;
    }

    public boolean removerContato(String nome){
        for (Contato c: contatosMap.values()){
            if(c.getNome().equalsIgnoreCase(nome)){
                contatosMap.remove(nome);
                return true;
            }
        }return false;
    }
}
