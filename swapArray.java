class Solution {
    public void reverseArray(int arr[]) {
        // int l = arr.length;
        // for (int i=0;i<l/2;i++){
        //   int temp = arr[i];
        //   arr[i] = arr[l-i-1];
        //   arr[l-i-1] = temp;
           
           Collections.reverse(Arrays.asList(arr));
           
           /* Method	Works with
Collections.reverse(Arrays.asList(...))	✅ Integer[]
Swap loop	✅ int[]
        }
        */
    
}
