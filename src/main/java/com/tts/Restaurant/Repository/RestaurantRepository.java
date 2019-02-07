package com.tts.Restaurant.Repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.Restaurant.models.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

}
