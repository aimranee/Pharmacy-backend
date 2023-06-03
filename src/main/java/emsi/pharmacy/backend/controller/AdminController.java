package emsi.pharmacy.backend.controller;

import emsi.pharmacy.backend.entity.Admin;
import emsi.pharmacy.backend.service.impl.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/")
    public List<Admin> findAll() {
        return adminService.findAll();
    }

    @PostMapping("/save")
    public Admin save(@RequestBody Admin admin) {
        return adminService.save(admin);
    }
}
