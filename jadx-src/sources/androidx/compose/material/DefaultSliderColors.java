package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Immutable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0017\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u001a\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u001a\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u001a\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/material/DefaultSliderColors;", "Landroidx/compose/material/SliderColors;", "Landroidx/compose/ui/graphics/Color;", "thumbColor", "disabledThumbColor", "activeTrackColor", "inactiveTrackColor", "disabledActiveTrackColor", "disabledInactiveTrackColor", "activeTickColor", "inactiveTickColor", "disabledActiveTickColor", "disabledInactiveTickColor", "<init>", "(JJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Landroidx/compose/runtime/State;", "t", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, c.f62177j, "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "rl", "", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "nr", "O", "J2", "Uo", "KN", "xMQ", "mUb", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultSliderColors implements SliderColors {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final long disabledInactiveTrackColor;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final long inactiveTickColor;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long disabledActiveTrackColor;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final long activeTickColor;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final long disabledInactiveTickColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long thumbColor;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final long inactiveTrackColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long disabledThumbColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long activeTrackColor;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final long disabledActiveTickColor;

    public /* synthetic */ DefaultSliderColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j9, j10, j11, j12);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || DefaultSliderColors.class != other.getClass()) {
            return false;
        }
        DefaultSliderColors defaultSliderColors = (DefaultSliderColors) other;
        return Color.HI(this.thumbColor, defaultSliderColors.thumbColor) && Color.HI(this.disabledThumbColor, defaultSliderColors.disabledThumbColor) && Color.HI(this.activeTrackColor, defaultSliderColors.activeTrackColor) && Color.HI(this.inactiveTrackColor, defaultSliderColors.inactiveTrackColor) && Color.HI(this.disabledActiveTrackColor, defaultSliderColors.disabledActiveTrackColor) && Color.HI(this.disabledInactiveTrackColor, defaultSliderColors.disabledInactiveTrackColor) && Color.HI(this.activeTickColor, defaultSliderColors.activeTickColor) && Color.HI(this.inactiveTickColor, defaultSliderColors.inactiveTickColor) && Color.HI(this.disabledActiveTickColor, defaultSliderColors.disabledActiveTickColor) && Color.HI(this.disabledInactiveTickColor, defaultSliderColors.disabledInactiveTickColor);
    }

    private DefaultSliderColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12) {
        this.thumbColor = j2;
        this.disabledThumbColor = j3;
        this.activeTrackColor = j4;
        this.inactiveTrackColor = j5;
        this.disabledActiveTrackColor = j6;
        this.disabledInactiveTrackColor = j7;
        this.activeTickColor = j9;
        this.inactiveTickColor = j10;
        this.disabledActiveTickColor = j11;
        this.disabledInactiveTickColor = j12;
    }

    public int hashCode() {
        return (((((((((((((((((Color.XQ(this.thumbColor) * 31) + Color.XQ(this.disabledThumbColor)) * 31) + Color.XQ(this.activeTrackColor)) * 31) + Color.XQ(this.inactiveTrackColor)) * 31) + Color.XQ(this.disabledActiveTrackColor)) * 31) + Color.XQ(this.disabledInactiveTrackColor)) * 31) + Color.XQ(this.activeTickColor)) * 31) + Color.XQ(this.inactiveTickColor)) * 31) + Color.XQ(this.disabledActiveTickColor)) * 31) + Color.XQ(this.disabledInactiveTickColor);
    }

    @Override // androidx.compose.material.SliderColors
    public State n(boolean z2, boolean z3, Composer composer, int i2) {
        long j2;
        composer.eF(1575395620);
        if (ComposerKt.v()) {
            ComposerKt.p5(1575395620, i2, -1, "androidx.compose.material.DefaultSliderColors.trackColor (Slider.kt:1193)");
        }
        if (z2) {
            if (z3) {
                j2 = this.activeTrackColor;
            } else {
                j2 = this.inactiveTrackColor;
            }
        } else if (z3) {
            j2 = this.disabledActiveTrackColor;
        } else {
            j2 = this.disabledInactiveTrackColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }

    @Override // androidx.compose.material.SliderColors
    public State rl(boolean z2, boolean z3, Composer composer, int i2) {
        long j2;
        composer.eF(-1491563694);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1491563694, i2, -1, "androidx.compose.material.DefaultSliderColors.tickColor (Slider.kt:1204)");
        }
        if (z2) {
            if (z3) {
                j2 = this.activeTickColor;
            } else {
                j2 = this.inactiveTickColor;
            }
        } else if (z3) {
            j2 = this.disabledActiveTickColor;
        } else {
            j2 = this.disabledInactiveTickColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }

    @Override // androidx.compose.material.SliderColors
    public State t(boolean z2, Composer composer, int i2) {
        long j2;
        composer.eF(-1733795637);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1733795637, i2, -1, "androidx.compose.material.DefaultSliderColors.thumbColor (Slider.kt:1188)");
        }
        if (z2) {
            j2 = this.thumbColor;
        } else {
            j2 = this.disabledThumbColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }
}
