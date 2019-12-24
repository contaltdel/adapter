public class YarasaAdapter implements Yarasa {
    Kus kus; 
    public YarasaAdapter (Kus kus) 
    { 
        this.kus = kus; 
    } 
  
    public void ciglikAt() 
    { 
        kus.sesCikar(); 
    } 
}
