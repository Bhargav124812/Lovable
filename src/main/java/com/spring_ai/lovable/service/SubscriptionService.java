package com.spring_ai.lovable.service;


import com.spring_ai.lovable.dto.subscription.CheckoutRequest;
import com.spring_ai.lovable.dto.subscription.CheckoutResponse;
import com.spring_ai.lovable.dto.subscription.PortalResponse;
import com.spring_ai.lovable.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
