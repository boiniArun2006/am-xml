package androidx.compose.material;

import TFv.CN3;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "anchors", "", c.f62177j, "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState$snapTo$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,881:1\n1#2:882\n*E\n"})
final class SwipeableState$snapTo$2<T> implements CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f23285n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ SwipeableState f23286t;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // TFv.CN3
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rl(Map map, Continuation continuation) {
        SwipeableState$snapTo$2$emit$1 swipeableState$snapTo$2$emit$1;
        SwipeableState$snapTo$2<T> swipeableState$snapTo$2;
        if (continuation instanceof SwipeableState$snapTo$2$emit$1) {
            swipeableState$snapTo$2$emit$1 = (SwipeableState$snapTo$2$emit$1) continuation;
            int i2 = swipeableState$snapTo$2$emit$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                swipeableState$snapTo$2$emit$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                swipeableState$snapTo$2$emit$1 = new SwipeableState$snapTo$2$emit$1(this, continuation);
            }
        }
        Object obj = swipeableState$snapTo$2$emit$1.f23289t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = swipeableState$snapTo$2$emit$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Float fO = SwipeableKt.O(map, this.f23285n);
            if (fO == null) {
                throw new IllegalArgumentException("The target value must have an associated anchor.");
            }
            SwipeableState swipeableState = this.f23286t;
            float fFloatValue = fO.floatValue();
            swipeableState$snapTo$2$emit$1.f23288n = this;
            swipeableState$snapTo$2$emit$1.J2 = 1;
            if (swipeableState.T(fFloatValue, swipeableState$snapTo$2$emit$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            swipeableState$snapTo$2 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            swipeableState$snapTo$2 = (SwipeableState$snapTo$2) swipeableState$snapTo$2$emit$1.f23288n;
            ResultKt.throwOnFailure(obj);
        }
        swipeableState$snapTo$2.f23286t.fD(swipeableState$snapTo$2.f23285n);
        return Unit.INSTANCE;
    }
}
