package com.littlegod.sampletv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.SimpleExoPlayer
import kotlinx.android.synthetic.main.activity_video.*

class VideoActivity: AppCompatActivity() {

    private var player: SimpleExoPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        buildPlayer()
        buildMedia()
    }

    private fun buildMedia() {
        player = SimpleExoPlayer.Builder(this).build()
        activity_video_player.player = player
        val mediaItem = MediaItem.fromUri("https://www.rmp-streaming.com/media/big-buck-bunny-360p.mp4")
        player?.apply {
            setMediaItem(mediaItem)
            prepare()
            play()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        player?.release()

    }

    private fun buildPlayer() {

    }
}