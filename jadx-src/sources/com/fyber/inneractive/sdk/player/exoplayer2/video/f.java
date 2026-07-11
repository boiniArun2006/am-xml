package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.media.MediaCodec;
import android.os.Handler;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class f implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaCodecVideoRenderer f56276a;

    public f(MediaCodecVideoRenderer mediaCodecVideoRenderer, MediaCodec mediaCodec) {
        this.f56276a = mediaCodecVideoRenderer;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j2, long j3) {
        MediaCodecVideoRenderer mediaCodecVideoRenderer = this.f56276a;
        if (this == mediaCodecVideoRenderer.p0 && !mediaCodecVideoRenderer.f56256Y) {
            mediaCodecVideoRenderer.f56256Y = true;
            mediaCodecVideoRenderer.f56248Q.renderedFirstFrame(mediaCodecVideoRenderer.f56254W);
        }
    }
}
