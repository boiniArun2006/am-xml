package androidx.compose.ui.input.pointer;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerId;", "", "", "value", c.f62177j, "(J)J", "", "O", "(J)Ljava/lang/String;", "", "nr", "(J)I", InneractiveMediationNameConsts.OTHER, "", "rl", "(JLjava/lang/Object;)Z", "J", "getValue", "()J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class PointerId {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long value;

    public static String O(long j2) {
        return "PointerId(value=" + j2 + ')';
    }

    public static long n(long j2) {
        return j2;
    }

    public static int nr(long j2) {
        return Long.hashCode(j2);
    }

    public static boolean rl(long j2, Object obj) {
        return (obj instanceof PointerId) && j2 == ((PointerId) obj).getValue();
    }

    public static final boolean t(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return rl(this.value, obj);
    }

    public int hashCode() {
        return nr(this.value);
    }

    public String toString() {
        return O(this.value);
    }
}
