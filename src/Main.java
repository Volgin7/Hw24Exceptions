
public class Main {
    public static void main(String[] args) {
        String login = "MyL_ogin";
        String password = "MyPassword";
        String confirmPassword = "MyPassword";

        checkParameters(login, password, confirmPassword);


    }

static void checkParameters(String login, String password, String confirmPassword) {

    try {
        check(login, password,confirmPassword);
    } catch (WrongLoginException e) {
        System.out.println("Login содержит запрещенные символы");
    } catch (WrongPasswordSymbolException e) {
        System.out.println("Password содержит запрещенные символы");
    } catch (WrongLoginLengthException e) {
        System.out.println("Длина Login не должна превышать 20 символов");
    } catch (WrongPasswordLengthException e) {
        System.out.println("Длина Password не должна превышать 20 символов");
    } catch (WrongPasswordException e) {
        System.out.println("Password и ConfirmPassword должны совпадать");
    } finally {
        System.out.println("Проверка параметров завершена");
    }


} // end of checkParameters


    static void check(String login, String password, String confirmPassword) throws
            WrongPasswordException,
            WrongLoginLengthException,
            WrongPasswordLengthException,
            WrongLoginException,
            WrongPasswordSymbolException {

        if(login.length() > 20) {
            throw new WrongLoginLengthException();
        }
        if(password.length() > 20) {
            throw new WrongPasswordLengthException();
        }
        if(!checkWord(login)) {
            throw new WrongLoginException();
        }
        if(!checkWord(password)) {
            throw new WrongPasswordSymbolException();
        }
        if(!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
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



