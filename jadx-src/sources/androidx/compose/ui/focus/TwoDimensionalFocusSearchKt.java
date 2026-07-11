package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\u001a>\u0010\b\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a:\u0010\r\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a:\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a!\u0010\u0014\u001a\u00020\u0013*\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a.\u0010\u0017\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a2\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a2\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001d\u001a\u0013\u0010\"\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010#\u001a\u0013\u0010%\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "Z", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "gh", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "focusedItem", "qie", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/geometry/Rect;ILkotlin/jvm/functions/Function1;)Z", "r", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/runtime/collection/MutableVector;", "accessibleChildren", "", "xMQ", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/runtime/collection/MutableVector;)V", "focusRect", "mUb", "(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/geometry/Rect;I)Landroidx/compose/ui/focus/FocusTargetNode;", "proposedCandidate", "currentCandidate", "focusedRect", "az", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;I)Z", "source", "rect1", "rect2", "t", "o", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "KN", "rl", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTwoDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 10 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 11 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,438:1\n1083#2,2:439\n1083#2,2:445\n1101#2:460\n1083#2,2:461\n1101#2:538\n1083#2,2:539\n340#3:441\n516#3:442\n472#3:443\n519#3:466\n44#3:468\n519#3:524\n519#3:544\n44#3:546\n423#3,9:606\n1#4:444\n119#5:447\n119#5:525\n283#6,5:448\n148#6:453\n149#6:459\n150#6,3:463\n153#6:467\n154#6,9:469\n437#6,6:478\n447#6,2:485\n449#6,17:490\n466#6,8:510\n163#6,6:518\n283#6,5:526\n148#6:531\n149#6:537\n150#6,3:541\n153#6:545\n154#6,9:547\n437#6,6:556\n447#6,2:563\n449#6,17:568\n466#6,8:588\n163#6,6:596\n56#7,5:454\n56#7,5:532\n246#8:484\n246#8:562\n240#9,3:487\n243#9,3:507\n240#9,3:565\n243#9,3:585\n56#10:602\n56#10:603\n61#10:604\n61#10:605\n61#10:616\n56#10:617\n69#11:615\n69#11:618\n69#11:619\n*S KotlinDebug\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n*L\n127#1:439,2\n200#1:445,2\n201#1:460\n201#1:461,2\n230#1:538\n230#1:539,2\n132#1:441\n132#1:442\n132#1:443\n201#1:466\n201#1:468\n207#1:524\n230#1:544\n230#1:546\n262#1:606,9\n201#1:447\n230#1:525\n201#1:448,5\n201#1:453\n201#1:459\n201#1:463,3\n201#1:467\n201#1:469,9\n201#1:478,6\n201#1:485,2\n201#1:490,17\n201#1:510,8\n201#1:518,6\n230#1:526,5\n230#1:531\n230#1:537\n230#1:541,3\n230#1:545\n230#1:547,9\n230#1:556,6\n230#1:563,2\n230#1:568,17\n230#1:588,8\n230#1:596,6\n201#1:454,5\n230#1:532,5\n201#1:484\n230#1:562\n201#1:487,3\n201#1:507,3\n230#1:565,3\n230#1:585,3\n254#1:602\n255#1:603\n256#1:604\n257#1:605\n321#1:616\n324#1:617\n312#1:615\n391#1:618\n406#1:619\n*E\n"})
public final class TwoDimensionalFocusSearchKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.f31349t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.f31346n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.f31345O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final float HI(Rect rect, int i2, Rect rect2) {
        float top;
        float fXMQ;
        float top2;
        float fXMQ2;
        float f3;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.qie(i2, companion.nr())) {
            if (FocusDirection.qie(i2, companion.Uo())) {
                top = rect.getLeft();
                fXMQ = rect2.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String();
            } else if (FocusDirection.qie(i2, companion.KN())) {
                top2 = rect2.getTop();
                fXMQ2 = rect.xMQ();
            } else {
                if (!FocusDirection.qie(i2, companion.n())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                top = rect.getTop();
                fXMQ = rect2.xMQ();
            }
            f3 = top - fXMQ;
            if (f3 >= 0.0f) {
                return 0.0f;
            }
            return f3;
        }
        top2 = rect2.getLeft();
        fXMQ2 = rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String();
        f3 = top2 - fXMQ2;
        if (f3 >= 0.0f) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final float J2(Rect rect, int i2, Rect rect2) {
        float top;
        float fXMQ;
        float top2;
        float fXMQ2;
        float f3;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.qie(i2, companion.nr())) {
            if (FocusDirection.qie(i2, companion.Uo())) {
                top = rect.getLeft();
                fXMQ = rect2.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String();
            } else if (FocusDirection.qie(i2, companion.KN())) {
                top2 = rect2.getTop();
                fXMQ2 = rect.xMQ();
            } else {
                if (!FocusDirection.qie(i2, companion.n())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                top = rect.getTop();
                fXMQ = rect2.xMQ();
            }
            f3 = top - fXMQ;
            if (f3 >= 0.0f) {
                return 0.0f;
            }
            return f3;
        }
        top2 = rect2.getLeft();
        fXMQ2 = rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String();
        f3 = top2 - fXMQ2;
        if (f3 >= 0.0f) {
        }
    }

    private static final Rect KN(Rect rect) {
        return new Rect(rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String(), rect.xMQ(), rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String(), rect.xMQ());
    }

    private static final boolean O(Rect rect, int i2, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.qie(i2, companion.nr())) {
            return rect2.getLeft() >= rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String();
        }
        if (FocusDirection.qie(i2, companion.Uo())) {
            return rect2.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() <= rect.getLeft();
        }
        if (FocusDirection.qie(i2, companion.KN())) {
            return rect2.getTop() >= rect.xMQ();
        }
        if (FocusDirection.qie(i2, companion.n())) {
            return rect2.xMQ() <= rect.getTop();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final float Uo(Rect rect, int i2, Rect rect2) {
        float fXMQ;
        float fXMQ2;
        float top;
        float top2;
        float f3;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.qie(i2, companion.nr())) {
            if (FocusDirection.qie(i2, companion.Uo())) {
                fXMQ = rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String();
                fXMQ2 = rect2.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String();
            } else if (FocusDirection.qie(i2, companion.KN())) {
                top = rect2.getTop();
                top2 = rect.getTop();
            } else {
                if (!FocusDirection.qie(i2, companion.n())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                fXMQ = rect.xMQ();
                fXMQ2 = rect2.xMQ();
            }
            f3 = fXMQ - fXMQ2;
            if (f3 >= 1.0f) {
                return 1.0f;
            }
            return f3;
        }
        top = rect2.getLeft();
        top2 = rect.getLeft();
        f3 = top - top2;
        if (f3 >= 1.0f) {
        }
    }

    private static final float ck(Rect rect, int i2, Rect rect2) {
        float f3;
        float f4;
        float left;
        float fXMQ;
        float left2;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.qie(i2, companion.nr()) ? true : FocusDirection.qie(i2, companion.Uo())) {
            float top = rect2.getTop();
            float fXMQ2 = rect2.xMQ() - rect2.getTop();
            f3 = 2;
            f4 = top + (fXMQ2 / f3);
            left = rect.getTop();
            fXMQ = rect.xMQ();
            left2 = rect.getTop();
        } else {
            if (!(FocusDirection.qie(i2, companion.KN()) ? true : FocusDirection.qie(i2, companion.n()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float left3 = rect2.getLeft();
            float f5 = rect2.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() - rect2.getLeft();
            f3 = 2;
            f4 = left3 + (f5 / f3);
            left = rect.getLeft();
            fXMQ = rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String();
            left2 = rect.getLeft();
        }
        return f4 - (left + ((fXMQ - left2) / f3));
    }

    public static final boolean gh(FocusTargetNode focusTargetNode, int i2, Function1 function1) {
        Rect rectKN;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        xMQ(focusTargetNode, mutableVector);
        if (mutableVector.getSize() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (mutableVector.getSize() == 0 ? null : mutableVector.content[0]);
            if (focusTargetNode2 != null) {
                return ((Boolean) function1.invoke(focusTargetNode2)).booleanValue();
            }
            return false;
        }
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.qie(i2, companion.rl())) {
            i2 = companion.Uo();
        }
        if (FocusDirection.qie(i2, companion.Uo()) ? true : FocusDirection.qie(i2, companion.n())) {
            rectKN = o(FocusTraversalKt.nr(focusTargetNode));
        } else {
            if (!(FocusDirection.qie(i2, companion.nr()) ? true : FocusDirection.qie(i2, companion.KN()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            rectKN = KN(FocusTraversalKt.nr(focusTargetNode));
        }
        FocusTargetNode focusTargetNodeMUb = mUb(mutableVector, rectKN, i2);
        if (focusTargetNodeMUb != null) {
            return ((Boolean) function1.invoke(focusTargetNodeMUb)).booleanValue();
        }
        return false;
    }

    private static final FocusTargetNode mUb(MutableVector mutableVector, Rect rect, int i2) {
        Rect rectG;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.qie(i2, companion.nr())) {
            rectG = rect.g((rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() - rect.getLeft()) + 1, 0.0f);
        } else if (FocusDirection.qie(i2, companion.Uo())) {
            rectG = rect.g(-((rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() - rect.getLeft()) + 1), 0.0f);
        } else if (FocusDirection.qie(i2, companion.KN())) {
            rectG = rect.g(0.0f, (rect.xMQ() - rect.getTop()) + 1);
        } else {
            if (!FocusDirection.qie(i2, companion.n())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            rectG = rect.g(0.0f, -((rect.xMQ() - rect.getTop()) + 1));
        }
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        FocusTargetNode focusTargetNode = null;
        for (int i3 = 0; i3 < size; i3++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i3];
            if (FocusTraversalKt.Uo(focusTargetNode2)) {
                Rect rectNr = FocusTraversalKt.nr(focusTargetNode2);
                if (az(rectNr, rectG, rect, i2)) {
                    focusTargetNode = focusTargetNode2;
                    rectG = rectNr;
                }
            }
        }
        return focusTargetNode;
    }

    private static final boolean nr(Rect rect, int i2, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.qie(i2, companion.nr()) ? true : FocusDirection.qie(i2, companion.Uo())) {
            return rect.xMQ() > rect2.getTop() && rect.getTop() < rect2.xMQ();
        }
        if (FocusDirection.qie(i2, companion.KN()) ? true : FocusDirection.qie(i2, companion.n())) {
            return rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() > rect2.getLeft() && rect.getLeft() < rect2.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final Rect o(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(FocusTargetNode focusTargetNode, Rect rect, int i2, Function1 function1) {
        FocusTargetNode focusTargetNodeMUb;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int iN = NodeKind.n(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelperKt.t("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.t(mutableVector2, focusTargetNode.getNode(), false);
        } else {
            mutableVector2.rl(child);
        }
        while (mutableVector2.getSize() != 0) {
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
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodeKN;
                                if (focusTargetNode2.getIsAttached()) {
                                    mutableVector.rl(focusTargetNode2);
                                }
                            } else if ((nodeKN.getKindSet() & iN) != 0 && (nodeKN instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodeKN).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iN) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            nodeKN = delegate;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeKN != null) {
                                                mutableVector3.rl(nodeKN);
                                                nodeKN = null;
                                            }
                                            mutableVector3.rl(delegate);
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
        while (mutableVector.getSize() != 0 && (focusTargetNodeMUb = mUb(mutableVector, rect, i2)) != null) {
            if (focusTargetNodeMUb.ni().getCanFocus()) {
                return ((Boolean) function1.invoke(focusTargetNodeMUb)).booleanValue();
            }
            if (qie(focusTargetNodeMUb, rect, i2, function1)) {
                return true;
            }
            mutableVector.ck(focusTargetNodeMUb);
        }
        return false;
    }

    private static final boolean ty(Rect rect, int i2, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.qie(i2, companion.nr())) {
            return (rect2.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() > rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() || rect2.getLeft() >= rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String()) && rect2.getLeft() > rect.getLeft();
        }
        if (FocusDirection.qie(i2, companion.Uo())) {
            return (rect2.getLeft() < rect.getLeft() || rect2.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() <= rect.getLeft()) && rect2.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() < rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String();
        }
        if (FocusDirection.qie(i2, companion.KN())) {
            return (rect2.xMQ() > rect.xMQ() || rect2.getTop() >= rect.xMQ()) && rect2.getTop() > rect.getTop();
        }
        if (FocusDirection.qie(i2, companion.n())) {
            return (rect2.getTop() < rect.getTop() || rect2.xMQ() <= rect.getTop()) && rect2.xMQ() < rect.xMQ();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final void xMQ(DelegatableNode delegatableNode, MutableVector mutableVector) {
        int iN = NodeKind.n(1024);
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.t("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.t(mutableVector2, delegatableNode.getNode(), false);
        } else {
            mutableVector2.rl(child);
        }
        while (mutableVector2.getSize() != 0) {
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
                                if (focusTargetNode.getIsAttached() && !DelegatableNodeKt.HI(focusTargetNode).getIsDeactivated()) {
                                    if (focusTargetNode.ni().getCanFocus()) {
                                        mutableVector.rl(focusTargetNode);
                                    } else {
                                        xMQ(focusTargetNode, mutableVector);
                                    }
                                }
                            } else if ((nodeKN.getKindSet() & iN) != 0 && (nodeKN instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodeKN).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iN) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nodeKN = delegate;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodeKN != null) {
                                                mutableVector3.rl(nodeKN);
                                                nodeKN = null;
                                            }
                                            mutableVector3.rl(delegate);
                                        }
                                    }
                                }
                                if (i2 == 1) {
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

    private static final long Ik(int i2, Rect rect, Rect rect2) {
        long jHI = (long) HI(rect2, i2, rect);
        long jCk = (long) ck(rect2, i2, rect);
        return (((long) 13) * jHI * jHI) + (jCk * jCk);
    }

    public static final Boolean Z(FocusTargetNode focusTargetNode, int i2, Rect rect, Function1 function1) {
        FocusStateImpl focusStateImplIjL = focusTargetNode.ijL();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i3 = iArr[focusStateImplIjL.ordinal()];
        if (i3 != 1) {
            if (i3 != 2 && i3 != 3) {
                if (i3 == 4) {
                    if (focusTargetNode.ni().getCanFocus()) {
                        return (Boolean) function1.invoke(focusTargetNode);
                    }
                    if (rect == null) {
                        return Boolean.valueOf(gh(focusTargetNode, i2, function1));
                    }
                    return Boolean.valueOf(r(focusTargetNode, rect, i2, function1));
                }
                throw new NoWhenBranchMatchedException();
            }
            return Boolean.valueOf(gh(focusTargetNode, i2, function1));
        }
        FocusTargetNode focusTargetNodeJ2 = FocusTraversalKt.J2(focusTargetNode);
        if (focusTargetNodeJ2 != null) {
            int i5 = iArr[focusTargetNodeJ2.ijL().ordinal()];
            if (i5 != 1) {
                if (i5 != 2 && i5 != 3) {
                    if (i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                if (rect == null) {
                    rect = FocusTraversalKt.nr(focusTargetNodeJ2);
                }
                return Boolean.valueOf(qie(focusTargetNode, rect, i2, function1));
            }
            Boolean boolZ = Z(focusTargetNodeJ2, i2, rect, function1);
            if (!Intrinsics.areEqual(boolZ, Boolean.FALSE)) {
                return boolZ;
            }
            if (rect == null) {
                rect = FocusTraversalKt.nr(rl(focusTargetNodeJ2));
            }
            return Boolean.valueOf(qie(focusTargetNode, rect, i2, function1));
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    public static final boolean az(Rect rect, Rect rect2, Rect rect3, int i2) {
        if (!ty(rect, i2, rect3)) {
            return false;
        }
        if (!ty(rect2, i2, rect3) || t(rect3, rect, rect2, i2)) {
            return true;
        }
        if (t(rect3, rect2, rect, i2) || Ik(i2, rect3, rect) >= Ik(i2, rect3, rect2)) {
            return false;
        }
        return true;
    }

    private static final boolean qie(final FocusTargetNode focusTargetNode, final Rect rect, final int i2, final Function1 function1) {
        if (r(focusTargetNode, rect, i2, function1)) {
            return true;
        }
        final FocusTransactionManager focusTransactionManagerT = FocusTargetNodeKt.t(focusTargetNode);
        final int generation = focusTransactionManagerT.getGeneration();
        final FocusTargetNode focusTargetNodeJ2 = DelegatableNodeKt.ck(focusTargetNode).getFocusOwner().getActiveFocusTargetNode();
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.n(focusTargetNode, i2, new Function1<BeyondBoundsLayout.BeyondBoundsScope, Boolean>() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                if (generation != focusTransactionManagerT.getGeneration() || (ComposeUiFlags.isTrackFocusEnabled && focusTargetNodeJ2 != DelegatableNodeKt.ck(focusTargetNode).getFocusOwner().getActiveFocusTargetNode())) {
                    return Boolean.TRUE;
                }
                boolean zR = TwoDimensionalFocusSearchKt.r(focusTargetNode, rect, i2, function1);
                Boolean boolValueOf = Boolean.valueOf(zR);
                if (zR || !beyondBoundsScope.n()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final FocusTargetNode rl(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.ijL() == FocusStateImpl.f31349t) {
            FocusTargetNode focusTargetNodeRl = FocusTraversalKt.rl(focusTargetNode);
            if (focusTargetNodeRl != null) {
                return focusTargetNodeRl;
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        throw new IllegalStateException("Searching for active node in inactive hierarchy");
    }

    private static final boolean t(Rect rect, Rect rect2, Rect rect3, int i2) {
        if (nr(rect3, i2, rect) || !nr(rect2, i2, rect)) {
            return false;
        }
        if (!O(rect3, i2, rect)) {
            return true;
        }
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.qie(i2, companion.nr()) && !FocusDirection.qie(i2, companion.Uo()) && J2(rect2, i2, rect) >= Uo(rect3, i2, rect)) {
            return false;
        }
        return true;
    }
}
