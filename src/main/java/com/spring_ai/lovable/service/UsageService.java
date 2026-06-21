package com.spring_ai.lovable.service;


import com.spring_ai.lovable.dto.subscription.PlanLimitsResponse;
import com.spring_ai.lovable.dto.subscription.UsageTodayResponse;

public interface UsageService {
     void recordTokenUsage(Long userId,int actualTokens);

    void checkDailyTokensUsage();
}
