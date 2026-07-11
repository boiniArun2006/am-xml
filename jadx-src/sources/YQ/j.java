package YQ;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j {
    public static final boolean O(Context isFinishing) {
        Intrinsics.checkNotNullParameter(isFinishing, "$this$isFinishing");
        return (isFinishing instanceof Activity) && ((Activity) isFinishing).isFinishing();
    }

    public static final int n(Context contextColor, int i2) {
        Intrinsics.checkNotNullParameter(contextColor, "$this$contextColor");
        return ContextCompat.getColor(contextColor, i2);
    }

    public static final int nr(Context dp2Px, int i2) {
        Intrinsics.checkNotNullParameter(dp2Px, "$this$dp2Px");
        Resources resources = dp2Px.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        return (int) (i2 * resources.getDisplayMetrics().density);
    }

    public static final Point rl(Context displaySize) {
        Intrinsics.checkNotNullParameter(displaySize, "$this$displaySize");
        Resources resources = displaySize.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        int i2 = resources.getDisplayMetrics().widthPixels;
        Resources resources2 = displaySize.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "resources");
        return new Point(i2, resources2.getDisplayMetrics().heightPixels);
    }

    public static final float t(Context dp2Px, float f3) {
        Intrinsics.checkNotNullParameter(dp2Px, "$this$dp2Px");
        Resources resources = dp2Px.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        return f3 * resources.getDisplayMetrics().density;
    }
}
