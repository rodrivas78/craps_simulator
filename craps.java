import java.util.Random;

public class Crap1 {

     public static void main(String[] args) {
        Random gerador = new Random();
        Random gerador2 = new Random();
        int turn = 0;
        int win = 0;
        int loss = 0;
        int diceSum;
        int dado1, dado2;
        int point;
        int newSum;
        double result = 0;
       
        for (;;) {
       
          turn++; 
        //diceSum=gerador.nextInt(6)+1+gerador2.nextInt(6)+1;
        dado1=gerador.nextInt(6)+1;
        dado2=gerador2.nextInt(6)+1;
       
        diceSum=dado1+dado2;
         
         if (diceSum==7||diceSum==11) {
          win++;
          System.out.println("WIN!");
          System.out.println(diceSum);
          System.out.println("Turn: "+turn+" Win Count: "+win);
         
         } else if(diceSum==2||diceSum==3||diceSum==12) {
          loss++;
          System.out.println("Loss");
          System.out.println(diceSum);
          System.out.println("Turn: "+turn+" Loss Count: "+loss);
         } else {
          point = diceSum;
          System.out.println("Point: "+point);
           while(true) {
          
          //newSum=gerador.nextInt(6)+1+gerador2.nextInt(6)+1;
          dado1=gerador.nextInt(6)+1;
          dado2=gerador2.nextInt(6)+1;
       
        newSum=dado1+dado2;
         
          System.out.println("New Sum: "+newSum);
           if(newSum==point){
            System.out.println("You win!: "+newSum);
           win++;
           break;
           }else if(newSum==7){
             System.out.println("You lose "+newSum);
             loss++;
             break;
            } 
           } 
         }
            
        if (turn>=300) {
        result=(double)win/(double)turn;
        System.out.println("Resultado: "+result);
        System.out.println("Total Win Count: "+win);
       System.out.println("Total Loss Count: "+loss);
         break;
        }
        
       }
    }
}
