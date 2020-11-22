package service.impl;

import org.springframework.stereotype.Service;

@Service
public class Dichimpl implements DichService {
    String[] tiengAnh = {"people", "history", "world", "information", "family", "computer", "music"};
    String[] vietnam = {"người", "lịch sử", "thế giới", "thông tin", "gia đình", "máy tính", "âm nhạc"};


    @Override
    public String dich(String english) {
        if (english.equals("")) {
            return "Hãy nhập từ cần tìm";
        }
        for (int i = 0; i <= tiengAnh.length; i++) {
            if (tiengAnh[i].equals(english)) {
                return english + " có nghĩa là :" + vietnam[i];
            }
            return "Từ bạn cần tìm ko có trong từ điển ";
        }
        return "";
    }
}
