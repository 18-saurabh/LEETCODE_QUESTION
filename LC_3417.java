import java.util.List;
import java.util.ArrayList;
public class LC_3417{
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> ans=new ArrayList<>();
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j< m; j++) {
                    if(cnt%2==0){
                        ans.add(grid[i][j]);
                    }
                    cnt++;
                }
            }
            else{
                for(int j=m-1;j>=0;j--){
                    if(cnt%2==0){
                        ans.add(grid[i][j]);
                    }
                    cnt++;
                }
            }
        }
        return ans;
    }
}