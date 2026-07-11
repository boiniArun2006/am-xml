package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0}, l = {1365}, m = "pasteAsPlainText", n = {"this"}, s = {"L$0"})
final class TextFieldSelectionState$pasteAsPlainText$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ TextFieldSelectionState f20523O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f20524n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f20525t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionState$pasteAsPlainText$1(TextFieldSelectionState textFieldSelectionState, Continuation continuation) {
        super(continuation);
        this.f20523O = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20525t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f20523O.C(this);
    }
}
