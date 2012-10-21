package semaforo;

public class LuzVerdeAL extends Thread{
    
    @Override
    public void run()
    {
        System.out.println("********************************************************************************************************************************");
        int paRojo = 50;
        Thread luzVerdeEnAL = new LuzVerdeAL();
        for(int x = 50; x>0;x--)
        {
            
            try 
            {
                if(x>=6)
                {
                    System.out.println("Av.27 de Febrero en LUZ ROJA....... Segundos restantes: "+paRojo+"\t*\tAv.Abraham Lincoln en LUZ VERDE... Segundos Restantes: "+(x-5));
                    luzVerdeEnAL.sleep(1000);
                    paRojo = paRojo - 1;
                }
                
                
            }
            catch (InterruptedException ex) 
            {
                System.out.println("Pare y siga las instrucciones del AMET...");
            }
        }
    }
}
