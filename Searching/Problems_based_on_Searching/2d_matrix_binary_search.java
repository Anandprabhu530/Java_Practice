import java.util.*;

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr =  {{1,3,5,7},
                        {10,11,16,20},
                        {23,30,34,60}
                    };
        int i =0;
        int target = 16;
        while(i<arr.length){
            if(arr[i][3]>target){
                break;
            }else{
                i++;
            }
        }
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==target){
                System.out.println("Target Element found at the index " + i + "" + j);
                break;
            }
        }
        
    }
}