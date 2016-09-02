package com.example.xw.beatbox;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xw on 2016/9/2.
 */
public class BeatBox {
    private static final String TAG="BeatBox";
    private static final String SOUNDS_FOLDER="sample_sounds";
    private AssetManager mAsset;
    private List<Sound> mSounds=new ArrayList<>();
    public BeatBox(Context context){
        mAsset=context.getAssets();
        loadSounds();
    }

    public List<Sound> getSounds() {
        return mSounds;
    }

    private void loadSounds() {

        String[] soundNames;
        try {
            soundNames=mAsset.list(SOUNDS_FOLDER);
            Log.i(TAG,"Found"+soundNames.length+" sounds");

        }catch (IOException ioe){
            return;
        }

        for(String filename :soundNames){
            String assetPath=SOUNDS_FOLDER+"/"+filename;
            Sound sound=new Sound(assetPath);
            mSounds.add(sound);
        }

    }
}
