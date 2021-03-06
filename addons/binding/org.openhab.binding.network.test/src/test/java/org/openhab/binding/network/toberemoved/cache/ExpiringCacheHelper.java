/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.network.toberemoved.cache;

import org.openhab.binding.network.toberemoved.cache.ExpiringCacheAsync;

/**
 * Helper class to make the package private cacheUpdater field available for tests.
 *
 * @author David Graeff
 */
public class ExpiringCacheHelper {
    public static long expireTime(@SuppressWarnings("rawtypes") ExpiringCacheAsync cache) {
        return cache.expiresAt;
    }
}
