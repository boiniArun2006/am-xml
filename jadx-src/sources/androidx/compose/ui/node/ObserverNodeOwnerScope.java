package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/node/ObserverModifierNode;", "observerNode", "<init>", "(Landroidx/compose/ui/node/ObserverModifierNode;)V", c.f62177j, "Landroidx/compose/ui/node/ObserverModifierNode;", "rl", "()Landroidx/compose/ui/node/ObserverModifierNode;", "", "Vvq", "()Z", "isValidOwnerScope", "t", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ObserverNodeOwnerScope implements OwnerScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ObserverModifierNode observerNode;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f32624O = 8;
    private static final Function1 J2 = new Function1<ObserverNodeOwnerScope, Unit>() { // from class: androidx.compose.ui.node.ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ObserverNodeOwnerScope observerNodeOwnerScope) {
            n(observerNodeOwnerScope);
            return Unit.INSTANCE;
        }

        public final void n(ObserverNodeOwnerScope observerNodeOwnerScope) {
            if (observerNodeOwnerScope.Vvq()) {
                observerNodeOwnerScope.getObserverNode().UhV();
            }
        }
    };

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/ObserverNodeOwnerScope$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "", "OnObserveReadsChanged", "Lkotlin/jvm/functions/Function1;", c.f62177j, "()Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Function1 n() {
            return ObserverNodeOwnerScope.J2;
        }
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean Vvq() {
        return this.observerNode.getNode().getIsAttached();
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final ObserverModifierNode getObserverNode() {
        return this.observerNode;
    }

    public ObserverNodeOwnerScope(ObserverModifierNode observerModifierNode) {
        this.observerNode = observerModifierNode;
    }
}
