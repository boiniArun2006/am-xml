package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\u001a;\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\n\u0010\t\u001a\u0019\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\u00072\b\b\u0001\u0010\u0001\u001a\u00020\u000b2\b\b\u0001\u0010\u0002\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u000b2\b\b\u0003\u0010\u0004\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a,\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001e\u0010\u001a\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0016\u0010\u001c\u001a\u00020\u0000*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0016\u0010\u001e\u001a\u00020\u000b*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"", "red", "green", "blue", "alpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "Landroidx/compose/ui/graphics/Color;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "J2", "", TtmlNode.ATTR_TTS_COLOR, "rl", "(I)J", "", "nr", "(J)J", "t", "(IIII)J", TtmlNode.START, "stop", "fraction", "KN", "(JJF)J", "background", "Uo", "(JJ)J", "xMQ", "(J)F", "mUb", "(J)I", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n+ 4 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n*L\n1#1,659:1\n583#1:988\n583#1:989\n583#1:990\n635#1:1006\n65#2,10:660\n65#2,10:670\n65#2,10:680\n65#2,10:690\n65#2,10:710\n65#2,10:758\n65#2,10:806\n65#2,10:854\n65#2,10:978\n65#2,10:996\n33#3,5:700\n33#3,5:705\n33#3,5:991\n535#4,38:720\n535#4,38:768\n535#4,38:816\n535#4,38:864\n535#4,38:902\n535#4,38:940\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n568#1:988\n569#1:989\n570#1:990\n646#1:1006\n387#1:660,10\n388#1:670,10\n389#1:680,10\n390#1:690,10\n403#1:710,10\n404#1:758,10\n405#1:806,10\n406#1:854,10\n537#1:978,10\n617#1:996,10\n394#1:700,5\n399#1:705,5\n607#1:991,5\n403#1:720,38\n404#1:768,38\n405#1:816,38\n441#1:864,38\n442#1:902,38\n443#1:940,38\n*E\n"})
public final class ColorKt {
    public static final long rl(int i2) {
        return Color.mUb(ULong.m487constructorimpl(ULong.m487constructorimpl(i2) << 32));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long J2(float f3, float f4, float f5, float f6, ColorSpace colorSpace) {
        int i2;
        int i3;
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        if (colorSpace.getIsSrgb()) {
            return Color.mUb(ULong.m487constructorimpl(ULong.m487constructorimpl((((((int) ((f6 * 255.0f) + 0.5f)) << 24) | (((int) ((f3 * 255.0f) + 0.5f)) << 16)) | (((int) ((f4 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f5) + 0.5f))) << 32));
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(f3);
        int i13 = iFloatToRawIntBits >>> 31;
        int i14 = (iFloatToRawIntBits >>> 23) & 255;
        int i15 = iFloatToRawIntBits & 8388607;
        int i16 = 49;
        int i17 = 0;
        if (i14 == 255) {
            i3 = i15 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i14 - 112;
            if (i2 >= 31) {
                i2 = 49;
                i3 = 0;
            } else if (i2 > 0) {
                int i18 = i15 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i5 = (((i2 << 10) | i18) + 1) | (i13 << 15);
                    short s2 = (short) i5;
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                    int i19 = iFloatToRawIntBits2 >>> 31;
                    i7 = (iFloatToRawIntBits2 >>> 23) & 255;
                    int i20 = iFloatToRawIntBits2 & 8388607;
                    if (i7 != 255) {
                        i9 = i20 != 0 ? 512 : 0;
                        i8 = 31;
                    } else {
                        i8 = i7 - 112;
                        if (i8 >= 31) {
                            i8 = 49;
                            i9 = 0;
                        } else if (i8 > 0) {
                            int i21 = i20 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i10 = (((i8 << 10) | i21) + 1) | (i19 << 15);
                                short s3 = (short) i10;
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(f5);
                                int i22 = iFloatToRawIntBits3 >>> 31;
                                i11 = (iFloatToRawIntBits3 >>> 23) & 255;
                                int i23 = 8388607 & iFloatToRawIntBits3;
                                if (i11 != 255) {
                                    int i24 = i11 - 112;
                                    if (i24 < 31) {
                                        if (i24 > 0) {
                                            i17 = i23 >> 13;
                                            if ((iFloatToRawIntBits3 & 4096) != 0) {
                                                i12 = (((i24 << 10) | i17) + 1) | (i22 << 15);
                                            } else {
                                                i16 = i24;
                                            }
                                        } else if (i24 >= -10) {
                                            int i25 = (i23 | 8388608) >> (1 - i24);
                                            if ((i25 & 4096) != 0) {
                                                i25 += 8192;
                                            }
                                            i16 = 0;
                                            i17 = i25 >> 13;
                                        } else {
                                            i16 = 0;
                                        }
                                    }
                                    return Color.mUb(ULong.m487constructorimpl(((((long) ((short) i12)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) colorSpace.getId()) & 63)));
                                }
                                i17 = i23 == 0 ? 0 : 512;
                                i16 = 31;
                                i12 = (i22 << 15) | (i16 << 10) | i17;
                                return Color.mUb(ULong.m487constructorimpl(((((long) ((short) i12)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) colorSpace.getId()) & 63)));
                            }
                            i9 = i21;
                        } else if (i8 >= -10) {
                            int i26 = (i20 | 8388608) >> (1 - i8);
                            if ((i26 & 4096) != 0) {
                                i26 += 8192;
                            }
                            i9 = i26 >> 13;
                            i8 = 0;
                        } else {
                            i9 = 0;
                            i8 = 0;
                        }
                    }
                    i10 = i9 | (i19 << 15) | (i8 << 10);
                    short s32 = (short) i10;
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(f5);
                    int i222 = iFloatToRawIntBits32 >>> 31;
                    i11 = (iFloatToRawIntBits32 >>> 23) & 255;
                    int i232 = 8388607 & iFloatToRawIntBits32;
                    if (i11 != 255) {
                    }
                    i12 = (i222 << 15) | (i16 << 10) | i17;
                    return Color.mUb(ULong.m487constructorimpl(((((long) ((short) i12)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s32) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) colorSpace.getId()) & 63)));
                }
                i3 = i18;
            } else if (i2 >= -10) {
                int i27 = (i15 | 8388608) >> (1 - i2);
                if ((i27 & 4096) != 0) {
                    i27 += 8192;
                }
                i3 = i27 >> 13;
                i2 = 0;
            } else {
                i3 = 0;
                i2 = 0;
            }
        }
        i5 = i3 | (i13 << 15) | (i2 << 10);
        short s22 = (short) i5;
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(f4);
        int i192 = iFloatToRawIntBits22 >>> 31;
        i7 = (iFloatToRawIntBits22 >>> 23) & 255;
        int i202 = iFloatToRawIntBits22 & 8388607;
        if (i7 != 255) {
        }
        i10 = i9 | (i192 << 15) | (i8 << 10);
        short s322 = (short) i10;
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(f5);
        int i2222 = iFloatToRawIntBits322 >>> 31;
        i11 = (iFloatToRawIntBits322 >>> 23) & 255;
        int i2322 = 8388607 & iFloatToRawIntBits322;
        if (i11 != 255) {
        }
        i12 = (i2222 << 15) | (i16 << 10) | i17;
        return Color.mUb(ULong.m487constructorimpl(((((long) ((short) i12)) & 65535) << 16) | ((((long) s22) & 65535) << 48) | ((((long) s322) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) colorSpace.getId()) & 63)));
    }

    public static final long KN(long j2, long j3, float f3) {
        ColorSpace colorSpaceFD = ColorSpaces.f31604n.fD();
        long jGh = Color.gh(j2, colorSpaceFD);
        long jGh2 = Color.gh(j3, colorSpaceFD);
        float fCk = Color.ck(jGh);
        float fZ = Color.Z(jGh);
        float fO = Color.o(jGh);
        float fIk = Color.Ik(jGh);
        float fCk2 = Color.ck(jGh2);
        float fZ2 = Color.Z(jGh2);
        float fO2 = Color.o(jGh2);
        float fIk2 = Color.Ik(jGh2);
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        return Color.gh(J2(MathHelpersKt.rl(fZ, fZ2, f3), MathHelpersKt.rl(fO, fO2, f3), MathHelpersKt.rl(fIk, fIk2, f3), MathHelpersKt.rl(fCk, fCk2, f3), colorSpaceFD), Color.r(j3));
    }

    public static /* synthetic */ long O(int i2, int i3, int i5, int i7, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            i7 = 255;
        }
        return t(i2, i3, i5, i7);
    }

    public static final int mUb(long j2) {
        return (int) ULong.m487constructorimpl(Color.gh(j2, ColorSpaces.f31604n.X()) >>> 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long n(float f3, float f4, float f5, float f6, ColorSpace colorSpace) {
        int i2;
        int i3;
        int i5;
        float fJ2;
        float fO;
        int i7;
        int i8;
        int i9;
        int i10;
        float fJ22;
        float fO2;
        int i11;
        int i12;
        int i13;
        if (colorSpace.getIsSrgb()) {
            float f7 = f6 < 0.0f ? 0.0f : f6;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i14 = ((int) ((f7 * 255.0f) + 0.5f)) << 24;
            float f8 = f3 < 0.0f ? 0.0f : f3;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i15 = i14 | (((int) ((f8 * 255.0f) + 0.5f)) << 16);
            float f9 = f4 < 0.0f ? 0.0f : f4;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i16 = i15 | (((int) ((f9 * 255.0f) + 0.5f)) << 8);
            return Color.mUb(ULong.m487constructorimpl(ULong.m487constructorimpl(i16 | ((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r5 : 1.0f) * 255.0f) + 0.5f))) << 32));
        }
        if (!(colorSpace.t() == 3)) {
            InlineClassHelperKt.n("Color only works with ColorSpaces with 3 components");
        }
        int id = colorSpace.getId();
        if (!(id != -1)) {
            InlineClassHelperKt.n("Unknown color space, please use a color space in ColorSpaces");
        }
        float fJ23 = colorSpace.J2(0);
        float fO3 = colorSpace.O(0);
        if (f3 >= fJ23) {
            fJ23 = f3;
        }
        if (fJ23 <= fO3) {
            fO3 = fJ23;
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(fO3);
        int i17 = iFloatToRawIntBits >>> 31;
        int i18 = (iFloatToRawIntBits >>> 23) & 255;
        int i19 = iFloatToRawIntBits & 8388607;
        if (i18 == 255) {
            i3 = i19 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i18 - 112;
            if (i2 >= 31) {
                i3 = 0;
                i2 = 49;
            } else if (i2 > 0) {
                int i20 = i19 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i5 = (((i2 << 10) | i20) + 1) | (i17 << 15);
                    short s2 = (short) i5;
                    fJ2 = colorSpace.J2(1);
                    fO = colorSpace.O(1);
                    if (f4 >= fJ2) {
                        fJ2 = f4;
                    }
                    if (fJ2 <= fO) {
                        fO = fJ2;
                    }
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(fO);
                    int i21 = iFloatToRawIntBits2 >>> 31;
                    i7 = (iFloatToRawIntBits2 >>> 23) & 255;
                    int i22 = iFloatToRawIntBits2 & 8388607;
                    if (i7 != 255) {
                        i9 = i22 != 0 ? 512 : 0;
                        i8 = 31;
                    } else {
                        i8 = i7 - 112;
                        if (i8 >= 31) {
                            i9 = 0;
                            i8 = 49;
                        } else if (i8 > 0) {
                            int i23 = i22 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i10 = (((i8 << 10) | i23) + 1) | (i21 << 15);
                                short s3 = (short) i10;
                                fJ22 = colorSpace.J2(2);
                                fO2 = colorSpace.O(2);
                                if (f5 >= fJ22) {
                                    fJ22 = f5;
                                }
                                if (fJ22 <= fO2) {
                                    fO2 = fJ22;
                                }
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(fO2);
                                int i24 = iFloatToRawIntBits3 >>> 31;
                                i11 = (iFloatToRawIntBits3 >>> 23) & 255;
                                int i25 = 8388607 & iFloatToRawIntBits3;
                                if (i11 == 255) {
                                    i12 = i25 != 0 ? 512 : 0;
                                    i = 31;
                                } else {
                                    int i26 = i11 - 112;
                                    if (i26 >= 31) {
                                        i12 = 0;
                                        i = 49;
                                    } else if (i26 > 0) {
                                        int i27 = i25 >> 13;
                                        if ((iFloatToRawIntBits3 & 4096) != 0) {
                                            i13 = (((i26 << 10) | i27) + 1) | (i24 << 15);
                                            short s4 = (short) i13;
                                            float f10 = f6 >= 0.0f ? f6 : 0.0f;
                                            return Color.mUb(ULong.m487constructorimpl((((long) id) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((65535 & ((long) s4)) << 16) | ((((long) ((int) (((f10 <= 1.0f ? f10 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                                        }
                                        i12 = i27;
                                        i = i26;
                                    } else if (i26 >= -10) {
                                        int i28 = (i25 | 8388608) >> (1 - i26);
                                        if ((i28 & 4096) != 0) {
                                            i28 += 8192;
                                        }
                                        i12 = i28 >> 13;
                                    } else {
                                        i12 = 0;
                                    }
                                }
                                i13 = i12 | (i24 << 15) | (i << 10);
                                short s42 = (short) i13;
                                if (f6 >= 0.0f) {
                                }
                                return Color.mUb(ULong.m487constructorimpl((((long) id) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((65535 & ((long) s42)) << 16) | ((((long) ((int) (((f10 <= 1.0f ? f10 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                            }
                            i9 = i23;
                        } else if (i8 >= -10) {
                            int i29 = (i22 | 8388608) >> (1 - i8);
                            if ((i29 & 4096) != 0) {
                                i29 += 8192;
                            }
                            i9 = i29 >> 13;
                            i8 = 0;
                        } else {
                            i9 = 0;
                            i8 = 0;
                        }
                    }
                    i10 = i9 | (i21 << 15) | (i8 << 10);
                    short s32 = (short) i10;
                    fJ22 = colorSpace.J2(2);
                    fO2 = colorSpace.O(2);
                    if (f5 >= fJ22) {
                    }
                    if (fJ22 <= fO2) {
                    }
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(fO2);
                    int i242 = iFloatToRawIntBits32 >>> 31;
                    i11 = (iFloatToRawIntBits32 >>> 23) & 255;
                    int i252 = 8388607 & iFloatToRawIntBits32;
                    if (i11 == 255) {
                    }
                    i13 = i12 | (i242 << 15) | (i << 10);
                    short s422 = (short) i13;
                    if (f6 >= 0.0f) {
                    }
                    return Color.mUb(ULong.m487constructorimpl((((long) id) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s32) & 65535) << 32) | ((65535 & ((long) s422)) << 16) | ((((long) ((int) (((f10 <= 1.0f ? f10 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                }
                i3 = i20;
            } else if (i2 >= -10) {
                int i30 = (i19 | 8388608) >> (1 - i2);
                if ((i30 & 4096) != 0) {
                    i30 += 8192;
                }
                i3 = i30 >> 13;
                i2 = 0;
            } else {
                i3 = 0;
                i2 = 0;
            }
        }
        i5 = i3 | (i17 << 15) | (i2 << 10);
        short s22 = (short) i5;
        fJ2 = colorSpace.J2(1);
        fO = colorSpace.O(1);
        if (f4 >= fJ2) {
        }
        if (fJ2 <= fO) {
        }
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(fO);
        int i212 = iFloatToRawIntBits22 >>> 31;
        i7 = (iFloatToRawIntBits22 >>> 23) & 255;
        int i222 = iFloatToRawIntBits22 & 8388607;
        if (i7 != 255) {
        }
        i10 = i9 | (i212 << 15) | (i8 << 10);
        short s322 = (short) i10;
        fJ22 = colorSpace.J2(2);
        fO2 = colorSpace.O(2);
        if (f5 >= fJ22) {
        }
        if (fJ22 <= fO2) {
        }
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(fO2);
        int i2422 = iFloatToRawIntBits322 >>> 31;
        i11 = (iFloatToRawIntBits322 >>> 23) & 255;
        int i2522 = 8388607 & iFloatToRawIntBits322;
        if (i11 == 255) {
        }
        i13 = i12 | (i2422 << 15) | (i << 10);
        short s4222 = (short) i13;
        if (f6 >= 0.0f) {
        }
        return Color.mUb(ULong.m487constructorimpl((((long) id) & 63) | ((((long) s22) & 65535) << 48) | ((((long) s322) & 65535) << 32) | ((65535 & ((long) s4222)) << 16) | ((((long) ((int) (((f10 <= 1.0f ? f10 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
    }

    public static final long nr(long j2) {
        return Color.mUb(ULong.m487constructorimpl(j2 << 32));
    }

    public static final long t(int i2, int i3, int i5, int i7) {
        return rl(((i2 & 255) << 16) | ((i7 & 255) << 24) | ((i3 & 255) << 8) | (i5 & 255));
    }

    public static final long Uo(long j2, long j3) {
        float f3;
        float f4;
        long jGh = Color.gh(j2, Color.r(j3));
        float fCk = Color.ck(j3);
        float fCk2 = Color.ck(jGh);
        float f5 = 1.0f - fCk2;
        float f6 = (fCk * f5) + fCk2;
        float fZ = Color.Z(jGh);
        float fZ2 = Color.Z(j3);
        float f7 = 0.0f;
        if (f6 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = ((fZ * fCk2) + ((fZ2 * fCk) * f5)) / f6;
        }
        float fO = Color.o(jGh);
        float fO2 = Color.o(j3);
        if (f6 == 0.0f) {
            f4 = 0.0f;
        } else {
            f4 = ((fO * fCk2) + ((fO2 * fCk) * f5)) / f6;
        }
        float fIk = Color.Ik(jGh);
        float fIk2 = Color.Ik(j3);
        if (f6 != 0.0f) {
            f7 = ((fIk * fCk2) + ((fIk2 * fCk) * f5)) / f6;
        }
        return J2(f3, f4, f7, f6, Color.r(j3));
    }

    public static final float xMQ(long j2) {
        ColorSpace colorSpaceR = Color.r(j2);
        if (!ColorModel.J2(colorSpaceR.getModel(), ColorModel.INSTANCE.rl())) {
            InlineClassHelperKt.n("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.xMQ(colorSpaceR.getModel())));
        }
        Intrinsics.checkNotNull(colorSpaceR, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DoubleFunction eotfFunc = ((Rgb) colorSpaceR).getEotfFunc();
        float fN = (float) ((eotfFunc.n(Color.Z(j2)) * 0.2126d) + (eotfFunc.n(Color.o(j2)) * 0.7152d) + (eotfFunc.n(Color.Ik(j2)) * 0.0722d));
        if (fN < 0.0f) {
            fN = 0.0f;
        }
        if (fN > 1.0f) {
            return 1.0f;
        }
        return fN;
    }
}
