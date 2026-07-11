package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0, 0, 0, 0}, l = {984}, m = "detectSelectionHandleDragGestures", n = {"this", "dragBeginPosition", "dragTotalDistance", "handle"}, s = {"L$0", "L$1", "L$2", "L$3"})
final class TextFieldSelectionState$detectSelectionHandleDragGestures$1 extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f20472O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f20473Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f20474n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ TextFieldSelectionState f20475o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    /* synthetic */ Object f20476r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f20477t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionState$detectSelectionHandleDragGestures$1(TextFieldSelectionState textFieldSelectionState, Continuation continuation) {
        super(continuation);
        this.f20475o = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20476r = obj;
        this.f20473Z |= Integer.MIN_VALUE;
        return this.f20475o.bzg(null, false, this);
    }
}
