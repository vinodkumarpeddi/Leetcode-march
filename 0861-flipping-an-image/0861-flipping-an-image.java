class Solution {
    public void reverse(int arr[])
    {
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
         for(int i=0;i<n;i++)
         {
            reverse(image[i]);
            for(int j=0;j<image[0].length;j++)
            {
                 image[i][j]^=1;
            }
         }
         return image;
    }
}