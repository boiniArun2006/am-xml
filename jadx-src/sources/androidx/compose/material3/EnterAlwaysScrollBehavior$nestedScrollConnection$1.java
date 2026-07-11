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
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"androidx/compose/material3/EnterAlwaysScrollBehavior$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "tEO", "(JI)J", "consumed", "F", "(JJI)J", "Landroidx/compose/ui/unit/Velocity;", "z", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EnterAlwaysScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ EnterAlwaysScrollBehavior f25714n;

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long F(long consumed, long available, int source) {
        if (!((Boolean) this.f25714n.getCanScroll().invoke()).booleanValue()) {
            return Offset.INSTANCE.t();
        }
        TopAppBarState state = this.f25714n.getState();
        state.J2(state.rl() + Offset.ty(consumed));
        if ((this.f25714n.getState().t() == 0.0f || this.f25714n.getState().t() == this.f25714n.getState().nr()) && Offset.ty(consumed) == 0.0f && Offset.ty(available) > 0.0f) {
            this.f25714n.getState().J2(0.0f);
        }
        this.f25714n.getState().Uo(this.f25714n.getState().t() + Offset.ty(consumed));
        return Offset.INSTANCE.t();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long tEO(long available, int source) {
        if (!((Boolean) this.f25714n.getCanScroll().invoke()).booleanValue()) {
            return Offset.INSTANCE.t();
        }
        float fT = this.f25714n.getState().t();
        this.f25714n.getState().Uo(this.f25714n.getState().t() + Offset.ty(available));
        return fT == this.f25714n.getState().t() ? Offset.INSTANCE.t() : Offset.Uo(available, 0.0f, 0.0f, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(long j2, long j3, Continuation continuation) {
        EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1;
        EnterAlwaysScrollBehavior$nestedScrollConnection$1 enterAlwaysScrollBehavior$nestedScrollConnection$1;
        long j4;
        long j5;
        if (continuation instanceof EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) {
            enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 = (EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) continuation;
            int i2 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f25717r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f25717r = i2 - Integer.MIN_VALUE;
            } else {
                enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 = new EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(this, continuation);
            }
        }
        EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1;
        Object objZ = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25715O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25717r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objZ);
            enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25716n = this;
            enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25718t = j3;
            enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25717r = 1;
            objZ = super.z(j2, j3, enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12);
            if (objZ != coroutine_suspended) {
                enterAlwaysScrollBehavior$nestedScrollConnection$1 = this;
                j4 = j3;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j5 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25718t;
            ResultKt.throwOnFailure(objZ);
            return Velocity.rl(Velocity.qie(j5, ((Velocity) objZ).getPackedValue()));
        }
        j4 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25718t;
        enterAlwaysScrollBehavior$nestedScrollConnection$1 = (EnterAlwaysScrollBehavior$nestedScrollConnection$1) enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25716n;
        ResultKt.throwOnFailure(objZ);
        long packedValue = ((Velocity) objZ).getPackedValue();
        TopAppBarState state = enterAlwaysScrollBehavior$nestedScrollConnection$1.f25714n.getState();
        float fXMQ = Velocity.xMQ(j4);
        DecayAnimationSpec flingAnimationSpec = enterAlwaysScrollBehavior$nestedScrollConnection$1.f25714n.getFlingAnimationSpec();
        AnimationSpec snapAnimationSpec = enterAlwaysScrollBehavior$nestedScrollConnection$1.f25714n.getSnapAnimationSpec();
        enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25716n = null;
        enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25718t = packedValue;
        enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f25717r = 2;
        objZ = AppBarKt.iF(state, fXMQ, flingAnimationSpec, snapAnimationSpec, enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12);
        if (objZ != coroutine_suspended) {
            j5 = packedValue;
            return Velocity.rl(Velocity.qie(j5, ((Velocity) objZ).getPackedValue()));
        }
        return coroutine_suspended;
    }
}
