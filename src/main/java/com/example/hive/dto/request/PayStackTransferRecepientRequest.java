package com.example.hive.dto.Request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PayStackTransferRecepientRequest {
    String type;
    String name;
    @JsonProperty("account_number")
    String accountNumber;
    @JsonProperty("bank_code")
    String bankCode;
    String currency="NGN";
}
