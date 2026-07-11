package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/font/FontWeightAdjustmentHelper;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", c.f62177j, "(Landroid/content/Context;)I", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FontWeightAdjustmentHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final FontWeightAdjustmentHelper f33721n = new FontWeightAdjustmentHelper();

    public final int n(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return FontWeightAdjustmentHelperApi31.f33722n.n(context);
        }
        return 0;
    }

    private FontWeightAdjustmentHelper() {
    }
}
