package ua.yaremechko.periodicals.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.yaremechko.periodicals.domain.Bucket;

public interface BucketRepository extends JpaRepository<Bucket, Integer> {

}
