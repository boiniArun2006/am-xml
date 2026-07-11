package androidx.compose.ui.unit;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/unit/TextUnitType;", "", "", "type", "O", "(J)J", "", "xMQ", "(J)Ljava/lang/String;", "", "KN", "(J)I", InneractiveMediationNameConsts.OTHER, "", "J2", "(JLjava/lang/Object;)Z", c.f62177j, "J", "rl", "Companion", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class TextUnitType {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long type;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f34166t = O(0);
    private static final long nr = O(4294967296L);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final long f34165O = O(8589934592L);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/unit/TextUnitType$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/TextUnitType;", "Unspecified", "J", "t", "()J", "Sp", "rl", "Em", c.f62177j, "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long n() {
            return TextUnitType.f34165O;
        }

        public final long rl() {
            return TextUnitType.nr;
        }

        public final long t() {
            return TextUnitType.f34166t;
        }
    }

    public static boolean J2(long j2, Object obj) {
        return (obj instanceof TextUnitType) && j2 == ((TextUnitType) obj).getType();
    }

    public static int KN(long j2) {
        return Long.hashCode(j2);
    }

    public static long O(long j2) {
        return j2;
    }

    public static final boolean Uo(long j2, long j3) {
        return j2 == j3;
    }

    public static final /* synthetic */ TextUnitType nr(long j2) {
        return new TextUnitType(j2);
    }

    public boolean equals(Object obj) {
        return J2(this.type, obj);
    }

    public int hashCode() {
        return KN(this.type);
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final /* synthetic */ long getType() {
        return this.type;
    }

    public static String xMQ(long j2) {
        return Uo(j2, f34166t) ? "Unspecified" : Uo(j2, nr) ? "Sp" : Uo(j2, f34165O) ? "Em" : "Invalid";
    }

    public String toString() {
        return xMQ(this.type);
    }

    private /* synthetic */ TextUnitType(long j2) {
        this.type = j2;
    }
}
