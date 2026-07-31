import java.util.*;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stack size:");
        int size = sc.nextInt();
        int[] stack = new int[size];
        int top = -1;
        int choice;
        do{
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1 :
                    if(top==size-1){
                        System.out.println("stack overflow");
                    }
                    else{
                        System.out.println("Enter the value:");
                        int value = sc.nextInt();
                        top++;
                        stack[top] = value;
                        System.out.println("intrested");
                    }
                    break;
                    case 2 :
                        if(top==-1){
                            System.out.println("stack underflow");
                        }
                        else{
                            System.out.println(stack[top]+"removed");
                            top--;
                        }
                        break;
                        case 3 :
                            if(top==-1){
                                System.out.println("stack is empty");
                            }
                            else{
                            System.out.println("top element ="+ stack[top]);
                            }
                            break;
                            case 4 :
                                if(top==-1){
                                    System.out.println("stack is empty");
                                }
                                else{
                                    System.out.println("stack element:");
                                    for(int i=top;i>0;i--){
                                        System.out.println(stack[i]);
                                    }
                                }
                                break;
                                case 5 :
                                    System.out.println("program ended");
                                    break;
                                    default:
                                    System.out.println("Invalid choice");
                                }
        }
        while(choice !=5);
        sc.close();
    }
}
