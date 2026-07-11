package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\t*\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u00020\f*\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/foundation/pager/DefaultPagerNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "<init>", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/Orientation;)V", "Landroidx/compose/ui/geometry/Offset;", "", "rl", "(J)F", "Landroidx/compose/ui/unit/Velocity;", c.f62177j, "(JLandroidx/compose/foundation/gestures/Orientation;)J", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "tEO", "(JI)J", "consumed", "F", "(JJI)J", "z", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/pager/PagerState;", "getState", "()Landroidx/compose/foundation/pager/PagerState;", "t", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/DefaultPagerNestedScrollConnection\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,592:1\n65#2:593\n69#2:596\n65#2:598\n69#2:601\n65#2:604\n69#2:607\n60#3:594\n70#3:597\n60#3:599\n70#3:602\n60#3:605\n70#3:608\n22#4:595\n22#4:600\n22#4:603\n22#4:606\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/DefaultPagerNestedScrollConnection\n*L\n505#1:593\n505#1:596\n510#1:598\n511#1:601\n534#1:604\n534#1:607\n505#1:594\n505#1:597\n510#1:599\n511#1:602\n534#1:605\n534#1:608\n505#1:595\n510#1:600\n511#1:603\n534#1:606\n*E\n"})
final class DefaultPagerNestedScrollConnection implements NestedScrollConnection {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final PagerState state;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Orientation orientation;

    private final float rl(long j2) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.f16970t ? j2 >> 32 : j2 & 4294967295L));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long F(long consumed, long available, int source) {
        if (!NestedScrollSource.O(source, NestedScrollSource.INSTANCE.n()) || rl(available) == 0.0f) {
            return Offset.INSTANCE.t();
        }
        throw new CancellationException("Scroll cancelled");
    }

    public final long n(long j2, Orientation orientation) {
        return orientation == Orientation.f16969n ? Velocity.O(j2, 0.0f, 0.0f, 2, null) : Velocity.O(j2, 0.0f, 0.0f, 1, null);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long tEO(long available, int source) {
        if (!NestedScrollSource.O(source, NestedScrollSource.INSTANCE.rl()) || Math.abs(this.state.WPU()) <= 1.0E-6d) {
            return Offset.INSTANCE.t();
        }
        float fWPU = this.state.WPU() * this.state.N();
        float pageSize = ((this.state.iF().getPageSize() + this.state.iF().getPageSpacing()) * (-Math.signum(this.state.WPU()))) + fWPU;
        if (this.state.WPU() > 0.0f) {
            pageSize = fWPU;
            fWPU = pageSize;
        }
        Orientation orientation = this.orientation;
        Orientation orientation2 = Orientation.f16970t;
        float fIntBitsToFloat = -this.state.rl(-RangesKt.coerceIn(Float.intBitsToFloat((int) (orientation == orientation2 ? available >> 32 : available & 4294967295L)), fWPU, pageSize));
        float fIntBitsToFloat2 = this.orientation == orientation2 ? fIntBitsToFloat : Float.intBitsToFloat((int) (available >> 32));
        if (this.orientation != Orientation.f16969n) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (available & 4294967295L));
        }
        return Offset.J2(available, fIntBitsToFloat2, fIntBitsToFloat);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public Object z(long j2, long j3, Continuation continuation) {
        return Velocity.rl(n(j3, this.orientation));
    }

    public DefaultPagerNestedScrollConnection(PagerState pagerState, Orientation orientation) {
        this.state = pagerState;
        this.orientation = orientation;
    }
}
