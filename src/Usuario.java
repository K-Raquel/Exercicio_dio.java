public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        smartTV.ligar();

        System.out.println("Ligada? " + smartTV.ligada);

        smartTV.aumentarVolume();

        System.out.println("Volume: " + smartTV.volume);

        smartTV.mudarCanal(5);

        System.out.println("Canal: " + smartTV.canal);

        smartTV.diminuirVolume();

        System.out.println("Ligada? " + smartTV.ligada);

        smartTV.diminuirCanal();

        System.out.println("Novo Canal: " + smartTV.canal);

        smartTV.aumentarCanal();

        System.out.println("Novo Canal: " + smartTV.canal);
        
        smartTV.desligar();

        System.out.println("Ligada? " + smartTV.ligada);
    }
}
