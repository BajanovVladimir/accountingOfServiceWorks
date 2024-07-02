package ru.bazhanov.equipments.web.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.bazhanov.equipments.dto.ProductDTO;
import ru.bazhanov.equipments.service.interfaces.ProductService;

@Controller
@RequestMapping("/productCreateView")
public class ProductCreateViewController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ModelAndView showProductCreateView(){
        ModelAndView mv = new ModelAndView("equipments/products/productCreateView");
        mv.addObject("product", new ProductDTO());
        return mv;
    }
    @PostMapping
    public ModelAndView saveNewProduct(@ModelAttribute("product") ProductDTO productDTO){
        productService.save(productDTO);
        ModelAndView mv = new ModelAndView("equipments/products/productCreateView");
        mv.addObject("product",new ProductDTO());
        return mv;
    }
}
