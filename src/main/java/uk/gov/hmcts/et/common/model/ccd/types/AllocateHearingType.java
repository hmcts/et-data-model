package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.et.common.model.bulk.types.DynamicFixedListType;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class AllocateHearingType {
    @JsonProperty("allocateHearingVenue")
    private DynamicFixedListType allocateHearingVenue;
    @JsonProperty("allocateHearingRoom")
    private DynamicFixedListType allocateHearingRoom;
    @JsonProperty("allocateHearingClerk")
    private DynamicFixedListType allocateHearingClerk;
    @JsonProperty("allocateHearingSitAlone")
    private String allocateHearingSitAlone;
    @JsonProperty("allocateHearingJudge")
    private DynamicFixedListType allocateHearingJudge;
    @JsonProperty("allocateHearingEmployerMember")
    private DynamicFixedListType allocateHearingEmployerMember;
    @JsonProperty("allocateHearingEmployeeMember")
    private DynamicFixedListType allocateHearingEmployeeMember;
    @JsonProperty("allocateHearingPostponedBy")
    private String allocateHearingPostponedBy;
    @JsonProperty("allocateHearingStatus")
    private String allocateHearingStatus;

    public boolean hasAllocateHearingEmployerMember() {
        return allocateHearingEmployerMember != null && allocateHearingEmployerMember.getValue() != null;
    }

    public boolean hasAllocateHearingEmployeeMember() {
        return allocateHearingEmployeeMember != null && allocateHearingEmployeeMember.getValue() != null;
    }

}
