package felipe.dcx.ufpb.br;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GravadorDeDados {
    public static final String Arquivos_contatos = "contatos.dat";

    public void salvarContatos(Map<String,Contato> contatos)throws IOException {
        FileOutputStream n = new FileOutputStream(Arquivos_contatos);
        ObjectOutputStream c = new ObjectOutputStream(n);
        c.writeObject(contatos);
        c.close();
    }

    public Map<String, Contato> recuperarContatos()
            throws IOException, ClassNotFoundException {

        File arquivo = new File(Arquivos_contatos);


        if (!arquivo.exists()) {
            return new HashMap<>();
        }

        ObjectInputStream o =
                new ObjectInputStream(new FileInputStream(arquivo));

        Map<String, Contato> contatos =
                (Map<String, Contato>) o.readObject();

        o.close();
        return contatos;
    }


}
