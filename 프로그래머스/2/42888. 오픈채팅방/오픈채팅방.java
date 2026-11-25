// 채팅방은 중복 닉네임 허용
import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        Queue<String> ins = new ArrayDeque<>();
        List<String> result = new ArrayList<>();
        
        for(int i = 0; i < record.length; i++) {
            String []parts = record[i].split(" ");
            String instruction = parts[0];
            String uuid = parts[1];
            
            ins.offer(instruction + " " + uuid);
            
            if(instruction.equals("Enter")) {
                map.put(uuid, parts[2]);
            }
            if(instruction.equals("Change")) {
                map.put(uuid, parts[2]);
            }
        }
        
        while(!ins.isEmpty()) {
            String str = ins.poll();
            String[] parts = str.split(" ");
            
            if(parts[0].equals("Enter")) {
                String name = map.get(parts[1]);
                result.add(name + "님이 들어왔습니다.");
            }
            if(parts[0].equals("Leave")) {
                String name = map.get(parts[1]);
                result.add(name + "님이 나갔습니다.");
            }
        }
        String[] str = new String[result.size()];
        for(int i = 0; i < str.length; i++) {
            str[i] = result.get(i);
        }
        
        return str;
    }
}