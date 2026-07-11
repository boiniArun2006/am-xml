package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.TraversableNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/TraversableNode;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "child", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", c.f62177j, "(Landroidx/compose/ui/node/TraversableNode;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;"}, k = 3, mv = {1, 9, 0})
public final class DragAndDropNodeKt$firstDescendantOrNull$1 extends Lambda implements Function1<TraversableNode, TraversableNode.Companion.TraverseDescendantsAction> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function1 f31237n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef f31238t;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(TraversableNode traversableNode) {
        if (!((Boolean) this.f31237n.invoke(traversableNode)).booleanValue()) {
            return TraversableNode.Companion.TraverseDescendantsAction.f32652n;
        }
        this.f31238t.element = traversableNode;
        return TraversableNode.Companion.TraverseDescendantsAction.f32651O;
    }
}
