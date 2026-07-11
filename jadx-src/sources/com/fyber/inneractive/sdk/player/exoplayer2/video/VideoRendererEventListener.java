package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Handler;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface VideoRendererEventListener {

    public static final class EventDispatcher {
        private final Handler handler;
        private final VideoRendererEventListener listener;

        public void decoderInitialized(String str, long j2, long j3) {
            if (this.listener != null) {
                this.handler.post(new j(this, str, j2, j3));
            }
        }

        public void disabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new o(this, decoderCounters));
            }
        }

        public void droppedFrames(int i2, long j2) {
            if (this.listener != null) {
                this.handler.post(new l(this, i2, j2));
            }
        }

        public void enabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new i(this, decoderCounters));
            }
        }

        public void inputFormatChanged(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
            if (this.listener != null) {
                this.handler.post(new k(this, oVar));
            }
        }

        public void renderedFirstFrame(Surface surface) {
            if (this.listener != null) {
                this.handler.post(new n(this, surface));
            }
        }

        public void videoSizeChanged(int i2, int i3, int i5, float f3) {
            if (this.listener != null) {
                this.handler.post(new m(this, i2, i3, i5, f3));
            }
        }

        public EventDispatcher(Handler handler, VideoRendererEventListener videoRendererEventListener) {
            if (videoRendererEventListener != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.handler = handler;
            this.listener = videoRendererEventListener;
        }
    }

    void onDroppedFrames(int i2, long j2);

    void onRenderedFirstFrame(Surface surface);

    void onVideoDecoderInitialized(String str, long j2, long j3);

    void onVideoDisabled(DecoderCounters decoderCounters);

    void onVideoEnabled(DecoderCounters decoderCounters);

    void onVideoInputFormatChanged(com.fyber.inneractive.sdk.player.exoplayer2.o oVar);

    void onVideoSizeChanged(int i2, int i3, int i5, float f3);
}
