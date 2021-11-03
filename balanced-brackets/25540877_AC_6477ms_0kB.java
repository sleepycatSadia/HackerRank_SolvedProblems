import java.util.*;
public class Main{ 
  
  static String isBalanced(String s) {
    Stack<Character> st =new Stack<Character>();
    char[] c =s.toCharArray();
    for (int i = 0; i < c.length; i++) { 
      if (c[i]=='('||c[i]=='{'||c[i]=='['){
        st.push(c[i]); 
      }else if (c[i]==')'||c[i]=='}'||c[i]==']'){
        if (st.isEmpty()){
          return "NO";
        }else{
          char start = st.pop();
          char end=c[i];
          if((start=='(' && end==')')||(start=='{'&& end=='}')||(start=='['&& end==']')){
            
          }else{ 
            return "NO";
          }
        }
      }
      
    }
    if (st.isEmpty()==true){
      return "YES";
    }else{
      return "NO";
    }
  }
  
  public static void main(String[] args){ 
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    for (int i = 1; i <=t; i++) { 
      String p =sc.nextLine();
      String result = isBalanced(p);
      System.out.println(result);
    }
  }
}
