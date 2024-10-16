package org.example.userauthenticationservice_sept2024.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.userauthenticationservice_sept2024.models.RequestStatus;

@Setter
@Getter
public class LoginResponseDto {
    private String token;
    private RequestStatus requestStatus;
}
