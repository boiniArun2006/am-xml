package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a8\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a8\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a8\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0016\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u0016\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "imageVector", "", "contentDescription", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "tint", "", "nr", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "bitmap", "rl", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "t", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/ColorProducer;", c.f62177j, "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/ColorProducer;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "J2", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;)Landroidx/compose/ui/Modifier;", "O", "Landroidx/compose/ui/geometry/Size;", "", "Uo", "(J)Z", "Landroidx/compose/ui/Modifier;", "DefaultIconSizeModifier", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icon.kt\nandroidx/compose/material3/IconKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,247:1\n77#2:248\n77#2:249\n77#2:256\n1223#3,6:250\n1223#3,6:257\n1223#3,6:263\n1223#3,6:269\n1223#3,6:275\n*S KotlinDebug\n*F\n+ 1 Icon.kt\nandroidx/compose/material3/IconKt\n*L\n70#1:248\n106#1:249\n143#1:256\n108#1:250,6\n146#1:257,6\n149#1:263,6\n195#1:269,6\n207#1:275,6\n*E\n"})
public final class IconKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Modifier f26042n = SizeKt.Z(Modifier.INSTANCE, IconButtonTokens.f29649n.n());

    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final ImageVector imageVector, final String str, Modifier modifier, long j2, Composer composer, final int i2, final int i3) {
        int i5;
        String str2;
        final Modifier modifier2;
        final long j3;
        Modifier modifier3;
        long value;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-126890956);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(imageVector) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            str2 = str;
        } else {
            str2 = str;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.p5(str2) ? 32 : 16;
            }
        }
        int i7 = i3 & 4;
        if (i7 == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j2;
                    int i8 = composerKN.nr(j3) ? 2048 : 1024;
                    i5 |= i8;
                } else {
                    j3 = j2;
                }
                i5 |= i8;
            } else {
                j3 = j2;
            }
            if ((i5 & 1171) == 1170 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i2 & 1) != 0 || composerKN.rV9()) {
                    Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 8) == 0) {
                        i5 &= -7169;
                        modifier3 = modifier4;
                        value = ((Color) composerKN.ty(ContentColorKt.n())).getValue();
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-126890956, i5, -1, "androidx.compose.material3.Icon (Icon.kt:70)");
                        }
                        t(VectorPainterKt.KN(imageVector, composerKN, i5 & 14), str2, modifier3, value, composerKN, VectorPainter.f31887N | (i5 & 112) | (i5 & 896) | (i5 & 7168), 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier2 = modifier3;
                        j3 = value;
                    } else {
                        modifier3 = modifier4;
                    }
                } else {
                    composerKN.wTp();
                    if ((i3 & 8) != 0) {
                        i5 &= -7169;
                    }
                    modifier3 = modifier2;
                }
                value = j3;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                t(VectorPainterKt.KN(imageVector, composerKN, i5 & 14), str2, modifier3, value, composerKN, VectorPainter.f31887N | (i5 & 112) | (i5 & 896) | (i5 & 7168), 0);
                if (ComposerKt.v()) {
                }
                modifier2 = modifier3;
                j3 = value;
            } else {
                composerKN.wTp();
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconKt$Icon$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i9) {
                        IconKt.nr(imageVector, str, modifier2, j3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
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
        if ((i5 & 1171) == 1170) {
            composerKN.e();
            if ((i2 & 1) != 0) {
                if (i7 == 0) {
                }
                if ((i3 & 8) == 0) {
                }
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final ImageBitmap imageBitmap, final String str, Modifier modifier, long j2, Composer composer, final int i2, final int i3) {
        int i5;
        String str2;
        Modifier modifier2;
        long j3;
        int i7;
        Modifier modifier3;
        long value;
        boolean zP5;
        Object objIF;
        final Modifier modifier4;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1092052280);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(imageBitmap) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            str2 = str;
        } else {
            str2 = str;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.p5(str2) ? 32 : 16;
            }
        }
        int i8 = i3 & 4;
        if (i8 == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j2;
                    int i9 = composerKN.nr(j3) ? 2048 : 1024;
                    i5 |= i9;
                } else {
                    j3 = j2;
                }
                i5 |= i9;
            } else {
                j3 = j2;
            }
            if ((i5 & 1171) == 1170 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i2 & 1) != 0 || composerKN.rV9()) {
                    Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 8) == 0) {
                        i7 = i5 & (-7169);
                        modifier3 = modifier5;
                        value = ((Color) composerKN.ty(ContentColorKt.n())).getValue();
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1092052280, i7, -1, "androidx.compose.material3.Icon (Icon.kt:106)");
                        }
                        zP5 = composerKN.p5(imageBitmap);
                        objIF = composerKN.iF();
                        if (!zP5 || objIF == Composer.INSTANCE.n()) {
                            BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, 0L, 0L, 6, null);
                            composerKN.o(bitmapPainter);
                            objIF = bitmapPainter;
                        }
                        t((BitmapPainter) objIF, str2, modifier3, value, composerKN, i7 & 8176, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier4 = modifier3;
                        j4 = value;
                    } else {
                        i7 = i5;
                        modifier3 = modifier5;
                    }
                } else {
                    composerKN.wTp();
                    if ((i3 & 8) != 0) {
                        i5 &= -7169;
                    }
                    i7 = i5;
                    modifier3 = modifier2;
                }
                value = j3;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                zP5 = composerKN.p5(imageBitmap);
                objIF = composerKN.iF();
                if (!zP5) {
                    BitmapPainter bitmapPainter2 = new BitmapPainter(imageBitmap, 0L, 0L, 6, null);
                    composerKN.o(bitmapPainter2);
                    objIF = bitmapPainter2;
                    t((BitmapPainter) objIF, str2, modifier3, value, composerKN, i7 & 8176, 0);
                    if (ComposerKt.v()) {
                    }
                    modifier4 = modifier3;
                    j4 = value;
                }
            } else {
                composerKN.wTp();
                modifier4 = modifier2;
                j4 = j3;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconKt$Icon$2
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
                        IconKt.rl(imageBitmap, str, modifier4, j4, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
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
        if ((i5 & 1171) == 1170) {
            composerKN.e();
            if ((i2 & 1) != 0) {
                if (i8 == 0) {
                }
                if ((i3 & 8) == 0) {
                }
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final Painter painter, final String str, Modifier modifier, long j2, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        long j3;
        long value;
        Modifier modifier3;
        boolean z2;
        Object objIF;
        Modifier modifierNr;
        final Modifier modifier4;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-2142239481);
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
            if ((i5 & 1171) == 1170 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i2 & 1) != 0 || composerKN.rV9()) {
                    Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 8) == 0) {
                        i5 &= -7169;
                        modifier3 = modifier5;
                        value = ((Color) composerKN.ty(ContentColorKt.n())).getValue();
                    } else {
                        value = j3;
                        modifier3 = modifier5;
                    }
                } else {
                    composerKN.wTp();
                    if ((i3 & 8) != 0) {
                        i5 &= -7169;
                    }
                    value = j3;
                    modifier3 = modifier2;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(-2142239481, i5, -1, "androidx.compose.material3.Icon (Icon.kt:143)");
                }
                z2 = (((i5 & 7168) ^ 3072) <= 2048 && composerKN.nr(value)) || (i5 & 3072) == 2048;
                objIF = composerKN.iF();
                if (z2 || objIF == Composer.INSTANCE.n()) {
                    objIF = !Color.HI(value, Color.INSTANCE.Uo()) ? null : ColorFilter.Companion.rl(ColorFilter.INSTANCE, value, 0, 2, null);
                    composerKN.o(objIF);
                }
                ColorFilter colorFilter = (ColorFilter) objIF;
                composerKN.eF(-2144891392);
                if (str == null) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    boolean z3 = (i5 & 112) == 32;
                    Object objIF2 = composerKN.iF();
                    if (z3 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconKt$Icon$semantics$1$1
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
                } else {
                    modifierNr = Modifier.INSTANCE;
                }
                Modifier modifier6 = modifierNr;
                composerKN.Xw();
                BoxKt.n(PainterModifierKt.rl(O(GraphicsLayerModifierKt.nr(modifier3), painter), painter, false, null, ContentScale.INSTANCE.O(), 0.0f, colorFilter, 22, null).Zmq(modifier6), composerKN, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier4 = modifier3;
                j4 = value;
            } else {
                composerKN.wTp();
                modifier4 = modifier2;
                j4 = j3;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconKt$Icon$3
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
                        IconKt.t(painter, str, modifier4, j4, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
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
        if ((i5 & 1171) == 1170) {
            composerKN.e();
            if ((i2 & 1) != 0) {
                if (i7 == 0) {
                }
                if ((i3 & 8) == 0) {
                }
                composerKN.S();
                if (ComposerKt.v()) {
                }
                if (((i5 & 7168) ^ 3072) <= 2048) {
                    objIF = composerKN.iF();
                    if (z2) {
                        if (!Color.HI(value, Color.INSTANCE.Uo())) {
                        }
                        composerKN.o(objIF);
                        ColorFilter colorFilter2 = (ColorFilter) objIF;
                        composerKN.eF(-2144891392);
                        if (str == null) {
                        }
                        Modifier modifier62 = modifierNr;
                        composerKN.Xw();
                        BoxKt.n(PainterModifierKt.rl(O(GraphicsLayerModifierKt.nr(modifier3), painter), painter, false, null, ContentScale.INSTANCE.O(), 0.0f, colorFilter2, 22, null).Zmq(modifier62), composerKN, 0);
                        if (ComposerKt.v()) {
                        }
                        modifier4 = modifier3;
                        j4 = value;
                    }
                } else {
                    objIF = composerKN.iF();
                    if (z2) {
                    }
                }
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    private static final Modifier J2(Modifier modifier, Painter painter) {
        Modifier modifierN;
        if (!Size.KN(painter.getIntrinsicSize(), Size.INSTANCE.n()) && !Uo(painter.getIntrinsicSize())) {
            long intrinsicSize = painter.getIntrinsicSize();
            final float fGh = Size.gh(intrinsicSize);
            final float fXMQ = Size.xMQ(intrinsicSize);
            modifierN = LayoutModifierKt.n(Modifier.INSTANCE, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.IconKt$defaultSizeForColorProducer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                    return n(measureScope, measurable, constraints.getValue());
                }

                public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j2) {
                    final Placeable placeableDR0 = measurable.dR0(Constraints.INSTANCE.t((int) fGh, (int) fXMQ));
                    return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.IconKt$defaultSizeForColorProducer$1.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            n(placementScope);
                            return Unit.INSTANCE;
                        }

                        public final void n(Placeable.PlacementScope placementScope) {
                            Placeable.PlacementScope.xMQ(placementScope, placeableDR0, 0, 0, 0.0f, 4, null);
                        }
                    }, 4, null);
                }
            });
        } else {
            modifierN = f26042n;
        }
        return modifier.Zmq(modifierN);
    }

    private static final Modifier O(Modifier modifier, Painter painter) {
        Modifier modifier2;
        if (!Size.KN(painter.getIntrinsicSize(), Size.INSTANCE.n()) && !Uo(painter.getIntrinsicSize())) {
            modifier2 = Modifier.INSTANCE;
        } else {
            modifier2 = f26042n;
        }
        return modifier.Zmq(modifier2);
    }

    private static final boolean Uo(long j2) {
        if (Float.isInfinite(Size.gh(j2)) && Float.isInfinite(Size.xMQ(j2))) {
            return true;
        }
        return false;
    }

    public static final void n(final Painter painter, final ColorProducer colorProducer, final String str, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        Modifier modifierNr;
        boolean z2;
        Composer composerKN = composer.KN(1755070997);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerKN.E2(painter)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i7 | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            if (composerKN.E2(colorProducer)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.p5(str)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i5 |= i9;
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (composerKN.p5(modifier)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i5 |= i10;
        }
        if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (i11 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1755070997, i5, -1, "androidx.compose.material3.Icon (Icon.kt:191)");
            }
            composerKN.eF(-2144829472);
            if (str != null) {
                Modifier.Companion companion = Modifier.INSTANCE;
                if ((i5 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object objIF = composerKN.iF();
                if (z2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconKt$Icon$semantics$2$1
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
                    composerKN.o(objIF);
                }
                modifierNr = SemanticsModifierKt.nr(companion, false, (Function1) objIF, 1, null);
            } else {
                modifierNr = Modifier.INSTANCE;
            }
            composerKN.Xw();
            Modifier modifierJ2 = J2(GraphicsLayerModifierKt.nr(modifier), painter);
            boolean zE2 = composerKN.E2(painter) | composerKN.E2(colorProducer);
            Object objIF2 = composerKN.iF();
            if (zE2 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.IconKt$Icon$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        n(drawScope);
                        return Unit.INSTANCE;
                    }

                    public final void n(DrawScope drawScope) {
                        ColorFilter colorFilterRl;
                        Painter painter2 = painter;
                        ColorProducer colorProducer2 = colorProducer;
                        long jT2 = drawScope.t();
                        if (colorProducer2 != null) {
                            colorFilterRl = ColorFilter.Companion.rl(ColorFilter.INSTANCE, colorProducer2.n(), 0, 2, null);
                        } else {
                            colorFilterRl = null;
                        }
                        Painter.gh(painter2, drawScope, jT2, 0.0f, colorFilterRl, 2, null);
                    }
                };
                composerKN.o(objIF2);
            }
            BoxKt.n(DrawModifierKt.rl(modifierJ2, (Function1) objIF2).Zmq(modifierNr), composerKN, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconKt$Icon$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i12) {
                    IconKt.n(painter, colorProducer, str, modifier2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }
}
