package androidx.compose.ui.focus;

import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/focus/InvalidateSemantics;", "", "<init>", "()V", "Landroidx/compose/ui/focus/FocusTargetNode;", "focusTargetNode", "", c.f62177j, "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class InvalidateSemantics {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final InvalidateSemantics f31363n = new InvalidateSemantics();

    private InvalidateSemantics() {
    }

    public final void n(FocusTargetNode focusTargetNode) {
        SemanticsModifierNode semanticsModifierNode;
        Object node = focusTargetNode.getNode();
        if (node instanceof SemanticsModifierNode) {
            semanticsModifierNode = (SemanticsModifierNode) node;
        } else {
            semanticsModifierNode = null;
        }
        if (semanticsModifierNode != null) {
            SemanticsModifierNodeKt.rl(semanticsModifierNode);
        }
    }
}
