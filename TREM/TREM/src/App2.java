public class App2 {
    
    public static void main(String[] args) {
        
        GaragemLocomotiva g = new GaragemLocomotiva();
        Trem t = new Trem(1, null);
        Locomotiva lc = new Locomotiva(0, 5, 9999, 100, g);
        Locomotiva lc1 = new Locomotiva(1, 2, 6666, 100, t);

        System.out.println(g.getListaGarageLocomotivas());
        System.out.println(t.getListaLocomotiva());
    }
}
