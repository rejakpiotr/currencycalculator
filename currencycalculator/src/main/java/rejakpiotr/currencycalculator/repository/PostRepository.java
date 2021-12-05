package rejakpiotr.currencycalculator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rejakpiotr.currencycalculator.model.ExchangeCourse;

@Repository
public interface PostRepository extends JpaRepository<ExchangeCourse,long> {
}
