import java.util.*;
// 요금표
// 입 출차 기록
// 차량별로 주차 요금 계산
class Solution {
    public int[] solution(int[] fees, String[] records) {
        int basicMinute = fees[0];
        int basicMoney = fees[1];
        int unitMinute = fees[2];
        int unitMoney = fees[3];
        
        Map<String, Integer> carts = new HashMap<>();
        Map<String, Integer> use = new HashMap<>();
        
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < records.length; i++) {
            String []parts = records[i].split(" ");
            int time = parse(parts[0]);
            String number = parts[1];
            String behavior = parts[2];
            
            
            if(behavior.equals("IN")) {
                carts.put(number, time);
            }
            
            if(behavior.equals("OUT")) {
                int entry = carts.get(number);
                int out = time;
                int useTime = out - entry;
                use.put(number, use.getOrDefault(number, 0) + useTime);
                carts.remove(number);
            }
        }
        
        for(String number : carts.keySet()) {
            int end = parse("23:59");
            int entry = carts.get(number);
            int useTime = end - entry;
            use.put(number, use.getOrDefault(number, 0) + useTime);
        }
        
        List<String> copy = new ArrayList<>(use.keySet());
        Collections.sort(copy);
        
        for(String number : copy) {
            int useMinute = use.get(number);
            int rs = calculates(basicMinute, basicMoney, unitMinute, unitMoney, useMinute);
            result.add(rs);
        }
    

        
        return result.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }
    
    private int calculates(int basicMinute, int basicMoney, int unitMinute, int unitMoney, int totalMinute) {
        int tmp = (int) Math.ceil((totalMinute - basicMinute));
        if(tmp > 0)
            return basicMoney + (int) (Math.ceil(( (double) (totalMinute - basicMinute) / unitMinute)) * unitMoney);
        return basicMoney;
    }
    
    private int parse(String time) {
        String []parts = time.split(":");
        return (Integer.parseInt(parts[0]) * 60) + Integer.parseInt(parts[1]);
    }
}