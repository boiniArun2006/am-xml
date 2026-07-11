package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\b\u0000\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0015B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableContainerNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "", "enabled", "<init>", "(Z)V", "", "W5k", "", "v", "Ljava/lang/Object;", "Nxk", "()Ljava/lang/Object;", "traverseKey", "<set-?>", "Xw", "Z", "UR", "()Z", "jB", "TraverseKey", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ScrollableContainerNode extends Modifier.Node implements TraversableNode {

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Object traverseKey = INSTANCE;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int f16999U = 8;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableContainerNode$TraverseKey, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableContainerNode$TraverseKey;", "", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.ui.node.TraversableNode
    /* JADX INFO: renamed from: Nxk, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    /* JADX INFO: renamed from: UR, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void W5k(boolean enabled) {
        this.enabled = enabled;
    }

    public ScrollableContainerNode(boolean z2) {
        this.enabled = z2;
    }
}
