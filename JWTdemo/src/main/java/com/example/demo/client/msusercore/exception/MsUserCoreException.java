package com.example.demo.client.msusercore.exception;


import com.example.demo.exception.MsAuthException;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class MsUserCoreException extends MsAuthException {

    private static final String SYSCODE = "ms-user-core";

    public MsUserCoreException(String message, int errorCode) {
        super(message, errorCode);
    }

    public MsUserCoreException(String message) {
        super(message);
    }

    @Override
    public String getSysCode() {
        return SYSCODE;
    }
}
