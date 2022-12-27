package com.controller;

import com.model.customer.Customer;
import com.model.customer.CustomerType;
import com.model.facility.Facility;
import com.model.facility.FacilityType;
import com.model.facility.RentType;
import com.service.facility.IFacilityService;
import com.service.facility.IFacilityTypeService;
import com.service.facility.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/facility")
public class FacilityController {
    @Autowired
  private IFacilityService iFacilityService;
    @Autowired
    private IFacilityTypeService iFacilityTypeService;
    @Autowired
    private IRentTypeService iRentTypeService;
    @RequestMapping("")
    public String show(Model model) {
        List<Facility> facilityList = iFacilityService.findAll();
        model.addAttribute("facilityList", facilityList);
        return "/facility/list";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(Model model, @PathVariable("id") int id) {
        List<FacilityType> facilityTypes = iFacilityTypeService.findAll();
        List<RentType> rentTypes = iRentTypeService.findAll();
        model.addAttribute("facilityTypes", facilityTypes);
        model.addAttribute("rentTypes", rentTypes);
        Optional<Facility> facility = iFacilityService.findById(id);
        model.addAttribute("facility", facility);
        return "/facility/edit";
    }

    @PostMapping("/save")
    public String save(Model model, @ModelAttribute("facility") Facility facility, RedirectAttributes redirectAttributes) {
        iFacilityService.save(facility);
        redirectAttributes.addAttribute("mess", "Bạn đã thao tác thành công! ");
        return "redirect:/facility";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        List<FacilityType> facilityTypes = iFacilityTypeService.findAll();
        List<RentType> rentTypes = iRentTypeService.findAll();
        model.addAttribute("facility", new Facility());
        model.addAttribute("facilityTypes", facilityTypes);
        model.addAttribute("rentTypes", rentTypes);
        return "/facility/create";
    }
}
