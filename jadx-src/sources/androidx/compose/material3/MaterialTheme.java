package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/MaterialTheme;", "", "<init>", "()V", "Landroidx/compose/material3/ColorScheme;", c.f62177j, "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;", "colorScheme", "Landroidx/compose/material3/Typography;", "t", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;", "typography", "Landroidx/compose/material3/Shapes;", "rl", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Shapes;", "shapes", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialTheme\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,172:1\n77#2:173\n77#2:174\n77#2:175\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialTheme\n*L\n84#1:173\n92#1:174\n100#1:175\n*E\n"})
public final class MaterialTheme {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final MaterialTheme f26164n = new MaterialTheme();
    public static final int rl = 0;

    private MaterialTheme() {
    }

    public final ColorScheme n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-561618718, i2, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:83)");
        }
        ColorScheme colorScheme = (ColorScheme) composer.ty(ColorSchemeKt.KN());
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return colorScheme;
    }

    public final Shapes rl(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(419509830, i2, -1, "androidx.compose.material3.MaterialTheme.<get-shapes> (MaterialTheme.kt:99)");
        }
        Shapes shapes = (Shapes) composer.ty(ShapesKt.nr());
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapes;
    }

    public final Typography t(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-942794935, i2, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:91)");
        }
        Typography typography = (Typography) composer.ty(TypographyKt.rl());
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return typography;
    }
}
