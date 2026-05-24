package com.spring_ai.lovable.mapper;


import com.spring_ai.lovable.dto.subscription.PlanResponse;
import com.spring_ai.lovable.dto.subscription.SubscriptionResponse;
import com.spring_ai.lovable.entity.Plan;
import com.spring_ai.lovable.entity.Subscription;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubscriptionMapper {
    SubscriptionResponse toSubscriptionResponse(Subscription subscription);

    PlanResponse toPlanResponse(Plan plan);
}
