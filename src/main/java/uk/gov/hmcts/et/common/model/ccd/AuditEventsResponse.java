package uk.gov.hmcts.et.common.model.ccd;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;
import java.util.List;

@Data
@Builder
@Jacksonized
public class AuditEventsResponse {
    private final List<AuditEvent> auditEvents;
}