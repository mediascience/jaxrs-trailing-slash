/*
 * Licensed to Media Science International (MSI) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. MSI
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.msiops.jaxrs.trailingslash;

import javax.annotation.Priority;
import javax.ws.rs.container.ContainerRequestFilter;

/**
 * Filter to allow trailing slash in incoming resource request URI. Injects
 * {@link PolicyImpl#PROHIBIT} into the request context. Use this filter to
 * globally enforce the policy or for dynamic filter registration.
 */
@Priority(100)
public final class RequireTrailingSlashFilter extends
AbstractPolicyInjectorFilter implements ContainerRequestFilter {

    public RequireTrailingSlashFilter() {
        super(PolicyImpl.REQUIRE);
    }

}
