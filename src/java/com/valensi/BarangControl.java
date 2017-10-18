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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/barang")
public class BarangControl {
    
    @Autowired
    BarangService bs;
    List<Product> keranjang = new ArrayList<>();
    @RequestMapping(value = "/all")
    public String barangPage(HttpSession session){
        List<Product> brg = bs.findAll();
        session.setAttribute("brg", brg);
        session.setAttribute("cart", keranjang);
        
        return "barang";
    }
    
    @RequestMapping(value = "/{id}")
    public String getDetail(@PathVariable Long id,HttpSession session){
        Product p = bs.findById(id);
        session.setAttribute("prddet", p);
       return "detailbarang";
    }
    @RequestMapping(value="/addToCart")
    public String addToCart (HttpSession session){
        List<Product> item = (List<Product>) session.getAttribute("cart");
        item.add((Product) session.getAttribute("prddet"));
        session.removeAttribute("prddet");
        
        return "cart";
    }
}
