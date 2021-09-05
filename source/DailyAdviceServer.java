import java.io.*;
import java.net.*;

public class DailyAdviceServer{
    String[] adviceList={"Take smaller bites","Go for the tight jeans. No they do NOT make yo look fat.","One word: inappropriate","Just for today, be honest. Tell your boss what you *really* think","You might want to rethink that haircut."};

    public void go(){
        try{
            ServerSocket serverSock = new ServerSocket(4242);
            System.out.println("************");
            int i=0;
            while(true){
                i=i+1;

                System.out.println("Client Request No."+i);
                Socket sock = serverSock.accept();
                System.out.println("CLIENT REQUEST ACCEPTED");

                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
    }  

    private String getAdvice(){
        int random = (int)(Math.random() * adviceList.length);
        return adviceList[random];

    }  

    public static void main(String[] args) {
        System.out.println("MAIN");
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
        
    }
}