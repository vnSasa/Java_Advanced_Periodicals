package ua.yaremechko.periodicals.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.yaremechko.periodicals.domain.Periodical;

public interface PeriodicalRepository extends JpaRepository<Periodical, Integer> {

}
