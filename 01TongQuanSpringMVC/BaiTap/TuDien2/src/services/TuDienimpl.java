package services;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.TreeMap;

@Service
public class TuDienimpl implements TuDien {
//    String[] tiengAnh = {"people", "history", "world", "information", "family", "computer", "music"};
//    String[] vietnam = {"người", "lịch sử", "thế giới", "thông tin", "gia đình", "máy tính", "âm nhạc"};
    @Override
    public String tudien(String input) {
        String temp =null;
        Map< String,String > tuDien=new TreeMap<>();
        tuDien.put("people","người");
        tuDien.put("history","lịch sử");
        tuDien.put("world","thế giới");
        tuDien.put("information","thông tin");
        tuDien.put("family","gia đình");

        for (Map.Entry<String , String> entry : tuDien.entrySet()){
            if (input.equals(entry.getKey())){
                 temp = " tu ban can tim la " + tuDien.get(input);
                 break;
            }
            else temp= " khong co tu nay trong tu dien";
        }
        return temp  ;
    }
}
