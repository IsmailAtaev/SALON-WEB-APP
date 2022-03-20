package com.salon.controllers;

import com.salon.dao.AppointmentDAO;
import com.salon.models.appointment.Appointment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {

    private final AppointmentDAO appointmentDAO;

    public AppointmentController(AppointmentDAO appointmentDAO) {
        this.appointmentDAO = appointmentDAO;
    }

    @GetMapping()
    public String getAppointment(Model model) {
        model.addAttribute("people", appointmentDAO.getClientsDB());
        model.addAttribute("masters", appointmentDAO.getMastersDB());

        return "/html/appointment/appointment";
    }

    @GetMapping("/new")
    public String newAppointment(Model model) {
        model.addAttribute("ob", new Appointment());
        model.addAttribute("people", appointmentDAO.getClientsDB());
        return "/html/appointment/new";
    }


    @PostMapping()
    public String createAppointment(@ModelAttribute("app") Appointment appointment) {
        System.out.println(appointment.toString());
        return "redirect:/appointment";
    }
}