package androidx.compose.runtime;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/AnchoredGroupPath;", "Landroidx/compose/runtime/SourceInformationGroupPath;", "", "group", "<init>", "(I)V", "Landroidx/compose/runtime/SlotTable;", "table", "", c.f62177j, "(Landroidx/compose/runtime/SlotTable;)Ljava/lang/Object;", "I", "getGroup", "()I", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AnchoredGroupPath extends SourceInformationGroupPath {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int group;

    public AnchoredGroupPath(int i2) {
        super(null);
        this.group = i2;
    }

    @Override // androidx.compose.runtime.SourceInformationGroupPath
    public Object n(SlotTable table) {
        return table.KN(this.group);
    }
}
