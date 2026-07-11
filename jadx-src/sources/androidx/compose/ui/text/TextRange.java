package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0087@\u0018\u0000 '2\u00020\u0001:\u0001(B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u001b\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u001d\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\u001f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\"\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0011\u0010&\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/ui/text/TextRange;", "", "", "packedValue", "t", "(J)J", InneractiveMediationNameConsts.OTHER, "", "ck", "(JJ)Z", "nr", "", "offset", "O", "(JI)Z", "", "Ik", "(J)Ljava/lang/String;", "HI", "(J)I", "J2", "(JLjava/lang/Object;)Z", c.f62177j, "J", "ty", TtmlNode.START, "xMQ", TtmlNode.END, "qie", "min", "gh", "max", "KN", "(J)Z", "collapsed", "az", "reversed", "mUb", "length", "rl", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,123:1\n85#2:124\n90#2:125\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n*L\n53#1:124\n56#1:125\n*E\n"})
public final class TextRange {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f33514t = TextRangeKt.n(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/TextRange$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/TextRange;", "Zero", "J", c.f62177j, "()J", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long n() {
            return TextRange.f33514t;
        }
    }

    public static int HI(long j2) {
        return Long.hashCode(j2);
    }

    public static boolean J2(long j2, Object obj) {
        return (obj instanceof TextRange) && j2 == ((TextRange) obj).getPackedValue();
    }

    public static final boolean Uo(long j2, long j3) {
        return j2 == j3;
    }

    public static final /* synthetic */ TextRange rl(long j2) {
        return new TextRange(j2);
    }

    public static long t(long j2) {
        return j2;
    }

    public static final int ty(long j2) {
        return (int) (j2 >> 32);
    }

    public static final int xMQ(long j2) {
        return (int) (j2 & 4294967295L);
    }

    public boolean equals(Object obj) {
        return J2(this.packedValue, obj);
    }

    public int hashCode() {
        return HI(this.packedValue);
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public static String Ik(long j2) {
        return "TextRange(" + ty(j2) + dpcnwfoVOnrtRA.hVcOLPzafVbUoT + xMQ(j2) + ')';
    }

    public String toString() {
        return Ik(this.packedValue);
    }

    private /* synthetic */ TextRange(long j2) {
        this.packedValue = j2;
    }

    public static final boolean KN(long j2) {
        if (ty(j2) == xMQ(j2)) {
            return true;
        }
        return false;
    }

    public static final boolean O(long j2, int i2) {
        int iQie = qie(j2);
        if (i2 >= gh(j2) || iQie > i2) {
            return false;
        }
        return true;
    }

    public static final boolean az(long j2) {
        if (ty(j2) > xMQ(j2)) {
            return true;
        }
        return false;
    }

    public static final boolean ck(long j2, long j3) {
        boolean z2;
        boolean z3 = false;
        if (qie(j2) < gh(j3)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (qie(j3) < gh(j2)) {
            z3 = true;
        }
        return z2 & z3;
    }

    public static final int gh(long j2) {
        return Math.max(ty(j2), xMQ(j2));
    }

    public static final int mUb(long j2) {
        return gh(j2) - qie(j2);
    }

    public static final boolean nr(long j2, long j3) {
        boolean z2;
        boolean z3 = false;
        if (qie(j2) <= qie(j3)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (gh(j3) <= gh(j2)) {
            z3 = true;
        }
        return z2 & z3;
    }

    public static final int qie(long j2) {
        return Math.min(ty(j2), xMQ(j2));
    }
}
