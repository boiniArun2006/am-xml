package c0;

import android.os.SystemClock;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactorKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Pl extends Painter {
    private final int E2;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Painter f43458S;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final boolean f43460X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private Painter f43461Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f43462e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ContentScale f43463g;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f43464v;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final MutableIntState f43459T = SnapshotIntStateKt.n(0);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private long f43457N = -1;
    private final MutableFloatState Xw = PrimitiveSnapshotStateKt.n(1.0f);
    private final MutableState jB = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);

    private final long HI(long j2, long j3) {
        Size.Companion companion = Size.INSTANCE;
        return (j2 == companion.n() || Size.az(j2) || j3 == companion.n() || Size.az(j3)) ? j3 : ScaleFactorKt.n(j2, this.f43463g.n(j2, j3));
    }

    private final void Ik(DrawScope drawScope, Painter painter, float f3) {
        if (painter == null || f3 <= 0.0f) {
            return;
        }
        long jT2 = drawScope.t();
        long jHI = HI(painter.getIntrinsicSize(), jT2);
        if (jT2 == Size.INSTANCE.n() || Size.az(jT2)) {
            painter.mUb(drawScope, jHI, f3, r());
            return;
        }
        float f4 = 2;
        float fGh = (Size.gh(jT2) - Size.gh(jHI)) / f4;
        float fXMQ = (Size.xMQ(jT2) - Size.xMQ(jHI)) / f4;
        drawScope.getDrawContext().getTransform().xMQ(fGh, fXMQ, fGh, fXMQ);
        painter.mUb(drawScope, jHI, f3, r());
        DrawTransform transform = drawScope.getDrawContext().getTransform();
        float f5 = -fGh;
        float f6 = -fXMQ;
        transform.xMQ(f5, f6, f5, f6);
    }

    private final void S(int i2) {
        this.f43459T.KN(i2);
    }

    private final void WPU(float f3) {
        this.Xw.Z(f3);
    }

    private final void XQ(ColorFilter colorFilter) {
        this.jB.setValue(colorFilter);
    }

    private final float Z() {
        return this.Xw.n();
    }

    private final long ck() {
        Painter painter = this.f43461Z;
        long intrinsicSize = painter != null ? painter.getIntrinsicSize() : Size.INSTANCE.rl();
        Painter painter2 = this.f43458S;
        long intrinsicSize2 = painter2 != null ? painter2.getIntrinsicSize() : Size.INSTANCE.rl();
        Size.Companion companion = Size.INSTANCE;
        boolean z2 = intrinsicSize != companion.n();
        boolean z3 = intrinsicSize2 != companion.n();
        if (z2 && z3) {
            return SizeKt.n(Math.max(Size.gh(intrinsicSize), Size.gh(intrinsicSize2)), Math.max(Size.xMQ(intrinsicSize), Size.xMQ(intrinsicSize2)));
        }
        if (this.f43460X) {
            if (z2) {
                return intrinsicSize;
            }
            if (z3) {
                return intrinsicSize2;
            }
        }
        return companion.n();
    }

    private final int o() {
        return this.f43459T.J2();
    }

    private final ColorFilter r() {
        return (ColorFilter) this.jB.getValue();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void ty(DrawScope drawScope) {
        if (this.f43464v) {
            Ik(drawScope, this.f43458S, Z());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f43457N == -1) {
            this.f43457N = jUptimeMillis;
        }
        float f3 = (jUptimeMillis - this.f43457N) / this.E2;
        float fCoerceIn = RangesKt.coerceIn(f3, 0.0f, 1.0f) * Z();
        float fZ = this.f43462e ? Z() - fCoerceIn : Z();
        this.f43464v = f3 >= 1.0f;
        Ik(drawScope, this.f43461Z, fZ);
        Ik(drawScope, this.f43458S, fCoerceIn);
        if (this.f43464v) {
            this.f43461Z = null;
        } else {
            S(o() + 1);
        }
    }

    public Pl(Painter painter, Painter painter2, ContentScale contentScale, int i2, boolean z2, boolean z3) {
        this.f43461Z = painter;
        this.f43458S = painter2;
        this.f43463g = contentScale;
        this.E2 = i2;
        this.f43462e = z2;
        this.f43460X = z3;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean n(float f3) {
        WPU(f3);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: qie */
    public long getIntrinsicSize() {
        return ck();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean rl(ColorFilter colorFilter) {
        XQ(colorFilter);
        return true;
    }
}
