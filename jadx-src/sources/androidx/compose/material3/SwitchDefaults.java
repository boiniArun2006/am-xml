package androidx.compose.material3;

import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J²\u0001\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001e\u001a\u00020\u001a8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u00020\u0004*\u00020\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/material3/SwitchDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/SwitchColors;", c.f62177j, "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SwitchColors;", "Landroidx/compose/ui/graphics/Color;", "checkedThumbColor", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "rl", "(JJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SwitchColors;", "Landroidx/compose/ui/unit/Dp;", "F", "getIconSize-D9Ej5fM", "()F", "IconSize", "Landroidx/compose/material3/ColorScheme;", "t", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SwitchColors;", "defaultSwitchColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,625:1\n1#2:626\n148#3:627\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchDefaults\n*L\n429#1:627\n*E\n"})
public final class SwitchDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SwitchDefaults f28005n = new SwitchDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float IconSize = Dp.KN(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f28006t = 0;

    public final SwitchColors rl(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, Composer composer, int i2, int i3, int i5) {
        long j19;
        long j20;
        long jUo;
        long j21;
        long jUo2;
        long j22;
        long jUo3;
        long j23;
        long jUo4;
        long j24;
        long jUo5;
        long j25;
        int i7;
        long jUo6;
        long j26;
        long jUo7;
        long jXMQ = (i5 & 1) != 0 ? ColorSchemeKt.xMQ(SwitchTokens.f29933n.HI(), composer, 6) : j2;
        long jXMQ2 = (i5 & 2) != 0 ? ColorSchemeKt.xMQ(SwitchTokens.f29933n.r(), composer, 6) : j3;
        long jJ2 = (i5 & 4) != 0 ? Color.INSTANCE.J2() : j4;
        long jXMQ3 = (i5 & 8) != 0 ? ColorSchemeKt.xMQ(SwitchTokens.f29933n.Ik(), composer, 6) : j5;
        long jXMQ4 = (i5 & 16) != 0 ? ColorSchemeKt.xMQ(SwitchTokens.f29933n.ViF(), composer, 6) : j6;
        long jXMQ5 = (i5 & 32) != 0 ? ColorSchemeKt.xMQ(SwitchTokens.f29933n.te(), composer, 6) : j7;
        long jXMQ6 = (i5 & 64) != 0 ? ColorSchemeKt.xMQ(SwitchTokens.f29933n.aYN(), composer, 6) : j9;
        long jXMQ7 = (i5 & 128) != 0 ? ColorSchemeKt.xMQ(SwitchTokens.f29933n.g(), composer, 6) : j10;
        if ((i5 & 256) != 0) {
            SwitchTokens switchTokens = SwitchTokens.f29933n;
            j19 = jXMQ;
            j20 = jXMQ2;
            jUo = ColorKt.Uo(Color.az(ColorSchemeKt.xMQ(switchTokens.n(), composer, 6), switchTokens.rl(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.f26164n.n(composer, 6).getSurface());
        } else {
            j19 = jXMQ;
            j20 = jXMQ2;
            jUo = j11;
        }
        if ((i5 & 512) != 0) {
            SwitchTokens switchTokens2 = SwitchTokens.f29933n;
            j21 = jUo;
            jUo2 = ColorKt.Uo(Color.az(ColorSchemeKt.xMQ(switchTokens2.O(), composer, 6), switchTokens2.J2(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.f26164n.n(composer, 6).getSurface());
        } else {
            j21 = jUo;
            jUo2 = j12;
        }
        long jJ22 = (i5 & 1024) != 0 ? Color.INSTANCE.J2() : j13;
        if ((i5 & 2048) != 0) {
            SwitchTokens switchTokens3 = SwitchTokens.f29933n;
            j22 = jUo2;
            jUo3 = ColorKt.Uo(Color.az(ColorSchemeKt.xMQ(switchTokens3.t(), composer, 6), switchTokens3.nr(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.f26164n.n(composer, 6).getSurface());
        } else {
            j22 = jUo2;
            jUo3 = j14;
        }
        if ((i5 & 4096) != 0) {
            SwitchTokens switchTokens4 = SwitchTokens.f29933n;
            j23 = jUo3;
            jUo4 = ColorKt.Uo(Color.az(ColorSchemeKt.xMQ(switchTokens4.Uo(), composer, 6), switchTokens4.KN(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.f26164n.n(composer, 6).getSurface());
        } else {
            j23 = jUo3;
            jUo4 = j15;
        }
        if ((i5 & 8192) != 0) {
            SwitchTokens switchTokens5 = SwitchTokens.f29933n;
            j24 = jUo4;
            jUo5 = ColorKt.Uo(Color.az(ColorSchemeKt.xMQ(switchTokens5.gh(), composer, 6), switchTokens5.J2(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.f26164n.n(composer, 6).getSurface());
        } else {
            j24 = jUo4;
            jUo5 = j16;
        }
        if ((i5 & 16384) != 0) {
            SwitchTokens switchTokens6 = SwitchTokens.f29933n;
            i7 = 6;
            j25 = jUo5;
            jUo6 = ColorKt.Uo(Color.az(ColorSchemeKt.xMQ(switchTokens6.qie(), composer, 6), switchTokens6.J2(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.f26164n.n(composer, 6).getSurface());
        } else {
            j25 = jUo5;
            i7 = 6;
            jUo6 = j17;
        }
        if ((i5 & 32768) != 0) {
            SwitchTokens switchTokens7 = SwitchTokens.f29933n;
            j26 = jUo6;
            jUo7 = ColorKt.Uo(Color.az(ColorSchemeKt.xMQ(switchTokens7.xMQ(), composer, i7), switchTokens7.mUb(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.f26164n.n(composer, i7).getSurface());
        } else {
            j26 = jUo6;
            jUo7 = j18;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(1937926421, i2, i3, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:362)");
        }
        long j27 = j20;
        long j28 = j19;
        SwitchColors switchColors = new SwitchColors(j28, j27, jJ2, jXMQ3, jXMQ4, jXMQ5, jXMQ6, jXMQ7, j21, j22, jJ22, j23, j24, j25, j26, jUo7, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return switchColors;
    }

    public final SwitchColors t(ColorScheme colorScheme) {
        SwitchColors defaultSwitchColorsCached = colorScheme.getDefaultSwitchColorsCached();
        if (defaultSwitchColorsCached != null) {
            return defaultSwitchColorsCached;
        }
        SwitchTokens switchTokens = SwitchTokens.f29933n;
        long jUo = ColorSchemeKt.Uo(colorScheme, switchTokens.HI());
        long jUo2 = ColorSchemeKt.Uo(colorScheme, switchTokens.r());
        Color.Companion companion = Color.INSTANCE;
        SwitchColors switchColors = new SwitchColors(jUo, jUo2, companion.J2(), ColorSchemeKt.Uo(colorScheme, switchTokens.Ik()), ColorSchemeKt.Uo(colorScheme, switchTokens.ViF()), ColorSchemeKt.Uo(colorScheme, switchTokens.te()), ColorSchemeKt.Uo(colorScheme, switchTokens.aYN()), ColorSchemeKt.Uo(colorScheme, switchTokens.g()), ColorKt.Uo(Color.az(ColorSchemeKt.Uo(colorScheme, switchTokens.n()), switchTokens.rl(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), ColorKt.Uo(Color.az(ColorSchemeKt.Uo(colorScheme, switchTokens.O()), switchTokens.J2(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), companion.J2(), ColorKt.Uo(Color.az(ColorSchemeKt.Uo(colorScheme, switchTokens.t()), switchTokens.nr(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), ColorKt.Uo(Color.az(ColorSchemeKt.Uo(colorScheme, switchTokens.Uo()), switchTokens.KN(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), ColorKt.Uo(Color.az(ColorSchemeKt.Uo(colorScheme, switchTokens.gh()), switchTokens.J2(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), ColorKt.Uo(Color.az(ColorSchemeKt.Uo(colorScheme, switchTokens.qie()), switchTokens.J2(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), ColorKt.Uo(Color.az(ColorSchemeKt.Uo(colorScheme, switchTokens.xMQ()), switchTokens.mUb(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), null);
        colorScheme.Zmq(switchColors);
        return switchColors;
    }

    private SwitchDefaults() {
    }

    public final SwitchColors n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(435552781, i2, -1, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:299)");
        }
        SwitchColors switchColorsT = t(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return switchColorsT;
    }
}
