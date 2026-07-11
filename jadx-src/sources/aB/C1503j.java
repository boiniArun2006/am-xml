package aB;

import android.graphics.Bitmap;
import fJf.Dsr;
import kotlin.jvm.internal.Intrinsics;
import ln.C2267j;

/* JADX INFO: renamed from: aB.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C1503j extends AbstractC1501Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Dsr f12738n;
    private final C2267j rl;

    public C1503j(Dsr bitmapPool, C2267j closeableReferenceFactory) {
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        this.f12738n = bitmapPool;
        this.rl = closeableReferenceFactory;
    }

    @Override // aB.AbstractC1501Ml
    public Pj0.j nr(int i2, int i3, Bitmap.Config bitmapConfig) {
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Bitmap bitmap = (Bitmap) this.f12738n.get(com.facebook.imageutils.Ml.xMQ(i2, i3, bitmapConfig));
        if (bitmap.getAllocationByteCount() < i2 * i3 * com.facebook.imageutils.Ml.KN(bitmapConfig)) {
            throw new IllegalStateException("Check failed.");
        }
        bitmap.reconfigure(i2, i3, bitmapConfig);
        Pj0.j jVarT = this.rl.t(bitmap, this.f12738n);
        Intrinsics.checkNotNullExpressionValue(jVarT, "create(...)");
        return jVarT;
    }
}
