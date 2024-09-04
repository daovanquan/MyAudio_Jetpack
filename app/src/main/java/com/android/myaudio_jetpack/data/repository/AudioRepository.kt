package com.android.myaudio_jetpack.data.repository

import com.android.myaudio_jetpack.data.ContentResolverHelper
import com.android.myaudio_jetpack.data.model.Audio
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class AudioRepository @Inject
constructor(private val contentResolverHelper: ContentResolverHelper){
    suspend fun getAudioData(): List<Audio> = withContext(Dispatchers.IO){
        contentResolverHelper.getAudioData()
    }
}