package com.spring_ai.lovable.service.impl;

import com.spring_ai.lovable.dto.subscription.PlanLimitsResponse;
import com.spring_ai.lovable.dto.subscription.UsageTodayResponse;
import com.spring_ai.lovable.service.UsageService;
import org.springframework.stereotype.Service;


@Service
public class UsageServiceImpl implements UsageService {
    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
