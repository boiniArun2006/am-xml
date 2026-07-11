package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0014\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a_\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a_\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\"\u001a\u0010!\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"", "Landroidx/compose/ui/graphics/vector/PathNode;", "Landroidx/compose/ui/graphics/Path;", "target", "t", "(Ljava/util/List;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", TtmlNode.TAG_P, "", "x0", "y0", "x1", "y1", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "theta", "", "isMoreThanHalf", "isPositiveArc", "", "rl", "(Landroidx/compose/ui/graphics/Path;DDDDDDDZZ)V", "cx", "cy", "e1x", "e1y", TtmlNode.START, "sweep", c.f62177j, "(Landroidx/compose/ui/graphics/Path;DDDDDDDDD)V", "", "[F", "getEmptyArray", "()[F", "EmptyArray", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,546:1\n545#1:553\n34#2,6:547\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n*L\n405#1:553\n207#1:547,6\n*E\n"})
public final class PathParserKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float[] f31820n = new float[0];

    private static final void n(Path path, double d2, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11) {
        double d12 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d11 * d12) / 3.141592653589793d));
        double dCos = Math.cos(d9);
        double dSin = Math.sin(d9);
        double dCos2 = Math.cos(d10);
        double dSin2 = Math.sin(d10);
        double d13 = -d5;
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
            int i3 = i2;
            double d27 = (d2 + ((d5 * dCos) * dCos3)) - (d15 * dSin3);
            double d28 = d12;
            double d29 = d4 + (d5 * dSin * dCos3) + (d18 * dSin3);
            double d30 = (d14 * dSin3) - (d15 * dCos3);
            double d31 = (dSin3 * d17) + (dCos3 * d18);
            double d32 = d26 - d25;
            int i5 = iCeil;
            double dTan = Math.tan(d32 / ((double) 2));
            double dSin4 = (Math.sin(d32) * (Math.sqrt(d28 + ((3.0d * dTan) * dTan)) - ((double) 1))) / ((double) 3);
            path.r((float) (d23 + (d22 * dSin4)), (float) (d24 + (d21 * dSin4)), (float) (d27 - (dSin4 * d30)), (float) (d29 - (dSin4 * d31)), (float) d27, (float) d29);
            dSin = dSin;
            d20 = d20;
            d23 = d27;
            d24 = d29;
            i2 = i3 + 1;
            d25 = d26;
            d21 = d31;
            iCeil = i5;
            d22 = d30;
            dCos = dCos;
            d12 = d28;
        }
    }

    private static final void rl(Path path, double d2, double d4, double d5, double d6, double d7, double d8, double d9, boolean z2, boolean z3) {
        double d10;
        double d11;
        double d12 = (d9 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d12);
        double dSin = Math.sin(d12);
        double d13 = ((d2 * dCos) + (d4 * dSin)) / d7;
        double d14 = (((-d2) * dSin) + (d4 * dCos)) / d8;
        double d15 = ((d5 * dCos) + (d6 * dSin)) / d7;
        double d16 = (((-d5) * dSin) + (d6 * dCos)) / d8;
        double d17 = d13 - d15;
        double d18 = d14 - d16;
        double d19 = 2;
        double d20 = (d13 + d15) / d19;
        double d21 = (d14 + d16) / d19;
        double d22 = (d17 * d17) + (d18 * d18);
        if (d22 == 0.0d) {
            return;
        }
        double d23 = (1.0d / d22) - 0.25d;
        if (d23 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d22) / 1.99999d);
            rl(path, d2, d4, d5, d6, d7 * dSqrt, d8 * dSqrt, d9, z2, z3);
            return;
        }
        double dSqrt2 = Math.sqrt(d23);
        double d24 = d17 * dSqrt2;
        double d25 = dSqrt2 * d18;
        if (z2 == z3) {
            d10 = d20 - d25;
            d11 = d21 + d24;
        } else {
            d10 = d20 + d25;
            d11 = d21 - d24;
        }
        double dAtan2 = Math.atan2(d14 - d11, d13 - d10);
        double dAtan22 = Math.atan2(d16 - d11, d15 - d10) - dAtan2;
        if (z3 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d26 = d10 * d7;
        double d27 = d11 * d8;
        n(path, (d26 * dCos) - (d27 * dSin), (d26 * dSin) + (d27 * dCos), d7, d8, d2, d4, d12, dAtan2, dAtan22);
    }

    public static final Path t(List list, Path path) {
        int i2;
        float f3;
        int i3;
        PathNode pathNode;
        float f4;
        float f5;
        float x1;
        float x2;
        float y2;
        float dy2;
        float f6;
        float f7;
        float dx1;
        float dy1;
        float dy22;
        List list2 = list;
        Path path2 = path;
        int iHI = path2.HI();
        path2.gh();
        path2.KN(iHI);
        PathNode pathNode2 = list2.isEmpty() ? PathNode.Close.f31794t : (PathNode) list2.get(0);
        int size = list2.size();
        float f8 = 0.0f;
        int i5 = 0;
        float arcStartX = 0.0f;
        float arcStartY = 0.0f;
        float x3 = 0.0f;
        float y3 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        while (i5 < size) {
            PathNode pathNode3 = (PathNode) list2.get(i5);
            if (pathNode3 instanceof PathNode.Close) {
                path2.close();
                i2 = size;
                f3 = f8;
                i3 = i5;
                pathNode = pathNode3;
                arcStartX = f9;
                x3 = arcStartX;
                arcStartY = f10;
            } else {
                if (pathNode3 instanceof PathNode.RelativeMoveTo) {
                    PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode3;
                    x3 += relativeMoveTo.getDx();
                    y3 += relativeMoveTo.getDy();
                    path2.t(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                    i2 = size;
                    f3 = f8;
                    i3 = i5;
                    f9 = x3;
                    f10 = y3;
                } else {
                    if (pathNode3 instanceof PathNode.MoveTo) {
                        PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode3;
                        float x4 = moveTo.getX();
                        float y4 = moveTo.getY();
                        path2.Ik(moveTo.getX(), moveTo.getY());
                        x3 = x4;
                        f9 = x3;
                        y3 = y4;
                        f10 = y3;
                    } else {
                        if (pathNode3 instanceof PathNode.RelativeLineTo) {
                            PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode3;
                            path2.Z(relativeLineTo.getDx(), relativeLineTo.getDy());
                            x3 += relativeLineTo.getDx();
                            dy2 = relativeLineTo.getDy();
                        } else {
                            if (pathNode3 instanceof PathNode.LineTo) {
                                PathNode.LineTo lineTo = (PathNode.LineTo) pathNode3;
                                path2.S(lineTo.getX(), lineTo.getY());
                                x2 = lineTo.getX();
                                y2 = lineTo.getY();
                            } else if (pathNode3 instanceof PathNode.RelativeHorizontalTo) {
                                PathNode.RelativeHorizontalTo relativeHorizontalTo = (PathNode.RelativeHorizontalTo) pathNode3;
                                path2.Z(relativeHorizontalTo.getDx(), f8);
                                x3 += relativeHorizontalTo.getDx();
                            } else if (pathNode3 instanceof PathNode.HorizontalTo) {
                                PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode3;
                                path2.S(horizontalTo.getX(), y3);
                                x3 = horizontalTo.getX();
                            } else if (pathNode3 instanceof PathNode.RelativeVerticalTo) {
                                PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode3;
                                path2.Z(f8, relativeVerticalTo.getDy());
                                dy2 = relativeVerticalTo.getDy();
                            } else if (pathNode3 instanceof PathNode.VerticalTo) {
                                PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode3;
                                path2.S(x3, verticalTo.getY());
                                y3 = verticalTo.getY();
                            } else {
                                if (pathNode3 instanceof PathNode.RelativeCurveTo) {
                                    PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode3;
                                    path2.nr(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                                    dx1 = relativeCurveTo.getDx2() + x3;
                                    dy1 = relativeCurveTo.getDy2() + y3;
                                    x3 += relativeCurveTo.getDx3();
                                    dy22 = relativeCurveTo.getDy3();
                                } else {
                                    if (pathNode3 instanceof PathNode.CurveTo) {
                                        PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode3;
                                        path.r(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                        float x22 = curveTo.getX2();
                                        float y22 = curveTo.getY2();
                                        float x32 = curveTo.getX3();
                                        float y32 = curveTo.getY3();
                                        x3 = x32;
                                        y3 = y32;
                                        i2 = size;
                                        f3 = f8;
                                        i3 = i5;
                                        pathNode = pathNode3;
                                        arcStartX = x22;
                                        arcStartY = y22;
                                    } else if (pathNode3 instanceof PathNode.RelativeReflectiveCurveTo) {
                                        if (pathNode2.getIsCurve()) {
                                            float f11 = x3 - arcStartX;
                                            f7 = y3 - arcStartY;
                                            f6 = f11;
                                        } else {
                                            f6 = f8;
                                            f7 = f6;
                                        }
                                        PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode3;
                                        path.nr(f6, f7, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                        dx1 = relativeReflectiveCurveTo.getDx1() + x3;
                                        dy1 = relativeReflectiveCurveTo.getDy1() + y3;
                                        x3 += relativeReflectiveCurveTo.getDx2();
                                        dy22 = relativeReflectiveCurveTo.getDy2();
                                    } else {
                                        if (pathNode3 instanceof PathNode.ReflectiveCurveTo) {
                                            if (pathNode2.getIsCurve()) {
                                                float f12 = 2;
                                                x3 = (x3 * f12) - arcStartX;
                                                y3 = (f12 * y3) - arcStartY;
                                            }
                                            PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode3;
                                            path.r(x3, y3, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                            x1 = reflectiveCurveTo.getX1();
                                            float y1 = reflectiveCurveTo.getY1();
                                            float x23 = reflectiveCurveTo.getX2();
                                            float y23 = reflectiveCurveTo.getY2();
                                            x3 = x23;
                                            y3 = y23;
                                            i2 = size;
                                            f3 = f8;
                                            i3 = i5;
                                            pathNode = pathNode3;
                                            arcStartY = y1;
                                        } else if (pathNode3 instanceof PathNode.RelativeQuadTo) {
                                            PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode3;
                                            path.az(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                            arcStartX = relativeQuadTo.getDx1() + x3;
                                            arcStartY = relativeQuadTo.getDy1() + y3;
                                            x3 += relativeQuadTo.getDx2();
                                            dy2 = relativeQuadTo.getDy2();
                                        } else if (pathNode3 instanceof PathNode.QuadTo) {
                                            PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode3;
                                            path.xMQ(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                            arcStartX = quadTo.getX1();
                                            arcStartY = quadTo.getY1();
                                            x2 = quadTo.getX2();
                                            y2 = quadTo.getY2();
                                        } else if (pathNode3 instanceof PathNode.RelativeReflectiveQuadTo) {
                                            if (pathNode2.getIsQuad()) {
                                                f4 = x3 - arcStartX;
                                                f5 = y3 - arcStartY;
                                            } else {
                                                f4 = f8;
                                                f5 = f4;
                                            }
                                            PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode3;
                                            path.az(f4, f5, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                            x1 = f4 + x3;
                                            float f13 = f5 + y3;
                                            x3 += relativeReflectiveQuadTo.getDx();
                                            y3 += relativeReflectiveQuadTo.getDy();
                                            arcStartY = f13;
                                            i2 = size;
                                            f3 = f8;
                                            i3 = i5;
                                            pathNode = pathNode3;
                                        } else if (pathNode3 instanceof PathNode.ReflectiveQuadTo) {
                                            if (pathNode2.getIsQuad()) {
                                                float f14 = 2;
                                                x3 = (x3 * f14) - arcStartX;
                                                y3 = (f14 * y3) - arcStartY;
                                            }
                                            PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode3;
                                            path.xMQ(x3, y3, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                            float f15 = x3;
                                            x3 = reflectiveQuadTo.getX();
                                            arcStartX = f15;
                                            i2 = size;
                                            f3 = f8;
                                            i3 = i5;
                                            arcStartY = y3;
                                            pathNode = pathNode3;
                                            y3 = reflectiveQuadTo.getY();
                                        } else if (pathNode3 instanceof PathNode.RelativeArcTo) {
                                            PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode3;
                                            float arcStartDx = relativeArcTo.getArcStartDx() + x3;
                                            float arcStartDy = relativeArcTo.getArcStartDy() + y3;
                                            pathNode = pathNode3;
                                            i2 = size;
                                            i3 = i5;
                                            f3 = f8;
                                            rl(path, x3, y3, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.getIsMoreThanHalf(), relativeArcTo.getIsPositiveArc());
                                            arcStartX = arcStartDx;
                                            x3 = arcStartX;
                                            arcStartY = arcStartDy;
                                        } else {
                                            i2 = size;
                                            f3 = f8;
                                            i3 = i5;
                                            pathNode = pathNode3;
                                            if (pathNode instanceof PathNode.ArcTo) {
                                                PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode;
                                                rl(path, x3, y3, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.getIsMoreThanHalf(), arcTo.getIsPositiveArc());
                                                arcStartX = arcTo.getArcStartX();
                                                x3 = arcStartX;
                                                arcStartY = arcTo.getArcStartY();
                                            }
                                        }
                                        arcStartX = x1;
                                    }
                                    i5 = i3 + 1;
                                    path2 = path;
                                    pathNode2 = pathNode;
                                    f8 = f3;
                                    size = i2;
                                    list2 = list;
                                }
                                y3 += dy22;
                                arcStartX = dx1;
                                arcStartY = dy1;
                            }
                            y3 = y2;
                            x3 = x2;
                        }
                        y3 += dy2;
                    }
                    i2 = size;
                    f3 = f8;
                    i3 = i5;
                }
                pathNode = pathNode3;
                i5 = i3 + 1;
                path2 = path;
                pathNode2 = pathNode;
                f8 = f3;
                size = i2;
                list2 = list;
            }
            y3 = arcStartY;
            i5 = i3 + 1;
            path2 = path;
            pathNode2 = pathNode;
            f8 = f3;
            size = i2;
            list2 = list;
        }
        return path;
    }
}
