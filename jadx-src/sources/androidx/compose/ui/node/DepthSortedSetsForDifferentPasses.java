package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\fJ\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "", "", "extraAssertions", "<init>", "(Z)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "affectsLookahead", "O", "(Landroidx/compose/ui/node/LayoutNode;Z)Z", "nr", "(Landroidx/compose/ui/node/LayoutNode;)Z", "", "t", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "xMQ", "J2", "()Z", "Uo", "(Z)Z", "KN", "Landroidx/compose/ui/node/DepthSortedSet;", c.f62177j, "Landroidx/compose/ui/node/DepthSortedSet;", "lookaheadSet", "rl", "set", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n+ 2 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n1#1,203:1\n107#2:204\n107#2:205\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n*L\n178#1:204\n190#1:205\n*E\n"})
public final class DepthSortedSetsForDifferentPasses {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final DepthSortedSet lookaheadSet;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final DepthSortedSet set;

    public final boolean J2() {
        return this.set.t() && this.lookaheadSet.t();
    }

    public final boolean O(LayoutNode node, boolean affectsLookahead) {
        boolean zRl = this.lookaheadSet.rl(node);
        return affectsLookahead ? zRl : zRl || this.set.rl(node);
    }

    public final boolean Uo(boolean affectsLookahead) {
        return (affectsLookahead ? this.lookaheadSet : this.set).t();
    }

    public final boolean nr(LayoutNode node) {
        return this.lookaheadSet.rl(node) || this.set.rl(node);
    }

    public final void t(LayoutNode node, boolean affectsLookahead) {
        if (affectsLookahead) {
            this.lookaheadSet.n(node);
            this.set.n(node);
        } else {
            if (this.lookaheadSet.rl(node)) {
                return;
            }
            this.set.n(node);
        }
    }

    public final boolean xMQ(LayoutNode node) {
        return this.set.O(node) || this.lookaheadSet.O(node);
    }

    public DepthSortedSetsForDifferentPasses(boolean z2) {
        this.lookaheadSet = new DepthSortedSet(z2);
        this.set = new DepthSortedSet(z2);
    }

    public final boolean KN() {
        return !J2();
    }
}
