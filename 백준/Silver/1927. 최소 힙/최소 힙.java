

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static int index = 1; // 삽입과 삭제를 위한 마지막 노드 위치.
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); // 연산의 개수
        int heap[] = new int[100001]; // 힙을 저장 할 배열.
        
        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(br.readLine());
            
            if (tmp == 0) {
                remove(heap);
            } else {
                push(heap, tmp);
            }
        }
        
        bw.flush();
    }
    
    public static void push(int arr[], int data) {
        arr[index] = data; // 가장 끝의 자리에 노드를 삽입한다.
        int tmpindex = index;

        // 규칙에 따라서 교환.
        while (tmpindex > 1) {
            if (arr[tmpindex] < arr[tmpindex / 2]) {
                // 교환
                int tmp = arr[tmpindex];
                arr[tmpindex] = arr[tmpindex / 2];
                arr[tmpindex / 2] = tmp;
                tmpindex /= 2; // 부모 노드로 이동
            } else {
                break;
            }
        }
        
        index++; // index 증가
    }
    
    public static void remove(int arr[]) throws IOException {
        // 비어있는 경우
        if (index == 1) { // index가 1일 때는 노드가 없는 경우
            bw.write(0 + "\n"); // 빈 상태에서 0 출력
            return;
        }
        
        // 루트 노드를 제거한다.
        bw.write(arr[1] + "\n");
        
        // 루트 노드에 가장 마지막 노드를 입력한다.
        arr[1] = arr[index - 1];
        
        // 마지막 노드 제거
        arr[index - 1] = 0; // 마지막 노드 제거
        index--;
        
        int idx = 1;
        
        // 자식 노드가 있는 경우만 반복.
        while (idx * 2 < index) { // 자식 노드가 존재하는 경우
            int smallerChildIdx = idx * 2; // 왼쪽 자식을 기본 선택
            
            // 오른쪽 자식이 존재하고 더 작으면, 오른쪽 자식을 선택
            if (smallerChildIdx + 1 < index && arr[smallerChildIdx + 1] < arr[smallerChildIdx]) {
                smallerChildIdx++;
            }
            
            // 부모가 자식보다 작거나 같으면 종료
            if (arr[idx] <= arr[smallerChildIdx]) {
                break;
            }
            
            // 부모와 더 작은 자식을 교환
            int tmp = arr[idx];
            arr[idx] = arr[smallerChildIdx];
            arr[smallerChildIdx] = tmp;
            
            // 인덱스를 교환된 자식 위치로 이동
            idx = smallerChildIdx;
        }
    }
}
