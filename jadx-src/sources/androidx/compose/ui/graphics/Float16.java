package androidx.compose.ui.graphics;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\b\u0081@\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/Float16;", "", "", "halfValue", "t", "(S)S", "", "KN", "(S)F", "", "xMQ", "(S)Ljava/lang/String;", InneractiveMediationNameConsts.OTHER, "", "rl", "(SS)I", "", "Uo", "(S)Z", "J2", "(S)I", "", "nr", "(SLjava/lang/Object;)Z", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "S", "getHalfValue", "()S", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nFloat16.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16\n+ 2 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,642:1\n535#2,38:643\n578#2,12:681\n590#2,17:694\n522#2,4:711\n22#3:693\n*S KotlinDebug\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16\n*L\n95#1:643,38\n138#1:681,12\n138#1:694,17\n198#1:711,4\n138#1:693\n*E\n"})
public final class Float16 implements Comparable<Float16> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final short halfValue;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final short f31452O = t(com.caoccao.javet.utils.Float16.EPSILON);
    private static final short J2 = t(com.caoccao.javet.utils.Float16.LOWEST_VALUE);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final short f31459r = t(com.caoccao.javet.utils.Float16.MAX_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final short f31458o = t(1024);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final short f31455Z = t(1);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final short f31453S = t(com.caoccao.javet.utils.Float16.NaN);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final short f31457g = t(com.caoccao.javet.utils.Float16.NEGATIVE_INFINITY);
    private static final short E2 = t(Short.MIN_VALUE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final short f31456e = t(com.caoccao.javet.utils.Float16.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final short f31454X = t(0);

    public static int J2(short s2) {
        return Short.hashCode(s2);
    }

    public static final boolean Uo(short s2) {
        return (s2 & ShortCompanionObject.MAX_VALUE) > 31744;
    }

    public static boolean nr(short s2, Object obj) {
        return (obj instanceof Float16) && s2 == ((Float16) obj).getHalfValue();
    }

    public static short t(short s2) {
        return s2;
    }

    public boolean equals(Object obj) {
        return nr(this.halfValue, obj);
    }

    public int hashCode() {
        return J2(this.halfValue);
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final /* synthetic */ short getHalfValue() {
        return this.halfValue;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return n(float16.getHalfValue());
    }

    public int n(short s2) {
        return rl(this.halfValue, s2);
    }

    public String toString() {
        return xMQ(this.halfValue);
    }

    public static final float KN(short s2) {
        int i2;
        int i3;
        int i5;
        int i7 = Short.MIN_VALUE & s2;
        int i8 = ((65535 & s2) >>> 10) & 31;
        int i9 = s2 & 1023;
        if (i8 == 0) {
            if (i9 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i9 + 1056964608) - Float16Kt.f31462n;
                if (i7 == 0) {
                    return fIntBitsToFloat;
                }
                return -fIntBitsToFloat;
            }
            i5 = 0;
            i3 = 0;
        } else {
            int i10 = i9 << 13;
            if (i8 == 31) {
                i2 = 255;
                if (i10 != 0) {
                    i10 |= 4194304;
                }
            } else {
                i2 = i8 + 112;
            }
            int i11 = i2;
            i3 = i10;
            i5 = i11;
        }
        return Float.intBitsToFloat((i5 << 23) | (i7 << 16) | i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int rl(short s2, short s3) {
        int i2;
        int i3;
        if (Uo(s2)) {
            return !Uo(s3) ? 1 : 0;
        }
        if (Uo(s3)) {
            return -1;
        }
        if ((s2 & Short.MIN_VALUE) != 0) {
            i2 = 32768 - (s2 & UShort.MAX_VALUE);
        } else {
            i2 = s2 & UShort.MAX_VALUE;
        }
        if ((s3 & Short.MIN_VALUE) != 0) {
            i3 = 32768 - (s3 & UShort.MAX_VALUE);
        } else {
            i3 = s3 & UShort.MAX_VALUE;
        }
        return Intrinsics.compare(i2, i3);
    }

    public static String xMQ(short s2) {
        return String.valueOf(KN(s2));
    }
}
