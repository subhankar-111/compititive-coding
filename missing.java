public class missing {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int n=5;
        int sum =0;
        int total = n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        int miss=total-sum;
        System.out.println("Missing number is: "+miss);
    }
        
    
}
