package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/material/RadioButtonDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "selectedColor", "unselectedColor", "disabledColor", "Landroidx/compose/material/RadioButtonColors;", c.f62177j, "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/RadioButtonColors;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,224:1\n1247#2,6:225\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n*L\n164#1:225,6\n*E\n"})
public final class RadioButtonDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final RadioButtonDefaults f22577n = new RadioButtonDefaults();
    public static final int rl = 0;

    public final RadioButtonColors n(long j2, long j3, long j4, Composer composer, int i2, int i3) {
        long jQie = (i3 & 1) != 0 ? MaterialTheme.f22169n.n(composer, 6).qie() : j2;
        long jAz = (i3 & 2) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jAz2 = (i3 & 4) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.v()) {
            ComposerKt.p5(1370708026, i2, -1, "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:162)");
        }
        boolean z2 = (((6 ^ (i2 & 14)) > 4 && composer.nr(jQie)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.nr(jAz)) || (i2 & 48) == 32) | ((((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.nr(jAz2)) || (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
        Object objIF = composer.iF();
        if (z2 || objIF == Composer.INSTANCE.n()) {
            DefaultRadioButtonColors defaultRadioButtonColors = new DefaultRadioButtonColors(jQie, jAz, jAz2, null);
            composer.o(defaultRadioButtonColors);
            objIF = defaultRadioButtonColors;
        }
        DefaultRadioButtonColors defaultRadioButtonColors2 = (DefaultRadioButtonColors) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return defaultRadioButtonColors2;
    }

    private RadioButtonDefaults() {
    }
}
