package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"androidx/compose/material3/ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "tEO", "(JI)J", "consumed", "F", "(JJI)J", "Landroidx/compose/ui/unit/Velocity;", "z", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ ExitUntilCollapsedScrollBehavior f25734n;

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long F(long consumed, long available, int source) {
        if (!((Boolean) this.f25734n.getCanScroll().invoke()).booleanValue()) {
            return Offset.INSTANCE.t();
        }
        TopAppBarState state = this.f25734n.getState();
        state.J2(state.rl() + Offset.ty(consumed));
        if (Offset.ty(available) < 0.0f || Offset.ty(consumed) < 0.0f) {
            float fT = this.f25734n.getState().t();
            this.f25734n.getState().Uo(this.f25734n.getState().t() + Offset.ty(consumed));
            return OffsetKt.n(0.0f, this.f25734n.getState().t() - fT);
        }
        if (Offset.ty(consumed) == 0.0f && Offset.ty(available) > 0.0f) {
            this.f25734n.getState().J2(0.0f);
        }
        if (Offset.ty(available) <= 0.0f) {
            return Offset.INSTANCE.t();
        }
        float fT2 = this.f25734n.getState().t();
        this.f25734n.getState().Uo(this.f25734n.getState().t() + Offset.ty(available));
        return OffsetKt.n(0.0f, this.f25734n.getState().t() - fT2);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long tEO(long available, int source) {
        if (!((Boolean) this.f25734n.getCanScroll().invoke()).booleanValue() || Offset.ty(available) > 0.0f) {
            return Offset.INSTANCE.t();
        }
        float fT = this.f25734n.getState().t();
        this.f25734n.getState().Uo(this.f25734n.getState().t() + Offset.ty(available));
        return fT == this.f25734n.getState().t() ? Offset.INSTANCE.t() : Offset.Uo(available, 0.0f, 0.0f, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(long j2, long j3, Continuation continuation) {
        ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1;
        ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 exitUntilCollapsedScrollBehavior$nestedScrollConnection$1;
        long j4;
        long j5;
        if (continuation instanceof ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1) {
            exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 = (ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1) continuation;
            int i2 = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1.f25737r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1.f25737r = i2 - Integer.MIN_VALUE;
            } else {
                exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 = new ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1(this, continuation);
            }
        }
        ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$12 = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1;
        Object objZ = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25735O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25737r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objZ);
            exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25736n = this;
            exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25738t = j3;
            exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25737r = 1;
            objZ = super.z(j2, j3, exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$12);
            if (objZ != coroutine_suspended) {
                exitUntilCollapsedScrollBehavior$nestedScrollConnection$1 = this;
                j4 = j3;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j5 = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25738t;
            ResultKt.throwOnFailure(objZ);
            return Velocity.rl(Velocity.qie(j5, ((Velocity) objZ).getPackedValue()));
        }
        j4 = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25738t;
        exitUntilCollapsedScrollBehavior$nestedScrollConnection$1 = (ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1) exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25736n;
        ResultKt.throwOnFailure(objZ);
        long packedValue = ((Velocity) objZ).getPackedValue();
        TopAppBarState state = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1.f25734n.getState();
        float fXMQ = Velocity.xMQ(j4);
        DecayAnimationSpec flingAnimationSpec = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1.f25734n.getFlingAnimationSpec();
        AnimationSpec snapAnimationSpec = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1.f25734n.getSnapAnimationSpec();
        exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25736n = null;
        exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25738t = packedValue;
        exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25737r = 2;
        objZ = AppBarKt.iF(state, fXMQ, flingAnimationSpec, snapAnimationSpec, exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$12);
        if (objZ != coroutine_suspended) {
            j5 = packedValue;
            return Velocity.rl(Velocity.qie(j5, ((Velocity) objZ).getPackedValue()));
        }
        return coroutine_suspended;
    }
}
