package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class AudioBecomingNoisyManager {
    private final HandlerWrapper backgroundHandler;
    private final Context context;
    private boolean isEnabled;
    private final AudioBecomingNoisyReceiver receiver;

    /* JADX INFO: Access modifiers changed from: private */
    final class AudioBecomingNoisyReceiver extends BroadcastReceiver {
        private final HandlerWrapper eventHandler;
        private final EventListener listener;

        public AudioBecomingNoisyReceiver(HandlerWrapper handlerWrapper, EventListener eventListener) {
            this.eventHandler = handlerWrapper;
            this.listener = eventListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void callListenerIfEnabled() {
            if (AudioBecomingNoisyManager.this.isEnabled) {
                this.listener.onAudioBecomingNoisy();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.eventHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.w6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39871n.callListenerIfEnabled();
                    }
                });
            }
        }
    }

    public interface EventListener {
        void onAudioBecomingNoisy();
    }

    public void setEnabled(boolean z2) {
        if (z2 == this.isEnabled) {
            return;
        }
        if (z2) {
            this.backgroundHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.j
                @Override // java.lang.Runnable
                public final void run() {
                    AudioBecomingNoisyManager audioBecomingNoisyManager = this.f39653n;
                    audioBecomingNoisyManager.context.registerReceiver(audioBecomingNoisyManager.receiver, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                }
            });
            this.isEnabled = true;
        } else {
            this.backgroundHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.n
                @Override // java.lang.Runnable
                public final void run() {
                    AudioBecomingNoisyManager audioBecomingNoisyManager = this.f39675n;
                    audioBecomingNoisyManager.context.unregisterReceiver(audioBecomingNoisyManager.receiver);
                }
            });
            this.isEnabled = false;
        }
    }

    public AudioBecomingNoisyManager(Context context, Looper looper, Looper looper2, EventListener eventListener, Clock clock) {
        this.context = context.getApplicationContext();
        this.backgroundHandler = clock.createHandler(looper, null);
        this.receiver = new AudioBecomingNoisyReceiver(clock.createHandler(looper2, null), eventListener);
    }
}
