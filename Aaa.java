public class Aaa{
    public static void main(String[] args) {
        int a[]={1,2,4,5,6};
        int exce=a.length*(a.length+1)/2;
        
        int result=0;
        for(int i=0;i<a.length;i++){
            result=result+a[i];
        }

        System.out.println(result-exce +" is the  missing Element in the list");
    }
}