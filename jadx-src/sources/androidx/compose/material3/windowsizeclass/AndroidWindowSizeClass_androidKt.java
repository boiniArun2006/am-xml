package androidx.compose.material3.windowsizeclass;

import android.app.Activity;
import androidx.compose.material3.windowsizeclass.WindowSizeClass;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.window.sidecar.WindowMetricsCalculator;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/app/Activity;", "activity", "Landroidx/compose/material3/windowsizeclass/WindowSizeClass;", c.f62177j, "(Landroid/app/Activity;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/windowsizeclass/WindowSizeClass;", "material3-window-size-class_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidWindowSizeClass.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidWindowSizeClass.android.kt\nandroidx/compose/material3/windowsizeclass/AndroidWindowSizeClass_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n77#2:49\n77#2:50\n1#3:51\n*S KotlinDebug\n*F\n+ 1 AndroidWindowSizeClass.android.kt\nandroidx/compose/material3/windowsizeclass/AndroidWindowSizeClass_androidKt\n*L\n42#1:49\n43#1:50\n*E\n"})
public final class AndroidWindowSizeClass_androidKt {
    public static final WindowSizeClass n(Activity activity, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(866044206, i2, -1, "androidx.compose.material3.windowsizeclass.calculateWindowSizeClass (AndroidWindowSizeClass.android.kt:36)");
        }
        composer.ty(AndroidCompositionLocals_androidKt.J2());
        WindowSizeClass windowSizeClassRl = WindowSizeClass.Companion.rl(WindowSizeClass.INSTANCE, ((Density) composer.ty(CompositionLocalsKt.J2())).Ik(RectHelper_androidKt.O(WindowMetricsCalculator.INSTANCE.n().n(activity).n()).Ik()), null, null, 6, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return windowSizeClassRl;
    }
}
