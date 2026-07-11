package com.alightcreative.app.motion.activities;

import LdY.Ml;
import QmE.j;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.view.ComponentActivity;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.BlendingMode;
import com.alightcreative.app.motion.scene.CameraElementKt;
import com.alightcreative.app.motion.scene.CameraProperties;
import com.alightcreative.app.motion.scene.CubicBSplineKt;
import com.alightcreative.app.motion.scene.ElementGroupingKt;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableFloat;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.KeyableTransform;
import com.alightcreative.app.motion.scene.KeyableVector2D;
import com.alightcreative.app.motion.scene.Keyframe;
import com.alightcreative.app.motion.scene.LayerParentingKt;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneElementType;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.StyleParams;
import com.alightcreative.app.motion.scene.TextElementKt;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.TransformKt;
import com.alightcreative.app.motion.scene.TrimmingKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeRef;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.protos.Sdk;
import d.AbstractC1951j;
import f0P.C2065oU;
import f0P.C2099zf;
import f0P.SAy;
import f0P.YSR;
import f0P.ZJ;
import f0P.mAi;
import f0P.oC;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class nSC implements yc.Um {
    private final VS J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final SJ0.CN3 f45555O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final EditActivity f45556n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final IG.Ml f45557t;

    public static final class Ml implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((SceneElement) obj).getStartTime()), Integer.valueOf(((SceneElement) obj2).getStartTime()));
        }
    }

    public static final class j implements Comparator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ EditActivity f45558n;

        public j(EditActivity editActivity) {
            this.f45558n = editActivity;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            SceneElement sceneElement = (SceneElement) obj;
            SceneElement sceneElement2 = (SceneElement) obj2;
            return ComparisonsKt.compareValues(Float.valueOf(((Vector3D) KeyableKt.valueAtTime(sceneElement.getTransform().getLocation(), SceneElementKt.fractionalTime(sceneElement, HW.C.XQ(this.f45558n)))).getX()), Float.valueOf(((Vector3D) KeyableKt.valueAtTime(sceneElement2.getTransform().getLocation(), SceneElementKt.fractionalTime(sceneElement2, HW.C.XQ(this.f45558n)))).getX()));
        }
    }

    public static final class n implements Comparator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ EditActivity f45559n;

        public n(EditActivity editActivity) {
            this.f45559n = editActivity;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            SceneElement sceneElement = (SceneElement) obj;
            SceneElement sceneElement2 = (SceneElement) obj2;
            return ComparisonsKt.compareValues(Float.valueOf(((Vector3D) KeyableKt.valueAtTime(sceneElement.getTransform().getLocation(), SceneElementKt.fractionalTime(sceneElement, HW.C.XQ(this.f45559n)))).getY()), Float.valueOf(((Vector3D) KeyableKt.valueAtTime(sceneElement2.getTransform().getLocation(), SceneElementKt.fractionalTime(sceneElement2, HW.C.XQ(this.f45559n)))).getY()));
        }
    }

    public static final class w6 implements Comparator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ EditActivity f45560n;

        public w6(EditActivity editActivity) {
            this.f45560n = editActivity;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            SceneElement sceneElement = (SceneElement) obj;
            SceneElement sceneElement2 = (SceneElement) obj2;
            return ComparisonsKt.compareValues(Float.valueOf(((Vector3D) KeyableKt.valueAtTime(sceneElement.getTransform().getLocation(), SceneElementKt.fractionalTime(sceneElement, HW.C.XQ(this.f45560n)))).getX()), Float.valueOf(((Vector3D) KeyableKt.valueAtTime(sceneElement2.getTransform().getLocation(), SceneElementKt.fractionalTime(sceneElement2, HW.C.XQ(this.f45560n)))).getX()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ViF(float f3, float f4, float f5) {
        return (f5 * f3) + f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float WPU(float f3, float f4, float f5) {
        return (f5 * f3) + f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float aYN(float f3, float f4) {
        return f4 * f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float nY(float f3, float f4) {
        return f4 * f3;
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    public static void safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(ComponentActivity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x1534  */
    /* JADX WARN: Type inference failed for: r3v178 */
    /* JADX WARN: Type inference failed for: r3v179 */
    /* JADX WARN: Type inference failed for: r3v187 */
    /* JADX WARN: Type inference failed for: r3v188 */
    /* JADX WARN: Type inference failed for: r3v190 */
    /* JADX WARN: Type inference failed for: r3v191 */
    /* JADX WARN: Type inference failed for: r5v116 */
    /* JADX WARN: Type inference failed for: r5v117 */
    /* JADX WARN: Type inference failed for: r5v119 */
    /* JADX WARN: Type inference failed for: r5v125 */
    /* JADX WARN: Type inference failed for: r5v126 */
    /* JADX WARN: Type inference failed for: r5v129 */
    /* JADX WARN: Type inference failed for: r5v152 */
    /* JADX WARN: Type inference failed for: r5v153 */
    /* JADX WARN: Type inference failed for: r5v155 */
    /* JADX WARN: Type inference failed for: r5v161 */
    /* JADX WARN: Type inference failed for: r5v162 */
    /* JADX WARN: Type inference failed for: r5v165 */
    /* JADX WARN: Type inference failed for: r5v173 */
    /* JADX WARN: Type inference failed for: r5v174 */
    /* JADX WARN: Type inference failed for: r5v177 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v280 */
    /* JADX WARN: Type inference failed for: r5v281 */
    /* JADX WARN: Type inference failed for: r5v284 */
    /* JADX WARN: Type inference failed for: r5v299 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v300 */
    /* JADX WARN: Type inference failed for: r5v303 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v89 */
    /* JADX WARN: Type inference failed for: r5v95 */
    /* JADX WARN: Type inference failed for: r5v96 */
    /* JADX WARN: Type inference failed for: r5v99 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r7v114 */
    /* JADX WARN: Type inference failed for: r7v115 */
    /* JADX WARN: Type inference failed for: r7v118 */
    /* JADX WARN: Type inference failed for: r7v138 */
    /* JADX WARN: Type inference failed for: r7v139 */
    /* JADX WARN: Type inference failed for: r7v142 */
    /* JADX WARN: Type inference failed for: r8v100 */
    /* JADX WARN: Type inference failed for: r8v103 */
    /* JADX WARN: Type inference failed for: r8v104 */
    /* JADX WARN: Type inference failed for: r8v108 */
    /* JADX WARN: Type inference failed for: r8v109 */
    /* JADX WARN: Type inference failed for: r8v111 */
    /* JADX WARN: Type inference failed for: r8v112 */
    /* JADX WARN: Type inference failed for: r8v114 */
    /* JADX WARN: Type inference failed for: r8v115 */
    /* JADX WARN: Type inference failed for: r8v116 */
    /* JADX WARN: Type inference failed for: r8v117 */
    /* JADX WARN: Type inference failed for: r8v118 */
    /* JADX WARN: Type inference failed for: r8v96 */
    /* JADX WARN: Type inference failed for: r8v97 */
    /* JADX WARN: Type inference failed for: r8v99 */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v66 */
    /* JADX WARN: Type inference failed for: r9v69 */
    /* JADX WARN: Type inference failed for: r9v70 */
    /* JADX WARN: Type inference failed for: r9v75 */
    /* JADX WARN: Type inference failed for: r9v76 */
    /* JADX WARN: Type inference failed for: r9v78 */
    /* JADX WARN: Type inference failed for: r9v79 */
    /* JADX WARN: Type inference failed for: r9v81 */
    /* JADX WARN: Type inference failed for: r9v82 */
    /* JADX WARN: Type inference failed for: r9v83 */
    /* JADX WARN: Type inference failed for: r9v84 */
    /* JADX WARN: Type inference failed for: r9v85 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // yc.Um
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void rV9(int i2) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        Object next7;
        Object next8;
        int i3;
        List listRl;
        SceneElement sceneElement;
        com.alightcreative.widget.U4 u4;
        Uri fillVideo;
        SceneElement sceneElement2;
        Scene scene;
        Object obj;
        SceneElement sceneElementCopy$default;
        SceneElement sceneElement3;
        SceneElement sceneElement4;
        SceneElement sceneElement5;
        int i5;
        BlendingMode blendingMode;
        Integer numValueOf;
        final EditActivity editActivity = this.f45556n;
        float f3 = 0.0f;
        i = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        switch (i2) {
            case 2131361854:
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").addCategory("android.intent.category.OPENABLE").setType("audio/*");
                Intrinsics.checkNotNullExpressionValue(type, "setType(...)");
                safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(editActivity, type, 2);
                break;
            case 2131361858:
                Intent type2 = new Intent("android.intent.action.OPEN_DOCUMENT").addCategory("android.intent.category.OPENABLE").setType("image/*");
                Intrinsics.checkNotNullExpressionValue(type2, "setType(...)");
                safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(editActivity, type2, 1);
                break;
            case 2131361865:
                this.J2.v();
                QmE.iF iFVarLm1 = editActivity.lm1();
                String string = editActivity.getProjectHolder().Uo().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                iFVarLm1.n(new j.T(string, rWZ.C.E2));
                break;
            case 2131361866:
                Intent type3 = new Intent("android.intent.action.OPEN_DOCUMENT").addCategory("android.intent.category.OPENABLE").setType("video/*");
                Intrinsics.checkNotNullExpressionValue(type3, "setType(...)");
                safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(editActivity, type3, 3);
                break;
            case 2131361867:
                QmE.iF iFVarLm12 = editActivity.lm1();
                Bundle bundle = new Bundle();
                bundle.putString(FileUploadManager.f61572j, "align_bottom");
                Unit unit = Unit.INSTANCE;
                iFVarLm12.n(new j.fuX("align_and_distribute", bundle));
                List<SceneElement> elements = Ik().get_scene().getElements();
                ArrayList<SceneElement> arrayList = new ArrayList();
                for (Object obj2 : elements) {
                    SceneElement sceneElement6 = (SceneElement) obj2;
                    if ((editActivity.UpJ().contains(Long.valueOf(sceneElement6.getId())) && sceneElement6.getType().getHasTransform()) != false) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                for (SceneElement sceneElement7 : arrayList) {
                    arrayList2.add(TuplesKt.to(sceneElement7, SceneElementKt.boundsAtTime(sceneElement7, Ik().get_scene(), SceneElementKt.fractionalTime(sceneElement7, HW.C.XQ(editActivity)), HW.C.HI(editActivity), Ik().get_scene().getFramesPerHundredSeconds())));
                }
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        float bottom = ((Rectangle) ((Pair) next).getSecond()).getBottom();
                        do {
                            Object next9 = it.next();
                            float bottom2 = ((Rectangle) ((Pair) next9).getSecond()).getBottom();
                            if (Float.compare(bottom, bottom2) < 0) {
                                next = next9;
                                bottom = bottom2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Pair pair = (Pair) next;
                if (pair == null) {
                    return;
                }
                Rectangle rectangle = (Rectangle) pair.component2();
                List<Pair> listMinus = CollectionsKt.minus(arrayList2, pair);
                if (listMinus.isEmpty()) {
                    return;
                }
                Ml.j jVarCk = editActivity.ck();
                for (Pair pair2 : listMinus) {
                    SceneElement sceneElement8 = (SceneElement) pair2.component1();
                    float bottom3 = rectangle.getBottom() - ((Rectangle) pair2.component2()).getBottom();
                    if ((bottom3 == 0.0f) == false) {
                        Ik().update(SceneElement.copy$default(sceneElement8, null, 0, 0, 0L, null, null, TransformKt.translatedBy(sceneElement8.getTransform(), 0.0f, bottom3), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
                    }
                }
                jVarCk.n();
                break;
            case 2131361868:
                QmE.iF iFVarLm13 = editActivity.lm1();
                Bundle bundle2 = new Bundle();
                bundle2.putString(FileUploadManager.f61572j, "align_endtime");
                Unit unit2 = Unit.INSTANCE;
                iFVarLm13.n(new j.fuX("align_and_distribute", bundle2));
                List<SceneElement> elements2 = Ik().get_scene().getElements();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : elements2) {
                    if (editActivity.UpJ().contains(Long.valueOf(((SceneElement) obj3).getId()))) {
                        arrayList3.add(obj3);
                    }
                }
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (it2.hasNext()) {
                        int endTime = ((SceneElement) next2).getEndTime();
                        do {
                            Object next10 = it2.next();
                            int endTime2 = ((SceneElement) next10).getEndTime();
                            if (endTime < endTime2) {
                                next2 = next10;
                                endTime = endTime2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next2 = null;
                }
                SceneElement sceneElement9 = (SceneElement) next2;
                if (sceneElement9 == null) {
                    return;
                }
                List<SceneElement> listMinus2 = CollectionsKt.minus(arrayList3, sceneElement9);
                if (listMinus2.isEmpty()) {
                    return;
                }
                Ml.j jVarCk2 = editActivity.ck();
                for (SceneElement sceneElement10 : listMinus2) {
                    int endTime3 = sceneElement9.getEndTime() - sceneElement10.getEndTime();
                    Ik().update(SceneElement.copy$default(sceneElement10, null, sceneElement10.getStartTime() + endTime3, sceneElement10.getEndTime() + endTime3, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -7, 127, null));
                }
                jVarCk2.n();
                break;
            case 2131361869:
                QmE.iF iFVarLm14 = editActivity.lm1();
                Bundle bundle3 = new Bundle();
                bundle3.putString(FileUploadManager.f61572j, "align_hcenter");
                Unit unit3 = Unit.INSTANCE;
                iFVarLm14.n(new j.fuX("align_and_distribute", bundle3));
                List<SceneElement> elements3 = Ik().get_scene().getElements();
                ArrayList<SceneElement> arrayList4 = new ArrayList();
                for (Object obj4 : elements3) {
                    SceneElement sceneElement11 = (SceneElement) obj4;
                    if ((editActivity.UpJ().contains(Long.valueOf(sceneElement11.getId())) && sceneElement11.getType().getHasTransform()) != false) {
                        arrayList4.add(obj4);
                    }
                }
                ArrayList<Pair> arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                for (SceneElement sceneElement12 : arrayList4) {
                    arrayList5.add(TuplesKt.to(sceneElement12, SceneElementKt.boundsAtTime(sceneElement12, Ik().get_scene(), SceneElementKt.fractionalTime(sceneElement12, HW.C.XQ(editActivity)), HW.C.HI(editActivity), Ik().get_scene().getFramesPerHundredSeconds())));
                }
                Iterator it3 = arrayList5.iterator();
                if (it3.hasNext()) {
                    next3 = it3.next();
                    if (it3.hasNext()) {
                        float left = ((Rectangle) ((Pair) next3).getSecond()).getLeft();
                        do {
                            Object next11 = it3.next();
                            float left2 = ((Rectangle) ((Pair) next11).getSecond()).getLeft();
                            if (Float.compare(left, left2) > 0) {
                                next3 = next11;
                                left = left2;
                            }
                        } while (it3.hasNext());
                    }
                } else {
                    next3 = null;
                }
                Pair pair3 = (Pair) next3;
                if (pair3 == null) {
                    return;
                }
                Iterator it4 = arrayList5.iterator();
                if (it4.hasNext()) {
                    next4 = it4.next();
                    if (it4.hasNext()) {
                        float right = ((Rectangle) ((Pair) next4).getSecond()).getRight();
                        do {
                            Object next12 = it4.next();
                            float right2 = ((Rectangle) ((Pair) next12).getSecond()).getRight();
                            if (Float.compare(right, right2) < 0) {
                                next4 = next12;
                                right = right2;
                            }
                        } while (it4.hasNext());
                    }
                } else {
                    next4 = null;
                }
                Pair pair4 = (Pair) next4;
                if (pair4 == null) {
                    return;
                }
                float left3 = (((Rectangle) pair3.getSecond()).getLeft() + ((Rectangle) pair4.getSecond()).getRight()) / 2.0f;
                if (arrayList5.isEmpty()) {
                    return;
                }
                Ml.j jVarCk3 = editActivity.ck();
                for (Pair pair5 : arrayList5) {
                    SceneElement sceneElement13 = (SceneElement) pair5.component1();
                    float cx = left3 - ((Rectangle) pair5.component2()).getCx();
                    if ((cx == 0.0f) == false) {
                        Ik().update(SceneElement.copy$default(sceneElement13, null, 0, 0, 0L, null, null, TransformKt.translatedBy(sceneElement13.getTransform(), cx, 0.0f), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
                    }
                }
                jVarCk3.n();
                break;
            case 2131361870:
                QmE.iF iFVarLm15 = editActivity.lm1();
                Bundle bundle4 = new Bundle();
                bundle4.putString(FileUploadManager.f61572j, "align_left");
                Unit unit4 = Unit.INSTANCE;
                iFVarLm15.n(new j.fuX("align_and_distribute", bundle4));
                List<SceneElement> elements4 = Ik().get_scene().getElements();
                ArrayList<SceneElement> arrayList6 = new ArrayList();
                for (Object obj5 : elements4) {
                    SceneElement sceneElement14 = (SceneElement) obj5;
                    if ((editActivity.UpJ().contains(Long.valueOf(sceneElement14.getId())) && sceneElement14.getType().getHasTransform()) != false) {
                        arrayList6.add(obj5);
                    }
                }
                ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
                for (SceneElement sceneElement15 : arrayList6) {
                    arrayList7.add(TuplesKt.to(sceneElement15, SceneElementKt.boundsAtTime(sceneElement15, Ik().get_scene(), SceneElementKt.fractionalTime(sceneElement15, HW.C.XQ(editActivity)), HW.C.HI(editActivity), Ik().get_scene().getFramesPerHundredSeconds())));
                }
                Iterator it5 = arrayList7.iterator();
                if (it5.hasNext()) {
                    next5 = it5.next();
                    if (it5.hasNext()) {
                        float left4 = ((Rectangle) ((Pair) next5).getSecond()).getLeft();
                        do {
                            Object next13 = it5.next();
                            float left5 = ((Rectangle) ((Pair) next13).getSecond()).getLeft();
                            if (Float.compare(left4, left5) > 0) {
                                next5 = next13;
                                left4 = left5;
                            }
                        } while (it5.hasNext());
                    }
                } else {
                    next5 = null;
                }
                Pair pair6 = (Pair) next5;
                if (pair6 == null) {
                    return;
                }
                Rectangle rectangle2 = (Rectangle) pair6.component2();
                List<Pair> listMinus3 = CollectionsKt.minus(arrayList7, pair6);
                if (listMinus3.isEmpty()) {
                    return;
                }
                Ml.j jVarCk4 = editActivity.ck();
                for (Pair pair7 : listMinus3) {
                    SceneElement sceneElement16 = (SceneElement) pair7.component1();
                    float left6 = rectangle2.getLeft() - ((Rectangle) pair7.component2()).getLeft();
                    if ((left6 == 0.0f) == false) {
                        Ik().update(SceneElement.copy$default(sceneElement16, null, 0, 0, 0L, null, null, TransformKt.translatedBy(sceneElement16.getTransform(), left6, 0.0f), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
                    }
                }
                jVarCk4.n();
                break;
            case 2131361871:
                QmE.iF iFVarLm16 = editActivity.lm1();
                Bundle bundle5 = new Bundle();
                bundle5.putString(FileUploadManager.f61572j, "align_right");
                Unit unit5 = Unit.INSTANCE;
                iFVarLm16.n(new j.fuX("align_and_distribute", bundle5));
                List<SceneElement> elements5 = Ik().get_scene().getElements();
                ArrayList<SceneElement> arrayList8 = new ArrayList();
                for (Object obj6 : elements5) {
                    SceneElement sceneElement17 = (SceneElement) obj6;
                    if ((editActivity.UpJ().contains(Long.valueOf(sceneElement17.getId())) && sceneElement17.getType().getHasTransform()) != false) {
                        arrayList8.add(obj6);
                    }
                }
                ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList8, 10));
                for (SceneElement sceneElement18 : arrayList8) {
                    arrayList9.add(TuplesKt.to(sceneElement18, SceneElementKt.boundsAtTime(sceneElement18, Ik().get_scene(), SceneElementKt.fractionalTime(sceneElement18, HW.C.XQ(editActivity)), HW.C.HI(editActivity), Ik().get_scene().getFramesPerHundredSeconds())));
                }
                Iterator it6 = arrayList9.iterator();
                if (it6.hasNext()) {
                    next6 = it6.next();
                    if (it6.hasNext()) {
                        float right3 = ((Rectangle) ((Pair) next6).getSecond()).getRight();
                        do {
                            Object next14 = it6.next();
                            float right4 = ((Rectangle) ((Pair) next14).getSecond()).getRight();
                            if (Float.compare(right3, right4) < 0) {
                                next6 = next14;
                                right3 = right4;
                            }
                        } while (it6.hasNext());
                    }
                } else {
                    next6 = null;
                }
                Pair pair8 = (Pair) next6;
                if (pair8 == null) {
                    return;
                }
                Rectangle rectangle3 = (Rectangle) pair8.component2();
                List<Pair> listMinus4 = CollectionsKt.minus(arrayList9, pair8);
                if (listMinus4.isEmpty()) {
                    return;
                }
                Ml.j jVarCk5 = editActivity.ck();
                for (Pair pair9 : listMinus4) {
                    SceneElement sceneElement19 = (SceneElement) pair9.component1();
                    float right5 = rectangle3.getRight() - ((Rectangle) pair9.component2()).getRight();
                    if ((right5 == 0.0f) == false) {
                        Ik().update(SceneElement.copy$default(sceneElement19, null, 0, 0, 0L, null, null, TransformKt.translatedBy(sceneElement19.getTransform(), right5, 0.0f), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
                    }
                }
                jVarCk5.n();
                break;
            case 2131361872:
                QmE.iF iFVarLm17 = editActivity.lm1();
                Bundle bundle6 = new Bundle();
                bundle6.putString(FileUploadManager.f61572j, "align_starttime");
                Unit unit6 = Unit.INSTANCE;
                iFVarLm17.n(new j.fuX("align_and_distribute", bundle6));
                List<SceneElement> elements6 = Ik().get_scene().getElements();
                ArrayList arrayList10 = new ArrayList();
                for (Object obj7 : elements6) {
                    if (editActivity.UpJ().contains(Long.valueOf(((SceneElement) obj7).getId()))) {
                        arrayList10.add(obj7);
                    }
                }
                Iterator it7 = arrayList10.iterator();
                if (it7.hasNext()) {
                    next7 = it7.next();
                    if (it7.hasNext()) {
                        int startTime = ((SceneElement) next7).getStartTime();
                        do {
                            Object next15 = it7.next();
                            int startTime2 = ((SceneElement) next15).getStartTime();
                            if (startTime > startTime2) {
                                next7 = next15;
                                startTime = startTime2;
                            }
                        } while (it7.hasNext());
                    }
                } else {
                    next7 = null;
                }
                SceneElement sceneElement20 = (SceneElement) next7;
                if (sceneElement20 == null) {
                    return;
                }
                List<SceneElement> listMinus5 = CollectionsKt.minus(arrayList10, sceneElement20);
                if (listMinus5.isEmpty()) {
                    return;
                }
                Ml.j jVarCk6 = editActivity.ck();
                for (SceneElement sceneElement21 : listMinus5) {
                    int startTime3 = sceneElement20.getStartTime() - sceneElement21.getStartTime();
                    Ik().update(SceneElement.copy$default(sceneElement21, null, sceneElement21.getStartTime() + startTime3, sceneElement21.getEndTime() + startTime3, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -7, 127, null));
                }
                jVarCk6.n();
                break;
            case 2131361873:
                QmE.iF iFVarLm18 = editActivity.lm1();
                Bundle bundle7 = new Bundle();
                bundle7.putString(FileUploadManager.f61572j, "align_top");
                Unit unit7 = Unit.INSTANCE;
                iFVarLm18.n(new j.fuX("align_and_distribute", bundle7));
                List<SceneElement> elements7 = Ik().get_scene().getElements();
                ArrayList<SceneElement> arrayList11 = new ArrayList();
                for (Object obj8 : elements7) {
                    SceneElement sceneElement22 = (SceneElement) obj8;
                    if ((editActivity.UpJ().contains(Long.valueOf(sceneElement22.getId())) && sceneElement22.getType().getHasTransform()) != false) {
                        arrayList11.add(obj8);
                    }
                }
                ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                for (SceneElement sceneElement23 : arrayList11) {
                    arrayList12.add(TuplesKt.to(sceneElement23, SceneElementKt.boundsAtTime(sceneElement23, Ik().get_scene(), SceneElementKt.fractionalTime(sceneElement23, HW.C.XQ(editActivity)), HW.C.HI(editActivity), Ik().get_scene().getFramesPerHundredSeconds())));
                }
                Iterator it8 = arrayList12.iterator();
                if (it8.hasNext()) {
                    next8 = it8.next();
                    if (it8.hasNext()) {
                        float top = ((Rectangle) ((Pair) next8).getSecond()).getTop();
                        do {
                            Object next16 = it8.next();
                            float top2 = ((Rectangle) ((Pair) next16).getSecond()).getTop();
                            if (Float.compare(top, top2) > 0) {
                                next8 = next16;
                                top = top2;
                            }
                        } while (it8.hasNext());
                    }
                } else {
                    next8 = null;
                }
                Pair pair10 = (Pair) next8;
                if (pair10 == null) {
                    return;
                }
                Rectangle rectangle4 = (Rectangle) pair10.component2();
                List<Pair> listMinus6 = CollectionsKt.minus(arrayList12, pair10);
                if (listMinus6.isEmpty()) {
                    return;
                }
                Ml.j jVarCk7 = editActivity.ck();
                for (Pair pair11 : listMinus6) {
                    SceneElement sceneElement24 = (SceneElement) pair11.component1();
                    float top3 = rectangle4.getTop() - ((Rectangle) pair11.component2()).getTop();
                    if ((top3 == 0.0f) == false) {
                        Ik().update(SceneElement.copy$default(sceneElement24, null, 0, 0, 0L, null, null, TransformKt.translatedBy(sceneElement24.getTransform(), 0.0f, top3), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
                    }
                }
                jVarCk7.n();
                break;
            case 2131361874:
                QmE.iF iFVarLm19 = editActivity.lm1();
                Bundle bundle8 = new Bundle();
                bundle8.putString(FileUploadManager.f61572j, "align_vcenter");
                Unit unit8 = Unit.INSTANCE;
                iFVarLm19.n(new j.fuX("align_and_distribute", bundle8));
                List<SceneElement> elements8 = Ik().get_scene().getElements();
                ArrayList arrayList13 = new ArrayList();
                for (Object obj9 : elements8) {
                    SceneElement sceneElement25 = (SceneElement) obj9;
                    if ((editActivity.UpJ().contains(Long.valueOf(sceneElement25.getId())) && sceneElement25.getType().getHasTransform()) != false) {
                        arrayList13.add(obj9);
                    }
                }
                List listSortedWith = CollectionsKt.sortedWith(arrayList13, new j(editActivity));
                SceneElement sceneElement26 = (SceneElement) CollectionsKt.firstOrNull(listSortedWith);
                if (sceneElement26 == null) {
                    return;
                }
                Vector3D vector3D = (Vector3D) KeyableKt.valueAtTime(sceneElement26.getTransform().getLocation(), SceneElementKt.fractionalTime(sceneElement26, HW.C.XQ(editActivity)));
                List<SceneElement> listDrop = CollectionsKt.drop(listSortedWith, 1);
                if (listDrop.isEmpty()) {
                    return;
                }
                Ml.j jVarCk8 = editActivity.ck();
                for (SceneElement sceneElement27 : listDrop) {
                    float y2 = vector3D.getY() - ((Vector3D) KeyableKt.valueAtTime(sceneElement27.getTransform().getLocation(), SceneElementKt.fractionalTime(sceneElement27, HW.C.XQ(editActivity)))).getY();
                    if ((y2 == 0.0f) == false) {
                        Ik().update(SceneElement.copy$default(sceneElement27, null, 0, 0, 0L, null, null, TransformKt.translatedBy(sceneElement27.getTransform(), 0.0f, y2), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
                    }
                }
                jVarCk8.n();
                break;
            case 2131361895:
                editActivity.lm1().n(new j.r(editActivity.Uo()));
                List<SceneElement> elements9 = Ik().get_scene().getElements();
                if (elements9 == null || !elements9.isEmpty()) {
                    Iterator it9 = elements9.iterator();
                    i3 = 0;
                    while (it9.hasNext()) {
                        if (editActivity.UpJ().contains(Long.valueOf(((SceneElement) it9.next()).getId())) && (i3 = i3 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                } else {
                    i3 = 0;
                }
                if (i3 >= 1) {
                    QmE.iF iFVarLm110 = editActivity.lm1();
                    Bundle bundle9 = new Bundle();
                    bundle9.putInt(JavetError.PARAMETER_COUNT, editActivity.UpJ().size());
                    Unit unit9 = Unit.INSTANCE;
                    iFVarLm110.n(new j.fuX("layer_copy", bundle9));
                    I7a.Uo(null);
                    List<SceneElement> elements10 = Ik().get_scene().getElements();
                    ArrayList<SceneElement> arrayList14 = new ArrayList();
                    for (Object obj10 : elements10) {
                        if (editActivity.UpJ().contains(Long.valueOf(((SceneElement) obj10).getId()))) {
                            arrayList14.add(obj10);
                        }
                    }
                    ArrayList arrayList15 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList14, 10));
                    Iterator it10 = arrayList14.iterator();
                    while (it10.hasNext()) {
                        arrayList15.add(Long.valueOf(((SceneElement) it10.next()).getId()));
                    }
                    ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList14, 10));
                    for (SceneElement sceneElementUpdateParent : arrayList14) {
                        if (sceneElementUpdateParent.getParent() != null && !arrayList15.contains(sceneElementUpdateParent.getParent())) {
                            sceneElementUpdateParent = LayerParentingKt.updateParent(sceneElementUpdateParent, Ik().get_scene(), null, SceneElementKt.fractionalTime(sceneElementUpdateParent, HW.C.XQ(editActivity)));
                        }
                        arrayList16.add(sceneElementUpdateParent);
                    }
                    I7a.J2(arrayList16);
                    List listRl2 = I7a.rl();
                    if ((listRl2 != null ? listRl2.size() : 0) == 1 && (listRl = I7a.rl()) != null && (sceneElement = (SceneElement) CollectionsKt.first(listRl)) != null) {
                        com.alightcreative.widget.U4 u42 = com.alightcreative.widget.U4.f47305r;
                        u42.J2(true);
                        u42.nr(sceneElement.getType().getHasBlendingMode());
                        Unit unit10 = Unit.INSTANCE;
                        com.alightcreative.widget.U4 u43 = com.alightcreative.widget.U4.f47304o;
                        u43.J2(true);
                        u43.nr(sceneElement.getType().getHasTransform());
                        com.alightcreative.widget.U4 u44 = com.alightcreative.widget.U4.J2;
                        u44.J2(true);
                        u44.nr(sceneElement.getType().getHasBorderAndShadow());
                        com.alightcreative.widget.U4 u45 = com.alightcreative.widget.U4.f47303g;
                        u45.J2(true);
                        u45.nr(sceneElement.getType().getHasVisualEffects());
                        com.alightcreative.widget.U4 u46 = com.alightcreative.widget.U4.f47298O;
                        u46.J2(true);
                        u46.nr(sceneElement.getType() != SceneElementType.Audio);
                        com.alightcreative.widget.U4 u47 = com.alightcreative.widget.U4.E2;
                        if (sceneElement.getType() == SceneElementType.Scene || !SceneElementKt.hasAnyAudio(sceneElement)) {
                            u4 = com.alightcreative.widget.U4.f47301Z;
                            u4.J2(true);
                            u4.nr(sceneElement.getType().getHasText());
                        } else {
                            u4 = com.alightcreative.widget.U4.f47299S;
                        }
                        I7a.Uo(new com.alightcreative.widget.h6y(SetsKt.setOf((Object[]) new com.alightcreative.widget.U4[]{u42, u43, u44, u45, u46, u47, u4})));
                    }
                }
                break;
            case 2131361931:
                SceneElement sceneElementT = HW.C.T(editActivity);
                if (sceneElementT == null) {
                    return;
                }
                if (sceneElementT.getType() == SceneElementType.Audio) {
                    fillVideo = sceneElementT.getSrc();
                } else {
                    Uri fillImage = sceneElementT.getFillImage();
                    fillVideo = fillImage == null ? sceneElementT.getFillVideo() : fillImage;
                }
                if (fillVideo == null) {
                    return;
                }
                tu.SPz sPzTe = tu.r.te(new HI0.Q(editActivity), fillVideo, false, 4, null);
                tu.aC aCVar = sPzTe instanceof tu.aC ? (tu.aC) sPzTe : null;
                if (aCVar == null) {
                    return;
                }
                LayoutInflater layoutInflater = editActivity.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
                HI0.afx.nY(editActivity, aCVar, layoutInflater);
                break;
            case 2131361953:
                SceneElement sceneElementT2 = HW.C.T(editActivity);
                if (sceneElementT2 == null) {
                    return;
                }
                UUID linkedSceneUUID = sceneElementT2.getLinkedSceneUUID();
                if (linkedSceneUUID != null && !HI0.afx.Z(editActivity, linkedSceneUUID).exists()) {
                    Scene nestedScene = sceneElementT2.getNestedScene();
                    File fileZ = HI0.afx.Z(editActivity, sceneElementT2.getLinkedSceneUUID());
                    if (fileZ.exists()) {
                        throw new IllegalStateException();
                    }
                    FilesKt.writeText$default(fileZ, SceneSerializerKt.serializeScene$default(nestedScene, false, null, false, false, null, 62, null), null, 2, null);
                    editActivity.az();
                    QmE.iF iFVarLm111 = editActivity.lm1();
                    Bundle bundle10 = new Bundle();
                    bundle10.putString("type", nestedScene.getType().getLabel());
                    Unit unit11 = Unit.INSTANCE;
                    iFVarLm111.n(new j.fuX("missing_recreate_project", bundle10));
                    Toast.makeText(editActivity, nestedScene.getType() == SceneType.ELEMENT ? 2132020096 : 2132017541, 0).show();
                }
                break;
                break;
            case 2131361957:
                HW.C.J(editActivity, new Function2() { // from class: com.alightcreative.app.motion.activities.U4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj11, Object obj12) {
                        return nSC.fD(this.f44784n, (Scene) obj11, (SceneElement) obj12);
                    }
                });
                break;
            case 2131361958:
                HW.C.J(editActivity, new Function2() { // from class: com.alightcreative.app.motion.activities.tI
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj11, Object obj12) {
                        return nSC.X((Scene) obj11, (SceneElement) obj12);
                    }
                });
                break;
            case 2131361959:
                HW.C.J(editActivity, new Function2() { // from class: com.alightcreative.app.motion.activities.oXP
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj11, Object obj12) {
                        return nSC.iF((Scene) obj11, (SceneElement) obj12);
                    }
                });
                break;
            case 2131361960:
                HW.C.J(editActivity, new Function2() { // from class: com.alightcreative.app.motion.activities.h6y
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj11, Object obj12) {
                        return nSC.E2((Scene) obj11, (SceneElement) obj12);
                    }
                });
                break;
            case 2131361961:
                HW.C.J(editActivity, new Function2() { // from class: com.alightcreative.app.motion.activities.lS
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj11, Object obj12) {
                        return nSC.e((Scene) obj11, (SceneElement) obj12);
                    }
                });
                break;
            case 2131361962:
                HW.C.J(editActivity, new Function2() { // from class: com.alightcreative.app.motion.activities.V1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj11, Object obj12) {
                        return nSC.te((Scene) obj11, (SceneElement) obj12);
                    }
                });
                break;
            case 2131361964:
                SceneElement sceneElementT3 = HW.C.T(editActivity);
                if (sceneElementT3 != null) {
                    Rectangle rectangleBoundsOverLifetime = SceneElementKt.boundsOverLifetime(sceneElementT3, Ik().get_scene());
                    if (sceneElementT3.getType() == SceneElementType.Scene) {
                        Transform transformValueAtTime = sceneElementT3.getTransform().valueAtTime(SceneElementKt.fractionalTime(sceneElementT3, HW.C.XQ(editActivity)));
                        int width = Ik().get_scene().getWidth();
                        int height = Ik().get_scene().getHeight();
                        int width2 = Ik().get_scene().getWidth();
                        int height2 = Ik().get_scene().getHeight();
                        List<SceneElement> elements11 = sceneElementT3.getNestedScene().getElements();
                        ArrayList arrayList17 = new ArrayList(CollectionsKt.collectionSizeOrDefault(elements11, 10));
                        for (SceneElement sceneElement28 : elements11) {
                            Vector2D vector2D = (Vector2D) KeyableKt.valueAtTime(sceneElement28.getTransform().getPivot(), 0.0f);
                            arrayList17.add(SceneElement.copy$default(sceneElement28, null, 0, 0, 0L, null, null, TransformKt.translatedBy(TransformKt.translatedBy(TransformKt.translatedBy(TransformKt.locationScaledBy(TransformKt.scaledBy$default(TransformKt.translatedBy(TransformKt.translatedBy(sceneElement28.getTransform(), GeometryKt.minus(GeometryKt.unaryMinus(transformValueAtTime.getPivot()), GeometryKt.div(SceneKt.getSize(sceneElementT3.getNestedScene()), 2))), vector2D), transformValueAtTime.getScale(), 0.0f, 0.0f, 6, null), transformValueAtTime.getScale()), GeometryKt.unaryMinus(vector2D)), transformValueAtTime.getPivot()), transformValueAtTime.getLocation()), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
                        }
                        scene = new Scene(null, 0, width, height, width2, height2, arrayList17, Ik().get_scene().getFramesPerHundredSeconds(), SolidColor.INSTANCE.getTRANSPARENT(), null, null, null, null, 0, 0, 0, false, 0L, null, Ik().get_scene().getTemplateLink(), 523779, null);
                        sceneElement2 = sceneElementT3;
                    } else {
                        float f4 = 2;
                        int width3 = (int) (rectangleBoundsOverLifetime.getWidth() + f4);
                        int height3 = (int) (rectangleBoundsOverLifetime.getHeight() + f4);
                        int width4 = (int) (rectangleBoundsOverLifetime.getWidth() + f4);
                        int height4 = (int) (rectangleBoundsOverLifetime.getHeight() + f4);
                        SceneElement sceneElementCopy$default2 = SceneElement.copy$default(sceneElementT3, null, 0, sceneElementT3.getEndTime() - sceneElementT3.getStartTime(), 0L, null, null, TransformKt.translatedBy(sceneElementT3.getTransform(), -rectangleBoundsOverLifetime.getLeft(), -rectangleBoundsOverLifetime.getTop()), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -71, 127, null);
                        sceneElement2 = sceneElementT3;
                        scene = new Scene(null, 0, width3, height3, width4, height4, CollectionsKt.listOf(sceneElementCopy$default2), Ik().get_scene().getFramesPerHundredSeconds(), SolidColor.INSTANCE.getTRANSPARENT(), null, null, null, null, 0, 0, 0, false, 0L, null, Ik().get_scene().getTemplateLink(), 523779, null);
                    }
                    Scene scene2 = scene;
                    UUID uuidRandomUUID = UUID.randomUUID();
                    Intrinsics.checkNotNull(uuidRandomUUID);
                    FilesKt.writeText$default(HI0.afx.Z(editActivity, uuidRandomUUID), SceneSerializerKt.serializeScene$default(Scene.copy$default(scene2, sceneElement2.getLabel(), 0, 0, 0, 0, 0, null, 0, null, null, SceneType.ELEMENT, null, null, 0, 0, 0, false, 0L, null, null, 1047550, null), false, null, false, false, null, 62, null), null, 2, null);
                    editActivity.az();
                    Toast.makeText(editActivity, 2132020096, 0).show();
                }
                break;
            case 2131361965:
                SceneElement sceneElementT4 = HW.C.T(editActivity);
                if (sceneElementT4 == null) {
                    return;
                }
                String displayLabel = SceneElementKt.getDisplayLabel(sceneElementT4);
                if (StringsKt.isBlank(displayLabel)) {
                    List presetsList = editActivity.getPresetsList();
                    ArrayList arrayList18 = new ArrayList(CollectionsKt.collectionSizeOrDefault(presetsList, 10));
                    Iterator it11 = presetsList.iterator();
                    while (it11.hasNext()) {
                        arrayList18.add(((ProjectInfo.n) it11.next()).getTitle());
                    }
                    Iterator it12 = SequencesKt.map(CollectionsKt.asSequence(new IntRange(1, 1000)), new Function1() { // from class: com.alightcreative.app.motion.activities.T
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj11) {
                            return nSC.g(editActivity, ((Integer) obj11).intValue());
                        }
                    }).iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            Object next17 = it12.next();
                            if (!arrayList18.contains((String) next17)) {
                                obj = next17;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    String str = (String) obj;
                    if (str == null) {
                        displayLabel = editActivity.getString(2132019040);
                        Intrinsics.checkNotNullExpressionValue(displayLabel, "getString(...)");
                    } else {
                        displayLabel = str;
                    }
                }
                String str2 = displayLabel;
                x0X.n nVarZ = this.f45557t.Z(editActivity.Uo(), Ik().get_scene(), sceneElementT4, HW.C.XQ(editActivity), str2);
                if (!(nVarZ instanceof n.C1266n)) {
                    if (!(nVarZ instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    editActivity.yRW((String) ((n.w6) nVarZ).n(), str2);
                }
                break;
                break;
            case 2131361966:
                editActivity.lm1().n(new j.C1436b(editActivity.Uo()));
                editActivity.i0();
                editActivity.vH3().Xw();
                break;
            case 2131361980:
                List<SceneElement> elements12 = Ik().get_scene().getElements();
                ArrayList arrayList19 = new ArrayList();
                for (Object obj11 : elements12) {
                    if (editActivity.UpJ().contains(Long.valueOf(((SceneElement) obj11).getId()))) {
                        arrayList19.add(obj11);
                    }
                }
                ArrayList arrayList20 = new ArrayList();
                for (Object obj12 : arrayList19) {
                    SceneElement sceneElement29 = (SceneElement) obj12;
                    if (sceneElement29.getStartTime() < HW.C.o(editActivity) && sceneElement29.getEndTime() > HW.C.Ik(editActivity)) {
                        arrayList20.add(obj12);
                    }
                }
                Ml.j jVarCk9 = editActivity.ck();
                int i10 = 0;
                for (Object obj13 : arrayList20) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    SceneElement sceneElement30 = (SceneElement) obj13;
                    int endTime4 = sceneElement30.getEndTime() - sceneElement30.getStartTime();
                    int endTime5 = sceneElement30.getEndTime() - HW.C.o(editActivity);
                    float f5 = endTime5;
                    final float startTime4 = (sceneElement30.getStartTime() - HW.C.o(editActivity)) / f5;
                    int iIk = HW.C.Ik(editActivity) - sceneElement30.getStartTime();
                    if (endTime5 >= 1 && iIk >= 1) {
                        float f6 = endTime4;
                        final float f7 = f6 / f5;
                        SceneElement sceneElementCopy$default3 = SceneElement.copy$default(SceneElementKt.copyAdjustingKeyframeTiming(sceneElement30, new Function1() { // from class: com.alightcreative.app.motion.activities.DC
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj14) {
                                return Float.valueOf(nSC.WPU(f7, startTime4, ((Float) obj14).floatValue()));
                            }
                        }), null, HW.C.o(editActivity), 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, TrimmingKt.recomputeInTime(sceneElement30, HW.C.o(editActivity)), 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -131075, 127, null);
                        final float f8 = f6 / iIk;
                        Ik().update(SceneElement.copy$default(SceneElementKt.copyAdjustingKeyframeTiming(sceneElement30, new Function1() { // from class: com.alightcreative.app.motion.activities.IG
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj14) {
                                return Float.valueOf(nSC.aYN(f8, ((Float) obj14).floatValue()));
                            }
                        }), null, 0, HW.C.Ik(editActivity), 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, TrimmingKt.recomputeOutTime(sceneElement30, HW.C.Ik(editActivity)), false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -262149, 127, null));
                        SceneHolder.DefaultImpls.add$default(Ik(), SceneElementKt.recreateEngineState(sceneElementCopy$default3), 0, 2, null);
                    }
                    i10 = i11;
                }
                jVarCk9.n();
                Ik().setSelection(SceneKt.getEMPTY_SCENE_SELECTION());
                break;
            case 2131361981:
                SceneElement sceneElementT5 = HW.C.T(editActivity);
                if (sceneElementT5 == null) {
                    return;
                }
                if (sceneElementT5.getType().getHasTransform()) {
                    Rectangle rectangleBoundsAtTime = SceneElementKt.boundsAtTime(sceneElementT5, Ik().get_scene(), SceneElementKt.fractionalTime(sceneElementT5, HW.C.XQ(editActivity)));
                    float width5 = Ik().get_scene().getWidth();
                    float height5 = Ik().get_scene().getHeight();
                    float width6 = (Ik().get_scene().getWidth() / 2.0f) - rectangleBoundsAtTime.getCx();
                    float height6 = (Ik().get_scene().getHeight() / 2.0f) - rectangleBoundsAtTime.getCy();
                    if (width5 != 0.0f && height5 != 0.0f && (width5 != rectangleBoundsAtTime.getWidth() || height5 != rectangleBoundsAtTime.getHeight() || width6 != 0.0f || height6 != 0.0f)) {
                        Ik().update(SceneElement.copy$default(sceneElementT5, null, 0, 0, 0L, null, null, TransformKt.scaledBy$default(TransformKt.translatedBy(sceneElementT5.getTransform(), width6, height6), width5 / rectangleBoundsAtTime.getWidth(), height5 / rectangleBoundsAtTime.getHeight(), 0.0f, 0.0f, 12, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
                    }
                }
                break;
                break;
            case 2131361985:
                FragmentTransaction fragmentTransactionO = editActivity.getSupportFragmentManager().o();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction(...)");
                L.j.n(fragmentTransactionO).rl(this.f45555O.ck.getId(), new YSR()).rl(this.f45555O.rl.getId(), C2099zf.INSTANCE.n(2132017414, new int[0])).KN(null).mUb();
                break;
            case 2131361987:
                List<SceneElement> elements13 = Ik().get_scene().getElements();
                ArrayList arrayList21 = new ArrayList();
                for (Object obj14 : elements13) {
                    if (editActivity.UpJ().contains(Long.valueOf(((SceneElement) obj14).getId()))) {
                        arrayList21.add(obj14);
                    }
                }
                ArrayList arrayList22 = new ArrayList();
                for (Object obj15 : arrayList21) {
                    if (((SceneElement) obj15).getEndTime() > HW.C.Ik(editActivity)) {
                        arrayList22.add(obj15);
                    }
                }
                Ml.j jVarCk10 = editActivity.ck();
                Iterator it13 = arrayList22.iterator();
                while (it13.hasNext()) {
                    SceneElement sceneElementTrimEnd$default = TrimmingKt.trimEnd$default((SceneElement) it13.next(), HW.C.Ik(editActivity), false, 2, null);
                    if (sceneElementTrimEnd$default != null) {
                        Ik().update(sceneElementTrimEnd$default);
                        Unit unit12 = Unit.INSTANCE;
                    }
                }
                jVarCk10.n();
                break;
            case 2131361988:
                Ml.j jVarCk11 = editActivity.ck();
                for (SceneElement sceneElement31 : Ik().get_scene().getElements()) {
                    if (HW.C.XQ(editActivity) <= sceneElement31.getStartTime() + 5) {
                        Ik().remove(sceneElement31);
                    } else if (sceneElement31.getEndTime() > HW.C.XQ(editActivity)) {
                        Ik().update(SceneElement.copy$default(sceneElement31, null, 0, HW.C.XQ(editActivity), 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -5, 127, null));
                    }
                }
                jVarCk11.n();
                break;
            case 2131361990:
                List<SceneElement> elements14 = Ik().get_scene().getElements();
                ArrayList arrayList23 = new ArrayList();
                for (Object obj16 : elements14) {
                    if (editActivity.UpJ().contains(Long.valueOf(((SceneElement) obj16).getId()))) {
                        arrayList23.add(obj16);
                    }
                }
                ArrayList arrayList24 = new ArrayList();
                for (Object obj17 : arrayList23) {
                    if (((SceneElement) obj17).getStartTime() < HW.C.o(editActivity)) {
                        arrayList24.add(obj17);
                    }
                }
                Ml.j jVarCk12 = editActivity.ck();
                Iterator it14 = arrayList24.iterator();
                while (it14.hasNext()) {
                    SceneElement sceneElementTrimStart$default = TrimmingKt.trimStart$default((SceneElement) it14.next(), HW.C.o(editActivity), false, 2, null);
                    if (sceneElementTrimStart$default != null) {
                        Ik().update(sceneElementTrimStart$default);
                        Unit unit13 = Unit.INSTANCE;
                    }
                }
                jVarCk12.n();
                break;
            case 2131361992:
                SceneElement sceneElementT6 = HW.C.T(editActivity);
                if (sceneElementT6 == null) {
                    return;
                }
                if (sceneElementT6.getType() == SceneElementType.Scene && sceneElementT6.getLinkedSceneUUID() == null) {
                    QmE.iF iFVarLm112 = editActivity.lm1();
                    String strUo = editActivity.Uo();
                    List<SceneElement> elements15 = sceneElementT6.getNestedScene().getElements();
                    ArrayList arrayList25 = new ArrayList(CollectionsKt.collectionSizeOrDefault(elements15, 10));
                    Iterator it15 = elements15.iterator();
                    while (it15.hasNext()) {
                        arrayList25.add(rWZ.j.rl((SceneElement) it15.next()));
                    }
                    iFVarLm112.n(new j.qiB(strUo, arrayList25));
                    editActivity.lm1().n(new j.fuX("layer_ungroup", null, 2, null));
                    Transform transformValueAtTime2 = sceneElementT6.getTransform().valueAtTime(SceneElementKt.fractionalTime(sceneElementT6, HW.C.XQ(editActivity)));
                    final Ref.IntRef intRef = new Ref.IntRef();
                    Iterator<SceneElement> it16 = Ik().get_scene().getElements().iterator();
                    while (true) {
                        if (!it16.hasNext()) {
                            i9 = -1;
                        } else if (it16.next().getId() != sceneElementT6.getId()) {
                            i9++;
                        }
                    }
                    intRef.element = i9;
                    XoT.C.Uo(editActivity, new Function0() { // from class: com.alightcreative.app.motion.activities.mrQ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return nSC.o(intRef);
                        }
                    });
                    Ml.j jVarCk13 = editActivity.ck();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<SceneElement> it17 = sceneElementT6.getNestedScene().getElements().iterator();
                    while (it17.hasNext()) {
                        linkedHashMap.put(Long.valueOf(it17.next().getId()), Long.valueOf(Ik().nextAvailableId()));
                    }
                    for (SceneElement sceneElement32 : sceneElementT6.getNestedScene().getElements()) {
                        if (sceneElement32.getParent() != null) {
                            int startTime5 = sceneElement32.getStartTime() + sceneElementT6.getStartTime();
                            int endTime6 = sceneElement32.getEndTime() + sceneElementT6.getStartTime();
                            Object obj18 = linkedHashMap.get(Long.valueOf(sceneElement32.getId()));
                            Intrinsics.checkNotNull(obj18);
                            long jLongValue = ((Number) obj18).longValue();
                            Object obj19 = linkedHashMap.get(sceneElement32.getParent());
                            Intrinsics.checkNotNull(obj19);
                            sceneElementCopy$default = SceneElement.copy$default(sceneElement32, null, startTime5, endTime6, jLongValue, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, (Long) obj19, false, null, null, -15, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, null);
                        } else {
                            Vector2D vector2D2 = (Vector2D) KeyableKt.valueAtTime(sceneElement32.getTransform().getPivot(), 0.0f);
                            KeyableTransform keyableTransformTranslatedBy = TransformKt.translatedBy(TransformKt.translatedBy(TransformKt.translatedBy(TransformKt.locationScaledBy(TransformKt.scaledBy$default(TransformKt.translatedBy(TransformKt.translatedBy(sceneElement32.getTransform(), GeometryKt.minus(GeometryKt.unaryMinus(transformValueAtTime2.getPivot()), GeometryKt.div(SceneKt.getSize(sceneElementT6.getNestedScene()), 2))), vector2D2), transformValueAtTime2.getScale(), 0.0f, 0.0f, 6, null), transformValueAtTime2.getScale()), GeometryKt.unaryMinus(vector2D2)), transformValueAtTime2.getPivot()), transformValueAtTime2.getLocation());
                            int startTime6 = sceneElement32.getStartTime() + sceneElementT6.getStartTime();
                            int endTime7 = sceneElement32.getEndTime() + sceneElementT6.getStartTime();
                            Object obj20 = linkedHashMap.get(Long.valueOf(sceneElement32.getId()));
                            Intrinsics.checkNotNull(obj20);
                            sceneElementCopy$default = SceneElement.copy$default(sceneElement32, null, startTime6, endTime7, ((Number) obj20).longValue(), null, null, keyableTransformTranslatedBy, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -79, 127, null);
                        }
                        Ik().add(sceneElementCopy$default, intRef.element);
                        int i12 = intRef.element;
                        if (i12 >= 0) {
                            intRef.element = i12 + 1;
                        }
                    }
                    Ik().remove(sceneElementT6);
                    jVarCk13.n();
                    while (editActivity.getSupportFragmentManager().Jk() > 0) {
                        editActivity.getSupportFragmentManager().uG();
                    }
                }
                break;
                break;
            case 2131361993:
                SceneElement sceneElementT7 = HW.C.T(editActivity);
                if (sceneElementT7 == null) {
                    return;
                }
                if (sceneElementT7.getType() == SceneElementType.Scene && sceneElementT7.getLinkedSceneUUID() != null) {
                    Ik().update(SceneElement.copy$default(sceneElementT7, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -16777217, 127, null));
                }
                break;
                break;
            default:
                switch (i2) {
                    case 2131361882:
                        FragmentTransaction fragmentTransactionO2 = editActivity.getSupportFragmentManager().o();
                        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO2, "beginTransaction(...)");
                        L.j.n(fragmentTransactionO2).rl(this.f45555O.ck.getId(), new f0P.M5()).rl(this.f45555O.rl.getId(), C2099zf.INSTANCE.n(2132017353, new int[0])).KN(null).mUb();
                        break;
                    case 2131361883:
                        FragmentTransaction fragmentTransactionO3 = editActivity.getSupportFragmentManager().o();
                        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO3, "beginTransaction(...)");
                        L.j.n(fragmentTransactionO3).rl(this.f45555O.ck.getId(), new f0P.V()).rl(this.f45555O.rl.getId(), C2099zf.INSTANCE.n(2132017356, new int[0])).KN(null).mUb();
                        break;
                    case 2131361884:
                        FragmentTransaction fragmentTransactionO4 = editActivity.getSupportFragmentManager().o();
                        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO4, "beginTransaction(...)");
                        L.j.n(fragmentTransactionO4).rl(this.f45555O.ck.getId(), new f0P.I()).rl(this.f45555O.rl.getId(), C2099zf.INSTANCE.n(2132017393, new int[0])).KN(null).mUb();
                        break;
                    case 2131361885:
                        SceneElement sceneElementT8 = HW.C.T(editActivity);
                        if (sceneElementT8 == null) {
                            return;
                        }
                        Scene scene3 = Ik().get_scene();
                        if (sceneElementT8.getType() == SceneElementType.Camera && sceneElementT8.getType().getHasTransform()) {
                            float fFractionalTime = SceneElementKt.fractionalTime(sceneElementT8, HW.C.XQ(editActivity));
                            Rectangle rectangleBoundsAtTime2 = SceneElementKt.boundsAtTime(sceneElementT8, Ik().get_scene(), fFractionalTime);
                            float width7 = (Ik().get_scene().getWidth() / 2.0f) - rectangleBoundsAtTime2.getCx();
                            float height7 = (Ik().get_scene().getHeight() / 2.0f) - rectangleBoundsAtTime2.getCy();
                            float fFloatValue = ((Number) KeyableKt.valueAtTime(sceneElementT8.getCameraProperties().getFov(), fFractionalTime)).floatValue();
                            float fCalcCameraFov = CameraElementKt.calcCameraFov(scene3, -((Vector3D) KeyableKt.valueAtTime(sceneElementT8.getTransform().getLocation(), fFractionalTime)).getZ());
                            if ((width7 == 0.0f) != true) {
                                SceneHolder sceneHolderIk = Ik();
                                KeyableTransform keyableTransformTranslatedBy2 = TransformKt.translatedBy(sceneElementT8.getTransform(), width7, height7);
                                CameraProperties cameraProperties = sceneElementT8.getCameraProperties();
                                KeyableFloat fov = sceneElementT8.getCameraProperties().getFov();
                                List<Keyframe<Float>> keyframes = sceneElementT8.getCameraProperties().getFov().getKeyframes();
                                ArrayList arrayList26 = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
                                Iterator it18 = keyframes.iterator();
                                while (it18.hasNext()) {
                                    arrayList26.add(Keyframe.copy$default((Keyframe) it18.next(), Float.valueOf(fCalcCameraFov), 0.0f, null, null, 14, null));
                                }
                                sceneHolderIk.update(SceneElement.copy$default(sceneElementT8, null, 0, 0, 0L, null, null, keyableTransformTranslatedBy2, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, CameraProperties.copy$default(cameraProperties, null, (KeyableFloat) Keyable.DefaultImpls.copyWith$default(fov, arrayList26, false, null, 6, null), false, null, null, null, false, null, null, null, 1021, null), null, false, null, null, -65, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null));
                                break;
                            } else if ((height7 == 0.0f) != false) {
                                if (!(fFloatValue == fCalcCameraFov)) {
                                }
                            }
                        }
                        break;
                    default:
                        switch (i2) {
                            case 2131361888:
                                editActivity.vH3().te();
                                FragmentManager supportFragmentManager = editActivity.getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                I7a.nr(supportFragmentManager);
                                break;
                            case 2131361889:
                                FragmentTransaction fragmentTransactionO5 = editActivity.getSupportFragmentManager().o();
                                Intrinsics.checkNotNullExpressionValue(fragmentTransactionO5, "beginTransaction(...)");
                                L.j.n(fragmentTransactionO5).rl(this.f45555O.ck.getId(), new f0P.cF()).rl(this.f45555O.rl.getId(), C2099zf.INSTANCE.n(2132017449, new int[0])).KN(null).mUb();
                                break;
                            default:
                                switch (i2) {
                                    case 2131361892:
                                        SceneElement sceneElementT9 = HW.C.T(editActivity);
                                        if (sceneElementT9 == null) {
                                            return;
                                        }
                                        if (sceneElementT9.getLiveShape().getId() != null) {
                                            QmE.iF iFVarLm113 = editActivity.lm1();
                                            Bundle bundle11 = new Bundle();
                                            bundle11.putString("type", "liveshape");
                                            bundle11.putString("id", sceneElementT9.getLiveShape().getId());
                                            Unit unit14 = Unit.INSTANCE;
                                            iFVarLm113.n(new j.fuX("convert_to_outline", bundle11));
                                            Ik().update(SceneElement.copy$default(sceneElementT9, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, LiveShapeRef.INSTANCE.getNONE(), 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65537, 127, null));
                                        } else if (sceneElementT9.getType() == SceneElementType.Text) {
                                            QmE.iF iFVarLm114 = editActivity.lm1();
                                            Bundle bundle12 = new Bundle();
                                            bundle12.putString("type", "text");
                                            bundle12.putString("id", "text");
                                            Unit unit15 = Unit.INSTANCE;
                                            iFVarLm114.n(new j.fuX("convert_to_outline", bundle12));
                                            float fFractionalTime2 = SceneElementKt.fractionalTime(sceneElementT9, HW.C.XQ(editActivity));
                                            Ik().update(SceneElement.copy$default(sceneElementT9, SceneElementType.Shape, 0, 0, 0L, null, null, null, null, null, null, null, null, null, CubicBSplineKt.keyable(CubicBSplineKt.times(TextElementKt.getTextPath(sceneElementT9.getText(), StyleParams.INSTANCE.forElement(sceneElementT9, fFractionalTime2)).pJg(), sceneElementT9.getTransform().valueAtTime(fFractionalTime2))), null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8194, 127, null));
                                        }
                                        break;
                                        break;
                                    case 2131361893:
                                        SceneElement sceneElementT10 = HW.C.T(editActivity);
                                        if (sceneElementT10 == null) {
                                            return;
                                        }
                                        UUID linkedSceneUUID2 = sceneElementT10.getLinkedSceneUUID();
                                        if (linkedSceneUUID2 != null) {
                                            if (HI0.afx.Z(editActivity, linkedSceneUUID2).exists()) {
                                                FragmentManager supportFragmentManager2 = editActivity.getSupportFragmentManager();
                                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                                                I7a.nr(supportFragmentManager2);
                                                QmE.iF iFVarLm115 = editActivity.lm1();
                                                Bundle bundle13 = new Bundle();
                                                bundle13.putString("type", sceneElementT10.getNestedScene().getType().getLabel());
                                                Unit unit16 = Unit.INSTANCE;
                                                iFVarLm115.n(new j.fuX("unlink_and_edit", bundle13));
                                                Ik().update(SceneElement.copy$default(sceneElementT10, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -16777217, 127, null));
                                                Ik().editNestedScene(sceneElementT10.getId());
                                            } else {
                                                editActivity.rV9(2131361907);
                                            }
                                        }
                                        break;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 2131361898:
                                                Ml.j jVarCk14 = editActivity.ck();
                                                SceneElement sceneElementT11 = HW.C.T(editActivity);
                                                if (sceneElementT11 != null) {
                                                    for (SceneElement sceneElement33 : Ik().get_scene().getElements()) {
                                                        Long parent = sceneElement33.getParent();
                                                        long id = sceneElementT11.getId();
                                                        if (parent != null && parent.longValue() == id) {
                                                            Ik().update(LayerParentingKt.updateParent(sceneElement33, Ik().get_scene(), null, SceneElementKt.fractionalTime(sceneElement33, HW.C.XQ(editActivity))));
                                                        }
                                                    }
                                                    Ik().remove(sceneElementT11);
                                                    Unit unit17 = Unit.INSTANCE;
                                                }
                                                jVarCk14.n();
                                                while (editActivity.getSupportFragmentManager().Jk() > 0) {
                                                    editActivity.getSupportFragmentManager().uG();
                                                }
                                                break;
                                            case 2131361899:
                                                QmE.iF iFVarLm116 = editActivity.lm1();
                                                Bundle bundle14 = new Bundle();
                                                bundle14.putString(FileUploadManager.f61572j, "distribute_horizontal");
                                                Unit unit18 = Unit.INSTANCE;
                                                iFVarLm116.n(new j.fuX("align_and_distribute", bundle14));
                                                List<SceneElement> elements16 = Ik().get_scene().getElements();
                                                ArrayList arrayList27 = new ArrayList();
                                                for (Object obj21 : elements16) {
                                                    SceneElement sceneElement34 = (SceneElement) obj21;
                                                    if ((editActivity.UpJ().contains(Long.valueOf(sceneElement34.getId())) && sceneElement34.getType().getHasTransform()) != false) {
                                                        arrayList27.add(obj21);
                                                    }
                                                }
                                                List listSortedWith2 = CollectionsKt.sortedWith(arrayList27, new w6(editActivity));
                                                SceneElement sceneElement35 = (SceneElement) CollectionsKt.firstOrNull(listSortedWith2);
                                                if (sceneElement35 == null || (sceneElement3 = (SceneElement) CollectionsKt.lastOrNull(listSortedWith2)) == null) {
                                                    return;
                                                }
                                                Vector3D vector3D2 = (Vector3D) KeyableKt.valueAtTime(sceneElement35.getTransform().getLocation(), SceneElementKt.fractionalTime(sceneElement35, HW.C.XQ(editActivity)));
                                                Vector3D vector3D3 = (Vector3D) KeyableKt.valueAtTime(sceneElement3.getTransform().getLocation(), SceneElementKt.fractionalTime(sceneElement3, HW.C.XQ(editActivity)));
                                                List listDropLast = CollectionsKt.dropLast(CollectionsKt.drop(listSortedWith2, 1), 1);
                                                if (listDropLast.isEmpty()) {
                                                    return;
                                                }
                                                Ml.j jVarCk15 = editActivity.ck();
                                                int i13 = 0;
                                                for (Object obj22 : listDropLast) {
                                                    int i14 = i13 + 1;
                                                    if (i13 < 0) {
                                                        CollectionsKt.throwIndexOverflow();
                                                    }
                                                    SceneElement sceneElement36 = (SceneElement) obj22;
                                                    float x2 = (vector3D2.getX() + (((vector3D3.getX() - vector3D2.getX()) * i14) / (listDropLast.size() + 1))) - ((Vector3D) KeyableKt.valueAtTime(sceneElement36.getTransform().getLocation(), SceneElementKt.fractionalTime(sceneElement36, HW.C.XQ(editActivity)))).getX();
                                                    if ((x2 == 0.0f) == false) {
                                                        Ik().update(SceneElement.copy$default(sceneElement36, null, 0, 0, 0L, null, null, TransformKt.translatedBy(sceneElement36.getTransform(), x2, 0.0f), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
                                                    }
                                                    i13 = i14;
                                                }
                                                jVarCk15.n();
                                                break;
                                                break;
                                            case 2131361900:
                                                List<SceneElement> elements17 = Ik().get_scene().getElements();
                                                ArrayList arrayList28 = new ArrayList();
                                                for (Object obj23 : elements17) {
                                                    if (editActivity.UpJ().contains(Long.valueOf(((SceneElement) obj23).getId()))) {
                                                        arrayList28.add(obj23);
                                                    }
                                                }
                                                List listSortedWith3 = CollectionsKt.sortedWith(arrayList28, new Ml());
                                                SceneElement sceneElement37 = (SceneElement) CollectionsKt.firstOrNull(listSortedWith3);
                                                if (sceneElement37 == null || (sceneElement4 = (SceneElement) CollectionsKt.lastOrNull(listSortedWith3)) == null) {
                                                    return;
                                                }
                                                int startTime7 = sceneElement37.getStartTime();
                                                int startTime8 = sceneElement4.getStartTime();
                                                List listDropLast2 = CollectionsKt.dropLast(CollectionsKt.drop(listSortedWith3, 1), 1);
                                                if (listDropLast2.isEmpty()) {
                                                    return;
                                                }
                                                Ml.j jVarCk16 = editActivity.ck();
                                                for (Object obj24 : listDropLast2) {
                                                    int i15 = i8 + 1;
                                                    if (i8 < 0) {
                                                        CollectionsKt.throwIndexOverflow();
                                                    }
                                                    SceneElement sceneElement38 = (SceneElement) obj24;
                                                    int size = ((((startTime8 - startTime7) * i15) / (listDropLast2.size() + 1)) + startTime7) - sceneElement38.getStartTime();
                                                    if (size != 0) {
                                                        Ik().update(SceneElement.copy$default(sceneElement38, null, sceneElement38.getStartTime() + size, sceneElement38.getEndTime() + size, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -7, 127, null));
                                                    }
                                                    i8 = i15;
                                                }
                                                jVarCk16.n();
                                                break;
                                                break;
                                            case 2131361901:
                                                QmE.iF iFVarLm117 = editActivity.lm1();
                                                Bundle bundle15 = new Bundle();
                                                bundle15.putString(FileUploadManager.f61572j, "distribute_vertical");
                                                Unit unit19 = Unit.INSTANCE;
                                                iFVarLm117.n(new j.fuX("align_and_distribute", bundle15));
                                                List<SceneElement> elements18 = Ik().get_scene().getElements();
                                                ArrayList arrayList29 = new ArrayList();
                                                for (Object obj25 : elements18) {
                                                    SceneElement sceneElement39 = (SceneElement) obj25;
                                                    if ((editActivity.UpJ().contains(Long.valueOf(sceneElement39.getId())) && sceneElement39.getType().getHasTransform()) != false) {
                                                        arrayList29.add(obj25);
                                                    }
                                                }
                                                List listSortedWith4 = CollectionsKt.sortedWith(arrayList29, new n(editActivity));
                                                SceneElement sceneElement40 = (SceneElement) CollectionsKt.firstOrNull(listSortedWith4);
                                                if (sceneElement40 == null || (sceneElement5 = (SceneElement) CollectionsKt.lastOrNull(listSortedWith4)) == null) {
                                                    return;
                                                }
                                                Vector3D vector3D4 = (Vector3D) KeyableKt.valueAtTime(sceneElement40.getTransform().getLocation(), SceneElementKt.fractionalTime(sceneElement40, HW.C.XQ(editActivity)));
                                                Vector3D vector3D5 = (Vector3D) KeyableKt.valueAtTime(sceneElement5.getTransform().getLocation(), SceneElementKt.fractionalTime(sceneElement5, HW.C.XQ(editActivity)));
                                                List listDropLast3 = CollectionsKt.dropLast(CollectionsKt.drop(listSortedWith4, 1), 1);
                                                if (listDropLast3.isEmpty()) {
                                                    return;
                                                }
                                                Ml.j jVarCk17 = editActivity.ck();
                                                int i16 = 0;
                                                for (Object obj26 : listDropLast3) {
                                                    int i17 = i16 + 1;
                                                    if (i16 < 0) {
                                                        CollectionsKt.throwIndexOverflow();
                                                    }
                                                    SceneElement sceneElement41 = (SceneElement) obj26;
                                                    float y3 = (vector3D4.getY() + (((vector3D5.getY() - vector3D4.getY()) * i17) / (listDropLast3.size() + 1))) - ((Vector3D) KeyableKt.valueAtTime(sceneElement41.getTransform().getLocation(), SceneElementKt.fractionalTime(sceneElement41, HW.C.XQ(editActivity)))).getY();
                                                    if ((y3 == f3) == false) {
                                                        Ik().update(SceneElement.copy$default(sceneElement41, null, 0, 0, 0L, null, null, TransformKt.translatedBy(sceneElement41.getTransform(), f3, y3), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
                                                    }
                                                    i16 = i17;
                                                    f3 = 0.0f;
                                                }
                                                jVarCk17.n();
                                                break;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 2131361903:
                                                        editActivity.lm1().n(new j.M(editActivity.Uo()));
                                                        List<SceneElement> elements19 = Ik().get_scene().getElements();
                                                        if (elements19 == null || !elements19.isEmpty()) {
                                                            Iterator it19 = elements19.iterator();
                                                            while (it19.hasNext()) {
                                                                if (editActivity.UpJ().contains(Long.valueOf(((SceneElement) it19.next()).getId())) && (i7 = i7 + 1) < 0) {
                                                                    CollectionsKt.throwCountOverflow();
                                                                }
                                                            }
                                                        }
                                                        if (i7 >= 1) {
                                                            Ik().duplicateAll(editActivity.UpJ());
                                                        }
                                                        editActivity.vH3().te();
                                                        FragmentManager supportFragmentManager3 = editActivity.getSupportFragmentManager();
                                                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "getSupportFragmentManager(...)");
                                                        I7a.nr(supportFragmentManager3);
                                                        break;
                                                    case 2131361904:
                                                        FragmentTransaction fragmentTransactionO6 = editActivity.getSupportFragmentManager().o();
                                                        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO6, "beginTransaction(...)");
                                                        L.j.n(fragmentTransactionO6).rl(this.f45555O.ck.getId(), new f0P.J2L()).rl(this.f45555O.rl.getId(), f0P.Iuj.INSTANCE.n(2132017709, new int[0])).KN(null).mUb();
                                                        break;
                                                    case 2131361905:
                                                        SceneElement sceneElementT12 = HW.C.T(editActivity);
                                                        if (sceneElementT12 == null) {
                                                            return;
                                                        }
                                                        UUID linkedSceneUUID3 = sceneElementT12.getLinkedSceneUUID();
                                                        if (linkedSceneUUID3 != null) {
                                                            if (HI0.afx.Z(editActivity, linkedSceneUUID3).exists()) {
                                                                FragmentTransaction fragmentTransactionO7 = editActivity.getSupportFragmentManager().o();
                                                                Intrinsics.checkNotNullExpressionValue(fragmentTransactionO7, "beginTransaction(...)");
                                                                L.j.n(fragmentTransactionO7).rl(this.f45555O.ck.getId(), new f0P.kI()).rl(this.f45555O.rl.getId(), new f0P.WG()).KN(null).mUb();
                                                            } else {
                                                                editActivity.rV9(2131361907);
                                                                Unit unit20 = Unit.INSTANCE;
                                                            }
                                                        }
                                                        break;
                                                        break;
                                                    case 2131361906:
                                                        FragmentTransaction fragmentTransactionO8 = editActivity.getSupportFragmentManager().o();
                                                        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO8, "beginTransaction(...)");
                                                        L.j.n(fragmentTransactionO8).rl(this.f45555O.ck.getId(), new C2065oU()).rl(this.f45555O.rl.getId(), SAy.INSTANCE.n(2132017750, 2131361892)).KN(null).mUb();
                                                        break;
                                                    case 2131361907:
                                                        final SceneElement sceneElementT13 = HW.C.T(editActivity);
                                                        if (sceneElementT13 == null) {
                                                            return;
                                                        }
                                                        UUID linkedSceneUUID4 = sceneElementT13.getLinkedSceneUUID();
                                                        if (linkedSceneUUID4 != null && !HI0.afx.Z(editActivity, linkedSceneUUID4).exists()) {
                                                            new AlertDialog.Builder(editActivity).Uo(2132020020).setNegativeButton(2132017502, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.i
                                                                @Override // android.content.DialogInterface.OnClickListener
                                                                public final void onClick(DialogInterface dialogInterface, int i18) {
                                                                    nSC.Z(editActivity, this, sceneElementT13, dialogInterface, i18);
                                                                }
                                                            }).setPositiveButton(2132020021, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Pp
                                                                @Override // android.content.DialogInterface.OnClickListener
                                                                public final void onClick(DialogInterface dialogInterface, int i18) {
                                                                    nSC.XQ(editActivity, dialogInterface, i18);
                                                                }
                                                            }).gh(2132017396, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.N
                                                                @Override // android.content.DialogInterface.OnClickListener
                                                                public final void onClick(DialogInterface dialogInterface, int i18) {
                                                                    nSC.S(dialogInterface, i18);
                                                                }
                                                            }).create().show();
                                                        }
                                                        break;
                                                        break;
                                                    case 2131361908:
                                                        SceneElement sceneElementT14 = HW.C.T(editActivity);
                                                        if (sceneElementT14 == null) {
                                                            return;
                                                        }
                                                        editActivity.lm1().n(new j.fuX("edit_group", null, 2, null));
                                                        FragmentManager supportFragmentManager4 = editActivity.getSupportFragmentManager();
                                                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "getSupportFragmentManager(...)");
                                                        I7a.nr(supportFragmentManager4);
                                                        Ik().editNestedScene(sceneElementT14.getId());
                                                        break;
                                                    case 2131361909:
                                                        SceneElement sceneElementT15 = HW.C.T(editActivity);
                                                        if (sceneElementT15 == null) {
                                                            return;
                                                        }
                                                        UUID linkedSceneUUID5 = sceneElementT15.getLinkedSceneUUID();
                                                        if (linkedSceneUUID5 != null) {
                                                            if (HI0.afx.Z(editActivity, linkedSceneUUID5).exists()) {
                                                                QmE.iF iFVarLm118 = editActivity.lm1();
                                                                Bundle bundle16 = new Bundle();
                                                                bundle16.putString("type", sceneElementT15.getNestedScene().getType().getLabel());
                                                                Unit unit21 = Unit.INSTANCE;
                                                                iFVarLm118.n(new j.fuX("edit_linked_project", bundle16));
                                                                Pair[] pairArr = (Pair[]) Arrays.copyOf(new Pair[]{TuplesKt.to("projectID", linkedSceneUUID5.toString())}, 1);
                                                                Intent intent = new Intent(editActivity, (Class<?>) EditActivity.class);
                                                                intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
                                                                safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(editActivity, intent, 6);
                                                            } else {
                                                                editActivity.rV9(2131361907);
                                                            }
                                                        }
                                                        break;
                                                        break;
                                                    case 2131361910:
                                                        FragmentTransaction fragmentTransactionO9 = editActivity.getSupportFragmentManager().o();
                                                        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO9, "beginTransaction(...)");
                                                        L.j.n(fragmentTransactionO9).rl(this.f45555O.ck.getId(), new f0P.Wqz()).rl(this.f45555O.rl.getId(), f0P.fi.INSTANCE.n(2132017749, new int[0])).KN(null).mUb();
                                                        break;
                                                    default:
                                                        switch (i2) {
                                                            case 2131361912:
                                                                FragmentTransaction fragmentTransactionO10 = editActivity.getSupportFragmentManager().o();
                                                                Intrinsics.checkNotNullExpressionValue(fragmentTransactionO10, "beginTransaction(...)");
                                                                L.j.n(fragmentTransactionO10).rl(this.f45555O.Ik.getId(), new mAi()).KN(null).mUb();
                                                                break;
                                                            case 2131361913:
                                                                FragmentTransaction fragmentTransactionO11 = editActivity.getSupportFragmentManager().o();
                                                                Intrinsics.checkNotNullExpressionValue(fragmentTransactionO11, "beginTransaction(...)");
                                                                FragmentTransaction fragmentTransactionN = L.j.n(fragmentTransactionO11);
                                                                int id2 = this.f45555O.ck.getId();
                                                                ZJ.Companion companion = f0P.ZJ.INSTANCE;
                                                                String string2 = editActivity.getProjectHolder().Uo().toString();
                                                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                                                fragmentTransactionN.t(id2, companion.n(string2), "effects").rl(this.f45555O.rl.getId(), C2099zf.INSTANCE.n(2132018939, new int[0])).KN(null).mUb();
                                                                break;
                                                            default:
                                                                switch (i2) {
                                                                    case 2131361922:
                                                                        Ml.j jVarCk18 = editActivity.ck();
                                                                        SceneElement sceneElementT16 = HW.C.T(editActivity);
                                                                        if (sceneElementT16 != null) {
                                                                            if (sceneElementT16.getFillVideo() != null) {
                                                                                editActivity.lm1().n(new j.fuX("extract_audio", null, 2, null));
                                                                                SceneHolder.DefaultImpls.add$default(Ik(), SceneElementKt.recreateEngineState(SceneElement.copy$default(sceneElementT16, SceneElementType.Audio, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, sceneElementT16.getFillVideo(), null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -16898, 127, null)), 0, 2, null);
                                                                                Ik().update(SceneElement.copy$default(sceneElementT16, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, KeyableKt.keyable(0.0f), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -1048577, 127, null));
                                                                            }
                                                                            Unit unit22 = Unit.INSTANCE;
                                                                        }
                                                                        jVarCk18.n();
                                                                        while (editActivity.getSupportFragmentManager().Jk() > 0) {
                                                                            editActivity.getSupportFragmentManager().uG();
                                                                        }
                                                                        break;
                                                                    case 2131361923:
                                                                        SceneElement sceneElementT17 = HW.C.T(editActivity);
                                                                        if (sceneElementT17 == null) {
                                                                            return;
                                                                        }
                                                                        if (sceneElementT17.getType().getHasTransform()) {
                                                                            Rectangle rectangleBoundsAtTime3 = SceneElementKt.boundsAtTime(sceneElementT17, Ik().get_scene(), SceneElementKt.fractionalTime(sceneElementT17, HW.C.XQ(editActivity)));
                                                                            Pair pairRl = AbstractC1951j.rl(rectangleBoundsAtTime3.getWidth(), rectangleBoundsAtTime3.getHeight(), Ik().get_scene().getWidth(), Ik().get_scene().getHeight());
                                                                            float fFloatValue2 = ((Number) pairRl.component1()).floatValue();
                                                                            float fFloatValue3 = ((Number) pairRl.component2()).floatValue();
                                                                            float width8 = (Ik().get_scene().getWidth() / 2.0f) - rectangleBoundsAtTime3.getCx();
                                                                            float height8 = (Ik().get_scene().getHeight() / 2.0f) - rectangleBoundsAtTime3.getCy();
                                                                            if ((fFloatValue2 == 0.0f) == false) {
                                                                                if ((fFloatValue3 == 0.0f) == false) {
                                                                                    if ((fFloatValue2 == rectangleBoundsAtTime3.getWidth()) != true) {
                                                                                        Ik().update(SceneElement.copy$default(sceneElementT17, null, 0, 0, 0L, null, null, TransformKt.scaledBy$default(TransformKt.translatedBy(sceneElementT17.getTransform(), width8, height8), fFloatValue2 / rectangleBoundsAtTime3.getWidth(), fFloatValue3 / rectangleBoundsAtTime3.getHeight(), 0.0f, 0.0f, 12, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
                                                                                        break;
                                                                                    } else if ((fFloatValue3 == rectangleBoundsAtTime3.getHeight()) != false) {
                                                                                        if ((width8 == 0.0f) != false) {
                                                                                            if (!(height8 == 0.0f)) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2131361924:
                                                                        SceneElement sceneElementT18 = HW.C.T(editActivity);
                                                                        if (sceneElementT18 == null) {
                                                                            return;
                                                                        }
                                                                        if (sceneElementT18.getType().getHasTransform()) {
                                                                            final Rectangle rectangleBoundsAtTime4 = SceneElementKt.boundsAtTime(sceneElementT18, Ik().get_scene(), SceneElementKt.fractionalTime(sceneElementT18, HW.C.XQ(editActivity)));
                                                                            Pair pairJ2 = AbstractC1951j.J2(rectangleBoundsAtTime4.getWidth(), rectangleBoundsAtTime4.getHeight(), Ik().get_scene().getWidth(), Ik().get_scene().getHeight());
                                                                            float fFloatValue4 = ((Number) pairJ2.component1()).floatValue();
                                                                            float fFloatValue5 = ((Number) pairJ2.component2()).floatValue();
                                                                            float width9 = (Ik().get_scene().getWidth() / 2.0f) - rectangleBoundsAtTime4.getCx();
                                                                            float height9 = (Ik().get_scene().getHeight() / 2.0f) - rectangleBoundsAtTime4.getCy();
                                                                            if ((fFloatValue4 == 0.0f) == false) {
                                                                                if ((fFloatValue5 == 0.0f) == false) {
                                                                                    if ((fFloatValue4 == rectangleBoundsAtTime4.getWidth()) != true) {
                                                                                        XoT.C.Uo(editActivity, new Function0() { // from class: com.alightcreative.app.motion.activities.Pmq
                                                                                            @Override // kotlin.jvm.functions.Function0
                                                                                            public final Object invoke() {
                                                                                                return nSC.r(rectangleBoundsAtTime4);
                                                                                            }
                                                                                        });
                                                                                        Ik().update(SceneElement.copy$default(sceneElementT18, null, 0, 0, 0L, null, null, TransformKt.scaledBy$default(TransformKt.translatedBy(sceneElementT18.getTransform(), width9, height9), fFloatValue4 / rectangleBoundsAtTime4.getWidth(), fFloatValue5 / rectangleBoundsAtTime4.getHeight(), 0.0f, 0.0f, 12, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
                                                                                        break;
                                                                                    } else if ((fFloatValue5 == rectangleBoundsAtTime4.getHeight()) != false) {
                                                                                        if ((width9 == 0.0f) != false) {
                                                                                            if (!(height9 == 0.0f)) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2131361925:
                                                                        SceneElement sceneElementT19 = HW.C.T(editActivity);
                                                                        if (sceneElementT19 == null) {
                                                                            return;
                                                                        }
                                                                        if (sceneElementT19.getType().getHasTransform()) {
                                                                            Ik().update(SceneElement.copy$default(sceneElementT19, null, 0, 0, 0L, null, null, TransformKt.scaledBy$default(sceneElementT19.getTransform(), -1.0f, 1.0f, 0.0f, 0.0f, 12, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
                                                                        }
                                                                        break;
                                                                        break;
                                                                    case 2131361926:
                                                                        SceneElement sceneElementT20 = HW.C.T(editActivity);
                                                                        if (sceneElementT20 == null) {
                                                                            return;
                                                                        }
                                                                        if (sceneElementT20.getType().getHasTransform()) {
                                                                            Ik().update(SceneElement.copy$default(sceneElementT20, null, 0, 0, 0L, null, null, TransformKt.scaledBy$default(sceneElementT20.getTransform(), 1.0f, -1.0f, 0.0f, 0.0f, 12, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
                                                                        }
                                                                        break;
                                                                        break;
                                                                    case 2131361927:
                                                                        editActivity.gy(!editActivity.getFullScreenPreviewMode());
                                                                        editActivity.cKA();
                                                                        break;
                                                                    case 2131361928:
                                                                    case 2131361929:
                                                                        List<SceneElement> elements20 = Ik().get_scene().getElements();
                                                                        if (elements20 == null || !elements20.isEmpty()) {
                                                                            Iterator it20 = elements20.iterator();
                                                                            i5 = 0;
                                                                            while (it20.hasNext()) {
                                                                                if (editActivity.UpJ().contains(Long.valueOf(((SceneElement) it20.next()).getId())) && (i5 = i5 + 1) < 0) {
                                                                                    CollectionsKt.throwCountOverflow();
                                                                                }
                                                                            }
                                                                        } else {
                                                                            i5 = 0;
                                                                        }
                                                                        if (i5 <= 1) {
                                                                            Toast.makeText(editActivity, 2132019714, 0).show();
                                                                        } else {
                                                                            SceneHolder sceneHolderIk2 = Ik();
                                                                            Scene scene4 = Ik().get_scene();
                                                                            Set setUpJ = editActivity.UpJ();
                                                                            int iXQ = HW.C.XQ(editActivity);
                                                                            String string3 = editActivity.getString(2132019349);
                                                                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                                                                            switch (i2) {
                                                                                case 2131361928:
                                                                                    blendingMode = BlendingMode.EXCLUDE;
                                                                                    break;
                                                                                case 2131361929:
                                                                                    blendingMode = BlendingMode.MASK;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            sceneHolderIk2.setScene(ElementGroupingKt.groupElementsById$default(scene4, setUpJ, iXQ, string3, null, blendingMode, 8, null));
                                                                            editActivity.vH3().te();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        switch (i2) {
                                                                            case 2131361937:
                                                                                FragmentTransaction fragmentTransactionO12 = editActivity.getSupportFragmentManager().o();
                                                                                Intrinsics.checkNotNullExpressionValue(fragmentTransactionO12, "beginTransaction(...)");
                                                                                L.j.n(fragmentTransactionO12).rl(this.f45555O.ck.getId(), new oC()).rl(this.f45555O.rl.getId(), C2099zf.INSTANCE.n(2132019640, new int[0])).KN(null).mUb();
                                                                                break;
                                                                            case 2131361938:
                                                                                List<SceneElement> elements21 = Ik().get_scene().getElements();
                                                                                ArrayList<SceneElement> arrayList30 = new ArrayList();
                                                                                for (Object obj27 : elements21) {
                                                                                    if (editActivity.UpJ().contains(Long.valueOf(((SceneElement) obj27).getId()))) {
                                                                                        arrayList30.add(obj27);
                                                                                    }
                                                                                }
                                                                                Ml.j jVarCk19 = editActivity.ck();
                                                                                int iIk2 = HW.C.Ik(editActivity);
                                                                                for (SceneElement sceneElement42 : arrayList30) {
                                                                                    int endTime8 = sceneElement42.getEndTime() - sceneElement42.getStartTime();
                                                                                    int startTime9 = iIk2 - sceneElement42.getStartTime();
                                                                                    if (startTime9 > 1) {
                                                                                        final float f9 = endTime8 / startTime9;
                                                                                        Ik().update(SceneElement.copy$default(SceneElementKt.copyAdjustingKeyframeTiming(sceneElement42, new Function1() { // from class: com.alightcreative.app.motion.activities.Y5
                                                                                            @Override // kotlin.jvm.functions.Function1
                                                                                            public final Object invoke(Object obj28) {
                                                                                                return Float.valueOf(nSC.nY(f9, ((Float) obj28).floatValue()));
                                                                                            }
                                                                                        }), null, 0, iIk2, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, (sceneElement42.getOutTime() + iIk2) - sceneElement42.getEndTime(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -262149, 127, null));
                                                                                    }
                                                                                }
                                                                                jVarCk19.n();
                                                                                break;
                                                                            case 2131361939:
                                                                                List<SceneElement> elements22 = Ik().get_scene().getElements();
                                                                                ArrayList<SceneElement> arrayList31 = new ArrayList();
                                                                                for (Object obj28 : elements22) {
                                                                                    if (editActivity.UpJ().contains(Long.valueOf(((SceneElement) obj28).getId()))) {
                                                                                        arrayList31.add(obj28);
                                                                                    }
                                                                                }
                                                                                Ml.j jVarCk20 = editActivity.ck();
                                                                                int iO = HW.C.o(editActivity);
                                                                                for (SceneElement sceneElement43 : arrayList31) {
                                                                                    int endTime9 = sceneElement43.getEndTime() - sceneElement43.getStartTime();
                                                                                    int endTime10 = sceneElement43.getEndTime() - iO;
                                                                                    float f10 = endTime10;
                                                                                    final float startTime10 = (sceneElement43.getStartTime() - iO) / f10;
                                                                                    int inTime = (sceneElement43.getInTime() + iO) - sceneElement43.getStartTime();
                                                                                    if (endTime10 > 1) {
                                                                                        final float f11 = endTime9 / f10;
                                                                                        Ik().update(SceneElement.copy$default(SceneElementKt.copyAdjustingKeyframeTiming(sceneElement43, new Function1() { // from class: com.alightcreative.app.motion.activities.FPL
                                                                                            @Override // kotlin.jvm.functions.Function1
                                                                                            public final Object invoke(Object obj29) {
                                                                                                return Float.valueOf(nSC.ViF(f11, startTime10, ((Float) obj29).floatValue()));
                                                                                            }
                                                                                        }), null, iO, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, inTime, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -131075, 127, null));
                                                                                    }
                                                                                }
                                                                                jVarCk20.n();
                                                                                break;
                                                                            case 2131361940:
                                                                                List<SceneElement> elements23 = Ik().get_scene().getElements();
                                                                                ArrayList<SceneElement> arrayList32 = new ArrayList();
                                                                                for (Object obj29 : elements23) {
                                                                                    if (editActivity.UpJ().contains(Long.valueOf(((SceneElement) obj29).getId()))) {
                                                                                        arrayList32.add(obj29);
                                                                                    }
                                                                                }
                                                                                Ml.j jVarCk21 = editActivity.ck();
                                                                                for (SceneElement sceneElement44 : arrayList32) {
                                                                                    int startTime11 = sceneElement44.getStartTime() - HW.C.XQ(editActivity);
                                                                                    Ik().update(SceneElement.copy$default(sceneElement44, null, sceneElement44.getStartTime() - startTime11, sceneElement44.getEndTime() - startTime11, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -7, 127, null));
                                                                                }
                                                                                jVarCk21.n();
                                                                                break;
                                                                            case 2131361941:
                                                                                List<SceneElement> elements24 = Ik().get_scene().getElements();
                                                                                ArrayList<SceneElement> arrayList33 = new ArrayList();
                                                                                for (Object obj30 : elements24) {
                                                                                    if (editActivity.UpJ().contains(Long.valueOf(((SceneElement) obj30).getId()))) {
                                                                                        arrayList33.add(obj30);
                                                                                    }
                                                                                }
                                                                                Ml.j jVarCk22 = editActivity.ck();
                                                                                for (SceneElement sceneElement45 : arrayList33) {
                                                                                    int iXQ2 = HW.C.XQ(editActivity) - sceneElement45.getEndTime();
                                                                                    Ik().update(SceneElement.copy$default(sceneElement45, null, sceneElement45.getStartTime() + iXQ2, sceneElement45.getEndTime() + iXQ2, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -7, 127, null));
                                                                                }
                                                                                jVarCk22.n();
                                                                                break;
                                                                            default:
                                                                                switch (i2) {
                                                                                    case 2131361946:
                                                                                        editActivity.lm1().n(new j.yr(editActivity.Uo()));
                                                                                        List<SceneElement> listRl3 = I7a.rl();
                                                                                        if (listRl3 != null) {
                                                                                            QmE.iF iFVarLm119 = editActivity.lm1();
                                                                                            Bundle bundle17 = new Bundle();
                                                                                            bundle17.putInt(JavetError.PARAMETER_COUNT, listRl3.size());
                                                                                            Unit unit23 = Unit.INSTANCE;
                                                                                            iFVarLm119.n(new j.fuX("layer_paste", bundle17));
                                                                                            Ml.j jVarCk23 = editActivity.ck();
                                                                                            Iterator it21 = listRl3.iterator();
                                                                                            if (it21.hasNext()) {
                                                                                                numValueOf = Integer.valueOf(((SceneElement) it21.next()).getStartTime());
                                                                                                while (it21.hasNext()) {
                                                                                                    Integer numValueOf2 = Integer.valueOf(((SceneElement) it21.next()).getStartTime());
                                                                                                    if (numValueOf.compareTo(numValueOf2) > 0) {
                                                                                                        numValueOf = numValueOf2;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                numValueOf = null;
                                                                                            }
                                                                                            int iTy = HW.C.ty(editActivity) - (numValueOf != null ? numValueOf.intValue() : HW.C.ty(editActivity));
                                                                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listRl3, 10)), 16));
                                                                                            Iterator it22 = listRl3.iterator();
                                                                                            while (it22.hasNext()) {
                                                                                                Pair pair12 = TuplesKt.to(Long.valueOf(((SceneElement) it22.next()).getId()), Long.valueOf(SceneKt.getNextAvailableId(Ik().get_scene())));
                                                                                                linkedHashMap2.put(pair12.getFirst(), pair12.getSecond());
                                                                                            }
                                                                                            SceneHolder sceneHolderIk3 = Ik();
                                                                                            Scene scene5 = Ik().get_scene();
                                                                                            List<SceneElement> elements25 = Ik().get_scene().getElements();
                                                                                            ArrayList arrayList34 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listRl3, 10));
                                                                                            for (SceneElement sceneElement46 : listRl3) {
                                                                                                Object obj31 = linkedHashMap2.get(Long.valueOf(sceneElement46.getId()));
                                                                                                Intrinsics.checkNotNull(obj31);
                                                                                                long jLongValue2 = ((Number) obj31).longValue();
                                                                                                int startTime12 = sceneElement46.getStartTime() + iTy;
                                                                                                int endTime11 = sceneElement46.getEndTime() + iTy;
                                                                                                Long parent2 = sceneElement46.getParent();
                                                                                                arrayList34.add(SceneElementKt.recreateEngineState(SceneElement.copy$default(sceneElement46, null, startTime12, endTime11, jLongValue2, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, parent2 != null ? (Long) linkedHashMap2.get(Long.valueOf(parent2.longValue())) : null, false, null, null, -15, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, null)));
                                                                                            }
                                                                                            sceneHolderIk3.setScene(Scene.copy$default(scene5, null, 0, 0, 0, 0, 0, CollectionsKt.plus((Collection) elements25, (Iterable) arrayList34), 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null));
                                                                                            jVarCk23.n();
                                                                                        }
                                                                                        editActivity.vH3().te();
                                                                                        FragmentManager supportFragmentManager5 = editActivity.getSupportFragmentManager();
                                                                                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager5, "getSupportFragmentManager(...)");
                                                                                        I7a.nr(supportFragmentManager5);
                                                                                        break;
                                                                                    case 2131361947:
                                                                                        editActivity.lm1().n(new j.eZk(editActivity.Uo()));
                                                                                        List<SceneElement> elements26 = Ik().get_scene().getElements();
                                                                                        ArrayList arrayList35 = new ArrayList();
                                                                                        for (Object obj32 : elements26) {
                                                                                            if (editActivity.UpJ().contains(Long.valueOf(((SceneElement) obj32).getId()))) {
                                                                                                arrayList35.add(obj32);
                                                                                            }
                                                                                        }
                                                                                        List listRl4 = I7a.rl();
                                                                                        SceneElement sceneElement47 = listRl4 != null ? (SceneElement) CollectionsKt.firstOrNull(listRl4) : null;
                                                                                        com.alightcreative.widget.h6y h6yVarT = I7a.t();
                                                                                        Set setN = h6yVarT != null ? h6yVarT.n() : null;
                                                                                        if (sceneElement47 != null && setN != null) {
                                                                                            Ml.j jVarCk24 = editActivity.ck();
                                                                                            this.f45557t.S(arrayList35, sceneElement47, setN, Ik());
                                                                                            jVarCk24.n();
                                                                                        }
                                                                                        break;
                                                                                    case 2131361948:
                                                                                        editActivity.Fu();
                                                                                        break;
                                                                                }
                                                                                break;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
        Unit unit24 = Unit.INSTANCE;
    }

    public nSC(EditActivity activity, IG.Ml viewModel, SJ0.CN3 binding, VS editAddDelegate) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(editAddDelegate, "editAddDelegate");
        this.f45556n = activity;
        this.f45557t = viewModel;
        this.f45555O = binding;
        this.J2 = editAddDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement E2(Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(el.getTransform(), null, null, KeyableVector2D.INSTANCE.getONE(), null, 0.0f, 0.0f, null, null, false, 507, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement X(Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(el.getTransform(), null, KeyableVector2D.INSTANCE.getZERO(), null, null, 0.0f, 0.0f, null, null, false, 509, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement e(Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(el.getTransform(), null, null, null, null, 0.0f, 0.0f, null, KeyableVector2D.INSTANCE.getZERO(), false, 383, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement fD(nSC nsc, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(el.getTransform(), KeyableKt.keyable(new Vector3D(nsc.Ik().get_scene().getWidth() / 2.0f, nsc.Ik().get_scene().getHeight() / 2.0f, 0.0f, 4, null)), null, null, null, 0.0f, 0.0f, null, null, false, 510, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement iF(Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(el.getTransform(), null, null, null, KeyableKt.keyable(0.0f), 0.0f, 0.0f, null, null, false, 503, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(Ref.IntRef intRef) {
        return "action_ungroup insertIndex=" + intRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r(Rectangle rectangle) {
        return "bounds=" + rectangle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement te(Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, new KeyableTransform(el.getTransform().getLocation(), null, null, null, 0.0f, 0.0f, null, null, false, 510, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
    }

    public final SceneHolder Ik() {
        return this.f45556n.getSceneHolder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void XQ(EditActivity editActivity, DialogInterface dialogInterface, int i2) {
        editActivity.rV9(2131361953);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(EditActivity editActivity, nSC nsc, SceneElement sceneElement, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        QmE.iF iFVarLm1 = editActivity.lm1();
        Bundle bundle = new Bundle();
        bundle.putString("type", sceneElement.getNestedScene().getType().getLabel());
        Unit unit = Unit.INSTANCE;
        iFVarLm1.n(new j.fuX("missing_unlink_and_edit", bundle));
        nsc.Ik().update(SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -16777217, 127, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(EditActivity editActivity, int i2) {
        return editActivity.getString(2132019325, Integer.valueOf(i2));
    }
}
