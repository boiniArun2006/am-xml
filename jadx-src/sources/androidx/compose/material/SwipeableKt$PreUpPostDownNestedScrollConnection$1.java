package androidx.compose.material;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u0002*\u00020\u0003H\u0002ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0010H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0010H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"androidx/compose/material/SwipeableKt$PreUpPostDownNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "Landroidx/compose/ui/geometry/Offset;", "rl", "(F)J", c.f62177j, "(J)F", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "tEO", "(JI)J", "consumed", "F", "(JJI)J", "Landroidx/compose/ui/unit/Velocity;", "lS", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "z", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SwipeableKt$PreUpPostDownNestedScrollConnection$1 implements NestedScrollConnection {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ SwipeableState f23203n;

    private final long rl(float f3) {
        return OffsetKt.n(0.0f, f3);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long F(long consumed, long available, int source) {
        return NestedScrollSource.O(source, NestedScrollSource.INSTANCE.rl()) ? rl(this.f23203n.ViF(n(available))) : Offset.INSTANCE.t();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object lS(long j2, Continuation continuation) {
        SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1;
        if (continuation instanceof SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) {
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = (SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) continuation;
            int i2 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = new SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1(this, continuation);
            }
        }
        Object obj = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.f23209t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            float fN = n(OffsetKt.n(Velocity.KN(j2), Velocity.xMQ(j2)));
            if (fN >= 0.0f || ((Number) this.f23203n.Z().getValue()).floatValue() <= this.f23203n.getMinBound()) {
                j2 = Velocity.INSTANCE.n();
            } else {
                SwipeableState swipeableState = this.f23203n;
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.f23208n = j2;
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.J2 = 1;
                if (swipeableState.nY(fN, swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.f23208n;
            ResultKt.throwOnFailure(obj);
        }
        return Velocity.rl(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(long j2, long j3, Continuation continuation) {
        SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1;
        if (continuation instanceof SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) {
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = (SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) continuation;
            int i2 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = new SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(this, continuation);
            }
        }
        Object obj = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.f23206t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            SwipeableState swipeableState = this.f23203n;
            float fN = n(OffsetKt.n(Velocity.KN(j3), Velocity.xMQ(j3)));
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.f23205n = j3;
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.J2 = 1;
            if (swipeableState.nY(fN, swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.f23205n;
            ResultKt.throwOnFailure(obj);
        }
        return Velocity.rl(j3);
    }

    private final float n(long j2) {
        return Offset.ty(j2);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long tEO(long available, int source) {
        float fN = n(available);
        if (fN < 0.0f && NestedScrollSource.O(source, NestedScrollSource.INSTANCE.rl())) {
            return rl(this.f23203n.ViF(fN));
        }
        return Offset.INSTANCE.t();
    }
}
