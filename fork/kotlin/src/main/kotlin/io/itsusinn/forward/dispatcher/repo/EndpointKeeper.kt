/**
 * Copyright 2020-2021 Itsusinn and contributors.
 *
 * Licensed under the GNU Lesser General Public License version 3,
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *       https://opensource.org/licenses/LGPL-3.0
 */

package io.itsusinn.forward.dispatcher.repo

import io.vertx.core.eventbus.MessageConsumer
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicInteger

object EndpointKeeper {

   // address-consumer receive from other verticles' publish
   val sharedConsumer = ConcurrentHashMap<String, MessageConsumer<String>>()
   val clientCounter = ConcurrentHashMap<String, AtomicInteger>()
}
