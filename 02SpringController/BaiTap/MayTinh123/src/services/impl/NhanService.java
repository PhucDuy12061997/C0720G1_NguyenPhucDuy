package services.impl;

import org.springframework.stereotype.Service;
import services.MayTinh;
@Service
public class NhanService implements MayTinh {
    @Override
    public double mayTinh(double so1, double so2) {
        return so1*so2;
    }
}
