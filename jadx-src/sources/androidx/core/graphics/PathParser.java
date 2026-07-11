package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class PathParser {

    public static class PathDataNode {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private char f36414n;
        private final float[] rl;

        PathDataNode(char c2, float[] fArr) {
            this.f36414n = c2;
            this.rl = fArr;
        }

        private static void J2(Path path, double d2, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11) {
            double d12 = d5;
            int iCeil = (int) Math.ceil(Math.abs((d11 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d9);
            double dSin = Math.sin(d9);
            double dCos2 = Math.cos(d10);
            double dSin2 = Math.sin(d10);
            double d13 = -d12;
            double d14 = d13 * dCos;
            double d15 = d6 * dSin;
            double d16 = (d14 * dSin2) - (d15 * dCos2);
            double d17 = d13 * dSin;
            double d18 = d6 * dCos;
            double d19 = (dSin2 * d17) + (dCos2 * d18);
            double d20 = d11 / ((double) iCeil);
            double d21 = d19;
            double d22 = d16;
            int i2 = 0;
            double d23 = d7;
            double d24 = d8;
            double d25 = d10;
            while (i2 < iCeil) {
                double d26 = d25 + d20;
                double dSin3 = Math.sin(d26);
                double dCos3 = Math.cos(d26);
                double d27 = (d2 + ((d12 * dCos) * dCos3)) - (d15 * dSin3);
                int i3 = i2;
                double d28 = d4 + (d5 * dSin * dCos3) + (d18 * dSin3);
                double d29 = (d14 * dSin3) - (d15 * dCos3);
                double d30 = (dSin3 * d17) + (dCos3 * d18);
                double d31 = d26 - d25;
                double dTan = Math.tan(d31 / 2.0d);
                double dSin4 = (Math.sin(d31) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d32 = d23 + (d22 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d32, (float) (d24 + (d21 * dSin4)), (float) (d27 - (dSin4 * d29)), (float) (d28 - (dSin4 * d30)), (float) d27, (float) d28);
                dSin = dSin;
                d20 = d20;
                d23 = d27;
                d17 = d17;
                d25 = d26;
                d21 = d30;
                dCos = dCos;
                d12 = d5;
                d24 = d28;
                i2 = i3 + 1;
                iCeil = iCeil;
                d22 = d29;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void O(Path path, float[] fArr, char c2, char c4, float[] fArr2) {
            int i2;
            int i3;
            boolean z2;
            boolean z3;
            char c5;
            char c6;
            int i5;
            float f3;
            boolean z4;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            boolean z5;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            Path path2 = path;
            boolean z6 = false;
            float f19 = fArr[0];
            boolean z7 = true;
            float f20 = fArr[1];
            char c7 = 2;
            float f21 = fArr[2];
            char c8 = 3;
            float f22 = fArr[3];
            float f23 = fArr[4];
            float f24 = fArr[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i2 = 7;
                    i3 = i2;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    i3 = i2;
                    break;
                case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                case 'V':
                case 'h':
                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                    i3 = 1;
                    break;
                case 'L':
                case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i3 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i3 = 4;
                    break;
                case 'Z':
                case INVALID_ADS_ENDPOINT_VALUE:
                    path2.close();
                    path2.moveTo(f23, f24);
                    f19 = f23;
                    f21 = f19;
                    f20 = f24;
                    f22 = f20;
                    i3 = 2;
                    break;
            }
            float f25 = f19;
            float f26 = f20;
            float f27 = f23;
            float f28 = f24;
            int i7 = 0;
            char c9 = c2;
            while (i7 < fArr2.length) {
                if (c4 == 'A') {
                    float f29 = f25;
                    float f30 = f26;
                    z2 = z6;
                    z3 = z7;
                    c5 = c7;
                    c6 = c8;
                    i5 = i7;
                    int i8 = i5 + 5;
                    float f31 = fArr2[i8];
                    int i9 = i5 + 6;
                    float f32 = fArr2[i9];
                    float f33 = fArr2[i5];
                    float f34 = fArr2[i5 + 1];
                    float f35 = fArr2[i5 + 2];
                    if (fArr2[i5 + 3] != 0.0f) {
                        f3 = 0.0f;
                        z4 = z3;
                    } else {
                        f3 = 0.0f;
                        z4 = z2;
                    }
                    Uo(path, f29, f30, f31, f32, f33, f34, f35, z4, fArr2[i5 + 4] != f3 ? z3 : z2);
                    f21 = fArr2[i8];
                    f25 = f21;
                    f22 = fArr2[i9];
                    f26 = f22;
                } else if (c4 == 'C') {
                    z2 = z6;
                    z3 = z7;
                    c5 = c7;
                    c6 = c8;
                    i5 = i7;
                    int i10 = i5 + 2;
                    int i11 = i5 + 3;
                    int i12 = i5 + 4;
                    int i13 = i5 + 5;
                    path2.cubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i10], fArr2[i11], fArr2[i12], fArr2[i13]);
                    float f36 = fArr2[i12];
                    float f37 = fArr2[i13];
                    float f38 = fArr2[i10];
                    float f39 = fArr2[i11];
                    f25 = f36;
                    f26 = f37;
                    f22 = f39;
                    f21 = f38;
                } else if (c4 != 'H') {
                    if (c4 != 'Q') {
                        z2 = z6;
                        if (c4 == 'V') {
                            z3 = z7;
                            c5 = c7;
                            c6 = c8;
                            i5 = i7;
                            path2.lineTo(f25, fArr2[i5]);
                            f6 = fArr2[i5];
                        } else if (c4 != 'a') {
                            if (c4 != 'c') {
                                z3 = z7;
                                if (c4 != 'h') {
                                    if (c4 != 'q') {
                                        c5 = c7;
                                        if (c4 != 'v') {
                                            if (c4 != 'L') {
                                                if (c4 != 'M') {
                                                    c6 = c8;
                                                    if (c4 == 'S') {
                                                        if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                                            f25 = (f25 * 2.0f) - f21;
                                                            f26 = (f26 * 2.0f) - f22;
                                                        }
                                                        float f40 = f25;
                                                        float f41 = f26;
                                                        int i14 = i7 + 1;
                                                        int i15 = i7 + 2;
                                                        int i16 = i7 + 3;
                                                        path2.cubicTo(f40, f41, fArr2[i7], fArr2[i14], fArr2[i15], fArr2[i16]);
                                                        f4 = fArr2[i7];
                                                        f5 = fArr2[i14];
                                                        f25 = fArr2[i15];
                                                        f26 = fArr2[i16];
                                                        i5 = i7;
                                                    } else if (c4 == 'T') {
                                                        if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                                            f25 = (f25 * 2.0f) - f21;
                                                            f26 = (f26 * 2.0f) - f22;
                                                        }
                                                        int i17 = i7 + 1;
                                                        path2.quadTo(f25, f26, fArr2[i7], fArr2[i17]);
                                                        float f42 = fArr2[i7];
                                                        f6 = fArr2[i17];
                                                        f21 = f25;
                                                        f22 = f26;
                                                        i5 = i7;
                                                        f25 = f42;
                                                    } else if (c4 == 'l') {
                                                        int i18 = i7 + 1;
                                                        path2.rLineTo(fArr2[i7], fArr2[i18]);
                                                        f25 += fArr2[i7];
                                                        f12 = fArr2[i18];
                                                    } else if (c4 == 'm') {
                                                        float f43 = fArr2[i7];
                                                        f25 += f43;
                                                        float f44 = fArr2[i7 + 1];
                                                        f26 += f44;
                                                        if (i7 > 0) {
                                                            path2.rLineTo(f43, f44);
                                                        } else {
                                                            path2.rMoveTo(f43, f44);
                                                            f27 = f25;
                                                        }
                                                    } else if (c4 == 's') {
                                                        if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                                            f15 = f26 - f22;
                                                            f16 = f25 - f21;
                                                        } else {
                                                            f16 = 0.0f;
                                                            f15 = 0.0f;
                                                        }
                                                        int i19 = i7 + 1;
                                                        int i20 = i7 + 2;
                                                        int i21 = i7 + 3;
                                                        path2.rCubicTo(f16, f15, fArr2[i7], fArr2[i19], fArr2[i20], fArr2[i21]);
                                                        f9 = fArr2[i7] + f25;
                                                        f10 = fArr2[i19] + f26;
                                                        f25 += fArr2[i20];
                                                        f11 = fArr2[i21];
                                                    } else if (c4 == 't') {
                                                        if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                                            f17 = f25 - f21;
                                                            f18 = f26 - f22;
                                                        } else {
                                                            f18 = 0.0f;
                                                            f17 = 0.0f;
                                                        }
                                                        int i22 = i7 + 1;
                                                        path2.rQuadTo(f17, f18, fArr2[i7], fArr2[i22]);
                                                        float f45 = f17 + f25;
                                                        float f46 = f18 + f26;
                                                        f25 += fArr2[i7];
                                                        f26 += fArr2[i22];
                                                        f22 = f46;
                                                        f21 = f45;
                                                    }
                                                } else {
                                                    c6 = c8;
                                                    f13 = fArr2[i7];
                                                    f14 = fArr2[i7 + 1];
                                                    if (i7 > 0) {
                                                        path2.lineTo(f13, f14);
                                                    } else {
                                                        path2.moveTo(f13, f14);
                                                        f25 = f13;
                                                        f27 = f25;
                                                        f26 = f14;
                                                    }
                                                }
                                                f28 = f26;
                                            } else {
                                                c6 = c8;
                                                int i23 = i7 + 1;
                                                path2.lineTo(fArr2[i7], fArr2[i23]);
                                                f13 = fArr2[i7];
                                                f14 = fArr2[i23];
                                            }
                                            f25 = f13;
                                            f26 = f14;
                                        } else {
                                            c6 = c8;
                                            path2.rLineTo(0.0f, fArr2[i7]);
                                            f12 = fArr2[i7];
                                        }
                                        f26 += f12;
                                    } else {
                                        c5 = c7;
                                        c6 = c8;
                                        int i24 = i7 + 1;
                                        int i25 = i7 + 2;
                                        int i26 = i7 + 3;
                                        path2.rQuadTo(fArr2[i7], fArr2[i24], fArr2[i25], fArr2[i26]);
                                        f9 = fArr2[i7] + f25;
                                        f10 = fArr2[i24] + f26;
                                        f25 += fArr2[i25];
                                        f11 = fArr2[i26];
                                    }
                                    f26 += f11;
                                    f21 = f9;
                                    f22 = f10;
                                } else {
                                    c5 = c7;
                                    c6 = c8;
                                    path2.rLineTo(fArr2[i7], 0.0f);
                                    f25 += fArr2[i7];
                                }
                            } else {
                                z3 = z7;
                                c5 = c7;
                                c6 = c8;
                                int i27 = i7 + 2;
                                int i28 = i7 + 3;
                                int i29 = i7 + 4;
                                int i30 = i7 + 5;
                                path2.rCubicTo(fArr2[i7], fArr2[i7 + 1], fArr2[i27], fArr2[i28], fArr2[i29], fArr2[i30]);
                                float f47 = fArr2[i27] + f25;
                                float f48 = fArr2[i28] + f26;
                                f25 += fArr2[i29];
                                f26 += fArr2[i30];
                                f21 = f47;
                                f22 = f48;
                            }
                            i5 = i7;
                        } else {
                            z3 = z7;
                            c5 = c7;
                            c6 = c8;
                            int i31 = i7 + 5;
                            float f49 = fArr2[i31] + f25;
                            int i32 = i7 + 6;
                            float f50 = fArr2[i32] + f26;
                            float f51 = fArr2[i7];
                            float f53 = fArr2[i7 + 1];
                            float f54 = fArr2[i7 + 2];
                            if (fArr2[i7 + 3] != 0.0f) {
                                f7 = 0.0f;
                                f8 = f26;
                                z5 = z3;
                            } else {
                                f7 = 0.0f;
                                f8 = f26;
                                z5 = z2;
                            }
                            i5 = i7;
                            boolean z9 = fArr2[i7 + 4] != f7 ? z3 : z2;
                            float f55 = f25;
                            Uo(path, f55, f8, f49, f50, f51, f53, f54, z5, z9);
                            f25 = f55 + fArr2[i31];
                            f26 = f8 + fArr2[i32];
                            f21 = f25;
                            f22 = f26;
                        }
                        f26 = f6;
                    } else {
                        z2 = z6;
                        z3 = z7;
                        c5 = c7;
                        c6 = c8;
                        i5 = i7;
                        int i33 = i5 + 1;
                        int i34 = i5 + 2;
                        int i35 = i5 + 3;
                        path2.quadTo(fArr2[i5], fArr2[i33], fArr2[i34], fArr2[i35]);
                        f4 = fArr2[i5];
                        f5 = fArr2[i33];
                        f25 = fArr2[i34];
                        f26 = fArr2[i35];
                    }
                    f21 = f4;
                    f22 = f5;
                } else {
                    z2 = z6;
                    z3 = z7;
                    c5 = c7;
                    c6 = c8;
                    i5 = i7;
                    path2.lineTo(fArr2[i5], f26);
                    f25 = fArr2[i5];
                }
                i7 = i5 + i3;
                path2 = path;
                c9 = c4;
                z6 = z2;
                z7 = z3;
                c7 = c5;
                c8 = c6;
            }
            fArr[z6 ? 1 : 0] = f25;
            fArr[z7 ? 1 : 0] = f26;
            fArr[c7] = f21;
            fArr[c8] = f22;
            fArr[4] = f27;
            fArr[5] = f28;
        }

        private static void Uo(Path path, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean z2, boolean z3) {
            double d2;
            double d4;
            double radians = Math.toRadians(f9);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d5 = f3;
            double d6 = f4;
            double d7 = f7;
            double d8 = ((d5 * dCos) + (d6 * dSin)) / d7;
            double d9 = f8;
            double d10 = ((((double) (-f3)) * dSin) + (d6 * dCos)) / d9;
            double d11 = f6;
            double d12 = ((((double) f5) * dCos) + (d11 * dSin)) / d7;
            double d13 = ((((double) (-f5)) * dSin) + (d11 * dCos)) / d9;
            double d14 = d8 - d12;
            double d15 = d10 - d13;
            double d16 = (d8 + d12) / 2.0d;
            double d17 = (d10 + d13) / 2.0d;
            double d18 = (d14 * d14) + (d15 * d15);
            if (d18 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d19 = (1.0d / d18) - 0.25d;
            if (d19 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d18);
                float fSqrt = (float) (Math.sqrt(d18) / 1.99999d);
                Uo(path, f3, f4, f5, f6, f7 * fSqrt, fSqrt * f8, f9, z2, z3);
                return;
            }
            double dSqrt = Math.sqrt(d19);
            double d20 = d14 * dSqrt;
            double d21 = dSqrt * d15;
            if (z2 == z3) {
                d2 = d16 - d21;
                d4 = d17 + d20;
            } else {
                d2 = d16 + d21;
                d4 = d17 - d20;
            }
            double dAtan2 = Math.atan2(d10 - d4, d8 - d2);
            double dAtan22 = Math.atan2(d13 - d4, d12 - d2) - dAtan2;
            if (z3 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d22 = d2 * d7;
            double d23 = d4 * d9;
            J2(path, (d22 * dCos) - (d23 * dSin), (d22 * dSin) + (d23 * dCos), d7, d9, d5, d6, radians, dAtan2, dAtan22);
        }

        public void KN(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f3) {
            this.f36414n = pathDataNode.f36414n;
            int i2 = 0;
            while (true) {
                float[] fArr = pathDataNode.rl;
                if (i2 >= fArr.length) {
                    return;
                }
                this.rl[i2] = (fArr[i2] * (1.0f - f3)) + (pathDataNode2.rl[i2] * f3);
                i2++;
            }
        }

        public static void xMQ(PathDataNode[] pathDataNodeArr, Path path) {
            PathParser.mUb(pathDataNodeArr, path);
        }

        PathDataNode(PathDataNode pathDataNode) {
            this.f36414n = pathDataNode.f36414n;
            float[] fArr = pathDataNode.rl;
            this.rl = PathParser.t(fArr, 0, fArr.length);
        }
    }

    public static PathDataNode[] J2(PathDataNode[] pathDataNodeArr) {
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
            pathDataNodeArr2[i2] = new PathDataNode(pathDataNodeArr[i2]);
        }
        return pathDataNodeArr2;
    }

    private static float[] KN(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult();
            int length = str.length();
            int i2 = 1;
            int i3 = 0;
            while (i2 < length) {
                Uo(str, i2, extractFloatResult);
                int i5 = extractFloatResult.f36413n;
                if (i2 < i5) {
                    fArr[i3] = Float.parseFloat(str.substring(i2, i5));
                    i3++;
                }
                i2 = extractFloatResult.rl ? i5 : i5 + 1;
            }
            return t(fArr, 0, i3);
        } catch (NumberFormatException e2) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[LOOP:0: B:3:0x0007->B:24:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Uo(String str, int i2, ExtractFloatResult extractFloatResult) {
        extractFloatResult.rl = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (int i3 = i2; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == ' ') {
                z2 = false;
                z4 = true;
                if (z4) {
                }
            } else {
                if (cCharAt != 'E' && cCharAt != 'e') {
                    switch (cCharAt) {
                        case ',':
                            break;
                        case '-':
                            if (i3 == i2 || z2) {
                                z2 = false;
                            } else {
                                extractFloatResult.rl = true;
                                z2 = false;
                                z4 = true;
                            }
                            break;
                        case '.':
                            if (z3) {
                                extractFloatResult.rl = true;
                                z2 = false;
                                z4 = true;
                            } else {
                                z2 = false;
                                z3 = true;
                            }
                            break;
                        default:
                            z2 = false;
                            break;
                    }
                } else {
                    z2 = true;
                }
                if (z4) {
                }
            }
            extractFloatResult.f36413n = i3;
        }
        extractFloatResult.f36413n = i3;
    }

    public static void gh(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i2 = 0; i2 < pathDataNodeArr2.length; i2++) {
            pathDataNodeArr[i2].f36414n = pathDataNodeArr2[i2].f36414n;
            for (int i3 = 0; i3 < pathDataNodeArr2[i2].rl.length; i3++) {
                pathDataNodeArr[i2].rl[i3] = pathDataNodeArr2[i2].rl[i3];
            }
        }
    }

    public static void mUb(PathDataNode[] pathDataNodeArr, Path path) {
        float[] fArr = new float[6];
        char c2 = 'm';
        for (PathDataNode pathDataNode : pathDataNodeArr) {
            PathDataNode.O(path, fArr, c2, pathDataNode.f36414n, pathDataNode.rl);
            c2 = pathDataNode.f36414n;
        }
    }

    public static boolean rl(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
            if (pathDataNodeArr[i2].f36414n != pathDataNodeArr2[i2].f36414n || pathDataNodeArr[i2].rl.length != pathDataNodeArr2[i2].rl.length) {
                return false;
            }
        }
        return true;
    }

    private static class ExtractFloatResult {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f36413n;
        boolean rl;

        ExtractFloatResult() {
        }
    }

    public static Path O(String str) {
        Path path = new Path();
        try {
            PathDataNode.xMQ(nr(str), path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing " + str, e2);
        }
    }

    private static void n(ArrayList arrayList, char c2, float[] fArr) {
        arrayList.add(new PathDataNode(c2, fArr));
    }

    public static PathDataNode[] nr(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 1;
        while (i3 < str.length()) {
            int iXMQ = xMQ(str, i3);
            String strTrim = str.substring(i2, iXMQ).trim();
            if (!strTrim.isEmpty()) {
                n(arrayList, strTrim.charAt(0), KN(strTrim));
            }
            i2 = iXMQ;
            i3 = iXMQ + 1;
        }
        if (i3 - i2 == 1 && i2 < str.length()) {
            n(arrayList, str.charAt(i2), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[0]);
    }

    static float[] t(float[] fArr, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i2 < 0 || i2 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i5 = i3 - i2;
        int iMin = Math.min(i5, length - i2);
        float[] fArr2 = new float[i5];
        System.arraycopy(fArr, i2, fArr2, 0, iMin);
        return fArr2;
    }

    private static int xMQ(String str, int i2) {
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                break;
            }
            i2++;
        }
        return i2;
    }
}
