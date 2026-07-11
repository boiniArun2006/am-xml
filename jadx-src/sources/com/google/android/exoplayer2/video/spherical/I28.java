package com.google.android.exoplayer2.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.TimedValueQueue;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class I28 implements VideoFrameMetadataListener, CameraMotionListener {
    private SurfaceTexture E2;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private byte[] f58549T;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f58553g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f58554n = new AtomicBoolean();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AtomicBoolean f58557t = new AtomicBoolean(true);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final w6 f58547O = new w6();
    private final j J2 = new j();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final TimedValueQueue f58556r = new TimedValueQueue();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final TimedValueQueue f58555o = new TimedValueQueue();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final float[] f58551Z = new float[16];

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final float[] f58548S = new float[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile int f58552e = 0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f58550X = -1;

    private void O(byte[] bArr, int i2, long j2) {
        byte[] bArr2 = this.f58549T;
        int i3 = this.f58550X;
        this.f58549T = bArr;
        if (i2 == -1) {
            i2 = this.f58552e;
        }
        this.f58550X = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.f58549T)) {
            return;
        }
        byte[] bArr3 = this.f58549T;
        Projection projectionN = bArr3 != null ? n.n(bArr3, this.f58550X) : null;
        if (projectionN == null || !w6.t(projectionN)) {
            projectionN = Projection.rl(this.f58550X);
        }
        this.f58555o.add(j2, projectionN);
    }

    public void nr(int i2) {
        this.f58552e = i2;
    }

    @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
    public void onCameraMotion(long j2, float[] fArr) {
        this.J2.O(j2, fArr);
    }

    @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
    public void onCameraMotionReset() {
        this.f58556r.clear();
        this.J2.nr();
        this.f58557t.set(true);
    }

    @Override // com.google.android.exoplayer2.video.VideoFrameMetadataListener
    public void onVideoFrameAboutToBeRendered(long j2, long j3, Format format, MediaFormat mediaFormat) {
        this.f58556r.add(j3, Long.valueOf(j2));
        O(format.projectionData, format.stereoMode, j3);
    }

    public void rl(float[] fArr, boolean z2) {
        GLES20.glClear(16384);
        GlUtil.checkGlError();
        if (this.f58554n.compareAndSet(true, false)) {
            ((SurfaceTexture) Assertions.checkNotNull(this.E2)).updateTexImage();
            GlUtil.checkGlError();
            if (this.f58557t.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f58551Z, 0);
            }
            long timestamp = this.E2.getTimestamp();
            Long l2 = (Long) this.f58556r.poll(timestamp);
            if (l2 != null) {
                this.J2.t(this.f58551Z, l2.longValue());
            }
            Projection projection = (Projection) this.f58555o.pollFloor(timestamp);
            if (projection != null) {
                this.f58547O.nr(projection);
            }
        }
        Matrix.multiplyMM(this.f58548S, 0, fArr, 0, this.f58551Z, 0);
        this.f58547O.n(this.f58553g, this.f58548S, z2);
    }

    public SurfaceTexture t() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        GlUtil.checkGlError();
        this.f58547O.rl();
        GlUtil.checkGlError();
        this.f58553g = GlUtil.createExternalTexture();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f58553g);
        this.E2 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.google.android.exoplayer2.video.spherical.Ml
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f58558n.f58554n.set(true);
            }
        });
        return this.E2;
    }
}
