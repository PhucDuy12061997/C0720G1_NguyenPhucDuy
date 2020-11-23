package services;

import org.springframework.stereotype.Service;

@Service
public class ChuyenDoiServiceimpl implements ChuyenDoiService {
    @Override
    public Double chuyendoi(double usa) {
        double ketqua = 23000 * usa;
        return ketqua;
    }
}
