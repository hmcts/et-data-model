package uk.gov.hmcts.et.common.model.ccd.items;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import uk.gov.hmcts.et.common.model.ccd.types.DocumentType;
import uk.gov.hmcts.et.common.model.ccd.types.UploadedDocumentType;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Data
@NoArgsConstructor
public class DocumentTypeItem extends GenericTypeItem<DocumentType> {
    public static DocumentTypeItem fromTypeItem(GenericTypeItem<DocumentType> item) {
        var documentTypeItem = new DocumentTypeItem();
        documentTypeItem.setId(item.getId());
        documentTypeItem.setValue(item.getValue());
        return documentTypeItem;
    }

    public static DocumentTypeItem fromUploadedDocument(UploadedDocumentType uploadedDocumentType) {
        return fromTypeItem(GenericTypeItem.from(DocumentType.from(uploadedDocumentType)));
    }
}
