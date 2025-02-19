public class Usuario {
    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        System.out.println("TV ligada? " + tv.isLigada());
        System.out.println("Canal atual: " + tv.getCanal());
        System.out.println("Volume atual: " + tv.getVolume());

        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.aumentarVolume();

        System.out.println("Volume atual: " + tv.getVolume());

        tv.powerButton();

        System.out.println("Tv ligada? " + tv.isLigada());


    }
}
