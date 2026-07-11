package androidx.compose.foundation.lazy.layout;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\"\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", c.f62177j, "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "androidx/compose/foundation/lazy/layout/PrefetchScheduler_androidKt$RobolectricImpl$1", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler_androidKt$RobolectricImpl$1;", "getRobolectricImpl$annotations", "()V", "RobolectricImpl", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPrefetchScheduler.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrefetchScheduler.android.kt\nandroidx/compose/foundation/lazy/layout/PrefetchScheduler_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,220:1\n75#2:221\n1247#3,6:222\n*S KotlinDebug\n*F\n+ 1 PrefetchScheduler.android.kt\nandroidx/compose/foundation/lazy/layout/PrefetchScheduler_androidKt\n*L\n37#1:221\n38#1:222,6\n*E\n"})
public final class PrefetchScheduler_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final PrefetchScheduler_androidKt$RobolectricImpl$1 f18596n;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        f18596n = Intrinsics.areEqual(lowerCase, "robolectric") ? new PrefetchScheduler() { // from class: androidx.compose.foundation.lazy.layout.PrefetchScheduler_androidKt$RobolectricImpl$1
            @Override // androidx.compose.foundation.lazy.layout.PrefetchScheduler
            public void n(PrefetchRequest prefetchRequest) {
            }
        } : 0;
    }

    public static final PrefetchScheduler n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1141871251, i2, -1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:32)");
        }
        PrefetchScheduler prefetchScheduler = f18596n;
        if (prefetchScheduler != null) {
            composer.eF(1213893039);
            composer.Xw();
        } else {
            composer.eF(1213931944);
            View view = (View) composer.ty(AndroidCompositionLocals_androidKt.gh());
            boolean zP5 = composer.p5(view);
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new AndroidPrefetchScheduler(view);
                composer.o(objIF);
            }
            prefetchScheduler = (AndroidPrefetchScheduler) objIF;
            composer.Xw();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return prefetchScheduler;
    }
}
