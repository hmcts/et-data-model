package uk.gov.hmcts.et.common.model.ccd.items;

import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import uk.gov.hmcts.et.common.model.ccd.types.DocumentType;
import uk.gov.hmcts.et.common.model.ccd.types.UploadedDocumentType;

@SuperBuilder
@NoArgsConstructor
public class DocumentTypeItem extends TypeItem<DocumentType> {
    public static DocumentTypeItem fromTypeItem(TypeItem<DocumentType> item) {
        var documentTypeItem = new DocumentTypeItem();
        documentTypeItem.setId(item.getId());
        documentTypeItem.setValue(item.getValue());
        return documentTypeItem;
    }

    public static DocumentTypeItem fromUploadedDocument(UploadedDocumentType uploadedDocumentType) {
        return fromTypeItem(TypeItem.from(DocumentType.from(uploadedDocumentType)));
    }

    @Override public String toString() {
        return super.toString();
    }
}
