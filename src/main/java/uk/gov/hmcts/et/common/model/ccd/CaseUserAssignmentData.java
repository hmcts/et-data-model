package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CaseUserAssignmentData {
    @JsonProperty("case_users")
    private List<CaseUserAssignment> caseUserAssignments;
}
