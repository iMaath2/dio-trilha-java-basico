public class SmartTV {
    private boolean ligada;
    private int canal;
    private int volume;

    public boolean isLigada() {
        return ligada;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public SmartTV() {
        this.ligada = true;
        this.canal = 1;
        this.volume = 25;
    }

    public void powerButton() {
        if (ligada) {
            System.out.println("Desligando...");
            ligada = false;
        } else {
            System.out.println("Ligando...");
            ligada = true;
        }
    }

    public void mudarCanal(int canal) {
        if (ligada) {
            this.canal = canal;
        } else {
            System.out.println("TV desligada, por favor ligue-a primeiro.");
        }
    }

    public void aumentarCanal() {
        System.out.println("Aumentando canal");
        this.canal ++;

    }

    public void diminuirCanal() {
        System.out.println("Diminuindo canal");
        this.canal --;
    }

    public void aumentarVolume() {
        System.out.println("Aumentando volume");
        this.volume++;
    }

    public void diminuirVolume() {
        System.out.println("Diminuindo volume");
        this.volume --;
    }

}
