package androidx.compose.ui.tooling.data;

import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\b\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/tooling/data/SourceLocationInfo;", "", "", JavetError.PARAMETER_LINE_NUMBER, "offset", "length", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", c.f62177j, "Ljava/lang/Integer;", "rl", "()Ljava/lang/Integer;", "t", "ui-tooling-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SourceLocationInfo {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Integer lineNumber;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Integer offset;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Integer length;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Integer getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final Integer getLineNumber() {
        return this.lineNumber;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Integer getOffset() {
        return this.offset;
    }

    public SourceLocationInfo(Integer num, Integer num2, Integer num3) {
        this.lineNumber = num;
        this.offset = num2;
        this.length = num3;
    }
}
