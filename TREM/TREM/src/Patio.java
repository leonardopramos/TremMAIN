import java.util.ArrayList;

public class Patio {
    
    private ArrayList<Trem> listaDeTrensNoPatio = new ArrayList<>();

    public ArrayList<Trem> getListaDeTrensNoPatio() {
        return listaDeTrensNoPatio;
    }
    public void imprimeTrensCriados(){
        for(int i = 0; i < listaDeTrensNoPatio.size(); i++){
            System.out.println(listaDeTrensNoPatio.get(i));
        }
    }
}
