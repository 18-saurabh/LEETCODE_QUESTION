import java.util.ArrayList;
import java.util.List;
public class LC_118{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generateRows(i));
        }
        return ans;
    }
    public List<Integer> generateRows(int rows){
        List<Integer>ansRow=new ArrayList<>();
        long ans=1;
        ansRow.add(1);
        for(int col=1;col<rows;col++){
            ans=ans*(rows-col);
            ans=ans/col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }

}