class Matrix{
    int row,column;
    float mat[][] = {{4,5},{7,8}};
    
    public Matrix(int a[][]){}
    public Matrix(){}
    public Matrix(int row,int column){}
    public void readMatrix(){
      for (int i=0;i<2;i++){
        for (int j=0;j<2;j++)
        System.out.print((int)mat[i][j]+" ");
        System.out.println(" ");
        }
        }
    
    public void transpose()
    {
    float [][]transpose = new float[2][2];
    for(int i=0;i<2;i++){
    for(int j=0;j<2;j++){
    transpose[i][j]= mat[j][i];
    }
    }
    System.out.println("TRANSPOSE:");
      for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
    System.out.print((int)transpose[i][j]+" ");
    }
     System.out.println();
    }
    }
    public void multiplication(float[][] mat2){
    float[][] c = new float[2][2];
    System.out.println("MULTIPLICATION:");
     for(int i=0;i<2;i++){
     for(int j=0;j<2;j++){
     c[i][j]=0;
     for(int k=0;k<2;k++)
       {     c[i][j]+=mat[i][k]*mat2[k][j];
       }
     System.out.print((int)c[i][j]+" ");
    }
    System.out.println();
            }
        }
    
    public void displayMatrix(float[][] a){
     System.out.println();
     System.out.println("MATRIX given: ");
     for (float[] fs : a) {
         for (float ele : fs) {
         System.out.print(ele + " ");
         }
         System.out.println();
    }
    }
    
    public void displayMatrix(){
     System.out.println();
      System.out.println("MATRIX : ");
        for (float[] fs : mat) {
        for (float ele : fs) {
        System.out.print(ele + " ");
        }
         System.out.println();
     }
    
    }
    
    public float maximum_of_array(){
     float max=mat[0][0];
      for (float[] fs : mat) {
      for (float ele : fs) {
      if(max<ele){
         max=ele;
      }
      }
     }
    return max;
    }
    
    public float average_of_array( ){
    float sum=0,avg,i=0;
     for (float[] fs : mat) {
       for (float ele : fs) {
       i++;
       sum+=ele;
       }
       }
       avg=sum/i;
       return avg;
    }
    
    }
    class One {
    public static void main(String[] args) {
    Matrix a = new Matrix(new int [10][10]);
    Matrix b = new Matrix();
    Matrix c = new Matrix(2,5);
    float[][] mat2 = {{4,5},{6,9}};
    
    b.readMatrix();
    b.transpose();
    b.multiplication(mat2);
    b.displayMatrix(mat2);
    b.displayMatrix();
    System.out.println("Average of an array is :"+b.average_of_array());
    System.out.println("Maximum of an array is :"+b.maximum_of_array());
    }
    }
    