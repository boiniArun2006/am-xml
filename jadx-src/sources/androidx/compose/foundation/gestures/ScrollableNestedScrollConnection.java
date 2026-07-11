package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u0012\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogic", "", "enabled", "<init>", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Z)V", "Landroidx/compose/ui/geometry/Offset;", "consumed", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "F", "(JJI)J", "Landroidx/compose/ui/unit/Velocity;", "z", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", c.f62177j, "Landroidx/compose/foundation/gestures/ScrollingLogic;", "getScrollingLogic", "()Landroidx/compose/foundation/gestures/ScrollingLogic;", "t", "Z", "getEnabled", "()Z", "(Z)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ScrollableNestedScrollConnection implements NestedScrollConnection {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ScrollingLogic scrollingLogic;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long F(long consumed, long available, int source) {
        return this.enabled ? this.scrollingLogic.S(available) : Offset.INSTANCE.t();
    }

    public final void n(boolean z2) {
        this.enabled = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r5 == r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r5 == r8) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(long j2, long j3, Continuation continuation) {
        ScrollableNestedScrollConnection$onPostFling$1 scrollableNestedScrollConnection$onPostFling$1;
        long jN;
        long jN2;
        if (continuation instanceof ScrollableNestedScrollConnection$onPostFling$1) {
            scrollableNestedScrollConnection$onPostFling$1 = (ScrollableNestedScrollConnection$onPostFling$1) continuation;
            int i2 = scrollableNestedScrollConnection$onPostFling$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollableNestedScrollConnection$onPostFling$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                scrollableNestedScrollConnection$onPostFling$1 = new ScrollableNestedScrollConnection$onPostFling$1(this, continuation);
            }
        }
        Object objCk = scrollableNestedScrollConnection$onPostFling$1.f17027t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = scrollableNestedScrollConnection$onPostFling$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objCk);
            if (!this.enabled) {
                jN = Velocity.INSTANCE.n();
                return Velocity.rl(jN);
            }
            if (!ComposeFoundationFlags.NewNestedFlingPropagationEnabled) {
                ScrollingLogic scrollingLogic = this.scrollingLogic;
                scrollableNestedScrollConnection$onPostFling$1.f17026n = j3;
                scrollableNestedScrollConnection$onPostFling$1.J2 = 2;
                objCk = scrollingLogic.ck(j3, scrollableNestedScrollConnection$onPostFling$1);
            } else if (this.scrollingLogic.getIsFlinging()) {
                jN2 = Velocity.INSTANCE.n();
            } else {
                ScrollingLogic scrollingLogic2 = this.scrollingLogic;
                scrollableNestedScrollConnection$onPostFling$1.f17026n = j3;
                scrollableNestedScrollConnection$onPostFling$1.J2 = 1;
                objCk = scrollingLogic2.ck(j3, scrollableNestedScrollConnection$onPostFling$1);
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            j3 = scrollableNestedScrollConnection$onPostFling$1.f17026n;
            ResultKt.throwOnFailure(objCk);
            jN2 = ((Velocity) objCk).getPackedValue();
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = scrollableNestedScrollConnection$onPostFling$1.f17026n;
            ResultKt.throwOnFailure(objCk);
            jN2 = ((Velocity) objCk).getPackedValue();
        }
        jN = Velocity.gh(j3, jN2);
        return Velocity.rl(jN);
    }

    public ScrollableNestedScrollConnection(ScrollingLogic scrollingLogic, boolean z2) {
        this.scrollingLogic = scrollingLogic;
        this.enabled = z2;
    }
}
