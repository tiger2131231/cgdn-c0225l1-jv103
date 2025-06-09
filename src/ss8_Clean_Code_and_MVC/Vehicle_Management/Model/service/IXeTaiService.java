package ss8_Clean_Code_and_MVC.Vehicle_Management.Model.service;

import ss8_Clean_Code_and_MVC.Vehicle_Management.Model.entity.XeTai;

public interface IXeTaiService {
    Void add(XeTai xeTai);
    XeTai[] findAll();
}
