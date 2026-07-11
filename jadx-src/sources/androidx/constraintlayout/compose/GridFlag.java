package androidx.constraintlayout.compose;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087@\u0018\u0000 \u00052\u00020\u0001:\u0001\u0015B\u001d\b\u0012\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\nJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006\u0016"}, d2 = {"Landroidx/constraintlayout/compose/GridFlag;", "", "", "isPlaceLayoutsOnSpansFirst", "isSubGridByColRow", "rl", "(ZZ)I", "", "value", c.f62177j, "(I)I", "", "Uo", "(I)Ljava/lang/String;", "O", InneractiveMediationNameConsts.OTHER, "nr", "(ILjava/lang/Object;)Z", "I", "J2", "(I)Z", "Companion", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
public final class GridFlag {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f34553t = t(false, false, 3, null);
    private static final int nr = t(true, false, 2, null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f34552O = t(false, true, 1, null);

    public static final boolean J2(int i2) {
        return (i2 & 2) == 0;
    }

    public static int O(int i2) {
        return Integer.hashCode(i2);
    }

    private static int n(int i2) {
        return i2;
    }

    public static boolean nr(int i2, Object obj) {
        return (obj instanceof GridFlag) && i2 == ((GridFlag) obj).getValue();
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return nr(this.value, obj);
    }

    public int hashCode() {
        return O(this.value);
    }

    public static String Uo(int i2) {
        return "GridFlag(isPlaceLayoutsOnSpansFirst = " + J2(i2) + ')';
    }

    private static int rl(boolean z2, boolean z3) {
        return n((z2 ? 0 : 2) | (z3 ? 1 : 0));
    }

    static /* synthetic */ int t(boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        if ((i2 & 2) != 0) {
            z3 = false;
        }
        return rl(z2, z3);
    }

    public String toString() {
        return Uo(this.value);
    }
}
