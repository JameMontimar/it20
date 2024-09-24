package Third_Page;

public class Multidimentional_Array {
    public static void main(String [] args){
        String [][] animals = {
            {"Persian Cat,","Squishy Mouse,","German Bulldog,"},
            {"Blacky,","Wiggie,","Oscar,"},
            {"Lechon de Mickey,","Baboy Ramo,","Brownies,"},
        };
        
        for (int i = 0;i<animals.length;i++){
            for (int j = 0;j<animals[i].length;j++){
                System.out.print(animals[i][j] + " ");
            }
            System.out.println();
            
        }       
    }
}
