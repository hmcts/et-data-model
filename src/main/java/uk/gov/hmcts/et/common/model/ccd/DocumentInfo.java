package uk.gov.hmcts.et.common.model.ccd;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DocumentInfo {

    private String type;
    private String description;
    private String url;
    private String markUp;
}
