//MergeSortedArray done in leetcode


// public class MergeSortedArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);    
//         int n1 = sc.nextInt();
//         int n2 = sc.nextInt();
//         int arr [] = {1,2,3,5};
//         int arr1 [] = {2,4,6,};
//         int n1 = arr1.length;
//         int n2 = arr2.length;

//         int []res=new int[n1+n2];
//         int c1=0;
//         int c2=0;
//         int t=0;

//         while (c1<n1 && c2<n2){
//             if(arr[c1]<arr2[c2]){
//                 res[t]=arr[c1];
//                 c1++;
//             }else{
//                 res[t]=arr2[c2];
//                 c2++;
//             }t++;
//             while (c1<n1){
//                 res[t]=arr[c1];
//                 t++;
//                 c1++;
//             }
            
//             while (c2<n2){
//                 res[t]=arr[c2];
//                 t++;
//                 c2++;
//             }
    
//         }
//     }
    
//     }
