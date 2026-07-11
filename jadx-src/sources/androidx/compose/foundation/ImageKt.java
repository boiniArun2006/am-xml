package androidx.compose.foundation;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ab\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aU\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aU\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap;", "bitmap", "", "contentDescription", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "", "t", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/vector/ImageVector;", "imageVector", "rl", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", c.f62177j, "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,276:1\n1247#2,6:277\n1247#2,6:283\n121#3,6:289\n128#3,4:304\n132#3:314\n134#3:317\n272#4,9:295\n281#4,2:315\n4206#5,6:308\n*S KotlinDebug\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n*L\n158#1:277,6\n251#1:283,6\n261#1:289,6\n261#1:304,4\n261#1:314\n261#1:317\n261#1:295,9\n261#1:315,2\n261#1:308,6\n*E\n"})
public final class ImageKt {
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Painter painter, final String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f3, ColorFilter colorFilter, Composer composer, final int i2, final int i3) {
        Painter painter2;
        int i5;
        Modifier modifier2;
        int i7;
        Alignment alignment2;
        int i8;
        int i9;
        float f4;
        int i10;
        ColorFilter colorFilter2;
        final ColorFilter colorFilter3;
        final Alignment alignment3;
        final ContentScale contentScale2;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i11;
        ContentScale contentScaleO;
        int i12;
        Modifier modifierNr;
        Composer composerKN = composer.KN(1142754848);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            painter2 = painter;
        } else {
            painter2 = painter;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(painter2) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(str) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    alignment2 = alignment;
                    i5 |= composerKN.p5(alignment2) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        i5 |= composerKN.p5(contentScale) ? 16384 : 8192;
                    }
                    i9 = i3 & 32;
                    if (i9 != 0) {
                        if ((196608 & i2) == 0) {
                            f4 = f3;
                            i5 |= composerKN.rl(f4) ? 131072 : 65536;
                        }
                        i10 = i3 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                            colorFilter2 = colorFilter;
                        } else {
                            colorFilter2 = colorFilter;
                            if ((i2 & 1572864) == 0) {
                                i5 |= composerKN.p5(colorFilter2) ? 1048576 : 524288;
                            }
                        }
                        if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            Alignment alignmentO = i7 != 0 ? Alignment.INSTANCE.O() : alignment2;
                            if (i8 != 0) {
                                contentScaleO = ContentScale.INSTANCE.O();
                                i11 = i9;
                            } else {
                                i11 = i9;
                                contentScaleO = contentScale;
                            }
                            if (i11 != 0) {
                                f4 = 1.0f;
                            }
                            ColorFilter colorFilter4 = i10 != 0 ? null : colorFilter2;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1142754848, i5, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                            }
                            if (str != null) {
                                composerKN.eF(1040425059);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                boolean z2 = (i5 & 112) == 32;
                                Object objIF = composerKN.iF();
                                if (z2 || objIF == Composer.INSTANCE.n()) {
                                    objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
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
                                i12 = 0;
                                modifierNr = SemanticsModifierKt.nr(companion, false, (Function1) objIF, 1, null);
                                composerKN.Xw();
                            } else {
                                i12 = 0;
                                composerKN.eF(1040583841);
                                composerKN.Xw();
                                modifierNr = Modifier.INSTANCE;
                            }
                            Modifier modifierRl = PainterModifierKt.rl(ClipKt.rl(modifier2.Zmq(modifierNr)), painter2, false, alignmentO, contentScaleO, f4, colorFilter4, 2, null);
                            ImageKt$Image$1 imageKt$Image$1 = new MeasurePolicy() { // from class: androidx.compose.foundation.ImageKt$Image$1
                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                                    return MeasureScope.ER(measureScope, Constraints.ty(j2), Constraints.az(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.ImageKt$Image$1.1
                                        public final void n(Placeable.PlacementScope placementScope) {
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            n(placementScope);
                                            return Unit.INSTANCE;
                                        }
                                    }, 4, null);
                                }
                            };
                            int iN = ComposablesKt.n(composerKN, i12);
                            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierRl);
                            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0 function0N = companion2.n();
                            if (composerKN.getApplier() == null) {
                                ComposablesKt.t();
                            }
                            composerKN.T();
                            if (composerKN.getInserting()) {
                                composerKN.s7N(function0N);
                            } else {
                                composerKN.r();
                            }
                            Composer composerN = Updater.n(composerKN);
                            Updater.O(composerN, imageKt$Image$1, companion2.t());
                            Updater.O(composerN, compositionLocalMapIk, companion2.O());
                            Updater.O(composerN, modifierO, companion2.nr());
                            Function2 function2Rl = companion2.rl();
                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                            }
                            composerKN.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            alignment3 = alignmentO;
                            contentScale2 = contentScaleO;
                            colorFilter3 = colorFilter4;
                        } else {
                            composerKN.wTp();
                            colorFilter3 = colorFilter2;
                            alignment3 = alignment2;
                            contentScale2 = contentScale;
                        }
                        final Modifier modifier3 = modifier2;
                        final float f5 = f4;
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i14) {
                                    ImageKt.n(painter, str, modifier3, alignment3, contentScale2, f5, colorFilter3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 196608;
                    f4 = f3;
                    i10 = i3 & 64;
                    if (i10 != 0) {
                    }
                    if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
                    }
                    final Modifier modifier32 = modifier2;
                    final float f53 = f4;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                }
                f4 = f3;
                i10 = i3 & 64;
                if (i10 != 0) {
                }
                if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
                }
                final Modifier modifier322 = modifier2;
                final float f532 = f4;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            alignment2 = alignment;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            i9 = i3 & 32;
            if (i9 != 0) {
            }
            f4 = f3;
            i10 = i3 & 64;
            if (i10 != 0) {
            }
            if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
            }
            final Modifier modifier3222 = modifier2;
            final float f5322 = f4;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        alignment2 = alignment;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        i9 = i3 & 32;
        if (i9 != 0) {
        }
        f4 = f3;
        i10 = i3 & 64;
        if (i10 != 0) {
        }
        if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
        }
        final Modifier modifier32222 = modifier2;
        final float f53222 = f4;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final void rl(ImageVector imageVector, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f3, ColorFilter colorFilter, Composer composer, int i2, int i3) {
        if ((i3 & 4) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Modifier modifier2 = modifier;
        if ((i3 & 8) != 0) {
            alignment = Alignment.INSTANCE.O();
        }
        Alignment alignment2 = alignment;
        ContentScale contentScaleO = (i3 & 16) != 0 ? ContentScale.INSTANCE.O() : contentScale;
        float f4 = (i3 & 32) != 0 ? 1.0f : f3;
        ColorFilter colorFilter2 = (i3 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.v()) {
            ComposerKt.p5(1595907091, i2, -1, "androidx.compose.foundation.Image (Image.kt:202)");
        }
        n(VectorPainterKt.KN(imageVector, composer, i2 & 14), str, modifier2, alignment2, contentScaleO, f4, colorFilter2, composer, VectorPainter.f31887N | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2), 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }

    public static final void t(ImageBitmap imageBitmap, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f3, ColorFilter colorFilter, int i2, Composer composer, int i3, int i5) {
        Modifier modifier2 = (i5 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Alignment alignmentO = (i5 & 8) != 0 ? Alignment.INSTANCE.O() : alignment;
        ContentScale contentScaleO = (i5 & 16) != 0 ? ContentScale.INSTANCE.O() : contentScale;
        float f4 = (i5 & 32) != 0 ? 1.0f : f3;
        ColorFilter colorFilter2 = (i5 & 64) != 0 ? null : colorFilter;
        int iRl = (i5 & 128) != 0 ? DrawScope.INSTANCE.rl() : i2;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1396260732, i3, -1, "androidx.compose.foundation.Image (Image.kt:156)");
        }
        boolean zP5 = composer.p5(imageBitmap);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            objIF = BitmapPainterKt.rl(imageBitmap, 0L, 0L, iRl, 6, null);
            composer.o(objIF);
        }
        n((BitmapPainter) objIF, str, modifier2, alignmentO, contentScaleO, f4, colorFilter2, composer, i3 & 4194288, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
