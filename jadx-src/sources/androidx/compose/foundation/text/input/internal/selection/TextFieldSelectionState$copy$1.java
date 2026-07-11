package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0, 0}, l = {1311}, m = "copy", n = {"this", "cancelSelection"}, s = {"L$0", "Z$0"})
final class TextFieldSelectionState$copy$1 extends ContinuationImpl {
    final /* synthetic */ TextFieldSelectionState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f20435O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f20436n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f20437r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f20438t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionState$copy$1(TextFieldSelectionState textFieldSelectionState, Continuation continuation) {
        super(continuation);
        this.J2 = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20435O = obj;
        this.f20437r |= Integer.MIN_VALUE;
        return this.J2.T(false, this);
    }
}
