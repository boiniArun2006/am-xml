package yc;

import QmE.j;
import SJ0.C1454b;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager;
import com.alightcreative.app.motion.activities.edit.widgets.n;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.Keyframe;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneHolderState;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.app.motion.scene.TrimmingKt;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import com.vungle.ads.internal.protos.Sdk;
import f0P.p4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import yc.cF;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class cF extends RecyclerView.Adapter implements J {
    public static final j HI = new j(null);
    public static final int ck = 8;
    private final QmE.iF J2;
    private final int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function0 f75927O;
    private SceneElement Uo;
    private final Function1 az;
    private boolean gh;
    private RecyclerView mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SceneHolder f75928n;
    private final Function0 nr;
    private long qie;
    private final SceneThumbnailMaker rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f75929t;
    private final n ty;
    private TimelineLayoutManager xMQ;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public static final class n extends RecyclerView.AdapterDataObserver {
        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            cF cFVar = cF.this;
            cFVar.Uo = SceneKt.elementById(cFVar.ViF().get_scene(), Long.valueOf(cF.this.aYN()));
        }
    }

    public static final class w6 implements View.OnTouchListener {
        private int E2;
        private int J2;
        final /* synthetic */ TimelineLayoutManager M7;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private int f75931N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f75932O;
        final /* synthetic */ List P5;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private int f75933S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private Function1 f75934T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        final /* synthetic */ List f75935U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private Function0 f75936X;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private int f75937Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Function2 f75938e;
        final /* synthetic */ Fo eF;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f75939g;
        final /* synthetic */ int jB;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float f75940n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private float f75941o;
        final /* synthetic */ RecyclerView p5;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private List f75942r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private float f75943t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private HW.o f75944v = HW.Ml.f3896n;

        public static final class j implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.compareValues(Float.valueOf(((Keyframe) obj).getTime()), Float.valueOf(((Keyframe) obj2).getTime()));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float N(float f3, float f4, float f5) {
            return (f5 * f3) + f4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float T(float f3, float f4) {
            return f3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float bzg(float f3, float f4) {
            return f4 * f3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float jB(float f3) {
            return (float) Math.sin(((double) f3) * 3.141592653589793d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float rV9(float f3, float f4) {
            return f3;
        }

        w6(int i2, List list, List list2, TimelineLayoutManager timelineLayoutManager, RecyclerView recyclerView, Fo fo) {
            this.jB = i2;
            this.f75935U = list;
            this.P5 = list2;
            this.M7 = timelineLayoutManager;
            this.p5 = recyclerView;
            this.eF = fo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Keyable E(SceneElement sceneElement, w6 w6Var, final Integer num, Keyable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Keyable.DefaultImpls.copyWith$default(it, SequencesKt.toList(SequencesKt.sortedWith(SequencesKt.plus((Sequence<? extends Keyframe>) SequencesKt.filterIndexed(CollectionsKt.asSequence(it.getKeyframes()), new Function2() { // from class: yc.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(cF.w6.M(num, ((Integer) obj).intValue(), (Keyframe) obj2));
                }
            }), Keyframe.copy$default((Keyframe) it.getKeyframes().get(num.intValue()), null, p4.gh(sceneElement, w6Var.f75941o), null, null, 13, null)), new j())), false, null, 6, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit E2(cF cFVar, final w6 w6Var, TimelineLayoutManager timelineLayoutManager, View view, Fo fo, float f3, float f4) {
            SceneElement sceneElement = cFVar.Uo;
            if (sceneElement == null) {
                return Unit.INSTANCE;
            }
            int iRoundToFrameStartTime = TimeKt.roundToFrameStartTime(w6Var.f75932O + ((int) (((f3 - w6Var.f75940n) / timelineLayoutManager.jX()) * 1000.0f)), cFVar.ViF().get_scene().getFramesPerHundredSeconds());
            w6Var.f75937Z = iRoundToFrameStartTime;
            int iMin = Math.min(iRoundToFrameStartTime, (w6Var.f75933S - (100000 / cFVar.ViF().get_scene().getFramesPerHundredSeconds())) + 1);
            w6Var.f75937Z = iMin;
            w6Var.f75939g = TrimmingKt.recomputeInTime(sceneElement, iMin);
            XoT.C.Uo(w6Var, new Function0() { // from class: yc.fi
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return cF.w6.e(this.f75979n);
                }
            });
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.LayoutParams");
            TimelineLayoutManager.j jVar = (TimelineLayoutManager.j) layoutParams;
            jVar.qie(w6Var.f75937Z);
            view.setLayoutParams(jVar);
            int endTime = sceneElement.getEndTime() - sceneElement.getStartTime();
            float f5 = w6Var.f75933S - w6Var.f75937Z;
            float f6 = endTime / f5;
            float startTime = (sceneElement.getStartTime() - w6Var.f75937Z) / f5;
            if (cFVar.ViF().getEditMode() != 2131362628) {
                fo.az().f9621O.setTimeOffset(startTime);
                fo.az().f9621O.setTimeScaleFactor(f6);
            }
            if (sceneElement.getFillImage() != null) {
                fo.az().Uo.setInTime(0L);
                fo.az().Uo.setOutTime(sceneElement.getEndTime() - sceneElement.getStartTime());
            } else if (sceneElement.getFillVideo() != null) {
                fo.az().Uo.setInTime(w6Var.f75939g);
                fo.az().Uo.setOutTime(Math.min(sceneElement.getOutTime(), w6Var.f75939g + (sceneElement.getEndTime() - sceneElement.getStartTime())));
            }
            w6Var.f75944v.J2(TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75937Z - w6Var.f75932O, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "+mm:ss:ff"));
            w6Var.f75944v.n(TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75939g, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"));
            w6Var.f75944v.O(2132020224, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75937Z, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"), 2132019414, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75939g, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"), 2132018955, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75933S, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"), 2132019810, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75939g + (w6Var.f75933S - w6Var.f75937Z), cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"), 2132017714, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75937Z - w6Var.f75933S, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"), 2132017415, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75937Z - w6Var.f75932O, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "+mm:ss:ff"));
            timelineLayoutManager.i7(new n.j(SetsKt.setOf(Integer.valueOf(TimeKt.frameNumberFromStartTime(w6Var.f75932O, cFVar.ViF().get_scene().getFramesPerHundredSeconds()))), SetsKt.setOf(Integer.valueOf(TimeKt.frameNumberFromStartTime(w6Var.f75937Z, cFVar.ViF().get_scene().getFramesPerHundredSeconds())))));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean M(Integer num, int i2, Keyframe keyframe) {
            Intrinsics.checkNotNullParameter(keyframe, "<unused var>");
            return num == null || i2 != num.intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String M7() {
            return "execute callback";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void P5(int i2, w6 w6Var, View view, cF cFVar) {
            if (i2 == w6Var.f75931N && view.isAttachedToWindow()) {
                XoT.C.Uo(w6Var, new Function0() { // from class: yc.fmn
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return cF.w6.M7();
                    }
                });
                ViewParent parent = view.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                view.setBackground(null);
                Function0 function0 = w6Var.f75936X;
                if (function0 != null) {
                    function0.invoke();
                }
                cFVar.gh = true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit U(w6 w6Var, TimelineLayoutManager timelineLayoutManager, cF cFVar, View view, float f3, float f4) {
            int i2 = w6Var.J2;
            int i3 = w6Var.f75932O;
            int iRoundToFrameStartTime = TimeKt.roundToFrameStartTime(i3 + ((int) (((f3 - w6Var.f75940n) / timelineLayoutManager.jX()) * 1000.0f)), cFVar.ViF().get_scene().getFramesPerHundredSeconds());
            w6Var.f75937Z = iRoundToFrameStartTime;
            w6Var.f75933S = iRoundToFrameStartTime + (i2 - i3);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.LayoutParams");
            TimelineLayoutManager.j jVar = (TimelineLayoutManager.j) layoutParams;
            jVar.qie(w6Var.f75937Z);
            jVar.xMQ(w6Var.f75933S);
            view.setLayoutParams(jVar);
            w6Var.f75944v.J2(TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75937Z - w6Var.f75932O, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "+mm:ss:ff"));
            w6Var.f75944v.n(TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75937Z, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"));
            timelineLayoutManager.i7(new n.j(SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf(TimeKt.frameNumberFromStartTime(w6Var.f75932O, cFVar.ViF().get_scene().getFramesPerHundredSeconds())), Integer.valueOf(TimeKt.frameNumberFromStartTime(w6Var.J2, cFVar.ViF().get_scene().getFramesPerHundredSeconds()))}), SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf(TimeKt.frameNumberFromStartTime(w6Var.f75937Z, cFVar.ViF().get_scene().getFramesPerHundredSeconds())), Integer.valueOf(TimeKt.frameNumberFromStartTime(w6Var.f75933S, cFVar.ViF().get_scene().getFramesPerHundredSeconds()))})));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit X(w6 w6Var, cF cFVar, SceneElement el) {
            Intrinsics.checkNotNullParameter(el, "el");
            int endTime = el.getEndTime() - el.getStartTime();
            float f3 = w6Var.f75933S - w6Var.f75937Z;
            final float f4 = endTime / f3;
            if (!Float.isInfinite(f4) && !Float.isNaN(f4)) {
                if (cFVar.ViF().getEditMode() == 2131362628) {
                    cFVar.ViF().update(SceneElement.copy$default(el, null, w6Var.f75937Z, w6Var.f75933S, 0L, null, null, null, null, null, null, null, null, null, null, null, UserParameterKt.copyAdjustingFloatValue(el.getSpeedMap(), new Function1() { // from class: yc.Vgd
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(cF.w6.T(f4, ((Float) obj).floatValue()));
                        }
                    }), null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -32775, 127, null));
                } else {
                    final float startTime = (el.getStartTime() - w6Var.f75937Z) / f3;
                    cFVar.ViF().update(SceneElement.copy$default(SceneElementKt.copyAdjustingKeyframeTiming(el, new Function1() { // from class: yc.tce
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(cF.w6.N(f4, startTime, ((Float) obj).floatValue()));
                        }
                    }), null, w6Var.f75937Z, w6Var.f75933S, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, w6Var.f75939g, w6Var.E2, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -393223, 127, null));
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String e(w6 w6Var) {
            return "Trim Start: " + w6Var.f75932O + " -> " + w6Var.f75937Z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String eF() {
            return "Action Up";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit fD(List list, View view, w6 w6Var, cF cFVar, TimelineLayoutManager timelineLayoutManager) {
            HW.o oVarB;
            ((ImageView) list.get(0)).setAlpha(0.5f);
            view.setTranslationZ(10.0f);
            ((ImageView) list.get(0)).setTranslationZ(11.0f);
            Activity activityN = HW.qz.n(view);
            if (activityN == null || (oVarB = HW.C.B(activityN)) == null) {
                oVarB = HW.Ml.f3896n;
            }
            w6Var.f75944v = oVarB;
            oVarB.rl(2131231128);
            w6Var.f75944v.nr(2131231851);
            w6Var.f75944v.J2("+00:00:00");
            w6Var.f75944v.t(HW.w6.f3905t);
            w6Var.f75944v.O(2132020224, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75937Z, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"), 2132019414, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75939g, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"), 2132018955, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75933S, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"), 2132019810, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75939g + (w6Var.f75933S - w6Var.f75937Z), cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"), 2132017714, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75937Z - w6Var.f75933S, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"), 2132017415, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75937Z - w6Var.f75932O, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "+mm:ss:ff"));
            w6Var.f75944v.n(TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75932O, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"));
            timelineLayoutManager.i7(new n.j(SetsKt.setOf(Integer.valueOf(TimeKt.frameNumberFromStartTime(w6Var.f75932O, cFVar.ViF().get_scene().getFramesPerHundredSeconds()))), SetsKt.setOf(Integer.valueOf(TimeKt.frameNumberFromStartTime(w6Var.f75932O, cFVar.ViF().get_scene().getFramesPerHundredSeconds())))));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String g() {
            return "Action Down";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String iF(int i2, w6 w6Var) {
            return "Move KF: " + i2 + " -> " + w6Var.f75941o;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nHg(List list, View view, w6 w6Var, cF cFVar, TimelineLayoutManager timelineLayoutManager) {
            HW.o oVarB;
            ((ImageView) list.get(1)).setAlpha(0.5f);
            view.setTranslationZ(10.0f);
            Activity activityN = HW.qz.n(view);
            if (activityN == null || (oVarB = HW.C.B(activityN)) == null) {
                oVarB = HW.Ml.f3896n;
            }
            w6Var.f75944v = oVarB;
            oVarB.rl(2131231129);
            w6Var.f75944v.nr(2131231851);
            w6Var.f75944v.J2("+00:00:00");
            w6Var.f75944v.n(TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75932O, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"));
            w6Var.f75944v.t(HW.w6.f3905t);
            w6Var.f75944v.O(2132020224, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75937Z, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"), 2132019414, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75939g, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"), 2132018955, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75933S, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"), 2132019810, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75939g + (w6Var.f75933S - w6Var.f75937Z), cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"), 2132017714, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75937Z - w6Var.f75933S, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"), 2132017415, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75933S - w6Var.J2, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "+mm:ss:ff"));
            timelineLayoutManager.i7(new n.j(SetsKt.setOf(Integer.valueOf(TimeKt.frameNumberFromStartTime(w6Var.J2, cFVar.ViF().get_scene().getFramesPerHundredSeconds()))), SetsKt.setOf(Integer.valueOf(TimeKt.frameNumberFromStartTime(w6Var.J2, cFVar.ViF().get_scene().getFramesPerHundredSeconds())))));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String p5() {
            return "Action Move";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s7N(cF cFVar, final w6 w6Var, TimelineLayoutManager timelineLayoutManager, Fo fo, View view, float f3, float f4) {
            SceneElement sceneElement = cFVar.Uo;
            if (sceneElement == null) {
                return Unit.INSTANCE;
            }
            int iRoundToFrameStartTime = TimeKt.roundToFrameStartTime(w6Var.J2 + ((int) (((f3 - w6Var.f75940n) / timelineLayoutManager.jX()) * 1000.0f)), cFVar.ViF().get_scene().getFramesPerHundredSeconds());
            w6Var.f75933S = iRoundToFrameStartTime;
            int iMax = Math.max(iRoundToFrameStartTime, (w6Var.f75937Z + (100000 / cFVar.ViF().get_scene().getFramesPerHundredSeconds())) - 1);
            w6Var.f75933S = iMax;
            w6Var.E2 = TrimmingKt.recomputeOutTime(sceneElement, iMax);
            float endTime = (sceneElement.getEndTime() - sceneElement.getStartTime()) / (w6Var.f75933S - sceneElement.getStartTime());
            if (cFVar.ViF().getEditMode() != 2131362628) {
                fo.az().f9621O.setTimeScaleFactor(endTime);
            }
            XoT.C.Uo(w6Var, new Function0() { // from class: yc.Y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return cF.w6.wTp(this.f75896n);
                }
            });
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.LayoutParams");
            TimelineLayoutManager.j jVar = (TimelineLayoutManager.j) layoutParams;
            jVar.xMQ(w6Var.f75933S);
            view.setLayoutParams(jVar);
            w6Var.f75944v.J2(TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75937Z - w6Var.f75932O, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "+mm:ss:ff"));
            w6Var.f75944v.n(TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.E2, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"));
            w6Var.f75944v.O(2132020224, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75937Z, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"), 2132019414, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75939g, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"), 2132018955, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75933S, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"), 2132019810, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75939g + (w6Var.f75933S - w6Var.f75937Z), cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"), 2132017714, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75937Z - w6Var.f75933S, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"), 2132017415, TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75933S - w6Var.J2, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "+mm:ss:ff"));
            timelineLayoutManager.i7(new n.j(SetsKt.setOf(Integer.valueOf(TimeKt.frameNumberFromStartTime(w6Var.J2, cFVar.ViF().get_scene().getFramesPerHundredSeconds()))), SetsKt.setOf(Integer.valueOf(TimeKt.frameNumberFromStartTime(w6Var.f75933S, cFVar.ViF().get_scene().getFramesPerHundredSeconds())))));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(w6 w6Var, cF cFVar, SceneElement el) {
            Intrinsics.checkNotNullParameter(el, "el");
            int endTime = el.getEndTime() - el.getStartTime();
            int i2 = w6Var.f75933S - w6Var.f75937Z;
            final float f3 = endTime / i2;
            if (!Float.isInfinite(f3) && !Float.isNaN(f3)) {
                if (cFVar.ViF().getEditMode() == 2131362628 || endTime <= 0) {
                    cFVar.ViF().update(SceneElement.copy$default(el, null, w6Var.f75937Z, w6Var.f75933S, 0L, null, null, null, null, null, null, null, null, null, null, null, UserParameterKt.copyAdjustingFloatValue(el.getSpeedMap(), new Function1() { // from class: yc.tUY
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(cF.w6.rV9(f3, ((Float) obj).floatValue()));
                        }
                    }), null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -32775, 127, null));
                } else if (i2 >= 0) {
                    cFVar.ViF().update(SceneElement.copy$default(SceneElementKt.copyAdjustingKeyframeTiming(el, new Function1() { // from class: yc.Jr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(cF.w6.bzg(f3, ((Float) obj).floatValue()));
                        }
                    }), null, w6Var.f75937Z, w6Var.f75933S, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, w6Var.f75939g, w6Var.E2, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -393223, 127, null));
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String wTp(w6 w6Var) {
            return "Trim Start: " + w6Var.J2 + " -> " + w6Var.f75933S;
        }

        /* JADX WARN: Removed duplicated region for block: B:114:0x0396  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouch(final View view, final MotionEvent event) {
            int i2;
            final View view2;
            final w6 w6Var;
            Collection collectionEmptyList;
            List keyframes;
            List listEmptyList;
            Object next;
            SceneElement sceneElementCk;
            Function2 function2;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(event, "event");
            int actionMasked = event.getActionMasked();
            Object next2 = null;
            if (actionMasked == 0) {
                XoT.C.Uo(this, new Function0() { // from class: yc.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return cF.w6.g();
                    }
                });
                cF.this.gh = false;
                final int i3 = this.f75931N + 1;
                this.f75931N = i3;
                this.f75936X = null;
                this.f75934T = null;
                int width = view.getWidth();
                final int i5 = this.jB;
                int i7 = width - (2 * i5);
                this.f75940n = event.getRawX();
                this.f75943t = event.getRawY();
                SceneElement sceneElement = cF.this.Uo;
                this.f75932O = sceneElement != null ? sceneElement.getStartTime() : 0;
                SceneElement sceneElement2 = cF.this.Uo;
                int endTime = sceneElement2 != null ? sceneElement2.getEndTime() : 0;
                this.J2 = endTime;
                this.f75937Z = this.f75932O;
                this.f75933S = endTime;
                SceneElement sceneElement3 = cF.this.Uo;
                this.f75939g = sceneElement3 != null ? sceneElement3.getInTime() : 0;
                SceneElement sceneElement4 = cF.this.Uo;
                this.E2 = sceneElement4 != null ? sceneElement4.getOutTime() : 0;
                this.f75942r = null;
                List<oA.j> list = this.f75935U;
                cF cFVar = cF.this;
                ArrayList arrayList = new ArrayList();
                for (oA.j jVar : list) {
                    SceneElement sceneElement5 = cFVar.Uo;
                    Intrinsics.checkNotNull(sceneElement5);
                    Keyable keyable = (Keyable) jVar.O(sceneElement5);
                    if (keyable == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        if (keyable.getKeyed()) {
                            List keyframes2 = keyable.getKeyframes();
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes2, 10));
                            Iterator it = keyframes2.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(Float.valueOf(((Keyframe) it.next()).getTime()));
                            }
                            listEmptyList = arrayList2;
                        } else {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        if (listEmptyList == null) {
                        }
                    }
                    CollectionsKt.addAll(arrayList, listEmptyList);
                }
                Set set = CollectionsKt.toSet(arrayList);
                int i8 = this.jB;
                Iterator it2 = set.iterator();
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (it2.hasNext()) {
                        float f3 = i8;
                        float f4 = i7;
                        float fAbs = Math.abs((event.getX() - f3) - (((Number) next2).floatValue() * f4));
                        do {
                            Object next3 = it2.next();
                            float fAbs2 = Math.abs((event.getX() - f3) - (((Number) next3).floatValue() * f4));
                            if (Float.compare(fAbs, fAbs2) > 0) {
                                next2 = next3;
                                fAbs = fAbs2;
                            }
                        } while (it2.hasNext());
                    }
                }
                final Float f5 = (Float) next2;
                final float fAbs3 = f5 != null ? Math.abs((event.getX() - this.jB) - (f5.floatValue() * i7)) : 0.0f;
                List<oA.j> list2 = this.f75935U;
                cF cFVar2 = cF.this;
                final ArrayList arrayList3 = new ArrayList();
                for (oA.j jVar2 : list2) {
                    SceneElement sceneElement6 = cFVar2.Uo;
                    Intrinsics.checkNotNull(sceneElement6);
                    Keyable keyable2 = (Keyable) jVar2.O(sceneElement6);
                    if (keyable2 == null || (keyframes = keyable2.getKeyframes()) == null) {
                        collectionEmptyList = CollectionsKt.emptyList();
                    } else {
                        collectionEmptyList = new ArrayList();
                        for (Object obj : keyframes) {
                            if (Intrinsics.areEqual(((Keyframe) obj).getTime(), f5)) {
                                collectionEmptyList.add(obj);
                            }
                        }
                    }
                    CollectionsKt.addAll(arrayList3, collectionEmptyList);
                }
                XoT.C.Uo(this, new Function0() { // from class: yc.G
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return cF.w6.FX(arrayList3, fAbs3, i5, event);
                    }
                });
                if (f5 == null || arrayList3.isEmpty() || fAbs3 >= i5) {
                    i2 = 25;
                    if (event.getX() < i5) {
                        ((ImageView) this.P5.get(0)).setAlpha(0.3f);
                        final List list3 = this.P5;
                        final cF cFVar3 = cF.this;
                        final TimelineLayoutManager timelineLayoutManager = this.M7;
                        w6Var = this;
                        w6Var.f75936X = new Function0() { // from class: yc.QUT
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cF.w6.fD(list3, view, this, cFVar3, timelineLayoutManager);
                            }
                        };
                        final cF cFVar4 = cF.this;
                        final TimelineLayoutManager timelineLayoutManager2 = w6Var.M7;
                        final Fo fo = w6Var.eF;
                        view2 = view;
                        w6Var.f75938e = new Function2() { // from class: yc.wb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return cF.w6.E2(cFVar4, w6Var, timelineLayoutManager2, view2, fo, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                            }
                        };
                        final cF cFVar5 = cF.this;
                        w6Var.f75934T = new Function1() { // from class: yc.Iuj
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return cF.w6.X(this.f75761n, cFVar5, (SceneElement) obj2);
                            }
                        };
                    } else if (event.getX() > view.getWidth() - i5) {
                        ((ImageView) this.P5.get(1)).setAlpha(0.3f);
                        final List list4 = this.P5;
                        final cF cFVar6 = cF.this;
                        final TimelineLayoutManager timelineLayoutManager3 = this.M7;
                        w6Var = this;
                        w6Var.f75936X = new Function0() { // from class: yc.zO
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cF.w6.nHg(list4, view, this, cFVar6, timelineLayoutManager3);
                            }
                        };
                        final cF cFVar7 = cF.this;
                        final TimelineLayoutManager timelineLayoutManager4 = w6Var.M7;
                        final Fo fo2 = w6Var.eF;
                        w6Var.f75938e = new Function2() { // from class: yc.qiB
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return cF.w6.s7N(cFVar7, w6Var, timelineLayoutManager4, fo2, view, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                            }
                        };
                        final cF cFVar8 = cF.this;
                        w6Var.f75934T = new Function1() { // from class: yc.J2L
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return cF.w6.v(this.f75763n, cFVar8, (SceneElement) obj2);
                            }
                        };
                        view2 = view;
                    } else {
                        Iterator it3 = this.P5.iterator();
                        while (it3.hasNext()) {
                            ((ImageView) it3.next()).setAlpha(0.15f);
                        }
                        final List list5 = this.P5;
                        final cF cFVar9 = cF.this;
                        final TimelineLayoutManager timelineLayoutManager5 = this.M7;
                        Function0 function0 = new Function0() { // from class: yc.tB
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cF.w6.Xw(list5, view, this, cFVar9, timelineLayoutManager5);
                            }
                        };
                        view2 = view;
                        w6Var = this;
                        w6Var.f75936X = function0;
                        final TimelineLayoutManager timelineLayoutManager6 = w6Var.M7;
                        final cF cFVar10 = cF.this;
                        w6Var.f75938e = new Function2() { // from class: yc.z2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return cF.w6.U(this.f76179n, timelineLayoutManager6, cFVar10, view2, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                            }
                        };
                    }
                    final cF cFVar11 = cF.this;
                    view2.postDelayed(new Runnable() { // from class: yc.E
                        @Override // java.lang.Runnable
                        public final void run() {
                            cF.w6.P5(i3, w6Var, view2, cFVar11);
                        }
                    }, (((long) cF.this.KN) * ((long) i2)) / ((long) 100));
                } else {
                    this.f75942r = arrayList3;
                    this.f75941o = f5.floatValue();
                    SceneElement sceneElement7 = cF.this.Uo;
                    Intrinsics.checkNotNull(sceneElement7);
                    final int iFrameNumberFromTime = TimeKt.frameNumberFromTime(KeyableKt.sceneTimeFromLocalTime(sceneElement7, f5.floatValue()), cF.this.ViF().get_scene().getFramesPerHundredSeconds());
                    final cF cFVar12 = cF.this;
                    final TimelineLayoutManager timelineLayoutManager7 = this.M7;
                    final RecyclerView recyclerView = this.p5;
                    w6Var = this;
                    w6Var.f75936X = new Function0() { // from class: yc.hzY
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cF.w6.B(this.f76006n, view, iFrameNumberFromTime, cFVar12, f5, timelineLayoutManager7, recyclerView);
                        }
                    };
                    final TimelineLayoutManager timelineLayoutManager8 = w6Var.M7;
                    final cF cFVar13 = cF.this;
                    final RecyclerView recyclerView2 = w6Var.p5;
                    final Fo fo3 = w6Var.eF;
                    w6Var.f75938e = new Function2() { // from class: yc.I5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return cF.w6.te(f5, w6Var, timelineLayoutManager8, cFVar13, iFrameNumberFromTime, recyclerView2, fo3, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    };
                    view2 = view;
                }
                i2 = 90;
                final cF cFVar112 = cF.this;
                view2.postDelayed(new Runnable() { // from class: yc.E
                    @Override // java.lang.Runnable
                    public final void run() {
                        cF.w6.P5(i3, w6Var, view2, cFVar112);
                    }
                }, (((long) cF.this.KN) * ((long) i2)) / ((long) 100));
            } else if (actionMasked == 1) {
                this.f75944v.dismiss();
                this.M7.i7(n.w6.f45191n);
                this.p5.invalidate();
                this.f75931N++;
                Iterator it4 = this.P5.iterator();
                while (it4.hasNext()) {
                    ((ImageView) it4.next()).setAlpha(0.2f);
                }
                XoT.C.Uo(this, new Function0() { // from class: yc.cv
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return cF.w6.eF();
                    }
                });
                if (cF.this.gh) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    view.setTranslationZ(0.0f);
                    final SceneElement sceneElement8 = cF.this.Uo;
                    if (event.getActionMasked() != 3 && sceneElement8 != null) {
                        List list6 = this.f75942r;
                        Function1 function1 = this.f75934T;
                        if (function1 != null) {
                            function1.invoke(sceneElement8);
                        } else if (list6 != null && !this.f75935U.isEmpty()) {
                            if (p4.ty(cF.this.ViF()) && this.f75935U.size() != 1) {
                                throw new IllegalStateException("More than one property changed during speed change");
                            }
                            if (((Keyframe) CollectionsKt.first(list6)).getTime() != this.f75941o) {
                                List<oA.j> list7 = this.f75935U;
                                cF cFVar14 = cF.this;
                                for (oA.j jVar3 : list7) {
                                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                                    Iterator it5 = list6.iterator();
                                    while (it5.hasNext()) {
                                        arrayList4.add(Integer.valueOf(CollectionsKt.indexOf((List<? extends Keyframe>) ((Keyable) jVar3.get(sceneElement8)).getKeyframes(), (Keyframe) it5.next())));
                                    }
                                    Iterator it6 = arrayList4.iterator();
                                    while (true) {
                                        if (!it6.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it6.next();
                                        if (((Number) next).intValue() >= 0) {
                                            break;
                                        }
                                    }
                                    final Integer num = (Integer) next;
                                    if (num != null) {
                                        if (p4.ty(cFVar14.ViF())) {
                                            sceneElementCk = p4.ck(sceneElement8, new Function1() { // from class: yc.kO
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj2) {
                                                    return cF.w6.E(sceneElement8, this, num, (Keyable) obj2);
                                                }
                                            });
                                        } else {
                                            n nVar = new PropertyReference1Impl() { // from class: yc.cF.w6.n
                                                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                                                public Object get(Object obj2) {
                                                    return ((Keyable) obj2).getKeyframes();
                                                }
                                            };
                                            oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), nVar.getReturnType(), jVar3, nVar);
                                            int iIntValue = num.intValue();
                                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                                            KType type = aCVar.nr().getArguments().get(0).getType();
                                            Intrinsics.checkNotNull(type);
                                            oA.w6 w6Var2 = new oA.w6(orCreateKotlinClass, type, aCVar, iIntValue);
                                            C1284w6 c1284w6 = new PropertyReference1Impl() { // from class: yc.cF.w6.w6
                                                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                                                public Object get(Object obj2) {
                                                    return Float.valueOf(((Keyframe) obj2).getTime());
                                                }
                                            };
                                            sceneElementCk = (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c1284w6.getReturnType(), w6Var2, c1284w6).rl(sceneElement8, Float.valueOf(this.f75941o));
                                        }
                                        sceneElement8 = sceneElementCk;
                                    }
                                }
                                List list8 = this.f75935U;
                                cF cFVar15 = cF.this;
                                if (list8 == null || !list8.isEmpty()) {
                                    Iterator it7 = list8.iterator();
                                    while (it7.hasNext()) {
                                        List keyframes3 = ((Keyable) ((oA.j) it7.next()).get(sceneElement8)).getKeyframes();
                                        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes3, 10));
                                        Iterator it8 = keyframes3.iterator();
                                        while (it8.hasNext()) {
                                            arrayList5.add(Integer.valueOf(TimeKt.frameNumberFromTime((int) (sceneElement8.getStartTime() + (((Keyframe) it8.next()).getTime() * (sceneElement8.getEndTime() - sceneElement8.getStartTime()))), cFVar15.ViF().get_scene().getFramesPerHundredSeconds())));
                                        }
                                        if (arrayList5.size() != CollectionsKt.toSet(arrayList5).size()) {
                                            break;
                                        }
                                    }
                                    cF.this.ViF().update(sceneElement8);
                                } else {
                                    cF.this.ViF().update(sceneElement8);
                                }
                            }
                            this.eF.qie().setEditKeyframe(null);
                            this.eF.qie().invalidate();
                        } else if (this.f75937Z != this.f75932O || this.f75933S != this.J2) {
                            cF.this.ViF().update(SceneElement.copy$default(sceneElement8, null, this.f75937Z, this.f75933S, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f75939g, this.E2, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -393223, 127, null));
                        }
                    }
                }
                this.f75938e = null;
                this.f75936X = null;
                this.f75934T = null;
            } else if (actionMasked == 2) {
                XoT.C.Uo(this, new Function0() { // from class: yc.mf
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return cF.w6.p5();
                    }
                });
                if (cF.this.gh && (function2 = this.f75938e) != null) {
                    function2.invoke(Float.valueOf(event.getRawX()), Float.valueOf(event.getRawY()));
                    Unit unit = Unit.INSTANCE;
                }
            } else if (actionMasked == 3) {
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit B(w6 w6Var, View view, int i2, cF cFVar, Float f3, TimelineLayoutManager timelineLayoutManager, RecyclerView recyclerView) {
            HW.o oVarB;
            Activity activityN = HW.qz.n(view);
            if (activityN == null || (oVarB = HW.C.B(activityN)) == null) {
                oVarB = HW.Ml.f3896n;
            }
            w6Var.f75944v = oVarB;
            oVarB.rl(2131231789);
            w6Var.f75944v.nr(2131231851);
            w6Var.f75944v.J2("+00:00:00");
            HW.o oVar = w6Var.f75944v;
            String frameNumber = TimeKt.formatFrameNumber(i2, cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff");
            String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f3.floatValue() * 100)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            oVar.n(frameNumber + " (" + str + "%)");
            timelineLayoutManager.i7(new n.C0633n(i2));
            recyclerView.invalidate();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String FX(List list, float f3, int i2, MotionEvent motionEvent) {
            return "onTouch: closestKeyframes=" + list + " closestKeyframeDist=" + f3 + " gripZoneWidth=" + i2 + " event.x=" + motionEvent.getX();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Xw(List list, View view, w6 w6Var, cF cFVar, TimelineLayoutManager timelineLayoutManager) {
            HW.o oVarB;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ImageView) it.next()).setAlpha(0.0f);
            }
            view.animate().scaleX(1.04f).scaleY(1.04f).setDuration(130L).setInterpolator(new TimeInterpolator() { // from class: yc.xx
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f3) {
                    return cF.w6.jB(f3);
                }
            });
            view.setTranslationZ(10.0f);
            Activity activityN = HW.qz.n(view);
            if (activityN == null || (oVarB = HW.C.B(activityN)) == null) {
                oVarB = HW.Ml.f3896n;
            }
            w6Var.f75944v = oVarB;
            oVarB.rl(2131231978);
            w6Var.f75944v.nr(2131231851);
            w6Var.f75944v.J2("+00:00:00");
            w6Var.f75944v.n(TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(w6Var.f75932O, cFVar.ViF().get_scene().getFramesPerHundredSeconds()), cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"));
            timelineLayoutManager.i7(new n.j(SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf(TimeKt.frameNumberFromStartTime(w6Var.f75932O, cFVar.ViF().get_scene().getFramesPerHundredSeconds())), Integer.valueOf(TimeKt.frameNumberFromStartTime(w6Var.J2, cFVar.ViF().get_scene().getFramesPerHundredSeconds()))}), SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf(TimeKt.frameNumberFromStartTime(w6Var.f75932O, cFVar.ViF().get_scene().getFramesPerHundredSeconds())), Integer.valueOf(TimeKt.frameNumberFromStartTime(w6Var.J2, cFVar.ViF().get_scene().getFramesPerHundredSeconds()))})));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit te(Float f3, final w6 w6Var, TimelineLayoutManager timelineLayoutManager, cF cFVar, int i2, RecyclerView recyclerView, Fo fo, float f4, float f5) {
            float fFloatValue = f3.floatValue();
            int i3 = w6Var.J2;
            final int i5 = (int) ((fFloatValue * (i3 - r1)) + w6Var.f75932O);
            int iRoundToFrame = TimeKt.roundToFrame(((int) (((f4 - w6Var.f75940n) / timelineLayoutManager.jX()) * 1000.0f)) + i5, cFVar.ViF().get_scene().getFramesPerHundredSeconds());
            int i7 = w6Var.f75932O;
            w6Var.f75941o = MathUtils.n((iRoundToFrame - i7) / (w6Var.J2 - i7), 0.0f, 1.0f);
            SceneElement sceneElement = cFVar.Uo;
            Intrinsics.checkNotNull(sceneElement);
            int iFrameNumberFromTime = TimeKt.frameNumberFromTime(KeyableKt.sceneTimeFromLocalTime(sceneElement, w6Var.f75941o), cFVar.ViF().get_scene().getFramesPerHundredSeconds());
            HW.o oVar = w6Var.f75944v;
            String frameNumber = TimeKt.formatFrameNumber(iFrameNumberFromTime, cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff");
            String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(w6Var.f75941o * 100)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            oVar.n(frameNumber + " (" + str + "%)");
            w6Var.f75944v.J2(TimeKt.formatFrameNumber(iFrameNumberFromTime - i2, cFVar.ViF().get_scene().getFramesPerHundredSeconds(), "+mm:ss:ff"));
            timelineLayoutManager.i7(new n.C0633n(iFrameNumberFromTime));
            recyclerView.invalidate();
            XoT.C.Uo(w6Var, new Function0() { // from class: yc.Q6T
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return cF.w6.iF(i5, w6Var);
                }
            });
            fo.qie().setEditKeyframe(f3);
            fo.qie().invalidate();
            return Unit.INSTANCE;
        }
    }

    @Override // yc.J
    public int J2(int i2) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        return i2;
    }

    public cF(SceneHolder sceneHolder, SceneThumbnailMaker thumbnailMaker, long j2, Function0 getEditingKeyableProperties, Function0 getKeyablePropertiesSelected, QmE.iF eventLogger) {
        Intrinsics.checkNotNullParameter(sceneHolder, "sceneHolder");
        Intrinsics.checkNotNullParameter(thumbnailMaker, "thumbnailMaker");
        Intrinsics.checkNotNullParameter(getEditingKeyableProperties, "getEditingKeyableProperties");
        Intrinsics.checkNotNullParameter(getKeyablePropertiesSelected, "getKeyablePropertiesSelected");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f75928n = sceneHolder;
        this.rl = thumbnailMaker;
        this.f75929t = j2;
        this.nr = getEditingKeyableProperties;
        this.f75927O = getKeyablePropertiesSelected;
        this.J2 = eventLogger;
        this.KN = ViewConfiguration.getLongPressTimeout();
        this.az = new Function1() { // from class: yc.epX
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cF.s7N(this.f75962n, (SceneHolderState) obj);
            }
        };
        this.Uo = SceneKt.elementById(sceneHolder.get_scene(), Long.valueOf(j2));
        setHasStableIds(true);
        this.ty = new n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String E2(int i2, Fo fo) {
        return "TSEA:onBindViewHolder (IN) pos=" + i2 + " v=" + fo.itemView + " layer=" + fo.J2() + " placement=" + fo.Uo() + " holder=" + fo + " ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean N(cF cFVar, SceneElement sceneElement, View view, MotionEvent motionEvent) {
        cFVar.qie = System.nanoTime();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            cFVar.gh = true;
            cFVar.J2.n(new j.fuX("layer_visibility", null, 2, null));
            cFVar.f75928n.update(SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, !sceneElement.getHidden(), null, null, false, null, null, -1, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null));
        } else if (actionMasked == 1 || actionMasked == 3) {
            cFVar.gh = false;
        }
        return true;
    }

    private final void T(Ch ch) {
        final SceneElement sceneElement;
        Collection collectionEmptyList;
        List keyframesIfKeyed;
        if (this.xMQ == null || (sceneElement = this.Uo) == null) {
            return;
        }
        Scene scene = this.f75928n.get_scene();
        SceneThumbnailMaker sceneThumbnailMaker = this.rl;
        Iterable iterable = (Iterable) this.nr.invoke();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Keyable keyable = (Keyable) ((oA.j) it.next()).O(sceneElement);
            if (keyable == null || (keyframesIfKeyed = KeyableKt.getKeyframesIfKeyed(keyable)) == null) {
                collectionEmptyList = CollectionsKt.emptyList();
            } else {
                collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframesIfKeyed, 10));
                Iterator it2 = keyframesIfKeyed.iterator();
                while (it2.hasNext()) {
                    collectionEmptyList.add(Float.valueOf(((Keyframe) it2.next()).getTime()));
                }
            }
            CollectionsKt.addAll(arrayList, collectionEmptyList);
        }
        ch.nr(scene, sceneElement, 0, sceneThumbnailMaker, arrayList, ((Number) this.f75927O.invoke()).intValue(), false);
        float dimension = ch.itemView.getContext().getResources().getDimension(2131166418);
        ch.qie().J2.setVisibility(0);
        ch.qie().getRoot().setTranslationX(-dimension);
        ch.qie().nr.setVisibility(4);
        ch.qie().f9413O.setVisibility(0);
        ch.qie().f9413O.setImageResource(sceneElement.getHidden() ? 2131232060 : 2131232058);
        ch.qie().f9413O.setAlpha(sceneElement.getHidden() ? 0.5f : 0.9f);
        ch.qie().Uo.setAlpha(sceneElement.getHidden() ? 0.6f : 1.0f);
        ch.qie().rl.setAlpha(sceneElement.getHidden() ? 0.5f : 1.0f);
        ch.qie().f9413O.setOnTouchListener(new View.OnTouchListener() { // from class: yc.tQj
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return cF.N(this.f76135n, sceneElement, view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String X(int i2, Fo fo) {
        View view = fo.itemView;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        return "TSEA:onBindViewHolder (AFTER BIND) pos=" + i2 + " v=" + view + " childCount=" + (viewGroup != null ? Integer.valueOf(viewGroup.getChildCount()) : null) + " layer=" + fo.J2() + " placement=" + fo.Uo() + " holder=" + fo + " ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(List list) {
        return "BIND editKeyframeTimes: " + CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit iF(cF cFVar, final View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        XoT.C.Uo(cFVar, new Function0() { // from class: yc.H9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return cF.fD(it);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s7N(cF cFVar, SceneHolderState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cFVar.Uo = SceneKt.elementById(cFVar.f75928n.get_scene(), Long.valueOf(cFVar.f75929t));
        cFVar.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    private final void te(final Fo fo, final int i2) {
        RecyclerView recyclerView;
        Collection collectionEmptyList;
        List keyframesIfKeyed;
        XoT.C.Uo(this, new Function0() { // from class: yc.VY8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return cF.E2(i2, fo);
            }
        });
        TimelineLayoutManager timelineLayoutManager = this.xMQ;
        if (timelineLayoutManager == null || (recyclerView = this.mUb) == null) {
            return;
        }
        int iTy = fo.ty();
        List<oA.j> list = (List) this.nr.invoke();
        final ArrayList arrayList = new ArrayList();
        for (oA.j jVar : list) {
            SceneElement sceneElement = this.Uo;
            Intrinsics.checkNotNull(sceneElement);
            Keyable keyable = (Keyable) jVar.O(sceneElement);
            if (keyable == null || (keyframesIfKeyed = KeyableKt.getKeyframesIfKeyed(keyable)) == null) {
                collectionEmptyList = CollectionsKt.emptyList();
            } else {
                collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframesIfKeyed, 10));
                Iterator it = keyframesIfKeyed.iterator();
                while (it.hasNext()) {
                    collectionEmptyList.add(Float.valueOf(((Keyframe) it.next()).getTime()));
                }
            }
            CollectionsKt.addAll(arrayList, collectionEmptyList);
        }
        XoT.C.Uo(this, new Function0() { // from class: yc.tZ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return cF.e(arrayList);
            }
        });
        this.gh = false;
        Long mainCameraId = SceneKt.getMainCameraId(this.f75928n.get_scene());
        timelineLayoutManager.jE((mainCameraId != null && mainCameraId.longValue() == this.f75929t) ? 0 : null);
        Scene scene = this.f75928n.get_scene();
        SceneElement sceneElement2 = this.Uo;
        Intrinsics.checkNotNull(sceneElement2);
        AbstractC2448d.O(fo, scene, sceneElement2, 0, null, arrayList, ((Number) this.f75927O.invoke()).intValue(), false, 8, null);
        XoT.C.Uo(this, new Function0() { // from class: yc.pIF
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return cF.X(i2, fo);
            }
        });
        View itemView = fo.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        HI0.o7q.t(itemView, new Function1() { // from class: yc.qhS
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cF.iF(this.f76096n, (View) obj);
            }
        });
        if (this.f75928n.getEditMode() == 2131362628) {
            fo.az().xMQ.setImageResource(2131231121);
            fo.az().mUb.setImageResource(2131231122);
        } else {
            fo.az().xMQ.setImageResource(2131231128);
            fo.az().mUb.setImageResource(2131231129);
        }
        List<ImageView> listListOf = CollectionsKt.listOf((Object[]) new ImageView[]{fo.az().xMQ, fo.az().mUb});
        for (ImageView imageView : listListOf) {
            imageView.setVisibility(0);
            imageView.setAlpha(0.2f);
        }
        fo.itemView.setOnTouchListener(new w6(iTy, list, listListOf, timelineLayoutManager, recyclerView, fo));
    }

    public final SceneHolder ViF() {
        return this.f75928n;
    }

    public final long aYN() {
        return this.f75929t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(AbstractC2448d holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof Ch) {
            T((Ch) holder);
        } else if (holder instanceof Fo) {
            te((Fo) holder, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.Uo == null ? 0 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i2) {
        return this.f75929t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: nHg, reason: merged with bridge method [inline-methods] */
    public AbstractC2448d onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i2 == 0) {
            SJ0.rd rdVarT = SJ0.rd.t(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(rdVarT, "inflate(...)");
            return new Fo(rdVarT);
        }
        if (i2 != 1) {
            throw new IllegalStateException();
        }
        C1454b c1454bT = C1454b.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(c1454bT, "inflate(...)");
        return new Ch(c1454bT);
    }

    public final boolean nY() {
        return this.gh || (System.nanoTime() - this.qie) / 1000000 < 200;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        registerAdapterDataObserver(this.ty);
        this.f75928n.subscribe(this.az);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        this.xMQ = layoutManager instanceof TimelineLayoutManager ? (TimelineLayoutManager) layoutManager : null;
        this.mUb = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        unregisterAdapterDataObserver(this.ty);
        this.f75928n.unsubscribe(this.az);
        this.xMQ = null;
        this.mUb = null;
    }

    @Override // yc.J
    public SceneElement rl(int i2) {
        SceneElement sceneElement = this.Uo;
        if (sceneElement != null) {
            return sceneElement;
        }
        throw new IllegalStateException("Unexpected null selected element");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fD(View view) {
        return "TSEA-CHILD: " + view.getResources().getResourceName(view.getId());
    }

    @Override // yc.J
    public TimelineLayoutManager.j.EnumC0632j Uo(int i2) {
        int itemViewType = getItemViewType(i2);
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                return TimelineLayoutManager.j.EnumC0632j.f45185t;
            }
            return TimelineLayoutManager.j.EnumC0632j.f45182n;
        }
        return TimelineLayoutManager.j.EnumC0632j.f45185t;
    }
}
