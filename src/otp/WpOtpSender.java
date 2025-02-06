package otp;

public class WpOtpSender implements OtpSender {
    @Override
    public void sendOtp() {
        System.out.println("wp ile otp kod gonderildi");
    }

    @Override
    public void generateOtp() {

    }
}
