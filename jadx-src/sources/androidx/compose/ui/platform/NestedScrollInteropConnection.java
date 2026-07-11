package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.core.view.NestedScrollingChildHelper;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ*\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/platform/NestedScrollInteropConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()V", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "tEO", "(JI)J", "consumed", "F", "(JJI)J", "Landroidx/compose/ui/unit/Velocity;", "lS", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "z", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/core/view/NestedScrollingChildHelper;", "Landroidx/core/view/NestedScrollingChildHelper;", "nestedScrollChildHelper", "", "t", "[I", "consumedScrollCache", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNestedScrollInteropConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,233:1\n1#2:234\n65#3:235\n69#3:238\n65#3:241\n69#3:244\n65#3:247\n69#3:250\n60#4:236\n70#4:239\n60#4:242\n70#4:245\n60#4:248\n70#4:251\n22#5:237\n22#5:240\n22#5:243\n22#5:246\n22#5:249\n22#5:252\n*S KotlinDebug\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnection\n*L\n65#1:235\n66#1:238\n88#1:241\n89#1:244\n90#1:247\n91#1:250\n65#1:236\n66#1:239\n88#1:242\n89#1:245\n90#1:248\n91#1:251\n65#1:237\n66#1:240\n88#1:243\n89#1:246\n90#1:249\n91#1:252\n*E\n"})
public final class NestedScrollInteropConnection implements NestedScrollConnection {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final NestedScrollingChildHelper nestedScrollChildHelper;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int[] consumedScrollCache;

    private final void n() {
        if (this.nestedScrollChildHelper.qie(0)) {
            this.nestedScrollChildHelper.o(0);
        }
        if (this.nestedScrollChildHelper.qie(1)) {
            this.nestedScrollChildHelper.o(1);
        }
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long F(long consumed, long available, int source) {
        if (!this.nestedScrollChildHelper.Ik(NestedScrollInteropConnectionKt.Uo(available), NestedScrollInteropConnectionKt.mUb(source))) {
            return Offset.INSTANCE.t();
        }
        ArraysKt.fill$default(this.consumedScrollCache, 0, 0, 0, 6, (Object) null);
        this.nestedScrollChildHelper.O(NestedScrollInteropConnectionKt.J2(Float.intBitsToFloat((int) (consumed >> 32))), NestedScrollInteropConnectionKt.J2(Float.intBitsToFloat((int) (consumed & 4294967295L))), NestedScrollInteropConnectionKt.J2(Float.intBitsToFloat((int) (available >> 32))), NestedScrollInteropConnectionKt.J2(Float.intBitsToFloat((int) (available & 4294967295L))), null, NestedScrollInteropConnectionKt.mUb(source), this.consumedScrollCache);
        return NestedScrollInteropConnectionKt.xMQ(this.consumedScrollCache, available);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public Object lS(long j2, Continuation continuation) {
        if (!this.nestedScrollChildHelper.rl(NestedScrollInteropConnectionKt.gh(Velocity.KN(j2)), NestedScrollInteropConnectionKt.gh(Velocity.xMQ(j2)))) {
            j2 = Velocity.INSTANCE.n();
        }
        n();
        return Velocity.rl(j2);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long tEO(long available, int source) {
        if (!this.nestedScrollChildHelper.Ik(NestedScrollInteropConnectionKt.Uo(available), NestedScrollInteropConnectionKt.mUb(source))) {
            return Offset.INSTANCE.t();
        }
        ArraysKt.fill$default(this.consumedScrollCache, 0, 0, 0, 6, (Object) null);
        this.nestedScrollChildHelper.nr(NestedScrollInteropConnectionKt.J2(Float.intBitsToFloat((int) (available >> 32))), NestedScrollInteropConnectionKt.J2(Float.intBitsToFloat((int) (4294967295L & available))), this.consumedScrollCache, null, NestedScrollInteropConnectionKt.mUb(source));
        return NestedScrollInteropConnectionKt.xMQ(this.consumedScrollCache, available);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public Object z(long j2, long j3, Continuation continuation) {
        if (!this.nestedScrollChildHelper.n(NestedScrollInteropConnectionKt.gh(Velocity.KN(j3)), NestedScrollInteropConnectionKt.gh(Velocity.xMQ(j3)), true)) {
            j3 = Velocity.INSTANCE.n();
        }
        n();
        return Velocity.rl(j3);
    }
}
