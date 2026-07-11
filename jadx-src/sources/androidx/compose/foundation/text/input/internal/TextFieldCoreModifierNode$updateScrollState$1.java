package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1", f = "TextFieldCoreModifier.kt", i = {}, l = {447, 450}, m = "invokeSuspend", n = {}, s = {})
final class TextFieldCoreModifierNode$updateScrollState$1 extends SuspendLambda implements Function2<GJW.vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ Rect J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ float f20226O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f20227n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ TextFieldCoreModifierNode f20228t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldCoreModifierNode$updateScrollState$1(TextFieldCoreModifierNode textFieldCoreModifierNode, float f3, Rect rect, Continuation continuation) {
        super(2, continuation);
        this.f20228t = textFieldCoreModifierNode;
        this.f20226O = f3;
        this.J2 = rect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextFieldCoreModifierNode$updateScrollState$1(this.f20228t, this.f20226O, this.J2, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(GJW.vd vdVar, Continuation continuation) {
        return ((TextFieldCoreModifierNode$updateScrollState$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(GJW.vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r5.n(r1, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f20227n;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            ScrollState scrollState = this.f20228t.scrollState;
            float fJ2 = TextFieldCoreModifierKt.J2(this.f20226O);
            this.f20227n = 1;
            if (ScrollExtensionsKt.rl(scrollState, fJ2, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        BringIntoViewRequester bringIntoViewRequester = this.f20228t.textLayoutState.getBringIntoViewRequester();
        Rect rect = this.J2;
        this.f20227n = 2;
    }
}
