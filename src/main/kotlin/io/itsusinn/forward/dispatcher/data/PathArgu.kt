/**
 * Copyright 2020-2021 Itsusinn and contributors.
 *
 * Licensed under the GNU Lesser General Public License version 3,
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *       https://opensource.org/licenses/LGPL-3.0
 */

package itsusinn.forward.dispatcher.data

import com.fasterxml.jackson.annotation.JsonProperty

data class PathArgu(
   @JsonProperty(value = "app_id")
   val appID: String,
   @JsonProperty(value = "channel_id")
   val channelID: String,
   @JsonProperty(value = "token")
   var token: String
)
