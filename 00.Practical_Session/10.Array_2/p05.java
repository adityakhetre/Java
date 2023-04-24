//WAP to take size of array from user and also take integer elements from user
//find the minimum element from the array
//input : Enter size : 5
//Enter array elements: 1 2 5 0 4
//output: min element = 0

import java.io.*;

class Demo{

        public static void main(String[] args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

                        System.out.print("enter size of array: ");

                        int size= Integer.parseInt(br.readLine());

                        int[] arr= new int[size];

                        int min=arr[0];

                        System.out.println("enter integer elements in array");

                        for(int i=0;i<arr.length;i++)
                        {
                                arr[i]= Integer.parseInt(br.readLine());

                                if(arr[i]<min)
                                {
                                        min=arr[i];
                                }
                        }
                        System.out.println("min element: "+min);
        }
}
