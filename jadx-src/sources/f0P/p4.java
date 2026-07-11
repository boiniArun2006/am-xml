package f0P;

import Hr.CQ.USEaHtCMH;
import androidx.fragment.app.Fragment;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.Keyframe;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.app.motion.scene.timemapping.TimeMapping;
import com.alightcreative.app.motion.scene.timemapping.TimeMappingKt;
import d2n.Ml;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class p4 {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class j implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Float.valueOf(((Keyframe) obj).getTime()), Float.valueOf(((Keyframe) obj2).getTime()));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class n implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Float.valueOf(((Keyframe) obj).getTime()), Float.valueOf(((Keyframe) obj2).getTime()));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class w6 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Float.valueOf(((Keyframe) obj).getTime()), Float.valueOf(((Keyframe) obj2).getTime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Ik(SceneElement sceneElement, long j2, TimeMapping timeMapping, int i2, float f3) {
        return d2n.Ml.mUb(bK.n.nr(bK.n.t(d2n.Ml.f63370t.rl((long) (f3 * zd.w6.qie(sceneElement))), j2, sceneElement.getTimeMapping().getSpeedFunction()), j2, timeMapping.getSpeedFunction())) / i2;
    }

    public static final SceneElement ck(final SceneElement sceneElement, Function1 speedValueUpdate) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(speedValueUpdate, "speedValueUpdate");
        if (zd.w6.qie(sceneElement) <= 0) {
            return sceneElement;
        }
        Ml.j jVar = d2n.Ml.f63370t;
        final long jRl = jVar.rl(sceneElement.getInTime());
        Keyable keyable = (Keyable) speedValueUpdate.invoke(sceneElement.getSpeedMap());
        final TimeMapping timeMappingM17toTimeMappingUqo2Ic = TimeMappingKt.m17toTimeMappingUqo2Ic(keyable, jRl, d2n.j.f63374t.t(zd.w6.qie(sceneElement)), (12 & 4) != 0 ? d2n.j.f63374t.t(TimeMappingKt.EASYING_SAMPLING_INTERVAL_MILLIS) : 0L, (12 & 8) != 0 ? TimeMappingKt.EASYING_SAMPLING_MAX_INTERVALS : 0);
        final int iMUb = (int) d2n.Ml.mUb(bK.n.nr(bK.n.t(jVar.rl(zd.w6.qie(sceneElement)), jRl, sceneElement.getTimeMapping().getSpeedFunction()), jRl, timeMappingM17toTimeMappingUqo2Ic.getSpeedFunction()));
        if (iMUb <= 0) {
            return sceneElement;
        }
        return SceneElement.copy$default(SceneElementKt.copyAdjustingKeyframeTiming(sceneElement, new Function1() { // from class: f0P.vPD
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(p4.Ik(sceneElement, jRl, timeMappingM17toTimeMappingUqo2Ic, iMUb, ((Float) obj).floatValue()));
            }
        }), null, 0, sceneElement.getStartTime() + iMUb, 0L, null, null, null, null, null, null, null, null, null, null, null, keyable, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -32773, 127, null);
    }

    public static final float gh(SceneElement sceneElement, float f3) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Ml.j jVar = d2n.Ml.f63370t;
        return bK.n.t(jVar.O(((double) (zd.w6.qie(sceneElement) * f3)) / 1000.0d), jVar.rl(sceneElement.getInTime()), sceneElement.getTimeMapping().getSpeedFunction());
    }

    public static final long qie(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        SceneElement sceneElementNHg = HW.C.nHg(fragment);
        return sceneElementNHg != null ? bK.n.t(az(fragment), d2n.Ml.f63370t.rl(sceneElementNHg.getInTime()), sceneElementNHg.getTimeMapping().getSpeedFunction()) : d2n.Ml.f63370t.J2();
    }

    public static final boolean ty(SceneHolder sceneHolder) {
        return sceneHolder != null && sceneHolder.getEditMode() == 2131362628;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean xMQ(Keyframe keyframe, Keyframe keyframe2) {
        Intrinsics.checkNotNullParameter(keyframe2, USEaHtCMH.RbqTyGzvNhsq);
        return !(keyframe2.getTime() == keyframe.getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyframe HI(Keyable keyable, float f3, SceneElement sceneElement, Scene scene) {
        Keyframe keyframeClosestBeforeTime = KeyableKt.closestBeforeTime(keyable, f3);
        Keyframe keyframeClosestAfterTime = KeyableKt.closestAfterTime(keyable, f3);
        int iFrameNumberFromTime = TimeKt.frameNumberFromTime(KeyableKt.sceneTimeFromLocalTime(sceneElement, f3), scene.getFramesPerHundredSeconds());
        if (keyframeClosestBeforeTime != null && iFrameNumberFromTime == TimeKt.frameNumberFromTime(KeyableKt.sceneTimeFromLocalTime(sceneElement, keyframeClosestBeforeTime.getTime()), scene.getFramesPerHundredSeconds())) {
            return keyframeClosestBeforeTime;
        }
        if (keyframeClosestAfterTime != null && iFrameNumberFromTime == TimeKt.frameNumberFromTime(KeyableKt.sceneTimeFromLocalTime(sceneElement, keyframeClosestAfterTime.getTime()), scene.getFramesPerHundredSeconds())) {
            return keyframeClosestAfterTime;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable KN(Keyable keyable, final Keyframe keyframe) {
        if (!keyable.getKeyed()) {
            return Keyable.DefaultImpls.copyWith$default(keyable, CollectionsKt.listOf(keyframe), false, null, 6, null);
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, SequencesKt.toList(SequencesKt.sortedWith(SequencesKt.plus((Sequence<? extends Keyframe>) SequencesKt.filter(CollectionsKt.asSequence(keyable.getKeyframes()), new Function1() { // from class: f0P.Yv
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(p4.xMQ(keyframe, (Keyframe) obj));
            }
        }), keyframe), new n())), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable Uo(Keyable keyable, float f3) {
        if (!keyable.getKeyed()) {
            return Keyable.DefaultImpls.copyWith$default(keyable, CollectionsKt.listOf(new Keyframe(((Keyframe) keyable.getKeyframes().get(0)).getValue(), f3, null, null, 12, null)), true, null, 4, null);
        }
        List keyframes = keyable.getKeyframes();
        if (keyframes == null || !keyframes.isEmpty()) {
            Iterator it = keyframes.iterator();
            while (it.hasNext()) {
                if (((Keyframe) it.next()).getTime() == f3) {
                    return keyable;
                }
            }
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, CollectionsKt.sortedWith(CollectionsKt.plus((Collection<? extends Keyframe>) keyable.getKeyframes(), new Keyframe(KeyableKt.valueAtTime(keyable, f3), f3, null, null, 12, null)), new j()), false, null, 6, null);
    }

    private static final long az(Fragment fragment) {
        if (HW.C.nHg(fragment) != null) {
            return d2n.Ml.f63370t.rl(HW.C.WPU(fragment) - r0.getStartTime());
        }
        return d2n.Ml.f63370t.J2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable mUb(Keyable keyable, float f3, Object obj) {
        Object next;
        List listN;
        if (!keyable.getKeyed()) {
            return Keyable.DefaultImpls.copyWith$default(keyable, CollectionsKt.listOf(new Keyframe(obj, 0.0f, null, null, 12, null)), false, null, 6, null);
        }
        Iterator it = keyable.getKeyframes().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((Keyframe) next).getTime() == f3) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Keyframe keyframe = (Keyframe) next;
        if (keyframe == null) {
            listN = CollectionsKt.sortedWith(CollectionsKt.plus((Collection<? extends Keyframe>) keyable.getKeyframes(), new Keyframe(obj, f3, null, null, 12, null)), new w6());
        } else {
            listN = v9.CN3.n(keyable.getKeyframes(), keyframe, new Keyframe(obj, f3, keyframe.getEasing(), null, 8, null));
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, listN, false, null, 6, null);
    }
}
