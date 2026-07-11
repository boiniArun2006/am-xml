package androidx.compose.material;

import TFv.CN3;
import androidx.compose.animation.core.AnimationSpec;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "anchors", "", c.f62177j, "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState$animateTo$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,881:1\n1#2:882\n478#3,7:883\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState$animateTo$2\n*L\n334#1:883,7\n*E\n"})
final class SwipeableState$animateTo$2<T> implements CN3 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ AnimationSpec f23266O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f23267n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ SwipeableState f23268t;

    SwipeableState$animateTo$2(Object obj, SwipeableState swipeableState, AnimationSpec animationSpec) {
        this.f23267n = obj;
        this.f23268t = swipeableState;
        this.f23266O = animationSpec;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // TFv.CN3
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rl(Map map, Continuation continuation) throws Throwable {
        SwipeableState$animateTo$2$emit$1 swipeableState$animateTo$2$emit$1;
        SwipeableState$animateTo$2<T> swipeableState$animateTo$2;
        Object objFirstOrNull;
        Object objFirstOrNull2;
        if (continuation instanceof SwipeableState$animateTo$2$emit$1) {
            swipeableState$animateTo$2$emit$1 = (SwipeableState$animateTo$2$emit$1) continuation;
            int i2 = swipeableState$animateTo$2$emit$1.f23271r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                swipeableState$animateTo$2$emit$1.f23271r = i2 - Integer.MIN_VALUE;
            } else {
                swipeableState$animateTo$2$emit$1 = new SwipeableState$animateTo$2$emit$1(this, continuation);
            }
        }
        Object obj = swipeableState$animateTo$2$emit$1.f23269O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = swipeableState$animateTo$2$emit$1.f23271r;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) swipeableState$animateTo$2$emit$1.f23272t;
            swipeableState$animateTo$2 = (SwipeableState$animateTo$2) swipeableState$animateTo$2$emit$1.f23270n;
            try {
                ResultKt.throwOnFailure(obj);
                float fN = swipeableState$animateTo$2.f23268t.absoluteOffset.n();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (Math.abs(((Number) entry.getKey()).floatValue() - fN) < 0.5f) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                objFirstOrNull2 = CollectionsKt.firstOrNull(linkedHashMap.values());
                if (objFirstOrNull2 == null) {
                    objFirstOrNull2 = swipeableState$animateTo$2.f23268t.ck();
                }
                swipeableState$animateTo$2.f23268t.fD(objFirstOrNull2);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                float fN2 = swipeableState$animateTo$2.f23268t.absoluteOffset.n();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : map.entrySet()) {
                    if (Math.abs(((Number) entry2.getKey()).floatValue() - fN2) < 0.5f) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                objFirstOrNull = CollectionsKt.firstOrNull(linkedHashMap2.values());
                if (objFirstOrNull == null) {
                    objFirstOrNull = swipeableState$animateTo$2.f23268t.ck();
                }
                swipeableState$animateTo$2.f23268t.fD(objFirstOrNull);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        try {
            Float fO = SwipeableKt.O(map, this.f23267n);
            if (fO == null) {
                throw new IllegalArgumentException("The target value must have an associated anchor.");
            }
            SwipeableState swipeableState = this.f23268t;
            float fFloatValue = fO.floatValue();
            AnimationSpec animationSpec = this.f23266O;
            swipeableState$animateTo$2$emit$1.f23270n = this;
            swipeableState$animateTo$2$emit$1.f23272t = map;
            swipeableState$animateTo$2$emit$1.f23271r = 1;
            if (swipeableState.xMQ(fFloatValue, animationSpec, swipeableState$animateTo$2$emit$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            swipeableState$animateTo$2 = this;
            float fN3 = swipeableState$animateTo$2.f23268t.absoluteOffset.n();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            while (r7.hasNext()) {
            }
            objFirstOrNull2 = CollectionsKt.firstOrNull(linkedHashMap3.values());
            if (objFirstOrNull2 == null) {
            }
            swipeableState$animateTo$2.f23268t.fD(objFirstOrNull2);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            swipeableState$animateTo$2 = this;
            float fN22 = swipeableState$animateTo$2.f23268t.absoluteOffset.n();
            LinkedHashMap linkedHashMap22 = new LinkedHashMap();
            while (r7.hasNext()) {
            }
            objFirstOrNull = CollectionsKt.firstOrNull(linkedHashMap22.values());
            if (objFirstOrNull == null) {
            }
            swipeableState$animateTo$2.f23268t.fD(objFirstOrNull);
            throw th;
        }
    }
}
