package ${{ values.groupId }}.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "${{values.domainNameLc}}s")
public class ${{ values.domainName }} {
    @Id
    private Long id;
}