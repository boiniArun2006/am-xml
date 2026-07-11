package androidx.compose.material.pullrefresh;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR/\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R?\u0010\u001c\u001a-\b\u0001\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "tEO", "(JI)J", "consumed", "F", "(JJI)J", "Landroidx/compose/ui/unit/Velocity;", "lS", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "pullDelta", c.f62177j, "Lkotlin/jvm/functions/Function1;", "onPull", "Lkotlin/Function2;", "flingVelocity", "Lkotlin/coroutines/Continuation;", "", "t", "Lkotlin/jvm/functions/Function2;", "onRelease", "", "O", "Z", "enabled", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class PullRefreshNestedScrollConnection implements NestedScrollConnection {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function1 onPull;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Function2 onRelease;

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long F(long consumed, long available, int source) {
        return !this.enabled ? Offset.INSTANCE.t() : (!NestedScrollSource.O(source, NestedScrollSource.INSTANCE.rl()) || Offset.ty(available) <= 0.0f) ? Offset.INSTANCE.t() : OffsetKt.n(0.0f, ((Number) this.onPull.invoke(Float.valueOf(Offset.ty(available)))).floatValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object lS(long j2, Continuation continuation) {
        PullRefreshNestedScrollConnection$onPreFling$1 pullRefreshNestedScrollConnection$onPreFling$1;
        float f3;
        if (continuation instanceof PullRefreshNestedScrollConnection$onPreFling$1) {
            pullRefreshNestedScrollConnection$onPreFling$1 = (PullRefreshNestedScrollConnection$onPreFling$1) continuation;
            int i2 = pullRefreshNestedScrollConnection$onPreFling$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pullRefreshNestedScrollConnection$onPreFling$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                pullRefreshNestedScrollConnection$onPreFling$1 = new PullRefreshNestedScrollConnection$onPreFling$1(this, continuation);
            }
        }
        Object objInvoke = pullRefreshNestedScrollConnection$onPreFling$1.f23959t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pullRefreshNestedScrollConnection$onPreFling$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Function2 function2 = this.onRelease;
            Float fBoxFloat = Boxing.boxFloat(Velocity.xMQ(j2));
            pullRefreshNestedScrollConnection$onPreFling$1.f23958n = 0.0f;
            pullRefreshNestedScrollConnection$onPreFling$1.J2 = 1;
            objInvoke = function2.invoke(fBoxFloat, pullRefreshNestedScrollConnection$onPreFling$1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            f3 = 0.0f;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f3 = pullRefreshNestedScrollConnection$onPreFling$1.f23958n;
            ResultKt.throwOnFailure(objInvoke);
        }
        return Velocity.rl(VelocityKt.n(f3, ((Number) objInvoke).floatValue()));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long tEO(long available, int source) {
        return !this.enabled ? Offset.INSTANCE.t() : (!NestedScrollSource.O(source, NestedScrollSource.INSTANCE.rl()) || Offset.ty(available) >= 0.0f) ? Offset.INSTANCE.t() : OffsetKt.n(0.0f, ((Number) this.onPull.invoke(Float.valueOf(Offset.ty(available)))).floatValue());
    }
}
