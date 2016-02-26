/*
 * Copyright 2015 Palantir Technologies, Inc. All rights reserved.
 */

package com.palantir.dropwizard.weblogger;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import org.immutables.value.Value;

/**
 * Configuration for {@link WebLoggerBundle}.
 */

@Value.Immutable
@JsonSerialize(as = ImmutableWebLoggerConfiguration.class)
@JsonDeserialize(as = ImmutableWebLoggerConfiguration.class)
@SuppressWarnings("checkstyle:designforextension")
public abstract class WebLoggerConfiguration {

    @Value.Default
    public boolean getEnabled() {
        return true;
    }

    public abstract List<LoggerEvent> getEvents();
}
