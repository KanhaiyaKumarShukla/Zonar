/*
 * Copyright (c) 2014-2023 Stream.io Inc. All rights reserved.
 *
 * Licensed under the Stream License;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://github.com/GetStream/stream-video-android/blob/main/LICENSE
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.getstream.meeting.room.compose.ui.call

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.exa.android.reflekt.loopit.util.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import io.getstream.video.android.core.StreamVideo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CallViewModel @Inject constructor() : ViewModel() {

  // step 1 - get the StreamVideo instance and create a call
  private val streamVideo = StreamVideo.instance()
  val call = streamVideo.call(Constants.callType, Constants.callId.toString())

  private val _uiState: MutableStateFlow<CallUiState> = MutableStateFlow(CallUiState.Loading)
  val uiState: MutableStateFlow<CallUiState> = _uiState

  // we have update for meeting scheduling

  fun join() {
    // step 2 - join the call
    viewModelScope.launch {
      val result = call.join(create = true, notify = true, ring = false)
      result.onSuccess {
        _uiState.value = CallUiState.Success
      }.onError { error ->
        // Unable to join. Device is offline or other usually connection issue.
        _uiState.value = CallUiState.Error(error.message)
      }
    }
  }

  fun leave() {
    call.leave()
  }
}

sealed interface CallUiState {

  data object Loading : CallUiState

  data object Success : CallUiState

  data class Error(val message: String) : CallUiState
}
