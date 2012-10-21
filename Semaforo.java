package semaforo;


public class Semaforo extends Thread{

    public static void main(String[] args) throws InterruptedException {
        LlamaLuces inicia = new LlamaLuces();
        System.out.println("\t\t\t\t\t\t\tSyC Software\n\n"
                + "\t\tSemafor de la Av.27 de Febrero\t\t\t\t\tSemafor de la Av.Abraham Lincoln\n");
        boolean on = true;
        while(on == true)
        {
            inicia.CorriendoHilos();
        }
        
        
        
        
        
    }
}