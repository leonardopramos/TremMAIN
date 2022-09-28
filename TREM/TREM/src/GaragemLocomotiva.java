import java.util.ArrayList;

public class GaragemLocomotiva {
    
    private ArrayList<Locomotiva> listaGarageLocomotivas = new ArrayList<Locomotiva>();

    public ArrayList<Locomotiva> getListaGarageLocomotivas() {
        return listaGarageLocomotivas;
    }
    public void imprimeListaDeLocomotivasDoTrem(){
        for(int i = 0; i < listaGarageLocomotivas.size(); i++){
            System.out.print(listaGarageLocomotivas.get(i));
        }
    }
}
