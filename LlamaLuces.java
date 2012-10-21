package semaforo;

public class LlamaLuces extends Thread{
        public synchronized void CorriendoHilos() throws InterruptedException
        {
            Thread verde27 = new LuzVerdeEnLa27();
            Thread amarilla27 = new LuzAmarillaEnLa27();
            Thread verdeAL = new LuzVerdeAL();
            Thread amarillaAL = new LuzAmarillaEnAL();
        
            verde27.sleep(5*1000);
            verde27.start();
        
            amarilla27.sleep(45 * 1000);
            amarilla27.start();
            
            verdeAL.sleep(5*1000);
            verdeAL.start();
            
            amarillaAL.sleep(45*1000);
            amarillaAL.start();
        }
}
