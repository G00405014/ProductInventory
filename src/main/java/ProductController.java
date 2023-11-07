import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product){
        ProductService.addProduct(product);
        return"Product added";
    }
}
