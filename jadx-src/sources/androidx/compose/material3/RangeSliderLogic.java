package androidx.compose.material3;

import GJW.C;
import GJW.vd;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/material3/RangeSliderLogic;", "", "Landroidx/compose/material3/RangeSliderState;", "state", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "startInteractionSource", "endInteractionSource", "<init>", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "", "draggingStart", c.f62177j, "(Z)Landroidx/compose/foundation/interaction/MutableInteractionSource;", "", "eventX", "", "t", "(F)I", "posX", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "LGJW/vd;", "scope", "", "rl", "(ZFLandroidx/compose/foundation/interaction/Interaction;LGJW/vd;)V", "Landroidx/compose/material3/RangeSliderState;", "getState", "()Landroidx/compose/material3/RangeSliderState;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getStartInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getEndInteractionSource", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class RangeSliderLogic {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final RangeSliderState state;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableInteractionSource startInteractionSource;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableInteractionSource endInteractionSource;

    public final MutableInteractionSource n(boolean draggingStart) {
        return draggingStart ? this.startInteractionSource : this.endInteractionSource;
    }

    public final void rl(boolean draggingStart, float posX, Interaction interaction, vd scope) {
        RangeSliderState rangeSliderState = this.state;
        rangeSliderState.aYN(draggingStart, posX - (draggingStart ? rangeSliderState.HI() : rangeSliderState.ty()));
        C.nr(scope, null, null, new RangeSliderLogic$captureThumb$1(this, draggingStart, interaction, null), 3, null);
    }

    public final int t(float eventX) {
        return Float.compare(Math.abs(this.state.HI() - eventX), Math.abs(this.state.ty() - eventX));
    }

    public RangeSliderLogic(RangeSliderState rangeSliderState, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2) {
        this.state = rangeSliderState;
        this.startInteractionSource = mutableInteractionSource;
        this.endInteractionSource = mutableInteractionSource2;
    }
}
