package com.controller;

import com.model.contract.AttachFacility;
import com.model.contract.Contract;
import com.model.contract.ContractDetail;
import com.model.customer.Customer;
import com.model.dto.IContractDto;
import com.model.facility.Facility;
import com.repository.IEmployeeRepository;
import com.service.contract.IAttractFacilityService;
import com.service.contract.IContractDetailService;
import com.service.contract.IContractService;
import com.service.customer.ICustomerService;
import com.service.employee.IEmployeeService;
import com.service.facility.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

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
    private IEmployeeService iEmployeeService;
    @Autowired
    private IAttractFacilityService iAttractFacilityService;
    @Autowired
    private IContractDetailService iContractDetailService;

    @GetMapping("")
    public String showList(Model model, @PageableDefault(size = 5) Pageable pageable) {
        Page<IContractDto> contractDtoPage = iContractService.showList(pageable);
        model.addAttribute("contractList", contractDtoPage);
        model.addAttribute("contractDetail", new ContractDetail());
        model.addAttribute("contract", new Contract());
        model.addAttribute("attachFacilities", iAttractFacilityService.findAll());
        model.addAttribute("customerList", iCustomerService.findAll());
        model.addAttribute("facilityList", iFacilityService.findAll());
        model.addAttribute("employeeList", iEmployeeService.findAll());
        return "contract/list";
    }

    @PostMapping("/create")
    public String createContract(Model model, @ModelAttribute("contract") Contract contract, @PageableDefault(size = 5) Pageable pageable, RedirectAttributes redirectAttributes) {
        iContractService.add(contract);
        redirectAttributes.addFlashAttribute("mess", "ADD thành công rùi đó bạn à! ");
        return "redirect:/contract";
    }

    @PostMapping("/createContractDetail")
    public String create(Model model, @ModelAttribute("contractDetail") ContractDetail contractDetail, @PageableDefault(size = 5) Pageable pageable, RedirectAttributes redirectAttributes) {

        AttachFacility attachFacility = iAttractFacilityService.findById(contractDetail.getFacilitySet().getId());
        contractDetail.setFacilitySet(attachFacility);
        iContractDetailService.addContractDetail(contractDetail);
        redirectAttributes.addFlashAttribute("mess", "ADD thành công rùi đó bạn à! ");
        return "redirect:/contract";
    }
//
//    @GetMapping ("/lised")
//    public String listed(Model model){
//        return "contract/list";
//    }
}
