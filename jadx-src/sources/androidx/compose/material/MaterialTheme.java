package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/material/MaterialTheme;", "", "<init>", "()V", "Landroidx/compose/material/Colors;", c.f62177j, "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;", "colors", "Landroidx/compose/material/Typography;", "t", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;", "typography", "Landroidx/compose/material/Shapes;", "rl", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;", "shapes", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialTheme\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,113:1\n75#2:114\n75#2:115\n75#2:116\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialTheme\n*L\n99#1:114\n107#1:115\n111#1:116\n*E\n"})
public final class MaterialTheme {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final MaterialTheme f22169n = new MaterialTheme();

    private MaterialTheme() {
    }

    public final Colors n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1462282791, i2, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:98)");
        }
        Colors colors = (Colors) composer.ty(ColorsKt.O());
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return colors;
    }

    public final Shapes rl(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1586253541, i2, -1, "androidx.compose.material.MaterialTheme.<get-shapes> (MaterialTheme.kt:110)");
        }
        Shapes shapes = (Shapes) composer.ty(ShapesKt.n());
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapes;
    }

    public final Typography t(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1630198856, i2, -1, "androidx.compose.material.MaterialTheme.<get-typography> (MaterialTheme.kt:106)");
        }
        Typography typography = (Typography) composer.ty(TypographyKt.t());
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return typography;
    }
}
