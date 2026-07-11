package androidx.compose.material.pullrefresh;

import GJW.C;
import GJW.vd;
import GJW.xuv;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010#\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\bR+\u0010*\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\u0012R+\u0010.\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\b\"\u0004\b-\u0010\u0015R+\u00101\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010+\u001a\u0004\b/\u0010\b\"\u0004\b0\u0010\u0015R+\u00104\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010+\u001a\u0004\b2\u0010\b\"\u0004\b3\u0010\u0015R+\u00107\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010+\u001a\u0004\b5\u0010\b\"\u0004\b6\u0010\u0015R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0011\u0010=\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b<\u0010\bR\u0014\u0010\u000f\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010(R\u0014\u0010?\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\b¨\u0006A"}, d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshState;", "", "", "offset", "LGJW/xuv;", "O", "(F)LGJW/xuv;", "J2", "()F", "pullDelta", "Ik", "(F)F", "velocity", "r", "", "refreshing", "", "Z", "(Z)V", "threshold", "S", "(F)V", "refreshingOffset", "XQ", "LGJW/vd;", c.f62177j, "LGJW/vd;", "animationScope", "Landroidx/compose/runtime/State;", "Lkotlin/Function0;", "rl", "Landroidx/compose/runtime/State;", "onRefreshState", "t", "Uo", "adjustedDistancePulled", "<set-?>", "nr", "Landroidx/compose/runtime/MutableState;", "ty", "()Z", "aYN", "_refreshing", "Landroidx/compose/runtime/MutableFloatState;", "az", "WPU", "_position", "KN", "o", "distancePulled", "ck", "nY", "_threshold", "HI", "ViF", "_refreshingOffset", "Landroidx/compose/foundation/MutatorMutex;", "xMQ", "Landroidx/compose/foundation/MutatorMutex;", "mutatorMutex", "mUb", "progress", "gh", "position", "qie", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,241:1\n85#2:242\n85#2:243\n113#2,2:244\n79#3:246\n112#3,2:247\n79#3:249\n112#3,2:250\n79#3:252\n112#3,2:253\n79#3:255\n112#3,2:256\n71#4,16:258\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n*L\n128#1:242\n130#1:243\n130#1:244,2\n131#1:246\n131#1:247,2\n132#1:249\n132#1:250,2\n133#1:252\n133#1:253,2\n134#1:255\n134#1:256,2\n211#1:258,16\n*E\n"})
public final class PullRefreshState {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableFloatState distancePulled;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final MutableFloatState _refreshingOffset;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableFloatState _position;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final MutableFloatState _threshold;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final vd animationScope;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableState _refreshing;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final State onRefreshState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final State adjustedDistancePulled;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final MutatorMutex mutatorMutex;

    private final float HI() {
        return this._refreshingOffset.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float KN() {
        return this.distancePulled.n();
    }

    private final xuv O(float offset) {
        return C.nr(this.animationScope, null, null, new PullRefreshState$animateIndicatorTo$1(this, offset, null), 3, null);
    }

    private final float Uo() {
        return ((Number) this.adjustedDistancePulled.getValue()).floatValue();
    }

    private final void ViF(float f3) {
        this._refreshingOffset.Z(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void WPU(float f3) {
        this._position.Z(f3);
    }

    private final void aYN(boolean z2) {
        this._refreshing.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float az() {
        return this._position.n();
    }

    private final float ck() {
        return this._threshold.n();
    }

    private final void nY(float f3) {
        this._threshold.Z(f3);
    }

    private final void o(float f3) {
        this.distancePulled.Z(f3);
    }

    private final boolean ty() {
        return ((Boolean) this._refreshing.getValue()).booleanValue();
    }

    private final float J2() {
        if (Uo() <= qie()) {
            return Uo();
        }
        float fAbs = Math.abs(mUb()) - 1.0f;
        if (fAbs < 0.0f) {
            fAbs = 0.0f;
        }
        if (fAbs > 2.0f) {
            fAbs = 2.0f;
        }
        return qie() + (qie() * (fAbs - (((float) Math.pow(fAbs, 2)) / 4)));
    }

    public final float Ik(float pullDelta) {
        if (ty()) {
            return 0.0f;
        }
        float fCoerceAtLeast = RangesKt.coerceAtLeast(KN() + pullDelta, 0.0f);
        float fKN = fCoerceAtLeast - KN();
        o(fCoerceAtLeast);
        WPU(J2());
        return fKN;
    }

    public final void S(float threshold) {
        nY(threshold);
    }

    public final void XQ(float refreshingOffset) {
        if (HI() == refreshingOffset) {
            return;
        }
        ViF(refreshingOffset);
        if (gh()) {
            O(refreshingOffset);
        }
    }

    public final void Z(boolean refreshing) {
        if (ty() != refreshing) {
            aYN(refreshing);
            float fHI = 0.0f;
            o(0.0f);
            if (refreshing) {
                fHI = HI();
            }
            O(fHI);
        }
    }

    public final boolean gh() {
        return ty();
    }

    public final float mUb() {
        return Uo() / qie();
    }

    public final float qie() {
        return ck();
    }

    public final float r(float velocity) {
        if (gh()) {
            return 0.0f;
        }
        if (Uo() > qie()) {
            ((Function0) this.onRefreshState.getValue()).invoke();
        }
        O(0.0f);
        if (KN() == 0.0f || velocity < 0.0f) {
            velocity = 0.0f;
        }
        o(0.0f);
        return velocity;
    }

    public final float xMQ() {
        return az();
    }
}
