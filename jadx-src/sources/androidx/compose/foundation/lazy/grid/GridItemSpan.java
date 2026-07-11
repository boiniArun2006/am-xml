package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Immutable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "", "", "packedValue", "rl", "(J)J", "", "J2", "(J)Ljava/lang/String;", "", "O", "(J)I", InneractiveMediationNameConsts.OTHER, "", "t", "(JLjava/lang/Object;)Z", c.f62177j, "J", "nr", "currentLineSpan", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class GridItemSpan {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    public static String J2(long j2) {
        return "GridItemSpan(packedValue=" + j2 + ')';
    }

    public static int O(long j2) {
        return Long.hashCode(j2);
    }

    public static final /* synthetic */ GridItemSpan n(long j2) {
        return new GridItemSpan(j2);
    }

    public static final int nr(long j2) {
        return (int) j2;
    }

    public static long rl(long j2) {
        return j2;
    }

    public static boolean t(long j2, Object obj) {
        return (obj instanceof GridItemSpan) && j2 == ((GridItemSpan) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public boolean equals(Object obj) {
        return t(this.packedValue, obj);
    }

    public int hashCode() {
        return O(this.packedValue);
    }

    public String toString() {
        return J2(this.packedValue);
    }

    private /* synthetic */ GridItemSpan(long j2) {
        this.packedValue = j2;
    }
}
