/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/keranjang")
public class KeranjangController {
    
    @RequestMapping()
    public String keranjangPage(Model model){
        model.addAttribute("msg", "Ini halaman Keranjang");
        
        return "keranjang";
    }
}
