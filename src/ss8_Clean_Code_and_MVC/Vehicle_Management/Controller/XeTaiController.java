package ss8_Clean_Code_and_MVC.Vehicle_Management.Controller;

import ss8_Clean_Code_and_MVC.Vehicle_Management.Model.entity.XeTai;
import ss8_Clean_Code_and_MVC.Vehicle_Management.Model.service.IXeTaiService;
import ss8_Clean_Code_and_MVC.Vehicle_Management.Model.service.XeTaiService;

public class XeTaiController {
    private IXeTaiService xeTaiService = new XeTaiService();
    public void add(XeTai xeTai) { xeTaiService.add(xeTai); }
}
