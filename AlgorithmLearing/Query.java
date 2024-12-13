/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2023-2023. All rights reserved.
 */

package com.demo.hw.dataStructure.sqList;

public class Query {
    public static void main(String[] args) {
        int[] arr = {0,1,16,24,35,47,59,62,73,88,99,0,0};
        long l = System.currentTimeMillis();
        System.out.println(fibonacciSearch(arr, 59));
    }
    public static int fibonacciSearch(int[] arr,int e){
        int[] F = {0,1,1,2,3,5,8,13,21};
        int left=0,right=10,mid,i,k=0;
        int n=10;
        while(F[k]-1<n){  //f[k]=f[k-1]+f[k-2]
            k++;
        }
        for(i=n;i<F[k]-1;i++){
            arr[i]=arr[n];
        }

        while(left<=right){ //length f[k]-1=f[k-1]+  f[k-2]-1
            mid=left+F[k-1]-1; //黄金分割
            if(e<arr[mid]){
                right=mid-1;
                k=k-1;
            }else if(e>arr[mid]){
                left=mid+1;
                k=k-2;
            }else{
                if(mid<=n){
                    return mid;
                }else{
                    return n;
                }
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr,int e){
        int left=0;
        int right = arr.length-1;
        int mid;
        while(left<=right){
            mid = (left+right)/2;
            if(arr[mid]>e){
                right = mid-1;
            }else if(arr[mid]<e){
                left=left+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
