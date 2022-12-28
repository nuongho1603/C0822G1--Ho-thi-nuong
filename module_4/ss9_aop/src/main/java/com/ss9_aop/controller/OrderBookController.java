package com.ss9_aop.controller;

import com.ss9_aop.model.History;
import com.ss9_aop.model.Library;
import com.ss9_aop.repository.IHistoryRepository;
import com.ss9_aop.repository.IOrderRepository;
import com.ss9_aop.service.IHistoryService;
import com.ss9_aop.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.rmi.MarshalledObject;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/library")
public class OrderBookController {
    @Autowired
    private IOrderService iOrderService;
    @Autowired
    private IHistoryService iHistoryService;
    private Object Library;

    @RequestMapping("")
    public String showLibrary(Model model) {
        List<Library> libraryList = iOrderService.findAll();
        model.addAttribute("libraryList", libraryList);
        return "library";
    }

    @GetMapping("/order/{id}")
    public String showOrder(Model model, @PathVariable("id") int id) {
        Library library = iOrderService.findId(id);
        model.addAttribute("library", library);
        return "order";
    }

    @PostMapping("/order")
    public String order(Model model, @RequestParam Integer id, RedirectAttributes redirectAttributes) {
        int bookCode = (int) (Math.random() * (99999 - 10000) + 10000);
        Library library = iOrderService.findId(id);

        History history = new History(bookCode, library);
        iHistoryService.save(history);

        library.setQuantity(library.getQuantity() - 1);
        iOrderService.save(library);

        redirectAttributes.addFlashAttribute("mess", "Order thánh công! " + bookCode);
        return "redirect:/library";

    }

    @GetMapping("/return")
    public String returnBook(@RequestParam int bookCode, RedirectAttributes redirectAttributes) {
        History history = iHistoryService.findBookCode(bookCode);
        iHistoryService.save(history);

        Library library = history.getLibrary();
        library.setQuantity(library.getQuantity() + 1);
        iOrderService.save(library);


        redirectAttributes.addFlashAttribute("mess", "Return book successful! Thank you!");
        return "redirect:";
    }
}
