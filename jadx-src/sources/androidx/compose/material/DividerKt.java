package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a:\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/unit/Dp;", "thickness", "startIndent", "", c.f62177j, "(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Divider.kt\nandroidx/compose/material/DividerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,69:1\n149#2:70\n149#2:71\n169#2:73\n75#3:72\n*S KotlinDebug\n*F\n+ 1 Divider.kt\nandroidx/compose/material/DividerKt\n*L\n50#1:70\n51#1:71\n61#1:73\n61#1:72\n*E\n"})
public final class DividerKt {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(Modifier modifier, long j2, float f3, float f4, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        long jAz;
        float fKN;
        int i7;
        float f5;
        Modifier modifier3;
        final float f6;
        ScopeUpdateScope scopeUpdateScopeGh;
        float fKN2;
        float fKN3;
        Composer composerKN = composer.KN(-1249392198);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            jAz = j2;
            i5 |= ((i3 & 2) == 0 && composerKN.nr(jAz)) ? 32 : 16;
        } else {
            jAz = j2;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                fKN = f3;
                i5 |= composerKN.rl(fKN) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    f5 = f4;
                    i5 |= composerKN.rl(f5) ? 2048 : 1024;
                }
                if (composerKN.HI((i5 & 1171) != 1170, i5 & 1)) {
                    composerKN.e();
                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                        modifier3 = i8 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 2) != 0) {
                            jAz = Color.az(MaterialTheme.f22169n.n(composerKN, 6).xMQ(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                            i5 &= -113;
                        }
                        if (i9 != 0) {
                            fKN = Dp.KN(1);
                        }
                        if (i7 != 0) {
                            fKN2 = Dp.KN(0);
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1249392198, i5, -1, "androidx.compose.material.Divider (Divider.kt:51)");
                        }
                        Modifier modifierAz = fKN2 != 0.0f ? Modifier.INSTANCE : PaddingKt.az(Modifier.INSTANCE, fKN2, 0.0f, 0.0f, 0.0f, 14, null);
                        if (Dp.mUb(fKN, Dp.INSTANCE.n())) {
                            composerKN.eF(-129206866);
                            composerKN.Xw();
                            fKN3 = fKN;
                        } else {
                            composerKN.eF(-129273423);
                            fKN3 = Dp.KN(1.0f / ((Density) composerKN.ty(CompositionLocalsKt.J2())).getDensity());
                            composerKN.Xw();
                        }
                        BoxKt.n(BackgroundKt.nr(SizeKt.xMQ(SizeKt.KN(modifier3.Zmq(modifierAz), 0.0f, 1, null), fKN3), jAz, null, 2, null), composerKN, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        f6 = fKN2;
                    } else {
                        composerKN.wTp();
                        if ((i3 & 2) != 0) {
                            i5 &= -113;
                        }
                        modifier3 = modifier2;
                    }
                    fKN2 = f5;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    if (fKN2 != 0.0f) {
                    }
                    if (Dp.mUb(fKN, Dp.INSTANCE.n())) {
                    }
                    BoxKt.n(BackgroundKt.nr(SizeKt.xMQ(SizeKt.KN(modifier3.Zmq(modifierAz), 0.0f, 1, null), fKN3), jAz, null, 2, null), composerKN, 0);
                    if (ComposerKt.v()) {
                    }
                    f6 = fKN2;
                } else {
                    composerKN.wTp();
                    modifier3 = modifier2;
                    f6 = f5;
                }
                final float f7 = fKN;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    final Modifier modifier4 = modifier3;
                    final long j3 = jAz;
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DividerKt$Divider$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            n(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer2, int i10) {
                            DividerKt.n(modifier4, j3, f7, f6, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 3072;
            f5 = f4;
            if (composerKN.HI((i5 & 1171) != 1170, i5 & 1)) {
            }
            final float f72 = fKN;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        fKN = f3;
        i7 = i3 & 8;
        if (i7 != 0) {
        }
        f5 = f4;
        if (composerKN.HI((i5 & 1171) != 1170, i5 & 1)) {
        }
        final float f722 = fKN;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }
}
