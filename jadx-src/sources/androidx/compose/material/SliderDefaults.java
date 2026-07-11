package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jv\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/material/SliderDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "thumbColor", "disabledThumbColor", "activeTrackColor", "inactiveTrackColor", "disabledActiveTrackColor", "disabledInactiveTrackColor", "activeTickColor", "inactiveTickColor", "disabledActiveTickColor", "disabledInactiveTickColor", "Landroidx/compose/material/SliderColors;", c.f62177j, "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SliderColors;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SliderDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SliderDefaults f22747n = new SliderDefaults();

    public final SliderColors n(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, Composer composer, int i2, int i3, int i5) {
        long jUo;
        long j13;
        long jAz;
        long j14;
        long jAz2;
        long j15;
        long jAz3;
        long j16;
        long jAz4;
        long j17;
        long jAz5;
        long j18;
        long jMUb = (i5 & 1) != 0 ? MaterialTheme.f22169n.n(composer, 6).mUb() : j2;
        if ((i5 & 2) != 0) {
            MaterialTheme materialTheme = MaterialTheme.f22169n;
            jUo = ColorKt.Uo(Color.az(materialTheme.n(composer, 6).xMQ(), ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), materialTheme.n(composer, 6).ty());
        } else {
            jUo = j3;
        }
        long jMUb2 = (i5 & 4) != 0 ? MaterialTheme.f22169n.n(composer, 6).mUb() : j4;
        if ((i5 & 8) != 0) {
            long j19 = jMUb2;
            jAz = Color.az(j19, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
            j13 = j19;
        } else {
            j13 = jMUb2;
            jAz = j5;
        }
        long jAz6 = (i5 & 16) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        if ((i5 & 32) != 0) {
            long j20 = jAz6;
            jAz2 = Color.az(j20, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            j14 = j20;
        } else {
            j14 = jAz6;
            jAz2 = j7;
        }
        long jAz7 = (i5 & 64) != 0 ? Color.az(ColorsKt.rl(j13, composer, (i2 >> 6) & 14), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j9;
        if ((i5 & 128) != 0) {
            long j21 = j13;
            jAz3 = Color.az(j21, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
            j15 = j21;
        } else {
            j15 = j13;
            jAz3 = j10;
        }
        if ((i5 & 256) != 0) {
            long j22 = jAz7;
            jAz4 = Color.az(j22, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            j16 = j22;
        } else {
            j16 = jAz7;
            jAz4 = j11;
        }
        if ((i5 & 512) != 0) {
            long j23 = jAz2;
            jAz5 = Color.az(j23, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            j17 = j23;
        } else {
            j17 = jAz2;
            jAz5 = j12;
        }
        if (ComposerKt.v()) {
            j18 = jAz5;
            ComposerKt.p5(436017687, i2, i3, "androidx.compose.material.SliderDefaults.colors (Slider.kt:607)");
        } else {
            j18 = jAz5;
        }
        DefaultSliderColors defaultSliderColors = new DefaultSliderColors(jMUb, jUo, j15, jAz, j14, j17, j16, jAz3, jAz4, j18, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return defaultSliderColors;
    }

    private SliderDefaults() {
    }
}
