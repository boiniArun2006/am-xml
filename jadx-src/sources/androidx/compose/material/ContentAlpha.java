package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\u000f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Landroidx/compose/material/ContentAlpha;", "", "<init>", "()V", "", "highContrastAlpha", "lowContrastAlpha", c.f62177j, "(FFLandroidx/compose/runtime/Composer;I)F", "t", "(Landroidx/compose/runtime/Composer;I)F", "high", "nr", "medium", "rl", "disabled", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContentAlpha.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentAlpha.kt\nandroidx/compose/material/ContentAlpha\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,134:1\n75#2:135\n*S KotlinDebug\n*F\n+ 1 ContentAlpha.kt\nandroidx/compose/material/ContentAlpha\n*L\n79#1:135\n*E\n"})
public final class ContentAlpha {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ContentAlpha f21745n = new ContentAlpha();

    private ContentAlpha() {
    }

    private final float n(float f3, float f4, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1528360391, i2, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:77)");
        }
        long value = ((Color) composer.ty(ContentColorKt.n())).getValue();
        if (!MaterialTheme.f22169n.n(composer, 6).HI() ? ColorKt.xMQ(value) >= 0.5d : ColorKt.xMQ(value) <= 0.5d) {
            f3 = f4;
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return f3;
    }

    public final float nr(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1999054879, i2, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:48)");
        }
        float fN = n(0.74f, 0.6f, composer, ((i2 << 6) & 896) | 54);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return fN;
    }

    public final float rl(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(621183615, i2, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:60)");
        }
        float fN = n(0.38f, 0.38f, composer, ((i2 << 6) & 896) | 54);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return fN;
    }

    public final float t(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(629162431, i2, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:36)");
        }
        float fN = n(1.0f, 0.87f, composer, ((i2 << 6) & 896) | 54);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return fN;
    }
}
