package com.example.demo.client.msusercore.exception;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class MsUserCoreExceptionDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {
        StringBuilder stringBuilder;
        String smsResponse = StringUtils.EMPTY;

        try {
            Response.Body body = response.body();
            if (body == null) {
                return new MsUserCoreException();
            }
            InputStream bodyStream = body.asInputStream();
            Charset charset = StandardCharsets.UTF_8;
            stringBuilder = new StringBuilder();
            String line;

            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bodyStream, charset))) {
                while ((line = bufferedReader.readLine()) != null) {
                    stringBuilder.append(line);
                }
            }

            smsResponse = new ObjectMapper().readValue(stringBuilder.toString(), String.class);
        } catch (IOException e) {
            return new MsUserCoreException(smsResponse);
        }
        return new MsUserCoreException(smsResponse);
    }

}
