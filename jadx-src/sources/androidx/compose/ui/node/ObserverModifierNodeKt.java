package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u0004\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ObserverModifierNode;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function0;", "", "block", c.f62177j, "(Landroidx/compose/ui/Modifier$Node;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nObserverModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserverModifierNode.kt\nandroidx/compose/ui/node/ObserverModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
public final class ObserverModifierNodeKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(Modifier.Node node, Function0 function0) {
        ObserverNodeOwnerScope ownerScope = node.getOwnerScope();
        if (ownerScope == null) {
            ownerScope = new ObserverNodeOwnerScope((ObserverModifierNode) node);
            node.iu(ownerScope);
        }
        DelegatableNodeKt.ck(node).getSnapshotObserver().xMQ(ownerScope, ObserverNodeOwnerScope.INSTANCE.n(), function0);
    }
}
