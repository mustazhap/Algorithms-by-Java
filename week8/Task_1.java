public class Task_1 {
    static int[][] map;
    static int[] p = new int[]{5, 7, 9, 10, 13};
        public static void main(String[]args){
        int n = 5;
        int w = 20;
        Knapsack(n,w+1);
        ShowData();
    }
    public static void Knapsack(int n, int w){
        map = new int[n][w];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < w;j++)
                map[i][j] = 0;
        }
        for(int i = 0;i<map[0].length;i++){
            if(i-p[0]>=0){
                map[0][i] = p[0];
            }
        }
        for(int i = 1;i < n;i++){
            for(int j = 1;j < w;j++){
                if(j-p[i]>=0){
                    map[i][j]=Math.max(map[i-1][j],map[i-1][j-p[i]] + p[i]);
                }
                else{
                    map[i][j]=map[i-1][j];
                }
            }
        }
    }
    static void ShowData(){
        System.out.print("  |");
        for(int i = 0;i < map[0].length;i++){
            System.out.format("%3d",i);
        }
        System.out.println();
        for(int i = 0;i < map.length;i++){
            System.out.format("%3s",i+" |");
            for(int j = 0;j < map[i].length;j++)
                System.out.format("%3d",map[i][j]);
            System.out.println();
        }
        System.out.println("-----");
    }
}