package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\fJ\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSet;", "", "", "extraAssertions", "<init>", "(Z)V", "Landroidx/collection/MutableObjectIntMap;", "Landroidx/compose/ui/node/LayoutNode;", "J2", "()Landroidx/collection/MutableObjectIntMap;", "node", "rl", "(Landroidx/compose/ui/node/LayoutNode;)Z", "", c.f62177j, "(Landroidx/compose/ui/node/LayoutNode;)V", "O", "nr", "()Landroidx/compose/ui/node/LayoutNode;", "t", "()Z", "", "toString", "()Ljava/lang/String;", "Z", "Landroidx/collection/MutableObjectIntMap;", "mapOfOriginalDepth", "Landroidx/compose/ui/node/TreeSet;", "Landroidx/compose/ui/node/TreeSet;", "set", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n*L\n1#1,203:1\n107#1:230\n56#2,5:204\n56#2,5:209\n56#2,5:214\n56#2,5:219\n56#2,5:225\n438#3:224\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n99#1:230\n55#1:204,5\n63#1:209,5\n70#1:214,5\n77#1:219,5\n84#1:225,5\n81#1:224\n*E\n"})
public final class DepthSortedSet {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean extraAssertions;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private MutableObjectIntMap mapOfOriginalDepth;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final TreeSet set = new TreeSet(DepthSortedSetKt.f32402n);

    private final MutableObjectIntMap J2() {
        if (this.mapOfOriginalDepth == null) {
            this.mapOfOriginalDepth = ObjectIntMapKt.rl();
        }
        MutableObjectIntMap mutableObjectIntMap = this.mapOfOriginalDepth;
        Intrinsics.checkNotNull(mutableObjectIntMap);
        return mutableObjectIntMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LayoutNode nr() {
        LayoutNode layoutNode = (LayoutNode) this.set.first();
        O(layoutNode);
        return layoutNode;
    }

    public final boolean rl(LayoutNode node) {
        boolean zContains = this.set.contains(node);
        if (this.extraAssertions) {
            if (!(zContains == J2().n(node))) {
                InlineClassHelperKt.t("inconsistency in TreeSet");
            }
        }
        return zContains;
    }

    public final boolean t() {
        return this.set.isEmpty();
    }

    public String toString() {
        return this.set.toString();
    }

    public DepthSortedSet(boolean z2) {
        this.extraAssertions = z2;
    }

    public final boolean O(LayoutNode node) {
        int depth;
        boolean z2;
        if (!node.nr()) {
            InlineClassHelperKt.t("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.set.remove(node);
        if (this.extraAssertions) {
            MutableObjectIntMap mutableObjectIntMapJ2 = J2();
            if (mutableObjectIntMapJ2.n(node)) {
                int iT = mutableObjectIntMapJ2.t(node);
                mutableObjectIntMapJ2.r(node);
                if (zRemove) {
                    depth = node.getDepth();
                } else {
                    depth = Integer.MAX_VALUE;
                }
                if (iT == depth) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    InlineClassHelperKt.t("invalid node depth");
                }
            }
        }
        return zRemove;
    }

    public final void n(LayoutNode node) {
        boolean z2;
        if (!node.nr()) {
            InlineClassHelperKt.t("DepthSortedSet.add called on an unattached node");
        }
        if (this.extraAssertions) {
            MutableObjectIntMap mutableObjectIntMapJ2 = J2();
            int iO = mutableObjectIntMapJ2.O(node, Integer.MAX_VALUE);
            if (iO == Integer.MAX_VALUE) {
                mutableObjectIntMapJ2.XQ(node, node.getDepth());
            } else {
                if (iO == node.getDepth()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    InlineClassHelperKt.t("invalid node depth");
                }
            }
        }
        this.set.add(node);
    }
}
