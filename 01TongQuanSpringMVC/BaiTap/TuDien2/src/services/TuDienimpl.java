package services;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.TreeMap;

@Service
public class TuDienimpl implements TuDien {
//    String[] tiengAnh = {"people", "history", "world", "information", "family", "computer", "music"};
//    String[] vietnam = {"người", "lịch sử", "thế giới", "thông tin", "gia đình", "máy tính", "âm nhạc"};

    private static Map<String, String> tuDien;

    static {
        tuDien = new TreeMap<>();
        tuDien.put("people", "người");
        tuDien.put("history", "lịch sử");
        tuDien.put("world", "thế giới");
        tuDien.put("information", "thông tin");
        tuDien.put("family", "gia đình");

    }

    @Override
    public String tudien(String input) {

        return input + " nghia la " +  tuDien.get(input);
    }
}
