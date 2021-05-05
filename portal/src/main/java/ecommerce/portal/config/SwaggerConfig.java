package ecommerce.portal.config;

import ecommerce.common.config.BaseSwaggerConfig;
import ecommerce.common.domain.SwaggerProperties;

public class SwaggerConfig extends BaseSwaggerConfig {
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("ecommerce.portal.controller;")
                .title("Ecommerce  front desk system")
                .description("Ecommerce Demo front-end related interface documents")
                .contactName("macro")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
