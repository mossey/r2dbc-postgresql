/*
 * Copyright 2019-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.r2dbc.postgresql.api;

import io.r2dbc.spi.R2dbcException;

/**
 * Interface for Postgres-specific extension to {@link R2dbcException} providing {@link ErrorDetails}.
 *
 * @see ErrorDetails
 */
public interface PostgresqlException {

    /**
     * Returns additional error information.
     *
     * @return the {@link ErrorDetails}
     */
    ErrorDetails getErrorDetails();

}
