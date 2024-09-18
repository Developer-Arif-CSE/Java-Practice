public class Part2{
    public static void main( String args[]){
         int arr[]= new int[] {2,1,3,5,6,7};
         int index=0;
         for (int i=0; i<arr.length; i++){
            for (int j=i+1; i<arr.length-1; j++)
               if (arr[i]==arr[j]){
                index=j; 
                break;
               }
               System.out.println("The duplicate is " +  index );
                //System.out.println("The duplicate is " +  arr[index] );
              
         }
    }
}