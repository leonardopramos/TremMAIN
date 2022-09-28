public class Locomotiva extends Trem{
    
    private int identificadorLocomotiva;
    private double pesoMAX;
    private int numMaxVagoes;
    private Trem tremAtual = null;

    //Dois construtores, 1 para adicionar a locomotiva diretamente para o trem desejado, outro para criar a locomotiva e envia-la para a garagem de locomotivas.
    public Locomotiva(int identificadorTrem, int identificadorLocomotiva, double pesoMAX, int numMaxVagoes, Trem tremAtual) {
        super(identificadorTrem, null);
        this.identificadorLocomotiva = identificadorLocomotiva;
        this.pesoMAX = pesoMAX;
        this.numMaxVagoes = numMaxVagoes;
        this.tremAtual = tremAtual;
        if (tremAtual.getIdentificadorTrem() != identificadorTrem){
            System.out.println("Identificador de trem não coincide com o identificador do trem passado por parâmetro.");
            identificadorTrem = tremAtual.getIdentificadorTrem();
        }
        tremAtual.getListaLocomotiva().add(this);
    }
    public Locomotiva(int identificadorTrem, int identificadorLocomotiva, double pesoMAX, int numMaxVagoes, GaragemLocomotiva g){
        super(identificadorTrem, null);
        this.identificadorLocomotiva = identificadorLocomotiva;
        this.pesoMAX = pesoMAX;
        this.numMaxVagoes = numMaxVagoes;
        g.getListaGarageLocomotivas().add(this);
    }
    public int getIdentificadorLocomotiva() {
        return identificadorLocomotiva;
    }
    
    @Override
    public String toString() {
        String aux = " ";
        aux += "Locomotiva: " + getIdentificadorLocomotiva() + "\n";
        return aux;
    }
}
