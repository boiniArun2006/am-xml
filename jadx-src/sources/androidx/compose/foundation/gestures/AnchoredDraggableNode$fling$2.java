package androidx.compose.foundation.gestures;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "it", "Landroidx/compose/foundation/gestures/DraggableAnchors;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", f = "AnchoredDraggable.kt", i = {}, l = {469}, m = "invokeSuspend", n = {}, s = {})
final class AnchoredDraggableNode$fling$2<T> extends SuspendLambda implements Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.FloatRef J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ AnchoredDraggableNode f16523O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f16524n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ float f16525r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f16526t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableNode$fling$2(AnchoredDraggableNode anchoredDraggableNode, Ref.FloatRef floatRef, float f3, Continuation continuation) {
        super(3, continuation);
        this.f16523O = anchoredDraggableNode;
        this.J2 = floatRef;
        this.f16525r = f3;
    }

    @Override // kotlin.jvm.functions.Function3
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, Continuation continuation) {
        AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new AnchoredDraggableNode$fling$2(this.f16523O, this.J2, this.f16525r, continuation);
        anchoredDraggableNode$fling$2.f16526t = anchoredDragScope;
        return anchoredDraggableNode$fling$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.FloatRef floatRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f16524n;
        if (i2 != 0) {
            if (i2 == 1) {
                floatRef = (Ref.FloatRef) this.f16526t;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.f16526t;
            final AnchoredDraggableNode anchoredDraggableNode = this.f16523O;
            ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2$scrollScope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float nr(float pixels) {
                    float fNY = anchoredDraggableNode.state.nY(pixels);
                    float fR = fNY - anchoredDraggableNode.state.r();
                    AnchoredDragScope.rl(anchoredDragScope, fNY, 0.0f, 2, null);
                    return fR;
                }
            };
            FlingBehavior flingBehaviorX6 = this.f16523O.X6();
            Ref.FloatRef floatRef2 = this.J2;
            float f3 = this.f16525r;
            this.f16526t = floatRef2;
            this.f16524n = 1;
            obj = flingBehaviorX6.n(scrollScope, f3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef = floatRef2;
        }
        floatRef.element = ((Number) obj).floatValue();
        return Unit.INSTANCE;
    }
}
