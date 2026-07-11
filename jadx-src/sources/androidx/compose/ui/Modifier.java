package androidx.compose.ui;

import GJW.AbstractC1363t;
import GJW.Lu;
import GJW.vd;
import GJW.xuv;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Stable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\bg\u0018\u0000 \u00122\u00020\u0001:\u0003\u0013\u0014\u0015J7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0004¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier$Element;", "operation", "g", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "E", "(Lkotlin/jvm/functions/Function1;)Z", "e", InneractiveMediationNameConsts.OTHER, "Zmq", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "WPU", "Companion", "Element", "Node", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Modifier {

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f31064n;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0096\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/Modifier$Companion;", "Landroidx/compose/ui/Modifier;", "<init>", "()V", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier$Element;", "operation", "g", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "E", "(Lkotlin/jvm/functions/Function1;)Z", "e", InneractiveMediationNameConsts.OTHER, "Zmq", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "", "toString", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements Modifier {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f31064n = new Companion();

        @Override // androidx.compose.ui.Modifier
        public boolean E(Function1 predicate) {
            return false;
        }

        @Override // androidx.compose.ui.Modifier
        public Modifier Zmq(Modifier other) {
            return other;
        }

        @Override // androidx.compose.ui.Modifier
        public boolean e(Function1 predicate) {
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public Object g(Object initial, Function2 operation) {
            return initial;
        }

        public String toString() {
            return "Modifier";
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u001e\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u001b\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0016\u0010\u0017R*\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00008\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010-\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R$\u00101\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u0017R$\u00105\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001a\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u0017R$\u0010=\u001a\u0004\u0018\u0001068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\"\u0010H\u001a\u00020B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u00107\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010L\u001a\u00020B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u00107\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR\u0016\u0010N\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00107R\u0016\u0010P\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u00107R*\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010\u0014R$\u0010Y\u001a\u00020B2\u0006\u0010\u0018\u001a\u00020B8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bW\u00107\u001a\u0004\bX\u0010ER\u0011\u0010\\\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u001a\u0010_\u001a\u00020B8VX\u0096\u0004¢\u0006\f\u0012\u0004\b^\u0010\u0003\u001a\u0004\b]\u0010E¨\u0006`"}, d2 = {"Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "<init>", "()V", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "", "Rc", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "gxH", "XUb", "rR", "YiW", "x", "c", "Sax", "kQ", "Lkotlin/Function0;", "effect", "GRh", "(Lkotlin/jvm/functions/Function0;)V", "owner", "V5F", "(Landroidx/compose/ui/Modifier$Node;)V", "<set-?>", c.f62177j, "Landroidx/compose/ui/Modifier$Node;", "J2", "()Landroidx/compose/ui/Modifier$Node;", "getNode$annotations", "node", "LGJW/vd;", "t", "LGJW/vd;", "scope", "", "O", "I", "C7B", "()I", "jX", "(I)V", "kindSet", "w", "MPw", "aggregateChildKindSet", "r", "TVk", "Qg8", "parent", "o", "HFS", "sFO", "child", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "Z", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "wYi", "()Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "iu", "(Landroidx/compose/ui/node/ObserverNodeOwnerScope;)V", "ownerScope", "S", "Landroidx/compose/ui/node/NodeCoordinator;", "eb", "()Landroidx/compose/ui/node/NodeCoordinator;", "", "g", "fq", "()Z", "Of6", "(Z)V", "insertedNodeAwaitingAttachForInvalidation", "E2", "n7u", "tdZ", "updatedNodeAwaitingAttachForInvalidation", "e", "onAttachRunExpected", "X", "onDetachRunExpected", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/jvm/functions/Function0;", "getDetachedListener$ui_release", "()Lkotlin/jvm/functions/Function0;", "JI", "detachedListener", "N", "yA", "isAttached", "Xli", "()LGJW/vd;", "coroutineScope", "lRt", "getShouldAutoInvalidate$annotations", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,415:1\n1#2:416\n56#3,5:417\n56#3,5:422\n56#3,5:427\n56#3,5:432\n56#3,5:437\n56#3,5:442\n56#3,5:447\n56#3,5:452\n56#3,5:457\n56#3,5:462\n56#3,5:467\n*S KotlinDebug\n*F\n+ 1 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n249#1:417,5\n250#1:422,5\n258#1:427,5\n261#1:432,5\n270#1:437,5\n271#1:442,5\n274#1:447,5\n284#1:452,5\n285#1:457,5\n288#1:462,5\n300#1:467,5\n*E\n"})
    public static abstract class Node implements DelegatableNode {

        /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
        private boolean updatedNodeAwaitingAttachForInvalidation;

        /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
        private boolean isAttached;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private int kindSet;

        /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
        private NodeCoordinator coordinator;

        /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
        private Function0 detachedListener;

        /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
        private boolean onDetachRunExpected;

        /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
        private ObserverNodeOwnerScope ownerScope;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean onAttachRunExpected;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean insertedNodeAwaitingAttachForInvalidation;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private Node child;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private Node parent;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private vd scope;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private Node node = this;

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private int aggregateChildKindSet = -1;

        public void Sax() {
        }

        public void c() {
        }

        public void kQ() {
        }

        public boolean lRt() {
            return true;
        }

        /* JADX INFO: renamed from: C7B, reason: from getter */
        public final int getKindSet() {
            return this.kindSet;
        }

        /* JADX INFO: renamed from: HFS, reason: from getter */
        public final Node getChild() {
            return this.child;
        }

        @Override // androidx.compose.ui.node.DelegatableNode
        /* JADX INFO: renamed from: J2, reason: from getter */
        public final Node getNode() {
            return this.node;
        }

        public final void JI(Function0 function0) {
            this.detachedListener = function0;
        }

        public final void MPw(int i2) {
            this.aggregateChildKindSet = i2;
        }

        public final void Of6(boolean z2) {
            this.insertedNodeAwaitingAttachForInvalidation = z2;
        }

        public final void Qg8(Node node) {
            this.parent = node;
        }

        public void Rc(NodeCoordinator coordinator) {
            this.coordinator = coordinator;
        }

        /* JADX INFO: renamed from: TVk, reason: from getter */
        public final Node getParent() {
            return this.parent;
        }

        public void V5F(Node owner) {
            this.node = owner;
        }

        public void XUb() {
            if (!this.isAttached) {
                InlineClassHelperKt.t("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.onAttachRunExpected) {
                InlineClassHelperKt.t("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.onAttachRunExpected = false;
            c();
            this.onDetachRunExpected = true;
        }

        public final vd Xli() {
            vd vdVar = this.scope;
            if (vdVar != null) {
                return vdVar;
            }
            vd vdVarN = Lu.n(DelegatableNodeKt.ck(this).getCoroutineContext().plus(AbstractC1363t.n((xuv) DelegatableNodeKt.ck(this).getCoroutineContext().get(xuv.nr))));
            this.scope = vdVarN;
            return vdVarN;
        }

        public void YiW() {
            if (!this.isAttached) {
                InlineClassHelperKt.t("Cannot detach a node that is not attached");
            }
            if (this.onAttachRunExpected) {
                InlineClassHelperKt.t("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.onDetachRunExpected) {
                InlineClassHelperKt.t("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.isAttached = false;
            vd vdVar = this.scope;
            if (vdVar != null) {
                Lu.nr(vdVar, new ModifierNodeDetachedCancellationException());
                this.scope = null;
            }
        }

        /* JADX INFO: renamed from: eb, reason: from getter */
        public final NodeCoordinator getCoordinator() {
            return this.coordinator;
        }

        /* JADX INFO: renamed from: fq, reason: from getter */
        public final boolean getInsertedNodeAwaitingAttachForInvalidation() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public void gxH() {
            if (this.isAttached) {
                InlineClassHelperKt.t("node attached multiple times");
            }
            if (!(this.coordinator != null)) {
                InlineClassHelperKt.t("attach invoked on a node without a coordinator");
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public final void iu(ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.ownerScope = observerNodeOwnerScope;
        }

        public final void jX(int i2) {
            this.kindSet = i2;
        }

        /* JADX INFO: renamed from: n7u, reason: from getter */
        public final boolean getUpdatedNodeAwaitingAttachForInvalidation() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        public void rR() {
            if (!this.isAttached) {
                InlineClassHelperKt.t("node detached multiple times");
            }
            if (!(this.coordinator != null)) {
                InlineClassHelperKt.t("detach invoked on a node without a coordinator");
            }
            if (!this.onDetachRunExpected) {
                InlineClassHelperKt.t("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.onDetachRunExpected = false;
            Function0 function0 = this.detachedListener;
            if (function0 != null) {
                function0.invoke();
            }
            Sax();
        }

        public final void sFO(Node node) {
            this.child = node;
        }

        public final void tdZ(boolean z2) {
            this.updatedNodeAwaitingAttachForInvalidation = z2;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final int getAggregateChildKindSet() {
            return this.aggregateChildKindSet;
        }

        /* JADX INFO: renamed from: wYi, reason: from getter */
        public final ObserverNodeOwnerScope getOwnerScope() {
            return this.ownerScope;
        }

        public void x() {
            if (!this.isAttached) {
                InlineClassHelperKt.t("reset() called on an unattached node");
            }
            kQ();
        }

        /* JADX INFO: renamed from: yA, reason: from getter */
        public final boolean getIsAttached() {
            return this.isAttached;
        }

        public final void GRh(Function0 effect) {
            DelegatableNodeKt.ck(this).e(effect);
        }
    }

    boolean E(Function1 predicate);

    boolean e(Function1 predicate);

    Object g(Object initial, Function2 operation);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J7\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\r\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/Modifier;", "R", "initial", "Lkotlin/Function2;", "operation", "g", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "E", "(Lkotlin/jvm/functions/Function1;)Z", "e", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Element extends Modifier {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
        }

        @Override // androidx.compose.ui.Modifier
        default boolean E(Function1 predicate) {
            return ((Boolean) predicate.invoke(this)).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default boolean e(Function1 predicate) {
            return ((Boolean) predicate.invoke(this)).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default Object g(Object initial, Function2 operation) {
            return operation.invoke(initial, this);
        }
    }

    default Modifier Zmq(Modifier other) {
        return other == INSTANCE ? this : new CombinedModifier(this, other);
    }
}
