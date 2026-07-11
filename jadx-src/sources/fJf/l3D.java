package fJf;

import android.graphics.Bitmap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class l3D implements Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f66889n;

    @Override // A72.Wre
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i2) / 2.0d), Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        this.f66889n.add(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    @Override // A72.Wre, Pj0.fuX
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public void n(Bitmap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f66889n.remove(value);
        value.recycle();
    }

    public l3D() {
        Set setRl = Hh.o.rl();
        Intrinsics.checkNotNullExpressionValue(setRl, "newIdentityHashSet(...)");
        this.f66889n = setRl;
    }
}
