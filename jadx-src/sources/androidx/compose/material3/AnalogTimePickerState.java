package androidx.compose.material3;

import androidx.collection.IntList;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.TimePickerSelectionMode;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0010*\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0018\u0010\u0017J\"\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\"\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020&0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u00101\u001a\u00020\u00058\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u00100R\u001c\u00103\u001a\u00020\u00058\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b2\u0010\u0007\"\u0004\b'\u00100R\"\u00108\u001a\u0002048\u0016@\u0016X\u0096\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b+\u00107R\u0011\u0010;\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010?\u001a\u00020<8F¢\u0006\u0006\u001a\u0004\b=\u0010>R$\u0010B\u001a\u00020\u00102\u0006\u0010@\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u00106\"\u0004\bA\u00107R$\u0010D\u001a\u00020\u00102\u0006\u0010@\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u00106\"\u0004\bC\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, d2 = {"Landroidx/compose/material3/AnalogTimePickerState;", "Landroidx/compose/material3/TimePickerState;", "state", "<init>", "(Landroidx/compose/material3/TimePickerState;)V", "", "aYN", "()Z", "", "new", "Z", "(F)F", "", "e", "()V", "ViF", "", "fD", "(F)I", "E2", "angle", "nY", "o", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "animate", "te", "(FZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", c.f62177j, "Landroidx/compose/material3/TimePickerState;", "WPU", "()Landroidx/compose/material3/TimePickerState;", "rl", "F", "hourAngle", "t", "minuteAngle", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "nr", "Landroidx/compose/animation/core/Animatable;", "anim", "Landroidx/compose/foundation/MutatorMutex;", "O", "Landroidx/compose/foundation/MutatorMutex;", "mutex", "xMQ", "set24hour", "(Z)V", "is24hour", "mUb", "isAfternoon", "Landroidx/compose/material3/TimePickerSelectionMode;", "J2", "()I", "(I)V", "selection", "S", "()F", "currentAngle", "Landroidx/collection/IntList;", "XQ", "()Landroidx/collection/IntList;", "clockFaceValues", "value", "KN", "minute", "Uo", "hour", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/AnalogTimePickerState\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,2008:1\n602#2,8:2009\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/AnalogTimePickerState\n*L\n822#1:2009,8\n*E\n"})
public final class AnalogTimePickerState implements TimePickerState {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutatorMutex mutex = new MutatorMutex();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final TimePickerState state;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Animatable anim;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private float hourAngle;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float minuteAngle;

    private final float ViF(float f3) {
        double d2 = ((double) f3) % 6.283185307179586d;
        if (d2 < 0.0d) {
            d2 += 6.283185307179586d;
        }
        return (float) d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float nY(float angle) {
        float f3 = angle + 1.5707964f;
        return f3 < 0.0f ? f3 + 6.2831855f : f3;
    }

    @Override // androidx.compose.material3.TimePickerState
    public int J2() {
        return this.state.J2();
    }

    @Override // androidx.compose.material3.TimePickerState
    public void O(int i2) {
        this.state.O(i2);
    }

    @Override // androidx.compose.material3.TimePickerState
    public boolean mUb() {
        return this.state.mUb();
    }

    @Override // androidx.compose.material3.TimePickerState
    public void nr(boolean z2) {
        this.state.nr(z2);
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: xMQ */
    public boolean getIs24hour() {
        return this.state.getIs24hour();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float Z(float f3) {
        float fFloatValue = ((Number) this.anim.ty()).floatValue() - f3;
        while (fFloatValue > 3.1415927f) {
            fFloatValue -= 6.2831855f;
        }
        while (fFloatValue <= -3.1415927f) {
            fFloatValue += 6.2831855f;
        }
        return ((Number) this.anim.ty()).floatValue() - fFloatValue;
    }

    private final void e() {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot snapshotNr = companion.nr();
        Function1 function1Uo = snapshotNr != null ? snapshotNr.Uo() : null;
        Snapshot snapshotO = companion.O(snapshotNr);
        try {
            this.state.KN(rl());
            Unit unit = Unit.INSTANCE;
        } finally {
            companion.az(snapshotNr, snapshotO, function1Uo);
        }
    }

    public static /* synthetic */ Object iF(AnalogTimePickerState analogTimePickerState, float f3, boolean z2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return analogTimePickerState.te(f3, z2, continuation);
    }

    public final float S() {
        return ((Number) this.anim.ty()).floatValue();
    }

    @Override // androidx.compose.material3.TimePickerState
    public void Uo(int i2) {
        this.hourAngle = ((i2 % 12) * 0.5235988f) - 1.5707964f;
        this.state.Uo(i2);
        if (TimePickerSelectionMode.J2(J2(), TimePickerSelectionMode.INSTANCE.n())) {
            this.anim = AnimatableKt.rl(this.hourAngle, 0.0f, 2, null);
        }
    }

    /* JADX INFO: renamed from: WPU, reason: from getter */
    public final TimePickerState getState() {
        return this.state;
    }

    @Override // androidx.compose.material3.TimePickerState
    public int rl() {
        return this.state.rl();
    }

    @Override // androidx.compose.material3.TimePickerState
    public int t() {
        return this.state.t();
    }

    public final Object te(float f3, boolean z2, Continuation continuation) {
        Object objNr = this.mutex.nr(MutatePriority.f16229t, new AnalogTimePickerState$rotateTo$2(this, f3, z2, null), continuation);
        return objNr == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNr : Unit.INSTANCE;
    }

    public AnalogTimePickerState(TimePickerState timePickerState) {
        this.state = timePickerState;
        this.hourAngle = ((timePickerState.t() % 12) * 0.5235988f) - 1.5707964f;
        this.minuteAngle = (timePickerState.rl() * 0.10471976f) - 1.5707964f;
        this.anim = AnimatableKt.rl(this.hourAngle, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int E2(float f3) {
        return ((int) ((((double) f3) + (((double) 0.05235988f) + 1.5707963267948966d)) / ((double) 0.10471976f))) % 60;
    }

    private final boolean aYN() {
        int iJ2 = J2();
        TimePickerSelectionMode.Companion companion = TimePickerSelectionMode.INSTANCE;
        if (TimePickerSelectionMode.J2(iJ2, companion.n()) && ViF(((Number) this.anim.qie()).floatValue()) == ViF(this.hourAngle)) {
            return false;
        }
        if (TimePickerSelectionMode.J2(J2(), companion.rl()) && ViF(((Number) this.anim.qie()).floatValue()) == ViF(this.minuteAngle)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int fD(float f3) {
        return ((int) ((((double) f3) + (((double) 0.2617994f) + 1.5707963267948966d)) / ((double) 0.5235988f))) % 12;
    }

    @Override // androidx.compose.material3.TimePickerState
    public void KN(int i2) {
        this.minuteAngle = (i2 * 0.10471976f) - 1.5707964f;
        this.state.KN(i2);
        if (TimePickerSelectionMode.J2(J2(), TimePickerSelectionMode.INSTANCE.rl())) {
            this.anim = AnimatableKt.rl(this.minuteAngle, 0.0f, 2, null);
        }
        e();
    }

    public final IntList XQ() {
        return TimePickerSelectionMode.J2(J2(), TimePickerSelectionMode.INSTANCE.rl()) ? TimePickerKt.mUb : TimePickerKt.gh;
    }

    public final Object g(Continuation continuation) {
        float f3;
        if (TimePickerSelectionMode.J2(J2(), TimePickerSelectionMode.INSTANCE.n())) {
            f3 = this.hourAngle;
        } else {
            f3 = this.minuteAngle;
        }
        Object objNr = this.mutex.nr(MutatePriority.f16226O, new AnalogTimePickerState$onGestureEnd$2(this, Z(f3), null), continuation);
        if (objNr == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objNr;
        }
        return Unit.INSTANCE;
    }

    public final Object o(Continuation continuation) {
        float fZ;
        if (!aYN()) {
            return Unit.INSTANCE;
        }
        if (TimePickerSelectionMode.J2(J2(), TimePickerSelectionMode.INSTANCE.n())) {
            fZ = Z(this.hourAngle);
        } else {
            fZ = Z(this.minuteAngle);
        }
        Object objNr = this.mutex.nr(MutatePriority.f16226O, new AnalogTimePickerState$animateToCurrent$2(this, fZ, null), continuation);
        if (objNr == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objNr;
        }
        return Unit.INSTANCE;
    }
}
