/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi;

import com.valensi.model.Product;
import com.valensi.service.BarangService;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shoppingCart")
public class MyCart {
    @Autowired
    BarangService service;
    
    @RequestMapping()
    public String myCart(HttpSession session, Model model){
        List<Product> listCart = (List<Product>) session.getAttribute("cart");
        
        model.addAttribute("listcart", listCart);

        return "shoopingCart";
    }
        
    
}
