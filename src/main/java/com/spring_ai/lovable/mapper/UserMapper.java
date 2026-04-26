package com.spring_ai.lovable.mapper;


import com.spring_ai.lovable.dto.auth.SignupRequest;
import com.spring_ai.lovable.dto.auth.UserProfileResponse;
import com.spring_ai.lovable.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(SignupRequest signupRequest);

    UserProfileResponse toUserProfileResponse(User user);
}
