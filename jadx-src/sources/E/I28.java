package E;

import Dj7.CM;
import androidx.compose.foundation.ImageKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class I28 {

    static final class j implements Function2 {
        final /* synthetic */ long J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f2116O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Integer f2117n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f2118o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f2119r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f2120t;

        j(Integer num, String str, boolean z2, long j2, long j3, String str2) {
            this.f2117n = num;
            this.f2120t = str;
            this.f2116O = z2;
            this.J2 = j2;
            this.f2119r = j3;
            this.f2118o = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1876128267, i2, -1, "com.alightcreative.template.importpreview.ui.components.TemplateHeaderButton.<anonymous> (TemplateHeaderButton.kt:35)");
            }
            composer.eF(1773727742);
            Integer num = this.f2117n;
            if (num != null) {
                ImageKt.n(PainterResources_androidKt.t(num.intValue(), composer, 0), this.f2120t, null, null, ContentScale.INSTANCE.O(), 0.0f, ColorFilter.Companion.rl(ColorFilter.INSTANCE, this.f2116O ? this.J2 : this.f2119r, 0, 2, null), composer, 24576, 44);
            }
            composer.Xw();
            String str = this.f2118o;
            if (str != null) {
                CM.S(str, H9N.j.f3810n.rl(composer, 6).rV9(), null, 0L, null, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0, false, 0, null, composer, 0, 0, 1980);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Modifier modifier, final Function0 onClicked, String str, Integer num, String str2, boolean z2, long j2, long j3, Composer composer, final int i2, final int i3) {
        int i5;
        String str3;
        int i7;
        Integer num2;
        int i8;
        String str4;
        int i9;
        boolean z3;
        int i10;
        long jEF;
        int i11;
        int i12;
        int i13;
        int i14;
        final boolean z4;
        final String str5;
        final Integer num3;
        final String str6;
        final long j4;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onClicked, "onClicked");
        Composer composerKN = composer.KN(-272649252);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(onClicked) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                str3 = str;
                i5 |= composerKN.p5(str3) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    num2 = num;
                    i5 |= composerKN.p5(num2) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        str4 = str2;
                        i5 |= composerKN.p5(str4) ? 16384 : 8192;
                    }
                    i9 = i3 & 32;
                    if (i9 != 0) {
                        if ((196608 & i2) == 0) {
                            z3 = z2;
                            i5 |= composerKN.n(z3) ? 131072 : 65536;
                        }
                        i10 = i3 & 64;
                        if (i10 != 0) {
                            i11 = i5 | 1572864;
                            jEF = j2;
                        } else {
                            int i16 = i5;
                            jEF = j2;
                            if ((i2 & 1572864) == 0) {
                                i11 = i16 | (composerKN.nr(jEF) ? 1048576 : 524288);
                            } else {
                                i11 = i16;
                            }
                        }
                        i12 = i3 & 128;
                        if (i12 != 0) {
                            i11 |= 12582912;
                            i13 = i12;
                        } else if ((i2 & 12582912) == 0) {
                            i13 = i12;
                            i11 |= composerKN.nr(j3) ? 8388608 : 4194304;
                        } else {
                            i13 = i12;
                        }
                        i14 = i11;
                        if ((4793491 & i14) == 4793490 && composerKN.xMQ()) {
                            composerKN.wTp();
                            num3 = num2;
                            j4 = jEF;
                            str5 = str3;
                            str6 = str4;
                            z4 = z3;
                            j5 = j3;
                        } else {
                            if (i15 != 0) {
                                str3 = null;
                            }
                            if (i7 != 0) {
                                num2 = null;
                            }
                            if (i8 != 0) {
                                str4 = null;
                            }
                            boolean z5 = i9 == 0 ? true : z3;
                            if (i10 != 0) {
                                jEF = aD.w6.EF();
                            }
                            long jUo = i13 == 0 ? Color.INSTANCE.Uo() : j3;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-272649252, i14, -1, "com.alightcreative.template.importpreview.ui.components.TemplateHeaderButton (TemplateHeaderButton.kt:26)");
                            }
                            String str7 = str3;
                            long j6 = jEF;
                            Integer num4 = num2;
                            String str8 = str4;
                            long j7 = jUo;
                            SurfaceKt.rl(onClicked, modifier, z5, null, Color.INSTANCE.J2(), !z5 ? jEF : jUo, null, Dp.KN(0), null, ComposableLambdaKt.nr(-1876128267, true, new j(num4, str8, z5, j6, j7, str7), composerKN, 54), composerKN, ((i14 >> 3) & 14) | 817913856 | ((i14 << 3) & 112) | ((i14 >> 9) & 896), 328);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            z4 = z5;
                            str5 = str7;
                            num3 = num4;
                            str6 = str8;
                            j4 = j6;
                            j5 = j7;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2() { // from class: E.Ml
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return I28.t(modifier, onClicked, str5, num3, str6, z4, j4, j5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 196608;
                    z3 = z2;
                    i10 = i3 & 64;
                    if (i10 != 0) {
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                    }
                    i14 = i11;
                    if ((4793491 & i14) == 4793490) {
                        if (i15 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (ComposerKt.v()) {
                        }
                        String str72 = str3;
                        long j62 = jEF;
                        Integer num42 = num2;
                        String str82 = str4;
                        long j72 = jUo;
                        SurfaceKt.rl(onClicked, modifier, z5, null, Color.INSTANCE.J2(), !z5 ? jEF : jUo, null, Dp.KN(0), null, ComposableLambdaKt.nr(-1876128267, true, new j(num42, str82, z5, j62, j72, str72), composerKN, 54), composerKN, ((i14 >> 3) & 14) | 817913856 | ((i14 << 3) & 112) | ((i14 >> 9) & 896), 328);
                        if (ComposerKt.v()) {
                        }
                        z4 = z5;
                        str5 = str72;
                        num3 = num42;
                        str6 = str82;
                        j4 = j62;
                        j5 = j72;
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                str4 = str2;
                i9 = i3 & 32;
                if (i9 != 0) {
                }
                z3 = z2;
                i10 = i3 & 64;
                if (i10 != 0) {
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                }
                i14 = i11;
                if ((4793491 & i14) == 4793490) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            num2 = num;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            str4 = str2;
            i9 = i3 & 32;
            if (i9 != 0) {
            }
            z3 = z2;
            i10 = i3 & 64;
            if (i10 != 0) {
            }
            i12 = i3 & 128;
            if (i12 != 0) {
            }
            i14 = i11;
            if ((4793491 & i14) == 4793490) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        str3 = str;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        num2 = num;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        str4 = str2;
        i9 = i3 & 32;
        if (i9 != 0) {
        }
        z3 = z2;
        i10 = i3 & 64;
        if (i10 != 0) {
        }
        i12 = i3 & 128;
        if (i12 != 0) {
        }
        i14 = i11;
        if ((4793491 & i14) == 4793490) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Modifier modifier, Function0 function0, String str, Integer num, String str2, boolean z2, long j2, long j3, int i2, int i3, Composer composer, int i5) {
        rl(modifier, function0, str, num, str2, z2, j2, j3, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }
}
