package ATM_Console_Application;

public class User {
        String username;
        String password;
        @Override
        public String toString(){
            String result=this.username+"\n"+this.password;
            return result;

        }
    }

