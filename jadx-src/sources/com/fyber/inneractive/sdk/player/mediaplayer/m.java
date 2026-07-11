package com.fyber.inneractive.sdk.player.mediaplayer;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.media.AudioManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f56361a;

    public m(p pVar) {
        this.f56361a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f56361a;
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AudioManager audioManager = (AudioManager) pVar.f56362a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f3 = streamVolume / streamMaxVolume;
        IAlog.a("%s unmute maxVolume = %d currentVolume = %d targetVolume = %s", pVar.b(), Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f3));
        if (f3 == 0.0f) {
            f3 = 0.1f;
        }
        pVar.setVolume(f3, f3);
        IAlog.e(strB + "timelog: unmute took " + (System.currentTimeMillis() - jCurrentTimeMillis) + pTYaLzzmJSGAPQ.XKr, new Object[0]);
    }
}
