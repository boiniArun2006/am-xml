package androidx.compose.ui.graphics;

import androidx.annotation.RestrictTo;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.values.reference.V8ValueError;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\b\u001a\u00020\u00072\u0010\u0010\u0006\u001a\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\u00072\u0010\u0010\n\u001a\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\tJ!\u0010\f\u001a\u00020\u00072\u0010\u0010\n\u001a\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\f\u0010\tJ!\u0010\r\u001a\u00020\u00072\u0010\u0010\n\u001a\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\r\u0010\tJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR \u0010\u001d\u001a\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u00008\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR8\u0010!\u001a&\u0012\u000e\u0012\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u00000\u001ej\u0012\u0012\u000e\u0012\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0000`\u001f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 ¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/IntervalTree;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "<init>", "()V", "Landroidx/compose/ui/graphics/IntervalTree$Node;", "target", "", "O", "(Landroidx/compose/ui/graphics/IntervalTree$Node;)V", "node", "J2", "Uo", "KN", "", TtmlNode.START, TtmlNode.END, "Landroidx/compose/ui/graphics/Interval;", "t", "(FF)Landroidx/compose/ui/graphics/Interval;", "value", "", "rl", "(F)Z", "data", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(FFLjava/lang/Object;)V", "Landroidx/compose/ui/graphics/IntervalTree$Node;", "terminator", "root", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", V8ValueError.STACK, "Node", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension({"SMAP\nIntervalTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n1#1,380:1\n152#1,16:381\n152#1,16:397\n152#1,16:413\n*S KotlinDebug\n*F\n+ 1 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n111#1:381,16\n137#1:397,16\n145#1:413,16\n*E\n"})
public final class IntervalTree<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final Node terminator;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public Node root;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final ArrayList stack;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u000e\u0010\rR&\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R,\u0010\"\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u001b\u0010\r\"\u0004\b \u0010!R,\u0010%\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010!R,\u0010(\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010!¨\u0006)"}, d2 = {"Landroidx/compose/ui/graphics/IntervalTree$Node;", "Landroidx/compose/ui/graphics/Interval;", "", TtmlNode.START, TtmlNode.END, "data", "", "Landroidx/compose/ui/graphics/TreeColor;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(Landroidx/compose/ui/graphics/IntervalTree;FFLjava/lang/Object;I)V", "Landroidx/compose/ui/graphics/IntervalTree;", "gh", "()Landroidx/compose/ui/graphics/IntervalTree$Node;", "qie", "nr", "I", "O", "()I", "az", "(I)V", "F", "KN", "()F", "ck", "(F)V", "min", "J2", "Uo", "HI", "max", "Landroidx/compose/ui/graphics/IntervalTree$Node;", "ty", "(Landroidx/compose/ui/graphics/IntervalTree$Node;)V", TtmlNode.LEFT, "mUb", "r", TtmlNode.RIGHT, "xMQ", "Ik", "parent", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class Node extends Interval<T> {

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private float max;

        /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
        private Node right;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private float min;

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
        private Node left;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private int color;

        /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
        private Node parent;

        public final Node gh() {
            Node node = this;
            while (true) {
                Node node2 = node.left;
                if (node2 == IntervalTree.this.terminator) {
                    return node;
                }
                node = node2;
            }
        }

        public Node(float f3, float f4, Object obj, int i2) {
            super(f3, f4, obj);
            this.color = i2;
            this.min = f3;
            this.max = f4;
            Node node = IntervalTree.this.terminator;
            this.left = node;
            this.right = node;
            this.parent = node;
        }

        public final void HI(float f3) {
            this.max = f3;
        }

        public final void Ik(Node node) {
            this.parent = node;
        }

        /* JADX INFO: renamed from: J2, reason: from getter */
        public final Node getLeft() {
            return this.left;
        }

        /* JADX INFO: renamed from: KN, reason: from getter */
        public final float getMin() {
            return this.min;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: Uo, reason: from getter */
        public final float getMax() {
            return this.max;
        }

        public final void az(int i2) {
            this.color = i2;
        }

        public final void ck(float f3) {
            this.min = f3;
        }

        /* JADX INFO: renamed from: mUb, reason: from getter */
        public final Node getRight() {
            return this.right;
        }

        public final Node qie() {
            Node node = this.right;
            if (node != IntervalTree.this.terminator) {
                return node.gh();
            }
            Node node2 = this.parent;
            Node node3 = this;
            while (node2 != IntervalTree.this.terminator && node3 == node2.right) {
                node3 = node2;
                node2 = node2.parent;
            }
            return node2;
        }

        public final void r(Node node) {
            this.right = node;
        }

        public final void ty(Node node) {
            this.left = node;
        }

        /* JADX INFO: renamed from: xMQ, reason: from getter */
        public final Node getParent() {
            return this.parent;
        }
    }

    private final void KN(Node node) {
        while (node != this.terminator) {
            node.ck(Math.min(node.getStart(), Math.min(node.getLeft().getMin(), node.getRight().getMin())));
            node.HI(Math.max(node.getEnd(), Math.max(node.getLeft().getMax(), node.getRight().getMax())));
            node = node.getParent();
        }
    }

    private final void O(Node target) {
        while (target != this.root && target.getParent().getColor() == 0) {
            Node parent = target.getParent().getParent();
            if (target.getParent() == parent.getLeft()) {
                Node right = parent.getRight();
                if (right.getColor() == 0) {
                    right.az(1);
                    target.getParent().az(1);
                    parent.az(0);
                    target = parent;
                } else {
                    if (target == target.getParent().getRight()) {
                        target = target.getParent();
                        J2(target);
                    }
                    target.getParent().az(1);
                    parent.az(0);
                    Uo(parent);
                }
            } else {
                Node left = parent.getLeft();
                if (left.getColor() == 0) {
                    left.az(1);
                    target.getParent().az(1);
                    parent.az(0);
                    target = parent;
                } else {
                    if (target == target.getParent().getLeft()) {
                        target = target.getParent();
                        Uo(target);
                    }
                    target.getParent().az(1);
                    parent.az(0);
                    J2(parent);
                }
            }
        }
        this.root.az(1);
    }

    public static /* synthetic */ Interval nr(IntervalTree intervalTree, float f3, float f4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f4 = f3;
        }
        return intervalTree.t(f3, f4);
    }

    public final void n(float start, float end, Object data) {
        Node node = new Node(start, end, data, 0);
        Node node2 = this.terminator;
        for (Node left = this.root; left != this.terminator; left = node.getStart() <= left.getStart() ? left.getLeft() : left.getRight()) {
            node2 = left;
        }
        node.Ik(node2);
        if (node2 == this.terminator) {
            this.root = node;
        } else if (node.getStart() <= node2.getStart()) {
            node2.ty(node);
        } else {
            node2.r(node);
        }
        KN(node);
        O(node);
    }

    public final Interval t(float start, float end) {
        Node node = this.root;
        Node node2 = this.terminator;
        if (node != node2 && node != node2) {
            ArrayList arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                Node node3 = (Node) arrayList.remove(arrayList.size() - 1);
                if (node3.nr(start, end)) {
                    return node3;
                }
                if (node3.getLeft() != this.terminator && node3.getLeft().getMax() >= start) {
                    arrayList.add(node3.getLeft());
                }
                if (node3.getRight() != this.terminator && node3.getRight().getMin() <= end) {
                    arrayList.add(node3.getRight());
                }
            }
            arrayList.clear();
        }
        Interval intervalN = IntervalTreeKt.n();
        Intrinsics.checkNotNull(intervalN, "null cannot be cast to non-null type androidx.compose.ui.graphics.Interval<T of androidx.compose.ui.graphics.IntervalTree>");
        return intervalN;
    }

    public IntervalTree() {
        Node node = new Node(Float.MAX_VALUE, Float.MIN_VALUE, null, 1);
        this.terminator = node;
        this.root = node;
        this.stack = new ArrayList();
    }

    private final void J2(Node node) {
        Node right = node.getRight();
        node.r(right.getLeft());
        if (right.getLeft() != this.terminator) {
            right.getLeft().Ik(node);
        }
        right.Ik(node.getParent());
        if (node.getParent() == this.terminator) {
            this.root = right;
        } else if (node.getParent().getLeft() == node) {
            node.getParent().ty(right);
        } else {
            node.getParent().r(right);
        }
        right.ty(node);
        node.Ik(right);
        KN(node);
    }

    private final void Uo(Node node) {
        Node left = node.getLeft();
        node.ty(left.getRight());
        if (left.getRight() != this.terminator) {
            left.getRight().Ik(node);
        }
        left.Ik(node.getParent());
        if (node.getParent() == this.terminator) {
            this.root = left;
        } else if (node.getParent().getRight() == node) {
            node.getParent().r(left);
        } else {
            node.getParent().ty(left);
        }
        left.r(node);
        node.Ik(left);
        KN(node);
    }

    public final boolean rl(float value) {
        if (t(value, value) != IntervalTreeKt.n()) {
            return true;
        }
        return false;
    }
}
