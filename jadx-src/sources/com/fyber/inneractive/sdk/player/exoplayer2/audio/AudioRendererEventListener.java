package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.os.Handler;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface AudioRendererEventListener {

    public static final class EventDispatcher {
        private final Handler handler;
        private final AudioRendererEventListener listener;

        public void audioSessionId(int i2) {
            if (this.listener != null) {
                this.handler.post(new i(this, i2));
            }
        }

        public void audioTrackUnderrun(int i2, long j2, long j3) {
            if (this.listener != null) {
                this.handler.post(new g(this, i2, j2, j3));
            }
        }

        public void decoderInitialized(String str, long j2, long j3) {
            if (this.listener != null) {
                this.handler.post(new e(this, str, j2, j3));
            }
        }

        public void disabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new h(this, decoderCounters));
            }
        }

        public void enabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new d(this, decoderCounters));
            }
        }

        public void inputFormatChanged(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
            if (this.listener != null) {
                this.handler.post(new f(this, oVar));
            }
        }

        public EventDispatcher(Handler handler, AudioRendererEventListener audioRendererEventListener) {
            if (audioRendererEventListener != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.handler = handler;
            this.listener = audioRendererEventListener;
        }
    }

    void onAudioDecoderInitialized(String str, long j2, long j3);

    void onAudioDisabled(DecoderCounters decoderCounters);

    void onAudioEnabled(DecoderCounters decoderCounters);

    void onAudioInputFormatChanged(com.fyber.inneractive.sdk.player.exoplayer2.o oVar);

    void onAudioSessionId(int i2);

    void onAudioTrackUnderrun(int i2, long j2, long j3);
}
