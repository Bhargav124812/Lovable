package com.spring_ai.lovable.service.impl;

import com.spring_ai.lovable.dto.subscription.PlanResponse;
import com.spring_ai.lovable.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
