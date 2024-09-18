public class ArraySort{
    public static int[] sortAcceding(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                  if(arr[j]>arr[j+1]){
                       int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                  }


            }

            
        }
            return arr;
    }

    public static void main(String[] args){
        int[] arr = new in[] {2,3,0,1,99,-12};
        for(int i=0; i<arr.length; i++){
            System.out.print(sortAcceding(arr[i]));
        }
        System.out.println();
    }
}