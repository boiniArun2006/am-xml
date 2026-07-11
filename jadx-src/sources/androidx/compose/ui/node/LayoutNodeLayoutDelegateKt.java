package androidx.compose.ui.node;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "", c.f62177j, "(Landroidx/compose/ui/node/LayoutNode;)Z", "isOutMostLookaheadRoot", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 2 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,497:1\n210#2:498\n435#3,9:499\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n*L\n390#1:498\n390#1:499,9\n*E\n"})
public final class LayoutNodeLayoutDelegateKt {
    public static final boolean n(LayoutNode layoutNode) {
        LayoutNode lookaheadRoot;
        if (layoutNode.getLookaheadRoot() != null) {
            LayoutNode layoutNodeMYa = layoutNode.mYa();
            if (layoutNodeMYa != null) {
                lookaheadRoot = layoutNodeMYa.getLookaheadRoot();
            } else {
                lookaheadRoot = null;
            }
            if (lookaheadRoot == null || layoutNode.getLayoutDelegate().getDetachedFromParentLookaheadPass()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
