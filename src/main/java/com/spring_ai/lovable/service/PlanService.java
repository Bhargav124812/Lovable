package com.spring_ai.lovable.service;



import com.spring_ai.lovable.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {
     List<PlanResponse> getAllActivePlans();
}
