
public class Main {
    public static void main(String[] args) {
        String login = "MyLogin";
        String password = "MyPassword";
        String confirmPassword = "MyPassword";

        checkParameters(login, password, confirmPassword);

    }

static void checkParameters(String login, String password, String confirmPassword) {

    try {
        check(login, password,confirmPassword);
    } catch (WrongLoginException e) {
        System.out.println(e.getMessage());
    } catch (WrongPasswordException e) {
        System.out.println(e.getMessage());
    } finally {
        System.out.println("Проверка параметров завершена");
    }


} // end of checkParameters


    static void check(String login, String password, String confirmPassword) throws
            WrongPasswordException,
            WrongLoginException {

        if(login.length() > 20) {
            throw new WrongLoginException("Login не должен превышать 20 символов");
        }
        if(password.length() > 20) {
            throw new WrongPasswordException("Password не должен превышать 20 символов");
        }
        if(!checkWord(login)) {
            throw new WrongLoginException("Login содержит запрещенные символы");
        }
        if(!checkWord(password)) {
            throw new WrongPasswordException("Password содержит запрещенные символы");
        }
        if(!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password и ConfirmPassword должны совпадать");
        }
    }

    static boolean checkWord(String word) {
        for (int i = 0; i < word.length() ; i++) {
            if ((word.charAt(i) < '0' ||
                    (word.charAt(i) > '9' && word.charAt(i) < 'A') ||
                    (word.charAt(i) > 'Z' && word.charAt(i) < 'a') ||
                    word.charAt(i) > 'z') && word.charAt(i) != '_') {
                return false;
            }
        }
        return true;
    }

} // end of Main



