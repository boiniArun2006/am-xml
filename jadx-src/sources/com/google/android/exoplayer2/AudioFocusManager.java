package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class AudioFocusManager {
    private int J2;
    private AudioFocusRequest KN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AudioManager f57365n;
    private AudioAttributes nr;
    private final j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private PlayerControl f57366t;
    private boolean xMQ;
    private float Uo = 1.0f;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f57364O = 0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerCommand {
    }

    public interface PlayerControl {
        void executePlayerCommand(int i2);

        void setVolumeMultiplier(float f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class j implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Handler f57367n;

        public j(Handler handler) {
            this.f57367n = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i2) {
            this.f57367n.post(new Runnable() { // from class: com.google.android.exoplayer2.Ml
                @Override // java.lang.Runnable
                public final void run() {
                    AudioFocusManager.this.KN(i2);
                }
            });
        }
    }

    private boolean HI(int i2) {
        return i2 == 1 || this.J2 != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KN(int i2) {
        if (i2 == -3 || i2 == -2) {
            if (i2 != -2 && !Ik()) {
                ty(3);
                return;
            } else {
                J2(0);
                ty(2);
                return;
            }
        }
        if (i2 == -1) {
            J2(-1);
            rl();
        } else if (i2 == 1) {
            ty(1);
            J2(1);
        } else {
            Log.w("AudioFocusManager", "Unknown focus change type: " + i2);
        }
    }

    private static int O(AudioAttributes audioAttributes) {
        if (audioAttributes == null) {
            return 0;
        }
        switch (audioAttributes.usage) {
            case 0:
                Log.w("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (audioAttributes.contentType == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                Log.w("AudioFocusManager", "Unidentified audio usage: " + audioAttributes.usage);
                return 0;
            case 16:
                return Util.SDK_INT >= 19 ? 4 : 2;
        }
    }

    public void xMQ() {
        this.f57366t = null;
        rl();
    }

    private boolean Ik() {
        AudioAttributes audioAttributes = this.nr;
        return audioAttributes != null && audioAttributes.contentType == 1;
    }

    private void J2(int i2) {
        PlayerControl playerControl = this.f57366t;
        if (playerControl != null) {
            playerControl.executePlayerCommand(i2);
        }
    }

    private int gh() {
        return this.f57365n.requestAudioFocus(this.rl, Util.getStreamTypeForAudioUsage(((AudioAttributes) Assertions.checkNotNull(this.nr)).usage), this.J2);
    }

    private int mUb() {
        if (this.f57364O == 1) {
            return 1;
        }
        if ((Util.SDK_INT >= 26 ? qie() : gh()) == 1) {
            ty(1);
            return 1;
        }
        ty(0);
        return -1;
    }

    private void n() {
        this.f57365n.abandonAudioFocus(this.rl);
    }

    private int qie() {
        AudioFocusRequest.Builder builderN;
        AudioFocusRequest audioFocusRequest = this.KN;
        if (audioFocusRequest == null || this.xMQ) {
            if (audioFocusRequest == null) {
                AbstractC1883n.n();
                builderN = androidx.media3.common.audio.Wre.n(this.J2);
            } else {
                AbstractC1883n.n();
                builderN = com.google.android.exoplayer2.j.n(this.KN);
            }
            this.KN = builderN.setAudioAttributes(((AudioAttributes) Assertions.checkNotNull(this.nr)).getAudioAttributesV21().audioAttributes).setWillPauseWhenDucked(Ik()).setOnAudioFocusChangeListener(this.rl).build();
            this.xMQ = false;
        }
        return this.f57365n.requestAudioFocus(this.KN);
    }

    private void rl() {
        if (this.f57364O == 0) {
            return;
        }
        if (Util.SDK_INT >= 26) {
            t();
        } else {
            n();
        }
        ty(0);
    }

    private void t() {
        AudioFocusRequest audioFocusRequest = this.KN;
        if (audioFocusRequest != null) {
            this.f57365n.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private void ty(int i2) {
        if (this.f57364O == i2) {
            return;
        }
        this.f57364O = i2;
        float f3 = i2 == 3 ? 0.2f : 1.0f;
        if (this.Uo == f3) {
            return;
        }
        this.Uo = f3;
        PlayerControl playerControl = this.f57366t;
        if (playerControl != null) {
            playerControl.setVolumeMultiplier(f3);
        }
    }

    public float Uo() {
        return this.Uo;
    }

    public void az(AudioAttributes audioAttributes) {
        if (Util.areEqual(this.nr, audioAttributes)) {
            return;
        }
        this.nr = audioAttributes;
        int iO = O(audioAttributes);
        this.J2 = iO;
        boolean z2 = true;
        if (iO != 1 && iO != 0) {
            z2 = false;
        }
        Assertions.checkArgument(z2, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public AudioFocusManager(Context context, Handler handler, PlayerControl playerControl) {
        this.f57365n = (AudioManager) Assertions.checkNotNull((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f57366t = playerControl;
        this.rl = new j(handler);
    }

    public int ck(boolean z2, int i2) {
        if (HI(i2)) {
            rl();
            if (!z2) {
                return -1;
            }
            return 1;
        }
        if (!z2) {
            return -1;
        }
        return mUb();
    }
}
