package semaforo;

public class LuzAmarillaEnLa27 extends Thread{
    //int paRojo = 5;
    
    @Override
    public void run()
    {
        Thread luzAmarillaEn27 = new LuzAmarillaEnLa27();
        for (int x = 5; x > 0; x--)
        {
            try 
            {
                System.out.println("Av.27 de Febrero en LUZ AMARILLA... Segundos restantes: "+x+"\t*\tAv.Abraham Lincoln en LUZ ROJA... Segundos Restantes: "+x);
                luzAmarillaEn27.sleep(1000);
                //paRojo = paRojo - 1;
                
            } 
            catch (InterruptedException ex) 
            {
                System.out.println("Pare y siga las instrucciones del AMET...");
            }
            
        }
    }
}
