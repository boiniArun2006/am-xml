package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jv\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/SwitchDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "checkedThumbColor", "checkedTrackColor", "", "checkedTrackAlpha", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedTrackAlpha", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "Landroidx/compose/material/SwitchColors;", c.f62177j, "(JJFJJFJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SwitchColors;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SwitchDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SwitchDefaults f23296n = new SwitchDefaults();

    public final SwitchColors n(long j2, long j3, float f3, long j4, long j5, float f4, long j6, long j7, long j9, long j10, Composer composer, int i2, int i3, int i5) {
        long j11;
        long j12;
        long jUo;
        long j13;
        float f5;
        long j14;
        long jUo2;
        long j15;
        int i7;
        long jUo3;
        long jAz = (i5 & 1) != 0 ? MaterialTheme.f22169n.n(composer, 6).az() : j2;
        long j16 = (i5 & 2) != 0 ? jAz : j3;
        float f6 = (i5 & 4) != 0 ? 0.54f : f3;
        long jTy = (i5 & 8) != 0 ? MaterialTheme.f22169n.n(composer, 6).ty() : j4;
        long jXMQ = (i5 & 16) != 0 ? MaterialTheme.f22169n.n(composer, 6).xMQ() : j5;
        float f7 = (i5 & 32) != 0 ? 0.38f : f4;
        if ((i5 & 64) != 0) {
            long j17 = jAz;
            long jAz2 = Color.az(j17, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j11 = j17;
            j12 = j16;
            jUo = ColorKt.Uo(jAz2, MaterialTheme.f22169n.n(composer, 6).ty());
        } else {
            j11 = jAz;
            j12 = j16;
            jUo = j6;
        }
        if ((i5 & 128) != 0) {
            j13 = j12;
            f5 = f6;
            j14 = jUo;
            jUo2 = ColorKt.Uo(Color.az(j12, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.f22169n.n(composer, 6).ty());
        } else {
            j13 = j12;
            f5 = f6;
            j14 = jUo;
            jUo2 = j7;
        }
        if ((i5 & 256) != 0) {
            i7 = 6;
            j15 = jUo2;
            jUo3 = ColorKt.Uo(Color.az(jTy, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.f22169n.n(composer, 6).ty());
        } else {
            j15 = jUo2;
            i7 = 6;
            jUo3 = j9;
        }
        long jUo4 = (i5 & 512) != 0 ? ColorKt.Uo(Color.az(jXMQ, ContentAlpha.f21745n.rl(composer, i7), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.f22169n.n(composer, i7).ty()) : j10;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1032127534, i2, i3, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:342)");
        }
        DefaultSwitchColors defaultSwitchColors = new DefaultSwitchColors(j11, Color.az(j13, f5, 0.0f, 0.0f, 0.0f, 14, null), jTy, Color.az(jXMQ, f7, 0.0f, 0.0f, 0.0f, 14, null), j14, Color.az(j15, f5, 0.0f, 0.0f, 0.0f, 14, null), jUo3, Color.az(jUo4, f7, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return defaultSwitchColors;
    }

    private SwitchDefaults() {
    }
}
