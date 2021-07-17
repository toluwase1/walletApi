package com.toluwase.walletapi.services.serviceImpl;

import com.toluwase.walletapi.models.Level;
import com.toluwase.walletapi.models.LevelThreeInfo;
import com.toluwase.walletapi.models.LevelTwoInfo;
import com.toluwase.walletapi.models.User;
import com.toluwase.walletapi.repositories.AuthRepository;
import com.toluwase.walletapi.services.VerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerificationServiceImpl implements VerificationService {
    @Autowired
    private AuthRepository authRepository;

    @Override
    public Boolean levelTwoVerification(LevelTwoInfo levelTwoInfo, Long id) {
        User user = authRepository.findById(id).get();
        user.setPhone(levelTwoInfo.getPhone());
        if (checkIfInfoMatchesLevelTwo(levelTwoInfo, user)) {
            user.setLevels(Level.LEVEL_TWO);
        }
        String message = "Phone verification successful, You are now in level 3";
        return true;
    }
    public boolean checkIfInfoMatchesLevelTwo (LevelTwoInfo levelTwoInfo, User user) {
        return user.getEmail().equals(levelTwoInfo.getEmail()) &&
                user.getPassword().equals(levelTwoInfo.getPassword()) &&
                user.getPin().equals(levelTwoInfo.getPin());

    }

    @Override
    public String levelThreeVerification(LevelThreeInfo levelThreeInfo, Long id, LevelTwoInfo levelTwoInfo) {
        User user = authRepository.findById(id).get();
        user.setBvn(levelThreeInfo.getBvn());
        if (levelTwoVerification(levelTwoInfo, id)) {
            user.setLevels(Level.LEVEL_THREE);
        }
        return "BVN VERIFIED";
    }


//    public boolean checkIfInfoMatchesForLevelThree (LevelThreeInfo levelThreeInfo, Long id) {
//        User user = authRepository.findById(id).get();
//        return user.getEmail().equals(levelThreeInfo.getEmail()) &&
//                user.getPassword().equals(levelThreeInfo.getPassword()) &&
//                user.getPin().equals(levelThreeInfo.getPin()) &&
//                user.getPhone().equals(levelThreeInfo.getPhone());
//    }
//    public String  checkIfInfoMatchesLevelThree (LevelThreeInfo levelThreeInfo, Long id) {
//        User user = authRepository.findById(id).get();
//        if (checkIfInfoMatchesForLevelThree(levelThreeInfo, id)) {
//            user.setBvn(levelThreeInfo.getBvn());
//        }
//        user.setLevels(Level.LEVEL_THREE);
//        return "BVN Verification successful, You are now on Level";
//    }

}
