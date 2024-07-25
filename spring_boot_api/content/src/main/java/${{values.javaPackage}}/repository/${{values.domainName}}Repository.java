package ${{ values.groupId }}.repository;

import ${{ values.groupId }}.entity.${{ values.domainName }};   

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ${{values.domainName}}Repository extends JpaRepository<${{values.domainName}}, Long> {
}