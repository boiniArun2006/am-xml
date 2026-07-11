package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "it", "Landroidx/compose/foundation/gestures/DraggableAnchors;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", i = {}, l = {408}, m = "invokeSuspend", n = {}, s = {})
final class AnchoredDraggableNode$drag$2<T> extends SuspendLambda implements Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnchoredDraggableNode J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Function2 f16513O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f16514n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f16515t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableNode$drag$2(Function2 function2, AnchoredDraggableNode anchoredDraggableNode, Continuation continuation) {
        super(3, continuation);
        this.f16513O = function2;
        this.J2 = anchoredDraggableNode;
    }

    @Override // kotlin.jvm.functions.Function3
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, Continuation continuation) {
        AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$2 = new AnchoredDraggableNode$drag$2(this.f16513O, this.J2, continuation);
        anchoredDraggableNode$drag$2.f16515t = anchoredDragScope;
        return anchoredDraggableNode$drag$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f16514n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.f16515t;
            Function2 function2 = this.f16513O;
            final AnchoredDraggableNode anchoredDraggableNode = this.J2;
            Function1<DragEvent.DragDelta, Unit> function1 = new Function1<DragEvent.DragDelta, Unit>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DragEvent.DragDelta dragDelta) {
                    n(dragDelta);
                    return Unit.INSTANCE;
                }

                public final void n(DragEvent.DragDelta dragDelta) {
                    AnchoredDraggableNode anchoredDraggableNode2 = anchoredDraggableNode;
                    float fDtL = anchoredDraggableNode2.DtL(anchoredDraggableNode2.sYH(dragDelta.getDelta()));
                    if (anchoredDraggableNode.overscrollEffect == null) {
                        AnchoredDragScope.rl(anchoredDragScope, anchoredDraggableNode.state.nY(fDtL), 0.0f, 2, null);
                        return;
                    }
                    OverscrollEffect overscrollEffect = anchoredDraggableNode.overscrollEffect;
                    Intrinsics.checkNotNull(overscrollEffect);
                    long jPzf = anchoredDraggableNode.Pzf(fDtL);
                    int iRl = NestedScrollSource.INSTANCE.rl();
                    final AnchoredDraggableNode anchoredDraggableNode3 = anchoredDraggableNode;
                    final AnchoredDragScope anchoredDragScope2 = anchoredDragScope;
                    overscrollEffect.KN(jPzf, iRl, new Function1<Offset, Offset>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode.drag.2.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Offset invoke(Offset offset) {
                            return Offset.nr(n(offset.getPackedValue()));
                        }

                        public final long n(long j2) {
                            float fNY = anchoredDraggableNode3.state.nY(anchoredDraggableNode3.DtL(j2));
                            AnchoredDraggableNode anchoredDraggableNode4 = anchoredDraggableNode3;
                            long jPzf2 = anchoredDraggableNode4.Pzf(fNY - anchoredDraggableNode4.state.g());
                            AnchoredDragScope.rl(anchoredDragScope2, fNY, 0.0f, 2, null);
                            return jPzf2;
                        }
                    });
                }
            };
            this.f16514n = 1;
            if (function2.invoke(function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
