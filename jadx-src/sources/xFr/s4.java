package xFr;

import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class s4 {
    public static final String J2(String str, Integer num, Integer num2, String str2) {
        String str3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (num2 != null) {
            if (str.length() > num2.intValue()) {
                str3 = wDgKoYAES.awLx + (str.length() - num2.intValue()) + " chars)";
            } else {
                str3 = "";
            }
            str = StringsKt.take(str, num2.intValue()) + str3;
        }
        return num != null ? Uo(str, num.intValue(), str2) : str;
    }

    public static /* synthetic */ String KN(String str, int i2, String str2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str2 = null;
        }
        return Uo(str, i2, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence O(String str, List list, int i2, int i3) {
        if (str == null || i3 <= 0) {
            str = "";
        }
        return str + CollectionsKt.joinToString$default(CollectionsKt.slice(list, RangesKt.until(i3, RangesKt.coerceAtMost(i2 + i3, list.size()))), ", ", null, null, 0, null, null, 62, null);
    }

    public static final String Uo(final String str, final int i2, final String str2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i2 <= 0) {
            throw new IllegalArgumentException("wrapPoint must be greater than 0");
        }
        final String strReplace$default = StringsKt.replace$default(str, "\n", "\\n", false, 4, (Object) null);
        return CollectionsKt.joinToString$default(RangesKt.step(StringsKt.getIndices(strReplace$default), i2), "\n", null, null, 0, null, new Function1() { // from class: xFr.l3D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s4.xMQ(str2, strReplace$default, i2, str, ((Integer) obj).intValue());
            }
        }, 30, null);
    }

    public static final String nr(final List list, final int i2, final String str) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i2 > 0) {
            return CollectionsKt.joinToString$default(RangesKt.step(CollectionsKt.getIndices(list), i2), ",\n", "[", "]", 0, null, new Function1() { // from class: xFr.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s4.O(str, list, i2, ((Integer) obj).intValue());
                }
            }, 24, null);
        }
        throw new IllegalArgumentException("max elements per line must be greater than 0");
    }

    public static final String t(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        MatchResult matchResultFind$default = Regex.find$default(new Regex("^([0-9]+)\\.([0-9]+)\\.([0-9]+)"), StringsKt.trim((CharSequence) str).toString(), 0, 2, null);
        if (matchResultFind$default != null) {
            return matchResultFind$default.getValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence xMQ(String str, String str2, int i2, String str3, int i3) {
        if (str == null || i3 <= 0) {
            str = "";
        }
        return str + StringsKt.slice(str2, RangesKt.until(i3, RangesKt.coerceAtMost(i2 + i3, str3.length())));
    }
}
