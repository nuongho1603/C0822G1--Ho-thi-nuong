package ss19.exercise.exercise1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    /* Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P

Không chứa các ký tự đặc biệt

Theo sau ký tự bắt đầu là 4 ký tự số

Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M

Ví dụ tên lớp hợp lệ: C0318G

Ví dụ tên lớp không hợp lệ: M0318G, P0323A
^([C|A|P]{1,})([0-9]{4,})([G-M]{1,})$
*/

    public static final String NAME_REGEX ="^[CAP]\\d{4}([G-IK-M]{1,})$";
    public ClassNameExample(){
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
