import java.util.ArrayList;

public class Trem{

    private int identificadorTrem;
    private ArrayList<Locomotiva> listaLocomotiva = new ArrayList<Locomotiva>();
    private ArrayList<Vagao> listaVagao = new ArrayList<Vagao>();
  
    //Este patio P é o pátio onde esse trem que está sendo criado irá estar
    public Trem(int identificadorTrem, Patio p){
        this.identificadorTrem = identificadorTrem;
        p.getListaDeTrensNoPatio().add(this);
    }
   

    public int getIdentificadorTrem() {
        return identificadorTrem;
    }
    public void imprimeListaDeLocomotivasDoTrem(){
        for(int i = 0; i < listaLocomotiva.size(); i++){
            System.out.print(listaLocomotiva.get(i));
        }
    }
    public ArrayList<Locomotiva> getListaLocomotiva() {
        return listaLocomotiva;
    }
    public ArrayList<Vagao> getListaVagao() {
        return listaVagao;
    }
    @Override
    public String toString() {
        String aux = " ";
        aux += "Trem: " + identificadorTrem + "\n"; 
        return aux;
    }
}