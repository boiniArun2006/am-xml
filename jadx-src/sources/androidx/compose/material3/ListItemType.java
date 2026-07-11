package androidx.compose.material3;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.reporters.b;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0083@\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/ListItemType;", "", "", b.f62856d, "Uo", "(I)I", InneractiveMediationNameConsts.OTHER, "J2", "(II)I", "", "gh", "(I)Ljava/lang/String;", "mUb", "", "", "KN", "(ILjava/lang/Object;)Z", c.f62177j, "I", "t", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
final class ListItemType implements Comparable<ListItemType> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int lines;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f26159O = Uo(1);
    private static final int J2 = Uo(2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f26160r = Uo(3);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0080\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0011\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/ListItemType$Companion;", "", "<init>", "()V", "", "hasOverline", "hasSupporting", "isSupportingMultiline", "Landroidx/compose/material3/ListItemType;", "nr", "(ZZZ)I", "OneLine", "I", c.f62177j, "()I", "TwoLine", "t", "ThreeLine", "rl", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int nr(boolean hasOverline, boolean hasSupporting, boolean isSupportingMultiline) {
            return ((hasOverline && hasSupporting) || isSupportingMultiline) ? rl() : (hasOverline || hasSupporting) ? t() : n();
        }

        public final int n() {
            return ListItemType.f26159O;
        }

        public final int rl() {
            return ListItemType.f26160r;
        }

        public final int t() {
            return ListItemType.J2;
        }
    }

    public static boolean KN(int i2, Object obj) {
        return (obj instanceof ListItemType) && i2 == ((ListItemType) obj).getLines();
    }

    private static int Uo(int i2) {
        return i2;
    }

    public static String gh(int i2) {
        return "ListItemType(lines=" + i2 + ')';
    }

    public static int mUb(int i2) {
        return Integer.hashCode(i2);
    }

    public static final boolean xMQ(int i2, int i3) {
        return i2 == i3;
    }

    public boolean equals(Object obj) {
        return KN(this.lines, obj);
    }

    public int hashCode() {
        return mUb(this.lines);
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final /* synthetic */ int getLines() {
        return this.lines;
    }

    public String toString() {
        return gh(this.lines);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ListItemType listItemType) {
        return nr(listItemType.getLines());
    }

    public int nr(int i2) {
        return J2(this.lines, i2);
    }

    public static int J2(int i2, int i3) {
        return Intrinsics.compare(i2, i3);
    }
}
