package androidx.compose.ui.tooling;

import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.unit.IntRect;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0002\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0012\u0010\u001bR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001eR\u0013\u0010\"\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010!¨\u0006#"}, d2 = {"Landroidx/compose/ui/tooling/ShadowViewInfo;", "", "parent", "Landroidx/compose/ui/tooling/ViewInfo;", "viewInfo", "<init>", "(Landroidx/compose/ui/tooling/ShadowViewInfo;Landroidx/compose/ui/tooling/ViewInfo;)V", "(Landroidx/compose/ui/tooling/ViewInfo;)V", "", "O", "(Landroidx/compose/ui/tooling/ShadowViewInfo;)V", c.f62177j, "()Landroidx/compose/ui/tooling/ShadowViewInfo;", "J2", "()Landroidx/compose/ui/tooling/ViewInfo;", "Landroidx/compose/ui/tooling/ShadowViewInfo;", "getParent", "setParent", "rl", "Landroidx/compose/ui/tooling/ViewInfo;", "", "t", "Ljava/util/List;", "_children", "Lkotlin/sequences/Sequence;", "nr", "Lkotlin/sequences/Sequence;", "()Lkotlin/sequences/Sequence;", "allNodes", "", "()Ljava/util/List;", "children", "Landroidx/compose/ui/layout/LayoutInfo;", "()Landroidx/compose/ui/layout/LayoutInfo;", "layoutInfo", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShadowViewInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1549#2:116\n1620#2,3:117\n1549#2:120\n1620#2,3:121\n*S KotlinDebug\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo\n*L\n34#1:116\n34#1:117,3\n61#1:120\n61#1:121,3\n*E\n"})
public final class ShadowViewInfo {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public ShadowViewInfo parent;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public final Sequence allNodes;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public final ViewInfo viewInfo;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final List _children;

    public ShadowViewInfo(ShadowViewInfo shadowViewInfo, ViewInfo viewInfo) {
        this.parent = shadowViewInfo;
        this.viewInfo = viewInfo;
        List children = viewInfo.getChildren();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(children, 10));
        Iterator it = children.iterator();
        while (it.hasNext()) {
            arrayList.add(new ShadowViewInfo(this, (ViewInfo) it.next()));
        }
        this._children = CollectionsKt.toMutableList((Collection) arrayList);
        this.allNodes = SequencesKt.sequence(new ShadowViewInfo$allNodes$1(this, null));
    }

    public final ViewInfo J2() {
        String fileName = this.viewInfo.getFileName();
        int i2 = this.viewInfo.getCom.caoccao.javet.exceptions.JavetError.PARAMETER_LINE_NUMBER java.lang.String();
        IntRect bounds = this.viewInfo.getBounds();
        SourceLocation location = this.viewInfo.getLocation();
        List list = this._children;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ShadowViewInfo) it.next()).J2());
        }
        return new ViewInfo(fileName, i2, bounds, location, arrayList, this.viewInfo.getLayoutInfo());
    }

    public final void O(ShadowViewInfo parent) {
        List list;
        ShadowViewInfo shadowViewInfo = this.parent;
        if (shadowViewInfo != null && (list = shadowViewInfo._children) != null) {
            list.remove(this);
        }
        parent._children.add(this);
        this.parent = parent;
    }

    public final ShadowViewInfo n() {
        ShadowViewInfo shadowViewInfo = this.parent;
        if (shadowViewInfo == null) {
            return this;
        }
        Intrinsics.checkNotNull(shadowViewInfo);
        return shadowViewInfo.n();
    }

    public final LayoutInfo nr() {
        Object layoutInfo = this.viewInfo.getLayoutInfo();
        if (layoutInfo instanceof LayoutInfo) {
            return (LayoutInfo) layoutInfo;
        }
        return null;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final Sequence getAllNodes() {
        return this.allNodes;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final List get_children() {
        return this._children;
    }

    public ShadowViewInfo(ViewInfo viewInfo) {
        this(null, viewInfo);
    }
}
