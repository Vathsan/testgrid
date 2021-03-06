/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.wso2.testgrid.dao.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Provides the specification pattern for JPA repository pattern.
 * The specification allows you to build a query using the
 * JPA Criteria API.
 *
 * @param <T> type of the entity a given specification handles.
 * @param <U> type of the result-set DTO.
 */
@FunctionalInterface
public interface Specification<T, U> {

    Predicate toPredicate(Root<T> root, CriteriaQuery<U> query, CriteriaBuilder cb);

}
