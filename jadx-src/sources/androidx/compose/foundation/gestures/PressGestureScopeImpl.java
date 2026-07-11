package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import yB.CN3;
import yB.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u0006*\u00020\nH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u0006*\u00020\u000fH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u0006*\u00020\u0007H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f*\u00020\u0006H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u000f*\u00020\nH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\u0014*\u00020\u0015H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\n*\u00020\u0006H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\n*\u00020\u000fH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u001e¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b$\u0010#J\u0010\u0010&\u001a\u00020%H\u0096@¢\u0006\u0004\b&\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\rR\u0016\u0010*\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\rR\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010,R\u0014\u0010\u0003\u001a\u00020\u000f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\u000f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b0\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScopeImpl;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/unit/Dp;", "", "How", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "I4p", "(J)I", "Z", "(J)F", "", "bzg", "(F)F", "rV9", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "Ik", "(J)J", CmcdData.STREAM_TYPE_LIVE, "tFV", "M", "ck", "(F)J", "ViF", "", "nr", "()V", "J2", "HI", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g6", "", "kSg", "t", "isReleased", "O", "isCanceled", "LyB/j;", "LyB/j;", "mutex", "getDensity", "()F", "yAc", "fontScale", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PressGestureScopeImpl implements PressGestureScope, Density {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final j mutex = CN3.n(false);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean isCanceled;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ Density f16972n;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean isReleased;

    @Override // androidx.compose.ui.unit.Density
    public int How(float f3) {
        return this.f16972n.How(f3);
    }

    @Override // androidx.compose.ui.unit.Density
    public int I4p(long j2) {
        return this.f16972n.I4p(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    public long Ik(long j2) {
        return this.f16972n.Ik(j2);
    }

    public final void J2() {
        this.isReleased = true;
        if (this.mutex.Uo()) {
            j.C1281j.t(this.mutex, null, 1, null);
        }
    }

    @Override // androidx.compose.ui.unit.Density
    public long M(long j2) {
        return this.f16972n.M(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    public long ViF(float f3) {
        return this.f16972n.ViF(f3);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float Z(long j2) {
        return this.f16972n.Z(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    public float bzg(float f3) {
        return this.f16972n.bzg(f3);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public long ck(float f3) {
        return this.f16972n.ck(f3);
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.f16972n.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float l(float f3) {
        return this.f16972n.l(f3);
    }

    public final void nr() {
        this.isCanceled = true;
        if (this.mutex.Uo()) {
            j.C1281j.t(this.mutex, null, 1, null);
        }
    }

    @Override // androidx.compose.ui.unit.Density
    public float rV9(int i2) {
        return this.f16972n.rV9(i2);
    }

    @Override // androidx.compose.ui.unit.Density
    public float tFV(long j2) {
        return this.f16972n.tFV(j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: yAc */
    public float getFontScale() {
        return this.f16972n.getFontScale();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object HI(Continuation continuation) {
        PressGestureScopeImpl$reset$1 pressGestureScopeImpl$reset$1;
        PressGestureScopeImpl pressGestureScopeImpl;
        if (continuation instanceof PressGestureScopeImpl$reset$1) {
            pressGestureScopeImpl$reset$1 = (PressGestureScopeImpl$reset$1) continuation;
            int i2 = pressGestureScopeImpl$reset$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$reset$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                pressGestureScopeImpl$reset$1 = new PressGestureScopeImpl$reset$1(this, continuation);
            }
        }
        Object obj = pressGestureScopeImpl$reset$1.f16979t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pressGestureScopeImpl$reset$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            j jVar = this.mutex;
            pressGestureScopeImpl$reset$1.f16978n = this;
            pressGestureScopeImpl$reset$1.J2 = 1;
            if (j.C1281j.n(jVar, null, pressGestureScopeImpl$reset$1, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pressGestureScopeImpl = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pressGestureScopeImpl = (PressGestureScopeImpl) pressGestureScopeImpl$reset$1.f16978n;
            ResultKt.throwOnFailure(obj);
        }
        pressGestureScopeImpl.isReleased = false;
        pressGestureScopeImpl.isCanceled = false;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g6(Continuation continuation) {
        PressGestureScopeImpl$awaitRelease$1 pressGestureScopeImpl$awaitRelease$1;
        if (continuation instanceof PressGestureScopeImpl$awaitRelease$1) {
            pressGestureScopeImpl$awaitRelease$1 = (PressGestureScopeImpl$awaitRelease$1) continuation;
            int i2 = pressGestureScopeImpl$awaitRelease$1.f16974O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$awaitRelease$1.f16974O = i2 - Integer.MIN_VALUE;
            } else {
                pressGestureScopeImpl$awaitRelease$1 = new PressGestureScopeImpl$awaitRelease$1(this, continuation);
            }
        }
        Object objKSg = pressGestureScopeImpl$awaitRelease$1.f16975n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pressGestureScopeImpl$awaitRelease$1.f16974O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objKSg);
            pressGestureScopeImpl$awaitRelease$1.f16974O = 1;
            objKSg = kSg(pressGestureScopeImpl$awaitRelease$1);
            if (objKSg == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objKSg);
        }
        if (((Boolean) objKSg).booleanValue()) {
            return Unit.INSTANCE;
        }
        throw new GestureCancellationException("The press gesture was canceled.");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object kSg(Continuation continuation) {
        PressGestureScopeImpl$tryAwaitRelease$1 pressGestureScopeImpl$tryAwaitRelease$1;
        PressGestureScopeImpl pressGestureScopeImpl;
        if (continuation instanceof PressGestureScopeImpl$tryAwaitRelease$1) {
            pressGestureScopeImpl$tryAwaitRelease$1 = (PressGestureScopeImpl$tryAwaitRelease$1) continuation;
            int i2 = pressGestureScopeImpl$tryAwaitRelease$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$tryAwaitRelease$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                pressGestureScopeImpl$tryAwaitRelease$1 = new PressGestureScopeImpl$tryAwaitRelease$1(this, continuation);
            }
        }
        Object obj = pressGestureScopeImpl$tryAwaitRelease$1.f16982t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pressGestureScopeImpl$tryAwaitRelease$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.isReleased || this.isCanceled) {
                pressGestureScopeImpl = this;
                return Boxing.boxBoolean(pressGestureScopeImpl.isReleased);
            }
            j jVar = this.mutex;
            pressGestureScopeImpl$tryAwaitRelease$1.f16981n = this;
            pressGestureScopeImpl$tryAwaitRelease$1.J2 = 1;
            if (j.C1281j.n(jVar, null, pressGestureScopeImpl$tryAwaitRelease$1, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pressGestureScopeImpl = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pressGestureScopeImpl = (PressGestureScopeImpl) pressGestureScopeImpl$tryAwaitRelease$1.f16981n;
            ResultKt.throwOnFailure(obj);
        }
        j.C1281j.t(pressGestureScopeImpl.mutex, null, 1, null);
        return Boxing.boxBoolean(pressGestureScopeImpl.isReleased);
    }

    public PressGestureScopeImpl(Density density) {
        this.f16972n = density;
    }
}
