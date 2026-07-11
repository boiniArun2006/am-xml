package VWJ;

import Szt.Ml;
import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import zdu.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class n implements w6 {
    public static final j J2 = new j(null);
    private static final Class Uo = n.class;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Ml.n f11016O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final zdu.n f11017n;
    private Ml nr;
    private X1.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f11018t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX INFO: renamed from: VWJ.n$n, reason: collision with other inner class name */
    public static final class C0393n implements Ml.n {
        @Override // Szt.Ml.n
        public void n(int i2, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        }

        C0393n() {
        }

        @Override // Szt.Ml.n
        public Pj0.j rl(int i2) {
            return n.this.f11017n.J2(i2);
        }
    }

    public n(zdu.n bitmapFrameCache, X1.j animatedDrawableBackend, boolean z2) {
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animatedDrawableBackend, "animatedDrawableBackend");
        this.f11017n = bitmapFrameCache;
        this.rl = animatedDrawableBackend;
        this.f11018t = z2;
        C0393n c0393n = new C0393n();
        this.f11016O = c0393n;
        this.nr = new Ml(this.rl, z2, c0393n);
    }

    @Override // zdu.w6
    public int O() {
        return this.rl.getWidth();
    }

    @Override // zdu.w6
    public boolean n(int i2, Bitmap targetBitmap) {
        Intrinsics.checkNotNullParameter(targetBitmap, "targetBitmap");
        try {
            this.nr.KN(i2, targetBitmap);
            return true;
        } catch (IllegalStateException e2) {
            Dzy.j.Uo(Uo, e2, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i2));
            return false;
        }
    }

    @Override // zdu.w6
    public void nr(Rect rect) {
        X1.j jVarJ2 = this.rl.J2(rect);
        Intrinsics.checkNotNullExpressionValue(jVarJ2, "forNewBounds(...)");
        if (jVarJ2 != this.rl) {
            this.rl = jVarJ2;
            this.nr = new Ml(jVarJ2, this.f11018t, this.f11016O);
        }
    }

    @Override // zdu.w6
    public int t() {
        return this.rl.getHeight();
    }
}
