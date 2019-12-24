public class main {
    
    public static void main(String args[]) 
    { 
        Kartal kartal = new Kartal(); 
        Yarasa yarasa = new Megabat(); 
  
        Yarasa yarasaAdapter = new YarasaAdapter(kartal); 
  
        System.out.println("Kartal..."); 
        kartal.uc(); 
        kartal.sesCikar(); 
  
        System.out.println("Yarasa..."); 
        yarasa.ciglikAt(); 
  
        System.out.println("YarasaAdapter..."); 
        yarasaAdapter.ciglikAt(); 
    } 
}
