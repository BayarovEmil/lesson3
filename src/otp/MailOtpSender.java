package otp;

public class MailOtpSender implements OtpSender {
    @Override
    public void sendOtp() {
        System.out.println("mail ile otp kod gonderildi");
    }

    @Override
    public void generateOtp() {

    }
}
