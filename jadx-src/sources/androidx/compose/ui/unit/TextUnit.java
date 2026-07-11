package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.TextUnitType;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0087@\u0018\u0000  2\u00020\u0001:\u0001!B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\u0005R\u0017\u0010\u0018\u001a\u00020\u00168Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u0011\u0010\u001b\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/ui/unit/TextUnit;", "", "", "packedValue", "t", "(J)J", "", "gh", "(J)Ljava/lang/String;", "", "xMQ", "(J)I", InneractiveMediationNameConsts.OTHER, "", "nr", "(JLjava/lang/Object;)Z", c.f62177j, "J", "J2", "getRawType$annotations", "()V", "rawType", "Landroidx/compose/ui/unit/TextUnitType;", "Uo", "type", "mUb", "(J)Z", "isEm", "", "KN", "(J)F", "value", "rl", "Companion", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,366:1\n22#2:367\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n236#1:367\n*E\n"})
public final class TextUnit {
    private static final long nr;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final TextUnitType[] f34163t;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/unit/TextUnit$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/TextUnit;", "Unspecified", "J", c.f62177j, "()J", "getUnspecified-XSAIIZE$annotations", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long n() {
            return TextUnit.nr;
        }
    }

    public static final long J2(long j2) {
        return j2 & 1095216660480L;
    }

    public static final boolean O(long j2, long j3) {
        return j2 == j3;
    }

    public static boolean nr(long j2, Object obj) {
        return (obj instanceof TextUnit) && j2 == ((TextUnit) obj).getPackedValue();
    }

    public static final /* synthetic */ TextUnit rl(long j2) {
        return new TextUnit(j2);
    }

    public static long t(long j2) {
        return j2;
    }

    public static int xMQ(long j2) {
        return Long.hashCode(j2);
    }

    public boolean equals(Object obj) {
        return nr(this.packedValue, obj);
    }

    public int hashCode() {
        return xMQ(this.packedValue);
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    static {
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        f34163t = new TextUnitType[]{TextUnitType.nr(companion.t()), TextUnitType.nr(companion.rl()), TextUnitType.nr(companion.n())};
        nr = TextUnitKt.mUb(0L, Float.NaN);
    }

    public static final long Uo(long j2) {
        return f34163t[(int) (J2(j2) >>> 32)].getType();
    }

    public String toString() {
        return gh(this.packedValue);
    }

    private /* synthetic */ TextUnit(long j2) {
        this.packedValue = j2;
    }

    public static String gh(long j2) {
        long jUo = Uo(j2);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.Uo(jUo, companion.t())) {
            return "Unspecified";
        }
        if (TextUnitType.Uo(jUo, companion.rl())) {
            return KN(j2) + ".sp";
        }
        if (TextUnitType.Uo(jUo, companion.n())) {
            return KN(j2) + ".em";
        }
        return "Invalid";
    }

    public static final boolean mUb(long j2) {
        if (J2(j2) == 8589934592L) {
            return true;
        }
        return false;
    }

    public static final float KN(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }
}
