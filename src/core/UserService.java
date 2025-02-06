package core;

import database.BaseRepository;
import otp.OtpSender;
import otp.SmsOtpSender;
import otp.WpOtpSender;

public class UserService {
    private final OtpSender otpSender;
    private final BaseRepository baseRepository;

    public UserService(OtpSender otpSender, BaseRepository baseRepository) {
        this.otpSender = otpSender;
        this.baseRepository = baseRepository;
    }
    //Constructor injection

    public void add(User user) {
        baseRepository.add(user);
        otpSender.sendOtp();
    }

    public void remove(User user) {
        baseRepository.delete(user);
        otpSender.sendOtp();
    }
}
