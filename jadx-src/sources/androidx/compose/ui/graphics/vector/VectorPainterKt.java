package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.vector.VectorProperty;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.google.android.exoplayer2.C;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\n\u001a\u00020\t*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a*\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a$\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aD\u0010\u001f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a'\u0010%\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010)\u001a\u00020#*\u00020#2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*\u001a-\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020'2\u0014\b\u0002\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-0,H\u0007¢\u0006\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "image", "Landroidx/compose/ui/graphics/vector/VectorPainter;", "KN", "(Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Dp;", "defaultWidth", "defaultHeight", "Landroidx/compose/ui/geometry/Size;", "J2", "(Landroidx/compose/ui/unit/Density;FF)J", "defaultSize", "", "viewportWidth", "viewportHeight", "Uo", "(JFF)J", "Landroidx/compose/ui/graphics/Color;", "tintColor", "Landroidx/compose/ui/graphics/BlendMode;", "tintBlendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "t", "(JI)Landroidx/compose/ui/graphics/ColorFilter;", "viewportSize", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "intrinsicColorFilter", "", "autoMirror", "rl", "(Landroidx/compose/ui/graphics/vector/VectorPainter;JJLjava/lang/String;Landroidx/compose/ui/graphics/ColorFilter;Z)Landroidx/compose/ui/graphics/vector/VectorPainter;", "density", "imageVector", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "root", "O", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/ui/graphics/vector/GroupComponent;)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "currentGroup", "nr", "(Landroidx/compose/ui/graphics/vector/GroupComponent;Landroidx/compose/ui/graphics/vector/VectorGroup;)Landroidx/compose/ui/graphics/vector/GroupComponent;", "group", "", "Landroidx/compose/ui/graphics/vector/VectorConfig;", "configs", "", c.f62177j, "(Landroidx/compose/ui/graphics/vector/VectorGroup;Ljava/util/Map;Landroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 7 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 8 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 9 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 10 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,474:1\n75#2:475\n75#2:500\n1247#3,6:476\n1247#3,6:482\n1247#3,6:488\n1247#3,6:494\n1247#3,3:504\n1250#3,3:508\n53#4,3:501\n53#4,3:532\n60#4:536\n70#4:539\n53#4,3:542\n1#5:507\n167#6,6:511\n249#6,14:517\n33#7:531\n33#7:541\n57#8:535\n61#8:538\n22#9:537\n22#9:540\n635#10:545\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n*L\n131#1:475\n171#1:500\n135#1:476,6\n136#1:482,6\n147#1:488,6\n159#1:494,6\n173#1:504,3\n173#1:508,3\n172#1:501,3\n317#1:532,3\n325#1:536\n326#1:539\n324#1:542,3\n262#1:511,6\n262#1:517,14\n317#1:531\n324#1:541\n325#1:535\n326#1:538\n325#1:537\n326#1:540\n334#1:545\n*E\n"})
public final class VectorPainterKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final VectorGroup vectorGroup, Map map, Composer composer, final int i2, final int i3) {
        int i5;
        final Map map2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Map map3;
        Composer composerKN = composer.KN(-446179233);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(vectorGroup) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                map2 = map;
                i5 |= composerKN.E2(map2) ? 32 : 16;
            }
            if (composerKN.HI((i5 & 19) == 18, i5 & 1)) {
                composerKN.wTp();
            } else {
                Map mapEmptyMap = i7 != 0 ? MapsKt.emptyMap() : map2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(-446179233, i5, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:428)");
                }
                Iterator<VectorNode> it = vectorGroup.iterator();
                while (it.hasNext()) {
                    final VectorNode next = it.next();
                    if (next instanceof VectorPath) {
                        composerKN.eF(-23302778);
                        VectorPath vectorPath = (VectorPath) next;
                        VectorConfig vectorConfig = (VectorConfig) mapEmptyMap.get(vectorPath.getName());
                        if (vectorConfig == null) {
                            vectorConfig = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$1
                            };
                        }
                        Composer composer2 = composerKN;
                        VectorComposeKt.rl((List) vectorConfig.n(VectorProperty.PathData.f31918n, vectorPath.getPathData()), vectorPath.getPathFillType(), vectorPath.getName(), (Brush) vectorConfig.n(VectorProperty.Fill.f31916n, vectorPath.getFill()), ((Number) vectorConfig.n(VectorProperty.FillAlpha.f31917n, Float.valueOf(vectorPath.getFillAlpha()))).floatValue(), (Brush) vectorConfig.n(VectorProperty.Stroke.f31924n, vectorPath.getStroke()), ((Number) vectorConfig.n(VectorProperty.StrokeAlpha.f31925n, Float.valueOf(vectorPath.getStrokeAlpha()))).floatValue(), ((Number) vectorConfig.n(VectorProperty.StrokeLineWidth.f31926n, Float.valueOf(vectorPath.getStrokeLineWidth()))).floatValue(), vectorPath.getStrokeLineCap(), vectorPath.getStrokeLineJoin(), vectorPath.getStrokeLineMiter(), ((Number) vectorConfig.n(VectorProperty.TrimPathStart.f31931n, Float.valueOf(vectorPath.getTrimPathStart()))).floatValue(), ((Number) vectorConfig.n(VectorProperty.TrimPathEnd.f31929n, Float.valueOf(vectorPath.getTrimPathEnd()))).floatValue(), ((Number) vectorConfig.n(VectorProperty.TrimPathOffset.f31930n, Float.valueOf(vectorPath.getTrimPathOffset()))).floatValue(), composer2, 0, 0, 0);
                        composerKN = composer2;
                        composerKN.Xw();
                        mapEmptyMap = mapEmptyMap;
                        it = it;
                    } else {
                        Iterator<VectorNode> it2 = it;
                        final Map map4 = mapEmptyMap;
                        if (next instanceof VectorGroup) {
                            composerKN.eF(-21889209);
                            VectorGroup vectorGroup2 = (VectorGroup) next;
                            VectorConfig vectorConfig2 = (VectorConfig) map4.get(vectorGroup2.getName());
                            if (vectorConfig2 == null) {
                                vectorConfig2 = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$2
                                };
                            }
                            map3 = map4;
                            VectorComposeKt.n(vectorGroup2.getName(), ((Number) vectorConfig2.n(VectorProperty.Rotation.f31921n, Float.valueOf(vectorGroup2.getRotation()))).floatValue(), ((Number) vectorConfig2.n(VectorProperty.PivotX.f31919n, Float.valueOf(vectorGroup2.getPivotX()))).floatValue(), ((Number) vectorConfig2.n(VectorProperty.PivotY.f31920n, Float.valueOf(vectorGroup2.getPivotY()))).floatValue(), ((Number) vectorConfig2.n(VectorProperty.ScaleX.f31922n, Float.valueOf(vectorGroup2.getScaleX()))).floatValue(), ((Number) vectorConfig2.n(VectorProperty.ScaleY.f31923n, Float.valueOf(vectorGroup2.getScaleY()))).floatValue(), ((Number) vectorConfig2.n(VectorProperty.TranslateX.f31927n, Float.valueOf(vectorGroup2.getTranslationX()))).floatValue(), ((Number) vectorConfig2.n(VectorProperty.TranslateY.f31928n, Float.valueOf(vectorGroup2.getTranslationY()))).floatValue(), (List) vectorConfig2.n(VectorProperty.PathData.f31918n, vectorGroup2.getClipPathData()), ComposableLambdaKt.nr(1450046638, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i8) {
                                    if (!composer3.HI((i8 & 3) != 2, i8 & 1)) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1450046638, i8, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup.<anonymous> (VectorPainter.kt:468)");
                                    }
                                    VectorPainterKt.n((VectorGroup) next, map4, composer3, 0, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, C.ENCODING_PCM_32BIT, 0);
                            composerKN.Xw();
                        } else {
                            map3 = map4;
                            composerKN.eF(-20884003);
                            composerKN.Xw();
                        }
                        it = it2;
                        mapEmptyMap = map3;
                    }
                }
                Map map5 = mapEmptyMap;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                map2 = map5;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        n(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer3, int i8) {
                        VectorPainterKt.n(vectorGroup, map2, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        map2 = map;
        if (composerKN.HI((i5 & 19) == 18, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    private static final ColorFilter t(long j2, int i2) {
        if (j2 != 16) {
            return ColorFilter.INSTANCE.n(j2, i2);
        }
        return null;
    }

    private static final long J2(Density density, float f3, float f4) {
        float fL = density.l(f3);
        float fL2 = density.l(f4);
        return Size.nr((((long) Float.floatToRawIntBits(fL)) << 32) | (((long) Float.floatToRawIntBits(fL2)) & 4294967295L));
    }

    public static final VectorPainter KN(ImageVector imageVector, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1413834416, i2, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:169)");
        }
        Density density = (Density) composer.ty(CompositionLocalsKt.J2());
        float genId = imageVector.getGenId();
        boolean zNr = composer.nr((((long) Float.floatToRawIntBits(density.getDensity())) & 4294967295L) | (Float.floatToRawIntBits(genId) << 32));
        Object objIF = composer.iF();
        if (zNr || objIF == Composer.INSTANCE.n()) {
            GroupComponent groupComponent = new GroupComponent();
            nr(groupComponent, imageVector.getRoot());
            Unit unit = Unit.INSTANCE;
            objIF = O(density, imageVector, groupComponent);
            composer.o(objIF);
        }
        VectorPainter vectorPainter = (VectorPainter) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return vectorPainter;
    }

    public static final VectorPainter O(Density density, ImageVector imageVector, GroupComponent groupComponent) {
        long jJ2 = J2(density, imageVector.getDefaultWidth(), imageVector.getDefaultHeight());
        return rl(new VectorPainter(groupComponent), jJ2, Uo(jJ2, imageVector.getViewportWidth(), imageVector.getViewportHeight()), imageVector.getName(), t(imageVector.getTintColor(), imageVector.getTintBlendMode()), imageVector.getAutoMirror());
    }

    private static final long Uo(long j2, float f3, float f4) {
        if (Float.isNaN(f3)) {
            f3 = Float.intBitsToFloat((int) (j2 >> 32));
        }
        if (Float.isNaN(f4)) {
            f4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        }
        return Size.nr((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
    }

    public static final GroupComponent nr(GroupComponent groupComponent, VectorGroup vectorGroup) {
        int iAz = vectorGroup.az();
        for (int i2 = 0; i2 < iAz; i2++) {
            VectorNode vectorNodeO = vectorGroup.O(i2);
            if (vectorNodeO instanceof VectorPath) {
                PathComponent pathComponent = new PathComponent();
                VectorPath vectorPath = (VectorPath) vectorNodeO;
                pathComponent.gh(vectorPath.getPathData());
                pathComponent.qie(vectorPath.getPathFillType());
                pathComponent.mUb(vectorPath.getName());
                pathComponent.KN(vectorPath.getFill());
                pathComponent.xMQ(vectorPath.getFillAlpha());
                pathComponent.az(vectorPath.getStroke());
                pathComponent.ty(vectorPath.getStrokeAlpha());
                pathComponent.r(vectorPath.getStrokeLineWidth());
                pathComponent.HI(vectorPath.getStrokeLineCap());
                pathComponent.ck(vectorPath.getStrokeLineJoin());
                pathComponent.Ik(vectorPath.getStrokeLineMiter());
                pathComponent.XQ(vectorPath.getTrimPathStart());
                pathComponent.o(vectorPath.getTrimPathEnd());
                pathComponent.Z(vectorPath.getTrimPathOffset());
                groupComponent.xMQ(i2, pathComponent);
            } else if (vectorNodeO instanceof VectorGroup) {
                GroupComponent groupComponent2 = new GroupComponent();
                VectorGroup vectorGroup2 = (VectorGroup) vectorNodeO;
                groupComponent2.r(vectorGroup2.getName());
                groupComponent2.XQ(vectorGroup2.getRotation());
                groupComponent2.S(vectorGroup2.getScaleX());
                groupComponent2.WPU(vectorGroup2.getScaleY());
                groupComponent2.aYN(vectorGroup2.getTranslationX());
                groupComponent2.ViF(vectorGroup2.getTranslationY());
                groupComponent2.o(vectorGroup2.getPivotX());
                groupComponent2.Z(vectorGroup2.getPivotY());
                groupComponent2.Ik(vectorGroup2.getClipPathData());
                nr(groupComponent2, vectorGroup2);
                groupComponent.xMQ(i2, groupComponent2);
            }
        }
        return groupComponent;
    }

    public static final VectorPainter rl(VectorPainter vectorPainter, long j2, long j3, String str, ColorFilter colorFilter, boolean z2) {
        vectorPainter.ViF(j2);
        vectorPainter.XQ(z2);
        vectorPainter.S(colorFilter);
        vectorPainter.nY(j3);
        vectorPainter.aYN(str);
        return vectorPainter;
    }
}
