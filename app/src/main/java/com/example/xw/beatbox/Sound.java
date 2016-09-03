package com.example.xw.beatbox;

import android.content.Intent;

/**
 * Created by xw on 2016/9/2.
 */
public class Sound {
    private String mAssetPath;
    private String mName;

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }

    private Integer mSoundId;
    public Sound(String assetPath){
        mAssetPath=assetPath;
        String[] components=assetPath.split("/");
        String filename=components[components.length-1];
        mName=filename.replace(".wav","");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }
}
