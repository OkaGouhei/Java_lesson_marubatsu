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
    for(int m=1;m<=4;m++){
      System.out.println("丸の番です");
      System.out.println("数値を2つ入力してください。");
      while(true){
        numA = scanner.nextInt();
        numB = scanner.nextInt();
        if (cell[numA][numB] != " "){
          System.out.println("すでに入力済みです。");
        }
        else{
          break;
        }
      }
      cell[numA][numB] = "○";
      for(int i=0;i<=2;i++){
        System.out.println((cell[i][0])+"|"+(cell[i][1])+"|"+(cell[i][2]));
      }
      if((cell[0][0]=="○")&&(cell[1][1]=="○")&&(cell[2][2]=="○")){
        System.out.println("丸の勝ちです。");
        return;
      }
      if((cell[2][0]=="○")&&(cell[1][1]=="○")&&(cell[0][2]=="○")){
        System.out.println("丸の勝ちです。");
        return;
      }
      for(int i=0;i<=2;i++){
        if((cell[i][0]=="○")&&(cell[i][1]=="○")&&(cell[i][2]=="○")){
        System.out.println("丸の勝ちです。");
        return;
        }
      }
      System.out.println("バツの番です");
      System.out.println("数値を2つ入力してください。");
      while(true){
        numA = scanner.nextInt();
        numB = scanner.nextInt();
        if (cell[numA][numB] != " "){
          System.out.println("すでに入力済みです。");
        }
        else{
          break;
        }
      }
      cell[numA][numB] = "×";
      for(int i=0;i<=2;i++){
        System.out.println((cell[i][0])+"|"+(cell[i][1])+"|"+(cell[i][2]));
      }
      if((cell[0][0]=="×")&&(cell[1][1]=="×")&&(cell[2][2]=="×")){
        System.out.println("バツの勝ちです。");
        return;
      }
      if((cell[2][0]=="×")&&(cell[1][1]=="×")&&(cell[0][2]=="×")){
        System.out.println("バツの勝ちです。");
        return;
      }
      for(int i=0 ;i<=2 ; i++){
        if((cell[i][0]=="×")&&(cell[i][1]=="×")&&(cell[i][2]=="×")){
        System.out.println("バツの勝ちです。");
        return;
        }
      }
    }
    System.out.println("丸の番です");
    System.out.println("数値を2つ入力してください。");
    while(true){
      numA = scanner.nextInt();
      numB = scanner.nextInt();
      if (cell[numA][numB] != " "){
        System.out.println("すでに入力済みです。");
      }
      else{
        break;
      }
    }
    cell[numA][numB] = "○";
    for(int i=0;i<=2;i++){
      System.out.println((cell[i][0])+"|"+(cell[i][1])+"|"+(cell[i][2]));
    }
    if((cell[0][0]=="○")&&(cell[1][1]=="○")&&(cell[2][2]=="○")){
      System.out.println("丸の勝ちです。");
      return;
    }
    if((cell[2][0]=="○")&&(cell[1][1]=="○")&&(cell[0][2]=="○")){
      System.out.println("丸の勝ちです。");
      return;
    }
    for(int i=0;i<=2;i++){
      if((cell[i][0]=="○")&&(cell[i][1]=="○")&&(cell[i][2]=="○")){
      System.out.println("丸の勝ちです。");
      return;
      }
      else{
      System.out.println("あいこです。");
      }
    }
  }
}
