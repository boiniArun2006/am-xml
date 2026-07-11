package androidx.compose.ui.node;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/node/Snake;", "", "", "data", "rl", "([I)[I", "Landroidx/compose/ui/node/IntStack;", "diagonals", "", c.f62177j, "([ILandroidx/compose/ui/node/IntStack;)V", "", "Uo", "([I)Ljava/lang/String;", "", "O", "([I)I", InneractiveMediationNameConsts.OTHER, "", "t", "([ILjava/lang/Object;)Z", "[I", "getData", "()[I", "nr", "([I)Z", "hasAdditionOrRemoval", "J2", "isAddition", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/Snake\n+ 2 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n*L\n1#1,518:1\n318#1:519\n310#1:520\n322#1:521\n314#1:522\n322#1:523\n314#1,5:524\n310#1:529\n322#1:530\n314#1,5:531\n310#1:536\n310#1:537\n314#1:538\n329#1:539\n318#1:540\n310#1:541\n322#1:542\n314#1:543\n326#1:544\n326#1:546\n318#1:548\n310#1:549\n310#1,17:550\n375#2:545\n375#2:547\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/Snake\n*L\n329#1:519\n329#1:520\n329#1:521\n329#1:522\n332#1:523\n332#1:524,5\n332#1:529\n335#1:530\n335#1:531,5\n335#1:536\n360#1:537\n361#1:538\n363#1:539\n363#1:540\n363#1:541\n363#1:542\n363#1:543\n364#1:544\n365#1:546\n367#1:548\n367#1:549\n372#1:550,17\n364#1:545\n365#1:547\n*E\n"})
final class Snake {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int[] data;

    private static final boolean J2(int[] iArr) {
        return iArr[3] - iArr[1] > iArr[2] - iArr[0];
    }

    public static int O(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static final void n(int[] iArr, IntStack intStack) {
        int iMin;
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (nr(iArr)) {
            iMin = Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
            i2 += ((iArr[4] != 0 ? 1 : 0) | (J2(iArr) ? 1 : 0)) ^ 1;
            i3 += ((!J2(iArr) ? 1 : 0) | (iArr[4] != 0 ? 1 : 0)) ^ 1;
        } else {
            iMin = iArr[2] - iArr[0];
        }
        intStack.Uo(i2, i3, iMin);
    }

    private static final boolean nr(int[] iArr) {
        return iArr[3] - iArr[1] != iArr[2] - iArr[0];
    }

    public static int[] rl(int[] iArr) {
        return iArr;
    }

    public static boolean t(int[] iArr, Object obj) {
        return (obj instanceof Snake) && Intrinsics.areEqual(iArr, ((Snake) obj).getData());
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final /* synthetic */ int[] getData() {
        return this.data;
    }

    public boolean equals(Object obj) {
        return t(this.data, obj);
    }

    public int hashCode() {
        return O(this.data);
    }

    public static String Uo(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("Snake(");
        sb.append(iArr[0]);
        sb.append(',');
        sb.append(iArr[1]);
        sb.append(',');
        sb.append(iArr[2]);
        sb.append(',');
        sb.append(iArr[3]);
        sb.append(',');
        sb.append(iArr[4] != 0);
        sb.append(')');
        return sb.toString();
    }

    public String toString() {
        return Uo(this.data);
    }
}
