package fJf;

import android.graphics.Bitmap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class aC extends s4 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f66875t = new j(null);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    protected final boolean J2(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            Dzy.j.g("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        Dzy.j.g("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
    }

    @Override // fJf.g9s
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public int n(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return com.facebook.imageutils.Ml.mUb(bitmap);
    }

    @Override // fJf.s4, fJf.g9s
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public void rl(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (J2(bitmap)) {
            super.rl(bitmap);
        }
    }

    @Override // fJf.s4, fJf.g9s
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int i2) {
        Bitmap bitmap = (Bitmap) super.get(i2);
        if (bitmap != null && J2(bitmap)) {
            bitmap.eraseColor(0);
            return bitmap;
        }
        return null;
    }
}
