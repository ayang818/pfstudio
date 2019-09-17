package top.ayang818.pfstudio.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QQAccessTokenDTO {
    private String grantType;
    private String clientId;
    private String clientSecret;
    private String code;
    private String rediect_uri;
}
