package otp;

public class SmsOtpSender extends OtpSender {
    @Override
    public void sendOtp() {
        System.out.println("sms ile otp kod gonderildi");
    }
}
