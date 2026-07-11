package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNodeKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "", c.f62177j, "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FocusPropertiesModifierNodeKt {
    public static final void n(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        DelegatableNodeKt.ck(focusPropertiesModifierNode).getFocusOwner().ck(focusPropertiesModifierNode);
    }
}
