
package email_validation_self;
import java.util.Scanner;


public class Email_validation_self {

    
    public static void main(String[] args) {
        
        try {
            
            Scanner Sc = new Scanner(System.in);
        
            String email;
            System.out.print ("Enter the email address --> ");
            email=Sc.nextLine();
        
            //sam@gmail.com
            
            int indexat = email.lastIndexOf("@");
            int indexdt = email.lastIndexOf(".");
            
            String bfrat = email.substring(0, indexat);
            String betatdt = email.substring(indexat+1,indexdt);
            String afterdt = email.substring(indexdt+1, email.length());
            
            boolean check1 = true;
            boolean check2 = true;
            boolean check3 = true;
            
            //check validation before @;
            
            if(bfrat.length()>=2){
                char sl = bfrat.charAt(0);
                
                if(Character.isLetter(sl)){
                    
                    for(int x=0;x<=bfrat.length()-1;x++){
                        char l = bfrat.charAt(x);
                        if(!(Character.isLetter(l) || Character.isDigit(l) || l=='.')){
                            check1=false;
                            System.out.println("invalid.. input has been mismatched before \"@\"");
                            break;
                        }
                    }
                    
                }
                else{
                    System.out.println("invalid..!! , email should start with a letter.");
                }
                
            }
            else{
                check1=false;
                System.out.println("invalid..!! , at least 2 characters needed before\"@\"");
            }
            
            //check validation between @ and . ;
            
            if(betatdt.length()>=2){
                for(int y=0;y<=betatdt.length()-1;y++){
                    char ll = betatdt.charAt(y);
                    if(!(Character.isLetter(ll) || Character.isDigit(ll))){
                        check2 = false;
                        System.out.println("invalid..!! , wrong character is contained between \"@\" and \".\"");
                        break;
                    }
                }
            }
            else{
                check2=false;
                System.out.println("invalid..!! , at least 2 characters needed between \"@\" and \".\"");
            }
            
            //check validation after .(last used);
            
            if(afterdt.length()>=2){
                char sll = afterdt.charAt(0);
                if(Character.isLetter(sll)){
                    for(int z=0;z<=afterdt.length()-1;z++){
                        char slll = afterdt.charAt(z);
                        if(!(Character.isLetter(slll) || Character.isDigit(slll))){
                            check3 = false;
                            System.out.println("invalid..!! , wrong character is contained after the last \".\"");
                            break;
                        }
                    }
                }
                else{
                    System.out.println("invalid..!! , wrong character entered after the last used \".\"");
                }
            }
            else{
                check3 = false;
                System.out.println("invalid..!! , at least 2 characters needed after final used \".\"");
            }
            
            if(check1==true && check2==true && check3==true){
                System.out.println("Valid email address..!!");
            }
            
        }
        catch (Exception e) {
            System.out.println("Error occured..!! --> "+e);
        } 
        
    }
    
}
