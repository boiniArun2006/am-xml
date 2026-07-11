package androidx.compose.animation.core;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010\u0088\u0001\t\u0092\u0001\u00020\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/animation/core/StartOffset;", "", "", "offsetMillis", "Landroidx/compose/animation/core/StartOffsetType;", "offsetType", c.f62177j, "(II)J", "", "value", "rl", "(J)J", "", "xMQ", "(J)Ljava/lang/String;", "KN", "(J)I", InneractiveMediationNameConsts.OTHER, "", "nr", "(JLjava/lang/Object;)Z", "J", "J2", "Uo", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class StartOffset {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long value;

    public static final int J2(long j2) {
        return Math.abs((int) j2);
    }

    public static int KN(long j2) {
        return Long.hashCode(j2);
    }

    public static final boolean O(long j2, long j3) {
        return j2 == j3;
    }

    public static long n(int i2, int i3) {
        return rl(i2 * i3);
    }

    public static boolean nr(long j2, Object obj) {
        return (obj instanceof StartOffset) && j2 == ((StartOffset) obj).getValue();
    }

    private static long rl(long j2) {
        return j2;
    }

    public static String xMQ(long j2) {
        return "StartOffset(value=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return nr(this.value, obj);
    }

    public int hashCode() {
        return KN(this.value);
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    public String toString() {
        return xMQ(this.value);
    }

    public static final int Uo(long j2) {
        boolean z2 = j2 > 0;
        if (z2) {
            return StartOffsetType.INSTANCE.rl();
        }
        if (z2) {
            throw new NoWhenBranchMatchedException();
        }
        return StartOffsetType.INSTANCE.n();
    }

    public static /* synthetic */ long t(int i2, int i3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i5 & 2) != 0) {
            i3 = StartOffsetType.INSTANCE.n();
        }
        return n(i2, i3);
    }
}
