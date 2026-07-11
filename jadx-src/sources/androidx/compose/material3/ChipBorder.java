package androidx.compose.material3;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Deprecated(level = DeprecationLevel.WARNING, message = "Maintained for binary compatibility. Use the chipBorder functions instead")
@Immutable
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/ChipBorder;", "", "Landroidx/compose/ui/graphics/Color;", "borderColor", "disabledBorderColor", "Landroidx/compose/ui/unit/Dp;", "borderWidth", "<init>", "(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", c.f62177j, "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "rl", "t", "F", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ChipBorder {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long borderColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long disabledBorderColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float borderWidth;

    public /* synthetic */ ChipBorder(long j2, long j3, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, f3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof ChipBorder)) {
            return false;
        }
        ChipBorder chipBorder = (ChipBorder) other;
        return Color.HI(this.borderColor, chipBorder.borderColor) && Color.HI(this.disabledBorderColor, chipBorder.disabledBorderColor) && Dp.mUb(this.borderWidth, chipBorder.borderWidth);
    }

    private ChipBorder(long j2, long j3, float f3) {
        this.borderColor = j2;
        this.disabledBorderColor = j3;
        this.borderWidth = f3;
    }

    public int hashCode() {
        return (((Color.XQ(this.borderColor) * 31) + Color.XQ(this.disabledBorderColor)) * 31) + Dp.gh(this.borderWidth);
    }

    public final State n(boolean z2, Composer composer, int i2) {
        long j2;
        if (ComposerKt.v()) {
            ComposerKt.p5(1899621712, i2, -1, "androidx.compose.material3.ChipBorder.borderStroke (Chip.kt:2733)");
        }
        float f3 = this.borderWidth;
        if (z2) {
            j2 = this.borderColor;
        } else {
            j2 = this.disabledBorderColor;
        }
        State stateCk = SnapshotStateKt.ck(BorderStrokeKt.n(f3, j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateCk;
    }
}
