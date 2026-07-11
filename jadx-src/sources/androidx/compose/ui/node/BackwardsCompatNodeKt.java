package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\" \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\" \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/node/BackwardsCompatNode;", "", "O", "(Landroidx/compose/ui/node/BackwardsCompatNode;)Z", "androidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1", c.f62177j, "Landroidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1;", "DetachedModifierLocalReadScope", "Lkotlin/Function1;", "", "rl", "Lkotlin/jvm/functions/Function1;", "onDrawCacheReadsChanged", "t", "updateModifierLocalConsumer", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BackwardsCompatNodeKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 f32382n = new ModifierLocalReadScope() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1
        @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
        public Object aYN(ModifierLocal modifierLocal) {
            return modifierLocal.getDefaultFactory().invoke();
        }
    };
    private static final Function1 rl = new Function1<BackwardsCompatNode, Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$onDrawCacheReadsChanged$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BackwardsCompatNode backwardsCompatNode) {
            n(backwardsCompatNode);
            return Unit.INSTANCE;
        }

        public final void n(BackwardsCompatNode backwardsCompatNode) {
            backwardsCompatNode.poH();
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Function1 f32383t = new Function1<BackwardsCompatNode, Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$updateModifierLocalConsumer$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BackwardsCompatNode backwardsCompatNode) {
            n(backwardsCompatNode);
            return Unit.INSTANCE;
        }

        public final void n(BackwardsCompatNode backwardsCompatNode) {
            backwardsCompatNode.GT();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O(BackwardsCompatNode backwardsCompatNode) {
        Modifier.Node tail = DelegatableNodeKt.HI(backwardsCompatNode).getNodes().getTail();
        Intrinsics.checkNotNull(tail, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((TailModifierNode) tail).getAttachHasBeenRun();
    }
}
