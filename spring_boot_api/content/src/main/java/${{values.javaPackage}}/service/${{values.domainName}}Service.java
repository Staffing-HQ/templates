package ${{ values.groupId }}.service;

import ${{ values.groupId }}.entity.${{ values.domainName }};
import ${{ values.groupId }}.repository.${{ values.domainName }}Repository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ${{values.domainName}}Service {
    private final ${{values.domainName}}Repository ${{values.domainNameLc}}Repository;

    public ${{values.domainName}}Service(${{values.domainName}}Repository ${{values.domainNameLc}}Repository) {
        this.${{values.domainNameLc}}Repository = ${{values.domainNameLc}}Repository;
    }

    public List<${{values.domainName}}> getAll() {
        return this.${{values.domainNameLc}}Repository.findAll();
    }

    public ${{values.domainName}} getById(Long id) {
        return this.${{values.domainNameLc}}Repository.findById(id).orElse(null);
    }
}