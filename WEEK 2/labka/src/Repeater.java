public class Repeater {
    public int[] repeat(int[] arr){
        int[] a;
        int cnt=0;
        a = new int[arr.length *2 ];
        // 1, 2, 3;
        for(int i=0; i<arr.length; i++){
            a[i] = arr[i];
            a[i+1] = arr[i];
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<2 ; j++){
                a[cnt++] = arr[i];
            }
        }
        return a;
        //1, 1, 2, 2, 3, 3;
    }
}
