public class Chickens01 {
    public static void main(String[] args) {
        //Declarando variável
    int chicken = 3;     //Galinha   
    int eggs = 0;        //Ovos
           
      
      eggs += chicken*5;
        System.out.println("Na segunda-feira o fazendeiro Bronw teve um total de "+eggs + "ovos ");
        chicken++;
        eggs += chicken*5;
        System.out.println("Na terça-feira o fazendeiro Bronw teve um total de " + eggs + "ovos");
        chicken = chicken / 2;
        eggs += chicken*5;
        System.out.println("Na quarta-feira o fazendeiro Bronw teve um total de ovos " + eggs + " ovos" );
        
        
        //System.out.println(totalEggs);
                
                
      
      
    }   
}
