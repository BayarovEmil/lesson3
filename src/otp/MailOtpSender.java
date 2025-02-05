package otp;

public class MailOtpSender extends OtpSender {
    @Override
    public void sendOtp() {
        System.out.println("mail ile otp kod gonderildi");
    }
}
