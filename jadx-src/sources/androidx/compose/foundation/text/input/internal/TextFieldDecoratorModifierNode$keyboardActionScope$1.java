package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"androidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1", "Landroidx/compose/foundation/text/KeyboardActionScope;", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(I)V", "Landroidx/compose/ui/focus/FocusManager;", "rl", "()Landroidx/compose/ui/focus/FocusManager;", "focusManager", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldDecoratorModifierNode$keyboardActionScope$1 implements KeyboardActionScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ TextFieldDecoratorModifierNode f20289n;

    TextFieldDecoratorModifierNode$keyboardActionScope$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        this.f20289n = textFieldDecoratorModifierNode;
    }

    private final FocusManager rl() {
        return (FocusManager) CompositionLocalConsumerModifierNodeKt.n(this.f20289n, CompositionLocalsKt.Uo());
    }

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    public void n(int imeAction) {
        ImeAction.Companion companion = ImeAction.INSTANCE;
        if (ImeAction.az(imeAction, companion.nr())) {
            rl().t(FocusDirection.INSTANCE.O());
        } else if (ImeAction.az(imeAction, companion.J2())) {
            rl().t(FocusDirection.INSTANCE.J2());
        } else if (ImeAction.az(imeAction, companion.rl())) {
            this.f20289n.q().n();
        }
    }
}
