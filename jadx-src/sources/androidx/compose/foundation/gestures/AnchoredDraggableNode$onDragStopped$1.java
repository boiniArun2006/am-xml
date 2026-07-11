package androidx.compose.foundation.gestures;

import GJW.vd;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.ui.unit.Velocity;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", f = "AnchoredDraggable.kt", i = {}, l = {434, 436}, m = "invokeSuspend", n = {}, s = {})
final class AnchoredDraggableNode$onDragStopped$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ long f16528O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f16529n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ AnchoredDraggableNode f16530t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableNode$onDragStopped$1(AnchoredDraggableNode anchoredDraggableNode, long j2, Continuation continuation) {
        super(2, continuation);
        this.f16530t = anchoredDraggableNode;
        this.f16528O = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnchoredDraggableNode$onDragStopped$1(this.f16530t, this.f16528O, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((AnchoredDraggableNode$onDragStopped$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "availableVelocity"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", f = "AnchoredDraggable.kt", i = {0}, l = {438}, m = "invokeSuspend", n = {"availableVelocity"}, s = {"J$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<Velocity, Continuation<? super Velocity>, Object> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ AnchoredDraggableNode f16531O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f16532n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ long f16533t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnchoredDraggableNode anchoredDraggableNode, Continuation continuation) {
            super(2, continuation);
            this.f16531O = anchoredDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f16531O, continuation);
            anonymousClass1.f16533t = ((Velocity) obj).getPackedValue();
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, Continuation<? super Velocity> continuation) {
            return n(velocity.getPackedValue(), continuation);
        }

        public final Object n(long j2, Continuation continuation) {
            return ((AnonymousClass1) create(Velocity.rl(j2), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long jNQ2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f16532n;
            if (i2 != 0) {
                if (i2 == 1) {
                    jNQ2 = this.f16533t;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                long j2 = this.f16533t;
                AnchoredDraggableNode anchoredDraggableNode = this.f16531O;
                float fEF0 = anchoredDraggableNode.eF0(j2);
                this.f16533t = j2;
                this.f16532n = 1;
                obj = anchoredDraggableNode.ep(fEF0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                jNQ2 = j2;
            }
            float fFloatValue = ((Number) obj).floatValue();
            float fG = this.f16531O.state.g();
            float fO = this.f16531O.state.qie().O();
            if (fG >= this.f16531O.state.qie().J2() || fG <= fO) {
                jNQ2 = this.f16531O.NQ2(fFloatValue);
            }
            return Velocity.rl(jNQ2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r1.ep(r8, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (r1.xMQ(r3, r8, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f16529n;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            AnchoredDraggableNode anchoredDraggableNode = this.f16530t;
            float fEF0 = anchoredDraggableNode.eF0(anchoredDraggableNode.Q(this.f16528O));
            if (this.f16530t.overscrollEffect != null) {
                OverscrollEffect overscrollEffect = this.f16530t.overscrollEffect;
                Intrinsics.checkNotNull(overscrollEffect);
                long jNQ2 = this.f16530t.NQ2(fEF0);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f16530t, null);
                this.f16529n = 2;
            } else {
                AnchoredDraggableNode anchoredDraggableNode2 = this.f16530t;
                this.f16529n = 1;
            }
        }
        return Unit.INSTANCE;
    }
}
