/*
 * Copyright 2005-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openwms.core.exception;

/**
 * An ExceptionCodes class defines some, not all, of exception codes used in OpenWMS.org. The code is a descriptive message code, that can
 * be used for translation purpose.
 *
 * @author Heiko Scherrer
 */
public final class ExceptionCodes {

    /** Generic technical exception. */
    public static final String TECHNICAL_RT_ERROR = "core.general.technical.error";
    /** Thrown to signal one or more invalid parameters in API or method calls. */
    public static final String INVALID_PARAMETER_ERROR = "core.invalid.parameter";
    /** A generic validation error. */
    public static final String VALIDATION_ERROR = "core.validation.error";

    private ExceptionCodes() {
    }
}
