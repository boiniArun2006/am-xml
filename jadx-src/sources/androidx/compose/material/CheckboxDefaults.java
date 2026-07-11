package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/material/CheckboxDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "checkedColor", "uncheckedColor", "checkmarkColor", "disabledColor", "disabledIndeterminateColor", "Landroidx/compose/material/CheckboxColors;", c.f62177j, "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/CheckboxColors;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,484:1\n1247#2,6:485\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxDefaults\n*L\n229#1:485,6\n*E\n"})
public final class CheckboxDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CheckboxDefaults f21620n = new CheckboxDefaults();

    public final CheckboxColors n(long j2, long j3, long j4, long j5, long j6, Composer composer, int i2, int i3) {
        long j7;
        long jAz;
        long jQie = (i3 & 1) != 0 ? MaterialTheme.f22169n.n(composer, 6).qie() : j2;
        long jAz2 = (i3 & 2) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jTy = (i3 & 4) != 0 ? MaterialTheme.f22169n.n(composer, 6).ty() : j4;
        long jAz3 = (i3 & 8) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if ((i3 & 16) != 0) {
            long j9 = jQie;
            jAz = Color.az(j9, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j7 = j9;
        } else {
            j7 = jQie;
            jAz = j6;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(469524104, i2, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:227)");
        }
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && composer.nr(j7)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.nr(jAz2)) || (i2 & 48) == 32) | ((((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.nr(jTy)) || (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && composer.nr(jAz3)) || (i2 & 3072) == 2048) | ((((57344 & i2) ^ 24576) > 16384 && composer.nr(jAz)) || (i2 & 24576) == 16384);
        Object objIF = composer.iF();
        if (z2 || objIF == Composer.INSTANCE.n()) {
            long j10 = j7;
            long j11 = jAz3;
            DefaultCheckboxColors defaultCheckboxColors = new DefaultCheckboxColors(jTy, Color.az(jTy, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j10, Color.az(j10, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j11, Color.az(jAz3, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), jAz, j10, jAz2, jAz3, jAz, null);
            composer.o(defaultCheckboxColors);
            objIF = defaultCheckboxColors;
        }
        DefaultCheckboxColors defaultCheckboxColors2 = (DefaultCheckboxColors) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return defaultCheckboxColors2;
    }

    private CheckboxDefaults() {
    }
}
