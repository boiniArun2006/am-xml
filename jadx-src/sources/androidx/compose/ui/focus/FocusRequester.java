package androidx.compose.ui.focus;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Stable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u001a\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester;", "", "<init>", "()V", "", "J2", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "", "Uo", "(I)Z", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "nr", "(Lkotlin/jvm/functions/Function1;)Z", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", c.f62177j, "Landroidx/compose/runtime/collection/MutableVector;", "O", "()Landroidx/compose/runtime/collection/MutableVector;", "focusRequesterNodes", "rl", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFocusRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,268:1\n253#1:272\n254#1,2:274\n256#1,2:277\n258#1:285\n259#1,5:321\n264#1:367\n265#1:371\n1101#2:269\n1083#2,2:270\n1101#2:299\n1083#2,2:300\n1101#2:433\n1083#2,2:434\n1#3:273\n1#3:373\n519#4:276\n423#4,6:279\n44#4:306\n429#4,3:368\n519#4:372\n423#4,9:374\n519#4:383\n423#4,9:384\n519#4:393\n423#4,9:394\n519#4:403\n423#4,9:404\n519#4:413\n423#4,6:414\n519#4:439\n44#4:441\n429#4,3:497\n119#5:286\n119#5:420\n283#6,5:287\n148#6:292\n149#6:298\n150#6,4:302\n154#6,9:307\n437#6,5:316\n442#6:326\n447#6,2:328\n449#6,17:333\n466#6,8:353\n163#6,6:361\n283#6,5:421\n148#6:426\n149#6:432\n150#6,3:436\n153#6:440\n154#6,9:442\n437#6,6:451\n447#6,2:458\n449#6,17:463\n466#6,8:483\n163#6,6:491\n56#7,5:293\n56#7,5:427\n246#8:327\n246#8:457\n240#9,3:330\n243#9,3:350\n240#9,3:460\n243#9,3:480\n*S KotlinDebug\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n*L\n87#1:272\n87#1:274,2\n87#1:277,2\n87#1:285\n87#1:321,5\n87#1:367\n87#1:371\n53#1:269\n53#1:270,2\n87#1:299\n87#1:300,2\n258#1:433\n258#1:434,2\n87#1:273\n87#1:276\n87#1:279,6\n87#1:306\n87#1:368,3\n111#1:372\n112#1:374,9\n134#1:383\n135#1:384,9\n153#1:393\n154#1:394,9\n168#1:403\n170#1:404,9\n255#1:413\n257#1:414,6\n258#1:439\n258#1:441\n257#1:497,3\n87#1:286\n258#1:420\n87#1:287,5\n87#1:292\n87#1:298\n87#1:302,4\n87#1:307,9\n87#1:316,5\n87#1:326\n87#1:328,2\n87#1:333,17\n87#1:353,8\n87#1:361,6\n258#1:421,5\n258#1:426\n258#1:432\n258#1:436,3\n258#1:440\n258#1:442,9\n258#1:451,6\n258#1:458,2\n258#1:463,17\n258#1:483,8\n258#1:491,6\n87#1:293,5\n258#1:427,5\n87#1:327\n258#1:457\n87#1:330,3\n87#1:350,3\n258#1:460,3\n258#1:480,3\n*E\n"})
public final class FocusRequester {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableVector focusRequesterNodes = new MutableVector(new FocusRequesterModifierNode[16], 0);

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final FocusRequester f31332t = new FocusRequester();
    private static final FocusRequester nr = new FocusRequester();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final FocusRequester f31331O = new FocusRequester();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/focus/FocusRequester;", "Default", "Landroidx/compose/ui/focus/FocusRequester;", "rl", "()Landroidx/compose/ui/focus/FocusRequester;", "Cancel", c.f62177j, "Redirect", "t", "FocusRequesterFactory", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class FocusRequesterFactory {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final FocusRequesterFactory f31334n = new FocusRequesterFactory();

            private FocusRequesterFactory() {
            }
        }

        private Companion() {
        }

        public final FocusRequester n() {
            return FocusRequester.nr;
        }

        public final FocusRequester rl() {
            return FocusRequester.f31332t;
        }

        public final FocusRequester t() {
            return FocusRequester.f31331O;
        }
    }

    public static /* synthetic */ boolean KN(FocusRequester focusRequester, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = FocusDirection.INSTANCE.rl();
        }
        return focusRequester.Uo(i2);
    }

    public final /* synthetic */ void J2() {
        Uo(FocusDirection.INSTANCE.rl());
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final MutableVector getFocusRequesterNodes() {
        return this.focusRequesterNodes;
    }

    public final boolean Uo(final int focusDirection) {
        return nr(new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusRequester$requestFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.a(focusDirection));
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0060, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean nr(Function1 onFound) {
        Companion companion = INSTANCE;
        if (this == companion.rl()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == companion.n()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this.focusRequesterNodes.getSize() == 0) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        MutableVector mutableVector = this.focusRequesterNodes;
        Object[] objArr = mutableVector.content;
        int iQie = mutableVector.getSize();
        boolean z2 = false;
        for (int i2 = 0; i2 < iQie; i2++) {
            FocusRequesterModifierNode focusRequesterModifierNode = (FocusRequesterModifierNode) objArr[i2];
            int iN = NodeKind.n(1024);
            if (!focusRequesterModifierNode.getNode().getIsAttached()) {
                InlineClassHelperKt.t("visitChildren called on an unattached node");
            }
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child = focusRequesterModifierNode.getNode().getChild();
            if (child == null) {
                DelegatableNodeKt.t(mutableVector2, focusRequesterModifierNode.getNode(), false);
            } else {
                mutableVector2.rl(child);
            }
            while (true) {
                if (mutableVector2.getSize() != 0) {
                    Modifier.Node nodeKN = (Modifier.Node) mutableVector2.r(mutableVector2.getSize() - 1);
                    if ((nodeKN.getAggregateChildKindSet() & iN) == 0) {
                        DelegatableNodeKt.t(mutableVector2, nodeKN, false);
                    } else {
                        while (true) {
                            if (nodeKN == null) {
                                break;
                            }
                            if ((nodeKN.getKindSet() & iN) != 0) {
                                MutableVector mutableVector3 = null;
                                while (nodeKN != null) {
                                    if (nodeKN instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode = (FocusTargetNode) nodeKN;
                                        if (focusTargetNode.ni().mUb() ? ((Boolean) onFound.invoke(focusTargetNode)).booleanValue() : TwoDimensionalFocusSearchKt.gh(focusTargetNode, FocusDirection.INSTANCE.rl(), onFound)) {
                                            z2 = true;
                                            break;
                                        }
                                    } else if (((nodeKN.getKindSet() & iN) != 0) && (nodeKN instanceof DelegatingNode)) {
                                        int i3 = 0;
                                        for (Modifier.Node nodeW5k = ((DelegatingNode) nodeKN).getDelegate(); nodeW5k != null; nodeW5k = nodeW5k.getChild()) {
                                            if ((nodeW5k.getKindSet() & iN) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    nodeKN = nodeW5k;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodeKN != null) {
                                                        mutableVector3.rl(nodeKN);
                                                        nodeKN = null;
                                                    }
                                                    mutableVector3.rl(nodeW5k);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    nodeKN = DelegatableNodeKt.KN(mutableVector3);
                                }
                            } else {
                                nodeKN = nodeKN.getChild();
                            }
                        }
                    }
                }
            }
        }
        return z2;
    }
}
