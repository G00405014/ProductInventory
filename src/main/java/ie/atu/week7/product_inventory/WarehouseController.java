package ie.atu.week7.product_inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class WarehouseController {
    private WarehouseService warehouseService;

    @Autowired
    public void setWarehouseService(WarehouseService warehouseService){
        this.warehouseService = warehouseService;
    }
    @GetMapping("/getWarehouseByld")
    publicList<Warehouse>getWarehouseByld(){
        return WarehouseService.getWarehouseByld;
    }
}