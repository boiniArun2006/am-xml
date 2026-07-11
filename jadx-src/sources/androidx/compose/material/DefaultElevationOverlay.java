package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/material/DefaultElevationOverlay;", "Landroidx/compose/material/ElevationOverlay;", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/unit/Dp;", "elevation", c.f62177j, "(JFLandroidx/compose/runtime/Composer;I)J", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nElevationOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElevationOverlay.kt\nandroidx/compose/material/DefaultElevationOverlay\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,101:1\n149#2:102\n*S KotlinDebug\n*F\n+ 1 ElevationOverlay.kt\nandroidx/compose/material/DefaultElevationOverlay\n*L\n70#1:102\n*E\n"})
final class DefaultElevationOverlay implements ElevationOverlay {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DefaultElevationOverlay f21770n = new DefaultElevationOverlay();

    private DefaultElevationOverlay() {
    }

    @Override // androidx.compose.material.ElevationOverlay
    public long n(long j2, float f3, Composer composer, int i2) {
        composer.eF(-1687113661);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1687113661, i2, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:67)");
        }
        Colors colorsN = MaterialTheme.f22169n.n(composer, 6);
        if (Dp.Uo(f3, Dp.KN(0)) > 0 && !colorsN.HI()) {
            composer.eF(1169017931);
            j2 = ColorKt.Uo(ElevationOverlayKt.rl(j2, f3, composer, i2 & 126), j2);
            composer.Xw();
        } else {
            composer.eF(1169156439);
            composer.Xw();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return j2;
    }
}
