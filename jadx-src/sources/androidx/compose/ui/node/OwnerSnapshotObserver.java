package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B0\u0012'\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0011J/\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u0011J%\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u001a\u001a\u00020\u0004\"\b\b\u0000\u0010\u0017*\u00020\u00162\u0006\u0010\u0018\u001a\u00028\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0000¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010!\u001a\u00020\u0004H\u0000¢\u0006\u0004\b!\u0010\u001dR\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010%R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010%R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010%R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010%¨\u00060"}, d2 = {"Landroidx/compose/ui/node/OwnerSnapshotObserver;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "callback", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "affectsLookahead", "block", "O", "(Landroidx/compose/ui/node/LayoutNode;ZLkotlin/jvm/functions/Function0;)V", "t", "Uo", "mUb", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/node/OwnerScope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "target", "onChanged", "xMQ", "(Landroidx/compose/ui/node/OwnerScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "rl", "()V", c.f62177j, "(Ljava/lang/Object;)V", "gh", "qie", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "observer", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingLookaheadMeasure", "onCommitAffectingMeasure", "nr", "onCommitAffectingSemantics", "onCommitAffectingLayout", "J2", "onCommitAffectingLayoutModifier", "onCommitAffectingLayoutModifierInLookahead", "KN", "onCommitAffectingLookahead", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OwnerSnapshotObserver {
    public static final int xMQ = SnapshotStateObserver.qie;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateObserver observer;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Function1 onCommitAffectingLookaheadMeasure = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            n(layoutNode);
            return Unit.INSTANCE;
        }

        public final void n(LayoutNode layoutNode) {
            if (layoutNode.Vvq()) {
                LayoutNode.wKp(layoutNode, false, false, false, 7, null);
            }
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Function1 onCommitAffectingMeasure = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            n(layoutNode);
            return Unit.INSTANCE;
        }

        public final void n(LayoutNode layoutNode) {
            if (layoutNode.Vvq()) {
                LayoutNode.lNy(layoutNode, false, false, false, 7, null);
            }
        }
    };

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Function1 onCommitAffectingSemantics = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingSemantics$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            n(layoutNode);
            return Unit.INSTANCE;
        }

        public final void n(LayoutNode layoutNode) {
            if (layoutNode.Vvq()) {
                layoutNode.a63();
            }
        }
    };

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Function1 onCommitAffectingLayout = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            n(layoutNode);
            return Unit.INSTANCE;
        }

        public final void n(LayoutNode layoutNode) {
            if (layoutNode.Vvq()) {
                LayoutNode.xzo(layoutNode, false, 1, null);
            }
        }
    };

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Function1 onCommitAffectingLayoutModifier = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            n(layoutNode);
            return Unit.INSTANCE;
        }

        public final void n(LayoutNode layoutNode) {
            if (layoutNode.Vvq()) {
                LayoutNode.xzo(layoutNode, false, 1, null);
            }
        }
    };

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final Function1 onCommitAffectingLayoutModifierInLookahead = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            n(layoutNode);
            return Unit.INSTANCE;
        }

        public final void n(LayoutNode layoutNode) {
            if (layoutNode.Vvq()) {
                LayoutNode.jO(layoutNode, false, 1, null);
            }
        }
    };

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final Function1 onCommitAffectingLookahead = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookahead$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            n(layoutNode);
            return Unit.INSTANCE;
        }

        public final void n(LayoutNode layoutNode) {
            if (layoutNode.Vvq()) {
                LayoutNode.jO(layoutNode, false, 1, null);
            }
        }
    };

    public static /* synthetic */ void J2(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z2, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        ownerSnapshotObserver.O(layoutNode, z2, function0);
    }

    public static /* synthetic */ void KN(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z2, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        ownerSnapshotObserver.Uo(layoutNode, z2, function0);
    }

    public static /* synthetic */ void nr(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z2, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        ownerSnapshotObserver.t(layoutNode, z2, function0);
    }

    public final void O(LayoutNode node, boolean affectsLookahead, Function0 block) {
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            xMQ(node, this.onCommitAffectingLayout, block);
        } else {
            xMQ(node, this.onCommitAffectingLookahead, block);
        }
    }

    public final void Uo(LayoutNode node, boolean affectsLookahead, Function0 block) {
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            xMQ(node, this.onCommitAffectingMeasure, block);
        } else {
            xMQ(node, this.onCommitAffectingLookaheadMeasure, block);
        }
    }

    public final void gh() {
        this.observer.Z();
    }

    public final void mUb(LayoutNode node, Function0 block) {
        xMQ(node, this.onCommitAffectingSemantics, block);
    }

    public final void n(Object target) {
        this.observer.qie(target);
    }

    public final void qie() {
        this.observer.XQ();
        this.observer.gh();
    }

    public final void rl() {
        this.observer.az(new Function1<Object, Boolean>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                return Boolean.valueOf(!((OwnerScope) obj).Vvq());
            }
        });
    }

    public final void t(LayoutNode node, boolean affectsLookahead, Function0 block) {
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            xMQ(node, this.onCommitAffectingLayoutModifier, block);
        } else {
            xMQ(node, this.onCommitAffectingLayoutModifierInLookahead, block);
        }
    }

    public final void xMQ(OwnerScope target, Function1 onChanged, Function0 block) {
        this.observer.ck(target, onChanged, block);
    }

    public OwnerSnapshotObserver(Function1 function1) {
        this.observer = new SnapshotStateObserver(function1);
    }
}
