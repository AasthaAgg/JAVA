class secondLargestElementInArray{
    
    // public static int largestEl(int[] arr){
    //      int maxIn = 0;
    //      for(int i=1;i<arr.length; i++)
    //          if(arr[i] > arr[maxIn]) maxIn = i;
    //      return maxIn;
    // }
    
    //  public static int secondLargestEl(int arr[]){
    //      int maxIn = largestEl(arr);
    //      int secMaxIn = -1;
        
    //      for(int i=1; i<arr.length; i++)
    //          if(arr[i] != arr[maxIn])
    //              if(secMaxIn == -1 || arr[i] > arr[secMaxIn])
    //                     secMaxIn = i;
                
    //      return secMaxIn;
    // }
    
    public static int secondLargestEl(int arr[]){
         int maxIn = 0;
         int secMaxIn = -1;
        
         for(int i=1;i<arr.length; i++){
             if(arr[i] > arr[maxIn]){
                 secMaxIn = maxIn;
                 maxIn = i;
             }
             else if(arr[i] != arr[maxIn]){
                 if(secMaxIn == -1 || arr[i] > arr[secMaxIn]){
                      secMaxIn = i;
                 }
            }
        }
        
        return secMaxIn;
    }
    
    public static void main(String[] args) {
        int arr[] = {90, 80, 20, 90, 30, 10};
        System.out.print(secondLargestEl(arr));
    }
}
