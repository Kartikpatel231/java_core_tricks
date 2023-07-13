package JavaQustions;

public class SearchTarget {
        public int searchInsert(int[] A, int target) { //pass parameter array and target
            int low = 0, high = A.length-1;           //its same as binary search
            while(low<=high){
                int mid = (low+high)/2;
                if(A[mid] == target){
                    return mid;
                }
                else if(A[mid] > target) {
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
            }
            return low;
       }
       public static void main(String[] args){
            SearchTarget obj=new SearchTarget(); //create object of SearchTarget class
            int arr[]=new int[]{1,4,6,7,9};    //create array object
            int target=11;                     //input to find targeted value
            int ans=obj.searchInsert(arr,target);  //function
           System.out.println(ans);                 //print result
       }
    }
