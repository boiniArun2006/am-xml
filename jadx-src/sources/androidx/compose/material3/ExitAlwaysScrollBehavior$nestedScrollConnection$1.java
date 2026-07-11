package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"androidx/compose/material3/ExitAlwaysScrollBehavior$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "consumed", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "F", "(JJI)J", "Landroidx/compose/ui/unit/Velocity;", "z", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExitAlwaysScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ ExitAlwaysScrollBehavior f25725n;

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long F(long consumed, long available, int source) {
        if (!((Boolean) this.f25725n.getCanScroll().invoke()).booleanValue()) {
            return Offset.INSTANCE.t();
        }
        BottomAppBarState state = this.f25725n.getState();
        state.nr(state.t() + Offset.ty(consumed));
        if ((this.f25725n.getState().rl() == 0.0f || this.f25725n.getState().rl() == this.f25725n.getState().O()) && Offset.ty(consumed) == 0.0f && Offset.ty(available) > 0.0f) {
            this.f25725n.getState().nr(0.0f);
        }
        this.f25725n.getState().J2(this.f25725n.getState().rl() + Offset.ty(consumed));
        return Offset.INSTANCE.t();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(long j2, long j3, Continuation continuation) {
        ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1;
        ExitAlwaysScrollBehavior$nestedScrollConnection$1 exitAlwaysScrollBehavior$nestedScrollConnection$1;
        long j4;
        long j5;
        if (continuation instanceof ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) {
            exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 = (ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) continuation;
            int i2 = exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f25728r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f25728r = i2 - Integer.MIN_VALUE;
            } else {
                exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 = new ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(this, continuation);
            }
        }
        ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12 = exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1;
        Object objZ = exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25726O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25728r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objZ);
            exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25727n = this;
            exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25729t = j3;
            exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25728r = 1;
            objZ = super.z(j2, j3, exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12);
            if (objZ != coroutine_suspended) {
                exitAlwaysScrollBehavior$nestedScrollConnection$1 = this;
                j4 = j3;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j5 = exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25729t;
            ResultKt.throwOnFailure(objZ);
            return Velocity.rl(Velocity.qie(j5, ((Velocity) objZ).getPackedValue()));
        }
        j4 = exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25729t;
        exitAlwaysScrollBehavior$nestedScrollConnection$1 = (ExitAlwaysScrollBehavior$nestedScrollConnection$1) exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25727n;
        ResultKt.throwOnFailure(objZ);
        long packedValue = ((Velocity) objZ).getPackedValue();
        BottomAppBarState state = exitAlwaysScrollBehavior$nestedScrollConnection$1.f25725n.getState();
        float fXMQ = Velocity.xMQ(j4);
        DecayAnimationSpec flingAnimationSpec = exitAlwaysScrollBehavior$nestedScrollConnection$1.f25725n.getFlingAnimationSpec();
        AnimationSpec snapAnimationSpec = exitAlwaysScrollBehavior$nestedScrollConnection$1.f25725n.getSnapAnimationSpec();
        exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25727n = null;
        exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25729t = packedValue;
        exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25728r = 2;
        objZ = AppBarKt.fD(state, fXMQ, flingAnimationSpec, snapAnimationSpec, exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12);
        if (objZ != coroutine_suspended) {
            j5 = packedValue;
            return Velocity.rl(Velocity.qie(j5, ((Velocity) objZ).getPackedValue()));
        }
        return coroutine_suspended;
    }
}
