package androidx.compose.foundation.text;

import GJW.C;
import GJW.h;
import GJW.vd;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarHandler;", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "selectionState", "Landroidx/compose/ui/geometry/Rect;", "rect", "", c.f62177j, "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rl", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBasicTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1\n+ 2 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionStateKt\n*L\n1#1,971:1\n1545#2,7:972\n1545#2,7:979\n1545#2,7:986\n1545#2,7:993\n1545#2,7:1000\n*S KotlinDebug\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1\n*L\n315#1:972,7\n321#1:979,7\n327#1:986,7\n333#1:993,7\n337#1:1000,7\n*E\n"})
public final class BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 implements TextToolbarHandler {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ TextToolbar f19336n;
    final /* synthetic */ vd rl;

    BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1(TextToolbar textToolbar, vd vdVar) {
        this.f19336n = textToolbar;
        this.rl = vdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(TextFieldSelectionState textFieldSelectionState, Rect rect, Continuation continuation) {
        BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;
        Function0<Unit> function0;
        Rect rect2;
        final TextFieldSelectionState textFieldSelectionState2;
        TextToolbar textToolbar;
        final vd vdVar;
        final TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState;
        if (continuation instanceof BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1) {
            basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 = (BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1) continuation;
            int i2 = basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.f19340g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.f19340g = i2 - Integer.MIN_VALUE;
            } else {
                basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 = new BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1(this, continuation);
            }
        }
        Object obj = basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.f19339Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.f19340g;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            TextToolbar textToolbar2 = this.f19336n;
            final vd vdVar2 = this.rl;
            boolean zIF = textFieldSelectionState3.iF();
            final TextToolbarState textToolbarState = TextToolbarState.f20573n;
            Function0<Unit> function02 = !zIF ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    C.nr(vdVar2, null, h.J2, new BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$1$1(textFieldSelectionState3, null), 1, null);
                    textFieldSelectionState3.How(textToolbarState);
                }
            };
            basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.f19341n = vdVar2;
            basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.f19344t = textFieldSelectionState3;
            basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.f19337O = textFieldSelectionState3;
            basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.J2 = function02;
            basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.f19343r = rect;
            basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.f19342o = textToolbar2;
            basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.f19340g = 1;
            Object objE2 = textFieldSelectionState3.E2(basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1);
            if (objE2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            function0 = function02;
            rect2 = rect;
            textFieldSelectionState2 = textFieldSelectionState3;
            textToolbar = textToolbar2;
            obj = objE2;
            vdVar = vdVar2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TextToolbar textToolbar3 = (TextToolbar) basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.f19342o;
            Rect rect3 = (Rect) basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.f19343r;
            Function0<Unit> function03 = (Function0) basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.J2;
            TextFieldSelectionState textFieldSelectionState4 = (TextFieldSelectionState) basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.f19337O;
            textFieldSelectionState2 = (TextFieldSelectionState) basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.f19344t;
            vdVar = (vd) basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.f19341n;
            ResultKt.throwOnFailure(obj);
            textToolbar = textToolbar3;
            rect2 = rect3;
            function0 = function03;
            textFieldSelectionState3 = textFieldSelectionState4;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        final TextToolbarState textToolbarState2 = TextToolbarState.f20573n;
        Function0<Unit> function04 = !zBooleanValue ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$2
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C.nr(vdVar, null, h.J2, new BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$2$1(textFieldSelectionState2, null), 1, null);
                textFieldSelectionState3.How(textToolbarState2);
            }
        };
        Function0<Unit> function05 = !textFieldSelectionState2.fD() ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$3
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C.nr(vdVar, null, h.J2, new BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$3$1(textFieldSelectionState2, null), 1, null);
                textFieldSelectionState2.How(textToolbarState2);
            }
        };
        boolean zE = textFieldSelectionState2.e();
        final TextToolbarState textToolbarState3 = TextToolbarState.f20572O;
        textToolbar.nr(rect2, function0, function04, function05, !zE ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                textFieldSelectionState2.G7();
                textFieldSelectionState2.How(textToolbarState3);
            }
        }, textFieldSelectionState2.te() ? new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                textFieldSelectionState2.g();
                textFieldSelectionState2.How(textToolbarState2);
            }
        } : null);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler
    public void rl() {
        if (this.f19336n.getStatus() == TextToolbarStatus.f33061n) {
            this.f19336n.n();
        }
    }
}
