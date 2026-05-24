package com.spring_ai.lovable.service;

import com.spring_ai.lovable.dto.subscription.CheckoutRequest;
import com.spring_ai.lovable.dto.subscription.CheckoutResponse;
import com.spring_ai.lovable.dto.subscription.PortalResponse;
import com.stripe.model.StripeObject;

import java.util.Map;

public interface PaymentProcessor {
    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request);

    PortalResponse openCustomerPortal(Long userId);

    void handleWebhookEvent(String type, StripeObject stripeObject, Map<String, String> metadata);
}
