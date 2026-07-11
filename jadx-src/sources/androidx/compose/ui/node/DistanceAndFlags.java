package androidx.compose.ui.node;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/node/DistanceAndFlags;", "", "", "packedValue", "rl", "(J)J", InneractiveMediationNameConsts.OTHER, "", c.f62177j, "(JJ)I", "", "KN", "(J)Ljava/lang/String;", "O", "(J)I", "", "t", "(JLjava/lang/Object;)Z", "J", "getPackedValue", "()J", "", "nr", "(J)F", "distance", "Uo", "(J)Z", "isInLayer", "J2", "isInExpandedBounds", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndFlags\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,410:1\n60#2:411\n22#3:412\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndFlags\n*L\n373#1:411\n373#1:412\n*E\n"})
public final class DistanceAndFlags {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    public static final boolean J2(long j2) {
        return (j2 & 2) != 0;
    }

    public static String KN(long j2) {
        return "DistanceAndFlags(packedValue=" + j2 + ')';
    }

    public static int O(long j2) {
        return Long.hashCode(j2);
    }

    public static final boolean Uo(long j2) {
        return (j2 & 1) != 0;
    }

    public static long rl(long j2) {
        return j2;
    }

    public static boolean t(long j2, Object obj) {
        return (obj instanceof DistanceAndFlags) && j2 == ((DistanceAndFlags) obj).getPackedValue();
    }

    public boolean equals(Object obj) {
        return t(this.packedValue, obj);
    }

    public int hashCode() {
        return O(this.packedValue);
    }

    public String toString() {
        return KN(this.packedValue);
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public static final float nr(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final int n(long j2, long j3) {
        boolean zUo = Uo(j2);
        if (zUo != Uo(j3)) {
            if (!zUo) {
                return 1;
            }
            return -1;
        }
        int iSignum = (int) Math.signum(nr(j2) - nr(j3));
        if (Math.min(nr(j2), nr(j3)) >= 0.0f && J2(j2) != J2(j3)) {
            if (!J2(j2)) {
                return 1;
            }
            return -1;
        }
        return iSignum;
    }
}
