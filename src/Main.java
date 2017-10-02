
public class Main {

   
    public static void main(String[] args) {
      int[] array={25,14,45,32,12,3,5,6,89,23};
              int numeroPicccolo;
              int valoreAttuale=0;
              int numeroProvvisorio;
              for (int i = 0; i<array.length-1; i++) {    //BUBBLE SHORT
            numeroPicccolo =array[i];
            int posizioneValoreIndice=i;
            
            
            
                                                   //0  1  2  3   4 5 6 7 8   9
           for (int j = i+1; j < array.length; j++) {//25 14 45 32 12 3 5 6 89 23
                      
                if(numeroPicccolo>array[j]){
                    
                  numeroPicccolo=array[j];//1
                  valoreAttuale=j;//1
                  
                }
                
                
            }
            //System.out.println(numeroPicccolo + " " + valoreAttuale);
            numeroProvvisorio=array[i];
            array[i]=numeroPicccolo;
            array[valoreAttuale]=numeroProvvisorio;
              
            for (int numeri:array)  System.out.print(numeri+" ");
                  System.out.println();
              }
             
              //for (int numeri:array)  System.out.println(numeri);
        
        
        
    }
        
    
    
}
