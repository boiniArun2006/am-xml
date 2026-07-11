package androidx.compose.ui.input.nestedscroll;

import GJW.vd;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R*\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010)\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0016\u0010/\u001a\u0004\u0018\u00010,8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "nr", "(JI)J", "consumed", "rl", "(JJI)J", "Landroidx/compose/ui/unit/Velocity;", "t", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", c.f62177j, "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "J2", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "gh", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;)V", "nestedScrollNode", "getLastKnownParentNode$ui_release", "mUb", "lastKnownParentNode", "Lkotlin/Function0;", "LGJW/vd;", "Lkotlin/jvm/functions/Function0;", "getCalculateNestedScrollScope$ui_release", "()Lkotlin/jvm/functions/Function0;", "xMQ", "(Lkotlin/jvm/functions/Function0;)V", "calculateNestedScrollScope", "LGJW/vd;", "KN", "()LGJW/vd;", "qie", "(LGJW/vd;)V", "scope", "O", "coroutineScope", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Uo", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "parent", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NestedScrollDispatcher {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private NestedScrollNode nestedScrollNode;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private vd scope;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private NestedScrollNode lastKnownParentNode;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Function0 calculateNestedScrollScope = new Function0<vd>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final vd invoke() {
            return this.f32025n.getScope();
        }
    };

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final NestedScrollNode getNestedScrollNode() {
        return this.nestedScrollNode;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final vd getScope() {
        return this.scope;
    }

    public final vd O() {
        vd vdVar = (vd) this.calculateNestedScrollScope.invoke();
        if (vdVar != null) {
            return vdVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final NestedScrollConnection Uo() {
        NestedScrollNode nestedScrollNode = this.nestedScrollNode;
        if (nestedScrollNode != null) {
            return nestedScrollNode.ex();
        }
        return null;
    }

    public final void gh(NestedScrollNode nestedScrollNode) {
        this.nestedScrollNode = nestedScrollNode;
    }

    public final void mUb(NestedScrollNode nestedScrollNode) {
        this.lastKnownParentNode = nestedScrollNode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(long j2, long j3, Continuation continuation) {
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$1;
        long jN;
        if (continuation instanceof NestedScrollDispatcher$dispatchPostFling$1) {
            nestedScrollDispatcher$dispatchPostFling$1 = (NestedScrollDispatcher$dispatchPostFling$1) continuation;
            int i2 = nestedScrollDispatcher$dispatchPostFling$1.f32026O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPostFling$1.f32026O = i2 - Integer.MIN_VALUE;
            } else {
                nestedScrollDispatcher$dispatchPostFling$1 = new NestedScrollDispatcher$dispatchPostFling$1(this, continuation);
            }
        }
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$12 = nestedScrollDispatcher$dispatchPostFling$1;
        Object objZ = nestedScrollDispatcher$dispatchPostFling$12.f32027n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nestedScrollDispatcher$dispatchPostFling$12.f32026O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objZ);
            if (Uo() == null && ComposeUiFlags.NewNestedScrollFlingDispatchingEnabled) {
                NestedScrollNode nestedScrollNode = this.lastKnownParentNode;
                if (nestedScrollNode != null) {
                    nestedScrollDispatcher$dispatchPostFling$12.f32026O = 1;
                    objZ = nestedScrollNode.z(j2, j3, nestedScrollDispatcher$dispatchPostFling$12);
                } else {
                    jN = Velocity.INSTANCE.n();
                }
            } else {
                NestedScrollConnection nestedScrollConnectionUo = Uo();
                if (nestedScrollConnectionUo != null) {
                    nestedScrollDispatcher$dispatchPostFling$12.f32026O = 2;
                    objZ = nestedScrollConnectionUo.z(j2, j3, nestedScrollDispatcher$dispatchPostFling$12);
                } else {
                    jN = Velocity.INSTANCE.n();
                }
            }
        } else if (i3 == 1) {
            ResultKt.throwOnFailure(objZ);
            jN = ((Velocity) objZ).getPackedValue();
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objZ);
            jN = ((Velocity) objZ).getPackedValue();
        }
        return Velocity.rl(jN);
    }

    public final void qie(vd vdVar) {
        this.scope = vdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(long j2, Continuation continuation) {
        NestedScrollDispatcher$dispatchPreFling$1 nestedScrollDispatcher$dispatchPreFling$1;
        long jN;
        if (continuation instanceof NestedScrollDispatcher$dispatchPreFling$1) {
            nestedScrollDispatcher$dispatchPreFling$1 = (NestedScrollDispatcher$dispatchPreFling$1) continuation;
            int i2 = nestedScrollDispatcher$dispatchPreFling$1.f32029O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPreFling$1.f32029O = i2 - Integer.MIN_VALUE;
            } else {
                nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, continuation);
            }
        }
        Object objLS = nestedScrollDispatcher$dispatchPreFling$1.f32030n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nestedScrollDispatcher$dispatchPreFling$1.f32029O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objLS);
            NestedScrollConnection nestedScrollConnectionUo = Uo();
            if (nestedScrollConnectionUo == null) {
                jN = Velocity.INSTANCE.n();
                return Velocity.rl(jN);
            }
            nestedScrollDispatcher$dispatchPreFling$1.f32029O = 1;
            objLS = nestedScrollConnectionUo.lS(j2, nestedScrollDispatcher$dispatchPreFling$1);
            if (objLS == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLS);
        }
        jN = ((Velocity) objLS).getPackedValue();
        return Velocity.rl(jN);
    }

    public final void xMQ(Function0 function0) {
        this.calculateNestedScrollScope = function0;
    }

    public final long nr(long available, int source) {
        NestedScrollConnection nestedScrollConnectionUo = Uo();
        if (nestedScrollConnectionUo != null) {
            return nestedScrollConnectionUo.tEO(available, source);
        }
        return Offset.INSTANCE.t();
    }

    public final long rl(long consumed, long available, int source) {
        NestedScrollConnection nestedScrollConnectionUo = Uo();
        if (nestedScrollConnectionUo != null) {
            return nestedScrollConnectionUo.F(consumed, available, source);
        }
        return Offset.INSTANCE.t();
    }
}
