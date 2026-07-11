package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "anchors", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "latestTarget"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", f = "AnchoredDraggable.kt", i = {}, l = {1344}, m = "invokeSuspend", n = {}, s = {})
final class AnchoredDraggableKt$animateTo$4 extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<Object>, Object, Continuation<? super Unit>, Object> {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f16468O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f16469n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ AnimationSpec f16470o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ AnchoredDraggableState f16471r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f16472t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableKt$animateTo$4(AnchoredDraggableState anchoredDraggableState, AnimationSpec animationSpec, Continuation continuation) {
        super(4, continuation);
        this.f16471r = anchoredDraggableState;
        this.f16470o = animationSpec;
    }

    @Override // kotlin.jvm.functions.Function4
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, Object obj, Continuation continuation) {
        AnchoredDraggableKt$animateTo$4 anchoredDraggableKt$animateTo$4 = new AnchoredDraggableKt$animateTo$4(this.f16471r, this.f16470o, continuation);
        anchoredDraggableKt$animateTo$4.f16472t = anchoredDragScope;
        anchoredDraggableKt$animateTo$4.f16468O = draggableAnchors;
        anchoredDraggableKt$animateTo$4.J2 = obj;
        return anchoredDraggableKt$animateTo$4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f16469n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.f16472t;
            DraggableAnchors draggableAnchors = (DraggableAnchors) this.f16468O;
            Object obj2 = this.J2;
            AnchoredDraggableState anchoredDraggableState = this.f16471r;
            float fIk = anchoredDraggableState.Ik();
            AnimationSpec animationSpec = this.f16470o;
            this.f16472t = null;
            this.f16468O = null;
            this.f16469n = 1;
            if (AnchoredDraggableKt.gh(anchoredDraggableState, fIk, anchoredDragScope, draggableAnchors, obj2, animationSpec, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
