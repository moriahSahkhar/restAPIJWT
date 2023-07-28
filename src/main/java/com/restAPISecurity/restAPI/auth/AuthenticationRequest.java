package com.restAPISecurity.restAPI.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
public record AuthenticationRequest(String email,String password) {
}
