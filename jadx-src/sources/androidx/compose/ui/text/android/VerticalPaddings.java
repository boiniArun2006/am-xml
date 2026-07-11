package androidx.compose.ui.text.android;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/android/VerticalPaddings;", "", "", "packedValue", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(J)J", "", "J2", "(J)Ljava/lang/String;", "", "O", "(J)I", InneractiveMediationNameConsts.OTHER, "", "rl", "(JLjava/lang/Object;)Z", "J", "nr", "topPadding", "t", "bottomPadding", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nTextLayout.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n+ 2 InlineClassUtils.android.kt\nandroidx/compose/ui/text/android/InlineClassUtils_androidKt\n*L\n1#1,1127:1\n28#2:1128\n33#2:1129\n*S KotlinDebug\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n*L\n965#1:1128\n968#1:1129\n*E\n"})
public final class VerticalPaddings {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    public static String J2(long j2) {
        return "VerticalPaddings(packedValue=" + j2 + ')';
    }

    public static int O(long j2) {
        return Long.hashCode(j2);
    }

    public static long n(long j2) {
        return j2;
    }

    public static final int nr(long j2) {
        return (int) (j2 >> 32);
    }

    public static boolean rl(long j2, Object obj) {
        return (obj instanceof VerticalPaddings) && j2 == ((VerticalPaddings) obj).getPackedValue();
    }

    public static final int t(long j2) {
        return (int) (j2 & 4294967295L);
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public boolean equals(Object obj) {
        return rl(this.packedValue, obj);
    }

    public int hashCode() {
        return O(this.packedValue);
    }

    public String toString() {
        return J2(this.packedValue);
    }
}
