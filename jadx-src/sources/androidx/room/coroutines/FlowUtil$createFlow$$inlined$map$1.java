package androidx.room.coroutines;

import TFv.CN3;
import TFv.Wre;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTFv/Wre;", "LTFv/CN3;", "collector", "", c.f62177j, "(LTFv/CN3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
public final class FlowUtil$createFlow$$inlined$map$1 implements Wre {
    final /* synthetic */ Function1 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ boolean f41567O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Wre f41568n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ RoomDatabase f41569t;

    /* JADX INFO: renamed from: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "", "rl", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FlowBuilder.kt\nandroidx/room/coroutines/FlowUtil\n*L\n1#1,222:1\n54#2:223\n38#3:224\n*E\n"})
    public static final class AnonymousClass2<T> implements CN3 {
        final /* synthetic */ Function1 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f41570O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ CN3 f41571n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ RoomDatabase f41572t;

        /* JADX INFO: renamed from: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2", f = "FlowBuilder.kt", i = {}, l = {224, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
        public static final class AnonymousClass1 extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            Object f41573O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f41574n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f41575t;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f41574n = obj;
                this.f41575t |= Integer.MIN_VALUE;
                return AnonymousClass2.this.rl(null, this);
            }
        }

        public AnonymousClass2(CN3 cn3, RoomDatabase roomDatabase, boolean z2, Function1 function1) {
            this.f41571n = cn3;
            this.f41572t = roomDatabase;
            this.f41570O = z2;
            this.J2 = function1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
        
            if (r8.rl(r9, r0) == r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // TFv.CN3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object rl(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            CN3 cn3;
            if (continuation instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) continuation;
                int i2 = anonymousClass1.f41575t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f41575t = i2 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(continuation);
                }
            }
            Object obj2 = anonymousClass1.f41574n;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = anonymousClass1.f41575t;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj2);
                CN3 cn32 = this.f41571n;
                RoomDatabase roomDatabase = this.f41572t;
                boolean z2 = this.f41570O;
                Function1 function1 = this.J2;
                anonymousClass1.f41573O = cn32;
                anonymousClass1.f41575t = 1;
                Object objO = DBUtil.O(roomDatabase, true, z2, function1, anonymousClass1);
                if (objO != coroutine_suspended) {
                    obj2 = objO;
                    cn3 = cn32;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
                return Unit.INSTANCE;
            }
            cn3 = (CN3) anonymousClass1.f41573O;
            ResultKt.throwOnFailure(obj2);
            anonymousClass1.f41573O = null;
            anonymousClass1.f41575t = 2;
        }
    }

    @Override // TFv.Wre
    public Object n(CN3 cn3, Continuation continuation) {
        Object objN = this.f41568n.n(new AnonymousClass2(cn3, this.f41569t, this.f41567O, this.J2), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }
}
