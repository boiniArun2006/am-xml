package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.internal.AnchoredDragScope;
import androidx.compose.material3.internal.DraggableAnchors;
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
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/material3/internal/AnchoredDragScope;", "anchors", "Landroidx/compose/material3/internal/DraggableAnchors;", "Landroidx/compose/material3/DrawerValue;", "latestTarget"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.DrawerState$animateTo$3", f = "NavigationDrawer.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
final class DrawerState$animateTo$3 extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<DrawerValue>, DrawerValue, Continuation<? super Unit>, Object> {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f25698O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ AnimationSpec f25699Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f25700n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ float f25701o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ DrawerState f25702r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f25703t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DrawerState$animateTo$3(DrawerState drawerState, float f3, AnimationSpec animationSpec, Continuation continuation) {
        super(4, continuation);
        this.f25702r = drawerState;
        this.f25701o = f3;
        this.f25699Z = animationSpec;
    }

    @Override // kotlin.jvm.functions.Function4
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, DrawerValue drawerValue, Continuation continuation) {
        DrawerState$animateTo$3 drawerState$animateTo$3 = new DrawerState$animateTo$3(this.f25702r, this.f25701o, this.f25699Z, continuation);
        drawerState$animateTo$3.f25703t = anchoredDragScope;
        drawerState$animateTo$3.f25698O = draggableAnchors;
        drawerState$animateTo$3.J2 = drawerValue;
        return drawerState$animateTo$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float fJ2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f25700n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.f25703t;
            float fT = ((DraggableAnchors) this.f25698O).t((DrawerValue) this.J2);
            if (!Float.isNaN(fT)) {
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                if (Float.isNaN(this.f25702r.J2())) {
                    fJ2 = 0.0f;
                } else {
                    fJ2 = this.f25702r.J2();
                }
                float f3 = fJ2;
                floatRef.element = f3;
                float f4 = this.f25701o;
                AnimationSpec animationSpec = this.f25699Z;
                Function2<Float, Float, Unit> function2 = new Function2<Float, Float, Unit>() { // from class: androidx.compose.material3.DrawerState$animateTo$3.1
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
                this.f25703t = null;
                this.f25698O = null;
                this.f25700n = 1;
                if (SuspendAnimationKt.rl(f3, fT, f4, animationSpec, function2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
