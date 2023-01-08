package com.example.vibecap_back.global.common.response;

import lombok.Getter;

@Getter
public enum BaseResponseStatus {

    /**
     * 1000 : Successed
     */
    SUCCESS(true, 1000, "요청에 성공했습니다."),

    /**
     * 2XXX : Request 내용 오류
     */
    // Common

    // album

    // member
    EMAIL_ALREADY_EXIST(false, 2200, "이미 가입된 이메일 주소입니다."),

    // mypage

    // post

    // vibe

    /**
     * 3XXX : 내부 로직 오류
     */
    // Common

    // album

    // member

    // mypage

    // post

    // vibe

    /**
     * 4XXX : DB 오류
     */
    DBCONN_ERROR(false, 4000, "데이터베이스 연결 오류");

    private final boolean isSuccess;
    private final int code;
    private final String message;

    BaseResponseStatus(boolean isSuccess, int code, String message) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
    }
}
