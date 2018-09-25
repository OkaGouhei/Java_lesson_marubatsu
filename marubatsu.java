import java.util.Scanner;
import java.util.Random;
public class marubatsu{
  public static void Printcell(String[][]cell,int SideNum){
    for(int i=0;i<SideNum;i++){
      for(int j=0; j<SideNum;j++)
      {
      System.out.print("|"+(cell[i][j]));
      }
      System.out.println("|");
    }
  }
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("盤面の列の数を指定してください。");
    int SideNum = scanner.nextInt();
    String[][]cell= new String[SideNum][SideNum];
    for(int i=0;i<SideNum;i++){
      for(int j=0; j<SideNum;j++){
        cell[i][j] = " ";
      }
    }
    for(int m=1;m<= SideNum*SideNum ;m++){
      String player;
      if(m % 2 == 1){
        player = "○";
      }
      else{
        player = "×";
      }
      System.out.println(player+"の番です");
      System.out.println("数値を2つ入力してください。");
      boolean is_set = false;
      while(!is_set){
        int numA;
        int numB;
        if(m % 2 == 1){
          numA = scanner.nextInt();
          numB = scanner.nextInt();
        }
        else{
          Random rnd = new Random();
          numA = rnd.nextInt(SideNum);
          numB = rnd.nextInt(SideNum);
        }
        if(numA<0 ||numA>= SideNum||numB<0 ||numB >= SideNum){
          System.out.println("範囲外です");
        }
        else if (cell[numA][numB] != " "){
          System.out.println("すでに入力済みです。");
        }
        else{
        cell[numA][numB] = player ;
        is_set = true;
        }
      }
      Printcell(cell,SideNum);
      //ここから勝敗の判定
      row: for(int i=0; i<SideNum; i++){
        for(int j=0; j<SideNum; j++){
         if(cell[i][j] != player)continue row;
        }
        System.out.println(player+"の勝ちです。");
        return;
      }
      row: for(int j=0; j<SideNum; j++){
        for(int i=0; i<SideNum; i++){
         if(cell[i][j] != player)continue row;
        }
        System.out.println(player+"の勝ちです。");
        return;
      }
      //右下斜めの判定
      is_set = false;
      for(int i=0;i<SideNum; i++){
        if(cell[i][i] != player){
          is_set = true;
        }
      }
      if(is_set == false){
        System.out.println(player+"の勝ちです。");
        return;
      }
      //右上斜めの判定
      is_set = false;
      for(int i=0;i<SideNum; i++){
        if(cell[i][SideNum-1-i] != player){
          is_set = true;
        }
      }
      if(is_set == false){
        System.out.println(player+"の勝ちです。");
        return;
      }
    }
    System.out.println("あいこです。");
  }
}
