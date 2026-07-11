package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b,\u0010\u001d\u001a\u0004\b-\u0010\u001fR\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b.\u0010\u001d\u001a\u0004\b/\u0010\u001f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/material3/SliderColors;", "", "Landroidx/compose/ui/graphics/Color;", "thumbColor", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "<init>", "(JJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", c.f62177j, "(Z)J", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "t", "(ZZ)J", "rl", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getThumbColor-0d7_KjU", "()J", "getActiveTrackColor-0d7_KjU", "getActiveTickColor-0d7_KjU", "nr", "getInactiveTrackColor-0d7_KjU", "O", "getInactiveTickColor-0d7_KjU", "J2", "getDisabledThumbColor-0d7_KjU", "Uo", "getDisabledActiveTrackColor-0d7_KjU", "KN", "getDisabledActiveTickColor-0d7_KjU", "xMQ", "getDisabledInactiveTrackColor-0d7_KjU", "mUb", "getDisabledInactiveTickColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2263:1\n708#2:2264\n696#2:2265\n708#2:2266\n696#2:2267\n708#2:2268\n696#2:2269\n708#2:2270\n696#2:2271\n708#2:2272\n696#2:2273\n708#2:2274\n696#2:2275\n708#2:2276\n696#2:2277\n708#2:2278\n696#2:2279\n708#2:2280\n696#2:2281\n708#2:2282\n696#2:2283\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderColors\n*L\n1798#1:2264\n1798#1:2265\n1799#1:2266\n1799#1:2267\n1800#1:2268\n1800#1:2269\n1801#1:2270\n1801#1:2271\n1802#1:2272\n1802#1:2273\n1803#1:2274\n1803#1:2275\n1804#1:2276\n1804#1:2277\n1805#1:2278\n1805#1:2279\n1806#1:2280\n1806#1:2281\n1807#1:2282\n1807#1:2283\n*E\n"})
public final class SliderColors {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final long disabledThumbColor;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final long disabledActiveTickColor;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long inactiveTickColor;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final long disabledActiveTrackColor;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final long disabledInactiveTickColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long thumbColor;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final long inactiveTrackColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long activeTrackColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long activeTickColor;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final long disabledInactiveTrackColor;

    public /* synthetic */ SliderColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j9, j10, j11, j12);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof SliderColors)) {
            return false;
        }
        SliderColors sliderColors = (SliderColors) other;
        return Color.HI(this.thumbColor, sliderColors.thumbColor) && Color.HI(this.activeTrackColor, sliderColors.activeTrackColor) && Color.HI(this.activeTickColor, sliderColors.activeTickColor) && Color.HI(this.inactiveTrackColor, sliderColors.inactiveTrackColor) && Color.HI(this.inactiveTickColor, sliderColors.inactiveTickColor) && Color.HI(this.disabledThumbColor, sliderColors.disabledThumbColor) && Color.HI(this.disabledActiveTrackColor, sliderColors.disabledActiveTrackColor) && Color.HI(this.disabledActiveTickColor, sliderColors.disabledActiveTickColor) && Color.HI(this.disabledInactiveTrackColor, sliderColors.disabledInactiveTrackColor) && Color.HI(this.disabledInactiveTickColor, sliderColors.disabledInactiveTickColor);
    }

    private SliderColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12) {
        this.thumbColor = j2;
        this.activeTrackColor = j3;
        this.activeTickColor = j4;
        this.inactiveTrackColor = j5;
        this.inactiveTickColor = j6;
        this.disabledThumbColor = j7;
        this.disabledActiveTrackColor = j9;
        this.disabledActiveTickColor = j10;
        this.disabledInactiveTrackColor = j11;
        this.disabledInactiveTickColor = j12;
    }

    public int hashCode() {
        return (((((((((((((((((Color.XQ(this.thumbColor) * 31) + Color.XQ(this.activeTrackColor)) * 31) + Color.XQ(this.activeTickColor)) * 31) + Color.XQ(this.inactiveTrackColor)) * 31) + Color.XQ(this.inactiveTickColor)) * 31) + Color.XQ(this.disabledThumbColor)) * 31) + Color.XQ(this.disabledActiveTrackColor)) * 31) + Color.XQ(this.disabledActiveTickColor)) * 31) + Color.XQ(this.disabledInactiveTrackColor)) * 31) + Color.XQ(this.disabledInactiveTickColor);
    }

    public final long n(boolean enabled) {
        return enabled ? this.thumbColor : this.disabledThumbColor;
    }

    public final long rl(boolean enabled, boolean active) {
        return enabled ? active ? this.activeTickColor : this.inactiveTickColor : active ? this.disabledActiveTickColor : this.disabledInactiveTickColor;
    }

    public final long t(boolean enabled, boolean active) {
        return enabled ? active ? this.activeTrackColor : this.inactiveTrackColor : active ? this.disabledActiveTrackColor : this.disabledInactiveTrackColor;
    }
}
