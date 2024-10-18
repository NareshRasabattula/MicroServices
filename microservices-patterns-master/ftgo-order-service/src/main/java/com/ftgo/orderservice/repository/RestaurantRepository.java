/*
 * Copyright 2020 Wuyi Chen.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ftgo.orderservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.ftgo.orderservice.model.Restaurant;

/**
 * The repository class for {@code Restaurant} entity. 
 * 
 * @author  Wuyi Chen
 * @date    04/10/2020
 * @version 1.0
 * @since   1.0
 */
public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {}
