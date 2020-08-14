package io.gate.gateapi;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class GateApiException extends ApiException {

    @SerializedName("label")
    private String errorLabel;

    @SerializedName("message")
    private String errorMessage;

    @SerializedName("detail")
    private String errorDetail;


    public GateApiException() {
    }

    @Override
    public String getMessage() {
        if (this.errorLabel != null && !"".equals(this.errorLabel)) {
            String message = (this.errorMessage != null) ? this.errorMessage : "";
            if (this.errorDetail != null && !"".equals(this.errorDetail)) {
                message = this.errorDetail;
            }
            return String.format("label: %s, message: %s", this.errorLabel, message);
        }
        if (this.getResponseBody() != null && !"".equals(this.getResponseBody())) {
            return this.getResponseBody();
        }
        return super.getMessage();
    }

    public GateApiException(String errorLabel, String errorMessage, String errorDetail) {
        this.errorLabel = errorLabel;
        this.errorMessage = errorMessage;
        this.errorDetail = errorDetail;
    }

    public GateApiException(GateApiException exp, String message, int code, Map<String, List<String>> responseHeaders, String responseBody) {
        super(message, code, responseHeaders, responseBody);
        this.errorLabel = exp.getErrorLabel();
        this.errorMessage = exp.getErrorMessage();
        this.errorDetail = exp.getErrorDetail();
    }

    public String getErrorLabel() {
        return errorLabel;
    }

    public void setErrorLabel(String errorLabel) {
        this.errorLabel = errorLabel;
    }

    @javax.annotation.Nullable
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }
}
