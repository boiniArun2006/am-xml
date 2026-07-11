package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.unit.IntSize;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\u00020\u000f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\u000f*\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\f2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u000f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010!\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0017\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000f0\u001d¢\u0006\u0002\b\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J9\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b$\u0010%J3\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b'\u0010(J\u0011\u0010*\u001a\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0000H\u0000¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u00104\u001a\u0004\b5\u00106R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109R\"\u0010=\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u00101\u001a\u0004\b:\u00103\"\u0004\b;\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010>R\u0017\u0010E\u001a\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u00103R\u0014\u0010I\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u00103R\u0011\u0010M\u001a\u00020J8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0011\u0010Q\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0017\u0010U\u001a\u00020R8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0011\u0010W\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\bV\u0010PR\u0017\u0010Z\u001a\u00020X8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bY\u0010TR\u0011\u0010\\\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\b[\u0010PR\u0014\u0010^\u001a\u00020N8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b]\u0010PR\u0014\u0010`\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u00103R\u0011\u0010b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\ba\u00109R\u0017\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010dR\u0013\u0010h\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\bg\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006i"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "Landroidx/compose/ui/Modifier$Node;", "outerSemanticsNode", "", "mergingEnabled", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "unmergedConfig", "<init>", "(Landroidx/compose/ui/Modifier$Node;ZLandroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "", "unmergedChildren", "mergedConfig", "", "te", "(Ljava/util/List;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "list", "includeDeactivatedNodes", "nr", "(Landroidx/compose/ui/node/LayoutNode;Ljava/util/List;Z)V", "", "J2", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "rl", "(Ljava/util/List;)V", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/ExtensionFunctionType;", "properties", "t", "(Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/semantics/SemanticsNode;", "includeFakeNodes", "iF", "(Ljava/util/List;ZZ)Ljava/util/List;", "includeReplacedSemantics", "qie", "(ZZZ)Ljava/util/List;", "Landroidx/compose/ui/node/NodeCoordinator;", "O", "()Landroidx/compose/ui/node/NodeCoordinator;", c.f62177j, "()Landroidx/compose/ui/semantics/SemanticsNode;", "Landroidx/compose/ui/Modifier$Node;", "getOuterSemanticsNode$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "Z", "getMergingEnabled", "()Z", "Landroidx/compose/ui/node/LayoutNode;", "Ik", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "WPU", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "aYN", "setFake$ui_release", "(Z)V", "isFake", "Landroidx/compose/ui/semantics/SemanticsNode;", "fakeNodeParent", "", "Uo", "I", "HI", "()I", "id", "ViF", "isMergingSemanticsOfDescendants", "g", "isUnmergedLeafNode", "Landroidx/compose/ui/layout/LayoutInfo;", "ck", "()Landroidx/compose/ui/layout/LayoutInfo;", "layoutInfo", "Landroidx/compose/ui/geometry/Rect;", "S", "()Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "Landroidx/compose/ui/unit/IntSize;", "XQ", "()J", "size", "xMQ", "boundsInRoot", "Landroidx/compose/ui/geometry/Offset;", "o", "positionInRoot", "mUb", "boundsInWindow", "KN", "boundsInParent", "nY", "isTransparent", "ty", "config", "gh", "()Ljava/util/List;", "children", "replacedChildren", "r", "parent", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n+ 2 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,502:1\n386#1,10:515\n386#1,10:556\n484#2,10:503\n484#2,10:535\n484#2,3:545\n487#2,7:549\n1#3:513\n91#4:514\n91#4:531\n91#4:548\n91#4:566\n423#5,6:525\n429#5,3:532\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n*L\n235#1:515,10\n369#1:556,10\n101#1:503,10\n351#1:535,10\n357#1:545,3\n357#1:549,7\n188#1:514\n277#1:531\n357#1:548\n406#1:566\n272#1:525,6\n272#1:532,3\n*E\n"})
public final class SemanticsNode {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private SemanticsNode fakeNodeParent;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean isFake;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Modifier.Node outerSemanticsNode;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final SemanticsConfiguration unmergedConfig;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final boolean mergingEnabled;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final LayoutNode layoutNode;

    public final List Z() {
        return az(this, false, true, false, 4, null);
    }

    public final List gh() {
        return az(this, false, false, false, 7, null);
    }

    static /* synthetic */ List Uo(SemanticsNode semanticsNode, List list, List list2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            list2 = new ArrayList();
        }
        return semanticsNode.J2(list, list2);
    }

    private final boolean ViF() {
        return this.mergingEnabled && this.unmergedConfig.getIsMergingSemanticsOfDescendants();
    }

    public static /* synthetic */ List az(SemanticsNode semanticsNode, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = !semanticsNode.mergingEnabled;
        }
        if ((i2 & 2) != 0) {
            z3 = false;
        }
        if ((i2 & 4) != 0) {
            z4 = false;
        }
        return semanticsNode.qie(z2, z3, z4);
    }

    public static /* synthetic */ List fD(SemanticsNode semanticsNode, List list, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = new ArrayList();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        return semanticsNode.iF(list, z2, z3);
    }

    private final SemanticsNode t(Role role, Function1 properties) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.Ik(false);
        semanticsConfiguration.ck(false);
        properties.invoke(semanticsConfiguration);
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsNode$fakeSemanticsNode$fakeNode$1(properties), false, new LayoutNode(true, role != null ? SemanticsNodeKt.KN(this) : SemanticsNodeKt.O(this)), semanticsConfiguration);
        semanticsNode.isFake = true;
        semanticsNode.fakeNodeParent = this;
        return semanticsNode;
    }

    private final void te(List unmergedChildren, SemanticsConfiguration mergedConfig) {
        if (this.unmergedConfig.getIsClearingSemantics()) {
            return;
        }
        fD(this, unmergedChildren, false, false, 6, null);
        int size = unmergedChildren.size();
        for (int size2 = unmergedChildren.size(); size2 < size; size2++) {
            SemanticsNode semanticsNode = (SemanticsNode) unmergedChildren.get(size2);
            if (!semanticsNode.ViF()) {
                mergedConfig.HI(semanticsNode.unmergedConfig);
                semanticsNode.te(unmergedChildren, mergedConfig);
            }
        }
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final NodeCoordinator O() {
        if (this.isFake) {
            SemanticsNode semanticsNodeR = r();
            if (semanticsNodeR != null) {
                return semanticsNodeR.O();
            }
            return null;
        }
        DelegatableNode delegatableNodeJ2 = SemanticsNodeKt.J2(this.layoutNode);
        if (delegatableNodeJ2 == null) {
            delegatableNodeJ2 = this.outerSemanticsNode;
        }
        return DelegatableNodeKt.mUb(delegatableNodeJ2, NodeKind.n(8));
    }

    public final Rect S() {
        DelegatableNode delegatableNodeJ2;
        if (!this.unmergedConfig.getIsMergingSemanticsOfDescendants() || (delegatableNodeJ2 = SemanticsNodeKt.J2(this.layoutNode)) == null) {
            delegatableNodeJ2 = this.outerSemanticsNode;
        }
        return SemanticsModifierNodeKt.t(delegatableNodeJ2.getNode(), SemanticsModifierNodeKt.n(this.unmergedConfig));
    }

    /* JADX INFO: renamed from: WPU, reason: from getter */
    public final SemanticsConfiguration getUnmergedConfig() {
        return this.unmergedConfig;
    }

    /* JADX INFO: renamed from: aYN, reason: from getter */
    public final boolean getIsFake() {
        return this.isFake;
    }

    public final LayoutInfo ck() {
        return this.layoutNode;
    }

    public final boolean g() {
        if (this.isFake || !Z().isEmpty()) {
            return false;
        }
        LayoutNode layoutNodeMYa = this.layoutNode.mYa();
        while (true) {
            if (layoutNodeMYa == null) {
                layoutNodeMYa = null;
                break;
            }
            SemanticsConfiguration semanticsConfigurationD = layoutNodeMYa.D();
            if (semanticsConfigurationD != null && semanticsConfigurationD.getIsMergingSemanticsOfDescendants()) {
                break;
            }
            layoutNodeMYa = layoutNodeMYa.mYa();
        }
        return layoutNodeMYa == null;
    }

    public final List iF(List unmergedChildren, boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (this.isFake) {
            return CollectionsKt.emptyList();
        }
        nr(this.layoutNode, unmergedChildren, includeDeactivatedNodes);
        if (includeFakeNodes) {
            rl(unmergedChildren);
        }
        return unmergedChildren;
    }

    public final SemanticsNode n() {
        return new SemanticsNode(this.outerSemanticsNode, true, this.layoutNode, this.unmergedConfig);
    }

    public final List qie(boolean includeReplacedSemantics, boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (!includeReplacedSemantics && this.unmergedConfig.getIsClearingSemantics()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        return ViF() ? Uo(this, arrayList, null, 2, null) : iF(arrayList, includeFakeNodes, includeDeactivatedNodes);
    }

    public final SemanticsNode r() {
        LayoutNode layoutNodeMYa;
        SemanticsNode semanticsNode = this.fakeNodeParent;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        if (this.mergingEnabled) {
            layoutNodeMYa = this.layoutNode.mYa();
            while (layoutNodeMYa != null) {
                SemanticsConfiguration semanticsConfigurationD = layoutNodeMYa.D();
                if (semanticsConfigurationD != null && semanticsConfigurationD.getIsMergingSemanticsOfDescendants()) {
                    break;
                }
                layoutNodeMYa = layoutNodeMYa.mYa();
            }
            layoutNodeMYa = null;
        } else {
            layoutNodeMYa = null;
        }
        if (layoutNodeMYa == null) {
            layoutNodeMYa = this.layoutNode.mYa();
            while (true) {
                if (layoutNodeMYa == null) {
                    layoutNodeMYa = null;
                    break;
                }
                if (layoutNodeMYa.getNodes().Ik(NodeKind.n(8))) {
                    break;
                }
                layoutNodeMYa = layoutNodeMYa.mYa();
            }
        }
        if (layoutNodeMYa == null) {
            return null;
        }
        return SemanticsNodeKt.n(layoutNodeMYa, this.mergingEnabled);
    }

    public SemanticsNode(Modifier.Node node, boolean z2, LayoutNode layoutNode, SemanticsConfiguration semanticsConfiguration) {
        this.outerSemanticsNode = node;
        this.mergingEnabled = z2;
        this.layoutNode = layoutNode;
        this.unmergedConfig = semanticsConfiguration;
        this.id = layoutNode.getSemanticsId();
    }

    private final List J2(List unmergedChildren, List list) {
        fD(this, unmergedChildren, false, false, 6, null);
        int size = unmergedChildren.size();
        for (int size2 = unmergedChildren.size(); size2 < size; size2++) {
            SemanticsNode semanticsNode = (SemanticsNode) unmergedChildren.get(size2);
            if (semanticsNode.ViF()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.unmergedConfig.getIsClearingSemantics()) {
                semanticsNode.J2(unmergedChildren, list);
            }
        }
        return list;
    }

    private final void nr(LayoutNode layoutNode, List list, boolean z2) {
        MutableVector mutableVectorEWS = layoutNode.EWS();
        Object[] objArr = mutableVectorEWS.content;
        int size = mutableVectorEWS.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.nr() && (z2 || !layoutNode2.getIsDeactivated())) {
                if (layoutNode2.getNodes().Ik(NodeKind.n(8))) {
                    list.add(SemanticsNodeKt.n(layoutNode2, this.mergingEnabled));
                } else {
                    nr(layoutNode2, list, z2);
                }
            }
        }
    }

    private final void rl(List unmergedChildren) {
        final String str;
        final Role roleUo = SemanticsNodeKt.Uo(this);
        if (roleUo != null && this.unmergedConfig.getIsMergingSemanticsOfDescendants() && !unmergedChildren.isEmpty()) {
            unmergedChildren.add(t(roleUo, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    n(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.C(semanticsPropertyReceiver, roleUo.getValue());
                }
            }));
        }
        SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
        SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
        if (semanticsConfiguration.J2(semanticsProperties.nr()) && !unmergedChildren.isEmpty() && this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            List list = (List) SemanticsConfigurationKt.n(this.unmergedConfig, semanticsProperties.nr());
            if (list != null) {
                str = (String) CollectionsKt.firstOrNull(list);
            } else {
                str = null;
            }
            if (str != null) {
                unmergedChildren.add(0, t(null, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        n(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.I(semanticsPropertyReceiver, str);
                    }
                }));
            }
        }
    }

    public final Rect KN() {
        LayoutCoordinates layoutCoordinatesZmq;
        SemanticsNode semanticsNodeR = r();
        if (semanticsNodeR == null) {
            return Rect.INSTANCE.n();
        }
        NodeCoordinator nodeCoordinatorO = O();
        if (nodeCoordinatorO != null) {
            if (!nodeCoordinatorO.nr()) {
                nodeCoordinatorO = null;
            }
            if (nodeCoordinatorO != null && (layoutCoordinatesZmq = nodeCoordinatorO.Zmq()) != null) {
                return LayoutCoordinates.N(DelegatableNodeKt.mUb(semanticsNodeR.outerSemanticsNode, NodeKind.n(8)), layoutCoordinatesZmq, false, 2, null);
            }
        }
        return Rect.INSTANCE.n();
    }

    public final long XQ() {
        NodeCoordinator nodeCoordinatorO = O();
        if (nodeCoordinatorO != null) {
            return nodeCoordinatorO.n();
        }
        return IntSize.INSTANCE.n();
    }

    public final Rect mUb() {
        Rect rectT;
        NodeCoordinator nodeCoordinatorO = O();
        if (nodeCoordinatorO != null) {
            if (!nodeCoordinatorO.nr()) {
                nodeCoordinatorO = null;
            }
            if (nodeCoordinatorO != null && (rectT = LayoutCoordinatesKt.t(nodeCoordinatorO)) != null) {
                return rectT;
            }
        }
        return Rect.INSTANCE.n();
    }

    public final boolean nY() {
        NodeCoordinator nodeCoordinatorO = O();
        if (nodeCoordinatorO != null) {
            return nodeCoordinatorO.pr();
        }
        return false;
    }

    public final long o() {
        NodeCoordinator nodeCoordinatorO = O();
        if (nodeCoordinatorO != null) {
            if (!nodeCoordinatorO.nr()) {
                nodeCoordinatorO = null;
            }
            if (nodeCoordinatorO != null) {
                return LayoutCoordinatesKt.J2(nodeCoordinatorO);
            }
        }
        return Offset.INSTANCE.t();
    }

    public final SemanticsConfiguration ty() {
        if (ViF()) {
            SemanticsConfiguration semanticsConfigurationKN = this.unmergedConfig.KN();
            te(new ArrayList(), semanticsConfigurationKN);
            return semanticsConfigurationKN;
        }
        return this.unmergedConfig;
    }

    public final Rect xMQ() {
        Rect rectRl;
        NodeCoordinator nodeCoordinatorO = O();
        if (nodeCoordinatorO != null) {
            if (!nodeCoordinatorO.nr()) {
                nodeCoordinatorO = null;
            }
            if (nodeCoordinatorO != null && (rectRl = LayoutCoordinatesKt.rl(nodeCoordinatorO)) != null) {
                return rectRl;
            }
        }
        return Rect.INSTANCE.n();
    }
}
