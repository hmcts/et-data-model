package uk.gov.hmcts.et.common.model.ccd.items;


public interface TseReplyTypeItem<T> {
    String getDate();
    T getValue();
}