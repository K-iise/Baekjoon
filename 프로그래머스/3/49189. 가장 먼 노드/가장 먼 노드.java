import java.util.*;

class Solution {
    
    boolean []visit;
    public int solution(int n, int[][] edge) {
        int answer = 0;
        int max = 0;
        visit = new boolean[n+1];
        
        List<Node> nodes = new LinkedList<>();
        
        nodes.add(new Node(0));
        
        for(int i = 0; i < n; i++) {
            Node newNode = new Node(i+1);
            nodes.add(newNode);
        }
        
        for(int i = 0; i < edge.length; i++) {
            int aNode = edge[i][0];
            int bNode = edge[i][1];
            
            Node aN = nodes.get(aNode);
            Node bN = nodes.get(bNode);
            
            aN.add(bN);
            bN.add(aN);
        }
        
        Queue<Node> q = new LinkedList<>();
        nodes.get(1).setDr(1);
        q.offer(nodes.get(1));
        visit[1] = true;
        
        while(!q.isEmpty()) {
            var tmp = q.poll();
            
            List<Node> tnodes = tmp.getList();
            
            for(Node ns : tnodes) {
                int index = ns.getIndex();
                
                if(!visit[index]) {
                    visit[index] = true;
                    ns.setDr(tmp.dr+1);
                    q.offer(ns);
                }
            }
        }
        
        for(Node ns : nodes) {
            max = Math.max(max, ns.getDr());
        }
        
        for(Node ns : nodes) {
            if(ns.getDr() == max) {
                answer++;
            }
        }
        
        return answer;
    }
    
    class Node {
        int index;
        int dr;
        List<Node> list;
        
        public Node(int index) {
            this.index = index;
            list = new LinkedList<>();
        }
        
        public void add(Node addNode) {
            list.add(addNode);
        }
        
        public List<Node> getList(){
            return list;
        }
        
        public int getIndex(){
            return index;
        }
        
        public void setDr(int tmp) {
            dr = tmp;
        }
        
        public int getDr(){
            return dr;
        }
    }
}