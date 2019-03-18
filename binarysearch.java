import java.util.*;
class binarysearch
{
    int searchBin(int arr[],int l,int r,int val)
    {
        if(r>=1)
        {
            int mid= l +(r-l)/2;
            if(arr[mid]==val)
            {
                return mid;
            }
            if(arr[mid]>val)
            {
                return searchBin(arr,l,mid-1,val);
            }
            if(arr[mid]<val)
            {
                return searchBin(arr,mid+1,r,val);
            }
        }
        return -1;

    }
    public static void main(String args[])
    {
        int[] ar = {1,2,3,4,5,6,7,8,9,10};
        int n= ar.length;
        binarysearch obj= new binarysearch();
        int ret = obj.searchBin(ar,0,n-1,6);
        if(ret==-1)
        {
            System.out.println("Value not found");
        }
        else{
            System.out.println("Value found on position: "+ret);
        }

    }
}