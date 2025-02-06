package otp;

public class SmsOtpSender implements OtpSender {
    @Override
    public void sendOtp() {
        System.out.println("sms ile otp kod gonderildi");
    }

    @Override
    public void generateOtp() {

    }
}
