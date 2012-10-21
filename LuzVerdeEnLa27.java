package semaforo;

public class LuzVerdeEnLa27 extends Thread
{
    
    @Override
    public void run()
    {
        System.out.println("********************************************************************************************************************************");
        int paRojo = 50;
        Thread luzVerdeEn27 = new Thread();
        for(int x = 50; x>0;x--)
        {
            try 
            {
                if(x >=6)
                {
                    System.out.println("Av.27 de Febrero en LUZ VERDE...... Segundos restantes: "+(x-5)+"\t*\tAv.Abraham Lincoln en LUZ ROJA... Segundos Restantes: "+paRojo);
                    luzVerdeEn27.sleep(1000);
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
