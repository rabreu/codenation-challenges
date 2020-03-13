package com.challenge.endpoints;

import com.challenge.entity.Candidate;
import com.challenge.service.impl.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;


    @GetMapping("")
    public List<Candidate> findAll() {
        return candidateService.findAll();
    }

    @GetMapping("/{userId}/{accelerationId}/{companyId}")
    public Optional<Candidate> findById(@PathVariable(value = "userId") Long userId, @PathVariable(value = "companyId") Long companyId, @PathVariable(value = "accelerationId") Long accelerationId) {
        return candidateService.findById(userId, companyId, accelerationId);
    }

    @GetMapping(params = "companyId")
    public List<Candidate> findByCompanyId(@RequestParam Long companyId) {
        return candidateService.findByCompanyId(companyId);
    }

    @GetMapping(params = "accelerationId")
    public List<Candidate> findByAccelerationId(@RequestParam Long accelerationId) {
        return candidateService.findByAccelerationId(accelerationId);
    }
}