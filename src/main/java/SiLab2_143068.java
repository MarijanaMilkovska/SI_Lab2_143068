import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SiLab2_143068 {

    public static boolean function(User user, List<String> allUsers) {
        if (user==null) { //1
            throw new RuntimeException("The user argument is not initialized!"); //2
        }
        else {
            if (user.getUsername()==null || allUsers.contains(user.getUsername())) { //3
                throw new RuntimeException("User already exists!"); //5
            }
            else {
                if (user.getEmail()==null) //4
                    return false;
                boolean atChar = false, dotChar = false;
                for (int i=0;i<user.getEmail().length();i++) { //6,7,12
                    if (user.getEmail().charAt(i)=='@') //8
                        atChar = true; //9
                    if (atChar && user.getEmail().charAt(i)=='.') { //10
                        dotChar = true; //1
                    }
                }
                if (!atChar || !dotChar) { //13
                    return false;
                }
            }
        }
        return true;
    }
}