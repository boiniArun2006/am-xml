package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class AudioBecomingNoisyManager {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f57359n;
    private final j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f57360t;

    public interface EventListener {
        void onAudioBecomingNoisy();
    }

    private final class j extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final EventListener f57362n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Handler f57363t;

        public j(Handler handler, EventListener eventListener) {
            this.f57363t = handler;
            this.f57362n = eventListener;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f57363t.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AudioBecomingNoisyManager.this.f57360t) {
                this.f57362n.onAudioBecomingNoisy();
            }
        }
    }

    public void rl(boolean z2) {
        if (z2 && !this.f57360t) {
            this.f57359n.registerReceiver(this.rl, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f57360t = true;
        } else {
            if (z2 || !this.f57360t) {
                return;
            }
            this.f57359n.unregisterReceiver(this.rl);
            this.f57360t = false;
        }
    }

    public AudioBecomingNoisyManager(Context context, Handler handler, EventListener eventListener) {
        this.f57359n = context.getApplicationContext();
        this.rl = new j(handler, eventListener);
    }
}
