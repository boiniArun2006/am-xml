package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0081@\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/SliderRange;", "", "", "packedValue", "t", "(J)J", "", "xMQ", "(J)Ljava/lang/String;", "", "KN", "(J)I", InneractiveMediationNameConsts.OTHER, "", "nr", "(JLjava/lang/Object;)Z", c.f62177j, "J", "getPackedValue", "()J", "", "Uo", "(J)F", "getStart$annotations", "()V", TtmlNode.START, "J2", "getEndInclusive$annotations", "endInclusive", "rl", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderRange\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,2263:1\n1#2:2264\n72#3:2265\n86#3:2267\n22#4:2266\n22#4:2268\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderRange\n*L\n2195#1:2265\n2204#1:2267\n2195#1:2266\n2204#1:2268\n*E\n"})
public final class SliderRange {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f27812t = SliderKt.xMQ(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/material3/SliderRange$Companion;", "", "<init>", "()V", "Landroidx/compose/material3/SliderRange;", "Unspecified", "J", c.f62177j, "()J", "getUnspecified-FYbKRX4$annotations", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long n() {
            return SliderRange.f27812t;
        }
    }

    public static int KN(long j2) {
        return Long.hashCode(j2);
    }

    public static final boolean O(long j2, long j3) {
        return j2 == j3;
    }

    public static boolean nr(long j2, Object obj) {
        return (obj instanceof SliderRange) && j2 == ((SliderRange) obj).getPackedValue();
    }

    public static final /* synthetic */ SliderRange rl(long j2) {
        return new SliderRange(j2);
    }

    public static long t(long j2) {
        return j2;
    }

    public boolean equals(Object obj) {
        return nr(this.packedValue, obj);
    }

    public int hashCode() {
        return KN(this.packedValue);
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public static final float J2(long j2) {
        if (j2 != f27812t) {
            return Float.intBitsToFloat((int) (j2 & 4294967295L));
        }
        throw new IllegalStateException(Apsps.vyNkraRjE);
    }

    public static final float Uo(long j2) {
        if (j2 != f27812t) {
            return Float.intBitsToFloat((int) (j2 >> 32));
        }
        throw new IllegalStateException("SliderRange is unspecified");
    }

    public String toString() {
        return xMQ(this.packedValue);
    }

    private /* synthetic */ SliderRange(long j2) {
        this.packedValue = j2;
    }

    public static String xMQ(long j2) {
        if (SliderKt.aYN(j2)) {
            return Uo(j2) + ".." + J2(j2);
        }
        return "FloatRange.Unspecified";
    }
}
