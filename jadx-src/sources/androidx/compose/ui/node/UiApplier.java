package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/UiApplier;", "Landroidx/compose/runtime/AbstractApplier;", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "index", "instance", "", "ck", "(ILandroidx/compose/ui/node/LayoutNode;)V", "HI", JavetError.PARAMETER_COUNT, c.f62177j, "(II)V", "from", "to", "t", "(III)V", "az", "()V", "J2", "xMQ", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UiApplier extends AbstractApplier<LayoutNode> {
    @Override // androidx.compose.runtime.Applier
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public void O(int index, LayoutNode instance) {
    }

    public UiApplier(LayoutNode layoutNode) {
        super(layoutNode);
    }

    @Override // androidx.compose.runtime.Applier
    /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
    public void Uo(int index, LayoutNode instance) {
        ((LayoutNode) getCurrent()).tUK(index, instance);
    }

    @Override // androidx.compose.runtime.Applier
    public void J2() {
        super.J2();
        Owner owner = ((LayoutNode) getRoot()).getOwner();
        if (owner != null) {
            owner.X();
        }
    }

    @Override // androidx.compose.runtime.AbstractApplier
    protected void az() {
        ((LayoutNode) getRoot()).Aum();
    }

    @Override // androidx.compose.runtime.Applier
    public void n(int index, int count) {
        ((LayoutNode) getCurrent()).s(index, count);
    }

    @Override // androidx.compose.runtime.Applier
    public void t(int from, int to, int count) {
        ((LayoutNode) getCurrent()).uG(from, to, count);
    }

    @Override // androidx.compose.runtime.Applier
    public void xMQ() {
        ((LayoutNode) getCurrent()).qie();
    }
}
