import core.Student;
import core.Teacher;
import core.User;
import core.UserService;
import database.BaseRepository;
import database.TeacherRepository;
import otp.MailOtpSender;
import otp.SmsOtpSender;
import otp.WpOtpSender;

public class Main {
    public static void main(String[] args) {
        //student teacher add olsunsun

        Student student = new Student(1,"Turan","1234",142,99,"1161");
        Teacher teacher = new Teacher(2,"Mira","5678",3000,"IT");

        User[] users = {student,teacher};
        UserService userService = new UserService(new SmsOtpSender(),new BaseRepository());

        for(User i : users ){
            userService.add(i);
            userService.remove(i);
        }

    }
}