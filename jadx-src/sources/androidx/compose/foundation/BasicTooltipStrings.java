package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.res.StringResources_androidKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/BasicTooltipStrings;", "", "<init>", "()V", "", "rl", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", c.f62177j, "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BasicTooltipStrings {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final BasicTooltipStrings f15961n = new BasicTooltipStrings();

    private BasicTooltipStrings() {
    }

    public final String n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1416633714, i2, -1, "androidx.compose.foundation.BasicTooltipStrings.description (BasicTooltip.android.kt:26)");
        }
        String strT = StringResources_androidKt.t(R.string.rl, composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return strT;
    }

    public final String rl(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(187295226, i2, -1, "androidx.compose.foundation.BasicTooltipStrings.label (BasicTooltip.android.kt:24)");
        }
        String strT = StringResources_androidKt.t(R.string.f16265t, composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return strT;
    }
}
