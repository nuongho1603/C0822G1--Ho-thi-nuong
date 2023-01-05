package com.controller;

import com.model.contract.AttachFacility;
import com.model.contract.Contract;
import com.model.contract.ContractDetail;
import com.model.customer.Customer;
import com.model.dto.ContracDto;
import com.model.facility.Facility;
import com.service.contract.IAttractFacilityService;
import com.service.contract.IContractDetailService;
import com.service.contract.IContractService;
import com.service.customer.ICustomerService;
import com.service.facility.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private IContractService iContractService;
    @Autowired
    private ICustomerService iCustomerService;
    @Autowired
    private IFacilityService iFacilityService;
    @Autowired
    private IAttractFacilityService iAttractFacilityService;
    @Autowired
    private IContractDetailService iContractDetailService;

    @GetMapping("")
    public String showList(Model model, @PageableDefault(size = 5) Pageable pageable) {

        Page<ContracDto> contractPage = iContractService.showList(pageable);
//        List<Contract> contractList = iContractService.findAll();
        List<ContractDetail> contractDetailLists = iContractDetailService.findAll();
        List<AttachFacility> attachFacilities = iAttractFacilityService.findAll();

        List<Facility> facilityList = iFacilityService.findAll();
        List<Customer> customerList = iCustomerService.findAll();

        model.addAttribute("contractList", contractPage);
        model.addAttribute("contractDetailLists", contractDetailLists);
        model.addAttribute("attachFacilities", attachFacilities);

        model.addAttribute("facilityList", facilityList);
        model.addAttribute("customerList", customerList);

        return "/contract/list";
    }

    @PostMapping("create")
    public String create(Model model, @PageableDefault(size = 5) Pageable pageable, RedirectAttributes redirectAttributes) {

        return "redirect:/contract";
    }
}
