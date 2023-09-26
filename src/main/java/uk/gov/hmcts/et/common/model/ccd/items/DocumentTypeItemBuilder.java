package uk.gov.hmcts.et.common.model.ccd.items;

import uk.gov.hmcts.et.common.model.ccd.types.DocumentType;

public class DocumentTypeItemBuilder {
    String id;
    DocumentType value;

    public DocumentTypeItemBuilder() {
    }

    public DocumentTypeItemBuilder id(String id) {
        this.id = id;
        return this;
    }

    public DocumentTypeItemBuilder value(DocumentType value) {
        this.value = value;
        return this;
    }

    public DocumentTypeItem build() {
        DocumentTypeItem value = new DocumentTypeItem();
        value.setId(this.id);
        value.setValue(this.value);
        return value;
    }
}
