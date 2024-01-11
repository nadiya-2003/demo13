class MultidimensionalThreeArray1
{
public static void main(String args[])
{
int[][][]test={{
{1,-2,3},{4,5,6,9},{10,11,12}},
{  {-4,-5,6,9},{1},{2,3} }
};

for (int[][] array2D:test)
{
for(int[] array1D:array2D)
{
for(int item:array1D)
{
System.out.println(item);
}
}
}
}
}