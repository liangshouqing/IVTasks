import java.util.*;

/**
 * Created by SQL on 2015/9/23.
 */
public class JavaIV {
//    public static void main(String[] args) {
//        System.out.println("Test");
//    }

    private ArrayList<Integer> arrList = new ArrayList<Integer>();
    private Map<String, Integer> userAccBalance = new HashMap<String, Integer>();
    private int[][] intArr = {{1,2}, {1,2,3}, {4,5,6}};

    public int[][] getIntArr() {
        return intArr;
    }

    public JavaIV(){
        System.out.println("JavaIV Constructor run");
    }

    public boolean isValidatePurchase(int mount) {
        if(mount < 0){
            System.out.println("Invalid");
            return false;
        }else if( mount <= 10){
            return true;
        }else if( mount > 900) {
            return false;
        }else{
            return true;
        }
    }

    public boolean isValidatePruchases(String userEmail, int mount) {
        if(!isValidatePurchase(mount)) {
            return false;
        }

        int curBalance = userAccBalance.getOrDefault(userEmail,0);

        if( curBalance != 0){
            if (curBalance + mount > 1000) {
                return false;
            }else{
                userAccBalance.put(userEmail, curBalance + mount);
                return true;
            }
        }else{
            userAccBalance.put(userEmail, mount);
            return true;
        }
    }

    public void initArray(int[][] arr2d) {
        for(int i = 0; i < arr2d.length;i ++){
            for(int j = 0; j < arr2d[i].length; j++){
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < 10; i++ ){
            arrList.add(i, i);
        }
    }
}
