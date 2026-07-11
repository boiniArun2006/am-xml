package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {1, 1}, l = {1332, 1334, 1334}, m = "paste", n = {"this", "receiveContentConfiguration"}, s = {"L$0", "L$1"})
final class TextFieldSelectionState$paste$1 extends ContinuationImpl {
    final /* synthetic */ TextFieldSelectionState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f20519O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f20520n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f20521r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f20522t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionState$paste$1(TextFieldSelectionState textFieldSelectionState, Continuation continuation) {
        super(continuation);
        this.J2 = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20519O = obj;
        this.f20521r |= Integer.MIN_VALUE;
        return this.J2.ofS(this);
    }
}
