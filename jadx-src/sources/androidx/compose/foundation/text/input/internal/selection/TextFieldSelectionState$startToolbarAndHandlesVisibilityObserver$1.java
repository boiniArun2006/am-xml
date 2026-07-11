package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0}, l = {422}, m = "startToolbarAndHandlesVisibilityObserver", n = {"this"}, s = {"L$0"})
final class TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ TextFieldSelectionState f20541O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f20542n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f20543t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1(TextFieldSelectionState textFieldSelectionState, Continuation continuation) {
        super(continuation);
        this.f20541O = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20543t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f20541O.Po6(this);
    }
}
