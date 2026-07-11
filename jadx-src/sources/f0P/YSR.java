package f0P;

import LdY.Ml;
import QmE.j;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.alightcreative.app.motion.easing.SplittableEasing;
import com.alightcreative.app.motion.easing.SplittableEasingKt;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableFloat;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.Keyframe;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.animators.AnimatorOf;
import com.alightcreative.app.motion.scene.timemapping.SpeedComputationKt;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import d2n.Ml;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u0004J!\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0004R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010'\u001a\u00020\u00058\u0014X\u0094D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0007R\u001a\u0010-\u001a\u00020(8\u0014X\u0094D¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010/\u001a\u00020(8\u0014X\u0094D¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b.\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00100R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000203028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lf0P/YSR;", "Lf0P/NO;", "Lyc/QhI;", "<init>", "()V", "", "t", "()I", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "FX", "B", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/alightcreative/app/motion/scene/SceneElement;", "el", "piY", "(Lcom/alightcreative/app/motion/scene/SceneElement;)V", "gh", "LSJ0/z3w;", "p5", "Lkotlin/Lazy;", "Toy", "()LSJ0/z3w;", "binding", "LLdY/Ml$j;", "eF", "LLdY/Ml$j;", "undoBatch", "E", "I", "M7", "layoutResource", "", "M", "Z", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "()Z", "disableNonSplittableEasing", "K", "disableOvershoot", "Lcom/alightcreative/app/motion/scene/SceneElement;", "initialElementState", "", "Lf0P/F8;", "lLA", "()Ljava/util/List;", "keyableSettings", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpeedKeyframeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpeedKeyframeFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/SpeedKeyframeFragment\n+ 2 Lens.kt\ncom/alightcreative/lens/LensKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,478:1\n143#2:479\n785#3:480\n796#3:481\n1872#3,2:482\n797#3,2:484\n1874#3:486\n799#3:487\n*S KotlinDebug\n*F\n+ 1 SpeedKeyframeFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/SpeedKeyframeFragment\n*L\n75#1:479\n101#1:480\n101#1:481\n101#1:482,2\n101#1:484,2\n101#1:486\n101#1:487\n*E\n"})
public final class YSR extends NO implements yc.QhI {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private SceneElement initialElementState;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private Ml.j undoBatch;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final Lazy binding = LazyKt.lazy(new Function0() { // from class: f0P.Bw
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return YSR.jO(this.f64106n);
        }
    });

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final int layoutResource = 2131558608;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final boolean disableNonSplittableEasing = true;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private final boolean disableOvershoot = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I9f(YSR ysr, final Ref.FloatRef floatRef, int i2) {
        final float f3 = i2 / 1000.0f;
        final SceneElement sceneElement = ysr.initialElementState;
        if (sceneElement == null) {
            throw new IllegalStateException("Required value was null.");
        }
        HW.C.D(ysr, new Function2() { // from class: f0P.oK
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return YSR.D76(sceneElement, floatRef, f3, (Scene) obj, (SceneElement) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Ro(float f3, float f4) {
        return f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(float f3, float f4) {
        return f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float rxp(float f3, float f4) {
        return f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float waP(float f3, float f4) {
        return f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement D76(SceneElement sceneElement, final Ref.FloatRef floatRef, final float f3, Scene scene, SceneElement sceneElement2) {
        String str = QiDPjiOCZHDS.Lukh;
        Intrinsics.checkNotNullParameter(scene, str);
        Intrinsics.checkNotNullParameter(sceneElement2, str);
        return p4.ck(sceneElement, new Function1() { // from class: f0P.osO
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return YSR.NP(floatRef, f3, (Keyable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EN(YSR ysr, Ref.FloatRef floatRef) {
        Ml.j jVar = ysr.undoBatch;
        if (jVar != null) {
            jVar.n();
        }
        ysr.undoBatch = null;
        ysr.initialElementState = null;
        floatRef.element = 0.0f;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable NP(Ref.FloatRef floatRef, float f3, Keyable speed) {
        Intrinsics.checkNotNullParameter(speed, "speed");
        return p4.mUb(speed, floatRef.element, Float.valueOf(f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable Th(YSR ysr, SceneElement sceneElement, Scene scene, Keyable speedValue) {
        Intrinsics.checkNotNullParameter(speedValue, "speedValue");
        if (ysr.getActiveKeyframeAtCurrentTime()) {
            int iIndexOf = CollectionsKt.indexOf((List<? extends Keyframe>) sceneElement.getTimeKeyframes().getKeyframes(), p4.HI(sceneElement.getTimeKeyframes(), HW.C.aYN(ysr), sceneElement, scene));
            if (sceneElement.getSpeedMap().getKeyframes().size() <= 1) {
                return Keyable.DefaultImpls.copyWith$default(speedValue, null, false, null, 5, null);
            }
            List keyframes = speedValue.getKeyframes();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : keyframes) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (i2 != iIndexOf) {
                    arrayList.add(obj);
                }
                i2 = i3;
            }
            return Keyable.DefaultImpls.copyWith$default(speedValue, arrayList, false, null, 6, null);
        }
        ysr.jB().n(new j.Mje(HW.C.ViF(ysr), rWZ.j.rl(sceneElement)));
        float fQie = p4.qie(ysr);
        Keyframe keyframeClosestBeforeTime = KeyableKt.closestBeforeTime(speedValue, fQie);
        if (keyframeClosestBeforeTime == null || !speedValue.getKeyed()) {
            return p4.Uo(speedValue, fQie);
        }
        Keyframe keyframeClosestAfterTime = KeyableKt.closestAfterTime(speedValue, fQie);
        if (keyframeClosestAfterTime == null) {
            return p4.mUb(speedValue, fQie, keyframeClosestBeforeTime.getValue());
        }
        if (!(keyframeClosestAfterTime.getEasing() instanceof SplittableEasing)) {
            throw new IllegalStateException((keyframeClosestAfterTime.getEasing() + " is not of type SplittableEasing and cannot be used for speed keyframes.").toString());
        }
        float fCoerceAtLeast = RangesKt.coerceAtLeast(SpeedComputationKt.speedValueAtTime(sceneElement.getSpeedMap(), fQie), 0.001f);
        Pair<SplittableEasing, SplittableEasing> pairSplit = ((SplittableEasing) keyframeClosestAfterTime.getEasing()).split((p4.qie(ysr) - keyframeClosestBeforeTime.getTime()) / (keyframeClosestAfterTime.getTime() - keyframeClosestBeforeTime.getTime()));
        return p4.KN(p4.KN(speedValue, new Keyframe(Float.valueOf(fCoerceAtLeast), fQie, SplittableEasingKt.getClamped(pairSplit.component1()), null, 8, null)), new Keyframe(keyframeClosestAfterTime.getValue(), keyframeClosestAfterTime.getTime(), SplittableEasingKt.getClamped(pairSplit.component2()), null, 8, null));
    }

    private final SJ0.z3w Toy() {
        return (SJ0.z3w) this.binding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement XNZ(Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        Ml.j jVar = d2n.Ml.f63370t;
        return SceneElement.copy$default(el, null, 0, ((int) d2n.Ml.mUb(bK.n.nr(bK.n.t(jVar.rl(zd.w6.qie(el)), jVar.rl(el.getInTime()), el.getTimeMapping().getSpeedFunction()), jVar.rl(el.getInTime()), H7v.j.f3795O.n(1.0d)))) + el.getStartTime(), 0L, null, null, null, null, null, null, null, null, null, null, null, KeyableFloat.INSTANCE.getONE(), null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -32773, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement wKp(final YSR ysr, final Scene scene, final SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        return p4.ck(el, new Function1() { // from class: f0P.hxq
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return YSR.Th(this.f65625n, el, scene, (Keyable) obj);
            }
        });
    }

    @Override // f0P.NO
    /* JADX INFO: renamed from: K, reason: from getter */
    protected boolean getDisableOvershoot() {
        return this.disableOvershoot;
    }

    @Override // f0P.Ny
    /* JADX INFO: renamed from: M7, reason: from getter */
    protected int getLayoutResource() {
        return this.layoutResource;
    }

    @Override // f0P.NO
    /* JADX INFO: renamed from: i, reason: from getter */
    protected boolean getDisableNonSplittableEasing() {
        return this.disableNonSplittableEasing;
    }

    @Override // f0P.NO
    /* JADX INFO: renamed from: lLA */
    protected List getKeyableSettings() {
        AnimatorOf animatorOf = AnimatorOf.Float;
        j jVar = new PropertyReference1Impl() { // from class: f0P.YSR.j
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getTimeKeyframes();
            }
        };
        return CollectionsKt.listOf(new F8(animatorOf, new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), jVar.getReturnType(), jVar), null, 4, null));
    }

    @Override // f0P.sK, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        jB().n(new j.fuX("time_remapping", null, 2, null));
    }

    @Override // f0P.Ny, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        nr();
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        Toy().xMQ.setOnStartTrackingTouch(new Function0() { // from class: f0P.kY
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return YSR.SR(this.f65740n, floatRef);
            }
        });
        Toy().xMQ.setOnStopTrackingTouch(new Function0() { // from class: f0P.e79
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return YSR.EN(this.f65509n, floatRef);
            }
        });
        Toy().xMQ.setOnValueChangeFromUser(new Function1() { // from class: f0P.gGB
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return YSR.I9f(this.f65578n, floatRef, ((Integer) obj).intValue());
            }
        });
        Toy().f9697O.setOnClickListener(new View.OnClickListener() { // from class: f0P.Kv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                YSR.QgZ(this.f64433n, view2);
            }
        });
        Toy().Uo.setOnClickListener(new View.OnClickListener() { // from class: f0P.sMz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                YSR.H(this.f66172n, view2);
            }
        });
        Toy().KN.setOnClickListener(new View.OnClickListener() { // from class: f0P.EWY
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                YSR.LPV(this.f64172n, view2);
            }
        });
        Toy().J2.setOnClickListener(new View.OnClickListener() { // from class: f0P.Pe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                YSR.Fp(this.f64612n, view2);
            }
        });
        gh();
    }

    @Override // f0P.Ny
    protected void piY(SceneElement el) {
        Intrinsics.checkNotNullParameter(el, "el");
        if (this.initialElementState != null) {
            TextView textView = Toy().mUb;
            String str = String.format("%.2fx", Arrays.copyOf(new Object[]{Float.valueOf(Toy().xMQ.getValue() / 1000.0f)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView.setText(str);
            return;
        }
        float fSpeedValueAtTime = SpeedComputationKt.speedValueAtTime(el.getSpeedMap(), p4.qie(this));
        TextView textView2 = Toy().mUb;
        String str2 = String.format("%.2fx", Arrays.copyOf(new Object[]{Float.valueOf(fSpeedValueAtTime)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        textView2.setText(str2);
        Toy().xMQ.setValue((int) (fSpeedValueAtTime * 1000.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Fp(YSR ysr, View view) {
        SceneElement sceneElementNHg = HW.C.nHg(ysr);
        if (sceneElementNHg != null) {
            int endTime = sceneElementNHg.getEndTime() - sceneElementNHg.getStartTime();
            int endTime2 = sceneElementNHg.getEndTime() - HW.C.Z(ysr);
            if (endTime2 >= 1) {
                final float f3 = endTime / endTime2;
                if (!Float.isInfinite(f3) && !Float.isNaN(f3)) {
                    Keyable<Float> keyableCopyAdjustingFloatValue = UserParameterKt.copyAdjustingFloatValue(sceneElementNHg.getSpeedMap(), new Function1() { // from class: f0P.EbK
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(YSR.Ro(f3, ((Float) obj).floatValue()));
                        }
                    });
                    SceneHolder sceneHolderE = HW.C.e(ysr);
                    if (sceneHolderE != null) {
                        sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, HW.C.Z(ysr), 0, 0L, null, null, null, null, null, null, null, null, null, null, null, keyableCopyAdjustingFloatValue, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -32771, 127, null));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(YSR ysr, View view) {
        SceneElement sceneElementNHg = HW.C.nHg(ysr);
        if (sceneElementNHg != null) {
            int endTime = sceneElementNHg.getEndTime() - sceneElementNHg.getStartTime();
            int iR = HW.C.r(ysr) - sceneElementNHg.getStartTime();
            if (iR >= 1) {
                final float f3 = endTime / iR;
                if (!Float.isInfinite(f3) && !Float.isNaN(f3)) {
                    Keyable<Float> keyableCopyAdjustingFloatValue = UserParameterKt.copyAdjustingFloatValue(sceneElementNHg.getSpeedMap(), new Function1() { // from class: f0P.tH
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(YSR.waP(f3, ((Float) obj).floatValue()));
                        }
                    });
                    SceneHolder sceneHolderE = HW.C.e(ysr);
                    if (sceneHolderE != null) {
                        sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, 0, HW.C.r(ysr), 0L, null, null, null, null, null, null, null, null, null, null, null, keyableCopyAdjustingFloatValue, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -32773, 127, null));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LPV(YSR ysr, View view) {
        SceneElement sceneElementNHg = HW.C.nHg(ysr);
        if (sceneElementNHg != null) {
            int endTime = sceneElementNHg.getEndTime() - sceneElementNHg.getStartTime();
            int endTime2 = sceneElementNHg.getEndTime() - HW.C.Z(ysr);
            if (endTime2 >= 1) {
                final float f3 = endTime / endTime2;
                if (!Float.isInfinite(f3) && !Float.isNaN(f3)) {
                    Keyable<Float> keyableCopyAdjustingFloatValue = UserParameterKt.copyAdjustingFloatValue(sceneElementNHg.getSpeedMap(), new Function1() { // from class: f0P.A3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(YSR.rxp(f3, ((Float) obj).floatValue()));
                        }
                    });
                    SceneHolder sceneHolderE = HW.C.e(ysr);
                    if (sceneHolderE != null) {
                        sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, HW.C.Z(ysr), 0, 0L, null, null, null, null, null, null, null, null, null, null, null, keyableCopyAdjustingFloatValue, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -32771, 127, null));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void QgZ(YSR ysr, View view) {
        SceneElement sceneElementNHg = HW.C.nHg(ysr);
        if (sceneElementNHg != null) {
            int endTime = sceneElementNHg.getEndTime() - sceneElementNHg.getStartTime();
            int iR = HW.C.r(ysr) - sceneElementNHg.getStartTime();
            if (iR >= 1) {
                final float f3 = endTime / iR;
                if (!Float.isInfinite(f3) && !Float.isNaN(f3)) {
                    Keyable<Float> keyableCopyAdjustingFloatValue = UserParameterKt.copyAdjustingFloatValue(sceneElementNHg.getSpeedMap(), new Function1() { // from class: f0P.b1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(YSR.j(f3, ((Float) obj).floatValue()));
                        }
                    });
                    SceneHolder sceneHolderE = HW.C.e(ysr);
                    if (sceneHolderE != null) {
                        sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, 0, HW.C.r(ysr), 0L, null, null, null, null, null, null, null, null, null, null, null, keyableCopyAdjustingFloatValue, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -32773, 127, null));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SR(YSR ysr, Ref.FloatRef floatRef) {
        float fQie;
        SceneElement sceneElementNHg = HW.C.nHg(ysr);
        if (sceneElementNHg == null) {
            return Unit.INSTANCE;
        }
        Scene sceneIF = HW.C.iF(ysr);
        if (sceneIF == null) {
            return Unit.INSTANCE;
        }
        ysr.initialElementState = sceneElementNHg;
        Keyframe keyframeHI = p4.HI(sceneElementNHg.getTimeKeyframes(), HW.C.aYN(ysr), sceneElementNHg, sceneIF);
        if (keyframeHI != null) {
            fQie = sceneElementNHg.getSpeedMap().getKeyframes().get(sceneElementNHg.getTimeKeyframes().getKeyframes().indexOf(keyframeHI)).getTime();
        } else {
            fQie = p4.qie(ysr);
        }
        floatRef.element = fQie;
        ysr.undoBatch = HW.C.xMQ(ysr);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SJ0.z3w jO(YSR ysr) {
        SJ0.z3w z3wVarN = SJ0.z3w.n(ysr.hRu().getChildAt(0));
        Intrinsics.checkNotNullExpressionValue(z3wVarN, "bind(...)");
        return z3wVarN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lNy(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xzo(YSR ysr, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        HW.C.D(ysr, new Function2() { // from class: f0P.E0C
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return YSR.XNZ((Scene) obj, (SceneElement) obj2);
            }
        });
    }

    @Override // f0P.NO, f0P.Ny
    protected void B() {
        if (getActiveKeyframeAtCurrentTime()) {
            new AlertDialog.Builder(getActivity()).setTitle(2132017661).setPositiveButton(2132017650, new DialogInterface.OnClickListener() { // from class: f0P.Aa
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    YSR.xzo(this.f64073n, dialogInterface, i2);
                }
            }).setNegativeButton(2132017396, new DialogInterface.OnClickListener() { // from class: f0P.HLy
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    YSR.lNy(dialogInterface, i2);
                }
            }).show();
        }
    }

    @Override // f0P.NO, f0P.Ny
    protected void FX() {
        Ml.j jVarXMQ = HW.C.xMQ(this);
        HW.C.D(this, new Function2() { // from class: f0P.N8Q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return YSR.wKp(this.f64503n, (Scene) obj, (SceneElement) obj2);
            }
        });
        Function0 addKeyframeClickListener = getAddKeyframeClickListener();
        if (addKeyframeClickListener != null) {
            addKeyframeClickListener.invoke();
        }
        jVarXMQ.n();
    }

    @Override // f0P.NO, yc.InterfaceC2452g
    public void gh() {
        boolean z2;
        boolean z3;
        boolean z4;
        float f3;
        float f4;
        float f5;
        int iWPU = HW.C.WPU(this);
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null) {
            int startTime = sceneElementNHg.getStartTime();
            SceneElement sceneElementNHg2 = HW.C.nHg(this);
            if (sceneElementNHg2 != null) {
                int endTime = sceneElementNHg2.getEndTime();
                if (isAdded() && getView() != null) {
                    ImageButton imageButton = Toy().f9697O;
                    boolean z5 = true;
                    if (iWPU > endTime) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    imageButton.setEnabled(z2);
                    ImageButton imageButton2 = Toy().Uo;
                    int i2 = startTime + 1;
                    if (i2 <= iWPU && iWPU < endTime) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    imageButton2.setEnabled(z3);
                    ImageButton imageButton3 = Toy().KN;
                    if (i2 <= iWPU && iWPU < endTime) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    imageButton3.setEnabled(z4);
                    ImageButton imageButton4 = Toy().J2;
                    if (iWPU >= startTime) {
                        z5 = false;
                    }
                    imageButton4.setEnabled(z5);
                    ImageButton imageButton5 = Toy().f9697O;
                    float f6 = 0.35f;
                    if (Toy().f9697O.isEnabled()) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.35f;
                    }
                    imageButton5.setAlpha(f3);
                    ImageButton imageButton6 = Toy().Uo;
                    if (Toy().Uo.isEnabled()) {
                        f4 = 1.0f;
                    } else {
                        f4 = 0.35f;
                    }
                    imageButton6.setAlpha(f4);
                    ImageButton imageButton7 = Toy().KN;
                    if (Toy().KN.isEnabled()) {
                        f5 = 1.0f;
                    } else {
                        f5 = 0.35f;
                    }
                    imageButton7.setAlpha(f5);
                    ImageButton imageButton8 = Toy().J2;
                    if (Toy().J2.isEnabled()) {
                        f6 = 1.0f;
                    }
                    imageButton8.setAlpha(f6);
                }
                super.gh();
            }
        }
    }

    @Override // yc.QhI
    public int t() {
        return 2131362628;
    }
}
