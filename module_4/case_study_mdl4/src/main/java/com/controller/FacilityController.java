package com.controller;

import com.model.dto.FacilityDto;
import com.model.facility.Facility;
import com.model.facility.FacilityType;
import com.model.facility.RentType;
import com.service.facility.IFacilityService;
import com.service.facility.IFacilityTypeService;
import com.service.facility.IRentTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

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
    public String show(Model model, @RequestParam(defaultValue = "") String name,
                       @RequestParam(defaultValue = "") String facilityType,
                       @PageableDefault(size = 5) Pageable pageable) {
        Page<Facility> facilityPage = iFacilityService.searchName(name, facilityType, pageable);
        List<FacilityType> facilityTypes = iFacilityTypeService.findAll();
        List<RentType> rentTypes = iRentTypeService.findAll();

        model.addAttribute("facilityList", facilityPage);
        model.addAttribute("facilityTypes", facilityTypes);
        model.addAttribute("rentTypes", rentTypes);
        return "/facility/list";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(Model model, @PathVariable("id") int id) {
        Facility facility = iFacilityService.findById(id);
        FacilityDto facilityDto = new FacilityDto();
        BeanUtils.copyProperties(facility,facilityDto);
        List<FacilityType> facilityTypes = iFacilityTypeService.findAll();
        List<RentType> rentTypes = iRentTypeService.findAll();

        model.addAttribute("facilityDto", facilityDto);
        model.addAttribute("facilityTypes", facilityTypes);
        model.addAttribute("rentTypes", rentTypes);

        return "facility/edit";
    }

    @PostMapping("/save")
    public String save(Model model, @Validated @ModelAttribute("facilityDto") FacilityDto facilityDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
     if(bindingResult.hasErrors()){
         List<FacilityType> facilityTypes= iFacilityTypeService.findAll();
         List<RentType> rentTypes= iRentTypeService.findAll();
         model.addAttribute("facilityTypes",facilityTypes);
         model.addAttribute("rentTypes",rentTypes);
         return "facility/edit";
     }
     Facility facility = new Facility();
     BeanUtils.copyProperties(facilityDto,facility);
       boolean check = iFacilityService.save(facility);
       String mess = "Bạn đã thao tác thành công!";
       if(!check){
           mess="Thao tac that bai!Bạn hãy check lại dữ liệu đầu vào :(  ";
       }
       redirectAttributes.addFlashAttribute("mess", mess);
        return "redirect:/facility";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("deleteId") int deleteId, RedirectAttributes redirectAttributes) {
        iFacilityService.remove(deleteId);
        redirectAttributes.addFlashAttribute("mess", "Xóa thành công :) !");
        return "redirect:/facility";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        List<FacilityType> facilityTypes = iFacilityTypeService.findAll();
        List<RentType> rentTypes = iRentTypeService.findAll();
        model.addAttribute("facility", new Facility());
        model.addAttribute("facilityTypeList", facilityTypes);
        model.addAttribute("rentTypeList", rentTypes);
        return "/facility/create";
    }
}
