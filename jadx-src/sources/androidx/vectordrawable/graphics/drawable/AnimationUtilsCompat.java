package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class AnimationUtilsCompat {
    public static Interpolator n(Context context, int i2) {
        return AnimationUtils.loadInterpolator(context, i2);
    }
}
