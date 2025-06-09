package ss8_Clean_Code_and_MVC.Vehicle_Management.Model.repository;

import ss8_Clean_Code_and_MVC.Vehicle_Management.Model.entity.XeTai;

public class XeTaiRepository {
    private XeTai[] XeTai = new XeTai[10];
    private int size = 0;
    public void add(XeTai xeTai) {
        XeTai[size++] = xeTai;
        size++;
    }
}
