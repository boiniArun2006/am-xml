package com.alightcreative.app.motion.scene.scripting.builtin;

import HI0.rv6;
import android.graphics.Path;
import android.graphics.PathMeasure;
import com.alightcreative.app.motion.scene.CBKnot;
import com.alightcreative.app.motion.scene.CompoundCubicBSpline;
import com.alightcreative.app.motion.scene.CubicBSpline;
import com.alightcreative.app.motion.scene.CubicBSplineKt;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementType;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeRef;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt;
import com.alightcreative.app.motion.scene.scripting.ScriptEnv;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.safedk.android.internal.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"script_morphPath", "Lcom/alightcreative/app/motion/scene/SceneElement;", "el", "effectRef", "Lcom/alightcreative/app/motion/scene/visualeffect/KeyableVisualEffectRef;", "scriptEnv", "Lcom/alightcreative/app/motion/scene/scripting/ScriptEnv;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMorphPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MorphPath.kt\ncom/alightcreative/app/motion/scene/scripting/builtin/MorphPathKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtil.kt\ncom/alightcreative/ext/ListUtilKt\n*L\n1#1,86:1\n360#2,7:87\n1557#2:94\n1628#2,3:95\n1557#2:98\n1628#2,3:99\n1557#2:130\n1628#2,3:131\n117#3,14:102\n117#3,14:116\n*S KotlinDebug\n*F\n+ 1 MorphPath.kt\ncom/alightcreative/app/motion/scene/scripting/builtin/MorphPathKt\n*L\n27#1:87,7\n54#1:94\n54#1:95,3\n60#1:98\n60#1:99,3\n79#1:130\n79#1:131,3\n66#1:102,14\n67#1:116,14\n*E\n"})
public final class MorphPathKt {
    public static final SceneElement script_morphPath(SceneElement el, KeyableVisualEffectRef effectRef, ScriptEnv scriptEnv) {
        int i2;
        int i3;
        Keyable<Float> floatValue;
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(effectRef, "effectRef");
        Intrinsics.checkNotNullParameter(scriptEnv, "scriptEnv");
        float time = scriptEnv.getTime();
        KeyableUserParameterValue keyableUserParameterValue = effectRef.getParameters().get("progress");
        float fFloatValue = (keyableUserParameterValue == null || (floatValue = keyableUserParameterValue.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue, time)).floatValue();
        Iterator<SceneElement> it = scriptEnv.getScene().getElements().iterator();
        int i5 = 0;
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (it.next().getId() == el.getId()) {
                break;
            }
            i7++;
        }
        char c2 = 1;
        if (i7 < 1) {
            return el;
        }
        CompoundCubicBSpline shapeOutline = LiveShapeScriptKt.getShapeOutline(scriptEnv.getScene().getElements().get(i7 - 1), time);
        Path pathT = CubicBSplineKt.toPath(shapeOutline).t();
        CompoundCubicBSpline shapeOutline2 = LiveShapeScriptKt.getShapeOutline(el, time);
        Path pathT2 = CubicBSplineKt.toPath(shapeOutline2).t();
        PathMeasure pathMeasure = new PathMeasure(pathT, true);
        float length = pathMeasure.getLength();
        PathMeasure pathMeasure2 = new PathMeasure(pathT2, true);
        float length2 = pathMeasure.getLength();
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        if (fFloatValue < 1.0E-5f) {
            shapeOutline = shapeOutline2;
        } else if (fFloatValue <= 0.999999f) {
            IntRange intRange = new IntRange(0, d.f62986a);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
            Iterator<Integer> it2 = intRange.iterator();
            while (it2.hasNext()) {
                char c4 = c2;
                pathMeasure2.getPosTan((((IntIterator) it2).nextInt() / d.f62986a) * length2, fArr, fArr2);
                arrayList.add(new Vector2D(fArr[0], fArr[c4]));
                c2 = c4;
            }
            char c5 = c2;
            IntRange intRange2 = new IntRange(0, d.f62986a);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange2, 10));
            Iterator<Integer> it3 = intRange2.iterator();
            while (it3.hasNext()) {
                pathMeasure.getPosTan((((IntIterator) it3).nextInt() / d.f62986a) * length, fArr, fArr2);
                arrayList2.add(new Vector2D(fArr[0], fArr[c5]));
            }
            Iterator it4 = arrayList.iterator();
            if (it4.hasNext()) {
                Vector2D vector2D = (Vector2D) it4.next();
                float fAtan2 = (float) Math.atan2(vector2D.getX(), vector2D.getY());
                i2 = 0;
                int i8 = 0;
                while (it4.hasNext()) {
                    i8++;
                    Vector2D vector2D2 = (Vector2D) it4.next();
                    float fAtan22 = (float) Math.atan2(vector2D2.getX(), vector2D2.getY());
                    if (Float.compare(fAtan2, fAtan22) > 0) {
                        i2 = i8;
                        fAtan2 = fAtan22;
                    }
                }
            } else {
                i2 = -1;
            }
            List listUo = rv6.Uo(arrayList, i2);
            Iterator it5 = arrayList2.iterator();
            if (it5.hasNext()) {
                Vector2D vector2D3 = (Vector2D) it5.next();
                float fAtan23 = (float) Math.atan2(vector2D3.getX(), vector2D3.getY());
                int i9 = 0;
                while (it5.hasNext()) {
                    i9++;
                    Vector2D vector2D4 = (Vector2D) it5.next();
                    float fAtan24 = (float) Math.atan2(vector2D4.getX(), vector2D4.getY());
                    if (Float.compare(fAtan23, fAtan24) > 0) {
                        i5 = i9;
                        fAtan23 = fAtan24;
                    }
                }
                i3 = i5;
            } else {
                i3 = -1;
            }
            List<Pair> listZip = CollectionsKt.zip(listUo, rv6.Uo(arrayList2, i3));
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listZip, 10));
            for (Pair pair : listZip) {
                arrayList3.add(new CBKnot(GeometryKt.mix((Vector2D) pair.component1(), (Vector2D) pair.component2(), fFloatValue), null, null, 6, null));
            }
            shapeOutline2 = new CompoundCubicBSpline(CollectionsKt.listOf(new CubicBSpline(arrayList3, false, false, 4, null)));
            shapeOutline = shapeOutline2;
        }
        return SceneElement.copy$default(el, SceneElementType.Shape, 0, 0, 0L, null, null, null, null, null, null, null, null, null, CubicBSplineKt.keyable(shapeOutline), null, null, LiveShapeRef.INSTANCE.getNONE(), 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -73730, 127, null);
    }
}
