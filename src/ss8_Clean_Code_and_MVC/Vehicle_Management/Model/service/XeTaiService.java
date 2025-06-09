package ss8_Clean_Code_and_MVC.Vehicle_Management.Model.service;


import ss8_Clean_Code_and_MVC.Vehicle_Management.Model.entity.XeTai;
import ss8_Clean_Code_and_MVC.Vehicle_Management.Model.repository.XeTaiRepository;

public class XeTaiService implements IXeTaiService {
    private XeTaiRepository xetaiRepository = new XeTaiRepository();

    @Override
    public Void add(XeTai xeTai) {
        return null;
    }

    @Override
    public XeTai[] findAll() {
        return new XeTai[0];
    }
}
