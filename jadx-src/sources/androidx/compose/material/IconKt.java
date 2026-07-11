package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a8\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a8\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0016\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "imageVector", "", "contentDescription", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "tint", "", "rl", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", c.f62177j, "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "t", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/geometry/Size;", "", "nr", "(J)Z", "Landroidx/compose/ui/Modifier;", "DefaultIconSizeModifier", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icon.kt\nandroidx/compose/material/IconKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,169:1\n75#2:170\n75#2:171\n75#2:178\n1247#3,6:172\n1247#3,6:179\n1247#3,6:185\n149#4:191\n*S KotlinDebug\n*F\n+ 1 Icon.kt\nandroidx/compose/material/IconKt\n*L\n66#1:170\n100#1:171\n134#1:178\n102#1:172,6\n137#1:179,6\n140#1:185,6\n168#1:191\n*E\n"})
public final class IconKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Modifier f22107n = SizeKt.Z(Modifier.INSTANCE, Dp.KN(24));

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Painter painter, final String str, Modifier modifier, long j2, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        long j3;
        final Modifier modifier3;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeGh;
        long jAz;
        Modifier modifier4;
        long j5;
        Modifier modifierNr;
        Composer composerKN = composer.KN(-1142959010);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(painter) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(str) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            if ((i2 & 3072) != 0) {
                j3 = j2;
                i5 |= ((i3 & 8) == 0 && composerKN.nr(j3)) ? 2048 : 1024;
            } else {
                j3 = j2;
            }
            if (composerKN.HI((i5 & 1171) == 1170, i5 & 1)) {
                composerKN.wTp();
                modifier3 = modifier2;
                j4 = j3;
            } else {
                composerKN.e();
                if ((i2 & 1) == 0 || composerKN.rV9()) {
                    Modifier modifier5 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 8) != 0) {
                        jAz = Color.az(((Color) composerKN.ty(ContentColorKt.n())).getValue(), ((Number) composerKN.ty(ContentAlphaKt.n())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i5 &= -7169;
                    } else {
                        jAz = j3;
                    }
                    modifier4 = modifier5;
                } else {
                    composerKN.wTp();
                    if ((i3 & 8) != 0) {
                        i5 &= -7169;
                    }
                    long j6 = j3;
                    modifier4 = modifier2;
                    jAz = j6;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1142959010, i5, -1, "androidx.compose.material.Icon (Icon.kt:134)");
                }
                boolean z2 = (((i5 & 7168) ^ 3072) > 2048 && composerKN.nr(jAz)) || (i5 & 3072) == 2048;
                Object objIF = composerKN.iF();
                if (z2 || objIF == Composer.INSTANCE.n()) {
                    if (Color.HI(jAz, Color.INSTANCE.Uo())) {
                        j5 = jAz;
                        objIF = null;
                    } else {
                        j5 = jAz;
                        objIF = ColorFilter.Companion.rl(ColorFilter.INSTANCE, j5, 0, 2, null);
                    }
                    composerKN.o(objIF);
                } else {
                    j5 = jAz;
                }
                ColorFilter colorFilter = (ColorFilter) objIF;
                if (str != null) {
                    composerKN.eF(980491077);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    boolean z3 = (i5 & 112) == 32;
                    Object objIF2 = composerKN.iF();
                    if (z3 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.IconKt$Icon$semantics$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                n(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.I(semanticsPropertyReceiver, str);
                                SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.O());
                            }
                        };
                        composerKN.o(objIF2);
                    }
                    modifierNr = SemanticsModifierKt.nr(companion, false, (Function1) objIF2, 1, null);
                    composerKN.Xw();
                } else {
                    composerKN.eF(980649859);
                    composerKN.Xw();
                    modifierNr = Modifier.INSTANCE;
                }
                BoxKt.n(PainterModifierKt.rl(t(GraphicsLayerModifierKt.nr(modifier4), painter), painter, false, null, ContentScale.INSTANCE.O(), 0.0f, colorFilter, 22, null).Zmq(modifierNr), composerKN, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier4;
                j4 = j5;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.IconKt$Icon$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i8) {
                        IconKt.n(painter, str, modifier3, j4, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        modifier2 = modifier;
        if ((i2 & 3072) != 0) {
        }
        if (composerKN.HI((i5 & 1171) == 1170, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static final void rl(ImageVector imageVector, String str, Modifier modifier, long j2, Composer composer, int i2, int i3) {
        Modifier modifier2 = (i3 & 4) != 0 ? Modifier.INSTANCE : modifier;
        long jAz = (i3 & 8) != 0 ? Color.az(((Color) composer.ty(ContentColorKt.n())).getValue(), ((Number) composer.ty(ContentAlphaKt.n())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        if (ComposerKt.v()) {
            ComposerKt.p5(-800853103, i2, -1, "androidx.compose.material.Icon (Icon.kt:66)");
        }
        n(VectorPainterKt.KN(imageVector, composer, i2 & 14), str, modifier2, jAz, composer, VectorPainter.f31887N | (i2 & 112) | (i2 & 896) | (i2 & 7168), 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }

    private static final boolean nr(long j2) {
        if (Float.isInfinite(Size.gh(j2)) && Float.isInfinite(Size.xMQ(j2))) {
            return true;
        }
        return false;
    }

    private static final Modifier t(Modifier modifier, Painter painter) {
        Modifier modifier2;
        if (!Size.KN(painter.getIntrinsicSize(), Size.INSTANCE.n()) && !nr(painter.getIntrinsicSize())) {
            modifier2 = Modifier.INSTANCE;
        } else {
            modifier2 = f22107n;
        }
        return modifier.Zmq(modifier2);
    }
}
