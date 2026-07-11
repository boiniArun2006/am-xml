package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087@\u0018\u0000 ,2\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ=\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u001a\u0010\f\u001a\u00020\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\r\u001a\u00020\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010\"\u001a\u0004\b&\u0010$R\u001a\u0010\u000e\u001a\u00020\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010\"\u001a\u0004\b(\u0010$R\u001a\u0010\u000b\u001a\u00020\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\"\u001a\u0004\b*\u0010$\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/ui/graphics/Color;", "", "Lkotlin/ULong;", "value", "mUb", "(J)J", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "gh", "(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "", "alpha", "red", "green", "blue", "qie", "(JFFFF)J", "", "S", "(J)Ljava/lang/String;", "", "XQ", "(J)I", InneractiveMediationNameConsts.OTHER, "", "ty", "(JLjava/lang/Object;)Z", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "J", "getValue-s-VKNKU", "()J", "r", "(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace$annotations", "()V", "Z", "(J)F", "getRed$annotations", "o", "getGreen$annotations", "Ik", "getBlue$annotations", "ck", "getAlpha$annotations", "rl", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 2 ColorSpaces.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaces\n+ 3 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,659:1\n360#2:660\n578#3,12:661\n590#3,17:674\n578#3,12:691\n590#3,17:704\n578#3,12:721\n590#3,17:734\n22#4:673\n22#4:703\n22#4:733\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n*L\n123#1:660\n156#1:661,12\n156#1:674,17\n177#1:691,12\n177#1:704,17\n198#1:721,12\n198#1:734,17\n156#1:673\n177#1:703\n198#1:733\n*E\n"})
public final class Color {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long value;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f31437t = ColorKt.nr(4278190080L);
    private static final long nr = ColorKt.nr(4282664004L);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final long f31436O = ColorKt.nr(4287137928L);
    private static final long J2 = ColorKt.nr(4291611852L);
    private static final long Uo = ColorKt.nr(4294967295L);
    private static final long KN = ColorKt.nr(4294901760L);
    private static final long xMQ = ColorKt.nr(4278255360L);
    private static final long mUb = ColorKt.nr(4278190335L);
    private static final long gh = ColorKt.nr(4294967040L);
    private static final long qie = ColorKt.nr(4278255615L);
    private static final long az = ColorKt.nr(4294902015L);
    private static final long ty = ColorKt.rl(0);
    private static final long HI = ColorKt.n(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.f31604n.N());

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR&\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR&\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR&\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR&\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR&\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "Black", "J", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()J", "getBlack-0d7_KjU$annotations", "Gray", "t", "getGray-0d7_KjU$annotations", "LightGray", "nr", "getLightGray-0d7_KjU$annotations", "White", "KN", "getWhite-0d7_KjU$annotations", "Red", "O", "getRed-0d7_KjU$annotations", "Blue", "rl", "getBlue-0d7_KjU$annotations", "Transparent", "J2", "getTransparent-0d7_KjU$annotations", "Unspecified", "Uo", "getUnspecified-0d7_KjU$annotations", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n*L\n1#1,659:1\n33#2,5:660\n33#2,5:665\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color$Companion\n*L\n310#1:660,5\n343#1:665,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long J2() {
            return Color.ty;
        }

        public final long KN() {
            return Color.Uo;
        }

        public final long O() {
            return Color.KN;
        }

        public final long Uo() {
            return Color.HI;
        }

        public final long n() {
            return Color.f31437t;
        }

        public final long nr() {
            return Color.J2;
        }

        public final long rl() {
            return Color.mUb;
        }

        public final long t() {
            return Color.f31436O;
        }
    }

    public static final boolean HI(long j2, long j3) {
        return ULong.m494equalsimpl0(j2, j3);
    }

    public static int XQ(long j2) {
        return ULong.m499hashCodeimpl(j2);
    }

    public static long mUb(long j2) {
        return j2;
    }

    public static boolean ty(long j2, Object obj) {
        return (obj instanceof Color) && j2 == ((Color) obj).getValue();
    }

    public static final /* synthetic */ Color xMQ(long j2) {
        return new Color(j2);
    }

    /* JADX INFO: renamed from: WPU, reason: from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return ty(this.value, obj);
    }

    public int hashCode() {
        return XQ(this.value);
    }

    public static final float Ik(long j2) {
        int i2;
        int i3;
        int i5;
        if (ULong.m487constructorimpl(63 & j2) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m487constructorimpl(ULong.m487constructorimpl(j2 >>> 32) & 255))) / 255.0f;
        }
        short sM487constructorimpl = (short) ULong.m487constructorimpl(ULong.m487constructorimpl(j2 >>> 16) & 65535);
        int i7 = Short.MIN_VALUE & sM487constructorimpl;
        int i8 = ((65535 & sM487constructorimpl) >>> 10) & 31;
        int i9 = sM487constructorimpl & 1023;
        if (i8 != 0) {
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
        } else {
            if (i9 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i9 + 1056964608) - Float16Kt.f31462n;
                return i7 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i5 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i5 << 23) | (i7 << 16) | i3);
    }

    public static String S(long j2) {
        return "Color(" + Z(j2) + ", " + o(j2) + ", " + Ik(j2) + ", " + ck(j2) + ", " + r(j2).getName() + ')';
    }

    public static final float Z(long j2) {
        int i2;
        int i3;
        int i5;
        if (ULong.m487constructorimpl(63 & j2) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m487constructorimpl(ULong.m487constructorimpl(j2 >>> 48) & 255))) / 255.0f;
        }
        short sM487constructorimpl = (short) ULong.m487constructorimpl(ULong.m487constructorimpl(j2 >>> 48) & 65535);
        int i7 = Short.MIN_VALUE & sM487constructorimpl;
        int i8 = ((65535 & sM487constructorimpl) >>> 10) & 31;
        int i9 = sM487constructorimpl & 1023;
        if (i8 != 0) {
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
        } else {
            if (i9 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i9 + 1056964608) - Float16Kt.f31462n;
                return i7 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i5 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i5 << 23) | (i7 << 16) | i3);
    }

    public static /* synthetic */ long az(long j2, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = ck(j2);
        }
        float f7 = f3;
        if ((i2 & 2) != 0) {
            f4 = Z(j2);
        }
        float f8 = f4;
        if ((i2 & 4) != 0) {
            f5 = o(j2);
        }
        float f9 = f5;
        if ((i2 & 8) != 0) {
            f6 = Ik(j2);
        }
        return qie(j2, f7, f8, f9, f6);
    }

    public static final float ck(long j2) {
        float fUlongToDouble;
        float f3;
        if (ULong.m487constructorimpl(63 & j2) == 0) {
            fUlongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m487constructorimpl(ULong.m487constructorimpl(j2 >>> 56) & 255));
            f3 = 255.0f;
        } else {
            fUlongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m487constructorimpl(ULong.m487constructorimpl(j2 >>> 6) & 1023));
            f3 = 1023.0f;
        }
        return fUlongToDouble / f3;
    }

    public static final float o(long j2) {
        int i2;
        int i3;
        int i5;
        if (ULong.m487constructorimpl(63 & j2) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m487constructorimpl(ULong.m487constructorimpl(j2 >>> 40) & 255))) / 255.0f;
        }
        short sM487constructorimpl = (short) ULong.m487constructorimpl(ULong.m487constructorimpl(j2 >>> 32) & 65535);
        int i7 = Short.MIN_VALUE & sM487constructorimpl;
        int i8 = ((65535 & sM487constructorimpl) >>> 10) & 31;
        int i9 = sM487constructorimpl & 1023;
        if (i8 != 0) {
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
        } else {
            if (i9 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i9 + 1056964608) - Float16Kt.f31462n;
                return i7 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i5 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i5 << 23) | (i7 << 16) | i3);
    }

    public static final ColorSpace r(long j2) {
        ColorSpaces colorSpaces = ColorSpaces.f31604n;
        return colorSpaces.S()[(int) ULong.m487constructorimpl(j2 & 63)];
    }

    public String toString() {
        return S(this.value);
    }

    private /* synthetic */ Color(long j2) {
        this.value = j2;
    }

    public static final long gh(long j2, ColorSpace colorSpace) {
        return ColorSpaceKt.xMQ(r(j2), colorSpace, 0, 2, null).n(j2);
    }

    public static final long qie(long j2, float f3, float f4, float f5, float f6) {
        return ColorKt.n(f4, f5, f6, f3, r(j2));
    }
}
