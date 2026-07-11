package androidx.constraintlayout.compose.carousel;

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
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "anchors", "", c.f62177j, "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCarouselSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselSwipeable.kt\nandroidx/constraintlayout/compose/carousel/CarouselSwipeableState$animateTo$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,850:1\n1#2:851\n467#3,7:852\n*S KotlinDebug\n*F\n+ 1 CarouselSwipeable.kt\nandroidx/constraintlayout/compose/carousel/CarouselSwipeableState$animateTo$2\n*L\n322#1:852,7\n*E\n"})
final class CarouselSwipeableState$animateTo$2<T> implements CN3 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ AnimationSpec f34927O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f34928n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ CarouselSwipeableState f34929t;

    CarouselSwipeableState$animateTo$2(Object obj, CarouselSwipeableState carouselSwipeableState, AnimationSpec animationSpec) {
        this.f34928n = obj;
        this.f34929t = carouselSwipeableState;
        this.f34927O = animationSpec;
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
        CarouselSwipeableState$animateTo$2$emit$1 carouselSwipeableState$animateTo$2$emit$1;
        CarouselSwipeableState$animateTo$2<T> carouselSwipeableState$animateTo$2;
        Object objFirstOrNull;
        Object objFirstOrNull2;
        if (continuation instanceof CarouselSwipeableState$animateTo$2$emit$1) {
            carouselSwipeableState$animateTo$2$emit$1 = (CarouselSwipeableState$animateTo$2$emit$1) continuation;
            int i2 = carouselSwipeableState$animateTo$2$emit$1.f34932r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                carouselSwipeableState$animateTo$2$emit$1.f34932r = i2 - Integer.MIN_VALUE;
            } else {
                carouselSwipeableState$animateTo$2$emit$1 = new CarouselSwipeableState$animateTo$2$emit$1(this, continuation);
            }
        }
        Object obj = carouselSwipeableState$animateTo$2$emit$1.f34930O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = carouselSwipeableState$animateTo$2$emit$1.f34932r;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) carouselSwipeableState$animateTo$2$emit$1.f34933t;
            carouselSwipeableState$animateTo$2 = (CarouselSwipeableState$animateTo$2) carouselSwipeableState$animateTo$2$emit$1.f34931n;
            try {
                ResultKt.throwOnFailure(obj);
                float fN = carouselSwipeableState$animateTo$2.f34929t.absoluteOffset.n();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (Math.abs(((Number) entry.getKey()).floatValue() - fN) < 0.5f) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                objFirstOrNull2 = CollectionsKt.firstOrNull(linkedHashMap.values());
                if (objFirstOrNull2 == null) {
                    objFirstOrNull2 = carouselSwipeableState$animateTo$2.f34929t.ck();
                }
                carouselSwipeableState$animateTo$2.f34929t.fD(objFirstOrNull2);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                float fN2 = carouselSwipeableState$animateTo$2.f34929t.absoluteOffset.n();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : map.entrySet()) {
                    if (Math.abs(((Number) entry2.getKey()).floatValue() - fN2) < 0.5f) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                objFirstOrNull = CollectionsKt.firstOrNull(linkedHashMap2.values());
                if (objFirstOrNull == null) {
                    objFirstOrNull = carouselSwipeableState$animateTo$2.f34929t.ck();
                }
                carouselSwipeableState$animateTo$2.f34929t.fD(objFirstOrNull);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        try {
            Float fUo = CarouselSwipeableKt.Uo(map, this.f34928n);
            if (fUo == null) {
                throw new IllegalArgumentException("The target value must have an associated anchor.");
            }
            CarouselSwipeableState carouselSwipeableState = this.f34929t;
            float fFloatValue = fUo.floatValue();
            AnimationSpec animationSpec = this.f34927O;
            carouselSwipeableState$animateTo$2$emit$1.f34931n = this;
            carouselSwipeableState$animateTo$2$emit$1.f34933t = map;
            carouselSwipeableState$animateTo$2$emit$1.f34932r = 1;
            if (carouselSwipeableState.xMQ(fFloatValue, animationSpec, carouselSwipeableState$animateTo$2$emit$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            carouselSwipeableState$animateTo$2 = this;
            float fN3 = carouselSwipeableState$animateTo$2.f34929t.absoluteOffset.n();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            while (r7.hasNext()) {
            }
            objFirstOrNull2 = CollectionsKt.firstOrNull(linkedHashMap3.values());
            if (objFirstOrNull2 == null) {
            }
            carouselSwipeableState$animateTo$2.f34929t.fD(objFirstOrNull2);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            carouselSwipeableState$animateTo$2 = this;
            float fN22 = carouselSwipeableState$animateTo$2.f34929t.absoluteOffset.n();
            LinkedHashMap linkedHashMap22 = new LinkedHashMap();
            while (r7.hasNext()) {
            }
            objFirstOrNull = CollectionsKt.firstOrNull(linkedHashMap22.values());
            if (objFirstOrNull == null) {
            }
            carouselSwipeableState$animateTo$2.f34929t.fD(objFirstOrNull);
            throw th;
        }
    }
}
