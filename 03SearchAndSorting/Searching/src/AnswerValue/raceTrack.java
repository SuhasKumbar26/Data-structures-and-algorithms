package AnswerValue;

public class raceTrack {
    public static void main(String[] args){
        int[] a = {1, 2, 4, 8, 9};
        int m = 3;

        int ans = findMaximalMinimum(a,m);
        System.out.println("Ans: "+ans);
    }

    private static int findMaximalMinimum(int[] a, int m) {
        int ans = 0;
        int st = 0, end = (int)1e9;

        while(st<= end){
            int mid = st + ( end - st) / 2;
            if(isPossible(mid, a, m)){
                // can k kids be placed such that no. 2 kids have dist lesser than mid?
                // there could be a possibility there exists an ans that has maximum distance b/w two kids
                // so, move start -> mid + 1
                ans = mid;
                st = mid + 1;
            } else{
                // no, we can't keep mid as maximum distance b/w two kids,
                // so we have to move end -> mid - 1
                end = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int dist, int[] a, int k) {
        int kidsPlaced = 1;
        int lastKid = a[0];
        for(int i = 1; i<a.length; i++){
            if(a[i] - lastKid >= dist){
                lastKid = a[i];
                kidsPlaced++;
            }
        }
        return kidsPlaced >= k;
    }
}
