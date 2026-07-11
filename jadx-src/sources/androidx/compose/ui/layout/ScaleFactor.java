package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\b\u0087@\u0018\u0000 \u000e2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00138Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/layout/ScaleFactor;", "", "", "packedValue", c.f62177j, "(J)J", "", "J2", "(J)Ljava/lang/String;", "", "O", "(J)I", InneractiveMediationNameConsts.OTHER, "", "rl", "(JLjava/lang/Object;)Z", "J", "getPackedValue", "()J", "", "t", "(J)F", "getScaleX$annotations", "()V", "scaleX", "nr", "getScaleY$annotations", "scaleY", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n1#1,150:1\n41#1:155\n46#1:158\n41#1:165\n46#1:168\n41#1:170\n46#1:173\n41#1:179\n46#1:182\n41#1:188\n46#1:191\n60#2:151\n70#2:153\n60#2:156\n70#2:159\n53#2,3:162\n60#2:166\n70#2:169\n60#2:171\n70#2:174\n53#2,3:176\n60#2:180\n70#2:183\n53#2,3:185\n60#2:189\n70#2:192\n53#2,3:194\n22#3:152\n22#3:154\n22#3:157\n22#3:160\n22#3:167\n22#3:172\n22#3:181\n22#3:190\n31#4:161\n31#4:175\n31#4:184\n31#4:193\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n*L\n48#1:155\n50#1:158\n56#1:165\n56#1:168\n63#1:170\n63#1:173\n70#1:179\n70#1:182\n72#1:188\n72#1:191\n41#1:151\n46#1:153\n48#1:156\n50#1:159\n56#1:162,3\n56#1:166\n56#1:169\n63#1:171\n63#1:174\n63#1:176,3\n70#1:180\n70#1:183\n70#1:185,3\n72#1:189\n72#1:192\n80#1:194,3\n41#1:152\n46#1:154\n48#1:157\n50#1:160\n56#1:167\n63#1:172\n70#1:181\n72#1:190\n56#1:161\n63#1:175\n70#1:184\n80#1:193\n*E\n"})
public final class ScaleFactor {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f32331t = n((((long) Float.floatToRawIntBits(Float.NaN)) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L));

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    public static int O(long j2) {
        return Long.hashCode(j2);
    }

    public static long n(long j2) {
        return j2;
    }

    public static boolean rl(long j2, Object obj) {
        return (obj instanceof ScaleFactor) && j2 == ((ScaleFactor) obj).getPackedValue();
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

    public static String J2(long j2) {
        return "ScaleFactor(" + Float.intBitsToFloat((int) (j2 >> 32)) + ", " + Float.intBitsToFloat((int) (j2 & 4294967295L)) + ')';
    }

    public static final float t(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public String toString() {
        return J2(this.packedValue);
    }

    public static final float nr(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }
}
