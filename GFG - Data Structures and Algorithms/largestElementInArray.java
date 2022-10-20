class largestElementInArray{
  
    public static int largestEl(int[] arr){
        int maxIn = 0;
        for(int i=1;i<arr.length; i++)
            if(arr[i] > arr[maxIn]) maxIn = i;
        return maxIn;
    }
  
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 50, 40};
        System.out.print(largestEl(arr));
    }
}
