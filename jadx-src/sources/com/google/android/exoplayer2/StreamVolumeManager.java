package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.pairip.VMRunner;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class StreamVolumeManager {
    private int J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private n f57501O;
    private int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f57502n;
    private final AudioManager nr;
    private final Handler rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Listener f57503t;

    public interface Listener {
        void onStreamTypeChanged(int i2);

        void onStreamVolumeChanged(int i2, boolean z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    final class n extends BroadcastReceiver {
        private n() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VMRunner.invoke("YK9qX1bl54tSXcL2", new Object[]{this, context, intent});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HI() {
        int iKN = KN(this.nr, this.J2);
        boolean zJ2 = J2(this.nr, this.J2);
        if (this.Uo == iKN && this.KN == zJ2) {
            return;
        }
        this.Uo = iKN;
        this.KN = zJ2;
        this.f57503t.onStreamVolumeChanged(iKN, zJ2);
    }

    private static boolean J2(AudioManager audioManager, int i2) {
        return Util.SDK_INT >= 23 ? audioManager.isStreamMute(i2) : KN(audioManager, i2) == 0;
    }

    public int O() {
        if (Util.SDK_INT >= 28) {
            return this.nr.getStreamMinVolume(this.J2);
        }
        return 0;
    }

    public int Uo() {
        return this.Uo;
    }

    public void az(int i2) {
        if (this.J2 == i2) {
            return;
        }
        this.J2 = i2;
        HI();
        this.f57503t.onStreamTypeChanged(i2);
    }

    public void gh() {
        n nVar = this.f57501O;
        if (nVar != null) {
            try {
                this.f57502n.unregisterReceiver(nVar);
            } catch (RuntimeException e2) {
                Log.w("StreamVolumeManager", "Error unregistering stream volume receiver", e2);
            }
            this.f57501O = null;
        }
    }

    public boolean mUb() {
        return this.KN;
    }

    public int nr() {
        return this.nr.getStreamMaxVolume(this.J2);
    }

    public void qie(boolean z2) {
        if (Util.SDK_INT >= 23) {
            this.nr.adjustStreamVolume(this.J2, z2 ? -100 : 100, 1);
        } else {
            this.nr.setStreamMute(this.J2, z2);
        }
        HI();
    }

    public void t() {
        if (this.Uo <= O()) {
            return;
        }
        this.nr.adjustStreamVolume(this.J2, -1, 1);
        HI();
    }

    public void xMQ() {
        if (this.Uo >= nr()) {
            return;
        }
        this.nr.adjustStreamVolume(this.J2, 1, 1);
        HI();
    }

    public StreamVolumeManager(Context context, Handler handler, Listener listener) {
        Context applicationContext = context.getApplicationContext();
        this.f57502n = applicationContext;
        this.rl = handler;
        this.f57503t = listener;
        AudioManager audioManager = (AudioManager) Assertions.checkStateNotNull((AudioManager) applicationContext.getSystemService("audio"));
        this.nr = audioManager;
        this.J2 = 3;
        this.Uo = KN(audioManager, 3);
        this.KN = J2(audioManager, this.J2);
        n nVar = new n();
        try {
            applicationContext.registerReceiver(nVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f57501O = nVar;
        } catch (RuntimeException e2) {
            Log.w("StreamVolumeManager", "Error registering stream volume receiver", e2);
        }
    }

    private static int KN(AudioManager audioManager, int i2) {
        try {
            return audioManager.getStreamVolume(i2);
        } catch (RuntimeException e2) {
            Log.w("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i2, e2);
            return audioManager.getStreamMaxVolume(i2);
        }
    }

    public void ty(int i2) {
        if (i2 >= O() && i2 <= nr()) {
            this.nr.setStreamVolume(this.J2, i2, 1);
            HI();
        }
    }
}
