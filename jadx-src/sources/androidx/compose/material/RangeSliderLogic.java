package androidx.compose.material;

import GJW.C;
import GJW.vd;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u001e\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\t0\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R/\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\t0\u00058\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#¨\u0006("}, d2 = {"Landroidx/compose/material/RangeSliderLogic;", "", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "startInteractionSource", "endInteractionSource", "Landroidx/compose/runtime/State;", "", "rawOffsetStart", "rawOffsetEnd", "Lkotlin/Function2;", "", "", "onDrag", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "draggingStart", c.f62177j, "(Z)Landroidx/compose/foundation/interaction/MutableInteractionSource;", "eventX", "", "t", "(F)I", "posX", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "LGJW/vd;", "scope", "rl", "(ZFLandroidx/compose/foundation/interaction/Interaction;LGJW/vd;)V", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getStartInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getEndInteractionSource", "Landroidx/compose/runtime/State;", "getRawOffsetStart", "()Landroidx/compose/runtime/State;", "nr", "getRawOffsetEnd", "O", "getOnDrag", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class RangeSliderLogic {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final State onDrag;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableInteractionSource startInteractionSource;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final State rawOffsetEnd;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableInteractionSource endInteractionSource;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final State rawOffsetStart;

    public final MutableInteractionSource n(boolean draggingStart) {
        return draggingStart ? this.startInteractionSource : this.endInteractionSource;
    }

    public final void rl(boolean draggingStart, float posX, Interaction interaction, vd scope) {
        ((Function2) this.onDrag.getValue()).invoke(Boolean.valueOf(draggingStart), Float.valueOf(posX - ((Number) (draggingStart ? this.rawOffsetStart : this.rawOffsetEnd).getValue()).floatValue()));
        C.nr(scope, null, null, new RangeSliderLogic$captureThumb$1(this, draggingStart, interaction, null), 3, null);
    }

    public final int t(float eventX) {
        return Float.compare(Math.abs(((Number) this.rawOffsetStart.getValue()).floatValue() - eventX), Math.abs(((Number) this.rawOffsetEnd.getValue()).floatValue() - eventX));
    }

    public RangeSliderLogic(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State state, State state2, State state3) {
        this.startInteractionSource = mutableInteractionSource;
        this.endInteractionSource = mutableInteractionSource2;
        this.rawOffsetStart = state;
        this.rawOffsetEnd = state2;
        this.onDrag = state3;
    }
}
