package service.impl;

import org.springframework.stereotype.Service;
import service.Nhan2So;

@Service
public class NhanServiceimpl implements Nhan2So {
    @Override
    public int nhan(int a, int b) {
        return a*b;
    }
}
