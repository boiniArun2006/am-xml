package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\bR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R%\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0002\b\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR%\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0002\b\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/ui/focus/FocusRestorerNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/FocusRequester;", "fallback", "<init>", "(Landroidx/compose/ui/focus/FocusRequester;)V", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "", "n7b", "(Landroidx/compose/ui/focus/FocusProperties;)V", "Sax", "()V", "v", "Landroidx/compose/ui/focus/FocusRequester;", "NC9", "()Landroidx/compose/ui/focus/FocusRequester;", "ex", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "Xw", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "pinnedHandle", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusEnterExitScope;", "Lkotlin/ExtensionFunctionType;", "jB", "Lkotlin/jvm/functions/Function1;", "onExit", "U", "onEnter", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FocusRestorerNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode {

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private PinnableContainer.PinnedHandle pinnedHandle;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private FocusRequester fallback;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final Function1 onExit = new Function1<FocusEnterExitScope, Unit>() { // from class: androidx.compose.ui.focus.FocusRestorerNode$onExit$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FocusEnterExitScope focusEnterExitScope) {
            n(focusEnterExitScope);
            return Unit.INSTANCE;
        }

        public final void n(FocusEnterExitScope focusEnterExitScope) {
            FocusRequesterModifierNodeKt.nr(this.f31344n);
            PinnableContainer.PinnedHandle pinnedHandle = this.f31344n.pinnedHandle;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            FocusRestorerNode focusRestorerNode = this.f31344n;
            focusRestorerNode.pinnedHandle = FocusRequesterModifierNodeKt.n(focusRestorerNode);
        }
    };

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final Function1 onEnter = new Function1<FocusEnterExitScope, Unit>() { // from class: androidx.compose.ui.focus.FocusRestorerNode$onEnter$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FocusEnterExitScope focusEnterExitScope) {
            n(focusEnterExitScope);
            return Unit.INSTANCE;
        }

        public final void n(FocusEnterExitScope focusEnterExitScope) {
            PinnableContainer.PinnedHandle pinnedHandle = this.f31343n.pinnedHandle;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.f31343n.pinnedHandle = null;
            if (FocusRequesterModifierNodeKt.t(this.f31343n)) {
                return;
            }
            FocusRequester fallback = this.f31343n.getFallback();
            FocusRequester.Companion companion = FocusRequester.INSTANCE;
            if (Intrinsics.areEqual(fallback, companion.rl())) {
                return;
            }
            if (Intrinsics.areEqual(this.f31343n.getFallback(), companion.n())) {
                focusEnterExitScope.n();
            } else {
                FocusRequester.KN(this.f31343n.getFallback(), 0, 1, null);
            }
        }
    };

    /* JADX INFO: renamed from: NC9, reason: from getter */
    public final FocusRequester getFallback() {
        return this.fallback;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void Sax() {
        PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.pinnedHandle = null;
        super.Sax();
    }

    public final void ex(FocusRequester focusRequester) {
        this.fallback = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void n7b(FocusProperties focusProperties) {
        focusProperties.xMQ(this.onEnter);
        focusProperties.ty(this.onExit);
    }

    public FocusRestorerNode(FocusRequester focusRequester) {
        this.fallback = focusRequester;
    }
}
