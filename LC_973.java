import java.util.PriorityQueue;

public class LC_973 {
     public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]>maxHeap=new PriorityQueue<>(
            (a,b)-> Integer.compare(b[0],a[0])
        );
        int n=points.length;
        for(int i=0;i<n;i++){
            int dist=(points[i][0]*points[i][0])+(points[i][1]*points[i][1]);
            maxHeap.add(new int[]{dist,points[i][0],points[i][1]});
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        int res[][]=new int [k][2];
        int idx=0;
        while(!maxHeap.isEmpty()){
            int entry[]=maxHeap.poll();
            res[idx][0]=entry[1];
            res[idx][1]=entry[2];
            idx++;
        }
        return res;
    }
}