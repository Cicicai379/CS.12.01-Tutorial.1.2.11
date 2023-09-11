public class DiverseArray {

    public static int arraySum(int[] arr){
        int ans =0;
        for(int i=0; i<arr.length; i++){
            ans += arr[i];
        }
        return ans;
    }

    public static int[] rowSums(int[][] arr){
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                ans[i]+=arr[i][j];
            }
        }
        return ans;
    }
    public static boolean isDiverse(int[][] arr){
        int[] ans = rowSums(arr);
        for(int i=0; i<ans.length-1; i++){
            for(int j=i+1; j<ans.length; j++){
                if(ans[i]==ans[j])return false;
            }
        }
        return true;
    }
}
