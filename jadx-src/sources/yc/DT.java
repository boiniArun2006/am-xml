package yc;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class DT {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final List f75716n = CollectionsKt.listOf((Object[]) new S[]{new S(1, new Function3() { // from class: yc.z3w
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return Boolean.valueOf(DT.ck((VisualEffect) obj, (SceneElement) obj2, ((Boolean) obj3).booleanValue()));
        }
    }, 2132019258, 2131231693), new S(500, new Function3() { // from class: yc.U
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return Boolean.valueOf(DT.Ik((VisualEffect) obj, (SceneElement) obj2, ((Boolean) obj3).booleanValue()));
        }
    }, 2132019253, null, 8, null), new S(103, new Function3() { // from class: yc.IE
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return Boolean.valueOf(DT.S((VisualEffect) obj, (SceneElement) obj2, ((Boolean) obj3).booleanValue()));
        }
    }, 2132019249, 2131231580), new S(102, new Function3() { // from class: yc.zpl
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return Boolean.valueOf(DT.WPU((VisualEffect) obj, (SceneElement) obj2, ((Boolean) obj3).booleanValue()));
        }
    }, 2132019251, 2131231581), new S(104, new Function3() { // from class: yc.ibE
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return Boolean.valueOf(DT.aYN((VisualEffect) obj, (SceneElement) obj2, ((Boolean) obj3).booleanValue()));
        }
    }, 2132019248, 2131231579), new S(106, new Function3() { // from class: yc.OA
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return Boolean.valueOf(DT.ViF((VisualEffect) obj, (SceneElement) obj2, ((Boolean) obj3).booleanValue()));
        }
    }, 2132019262, 2131231588), new S(105, new Function3() { // from class: yc.Mo
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return Boolean.valueOf(DT.nY((VisualEffect) obj, (SceneElement) obj2, ((Boolean) obj3).booleanValue()));
        }
    }, 2132019257, 2131231585), new S(112, new Function3() { // from class: yc.HcS
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return Boolean.valueOf(DT.g((VisualEffect) obj, (SceneElement) obj2, ((Boolean) obj3).booleanValue()));
        }
    }, 2132019247, 2131231578), new S(107, new Function3() { // from class: yc.VoU
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return Boolean.valueOf(DT.te((VisualEffect) obj, (SceneElement) obj2, ((Boolean) obj3).booleanValue()));
        }
    }, 2132019261, 2131231583), new S(111, new Function3() { // from class: yc.s6u
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return Boolean.valueOf(DT.iF((VisualEffect) obj, (SceneElement) obj2, ((Boolean) obj3).booleanValue()));
        }
    }, 2132019259, 2131231586), new S(108, new Function3() { // from class: yc.yr
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return Boolean.valueOf(DT.r((VisualEffect) obj, (SceneElement) obj2, ((Boolean) obj3).booleanValue()));
        }
    }, 2132019254, 2131231582), new S(109, new Function3() { // from class: yc.eZk
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return Boolean.valueOf(DT.o((VisualEffect) obj, (SceneElement) obj2, ((Boolean) obj3).booleanValue()));
        }
    }, 2132019255, 2131231584), new S(101, new Function3() { // from class: yc.D
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return Boolean.valueOf(DT.Z((VisualEffect) obj, (SceneElement) obj2, ((Boolean) obj3).booleanValue()));
        }
    }, 2132019260, 2131231587), new S(0, new Function3() { // from class: yc.W
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return Boolean.valueOf(DT.XQ((VisualEffect) obj, (SceneElement) obj2, ((Boolean) obj3).booleanValue()));
        }
    }, 2132019256, null, 8, null)});
    private static final Lazy rl = LazyKt.lazy(new Function0() { // from class: yc.t6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DT.fD();
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final List f75717t = CollectionsKt.listOf((Object[]) new String[]{"com.alightcreative.effects.tile", "com.alightcreative.effects.motionblur2", "com.alightcreative.effects.oscillate", "com.alightcreative.effects.chromakey", "com.alightcreative.effects.textprogress", "com.alightcreative.effects.wipe", "com.alightcreative.effects.exposure", "com.alightcreative.effects.squeeze", "com.alightcreative.effects.displacemap2", "com.alightcreative.effects.spherize", "com.alightcreative.effects.textspacing", "com.alightcreative.effects.fade", "com.alightcreative.effects.flip2", "com.alightcreative.effects.tilerotate", "com.alightcreative.effects.brightcont2", "com.alightcreative.effects.gaussianblur", "com.alightcreative.effects.satvib", "com.alightcreative.effects.wavewarp2", "com.alightcreative.effects.dblur", "com.alightcreative.effects.pulsate"});

    public static final List E2() {
        return f75716n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Ik(VisualEffect ve, SceneElement sceneElement, boolean z2) {
        Intrinsics.checkNotNullParameter(ve, "ve");
        return ve.getExperimental() && com.alightcreative.app.motion.persist.j.INSTANCE.getExperimentalEffects() && z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean S(VisualEffect ve, SceneElement sceneElement, boolean z2) {
        Intrinsics.checkNotNullParameter(ve, "ve");
        return Intrinsics.areEqual(TtmlNode.ATTR_TTS_COLOR, ve.getCategoryId()) && !ve.getExperimental();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ViF(VisualEffect ve, SceneElement sceneElement, boolean z2) {
        Intrinsics.checkNotNullParameter(ve, "ve");
        return Intrinsics.areEqual("distort", ve.getCategoryId()) && !ve.getExperimental();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean WPU(VisualEffect ve, SceneElement sceneElement, boolean z2) {
        Intrinsics.checkNotNullParameter(ve, "ve");
        return Intrinsics.areEqual("drawing", ve.getCategoryId()) && !ve.getExperimental();
    }

    private static final List X() {
        return (List) rl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean XQ(VisualEffect ve, SceneElement sceneElement, boolean z2) {
        Intrinsics.checkNotNullParameter(ve, "ve");
        if (ve.getExperimental()) {
            return false;
        }
        List listX = X();
        if (listX != null && listX.isEmpty()) {
            return true;
        }
        Iterator it = listX.iterator();
        while (it.hasNext()) {
            if (((Boolean) ((S) it.next()).rl().invoke(ve, sceneElement, Boolean.valueOf(z2))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Z(VisualEffect ve, SceneElement sceneElement, boolean z2) {
        Intrinsics.checkNotNullParameter(ve, "ve");
        return Intrinsics.areEqual("text", ve.getCategoryId()) && !ve.getExperimental();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean aYN(VisualEffect ve, SceneElement sceneElement, boolean z2) {
        Intrinsics.checkNotNullParameter(ve, "ve");
        return Intrinsics.areEqual("blur", ve.getCategoryId()) && !ve.getExperimental();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ck(VisualEffect ve, SceneElement sceneElement, boolean z2) {
        Intrinsics.checkNotNullParameter(ve, "ve");
        if (ve.getInternal() || ve.getDeprecated()) {
            return false;
        }
        return !ve.getExperimental() || com.alightcreative.app.motion.persist.j.INSTANCE.getExperimentalEffects();
    }

    public static final List e() {
        return f75717t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List fD() {
        List list = f75716n;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            S s2 = (S) obj;
            if (s2.n() != 1 && s2.n() != 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(VisualEffect ve, SceneElement sceneElement, boolean z2) {
        Intrinsics.checkNotNullParameter(ve, "ve");
        return Intrinsics.areEqual("3d", ve.getCategoryId()) && !ve.getExperimental();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean iF(VisualEffect ve, SceneElement sceneElement, boolean z2) {
        Intrinsics.checkNotNullParameter(ve, "ve");
        return Intrinsics.areEqual("repeat", ve.getCategoryId()) && !ve.getExperimental();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nY(VisualEffect ve, SceneElement sceneElement, boolean z2) {
        Intrinsics.checkNotNullParameter(ve, "ve");
        return Intrinsics.areEqual("procedural", ve.getCategoryId()) && !ve.getExperimental();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(VisualEffect ve, SceneElement sceneElement, boolean z2) {
        Intrinsics.checkNotNullParameter(ve, "ve");
        return Intrinsics.areEqual("opacity", ve.getCategoryId()) && !ve.getExperimental();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(VisualEffect ve, SceneElement sceneElement, boolean z2) {
        Intrinsics.checkNotNullParameter(ve, "ve");
        return Intrinsics.areEqual("matte", ve.getCategoryId()) && !ve.getExperimental();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean te(VisualEffect ve, SceneElement sceneElement, boolean z2) {
        Intrinsics.checkNotNullParameter(ve, "ve");
        return Intrinsics.areEqual("transform", ve.getCategoryId()) && !ve.getExperimental();
    }
}
