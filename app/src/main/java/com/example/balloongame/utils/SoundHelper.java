package com.example.balloongame.utils;

import android.content.Context;
import android.media.MediaPlayer;

import com.example.balloongame.R;


public class SoundHelper {

    private MediaPlayer mMusicPlayer;

    public SoundHelper() {
    }

    public void prepareMusicPlayer(Context context) {
        mMusicPlayer = MediaPlayer.create(context.getApplicationContext(),
                R.raw.pleasant_music);
        mMusicPlayer.setVolume(.5f, .5f);
        mMusicPlayer.setLooping(true);
    }

    public void playMusic() {
        if (mMusicPlayer != null) {
            mMusicPlayer.start();
        }
    }

    public void pauseMusic() {
        if (mMusicPlayer != null && mMusicPlayer.isPlaying()) {
            mMusicPlayer.pause();
        }
    }
}
