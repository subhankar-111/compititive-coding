public class target {
    public static void main(String[] args) {
        int [] arr= {10,20,30,40,50,60,70};
        int tar=20;
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]-arr[i]==tar){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
        
    }

    
            
        
    
}
