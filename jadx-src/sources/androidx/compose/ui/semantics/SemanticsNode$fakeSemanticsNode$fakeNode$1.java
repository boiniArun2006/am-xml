package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/ui/semantics/SemanticsNode$fakeSemanticsNode$fakeNode$1", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "FX", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SemanticsNode$fakeSemanticsNode$fakeNode$1 extends Modifier.Node implements SemanticsModifierNode {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final /* synthetic */ Function1 f33265v;

    SemanticsNode$fakeSemanticsNode$fakeNode$1(Function1 function1) {
        this.f33265v = function1;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void FX(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.f33265v.invoke(semanticsPropertyReceiver);
    }
}
