package com.example.springcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    // ================= LANDING PAGE =================
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // ================= AUTH LOGIN (Single login for all roles) =================
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    // ================= PATIENT DASHBOARD =================
    @GetMapping("/patient/dashboard")
    public String patientDashboard(Model model) {
        model.addAttribute("pageTitle", "Patient Dashboard");
        model.addAttribute("activeTab", "dashboard");
        return "patients/patient-dashboard";
    }

    // ================= DOCTOR DASHBOARD =================
    @GetMapping("/doctor/dashboard")
    public String doctorDashboard(Model model) {
        model.addAttribute("pageTitle", "Doctor Dashboard");
        model.addAttribute("activeTab", "dashboard");
        return "doctor/doctor-dashboard";
    }

    // ================= ADMIN PANEL ROUTES =================
    @GetMapping("/admin")
    public String adminDashboard() {
        return "admin/dashboard";
    }

    @GetMapping("/admin/patients")
    public String adminPatients(Model model) {
        model.addAttribute("pageTitle", "Patient Management");
        model.addAttribute("activeTab", "patients");
        return "admin/patients";
    }

    @GetMapping("/admin/doctors")
    public String adminDoctors(Model model) {
        model.addAttribute("pageTitle", "Doctor Management");
        model.addAttribute("activeTab", "doctors");
        return "admin/doctors";
    }

    @GetMapping("/admin/clinics")
    public String adminClinics(Model model) {
        model.addAttribute("pageTitle", "Clinic Management");
        model.addAttribute("activeTab", "clinics");
        return "admin/clinics";
    }

    @GetMapping("/admin/medicines")
    public String adminMedicines(Model model) {
        model.addAttribute("pageTitle", "Medicines Management");
        model.addAttribute("activeTab", "medicines");
        return "admin/medicines";
    }

    @GetMapping("/admin/tests")
    public String adminTests(Model model) {
        model.addAttribute("pageTitle", "Tests Management");
        model.addAttribute("activeTab", "tests");
        return "admin/tests";
    }

    @GetMapping("/admin/profile")
    public String adminProfile(Model model) {
        model.addAttribute("pageTitle", "Admin Profile");
        model.addAttribute("activeTab", "profile");
        return "admin/profile";
    }

}