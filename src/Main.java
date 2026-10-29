import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int distancia(int x, int Y){
        if((x<0 && Y > 0) || (x>0 && Y<0)){
            return Math.abs(x-Y)-1; //sin añño 0

        }
        return Math.abs((x-Y));
    }


    public static void main(String[] args) throws Exception{


        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out  = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));


        String s = br.readLine();
        if (s == null || s.isEmpty()){ out.flush();return;}

        int T = Integer.parseInt(s.trim());
        for (int i = 0; i < T; i++) {
            String line;
            while ((line = br.readLine()) != null && line.trim().isEmpty() ){
                StringTokenizer st = new StringTokenizer(line);
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                int C = Integer.parseInt(st.nextToken());
                int dtA = distancia(A,B);
                int dtC = distancia(C,B);
                if(dtA < dtC ){
                    out.print(A);
                }else if (dtC > dtA){
                     out.print(C);
                }else {
                    out.print("Empate");
                }
                out.flush();




            }
            
        }



    }
}