package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/material/FloatingActionButtonDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "Landroidx/compose/material/FloatingActionButtonElevation;", c.f62177j, "(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,398:1\n149#2:399\n149#2:400\n149#2:401\n149#2:402\n149#2:403\n149#2:404\n149#2:405\n149#2:406\n1247#3,6:407\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonDefaults\n*L\n213#1:399\n214#1:400\n219#1:401\n220#1:402\n235#1:403\n236#1:404\n237#1:405\n238#1:406\n240#1:407,6\n*E\n"})
public final class FloatingActionButtonDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final FloatingActionButtonDefaults f22054n = new FloatingActionButtonDefaults();

    public final FloatingActionButtonElevation n(float f3, float f4, float f5, float f6, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f3 = Dp.KN(6);
        }
        float f7 = f3;
        if ((i3 & 2) != 0) {
            f4 = Dp.KN(12);
        }
        float f8 = f4;
        if ((i3 & 4) != 0) {
            f5 = Dp.KN(8);
        }
        float f9 = f5;
        if ((i3 & 8) != 0) {
            f6 = Dp.KN(8);
        }
        float f10 = f6;
        if (ComposerKt.v()) {
            ComposerKt.p5(380403812, i2, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:238)");
        }
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && composer.rl(f7)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.rl(f8)) || (i2 & 48) == 32) | ((((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.rl(f9)) || (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && composer.rl(f10)) || (i2 & 3072) == 2048);
        Object objIF = composer.iF();
        if (z2 || objIF == Composer.INSTANCE.n()) {
            DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = new DefaultFloatingActionButtonElevation(f7, f8, f9, f10, null);
            composer.o(defaultFloatingActionButtonElevation);
            objIF = defaultFloatingActionButtonElevation;
        }
        DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation2 = (DefaultFloatingActionButtonElevation) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return defaultFloatingActionButtonElevation2;
    }

    private FloatingActionButtonDefaults() {
    }
}
