package capstone.code.domain;

import capstone.code.domain.Part;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("1")
public class InhousePart extends Part {
    int partId;

    public InhousePart() {
    }

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }
}
