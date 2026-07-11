package androidx.core.graphics.drawable;

import android.graphics.Rect;
import androidx.core.view.GravityCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class RoundedBitmapDrawableFactory {

    private static class DefaultRoundedBitmapDrawable extends RoundedBitmapDrawable {
        @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
        void rl(int i2, int i3, int i5, Rect rect, Rect rect2) {
            GravityCompat.n(i2, i3, i5, rect, rect2, 0);
        }
    }
}
