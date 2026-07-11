package androidx.compose.ui.graphics;

import androidx.collection.FloatFloatPair;
import androidx.compose.ui.graphics.PathSegment;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0013\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\n\u001a\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0005\u001a'\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\n\u001a/\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0017\u0010\u000f\u001a9\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a/\u0010 \u001a\u00020\u001a2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!\u001a)\u0010\u0003\u001a\u00020\"2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u0003\u0010#\u001aA\u0010&\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b&\u0010'\u001a'\u0010)\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b)\u0010*\"\u0018\u0010-\u001a\u00020\u0002*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Landroidx/compose/ui/graphics/PathSegment;", "segment", "", "t", "xMQ", "(Landroidx/compose/ui/graphics/PathSegment;F)F", "mUb", "p0y", "p1y", "Uo", "(FFF)F", "p0", "p1", "p2", "KN", "(FFFF)F", "p3", "J2", "(FFFFF)F", "O", "fraction", "ty", "az", "qie", "", "roots", "", "index", "HI", "(FFF[FI)I", "", "horizontal", "gh", "(Landroidx/compose/ui/graphics/PathSegment;Z[FI)I", "Landroidx/collection/FloatFloatPair;", "(Landroidx/compose/ui/graphics/PathSegment;[FI)J", "p2y", "p3y", "rl", "(FFFF[FI)J", "r", "Ik", "(F[FI)I", "ck", "(Landroidx/compose/ui/graphics/PathSegment;)F", "endX", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBezier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1010:1\n154#1:1011\n472#1:1012\n473#1:1023\n472#1:1024\n473#1:1035\n472#1:1036\n473#1:1047\n472#1:1048\n473#1:1059\n472#1:1060\n473#1:1071\n454#1:1072\n454#1:1073\n454#1:1074\n472#1:1075\n473#1:1086\n472#1:1087\n473#1:1098\n472#1:1099\n473#1:1110\n472#1:1121\n473#1:1132\n472#1:1133\n473#1:1144\n472#1:1145\n473#1:1156\n472#1:1157\n473#1:1168\n472#1:1169\n473#1:1180\n472#1:1181\n473#1:1192\n273#1:1193\n273#1:1194\n984#1:1195\n984#1:1196\n998#1:1197\n998#1:1198\n273#1:1199\n472#1:1210\n473#1:1221\n456#1:1222\n456#1:1225\n65#2,10:1013\n65#2,10:1025\n65#2,10:1037\n65#2,10:1049\n65#2,10:1061\n65#2,10:1076\n65#2,10:1088\n65#2,10:1100\n83#2,10:1111\n65#2,10:1122\n65#2,10:1134\n65#2,10:1146\n65#2,10:1158\n65#2,10:1170\n65#2,10:1182\n65#2,10:1200\n65#2,10:1211\n46#2:1223\n56#2:1224\n65#2,10:1226\n*S KotlinDebug\n*F\n+ 1 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n*L\n131#1:1011\n131#1:1012\n131#1:1023\n154#1:1024\n154#1:1035\n174#1:1036\n174#1:1047\n177#1:1048\n177#1:1059\n179#1:1060\n179#1:1071\n208#1:1072\n210#1:1073\n212#1:1074\n215#1:1075\n215#1:1086\n220#1:1087\n220#1:1098\n223#1:1099\n223#1:1110\n244#1:1121\n244#1:1132\n247#1:1133\n247#1:1144\n250#1:1145\n250#1:1156\n254#1:1157\n254#1:1168\n257#1:1169\n257#1:1180\n264#1:1181\n264#1:1192\n347#1:1193\n362#1:1194\n381#1:1195\n382#1:1196\n406#1:1197\n407#1:1198\n439#1:1199\n483#1:1210\n483#1:1221\n618#1:1222\n805#1:1225\n131#1:1013,10\n154#1:1025,10\n174#1:1037,10\n177#1:1049,10\n179#1:1061,10\n215#1:1076,10\n220#1:1088,10\n223#1:1100,10\n240#1:1111,10\n244#1:1122,10\n247#1:1134,10\n250#1:1146,10\n254#1:1158,10\n257#1:1170,10\n264#1:1182,10\n472#1:1200,10\n483#1:1211,10\n783#1:1223\n786#1:1224\n845#1:1226,10\n*E\n"})
public final class BezierKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.f31524n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.f31527t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.f31520O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.f31526r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PathSegment.Type.J2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PathSegment.Type.f31525o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PathSegment.Type.f31522Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Ik(float f3, float[] fArr, int i2) {
        float f4 = f3 >= 0.0f ? f3 : 0.0f;
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        if (Math.abs(f4 - f3) > 1.05E-6f) {
            f4 = Float.NaN;
        }
        fArr[i2] = f4;
        return !Float.isNaN(f4) ? 1 : 0;
    }

    private static final float J2(float f3, float f4, float f5, float f6, float f7) {
        float f8 = (f6 + ((f4 - f5) * 3.0f)) - f3;
        return (((((f8 * f7) + (((f5 - (2.0f * f4)) + f3) * 3.0f)) * f7) + ((f4 - f3) * 3.0f)) * f7) + f3;
    }

    private static final float KN(float f3, float f4, float f5, float f6) {
        return (((((f5 - (f4 * 2.0f)) + f3) * f6) + ((f4 - f3) * 2.0f)) * f6) + f3;
    }

    public static final float O(float f3, float f4, float f5) {
        return ((((((f3 - f4) + 0.33333334f) * f5) + (f4 - (2.0f * f3))) * f5) + f3) * 3.0f * f5;
    }

    private static final float Uo(float f3, float f4, float f5) {
        return ((f4 - f3) * f5) + f3;
    }

    public static final long t(PathSegment pathSegment, float[] fArr, int i2) {
        int iGh = gh(pathSegment, true, fArr, i2);
        float fMin = Math.min(pathSegment.getPoints()[0], ck(pathSegment));
        float fMax = Math.max(pathSegment.getPoints()[0], ck(pathSegment));
        for (int i3 = 0; i3 < iGh; i3++) {
            float fXMQ = xMQ(pathSegment, fArr[i3]);
            fMin = Math.min(fMin, fXMQ);
            fMax = Math.max(fMax, fXMQ);
        }
        return FloatFloatPair.n(fMin, fMax);
    }

    private static final int HI(float f3, float f4, float f5, float[] fArr, int i2) {
        double d2 = f3;
        double d4 = f4;
        double d5 = f5;
        double d6 = d4 * 2.0d;
        double d7 = (d2 - d6) + d5;
        if (d7 == 0.0d) {
            if (d4 == d5) {
                return 0;
            }
            return Ik((float) ((d6 - d5) / (d6 - (d5 * 2.0d))), fArr, i2);
        }
        double d8 = -Math.sqrt((d4 * d4) - (d5 * d2));
        double d9 = (-d2) + d4;
        int iIk = Ik((float) ((-(d8 + d9)) / d7), fArr, i2);
        int iIk2 = iIk + Ik((float) ((d8 - d9) / d7), fArr, i2 + iIk);
        if (iIk2 <= 1) {
            return iIk2;
        }
        float f6 = fArr[i2];
        int i3 = i2 + 1;
        float f7 = fArr[i3];
        if (f6 <= f7) {
            return f6 == f7 ? iIk2 - 1 : iIk2;
        }
        fArr[i2] = f7;
        fArr[i3] = f6;
        return iIk2;
    }

    private static final float az(float f3, float f4, float f5) {
        float f6;
        float f7;
        double d2 = f3;
        double d4 = f4;
        double d5 = f5;
        double d6 = d4 * 2.0d;
        double d7 = (d2 - d6) + d5;
        if (d7 == 0.0d) {
            if (d4 == d5) {
                return Float.NaN;
            }
            float f8 = (float) ((d6 - d5) / (d6 - (d5 * 2.0d)));
            f6 = f8 >= 0.0f ? f8 : 0.0f;
            f7 = f6 <= 1.0f ? f6 : 1.0f;
            if (Math.abs(f7 - f8) > 1.05E-6f) {
                return Float.NaN;
            }
            return f7;
        }
        double d8 = -Math.sqrt((d4 * d4) - (d5 * d2));
        double d9 = (-d2) + d4;
        float f9 = (float) ((-(d8 + d9)) / d7);
        float f10 = f9 < 0.0f ? 0.0f : f9;
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (Math.abs(f10 - f9) > 1.05E-6f) {
            f10 = Float.NaN;
        }
        if (!Float.isNaN(f10)) {
            return f10;
        }
        float f11 = (float) ((d8 - d9) / d7);
        f6 = f11 >= 0.0f ? f11 : 0.0f;
        f7 = f6 <= 1.0f ? f6 : 1.0f;
        if (Math.abs(f7 - f11) > 1.05E-6f) {
            return Float.NaN;
        }
        return f7;
    }

    private static final int gh(PathSegment pathSegment, boolean z2, float[] fArr, int i2) {
        int i3 = !z2 ? 1 : 0;
        float[] points = pathSegment.getPoints();
        int i5 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        if (i5 == 3) {
            float f3 = 2;
            float f4 = points[i3 + 2];
            float f5 = (f4 - points[i3]) * f3;
            return Ik((-f5) / ((f3 * (points[i3 + 4] - f4)) - f5), fArr, i2);
        }
        if (i5 != 4) {
            return 0;
        }
        float f6 = points[i3 + 2];
        float f7 = (f6 - points[i3]) * 3.0f;
        float f8 = points[i3 + 4];
        float f9 = (f8 - f6) * 3.0f;
        float f10 = (points[i3 + 6] - f8) * 3.0f;
        int iHI = HI(f7, f9, f10, fArr, i2);
        float f11 = (f9 - f7) * 2.0f;
        return iHI + Ik((-f11) / (((f10 - f9) * 2.0f) - f11), fArr, i2 + iHI);
    }

    public static /* synthetic */ long nr(PathSegment pathSegment, float[] fArr, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return t(pathSegment, fArr, i2);
    }

    public static final float qie(float f3, float f4, float f5, float f6) {
        float f7;
        float f8;
        double d2 = f3;
        double d4 = ((d2 - (((double) f4) * 2.0d)) + ((double) f5)) * 3.0d;
        double d5 = ((double) (f4 - f3)) * 3.0d;
        double d6 = ((double) (-f3)) + (((double) (f4 - f5)) * 3.0d) + ((double) f6);
        if (Math.abs(d6 - 0.0d) < 1.0E-7d) {
            if (Math.abs(d4 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d5 - 0.0d) < 1.0E-7d) {
                    return Float.NaN;
                }
                float f9 = (float) ((-d2) / d5);
                f7 = f9 >= 0.0f ? f9 : 0.0f;
                f8 = f7 <= 1.0f ? f7 : 1.0f;
                if (Math.abs(f8 - f9) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f8;
            }
            double dSqrt = Math.sqrt((d5 * d5) - ((4.0d * d4) * d2));
            double d7 = d4 * 2.0d;
            float f10 = (float) ((dSqrt - d5) / d7);
            float f11 = f10 < 0.0f ? 0.0f : f10;
            if (f11 > 1.0f) {
                f11 = 1.0f;
            }
            if (Math.abs(f11 - f10) > 1.05E-6f) {
                f11 = Float.NaN;
            }
            if (!Float.isNaN(f11)) {
                return f11;
            }
            float f12 = (float) (((-d5) - dSqrt) / d7);
            f7 = f12 >= 0.0f ? f12 : 0.0f;
            f8 = f7 <= 1.0f ? f7 : 1.0f;
            if (Math.abs(f8 - f12) > 1.05E-6f) {
                return Float.NaN;
            }
            return f8;
        }
        double d8 = d4 / d6;
        double d9 = d5 / d6;
        double d10 = d2 / d6;
        double d11 = ((d9 * 3.0d) - (d8 * d8)) / 9.0d;
        double d12 = (((((2.0d * d8) * d8) * d8) - ((9.0d * d8) * d9)) + (d10 * 27.0d)) / 54.0d;
        double d13 = d11 * d11 * d11;
        double d14 = (d12 * d12) + d13;
        double d15 = d8 / 3.0d;
        if (d14 >= 0.0d) {
            if (d14 != 0.0d) {
                double dSqrt2 = Math.sqrt(d14);
                float fN = (float) (((double) (MathHelpersKt.n((float) ((-d12) + dSqrt2)) - MathHelpersKt.n((float) (d12 + dSqrt2)))) - d15);
                f7 = fN >= 0.0f ? fN : 0.0f;
                f8 = f7 <= 1.0f ? f7 : 1.0f;
                if (Math.abs(f8 - fN) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f8;
            }
            float f13 = -MathHelpersKt.n((float) d12);
            float f14 = (float) d15;
            float f15 = (2.0f * f13) - f14;
            float f16 = f15 < 0.0f ? 0.0f : f15;
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            if (Math.abs(f16 - f15) > 1.05E-6f) {
                f16 = Float.NaN;
            }
            if (!Float.isNaN(f16)) {
                return f16;
            }
            float f17 = (-f13) - f14;
            f7 = f17 >= 0.0f ? f17 : 0.0f;
            f8 = f7 <= 1.0f ? f7 : 1.0f;
            if (Math.abs(f8 - f17) > 1.05E-6f) {
                return Float.NaN;
            }
            return f8;
        }
        double dSqrt3 = Math.sqrt(-d13);
        double d16 = (-d12) / dSqrt3;
        if (d16 < -1.0d) {
            d16 = -1.0d;
        }
        if (d16 > 1.0d) {
            d16 = 1.0d;
        }
        double dAcos = Math.acos(d16);
        double dN = MathHelpersKt.n((float) dSqrt3) * 2.0f;
        float fCos = (float) ((Math.cos(dAcos / 3.0d) * dN) - d15);
        float f18 = fCos < 0.0f ? 0.0f : fCos;
        if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        if (Math.abs(f18 - fCos) > 1.05E-6f) {
            f18 = Float.NaN;
        }
        if (!Float.isNaN(f18)) {
            return f18;
        }
        float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dN) - d15);
        float f19 = fCos2 < 0.0f ? 0.0f : fCos2;
        if (f19 > 1.0f) {
            f19 = 1.0f;
        }
        if (Math.abs(f19 - fCos2) > 1.05E-6f) {
            f19 = Float.NaN;
        }
        if (!Float.isNaN(f19)) {
            return f19;
        }
        float fCos3 = (float) ((dN * Math.cos((dAcos + 12.566370614359172d) / 3.0d)) - d15);
        f7 = fCos3 >= 0.0f ? fCos3 : 0.0f;
        f8 = f7 <= 1.0f ? f7 : 1.0f;
        if (Math.abs(f8 - fCos3) > 1.05E-6f) {
            return Float.NaN;
        }
        return f8;
    }

    public static final long rl(float f3, float f4, float f5, float f6, float[] fArr, int i2) {
        float f7 = (f4 - f3) * 3.0f;
        float f8 = (f5 - f4) * 3.0f;
        float f9 = (f6 - f5) * 3.0f;
        int iHI = HI(f7, f8, f9, fArr, i2);
        float f10 = (f8 - f7) * 2.0f;
        int iIk = iHI + Ik((-f10) / (((f9 - f8) * 2.0f) - f10), fArr, i2 + iHI);
        float fMin = Math.min(f3, f6);
        float fMax = Math.max(f3, f6);
        for (int i3 = 0; i3 < iIk; i3++) {
            float fJ2 = J2(f3, f4, f5, f6, fArr[i3]);
            fMin = Math.min(fMin, fJ2);
            fMax = Math.max(fMax, fJ2);
        }
        return FloatFloatPair.n(fMin, fMax);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final float ck(PathSegment pathSegment) {
        float[] points = pathSegment.getPoints();
        int i2 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        char c2 = 2;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        c2 = 0;
                    }
                } else {
                    c2 = 6;
                }
            } else {
                c2 = 4;
            }
        }
        return points[c2];
    }

    public static final float mUb(PathSegment pathSegment, float f3) {
        float[] points = pathSegment.getPoints();
        int i2 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return Float.NaN;
                    }
                    return J2(points[1], points[3], points[5], points[7], f3);
                }
                return KN(points[1], points[3], points[5], f3);
            }
            return Uo(points[1], points[3], f3);
        }
        return points[1];
    }

    public static final float ty(PathSegment pathSegment, float f3) {
        float[] points = pathSegment.getPoints();
        switch (WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()]) {
            case 1:
                return Float.NaN;
            case 2:
                float f4 = points[0] - f3;
                float f5 = (-f4) / ((points[2] - f3) - f4);
                float f6 = 0.0f;
                if (f5 >= 0.0f) {
                    f6 = f5;
                }
                if (f6 > 1.0f) {
                    f6 = 1.0f;
                }
                if (Math.abs(f6 - f5) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f6;
            case 3:
                return az(points[0] - f3, points[2] - f3, points[4] - f3);
            case 4:
                return qie(points[0] - f3, points[2] - f3, points[4] - f3, points[6] - f3);
            case 5:
            case 6:
            case 7:
                return Float.NaN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final float xMQ(PathSegment pathSegment, float f3) {
        float[] points = pathSegment.getPoints();
        int i2 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return Float.NaN;
                    }
                    return J2(points[0], points[2], points[4], points[6], f3);
                }
                return KN(points[0], points[2], points[4], f3);
            }
            return Uo(points[0], points[2], f3);
        }
        return points[0];
    }
}
