package core;

import database.BaseRepository;
import otp.OtpSender;
import otp.SmsOtpSender;
import otp.WpOtpSender;

public class UserService {
    private OtpSender otpSender;
    private BaseRepository baseRepository;
    //Constructor injection
    public UserService(OtpSender otp,BaseRepository baseRepository) {
        this.baseRepository = baseRepository;
        this.otpSender = otp;
    }

    public void add(User user) {
        baseRepository.add(user);
        otpSender.sendOtp();
    }

    public void remove(User user) {
        baseRepository.delete(user);
        otpSender.sendOtp();
    }
}
