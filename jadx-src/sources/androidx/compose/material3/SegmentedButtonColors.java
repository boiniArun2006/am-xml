package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0015J%\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001a\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\"\u0010!R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b#\u0010!R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010!R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b/\u0010!R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b0\u0010\u001f\u001a\u0004\b1\u0010!R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b2\u0010\u001f\u001a\u0004\b3\u0010!R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b4\u0010\u001f\u001a\u0004\b5\u0010!\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Landroidx/compose/material3/SegmentedButtonColors;", "", "Landroidx/compose/ui/graphics/Color;", "activeContainerColor", "activeContentColor", "activeBorderColor", "inactiveContainerColor", "inactiveContentColor", "inactiveBorderColor", "disabledActiveContainerColor", "disabledActiveContentColor", "disabledActiveBorderColor", "disabledInactiveContainerColor", "disabledInactiveContentColor", "disabledInactiveBorderColor", "<init>", "(JJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, c.f62177j, "(ZZ)J", "checked", "t", "rl", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getActiveContainerColor-0d7_KjU", "()J", "getActiveContentColor-0d7_KjU", "getActiveBorderColor-0d7_KjU", "nr", "getInactiveContainerColor-0d7_KjU", "O", "getInactiveContentColor-0d7_KjU", "J2", "getInactiveBorderColor-0d7_KjU", "Uo", "getDisabledActiveContainerColor-0d7_KjU", "KN", "getDisabledActiveContentColor-0d7_KjU", "xMQ", "getDisabledActiveBorderColor-0d7_KjU", "mUb", "getDisabledInactiveContainerColor-0d7_KjU", "gh", "getDisabledInactiveContentColor-0d7_KjU", "qie", "getDisabledInactiveBorderColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,774:1\n708#2:775\n696#2:776\n708#2:777\n696#2:778\n708#2:779\n696#2:780\n708#2:781\n696#2:782\n708#2:783\n696#2:784\n708#2:785\n696#2:786\n708#2:787\n696#2:788\n708#2:789\n696#2:790\n708#2:791\n696#2:792\n708#2:793\n696#2:794\n708#2:795\n696#2:796\n708#2:797\n696#2:798\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonColors\n*L\n654#1:775\n654#1:776\n655#1:777\n655#1:778\n656#1:779\n656#1:780\n657#1:781\n657#1:782\n658#1:783\n658#1:784\n659#1:785\n659#1:786\n660#1:787\n660#1:788\n661#1:789\n661#1:790\n662#1:791\n662#1:792\n663#1:793\n663#1:794\n664#1:795\n664#1:796\n665#1:797\n665#1:798\n*E\n"})
public final class SegmentedButtonColors {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final long inactiveBorderColor;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final long disabledActiveContentColor;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long inactiveContentColor;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final long disabledActiveContainerColor;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final long disabledInactiveContentColor;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final long disabledInactiveContainerColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long activeContainerColor;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final long inactiveContainerColor;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final long disabledInactiveBorderColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long activeContentColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long activeBorderColor;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final long disabledActiveBorderColor;

    public /* synthetic */ SegmentedButtonColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j9, j10, j11, j12, j13, j14);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || SegmentedButtonColors.class != other.getClass()) {
            return false;
        }
        SegmentedButtonColors segmentedButtonColors = (SegmentedButtonColors) other;
        return Color.HI(this.activeBorderColor, segmentedButtonColors.activeBorderColor) && Color.HI(this.activeContentColor, segmentedButtonColors.activeContentColor) && Color.HI(this.activeContainerColor, segmentedButtonColors.activeContainerColor) && Color.HI(this.inactiveBorderColor, segmentedButtonColors.inactiveBorderColor) && Color.HI(this.inactiveContentColor, segmentedButtonColors.inactiveContentColor) && Color.HI(this.inactiveContainerColor, segmentedButtonColors.inactiveContainerColor) && Color.HI(this.disabledActiveBorderColor, segmentedButtonColors.disabledActiveBorderColor) && Color.HI(this.disabledActiveContentColor, segmentedButtonColors.disabledActiveContentColor) && Color.HI(this.disabledActiveContainerColor, segmentedButtonColors.disabledActiveContainerColor) && Color.HI(this.disabledInactiveBorderColor, segmentedButtonColors.disabledInactiveBorderColor) && Color.HI(this.disabledInactiveContentColor, segmentedButtonColors.disabledInactiveContentColor) && Color.HI(this.disabledInactiveContainerColor, segmentedButtonColors.disabledInactiveContainerColor);
    }

    private SegmentedButtonColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.activeContainerColor = j2;
        this.activeContentColor = j3;
        this.activeBorderColor = j4;
        this.inactiveContainerColor = j5;
        this.inactiveContentColor = j6;
        this.inactiveBorderColor = j7;
        this.disabledActiveContainerColor = j9;
        this.disabledActiveContentColor = j10;
        this.disabledActiveBorderColor = j11;
        this.disabledInactiveContainerColor = j12;
        this.disabledInactiveContentColor = j13;
        this.disabledInactiveBorderColor = j14;
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.XQ(this.activeBorderColor) * 31) + Color.XQ(this.activeContentColor)) * 31) + Color.XQ(this.activeContainerColor)) * 31) + Color.XQ(this.inactiveBorderColor)) * 31) + Color.XQ(this.inactiveContentColor)) * 31) + Color.XQ(this.inactiveContainerColor)) * 31) + Color.XQ(this.disabledActiveBorderColor)) * 31) + Color.XQ(this.disabledActiveContentColor)) * 31) + Color.XQ(this.disabledActiveContainerColor)) * 31) + Color.XQ(this.disabledInactiveBorderColor)) * 31) + Color.XQ(this.disabledInactiveContentColor)) * 31) + Color.XQ(this.disabledInactiveContainerColor);
    }

    public final long n(boolean enabled, boolean active) {
        return (enabled && active) ? this.activeBorderColor : (!enabled || active) ? (enabled || !active) ? this.disabledInactiveBorderColor : this.disabledActiveBorderColor : this.inactiveBorderColor;
    }

    public final long rl(boolean enabled, boolean active) {
        return (enabled && active) ? this.activeContainerColor : (!enabled || active) ? (enabled || !active) ? this.disabledInactiveContainerColor : this.disabledActiveContainerColor : this.inactiveContainerColor;
    }

    public final long t(boolean enabled, boolean checked) {
        return (enabled && checked) ? this.activeContentColor : (!enabled || checked) ? (enabled || !checked) ? this.disabledInactiveContentColor : this.disabledActiveContentColor : this.inactiveContentColor;
    }
}
