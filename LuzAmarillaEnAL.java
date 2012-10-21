package semaforo;

public class LuzAmarillaEnAL extends Thread{
    //int paRojo = 5;
    
    @Override
    public void run()
    {
        Thread luzAmarillaEnAL = new LuzAmarillaEnAL();
        for (int x = 5; x > 0; x--)
        {
            try 
            {
                System.out.println("Av.27 de Febrero en LUZ ROJA....... Segundos restantes: "+x+"\t*\tAv.Abraham Lincoln en LUZ AMARILLA... Segundos Restantes: "+x);
                luzAmarillaEnAL.sleep(1000);
                //paRojo = paRojo - 1;
                
            } 
            catch (InterruptedException ex) 
            {
                System.out.println("Pare y siga las instrucciones del AMET...");
            }
            
        }
    }
}
