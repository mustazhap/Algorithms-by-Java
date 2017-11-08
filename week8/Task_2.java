public class Task_2 {
    static int n = 4, m = 6;
    static  int[][]map = new int[][]{
            {2, 3, 4, 5, 6,10},
            {3, 4, 1, 2, 3, 5},
           {10, 8, 7, 4, 6, 4},
            {3, 4, 5, 7, 8, 4}
    };          
    public static void main(String []args){
        GoldMine();
        for(int j = 1;j < m; j++){
            for(int i = 0; i < n; i++){
            System.out.println(map[i][j]);

            }
        }
    }
    public static void GoldMine(){
        for(int j = 1;j < m; j++){
            for(int i = 0; i < n; i++){
                if(i==0){
                    int right = map[i][j-1];
                    int rightDown = map[i+1][j-1];
                    map[i][j] = map[i][j] + Math.max(right, rightDown);
                }
                else if(i==n-1){
                    int right = map[i][j-1];
                    int rightUp = map[i-1][j-1];
                    map[i][j] = map[i][j] + Math.max(right, rightUp);
            
                }
                else{
                    int right = map[i][j-1];
                    int rightUp = map[i-1][j-1];
                    int rightDown = map[i+1][j-1];
                    map[i][j] = map[i][j] + Math.max(Math.max(right, rightUp), rightDown);
                }
            }
        }
    }
    
}
