package WzY;

import android.util.Log;
import com.alightcreative.nanovg.NanoVGWrapper;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class QJ {
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f11607t = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f11608n = NanoVGWrapper.f46889n.newInstance();

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static {
        lfy.j.n(IvA.n.rl().getApplicationContext(), "alight-nanovg");
    }

    public final void HI(float f3, float f4, float f5, float f6) {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.quadTo(j2, f3, f4, f5, f6);
    }

    public final void Ik() {
        long j2 = this.f11608n;
        if (j2 != 0) {
            NanoVGWrapper.f46889n.freeInstance(j2);
            this.f11608n = 0L;
        }
    }

    public final void J2() {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.endFrame(j2);
    }

    public final void KN(float f3, float f4, float f5, float f6) {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.fillColor(j2, f3, f4, f5, f6);
    }

    public final void O() {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.closePath(j2);
    }

    public final void S(float f3, float f4, float f5, float f6) {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.strokeColor(j2, f3, f4, f5, f6);
    }

    public final void Uo() {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.fill(j2);
    }

    public final void WPU(float f3) {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.strokeWidth(j2, f3);
    }

    public final void XQ() {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.stroke(j2);
    }

    public final void Z() {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.save(j2);
    }

    public final void aYN(float f3, float f4, float f5, float f6, float f7, float f8) {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.transform(j2, f3, f4, f5, f6, f7, f8);
    }

    public final void az(float f3, float f4) {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.moveTo(j2, f3, f4);
    }

    public final void ck(float f3, float f4, float f5, float f6) {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.rect(j2, f3, f4, f5, f6);
    }

    protected final void finalize() {
        if (this.f11608n != 0) {
            Log.e("NanoVG", "WARNING: Leaked NanoVG reference; missing call to NanoVG.release()");
            NanoVGWrapper.f46889n.freeInstance(this.f11608n);
            this.f11608n = 0L;
        }
    }

    public final void gh(int i2) {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.lineJoin(j2, i2);
    }

    public final void mUb(int i2) {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.lineCap(j2, i2);
    }

    public final void n(int i2, int i3, float f3) {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.beginFrame(j2, i2, i3, f3);
    }

    public final void nr(float f3, float f4, float f5) {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.circle(j2, f3, f4, f5);
    }

    public final void o() {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.restore(j2);
    }

    public final void qie(float f3, float f4) {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.lineTo(j2, f3, f4);
    }

    public final void r() {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.resetTransform(j2);
    }

    public final void rl() {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.beginPath(j2);
    }

    public final void t(float f3, float f4, float f5, float f6, float f7, float f8) {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.bezierTo(j2, f3, f4, f5, f6, f7, f8);
    }

    public final void ty(int i2) {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.pathWinding(j2, i2);
    }

    public final void xMQ(int i2) {
        long j2 = this.f11608n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        NanoVGWrapper.f46889n.globalCompositeOperation(j2, i2);
    }
}
