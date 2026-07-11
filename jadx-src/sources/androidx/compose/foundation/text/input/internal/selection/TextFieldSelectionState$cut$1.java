package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0}, l = {1287}, m = "cut", n = {"this"}, s = {"L$0"})
final class TextFieldSelectionState$cut$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ TextFieldSelectionState f20452O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f20453n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f20454t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionState$cut$1(TextFieldSelectionState textFieldSelectionState, Continuation continuation) {
        super(continuation);
        this.f20452O = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20454t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f20452O.s7N(this);
    }
}
