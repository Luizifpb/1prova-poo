package br.edu.ifpb.poo;
import java.util.ArrayList;

public class RepoDVD {
    private ArrayList<DVD> lista_dvds= new ArrayList<>();
    private static int quant_dvd=0;

    public boolean cadastrarDVD(int id, String nome){
        for(DVD i:lista_dvds){
            if (i.getId()==id) return false;
        }
        DVD dvd = new DVD();
        dvd.setId(id);
        dvd.setNome(nome);
        lista_dvds.add(dvd);
        quant_dvd++;
        return true;
    }

    public boolean buscarDVD(int id){
        for(DVD i:lista_dvds){
            if (i.getId()==id) return true;
        }
        return false;
    }

    public boolean removerDVD(int id){
        for(DVD i:lista_dvds){
            if (i.getId()==id) {
                lista_dvds.remove(i);
                quant_dvd--;
                return true;
            }
        }
        return false;
    }

    public int contarDVDs(){
        return quant_dvd;
    }
}
