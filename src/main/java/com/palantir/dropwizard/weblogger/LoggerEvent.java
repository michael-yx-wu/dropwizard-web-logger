/*
 * Copyright 2016 Palantir Technologies, Inc. All rights reserved.
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

package com.palantir.dropwizard.weblogger;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.base.Optional;
import java.util.Set;
import org.immutables.value.Value;

/**
 * POJO for deserializing event fields.
 */
@Value.Immutable
@JsonSerialize(as = ImmutableLoggerEvent.class)
@JsonDeserialize(as = ImmutableLoggerEvent.class)
@SuppressWarnings("checkstyle:designforextension")
public abstract class LoggerEvent {
    @Value.Default
    public Optional<Boolean> getEnabled() {
        return Optional.of(true);
    }

    public abstract Set<String> getFields();

    public abstract String getType();
}