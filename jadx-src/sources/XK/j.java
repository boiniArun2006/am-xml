package XK;

import android.util.Log;
import com.alightcreative.giflib.GIFLibWrapper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {
    public static final C0429j rl = new C0429j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f11817t = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f11818n;

    /* JADX INFO: renamed from: XK.j$j, reason: collision with other inner class name */
    public static final class C0429j {
        public /* synthetic */ C0429j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0429j() {
        }
    }

    static {
        lfy.j.n(IvA.n.rl().getApplicationContext(), "alight-giflib");
    }

    public j(String path, int i2, int i3, int i5, n quantizer, boolean z2) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(quantizer, "quantizer");
        this.f11818n = GIFLibWrapper.f46617n.newInstance(path, i2, i3, i5, quantizer.rl(), z2);
    }

    protected final void finalize() {
        if (this.f11818n != 0) {
            Log.e("NanoVG", "WARNING: Leaked GIFLib reference; missing call to GIFLib.release()");
            GIFLibWrapper.f46617n.freeInstance(this.f11818n);
            this.f11818n = 0L;
        }
    }

    public final void n() {
        long j2 = this.f11818n;
        if (j2 != 0) {
            GIFLibWrapper.f46617n.freeInstance(j2);
            this.f11818n = 0L;
        }
    }

    public final void rl(int i2) {
        long j2 = this.f11818n;
        if (j2 == 0) {
            throw new IllegalStateException("Check failed.");
        }
        GIFLibWrapper.f46617n.writeGLFrame(j2, i2);
    }
}
