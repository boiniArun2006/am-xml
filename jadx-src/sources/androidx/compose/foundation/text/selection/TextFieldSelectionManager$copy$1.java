package androidx.compose.foundation.text.selection;

import GJW.vd;
import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValueKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", f = "TextFieldSelectionManager.kt", i = {}, l = {623}, m = "invokeSuspend", n = {}, s = {})
final class TextFieldSelectionManager$copy$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ boolean f20959O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f20960n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ TextFieldSelectionManager f20961t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$copy$1(TextFieldSelectionManager textFieldSelectionManager, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.f20961t = textFieldSelectionManager;
        this.f20959O = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextFieldSelectionManager$copy$1(this.f20961t, this.f20959O, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((TextFieldSelectionManager$copy$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f20960n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (TextRange.KN(this.f20961t.p5().getSelection())) {
                return Unit.INSTANCE;
            }
            Clipboard clipboard = this.f20961t.getClipboard();
            if (clipboard != null) {
                ClipEntry clipEntryJ2 = ClipboardUtils_androidKt.J2(TextFieldValueKt.n(this.f20961t.p5()));
                this.f20960n = 1;
                if (clipboard.rl(clipEntryJ2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        if (!this.f20959O) {
            return Unit.INSTANCE;
        }
        int iGh = TextRange.gh(this.f20961t.p5().getSelection());
        TextFieldSelectionManager textFieldSelectionManager = this.f20961t;
        this.f20961t.getOnValueChange().invoke(textFieldSelectionManager.o(textFieldSelectionManager.p5().getText(), TextRangeKt.rl(iGh, iGh)));
        this.f20961t.z(HandleState.f19681n);
        return Unit.INSTANCE;
    }
}
