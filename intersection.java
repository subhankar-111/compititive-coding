import java.util.HashSet;

public class intersection {
    public static void main(String [] args){
        int [] a= {1,2,3,4};
        int [] b={3,5,6,1};
        HashSet<Integer>in= new HashSet<>();
        for (int i=0;i<a.length;i++){
          for(int j=0;j<b.length;j++){
            if(a[i]==b[j]){
                in.add(a[i]);
            }

        }
        }
        System.out.println(in);

    }

}
