package androidx.compose.material3.internal;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/material3/internal/AnchoredDragScope;", "anchors", "Landroidx/compose/material3/internal/DraggableAnchors;", "latestTarget"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", i = {}, l = {685}, m = "invokeSuspend", n = {}, s = {})
final class AnchoredDraggableKt$animateTo$2 extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<Object>, Object, Continuation<? super Unit>, Object> {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f29011O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f29012n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ float f29013o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ AnchoredDraggableState f29014r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f29015t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableKt$animateTo$2(AnchoredDraggableState anchoredDraggableState, float f3, Continuation continuation) {
        super(4, continuation);
        this.f29014r = anchoredDraggableState;
        this.f29013o = f3;
    }

    @Override // kotlin.jvm.functions.Function4
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, Object obj, Continuation continuation) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(this.f29014r, this.f29013o, continuation);
        anchoredDraggableKt$animateTo$2.f29015t = anchoredDragScope;
        anchoredDraggableKt$animateTo$2.f29011O = draggableAnchors;
        anchoredDraggableKt$animateTo$2.J2 = obj;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float fWPU;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f29012n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.f29015t;
            float fT = ((DraggableAnchors) this.f29011O).t(this.J2);
            if (!Float.isNaN(fT)) {
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                if (Float.isNaN(this.f29014r.WPU())) {
                    fWPU = 0.0f;
                } else {
                    fWPU = this.f29014r.WPU();
                }
                float f3 = fWPU;
                floatRef.element = f3;
                float f4 = this.f29013o;
                AnimationSpec animationSpec = this.f29014r.getAnimationSpec();
                Function2<Float, Float, Unit> function2 = new Function2<Float, Float, Unit>() { // from class: androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Float f5, Float f6) {
                        n(f5.floatValue(), f6.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(float f5, float f6) {
                        anchoredDragScope.n(f5, f6);
                        floatRef.element = f5;
                    }
                };
                this.f29015t = null;
                this.f29011O = null;
                this.f29012n = 1;
                if (SuspendAnimationKt.rl(f3, fT, f4, animationSpec, function2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
