class fib
{
  public static void main(String args[])
  {
   int i;
   int arr[]=new int[10];
   arr[0]=0;
   arr[1]=1;
   for(i=2;i<10;i++)
   {
     arr[i]=arr[i-1]+arr[i-2];
   }
   for(i=0;i<10;i++)
   {
    System.out.println(arr[i]);
   }
 }
}
     
      
      