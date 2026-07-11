package HI0;

import XFr.j;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class gnv {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final char[] f3860n;

    private static final Pair t(CharSequence charSequence, Function1 function1, int i2) {
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i2, 0);
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (iCoerceAtLeast > lastIndex) {
            return null;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iCoerceAtLeast);
            if (((Boolean) function1.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                return TuplesKt.to(Integer.valueOf(iCoerceAtLeast), Character.valueOf(cCharAt));
            }
            if (iCoerceAtLeast == lastIndex) {
                return null;
            }
            iCoerceAtLeast++;
        }
    }

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        f3860n = charArray;
    }

    public static final byte[] HI(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iArr.length * 4);
        for (int i2 : iArr) {
            byteBufferAllocate.putInt(i2);
        }
        byteBufferAllocate.rewind();
        byte[] bArr = new byte[iArr.length * 4];
        byteBufferAllocate.get(bArr);
        byte[] bArrTy = ty(bArr);
        Intrinsics.checkNotNullExpressionValue(bArrTy, "sha1(...)");
        return bArrTy;
    }

    public static /* synthetic */ Sequence Ik(CharSequence charSequence, Function1 function1, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return ck(charSequence, function1, i2);
    }

    public static final String J2(long j2) {
        Pair pair;
        j.C0428j c0428j = XFr.j.f11812t;
        if (XFr.j.t(j2, c0428j.nr(1.0d)) >= 0) {
            pair = new Pair(Long.valueOf((long) XFr.j.qie(j2)), "TB");
        } else if (XFr.j.t(j2, c0428j.n(1.0d)) >= 0) {
            pair = new Pair(Long.valueOf((long) XFr.j.xMQ(j2)), "GB");
        } else if (XFr.j.t(j2, c0428j.t(1.0d)) >= 0) {
            pair = new Pair(Long.valueOf((long) XFr.j.gh(j2)), "MB");
        } else {
            if (XFr.j.t(j2, c0428j.rl(1.0d)) < 0) {
                return j2 + " bytes";
            }
            pair = new Pair(Long.valueOf((long) XFr.j.mUb(j2)), "KB");
        }
        String str = String.format("%d%s", Arrays.copyOf(new Object[]{Long.valueOf(((Number) pair.component1()).longValue()), (String) pair.component2()}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final Float KN(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!StringsKt.endsWith$default(str, "%", false, 2, (Object) null)) {
            return StringsKt.toFloatOrNull(str);
        }
        Float floatOrNull = StringsKt.toFloatOrNull(StringsKt.dropLast(str, 1));
        if (floatOrNull != null) {
            return Float.valueOf(floatOrNull.floatValue() / 100.0f);
        }
        return null;
    }

    private static final String O(long j2) {
        Pair pair;
        j.C0428j c0428j = XFr.j.f11812t;
        if (XFr.j.t(j2, c0428j.nr(1.0d)) > 0) {
            pair = new Pair(Double.valueOf(XFr.j.qie(j2)), "TB");
        } else if (XFr.j.t(j2, c0428j.n(1.0d)) > 0) {
            pair = new Pair(Double.valueOf(XFr.j.xMQ(j2)), "GB");
        } else if (XFr.j.t(j2, c0428j.t(1.0d)) > 0) {
            pair = new Pair(Double.valueOf(XFr.j.gh(j2)), "MB");
        } else {
            if (XFr.j.t(j2, c0428j.rl(1.0d)) <= 0) {
                return j2 + " bytes";
            }
            pair = new Pair(Double.valueOf(XFr.j.mUb(j2)), "KB");
        }
        String str = String.format("%.1f %s", Arrays.copyOf(new Object[]{Double.valueOf(((Number) pair.component1()).doubleValue()), (String) pair.component2()}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final int Uo(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt.startsWith$default(str, "#", false, 2, (Object) null)) {
            str = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        return (int) Long.parseLong(str, 16);
    }

    public static final byte[] az(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return messageDigest.digest(bytes);
    }

    public static final Sequence ck(final CharSequence charSequence, Function1 predicate, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return SequencesKt.map(mUb(charSequence, predicate, 0, i2, 2, null), new Function1() { // from class: HI0.O
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return gnv.r(charSequence, (IntRange) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair gh(Function1 function1, CharSequence DelimitedRangesSequence, int i2) {
        Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        Pair pairT = t(DelimitedRangesSequence, function1, i2);
        if (pairT != null) {
            return TuplesKt.to(pairT.getFirst(), 1);
        }
        return null;
    }

    static /* synthetic */ Sequence mUb(CharSequence charSequence, Function1 function1, int i2, int i3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        return xMQ(charSequence, function1, i2, i3);
    }

    public static final String o(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        char[] cArr = new char[length * 2];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i5 = i2 + 1;
            byte b2 = bArr[i2];
            int i7 = i3 + 1;
            char[] cArr2 = f3860n;
            cArr[i3] = cArr2[(b2 & 240) >>> 4];
            i3 += 2;
            cArr[i7] = cArr2[b2 & 15];
            i2 = i5;
        }
        return new String(cArr);
    }

    public static final String qie(String str, CharSequence prefix, String replaceWith) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(replaceWith, "replaceWith");
        if (!StringsKt.startsWith$default((CharSequence) str, prefix, false, 2, (Object) null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return replaceWith + strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r(CharSequence charSequence, IntRange it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt.substring(charSequence, it);
    }

    public static final byte[] ty(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return MessageDigest.getInstance("SHA-1").digest(bArr);
    }

    private static final Sequence xMQ(CharSequence charSequence, final Function1 function1, int i2, int i3) {
        if (i3 >= 0) {
            return new Z(charSequence, i2, i3, new Function2() { // from class: HI0.LEl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return gnv.gh(function1, (CharSequence) obj, ((Integer) obj2).intValue());
                }
            });
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i3 + ".").toString());
    }

    public static final String nr(long j2) {
        return O(XFr.j.J2(j2));
    }
}
