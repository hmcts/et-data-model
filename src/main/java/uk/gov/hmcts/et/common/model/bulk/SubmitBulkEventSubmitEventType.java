package uk.gov.hmcts.et.common.model.bulk;

import lombok.Data;
import uk.gov.hmcts.et.common.model.ccd.SubmitEvent;

import java.util.List;

@Data
public class SubmitBulkEventSubmitEventType {

    private SubmitEvent submitEvent;

    private SubmitBulkEvent submitBulkEvent;

    private BulkDetails bulkDetails;

    private List<SubmitEvent> submitEventList;

    private SubmitBulkEvent submitBulkEventToUpdate;

    private List<String> errors;
}
