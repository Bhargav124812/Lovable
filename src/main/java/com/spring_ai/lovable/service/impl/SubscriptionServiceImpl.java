package com.spring_ai.lovable.service.impl;

import com.spring_ai.lovable.dto.subscription.CheckoutRequest;
import com.spring_ai.lovable.dto.subscription.CheckoutResponse;
import com.spring_ai.lovable.dto.subscription.PortalResponse;
import com.spring_ai.lovable.dto.subscription.SubscriptionResponse;
import com.spring_ai.lovable.service.SubscriptionService;
import org.springframework.stereotype.Service;


@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

}
