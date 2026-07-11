package com.alightcreative.app.motion.scene;

import WzY.C1487z;
import WzY.yg;
import android.graphics.PathMeasure;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.rendering.RenderEnvironment;
import com.alightcreative.app.motion.scene.rendering.RenderMode;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.caoccao.javet.exceptions.JavetError;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aK\u0010\u0013\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/alightcreative/app/motion/scene/SceneElement;", "LWzY/z;", JavetError.PARAMETER_PATH, "LWzY/s4;", "canvas", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "env", "", "alpha", "", "drawStroke", "(Lcom/alightcreative/app/motion/scene/SceneElement;LWzY/z;LWzY/s4;Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;Ljava/lang/Float;)V", "LWzY/yg;", "paint", "Lcom/alightcreative/app/motion/scene/Vector2D;", "pos", "tan", "Lcom/alightcreative/app/motion/scene/StrokeEnd;", "style", "drawStrokeEnd", "(Lcom/alightcreative/app/motion/scene/SceneElement;LWzY/z;LWzY/s4;Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;LWzY/yg;Lcom/alightcreative/app/motion/scene/Vector2D;Lcom/alightcreative/app/motion/scene/Vector2D;Lcom/alightcreative/app/motion/scene/StrokeEnd;)V", "C", "F", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStroke.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Stroke.kt\ncom/alightcreative/app/motion/scene/StrokeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n1#2:193\n*E\n"})
public final class StrokeKt {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final float f46037C = 0.55191505f;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[StrokeCap.values().length];
            try {
                iArr[StrokeCap.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StrokeCap.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StrokeCap.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StrokeJoin.values().length];
            try {
                iArr2[StrokeJoin.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[StrokeJoin.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[StrokeJoin.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[StrokeEnd.values().length];
            try {
                iArr3[StrokeEnd.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[StrokeEnd.Arrow.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[StrokeEnd.TLine.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[StrokeEnd.Square.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[StrokeEnd.FilledSquare.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[StrokeEnd.Diamond.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[StrokeEnd.FilledDiamond.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[StrokeEnd.HollowTeardrop.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[StrokeEnd.FilledTeardrop.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[StrokeEnd.HollowCircle.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[StrokeEnd.FilledCircle.ordinal()] = 11;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[StrokeEnd.HollowArrow.ordinal()] = 12;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[StrokeEnd.FilledArrow.ordinal()] = 13;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final void drawStroke(SceneElement sceneElement, C1487z path, WzY.s4 canvas, RenderEnvironment env, Float f3) {
        SolidColor solidColor;
        Object next;
        yg.j jVar;
        yg.n nVar;
        Map<String, KeyableUserParameterValue> parameters;
        KeyableUserParameterValue keyableUserParameterValue;
        Keyable<SolidColor> colorValue;
        SceneElement sceneElement2 = sceneElement;
        Intrinsics.checkNotNullParameter(sceneElement2, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(env, "env");
        Iterator<T> it = sceneElement2.getVisualEffects().values().iterator();
        while (true) {
            solidColor = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            KeyableVisualEffectRef keyableVisualEffectRef = (KeyableVisualEffectRef) next;
            if (Intrinsics.areEqual(keyableVisualEffectRef.getId(), "com.alightcreative.effects.drawing.strokecolor") && !keyableVisualEffectRef.getHidden()) {
                break;
            }
        }
        KeyableVisualEffectRef keyableVisualEffectRef2 = (KeyableVisualEffectRef) next;
        if (keyableVisualEffectRef2 != null && (parameters = keyableVisualEffectRef2.getParameters()) != null && (keyableUserParameterValue = parameters.get(TtmlNode.ATTR_TTS_COLOR)) != null && (colorValue = keyableUserParameterValue.getColorValue()) != null) {
            solidColor = (SolidColor) KeyableKt.valueAtTime(colorValue, env);
        }
        WzY.yg ygVar = new WzY.yg();
        Transform transformValueAtTime = sceneElement2.getTransform().valueAtTime(env);
        float opacity = 1.0f;
        ygVar.xMQ(1.0f);
        if (solidColor == null) {
            solidColor = (SolidColor) KeyableKt.valueAtTime(sceneElement2.getStroke().getColor(), env);
        }
        ygVar.gh(solidColor);
        yg.w6 w6Var = yg.w6.f11694O;
        ygVar.ty(w6Var);
        ygVar.az(((Number) KeyableKt.valueAtTime(sceneElement2.getStroke().getSize(), env)).floatValue());
        int i2 = WhenMappings.$EnumSwitchMapping$0[sceneElement2.getStroke().getCap().ordinal()];
        if (i2 == 1) {
            jVar = yg.j.f11687n;
        } else if (i2 == 2) {
            jVar = yg.j.f11689t;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            jVar = yg.j.f11686O;
        }
        ygVar.mUb(jVar);
        int i3 = WhenMappings.$EnumSwitchMapping$1[sceneElement2.getStroke().getJoin().ordinal()];
        if (i3 == 1) {
            nVar = yg.n.f11690O;
        } else if (i3 == 2) {
            nVar = yg.n.f11693t;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            nVar = yg.n.f11691n;
        }
        ygVar.qie(nVar);
        float fT = ygVar.t();
        if (f3 != null) {
            opacity = f3.floatValue();
        } else if (env.getRenderMode() != RenderMode.THUMB) {
            opacity = transformValueAtTime.getOpacity();
        }
        ygVar.xMQ(fT * opacity);
        canvas.te(path, ygVar);
        StrokeEnd startStyle = sceneElement2.getStroke().getStartStyle();
        StrokeEnd strokeEnd = StrokeEnd.None;
        if (startStyle == strokeEnd && sceneElement2.getStroke().getEndStyle() == strokeEnd) {
            return;
        }
        final PathMeasure pathMeasure = new PathMeasure();
        pathMeasure.setPath(path.t(), false);
        final float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        ygVar.ty(w6Var);
        if (sceneElement2.getStroke().getStartStyle() != strokeEnd && !path.B()) {
            pathMeasure.getPosTan(0.0f, fArr, fArr2);
            drawStrokeEnd(sceneElement2, path, canvas, env, ygVar, new Vector2D(fArr[0], fArr[1]), GeometryKt.unaryMinus(GeometryKt.normalize(new Vector2D(fArr2[0], fArr2[1]))), sceneElement2.getStroke().getStartStyle());
        }
        ygVar.ty(w6Var);
        if (sceneElement2.getStroke().getEndStyle() != strokeEnd) {
            XoT.C.Uo(sceneElement2, new Function0() { // from class: com.alightcreative.app.motion.scene.Y5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StrokeKt.drawStroke$lambda$1();
                }
            });
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            while (true) {
                pathMeasure.getPosTan(pathMeasure.getLength(), fArr, fArr2);
                booleanRef.element = pathMeasure.isClosed();
                XoT.C.Uo(sceneElement2, new Function0() { // from class: com.alightcreative.app.motion.scene.nSC
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StrokeKt.drawStroke$lambda$2(pathMeasure, fArr);
                    }
                });
                if (!pathMeasure.nextContour()) {
                    break;
                } else {
                    sceneElement2 = sceneElement;
                }
            }
            final Vector2D vector2D = new Vector2D(fArr[0], fArr[1]);
            final Vector2D vector2DNormalize = GeometryKt.normalize(new Vector2D(fArr2[0], fArr2[1]));
            XoT.C.Uo(sceneElement2, new Function0() { // from class: com.alightcreative.app.motion.scene.ozJ
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StrokeKt.drawStroke$lambda$3(vector2D, vector2DNormalize, booleanRef);
                }
            });
            if (booleanRef.element) {
                return;
            }
            drawStrokeEnd(sceneElement2, path, canvas, env, ygVar, vector2D, vector2DNormalize, sceneElement2.getStroke().getEndStyle());
        }
    }

    public static /* synthetic */ void drawStroke$default(SceneElement sceneElement, C1487z c1487z, WzY.s4 s4Var, RenderEnvironment renderEnvironment, Float f3, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            f3 = null;
        }
        drawStroke(sceneElement, c1487z, s4Var, renderEnvironment, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String drawStroke$lambda$1() {
        return "DrawStrokeEnd:IN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String drawStroke$lambda$3(Vector2D vector2D, Vector2D vector2D2, Ref.BooleanRef booleanRef) {
        return "DrawStrokeEnd:DRAW pos=" + vector2D + " tan=" + vector2D2 + " closed=" + booleanRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String drawStroke$lambda$2(PathMeasure pathMeasure, float[] fArr) {
        return "DrawStrokeEnd:getPosTan(" + pathMeasure.getLength() + ") -> " + fArr[0] + "," + fArr[1];
    }

    private static final void drawStrokeEnd(SceneElement sceneElement, C1487z c1487z, WzY.s4 s4Var, RenderEnvironment renderEnvironment, WzY.yg ygVar, Vector2D vector2D, Vector2D vector2D2, StrokeEnd strokeEnd) {
        float fFloatValue = ((Number) KeyableKt.valueAtTime(sceneElement.getStroke().getSize(), renderEnvironment)).floatValue() * sceneElement.getStroke().getEndSize();
        switch (WhenMappings.$EnumSwitchMapping$2[strokeEnd.ordinal()]) {
            case 1:
                return;
            case 2:
                c1487z.ijL();
                c1487z.k(GeometryKt.minus(GeometryKt.minus(vector2D, GeometryKt.times(vector2D2, fFloatValue)), GeometryKt.times(GeometryKt.perpCw(vector2D2), fFloatValue)));
                c1487z.D(vector2D);
                c1487z.D(GeometryKt.minus(GeometryKt.minus(vector2D, GeometryKt.times(vector2D2, fFloatValue)), GeometryKt.times(GeometryKt.perpCCw(vector2D2), fFloatValue)));
                s4Var.te(c1487z, ygVar);
                return;
            case 3:
                c1487z.ijL();
                c1487z.k(GeometryKt.minus(vector2D, GeometryKt.times(GeometryKt.perpCw(vector2D2), fFloatValue)));
                c1487z.D(GeometryKt.minus(vector2D, GeometryKt.times(GeometryKt.perpCCw(vector2D2), fFloatValue)));
                s4Var.te(c1487z, ygVar);
                return;
            case 4:
                c1487z.ijL();
                c1487z.k(vector2D);
                c1487z.D(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.perpCw(vector2D2), fFloatValue)));
                c1487z.D(GeometryKt.plus(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.perpCw(vector2D2), fFloatValue)), GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), 2.0f)));
                c1487z.D(GeometryKt.plus(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.perpCCw(vector2D2), fFloatValue)), GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), 2.0f)));
                c1487z.D(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.perpCCw(vector2D2), fFloatValue)));
                c1487z.ViF();
                s4Var.te(c1487z, ygVar);
                return;
            case 5:
                ygVar.ty(yg.w6.f11697t);
                c1487z.ijL();
                c1487z.k(vector2D);
                c1487z.D(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.perpCw(vector2D2), fFloatValue)));
                c1487z.D(GeometryKt.plus(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.perpCw(vector2D2), fFloatValue)), GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), 2.0f)));
                c1487z.D(GeometryKt.plus(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.perpCCw(vector2D2), fFloatValue)), GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), 2.0f)));
                c1487z.D(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.perpCCw(vector2D2), fFloatValue)));
                c1487z.ViF();
                s4Var.te(c1487z, ygVar);
                return;
            case 6:
                c1487z.ijL();
                c1487z.k(vector2D);
                c1487z.D(GeometryKt.plus(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.perpCw(vector2D2), fFloatValue)), GeometryKt.times(vector2D2, fFloatValue)));
                c1487z.D(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), 2.0f)));
                c1487z.D(GeometryKt.plus(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.perpCCw(vector2D2), fFloatValue)), GeometryKt.times(vector2D2, fFloatValue)));
                c1487z.ViF();
                s4Var.te(c1487z, ygVar);
                return;
            case 7:
                ygVar.ty(yg.w6.f11697t);
                c1487z.ijL();
                c1487z.k(vector2D);
                c1487z.D(GeometryKt.plus(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.perpCw(vector2D2), fFloatValue)), GeometryKt.times(vector2D2, fFloatValue)));
                c1487z.D(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), 2.0f)));
                c1487z.D(GeometryKt.plus(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.perpCCw(vector2D2), fFloatValue)), GeometryKt.times(vector2D2, fFloatValue)));
                c1487z.ViF();
                s4Var.te(c1487z, ygVar);
                return;
            case 8:
                c1487z.ijL();
                c1487z.k(vector2D);
                Vector2D vector2DPlus = GeometryKt.plus(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.perpCw(vector2D2), fFloatValue)), GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), 2.0f));
                Vector2D vector2DPlus2 = GeometryKt.plus(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.perpCCw(vector2D2), fFloatValue)), GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), 2.0f));
                Vector2D vector2DPlus3 = GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), 3.0f));
                c1487z.iF(vector2D, GeometryKt.minus(vector2DPlus, GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), f46037C)), vector2DPlus);
                c1487z.iF(GeometryKt.plus(vector2DPlus, GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), f46037C)), GeometryKt.plus(vector2DPlus3, GeometryKt.times(GeometryKt.times(GeometryKt.perpCw(vector2D2), fFloatValue), f46037C)), vector2DPlus3);
                c1487z.iF(GeometryKt.plus(vector2DPlus3, GeometryKt.times(GeometryKt.times(GeometryKt.perpCCw(vector2D2), fFloatValue), f46037C)), GeometryKt.plus(vector2DPlus2, GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), f46037C)), vector2DPlus2);
                c1487z.iF(GeometryKt.minus(vector2DPlus2, GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), f46037C)), vector2D, vector2D);
                c1487z.ViF();
                s4Var.te(c1487z, ygVar);
                return;
            case 9:
                ygVar.ty(yg.w6.f11697t);
                c1487z.ijL();
                c1487z.k(vector2D);
                Vector2D vector2DPlus4 = GeometryKt.plus(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.perpCw(vector2D2), fFloatValue)), GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), 2.0f));
                Vector2D vector2DPlus5 = GeometryKt.plus(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.perpCCw(vector2D2), fFloatValue)), GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), 2.0f));
                Vector2D vector2DPlus6 = GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), 3.0f));
                c1487z.iF(vector2D, GeometryKt.minus(vector2DPlus4, GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), f46037C)), vector2DPlus4);
                c1487z.iF(GeometryKt.plus(vector2DPlus4, GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), f46037C)), GeometryKt.plus(vector2DPlus6, GeometryKt.times(GeometryKt.times(GeometryKt.perpCw(vector2D2), fFloatValue), f46037C)), vector2DPlus6);
                c1487z.iF(GeometryKt.plus(vector2DPlus6, GeometryKt.times(GeometryKt.times(GeometryKt.perpCCw(vector2D2), fFloatValue), f46037C)), GeometryKt.plus(vector2DPlus5, GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), f46037C)), vector2DPlus5);
                c1487z.iF(GeometryKt.minus(vector2DPlus5, GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), f46037C)), vector2D, vector2D);
                c1487z.ViF();
                s4Var.te(c1487z, ygVar);
                return;
            case 10:
                c1487z.ijL();
                Vector2D vector2DPlus7 = GeometryKt.plus(vector2D, GeometryKt.times(vector2D2, fFloatValue));
                c1487z.Z(vector2DPlus7.getX(), vector2DPlus7.getY(), fFloatValue);
                s4Var.te(c1487z, ygVar);
                return;
            case 11:
                ygVar.ty(yg.w6.f11697t);
                c1487z.ijL();
                Vector2D vector2DPlus8 = GeometryKt.plus(vector2D, GeometryKt.times(vector2D2, fFloatValue));
                c1487z.Z(vector2DPlus8.getX(), vector2DPlus8.getY(), fFloatValue);
                s4Var.te(c1487z, ygVar);
                return;
            case 12:
                c1487z.ijL();
                c1487z.k(vector2D);
                c1487z.D(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.perpCw(vector2D2), fFloatValue)));
                c1487z.D(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), 2.0f)));
                c1487z.D(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.perpCCw(vector2D2), fFloatValue)));
                c1487z.ViF();
                s4Var.te(c1487z, ygVar);
                return;
            case 13:
                ygVar.ty(yg.w6.f11697t);
                c1487z.ijL();
                c1487z.k(vector2D);
                c1487z.D(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.perpCw(vector2D2), fFloatValue)));
                c1487z.D(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.times(vector2D2, fFloatValue), 2.0f)));
                c1487z.D(GeometryKt.plus(vector2D, GeometryKt.times(GeometryKt.perpCCw(vector2D2), fFloatValue)));
                c1487z.ViF();
                s4Var.te(c1487z, ygVar);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
