public class Array {
    public static void main(String[] args) {
        Integer arr[] ={1,2,3,4,5};
        for(Integer i=0;i<=4;i++){
            Integer nar[] = new Integer [5];
            nar[i]=arr[i];
            System.out.println(nar[i]);
        }
    }
    
}
