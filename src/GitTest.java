public class GitTest {
    public static int foo(int n){
        if (n==1||n==2)
            return 1;
        else
            return 2*foo(n-1);
    }
    //快速排序法
    public static void quick_sort(int[] array,int begin,int end){
        if (begin>=end)
            return ;
        int template = array[begin];
        int i=begin,j=end;
        while (i<j){
            while (i<j&&array[j]>template)
                j--;
            array[i]=array[j];
            while (i<j&&array[i]<template)
                i++;
            array[j]=array[i];
        }
        array[i] = template;
        quick_sort(array,begin,i-1);
        quick_sort(array,i+1,end);
    }
    public static void main(String[] args) {
        int[] a =new int[]{5,6,3,2,7,8,9,1};
        quick_sort(a,0,a.length-1);
        for (int x:a)
            System.out.println(x+",");
    }
}
