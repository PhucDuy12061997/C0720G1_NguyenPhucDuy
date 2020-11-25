//package services;
//
//import model.Mailbox;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.TreeMap;
//
//@Service
//public class Boxmail {
//    private static Map<Integer, Mailbox> emailMap;
//    static {
//        emailMap=new TreeMap<>();
//        emailMap.put(1,new Mailbox("VietNamese","23","enable spam filter","Duy"));
//    }
//    public List<Mailbox> findAllEmail(){
//        List<Mailbox>emailList=new ArrayList<>(emailMap.values());
//        return emailList;
//    }
//
//}