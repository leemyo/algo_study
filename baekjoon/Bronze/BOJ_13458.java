package Hanwha;

import java.util.*;
import java.io.*;

public class BOJ_13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long sum = 0;
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i]=Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            sum+=1;
            num[i]-=B;
            if (num[i]>0) {
                sum+=(num[i]/C);
                if(num[i]%C!=0) sum+=1;
            }
        }

        System.out.println(sum);
        br.close();
    }
}
