package com.example.webshopjpa.Comtroller;

import com.example.webshopjpa.Model.Product;
import com.example.webshopjpa.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ProductController {

@Autowired
 ProductService productService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("productList", productService.see());

        return "index";
    }

    @GetMapping("/Create")
    public String create(){

        return "Create";
    }

    @PostMapping("/Create")
    public String create (@ModelAttribute Product product){
        productService.create(product);
        return "redirect:/";
    }

    @GetMapping("/Delete/{productid}")
    public String delete(@PathVariable("productid") int id){
        productService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/Update/{productid}")
    public String findProduct(@PathVariable ("productid") int id, Model model){
        model.addAttribute("productList", productService.findProduct(id));
        return "Update";
    }

    @PostMapping("/Update")
    public String update(@ModelAttribute Product product){
        productService.update(product);
        return "redirect:/";
    }



}
