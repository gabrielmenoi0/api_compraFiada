package EstabeleimentoRepository;
import domain.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;


public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, UUID> {

}
