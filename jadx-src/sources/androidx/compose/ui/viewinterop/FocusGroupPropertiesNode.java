package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusEnterExitScope;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionManager;
import androidx.compose.ui.focus.FocusTransactionsKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0005R$\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010+\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0$¢\u0006\u0002\b&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R(\u0010.\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0$¢\u0006\u0002\b&8\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*¨\u0006/"}, d2 = {"Landroidx/compose/ui/viewinterop/FocusGroupPropertiesNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "<init>", "()V", "Landroidx/compose/ui/focus/FocusTargetNode;", "UR", "()Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "", "n7b", "(Landroidx/compose/ui/focus/FocusProperties;)V", "Landroid/view/View;", "oldFocus", "newFocus", "onGlobalFocusChanged", "(Landroid/view/View;Landroid/view/View;)V", "c", "Sax", "v", "Landroid/view/View;", "W5k", "()Landroid/view/View;", "setFocusedChild", "(Landroid/view/View;)V", "focusedChild", "Landroid/view/ViewTreeObserver;", "Xw", "Landroid/view/ViewTreeObserver;", "getAttachedViewTreeObserver", "()Landroid/view/ViewTreeObserver;", "setAttachedViewTreeObserver", "(Landroid/view/ViewTreeObserver;)V", "attachedViewTreeObserver", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusEnterExitScope;", "Lkotlin/ExtensionFunctionType;", "jB", "Lkotlin/jvm/functions/Function1;", "getOnEnter", "()Lkotlin/jvm/functions/Function1;", "onEnter", "U", "getOnExit", "onExit", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFocusGroupNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusGroupNode.android.kt\nandroidx/compose/ui/viewinterop/FocusGroupPropertiesNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,275:1\n119#2:276\n240#3:277\n202#3,8:278\n210#3,6:291\n437#3,6:297\n447#3,2:304\n449#3,8:309\n457#3,9:320\n466#3,8:332\n217#3,3:340\n56#4,5:286\n246#5:303\n240#6,3:306\n243#6,3:329\n1101#7:317\n1083#7,2:318\n48#8,8:343\n56#8,4:354\n1#9:351\n641#10,2:352\n*S KotlinDebug\n*F\n+ 1 FocusGroupNode.android.kt\nandroidx/compose/ui/viewinterop/FocusGroupPropertiesNode\n*L\n142#1:276\n142#1:277\n142#1:278,8\n142#1:291,6\n142#1:297,6\n142#1:304,2\n142#1:309,8\n142#1:320,9\n142#1:332,8\n142#1:340,3\n142#1:286,5\n142#1:303\n142#1:306,3\n142#1:329,3\n142#1:317\n142#1:318,2\n173#1:343,8\n173#1:354,4\n173#1:351\n173#1:352,2\n*E\n"})
final class FocusGroupPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private ViewTreeObserver attachedViewTreeObserver;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private View focusedChild;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final Function1 onEnter = new Function1<FocusEnterExitScope, Unit>() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onEnter$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FocusEnterExitScope focusEnterExitScope) {
            n(focusEnterExitScope);
            return Unit.INSTANCE;
        }

        public final void n(FocusEnterExitScope focusEnterExitScope) {
            View viewUo = FocusGroupNode_androidKt.Uo(this.f34257n);
            if (viewUo.isFocused() || viewUo.hasFocus()) {
                return;
            }
            if (FocusInteropUtils_androidKt.rl(viewUo, FocusInteropUtils_androidKt.t(focusEnterExitScope.getRequestedFocusDirection()), FocusGroupNode_androidKt.J2(DelegatableNodeKt.ck(this.f34257n).getFocusOwner(), DelegatableNode_androidKt.n(this.f34257n), viewUo))) {
                return;
            }
            focusEnterExitScope.n();
        }
    };

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final Function1 onExit = new Function1<FocusEnterExitScope, Unit>() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onExit$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FocusEnterExitScope focusEnterExitScope) {
            n(focusEnterExitScope);
            return Unit.INSTANCE;
        }

        public final void n(FocusEnterExitScope focusEnterExitScope) {
            View viewFindNextFocusFromRect;
            View viewUo = FocusGroupNode_androidKt.Uo(this.f34258n);
            if (ComposeUiFlags.isViewFocusFixEnabled) {
                if (viewUo.hasFocus() || viewUo.isFocused()) {
                    viewUo.clearFocus();
                    return;
                }
                return;
            }
            if (viewUo.hasFocus()) {
                FocusOwner focusOwner = DelegatableNodeKt.ck(this.f34258n).getFocusOwner();
                View viewN = DelegatableNode_androidKt.n(this.f34258n);
                if (!(viewUo instanceof ViewGroup)) {
                    if (!viewN.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                    return;
                }
                Rect rectJ2 = FocusGroupNode_androidKt.J2(focusOwner, viewN, viewUo);
                Integer numT = FocusInteropUtils_androidKt.t(focusEnterExitScope.getRequestedFocusDirection());
                int iIntValue = numT != null ? numT.intValue() : 130;
                FocusFinder focusFinder = FocusFinder.getInstance();
                FocusGroupPropertiesNode focusGroupPropertiesNode = this.f34258n;
                if (focusGroupPropertiesNode.getFocusedChild() != null) {
                    Intrinsics.checkNotNull(viewN, "null cannot be cast to non-null type android.view.ViewGroup");
                    viewFindNextFocusFromRect = focusFinder.findNextFocus((ViewGroup) viewN, focusGroupPropertiesNode.getFocusedChild(), iIntValue);
                } else {
                    Intrinsics.checkNotNull(viewN, "null cannot be cast to non-null type android.view.ViewGroup");
                    viewFindNextFocusFromRect = focusFinder.findNextFocusFromRect((ViewGroup) viewN, rectJ2, iIntValue);
                }
                if (viewFindNextFocusFromRect == null || !FocusGroupNode_androidKt.nr(viewUo, viewFindNextFocusFromRect)) {
                    if (!viewN.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                } else {
                    viewFindNextFocusFromRect.requestFocus(iIntValue, rectJ2);
                    focusEnterExitScope.n();
                }
            }
        }
    };

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void n7b(FocusProperties focusProperties) {
        focusProperties.KN(false);
        focusProperties.xMQ(this.onEnter);
        focusProperties.ty(this.onExit);
    }

    private final FocusTargetNode UR() {
        int iN = NodeKind.n(1024);
        if (!getNode().getIsAttached()) {
            InlineClassHelperKt.t("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = getNode();
        if ((node.getAggregateChildKindSet() & iN) != 0) {
            boolean z2 = false;
            for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iN) != 0) {
                    Modifier.Node nodeKN = child;
                    MutableVector mutableVector = null;
                    while (nodeKN != null) {
                        if (nodeKN instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) nodeKN;
                            if (z2) {
                                return focusTargetNode;
                            }
                            z2 = true;
                        } else if ((nodeKN.getKindSet() & iN) != 0 && (nodeKN instanceof DelegatingNode)) {
                            int i2 = 0;
                            for (Modifier.Node delegate = ((DelegatingNode) nodeKN).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & iN) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        nodeKN = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodeKN != null) {
                                            mutableVector.rl(nodeKN);
                                            nodeKN = null;
                                        }
                                        mutableVector.rl(delegate);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        nodeKN = DelegatableNodeKt.KN(mutableVector);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void Sax() {
        ViewTreeObserver viewTreeObserver = this.attachedViewTreeObserver;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.attachedViewTreeObserver = null;
        DelegatableNode_androidKt.n(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.focusedChild = null;
        super.Sax();
    }

    /* JADX INFO: renamed from: W5k, reason: from getter */
    public final View getFocusedChild() {
        return this.focusedChild;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        super.c();
        ViewTreeObserver viewTreeObserver = DelegatableNode_androidKt.n(this).getViewTreeObserver();
        this.attachedViewTreeObserver = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View oldFocus, View newFocus) {
        boolean z2;
        boolean z3;
        if (DelegatableNodeKt.HI(this).getOwner() != null) {
            View viewUo = FocusGroupNode_androidKt.Uo(this);
            FocusOwner focusOwner = DelegatableNodeKt.ck(this).getFocusOwner();
            Owner ownerCk = DelegatableNodeKt.ck(this);
            if (oldFocus != null && !Intrinsics.areEqual(oldFocus, ownerCk) && FocusGroupNode_androidKt.nr(viewUo, oldFocus)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (newFocus != null && !Intrinsics.areEqual(newFocus, ownerCk) && FocusGroupNode_androidKt.nr(viewUo, newFocus)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && z3) {
                this.focusedChild = newFocus;
                return;
            }
            if (z3) {
                this.focusedChild = newFocus;
                FocusTargetNode focusTargetNodeUR = UR();
                if (!focusTargetNodeUR.ijL().rl()) {
                    if (ComposeUiFlags.isTrackFocusEnabled) {
                        FocusTransactionsKt.mUb(focusTargetNodeUR);
                        return;
                    }
                    FocusTransactionManager focusTransactionManagerRl = focusOwner.rl();
                    try {
                        if (focusTransactionManagerRl.getOngoingTransaction()) {
                            focusTransactionManagerRl.J2();
                        }
                        focusTransactionManagerRl.O();
                        FocusTransactionsKt.mUb(focusTargetNodeUR);
                        focusTransactionManagerRl.Uo();
                        return;
                    } catch (Throwable th) {
                        focusTransactionManagerRl.Uo();
                        throw th;
                    }
                }
                return;
            }
            if (z2) {
                this.focusedChild = null;
                if (UR().ijL().n()) {
                    focusOwner.ty(false, true, false, FocusDirection.INSTANCE.t());
                    return;
                }
                return;
            }
            this.focusedChild = null;
        }
    }
}
