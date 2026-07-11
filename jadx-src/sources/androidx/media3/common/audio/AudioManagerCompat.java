package androidx.media3.common.audio;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BackgroundExecutor;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@UnstableApi
public final class AudioManagerCompat {
    public static final int AUDIOFOCUS_GAIN = 1;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    public static final int AUDIOFOCUS_NONE = 0;
    private static final String TAG = "AudioManagerCompat";
    private static Context applicationContext;

    @Nullable
    private static AudioManager audioManager;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AudioFocusGain {
    }

    public static int abandonAudioFocusRequest(AudioManager audioManager2, AudioFocusRequestCompat audioFocusRequestCompat) {
        return Util.SDK_INT >= 26 ? audioManager2.abandonAudioFocusRequest(audioFocusRequestCompat.getAudioFocusRequest()) : audioManager2.abandonAudioFocus(audioFocusRequestCompat.getOnAudioFocusChangeListener());
    }

    public static synchronized AudioManager getAudioManager(Context context) {
        try {
            final Context applicationContext2 = context.getApplicationContext();
            if (applicationContext != applicationContext2) {
                audioManager = null;
            }
            AudioManager audioManager2 = audioManager;
            if (audioManager2 != null) {
                return audioManager2;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                final ConditionVariable conditionVariable = new ConditionVariable();
                BackgroundExecutor.get().execute(new Runnable() { // from class: androidx.media3.common.audio.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioManagerCompat.n(applicationContext2, conditionVariable);
                    }
                });
                conditionVariable.blockUninterruptible();
                return (AudioManager) Assertions.checkNotNull(audioManager);
            }
            AudioManager audioManager3 = (AudioManager) applicationContext2.getSystemService("audio");
            audioManager = audioManager3;
            return (AudioManager) Assertions.checkNotNull(audioManager3);
        } catch (Throwable th) {
            throw th;
        }
    }

    @IntRange
    public static int getStreamMinVolume(AudioManager audioManager2, int i2) {
        if (Util.SDK_INT >= 28) {
            return audioManager2.getStreamMinVolume(i2);
        }
        return 0;
    }

    public static boolean isStreamMute(AudioManager audioManager2, int i2) {
        return Util.SDK_INT >= 23 ? audioManager2.isStreamMute(i2) : getStreamVolume(audioManager2, i2) == 0;
    }

    public static /* synthetic */ void n(Context context, ConditionVariable conditionVariable) {
        audioManager = (AudioManager) context.getSystemService("audio");
        conditionVariable.open();
    }

    public static int requestAudioFocus(AudioManager audioManager2, AudioFocusRequestCompat audioFocusRequestCompat) {
        return Util.SDK_INT >= 26 ? audioManager2.requestAudioFocus(audioFocusRequestCompat.getAudioFocusRequest()) : audioManager2.requestAudioFocus(audioFocusRequestCompat.getOnAudioFocusChangeListener(), audioFocusRequestCompat.getAudioAttributes().getStreamType(), audioFocusRequestCompat.getFocusGain());
    }

    private AudioManagerCompat() {
    }

    @IntRange
    public static int getStreamMaxVolume(AudioManager audioManager2, int i2) {
        return audioManager2.getStreamMaxVolume(i2);
    }

    public static int getStreamVolume(AudioManager audioManager2, int i2) {
        try {
            return audioManager2.getStreamVolume(i2);
        } catch (RuntimeException e2) {
            Log.w(TAG, "Could not retrieve stream volume for stream type " + i2, e2);
            return audioManager2.getStreamMaxVolume(i2);
        }
    }
}
