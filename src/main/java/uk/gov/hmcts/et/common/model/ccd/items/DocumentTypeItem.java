package uk.gov.hmcts.et.common.model.ccd.items;

import uk.gov.hmcts.et.common.model.ccd.types.DocumentType;
import uk.gov.hmcts.et.common.model.ccd.types.UploadedDocumentType;

public class DocumentTypeItem extends Item<DocumentType> {
    public static DocumentTypeItem fromTypeItem(GenericTypeItem<DocumentType> item) {
        var documentTypeItem = new DocumentTypeItem();
        documentTypeItem.setId(item.getId());
        documentTypeItem.setValue(item.getValue());
        return documentTypeItem;
    }

    public static DocumentTypeItem fromUploadedDocument(UploadedDocumentType uploadedDocumentType) {
        return fromTypeItem(GenericTypeItem.from(DocumentType.from(uploadedDocumentType)));
    }

    public static DocumentTypeItemBuilder builder() {
        return new DocumentTypeItemBuilder();
    }

    @Override public String toString() {
        return super.toString();
    }
}

