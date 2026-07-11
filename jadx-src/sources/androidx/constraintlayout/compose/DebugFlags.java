package androidx.constraintlayout.compose;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u0001\u0017B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0018"}, d2 = {"Landroidx/constraintlayout/compose/DebugFlags;", "", "", "flags", "rl", "(I)I", "", "KN", "(I)Ljava/lang/String;", "Uo", InneractiveMediationNameConsts.OTHER, "", "t", "(ILjava/lang/Object;)Z", c.f62177j, "I", "nr", "(I)Z", "showBounds", "J2", "showPaths", "O", "showKeyPositions", "Companion", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
public final class DebugFlags {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int flags;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f34524t = rl(0);
    private static final int nr = rl(-1);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/constraintlayout/compose/DebugFlags$Companion;", "", "<init>", "()V", "Landroidx/constraintlayout/compose/DebugFlags;", "None", "I", c.f62177j, "()I", "", "BOUNDS_FLAG", "KEY_POSITIONS_FLAG", "PATHS_FLAG", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int n() {
            return DebugFlags.f34524t;
        }
    }

    public static final boolean J2(int i2) {
        return (i2 & 2) > 0;
    }

    public static final boolean O(int i2) {
        return (i2 & 4) > 0;
    }

    public static int Uo(int i2) {
        return Integer.hashCode(i2);
    }

    public static final boolean nr(int i2) {
        return (i2 & 1) > 0;
    }

    public static int rl(int i2) {
        return i2;
    }

    public static boolean t(int i2, Object obj) {
        return (obj instanceof DebugFlags) && i2 == ((DebugFlags) obj).getFlags();
    }

    public boolean equals(Object obj) {
        return t(this.flags, obj);
    }

    public int hashCode() {
        return Uo(this.flags);
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final /* synthetic */ int getFlags() {
        return this.flags;
    }

    public static String KN(int i2) {
        return "DebugFlags(showBounds = " + nr(i2) + ", showPaths = " + J2(i2) + ", showKeyPositions = " + O(i2) + ')';
    }

    public String toString() {
        return KN(this.flags);
    }
}
