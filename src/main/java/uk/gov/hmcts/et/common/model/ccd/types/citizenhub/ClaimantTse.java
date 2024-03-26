package uk.gov.hmcts.et.common.model.ccd.types.citizenhub;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.et.common.model.ccd.types.UploadedDocumentType;

import java.util.AbstractMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ClaimantTse {

    @JsonProperty("contactApplicationType")
    private String contactApplicationType;
    @JsonProperty("contactApplicationText")
    private String contactApplicationText;
    @JsonProperty("contactApplicationFile")
    private UploadedDocumentType contactApplicationFile;
    @JsonProperty("copyToOtherPartyYesOrNo")
    private String copyToOtherPartyYesOrNo;
    @JsonProperty("copyToOtherPartyText")
    private String copyToOtherPartyText;
    @JsonProperty("storedApplicationId")
    private String storedApplicationId;

    public static final Map<String, String> APP_TYPE_MAP = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("withdraw", "Withdraw all/part of claim"),
            new AbstractMap.SimpleEntry<>("change-details", "Change my personal details"),
            new AbstractMap.SimpleEntry<>("postpone", "Postpone a hearing"),
            new AbstractMap.SimpleEntry<>("vary", "Vary/revoke an order"),
            new AbstractMap.SimpleEntry<>("reconsider-decision", "Consider a decision afresh"),
            new AbstractMap.SimpleEntry<>("amend", "Amend my claim"),
            new AbstractMap.SimpleEntry<>("respondent", "Order respondent to do something"),
            new AbstractMap.SimpleEntry<>("witness", "Order a witness to attend"),
            new AbstractMap.SimpleEntry<>("non-compliance", "Tell tribunal respondent not complied"),
            new AbstractMap.SimpleEntry<>("publicity", "Restrict publicity"),
            new AbstractMap.SimpleEntry<>("strike", "Strike out all/part of response"),
            new AbstractMap.SimpleEntry<>("reconsider-judgement", "Reconsider judgement"),
            new AbstractMap.SimpleEntry<>("other", "Contact about something else")
    );

    public static final Map<String, String> CY_APP_TYPE_MAP = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("withdraw", "Wynnu’r cyfan/rhan o’r hawliad yn ôl"),
            new AbstractMap.SimpleEntry<>("change-details", "Newid manylion personol"),
            new AbstractMap.SimpleEntry<>("postpone", "Gohirio gwrandawiad"),
            new AbstractMap.SimpleEntry<>("vary", "Amrywio neu ddiddymu gorchymyn"),
            new AbstractMap.SimpleEntry<>("reconsider-decision", "Ystyried penderfyniad o’r newydd"),
            new AbstractMap.SimpleEntry<>("amend", "Diwygio fy hawliad"),
            new AbstractMap.SimpleEntry<>("respondent", "Gorchymyn i’r atebydd wneud rhywbeth"),
            new AbstractMap.SimpleEntry<>("witness", "Gorchymyn i dyst ddod i wrandawiad"),
            new AbstractMap.SimpleEntry<>("non-compliance", "Dweud wrth y tribiwnlys na fu cydymffurfio"),
            new AbstractMap.SimpleEntry<>("publicity", "Cyfyngu ar gyhoeddusrwydd"),
            new AbstractMap.SimpleEntry<>("strike", "Dileu’r ymateb cyfan neu ran o’r ymateb"),
            new AbstractMap.SimpleEntry<>("reconsider-judgement", "Ailystyried dyfarniad"),
            new AbstractMap.SimpleEntry<>("other", "Cysylltu ynghylch rhywbeth arall")
    );

    public static final Map<String, String> CY_RESPONDENT_APP_TYPE_MAP = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("Change personal details", "Newid manylion personol"),
            new AbstractMap.SimpleEntry<>("Postpone a hearing", "Gohirio gwrandawiad"),
            new AbstractMap.SimpleEntry<>("Vary or revoke an order", "Amrywio neu ddiddymu gorchymyn"),
            new AbstractMap.SimpleEntry<>("Consider a decision afresh", "Ystyried penderfyniad o’r newydd"),
            new AbstractMap.SimpleEntry<>("Amend response", "Diwygio fy hawliad"),
            new AbstractMap.SimpleEntry<>("Order other party", "Orchymyn i’r parti arall"),
            new AbstractMap.SimpleEntry<>(
                    "Order a witness to attend", "Gorchymyn i dyst ddod i wrandawiad"),
            new AbstractMap.SimpleEntry<>(
                    "Claimant not complied", "Ddweud wrth y tribiwnlys nad yw’r atebydd wedi cydymffurfio"),
            new AbstractMap.SimpleEntry<>("Restrict publicity", "Cyfyngu ar gyhoeddusrwydd"),
            new AbstractMap.SimpleEntry<>(
                    "Strike out all or part of a claim", "Dileu’r ymateb cyfan neu ran o’r ymateb"),
            new AbstractMap.SimpleEntry<>("Reconsider judgement", "Ailystyried dyfarniad"),
            new AbstractMap.SimpleEntry<>("Contact the tribunal", "Gysylltu â’r tribiwnlys")
    );

    public static final Map<String, String> CY_RESPONDING_TO_APP_TYPE_MAP = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("Change my personal details", "Newid manylion personol"),
            new AbstractMap.SimpleEntry<>("Postpone a hearing", "Gohirio gwrandawiad"),
            new AbstractMap.SimpleEntry<>("Vary/revoke an order", "Amrywio/ddiddymu gorchymyn"),
            new AbstractMap.SimpleEntry<>("Consider a decision afresh", "Ystyried penderfyniad o’r newydd"),
            new AbstractMap.SimpleEntry<>("Amend my claim", "Diwygio fy hawliad"),
            new AbstractMap.SimpleEntry<>("Order respondent to do something", "Gorchymyn i’r atebydd wneud rhywbeth"),
            new AbstractMap.SimpleEntry<>(
                    "Order a witness to attend", "Gorchymyn i dyst ddod i wrandawiad"),
            new AbstractMap.SimpleEntry<>(
                    "Tell tribunal respondent not complied", "Dweud wrth y tribiwnlys na fu cydymffurfio"),
            new AbstractMap.SimpleEntry<>("Restrict publicity", "Cyfyngu ar gyhoeddusrwydd"),
            new AbstractMap.SimpleEntry<>(
                    "Strike out all/part of response", "Dileu’r ymateb cyfan neu ran o’r ymateb"),
            new AbstractMap.SimpleEntry<>("Reconsider judgement", "Ailystyried dyfarniad"),
            new AbstractMap.SimpleEntry<>("Contact the tribunal", "Gysylltu â’r tribiwnlys"),
            new AbstractMap.SimpleEntry<>("Withdraw all/part of claim", "Tynnu’r cyfan/rhan o’r hawliad yn ôl")
    );

    public static final Map<String, String> CY_MONTHS_MAP = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("January", "Ionawr"),
            new AbstractMap.SimpleEntry<>("February", "Chwefror"),
            new AbstractMap.SimpleEntry<>("March", "Mawrth"),
            new AbstractMap.SimpleEntry<>("April", "Ebrill"),
            new AbstractMap.SimpleEntry<>("May", "Mai"),
            new AbstractMap.SimpleEntry<>("June", "Mehefin"),
            new AbstractMap.SimpleEntry<>("July", "Gorffennaf"),
            new AbstractMap.SimpleEntry<>("August", "Awst"),
            new AbstractMap.SimpleEntry<>("September", "Medi"),
            new AbstractMap.SimpleEntry<>("October", "Hydref"),
            new AbstractMap.SimpleEntry<>("November", "Tachwedd"),
            new AbstractMap.SimpleEntry<>("December", "Rhagfyr")
            );

    public static final Map<String, String> CY_ABBREVIATED_MONTHS_MAP = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("Jan", "Ion"),
            new AbstractMap.SimpleEntry<>("Feb", "Chwe"),
            new AbstractMap.SimpleEntry<>("Mar", "Maw"),
            new AbstractMap.SimpleEntry<>("Apr", "Ebr"),
            new AbstractMap.SimpleEntry<>("May", "Mai"),
            new AbstractMap.SimpleEntry<>("Jun", "Meh"),
            new AbstractMap.SimpleEntry<>("Jul", "Gor"),
            new AbstractMap.SimpleEntry<>("Aug", "Aws"),
            new AbstractMap.SimpleEntry<>("Sep", "Med"),
            new AbstractMap.SimpleEntry<>("Oct", "Hyd"),
            new AbstractMap.SimpleEntry<>("Nov", "Tach"),
            new AbstractMap.SimpleEntry<>("Dec", "Rhag")
    );
}
