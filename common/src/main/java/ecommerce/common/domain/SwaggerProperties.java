package ecommerce.common.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class SwaggerProperties {
    private String apiBasePackage;
    /**
     * enable Security
     */
    private boolean enableSecurity;
    /**
     * Title
     */
    private String title;
    /**
     * description
     */
    private String description;
    /**
     * Version
     */
    private String version;
    /**
     * Contact Name
     */
    private String contactName;
    /**
     * Contact URL
     */
    private String contactUrl;
    /**
     * Contact Email
     */
    private String contactEmail;
}
