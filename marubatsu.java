import java.util.Scanner;
public class marubatsu{
  public static void main(String[] args){
    String[][]cell= new String[3][3];
    for(int i=0;i<=2;i++){
      for(int j=0; j<=2;j++){
        cell[i][j] = " ";
      }
    }
    Scanner scanner = new Scanner(System.in);
    int numA;
    int numB;
    for(int m=1;m<=9;m++){
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
        numA = scanner.nextInt();
        numB = scanner.nextInt();
        if (cell[numA][numB] != " "){
        System.out.println("すでに入力済みです。");
        }
        else{
        cell[numA][numB] = player ;
        is_set = true;
        }
      }
      for(int i=0;i<=2;i++){
        System.out.println((cell[i][0])+"|"+(cell[i][1])+"|"+(cell[i][2]));
      }
      if((cell[0][0]==player)&&(cell[1][1]==player)&&(cell[2][2]==player)){
        System.out.println(player+"の勝ちです。");
        return;
      }
      if((cell[2][0]==player)&&(cell[1][1]==player)&&(cell[0][2]==player)){
        System.out.println(player+"の勝ちです。");
        return;
      }
      for(int i=0;i<=2;i++){
        if((cell[i][0]==player)&&(cell[i][1]==player)&&(cell[i][2]==player)){
        System.out.println(player+"の勝ちです。");
        return;
        }
        else if((cell[0][i]==player)&&(cell[1][i]==player)&&(cell[2][i]==player)){
        System.out.println(player+"の勝ちです。");
        return;
        }
      }
    }
    System.out.println("あいこです。");
  }
}
