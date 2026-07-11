package androidx.compose.runtime;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/GroupInfo;", "", "", "slotIndex", "nodeIndex", "nodeCount", "<init>", "(III)V", c.f62177j, "I", "t", "()I", "J2", "(I)V", "rl", "O", "nr", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class GroupInfo {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int slotIndex;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int nodeIndex;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int nodeCount;

    public final void J2(int i2) {
        this.slotIndex = i2;
    }

    public final void O(int i2) {
        this.nodeIndex = i2;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getNodeCount() {
        return this.nodeCount;
    }

    public final void nr(int i2) {
        this.nodeCount = i2;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getNodeIndex() {
        return this.nodeIndex;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getSlotIndex() {
        return this.slotIndex;
    }

    public GroupInfo(int i2, int i3, int i5) {
        this.slotIndex = i2;
        this.nodeIndex = i3;
        this.nodeCount = i5;
    }
}
