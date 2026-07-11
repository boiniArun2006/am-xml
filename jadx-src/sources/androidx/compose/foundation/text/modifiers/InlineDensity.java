package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.unit.Density;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u0000 \u00052\u00020\u0001:\u0001\u001dB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b\u0088\u0001\u000b\u0092\u0001\u00020\n¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/text/modifiers/InlineDensity;", "", "", "density", "fontScale", "rl", "(FF)J", "Landroidx/compose/ui/unit/Density;", "nr", "(Landroidx/compose/ui/unit/Density;)J", "", "packedValue", "t", "(J)J", "", "mUb", "(J)Ljava/lang/String;", "", "xMQ", "(J)I", InneractiveMediationNameConsts.OTHER, "", "O", "(JLjava/lang/Object;)Z", c.f62177j, "J", "Uo", "(J)F", "KN", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nInlineDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineDensity.kt\nandroidx/compose/foundation/text/modifiers/InlineDensity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,51:1\n53#2,3:52\n60#2:55\n70#2:57\n22#3:56\n22#3:58\n*S KotlinDebug\n*F\n+ 1 InlineDensity.kt\nandroidx/compose/foundation/text/modifiers/InlineDensity\n*L\n33#1:52,3\n38#1:55\n41#1:57\n38#1:56\n41#1:58\n*E\n"})
public final class InlineDensity {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f20597t = rl(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/modifiers/InlineDensity$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/text/modifiers/InlineDensity;", "Unspecified", "J", c.f62177j, "()J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long n() {
            return InlineDensity.f20597t;
        }
    }

    public static final boolean J2(long j2, long j3) {
        return j2 == j3;
    }

    public static boolean O(long j2, Object obj) {
        return (obj instanceof InlineDensity) && j2 == ((InlineDensity) obj).getPackedValue();
    }

    private static long t(long j2) {
        return j2;
    }

    public static int xMQ(long j2) {
        return Long.hashCode(j2);
    }

    public boolean equals(Object obj) {
        return O(this.packedValue, obj);
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return xMQ(this.packedValue);
    }

    public static final float Uo(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static String mUb(long j2) {
        return "InlineDensity(density=" + Uo(j2) + ", fontScale=" + KN(j2) + ')';
    }

    public String toString() {
        return mUb(this.packedValue);
    }

    public static long nr(Density density) {
        return rl(density.getDensity(), density.getFontScale());
    }

    public static long rl(float f3, float f4) {
        return t((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
    }

    public static final float KN(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }
}
