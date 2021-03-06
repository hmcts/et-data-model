package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaginatedSearchMetadata {

    private Integer totalResultsCount;
    private Integer totalPagesCount;

    public void setTotalResultsCount(Integer totalResultsCount) {
        this.totalResultsCount = totalResultsCount;
    }

    @JsonProperty("total_results_count")
    public Integer getTotalResultsCount() {
        return totalResultsCount;
    }

    public void setTotalPagesCount(Integer totalPagesCount) {
        this.totalPagesCount = totalPagesCount;
    }

    @JsonProperty("total_pages_count")
    public Integer getTotalPagesCount() {
        return totalPagesCount;
    }
}
