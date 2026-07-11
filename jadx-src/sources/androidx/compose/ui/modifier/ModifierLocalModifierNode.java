package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u00012\u00020\u0002J+\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR$\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "Landroidx/compose/ui/node/DelegatableNode;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/modifier/ModifierLocal;", "key", "value", "", "Th", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "Rl", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "aYN", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "current", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,235:1\n102#2,5:236\n102#2,5:241\n102#2,5:246\n56#2,5:258\n99#3:251\n247#4,5:252\n90#4:257\n91#4,8:263\n437#4,6:271\n447#4,2:278\n449#4,8:283\n457#4,9:294\n466#4,8:306\n100#4,7:314\n246#5:277\n240#6,3:280\n243#6,3:303\n1101#7:291\n1083#7,2:292\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNode\n*L\n150#1:236,5\n153#1:241,5\n166#1:246,5\n170#1:258,5\n170#1:251\n170#1:252,5\n170#1:257\n170#1:263,8\n170#1:271,6\n170#1:278,2\n170#1:283,8\n170#1:294,9\n170#1:306,8\n170#1:314,7\n170#1:277\n170#1:280,3\n170#1:303,3\n170#1:291\n170#1:292,2\n*E\n"})
public interface ModifierLocalModifierNode extends ModifierLocalReadScope, DelegatableNode {
    /* JADX INFO: renamed from: Rl */
    default ModifierLocalMap getProvidedValues() {
        return EmptyMap.f32357n;
    }

    default void Th(ModifierLocal key, Object value) {
        boolean z2;
        if (getProvidedValues() != EmptyMap.f32357n) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            InlineClassHelperKt.n("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!getProvidedValues().n(key)) {
            InlineClassHelperKt.n("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + key + " was not found.");
        }
        getProvidedValues().t(key, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
    default Object aYN(ModifierLocal modifierLocal) {
        NodeChain nodes;
        if (!getNode().getIsAttached()) {
            InlineClassHelperKt.n("ModifierLocal accessed from an unattached node");
        }
        int iN = NodeKind.n(32);
        if (!getNode().getIsAttached()) {
            InlineClassHelperKt.t("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = getNode().getParent();
        LayoutNode layoutNodeHI = DelegatableNodeKt.HI(this);
        while (layoutNodeHI != null) {
            if ((layoutNodeHI.getNodes().getHead().getAggregateChildKindSet() & iN) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iN) != 0) {
                        ?? KN = parent;
                        ?? mutableVector = 0;
                        while (KN != 0) {
                            if (KN instanceof ModifierLocalModifierNode) {
                                ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) KN;
                                if (modifierLocalModifierNode.getProvidedValues().n(modifierLocal)) {
                                    return modifierLocalModifierNode.getProvidedValues().rl(modifierLocal);
                                }
                            } else if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                                Modifier.Node delegate = ((DelegatingNode) KN).getDelegate();
                                int i2 = 0;
                                KN = KN;
                                mutableVector = mutableVector;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iN) != 0) {
                                        i2++;
                                        mutableVector = mutableVector;
                                        if (i2 == 1) {
                                            KN = delegate;
                                        } else {
                                            if (mutableVector == 0) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (KN != 0) {
                                                mutableVector.rl(KN);
                                                KN = 0;
                                            }
                                            mutableVector.rl(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    KN = KN;
                                    mutableVector = mutableVector;
                                }
                                if (i2 == 1) {
                                }
                            }
                            KN = DelegatableNodeKt.KN(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeHI = layoutNodeHI.mYa();
            if (layoutNodeHI != null && (nodes = layoutNodeHI.getNodes()) != null) {
                parent = nodes.getTail();
            } else {
                parent = null;
            }
        }
        return modifierLocal.getDefaultFactory().invoke();
    }
}
