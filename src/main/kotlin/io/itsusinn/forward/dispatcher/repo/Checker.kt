/**
 * Copyright 2020-2021 Itsusinn and contributors.
 *
 * Licensed under the GNU Lesser General Public License version 3,
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *       https://opensource.org/licenses/LGPL-3.0
 */

package io.itsusinn.forward.dispatcher.repo

import mu.KotlinLogging

private val logger = KotlinLogging.logger { }

fun checkToken(appID: String, channelID: String, token: String): Boolean {
   logger.warn { "New ws connect connecting " }
   logger.warn { "AppId:$appID" }
   logger.warn { "ChannelID:$channelID" }
   return true
}
fun checkToken(address: String, token: String): Boolean {
   val para = address.split(".")
   if (para.size != 2) return false
   logger.warn { "New ws connect connecting " }
   logger.warn { "AppId:${para[0]}" }
   logger.warn { "ChannelID:${para[1]}" }
   return true
}
