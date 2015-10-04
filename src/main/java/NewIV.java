/**
 * Created by SQL on 2015/9/29.
 */
public class NewIV {

    public int method1(){
        return 0;
    }

    public int[] addSameSize(int[] n1, int[] n2){
        //TODO : check if same size, if not return exception

        int[] result = new int[n1.length + 1];

        int cur = 0;
        int car = 0;
        for (int i = 1 ; i <= n2.length; i++) {
            int tmp = n2[n2.length - i];
            int tmpRes = tmp + n1[n1.length - i] + car;
            car = tmpRes/10;
            cur = tmpRes % 10;
            result[result.length - i] = cur;
        }

        if(car > 0) result[0] = car;

        return result;
    }

    public int[] expandArray(int[] n, int size){

        int[] newArr = new int[size];

        for( int i = 1; i <= n.length; i ++){
            newArr[newArr.length - i ] = n[n.length - i];
        }

        return newArr;
    }

    public int[] add(int[] n1, int[] n2){

        int n1Size = n1.length;
        int n2Size = n2.length;

        if( n1Size <= 0 || n1 == null) return n2;
        if( n2Size <= 0 || n2 == null) return n1;

        int maxLen = Math.max(n1Size, n2Size);

        int[] result = null;

        int[] newN1 = expandArray(n1, maxLen);
        int[] newN2 = expandArray(n2, maxLen);

        result = addSameSize(newN1, newN2);

        return result;
    }
}
