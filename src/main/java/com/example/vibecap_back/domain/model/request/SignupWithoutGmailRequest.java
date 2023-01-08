package com.example.vibecap_back.domain.model.request;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class SignupWithoutGmailRequest {
    private String email;
    private String password;
    private String nickname;
}
