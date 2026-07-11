package androidx.compose.ui.tooling.data;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/tooling/data/Parameter;", "", "", "sortedIndex", "", "inlineClass", "<init>", "(ILjava/lang/String;)V", c.f62177j, "I", "rl", "()I", "Ljava/lang/String;", "()Ljava/lang/String;", "ui-tooling-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class Parameter {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int sortedIndex;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final String inlineClass;

    public Parameter(int i2, String str) {
        this.sortedIndex = i2;
        this.inlineClass = str;
    }

    public /* synthetic */ Parameter(int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (i3 & 2) != 0 ? null : str);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getInlineClass() {
        return this.inlineClass;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getSortedIndex() {
        return this.sortedIndex;
    }
}
