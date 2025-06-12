package AnswerValue;

public class chocolateDistribute {
    public static void main(String[] args) {
        // find minimal maximum in array
        int[] a = {5, 3, 1, 4, 2};
        int m = 3;

        int ans = findMinimalMaximum(a, m);
        System.out.println("Minimal maximum in Array with m partition: "+ans);
    }

    private static int findMinimalMaximum(int[] a, int m) {
        //generalized start and mid for this question (Extracted from the given constraining)
        int start = 1, end = (int)1e9;

        int ans = 0;

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(isDivPossible(mid, a, m)){
                //ans = mid;
                end = mid - 1;
            } else{
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isDivPossible(int maxChocoAllowed, int[] a, int noOfStud) {
        int curStudNo = 1;
        int choco = 0; // current no.of chocolates that curStudNo have
        for(int i: a){
            // if the current element is > allowed chocolate, then we cant allocate to any student
            if(i > maxChocoAllowed) return false;
            // if curStudNo have choco + a[i] <= allowed chocolate give the chocolate.
            if(choco + i <= maxChocoAllowed){
                choco += i;
            } else {
                // if a student is full or if by giving cur chocolate, a[i] is not allowed.
                // give it to the next student
                curStudNo++;
                choco = i;
            }
        }
        // if curStudents number is greater than the allowed students return false.
        if(curStudNo>noOfStud) return false;
        return true;
    }
}
