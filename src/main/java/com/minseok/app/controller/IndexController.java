package com.minseok.app.controller ;


import com.minseok.app.entity.*;
import com.minseok.app.Repository.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    private final PersonRepository personRepository;

    private final SocialMediaRepository socialMediaRepository;

    private final InterestRepository interestRepository;

    private final SkillRepository skillRepository;

    private final WorkRepository workRepository;

    public IndexController(PersonRepository personRepository, SocialMediaRepository socialMediaRepository,
                           InterestRepository interestRepository, SkillRepository skillRepository,
                           WorkRepository workRepository) {
        this.personRepository = personRepository;
        this.socialMediaRepository = socialMediaRepository;
        this.interestRepository = interestRepository;
        this.skillRepository = skillRepository;
        this.workRepository = workRepository;
    }
    @GetMapping("/")
    public String index(Model model) {
        Person person = personRepository.findAll().stream().findFirst().orElse(null);
        model.addAttribute("person", person);
        SocialMedia socialMedia = socialMediaRepository.findAll().stream().findFirst().orElse(null);
        model.addAttribute("socialMedia", socialMedia);
        List<Interests> interests = interestRepository.findAll(); model.addAttribute("interests", interests);
        List<skill> skills = skillRepository.findAll(); model.addAttribute("skills", skills);
        List<work> works = workRepository.findAll(); model.addAttribute("works", works);
        return "resume";
    }
}
