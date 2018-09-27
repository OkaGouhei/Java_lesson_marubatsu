import java.util.Scanner;
import java.util.Random;
public class marubatsu{
  public static void printcell(String[][]cell,int sidenum){
    for(int i=0;i<sidenum;i++){
      for(int j=0; j<sidenum;j++)
      {
      System.out.print("|"+(cell[i][j]));
      }
      System.out.println("|");
    }
  }
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    boolean is_set_banmen = false;
    int sidenum = 1 ;
    //変数sidenumは初期化されていない可能性があります。のエラーを回避するため sidenum に1を代入
    while(!is_set_banmen){
      System.out.println("盤面の列の数を指定してください。");
      sidenum = scanner.nextInt();
      if(sidenum >= 1){
        is_set_banmen = true;
      }
      else{
        System.out.println("1以上を入力してください。");
      }
    }
    String[][]cell= new String[sidenum][sidenum];
    for(int i=0;i<sidenum;i++){
      for(int j=0; j<sidenum;j++){
        cell[i][j] = " ";
      }
    }
    for(int m=1;m<= sidenum*sidenum ;m++){
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
          numA = rnd.nextInt(sidenum);
          numB = rnd.nextInt(sidenum);
        }
        if(numA<0 ||numA>= sidenum||numB<0 ||numB >= sidenum){
          System.out.println("範囲外です");
        }
        else if (cell[numA][numB] != " "){
          if(player == "○"){
          System.out.println("すでに入力済みです。");
          }
        }
        else{
        cell[numA][numB] = player ;
        is_set = true;
        }
      }
      printcell(cell,sidenum);
      //ここから勝敗の判定
      row: for(int i=0; i<sidenum; i++){
        for(int j=0; j<sidenum; j++){
         if(cell[i][j] != player)continue row;
        }
        System.out.println(player+"の勝ちです。");
        return;
      }
      row: for(int j=0; j<sidenum; j++){
        for(int i=0; i<sidenum; i++){
         if(cell[i][j] != player)continue row;
        }
        System.out.println(player+"の勝ちです。");
        return;
      }
      //右下斜めの判定
      boolean is_set_shouhai = false;
      for(int i=0;i<sidenum; i++){
        if(cell[i][i] != player){
          is_set_shouhai = true;
        }
      }
      if(is_set_shouhai == false){
        System.out.println(player+"の勝ちです。");
        return;
      }
      //右上斜めの判定
      is_set_shouhai = false;
      for(int i=0;i<sidenum; i++){
        if(cell[i][sidenum-1-i] != player){
          is_set_shouhai = true;
        }
      }
      if(is_set_shouhai == false){
        System.out.println(player+"の勝ちです。");
        return;
      }
    }
    System.out.println("あいこです。");
  }
}
