package nan.reynan.segundasemana;

public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuindoVolume();
        smartTv.diminuindoVolume();
        smartTv.diminuindoVolume();
        smartTv.aumentandoVolume();

        smartTv.mudarCanal(13);

        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("Volume Atual: " + smartTv.volume);
        
        System.out.println("TV Ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual :" + smartTv.canal);
        System.out.println("Volume Atual :" + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status - TV Ligada ?" + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo Status - TV Ligada ?" + smartTv.ligada);

    }
    
}
