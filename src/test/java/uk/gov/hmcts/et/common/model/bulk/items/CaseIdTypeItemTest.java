package uk.gov.hmcts.et.common.model.bulk.items;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CaseIdTypeItemTest {

    @Test
    void shouldCreateCaseIdTypeItem() {
        var ethosCaseReference = "2500001/2021";
        var caseIdTypeItem = CaseIdTypeItem.from(ethosCaseReference);

        assertEquals(ethosCaseReference, caseIdTypeItem.getValue().getEthosCaseReference());
        assertNotNull(caseIdTypeItem.getId());
    }
}
