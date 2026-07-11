package androidx.compose.ui.res;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.res.ResourcesCompat;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "id", "Landroidx/compose/ui/graphics/Color;", c.f62177j, "(ILandroidx/compose/runtime/Composer;I)J", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColorResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorResources.android.kt\nandroidx/compose/ui/res/ColorResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,38:1\n75#2:39\n*S KotlinDebug\n*F\n+ 1 ColorResources.android.kt\nandroidx/compose/ui/res/ColorResources_androidKt\n*L\n35#1:39\n*E\n"})
public final class ColorResources_androidKt {
    public static final long n(int i2, Composer composer, int i3) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1777644873, i3, -1, "androidx.compose.ui.res.colorResource (ColorResources.android.kt:33)");
        }
        long jRl = ColorKt.rl(ResourcesCompat.nr(Resources_androidKt.n(composer, 0), i2, ((Context) composer.ty(AndroidCompositionLocals_androidKt.Uo())).getTheme()));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jRl;
    }
}
