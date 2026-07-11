package f0P;

import LdY.Ml;
import QmE.j;
import SJ0.C1456dT;
import SJ0.C1464t;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alightcreative.app.motion.activities.ColorPickerActivity;
import com.alightcreative.app.motion.activities.edit.ColorView;
import com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.Quaternion;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.animators.AnimatorOf;
import com.alightcreative.app.motion.scene.liveshape.LiveShape;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeKt;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeRef;
import com.alightcreative.app.motion.scene.userparam.ChoiceInfo;
import com.alightcreative.app.motion.scene.userparam.DataType;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.userparam.SelectorStyle;
import com.alightcreative.app.motion.scene.userparam.SliderType;
import com.alightcreative.app.motion.scene.userparam.StaticTextStyle;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import com.alightcreative.widget.AlightSlider;
import com.alightcreative.widget.HueDiscView;
import com.alightcreative.widget.ValueSpinner;
import com.alightcreative.widget.YBiasView;
import com.fyber.inneractive.sdk.player.exoplayer2.util.LU.LHbnkhI;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.utils.Logger;
import f0P.C2065oU;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.StringsKt;
import r.C2348n;

/* JADX INFO: renamed from: f0P.oU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001WB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J)\u0010*\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010(H\u0017¢\u0006\u0004\b*\u0010+R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010=\u001a\u00020\u00108\u0014X\u0094D¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u0012R\u0016\u0010@\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010D\u001a\b\u0018\u00010AR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010?R\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020S0R8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006X"}, d2 = {"Lf0P/oU;", "Lyc/QhI;", "Lyc/Buf;", "Lf0P/NO;", "<init>", "()V", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", "param", "LoA/j;", "Lcom/alightcreative/app/motion/scene/SceneElement;", "Lcom/alightcreative/app/motion/scene/Keyable;", "", "n7b", "(Lcom/alightcreative/app/motion/scene/userparam/UserParameter;)LoA/j;", "o9", "(Lcom/alightcreative/app/motion/scene/userparam/UserParameter;)Lcom/alightcreative/app/motion/scene/Keyable;", "", "t", "()I", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "el", "piY", "(Lcom/alightcreative/app/motion/scene/SceneElement;)V", "Lyc/a;", "motionEvent", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Lyc/a;)Z", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "LSJ0/dT;", "M", "Lkotlin/Lazy;", "vl", "()LSJ0/dT;", "contentBinding", "LkgE/fuX;", "FX", "LkgE/fuX;", "v0j", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "B", "I", "M7", "layoutResource", "J", "Z", "gestureInProgress", "Lf0P/oU$j;", "D", "Lf0P/oU$j;", "adapter", "", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "paramName", "popped", "LLdY/Ml$j;", "GR", "LLdY/Ml$j;", "undoBatch", "Lyc/Ji;", "Nxk", "Lyc/Ji;", "shapeEditHelper", "", "Lf0P/F8;", "lLA", "()Ljava/util/List;", "keyableSettings", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLiveShapeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveShapeFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/LiveShapeFragment\n+ 2 Lens.kt\ncom/alightcreative/lens/LensKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,874:1\n143#2:875\n124#2:876\n140#2:877\n124#2:878\n143#2:879\n124#2:880\n140#2:881\n124#2:882\n143#2:883\n124#2:884\n140#2:885\n124#2:886\n143#2:887\n124#2:888\n140#2:889\n124#2:890\n143#2:891\n124#2:892\n140#2:893\n124#2:894\n143#2:895\n124#2:896\n140#2:897\n124#2:898\n143#2:912\n124#2:913\n140#2:914\n124#2:915\n124#2:916\n124#2:917\n124#2:918\n124#2:919\n124#2:920\n148#2:924\n143#2:925\n124#2:926\n774#3:899\n865#3,2:900\n1611#3,9:902\n1863#3:911\n1864#3:922\n1620#3:923\n1#4:921\n*S KotlinDebug\n*F\n+ 1 LiveShapeFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/LiveShapeFragment\n*L\n111#1:875\n111#1:876\n111#1:877\n111#1:878\n113#1:879\n113#1:880\n113#1:881\n113#1:882\n114#1:883\n114#1:884\n114#1:885\n114#1:886\n115#1:887\n115#1:888\n115#1:889\n115#1:890\n116#1:891\n116#1:892\n116#1:893\n116#1:894\n117#1:895\n117#1:896\n117#1:897\n117#1:898\n136#1:912\n136#1:913\n136#1:914\n140#1:915\n145#1:916\n149#1:917\n153#1:918\n157#1:919\n161#1:920\n175#1:924\n175#1:925\n175#1:926\n135#1:899\n135#1:900,2\n135#1:902,9\n135#1:911\n135#1:922\n135#1:923\n135#1:921\n*E\n"})
public final class C2065oU extends com.alightcreative.app.motion.activities.edit.fragments.n implements yc.QhI, yc.Buf {

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private j adapter;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private boolean popped;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private boolean gestureInProgress;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String paramName;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final Lazy contentBinding = LazyKt.lazy(new Function0() { // from class: f0P.fU5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C2065oU.nO(this.f65547n);
        }
    });

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int layoutResource = 2131558602;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private Ml.j undoBatch = LdY.Ml.Ik.n();

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private final yc.Ji shapeEditHelper = new yc.Ji(this, true, new Function1() { // from class: f0P.aoZ
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return C2065oU.Aum(this.f65360n, (String) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0P.oU$j */
    final class j extends RecyclerView.Adapter {
        private final List J2;
        private View KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final kgE.fuX f65936O;
        private TextView Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final oA.j f65937n;
        private final yc.Ji nr;
        private final Iy.n rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f65938t;
        final /* synthetic */ C2065oU xMQ;

        /* JADX INFO: renamed from: f0P.oU$j$j, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
        public final class C0898j extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final ViewBinding f65939n;
            final /* synthetic */ j rl;

            /* JADX INFO: renamed from: f0P.oU$j$j$CN3 */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class CN3 implements SeekBar.OnSeekBarChangeListener {
                final /* synthetic */ View J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ TextView f65941O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ C2065oU f65942n;
                final /* synthetic */ j nr;
                final /* synthetic */ C0898j rl;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ UserParameter f65943t;

                CN3(C2065oU c2065oU, C0898j c0898j, UserParameter userParameter, j jVar, TextView textView, View view) {
                    this.f65942n = c2065oU;
                    this.rl = c0898j;
                    this.f65943t = userParameter;
                    this.nr = jVar;
                    this.f65941O = textView;
                    this.J2 = view;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Keyable nr(Scene scene, SceneElement sceneElement, C2065oU c2065oU, float f3, Keyable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(c2065oU), Float.valueOf(f3));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final SceneElement t(j jVar, UserParameter userParameter, final C2065oU c2065oU, final float f3, final Scene scene, final SceneElement el) {
                    Intrinsics.checkNotNullParameter(scene, "scene");
                    Intrinsics.checkNotNullParameter(el, "el");
                    oA.j jVarHI = jVar.HI();
                    Pair pair = TuplesKt.to(((UserParameter.Slider) userParameter).getName(), new KeyableUserParameterValue(0.0f));
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type = jVarHI.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type);
                    oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, jVarHI, pair.getFirst(), pair.getSecond());
                    C0899j c0899j = new PropertyReference1Impl() { // from class: f0P.oU.j.j.CN3.j
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableUserParameterValue) obj).getFloatValue();
                        }
                    };
                    return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c0899j.getReturnType(), i28, c0899j).t(el, new Function1() { // from class: f0P.S4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C2065oU.j.C0898j.CN3.nr(scene, el, c2065oU, f3, (Keyable) obj);
                        }
                    });
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
                    if (z2 && this.f65942n.gestureInProgress) {
                        final float f3 = i2 / 1000.0f;
                        ((SJ0.xuv) this.rl.RQ()).nr.setText(UserParameterKt.format(((UserParameter.Slider) this.f65943t).getSliderType(), f3));
                        final C2065oU c2065oU = this.f65942n;
                        final j jVar = this.nr;
                        final UserParameter userParameter = this.f65943t;
                        HW.C.D(c2065oU, new Function2() { // from class: f0P.tf
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return C2065oU.j.C0898j.CN3.t(jVar, userParameter, c2065oU, f3, (Scene) obj, (SceneElement) obj2);
                            }
                        });
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar) {
                    C0898j.Rl(this.f65942n, this.f65943t, this.nr, this.f65941O, this.J2);
                    C2065oU c2065oU = this.f65942n;
                    c2065oU.undoBatch = HW.C.xMQ(c2065oU);
                    this.f65942n.gestureInProgress = true;
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar) {
                    this.f65942n.undoBatch.n();
                    this.f65942n.gestureInProgress = false;
                }
            }

            /* JADX INFO: renamed from: f0P.oU$j$j$Dsr */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class Dsr implements ColorPickerWidget.n {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ C2065oU f65945n;
                final /* synthetic */ UserParameter nr;
                final /* synthetic */ yU.Ml rl;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ j f65946t;

                public static void safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(Fragment p0, Intent p1, int p2) {
                    Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
                    if (p1 == null) {
                        return;
                    }
                    p0.startActivityForResult(p1, p2);
                }

                Dsr(C2065oU c2065oU, yU.Ml ml, j jVar, UserParameter userParameter) {
                    this.f65945n = c2065oU;
                    this.rl = ml;
                    this.f65946t = jVar;
                    this.nr = userParameter;
                }

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.n
                public void n(int i2) {
                    C2065oU c2065oU = this.f65945n;
                    Pair pair = TuplesKt.to("CURRENT_COLOR", Integer.valueOf(i2));
                    Pair pair2 = TuplesKt.to("ALLOW_ALPHA", Boolean.valueOf(this.rl.nr().getAllowAlpha()));
                    oA.j jVarHI = this.f65946t.HI();
                    String name = ((UserParameter.Color) this.nr).getName();
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type = jVarHI.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type);
                    oA.Ml ml = new oA.Ml(orCreateKotlinClass, type, jVarHI, name);
                    C0900j c0900j = new PropertyReference1Impl() { // from class: f0P.oU.j.j.Dsr.j
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableUserParameterValue) obj).getColorValue();
                        }
                    };
                    Pair[] pairArr = {pair, pair2, TuplesKt.to("COLOR_LENS", new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c0900j.getReturnType(), ml, c0900j).toString())};
                    FragmentActivity fragmentActivityRequireActivity = c2065oU.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, 3);
                    Intent intent = new Intent(fragmentActivityRequireActivity, (Class<?>) ColorPickerActivity.class);
                    intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)));
                    safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(c2065oU, intent, 100);
                }
            }

            /* JADX INFO: renamed from: f0P.oU$j$j$Pl */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class Pl implements Function1 {
                final /* synthetic */ UserParameter J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Object f65950O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef f65951n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ oA.j f65952o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Fragment f65953r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ r.UGc f65954t;

                /* JADX INFO: renamed from: f0P.oU$j$j$Pl$j, reason: collision with other inner class name */
                public static final class C0901j implements Function2 {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ Object f65955O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ oA.j f65956n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Fragment f65957t;

                    /* JADX INFO: renamed from: f0P.oU$j$j$Pl$j$j, reason: collision with other inner class name */
                    public static final class C0902j implements Function1 {
                        final /* synthetic */ Object J2;

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ Fragment f65958O;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        final /* synthetic */ Scene f65959n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ SceneElement f65960t;

                        public C0902j(Scene scene, SceneElement sceneElement, Fragment fragment, Object obj) {
                            this.f65959n = scene;
                            this.f65960t = sceneElement;
                            this.f65958O = fragment;
                            this.J2 = obj;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Keyable invoke(Keyable it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return KeyableKt.copyWithValueForTime(it, this.f65959n, this.f65960t, HW.C.aYN(this.f65958O), this.J2);
                        }
                    }

                    public C0901j(oA.j jVar, Fragment fragment, Object obj) {
                        this.f65956n = jVar;
                        this.f65957t = fragment;
                        this.f65955O = obj;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final SceneElement invoke(Scene scene, SceneElement el) {
                        Intrinsics.checkNotNullParameter(scene, "scene");
                        Intrinsics.checkNotNullParameter(el, "el");
                        return (SceneElement) this.f65956n.t(el, new C0902j(scene, el, this.f65957t, this.f65955O));
                    }
                }

                public Pl(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, Fragment fragment, oA.j jVar) {
                    this.f65951n = objectRef;
                    this.f65954t = uGc;
                    this.f65950O = obj;
                    this.J2 = userParameter;
                    this.f65953r = fragment;
                    this.f65952o = jVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((List) obj);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r1v13, types: [LdY.Ml$j, T] */
                public final void n(List valueList) {
                    Float fValueOf;
                    Intrinsics.checkNotNullParameter(valueList, "valueList");
                    Ref.ObjectRef objectRef = this.f65951n;
                    if (objectRef.element == 0) {
                        objectRef.element = HW.C.xMQ(this.f65954t);
                    }
                    Object obj = this.f65950O;
                    UserParameter userParameter = this.J2;
                    if (obj instanceof Quaternion) {
                        Object objFromEulerAngles = Quaternion.INSTANCE.fromEulerAngles(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                        if (objFromEulerAngles == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                        }
                        fValueOf = (Float) objFromEulerAngles;
                    } else if (obj instanceof Vector2D) {
                        fValueOf = (Float) new Vector2D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue());
                    } else if (obj instanceof Vector3D) {
                        fValueOf = (Float) new Vector3D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                    } else if (!(obj instanceof Float)) {
                        Object obj2 = valueList.get(0);
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                        }
                        fValueOf = (Float) obj2;
                    } else if (userParameter instanceof UserParameter.Spinner) {
                        UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                        fValueOf = Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(spinner.getSliderType(), ((Number) valueList.get(0)).floatValue() / spinner.getMultiplier()));
                    } else if (userParameter instanceof UserParameter.Slider) {
                        fValueOf = Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(((UserParameter.Slider) userParameter).getSliderType(), ((Number) valueList.get(0)).floatValue()));
                    } else {
                        Object obj3 = valueList.get(0);
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                        }
                        fValueOf = (Float) obj3;
                    }
                    Fragment fragment = this.f65953r;
                    HW.C.D(fragment, new C0901j(this.f65952o, fragment, fValueOf));
                }
            }

            /* JADX INFO: renamed from: f0P.oU$j$j$Xo */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class Xo implements Function1 {
                final /* synthetic */ UserParameter J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Object f65962O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef f65963n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ oA.j f65964o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Fragment f65965r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ r.UGc f65966t;

                /* JADX INFO: renamed from: f0P.oU$j$j$Xo$j, reason: collision with other inner class name */
                public static final class C0903j implements Function2 {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ Object f65967O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ oA.j f65968n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Fragment f65969t;

                    /* JADX INFO: renamed from: f0P.oU$j$j$Xo$j$j, reason: collision with other inner class name */
                    public static final class C0904j implements Function1 {
                        final /* synthetic */ Object J2;

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ Fragment f65970O;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        final /* synthetic */ Scene f65971n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ SceneElement f65972t;

                        public C0904j(Scene scene, SceneElement sceneElement, Fragment fragment, Object obj) {
                            this.f65971n = scene;
                            this.f65972t = sceneElement;
                            this.f65970O = fragment;
                            this.J2 = obj;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Keyable invoke(Keyable it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return KeyableKt.copyWithValueForTime(it, this.f65971n, this.f65972t, HW.C.aYN(this.f65970O), this.J2);
                        }
                    }

                    public C0903j(oA.j jVar, Fragment fragment, Object obj) {
                        this.f65968n = jVar;
                        this.f65969t = fragment;
                        this.f65967O = obj;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final SceneElement invoke(Scene scene, SceneElement el) {
                        Intrinsics.checkNotNullParameter(scene, "scene");
                        Intrinsics.checkNotNullParameter(el, "el");
                        return (SceneElement) this.f65968n.t(el, new C0904j(scene, el, this.f65969t, this.f65967O));
                    }
                }

                public Xo(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, Fragment fragment, oA.j jVar) {
                    this.f65963n = objectRef;
                    this.f65966t = uGc;
                    this.f65962O = obj;
                    this.J2 = userParameter;
                    this.f65965r = fragment;
                    this.f65964o = jVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((List) obj);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r1v13, types: [LdY.Ml$j, T] */
                public final void n(List valueList) {
                    Float fValueOf;
                    Intrinsics.checkNotNullParameter(valueList, "valueList");
                    Ref.ObjectRef objectRef = this.f65963n;
                    if (objectRef.element == 0) {
                        objectRef.element = HW.C.xMQ(this.f65966t);
                    }
                    Object obj = this.f65962O;
                    UserParameter userParameter = this.J2;
                    if (obj instanceof Quaternion) {
                        Object objFromEulerAngles = Quaternion.INSTANCE.fromEulerAngles(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                        if (objFromEulerAngles == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                        }
                        fValueOf = (Float) objFromEulerAngles;
                    } else if (obj instanceof Vector2D) {
                        fValueOf = (Float) new Vector2D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue());
                    } else if (obj instanceof Vector3D) {
                        fValueOf = (Float) new Vector3D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                    } else if (!(obj instanceof Float)) {
                        Object obj2 = valueList.get(0);
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                        }
                        fValueOf = (Float) obj2;
                    } else if (userParameter instanceof UserParameter.Spinner) {
                        UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                        fValueOf = Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(spinner.getSliderType(), ((Number) valueList.get(0)).floatValue() / spinner.getMultiplier()));
                    } else if (userParameter instanceof UserParameter.Slider) {
                        fValueOf = Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(((UserParameter.Slider) userParameter).getSliderType(), ((Number) valueList.get(0)).floatValue()));
                    } else {
                        Object obj3 = valueList.get(0);
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                        }
                        fValueOf = (Float) obj3;
                    }
                    Fragment fragment = this.f65965r;
                    HW.C.D(fragment, new C0903j(this.f65964o, fragment, fValueOf));
                }
            }

            /* JADX INFO: renamed from: f0P.oU$j$j$aC */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class aC implements ColorPickerWidget.w6 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ C2065oU f65973n;

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.w6
                public void nr() {
                }

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.w6
                public void rl() {
                }

                aC(C2065oU c2065oU) {
                    this.f65973n = c2065oU;
                }

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.w6
                public void n() {
                    SceneHolder sceneHolderE = HW.C.e(this.f65973n);
                    if (sceneHolderE != null) {
                        sceneHolderE.setEditMode(2131362629);
                    }
                }

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.w6
                public void t() {
                    SceneHolder sceneHolderE = HW.C.e(this.f65973n);
                    if (sceneHolderE != null) {
                        sceneHolderE.setEditMode(2131362630);
                    }
                }
            }

            /* JADX INFO: renamed from: f0P.oU$j$j$fuX */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class fuX implements ColorPickerWidget.j {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ View f65975n;
                final /* synthetic */ UserParameter nr;
                final /* synthetic */ C2065oU rl;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ j f65976t;

                fuX(View view, C2065oU c2065oU, j jVar, UserParameter userParameter) {
                    this.f65975n = view;
                    this.rl = c2065oU;
                    this.f65976t = jVar;
                    this.nr = userParameter;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Keyable O(Scene scene, SceneElement sceneElement, C2065oU c2065oU, int i2, Keyable newColor) {
                    Intrinsics.checkNotNullParameter(newColor, "newColor");
                    return KeyableKt.copyWithValueForTime(newColor, scene, sceneElement, HW.C.aYN(c2065oU), HI0.qf.t(i2));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final SceneElement nr(j jVar, UserParameter userParameter, final C2065oU c2065oU, final int i2, final Scene scene, final SceneElement el) {
                    Intrinsics.checkNotNullParameter(scene, "scene");
                    Intrinsics.checkNotNullParameter(el, "el");
                    oA.j jVarHI = jVar.HI();
                    String name = ((UserParameter.Color) userParameter).getName();
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type = jVarHI.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type);
                    oA.Ml ml = new oA.Ml(orCreateKotlinClass, type, jVarHI, name);
                    C0905j c0905j = new PropertyReference1Impl() { // from class: f0P.oU.j.j.fuX.j
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableUserParameterValue) obj).getColorValue();
                        }
                    };
                    return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c0905j.getReturnType(), ml, c0905j).t(el, new Function1() { // from class: f0P.we
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C2065oU.j.C0898j.fuX.O(scene, el, c2065oU, i2, (Keyable) obj);
                        }
                    });
                }

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.j
                public void n(final int i2) {
                    ((ColorView) this.f65975n).setColor(i2);
                    final C2065oU c2065oU = this.rl;
                    final j jVar = this.f65976t;
                    final UserParameter userParameter = this.nr;
                    HW.C.D(c2065oU, new Function2() { // from class: f0P.Eg2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return C2065oU.j.C0898j.fuX.nr(jVar, userParameter, c2065oU, i2, (Scene) obj, (SceneElement) obj2);
                        }
                    });
                }
            }

            /* JADX INFO: renamed from: f0P.oU$j$j$o */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class o implements Function1 {
                final /* synthetic */ UserParameter J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Object f65979O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef f65980n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ oA.j f65981o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Fragment f65982r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ r.UGc f65983t;

                /* JADX INFO: renamed from: f0P.oU$j$j$o$j, reason: collision with other inner class name */
                public static final class C0907j implements Function2 {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ Object f65984O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ oA.j f65985n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Fragment f65986t;

                    /* JADX INFO: renamed from: f0P.oU$j$j$o$j$j, reason: collision with other inner class name */
                    public static final class C0908j implements Function1 {
                        final /* synthetic */ Object J2;

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ Fragment f65987O;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        final /* synthetic */ Scene f65988n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ SceneElement f65989t;

                        public C0908j(Scene scene, SceneElement sceneElement, Fragment fragment, Object obj) {
                            this.f65988n = scene;
                            this.f65989t = sceneElement;
                            this.f65987O = fragment;
                            this.J2 = obj;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Keyable invoke(Keyable it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return KeyableKt.copyWithValueForTime(it, this.f65988n, this.f65989t, HW.C.aYN(this.f65987O), this.J2);
                        }
                    }

                    public C0907j(oA.j jVar, Fragment fragment, Object obj) {
                        this.f65985n = jVar;
                        this.f65986t = fragment;
                        this.f65984O = obj;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final SceneElement invoke(Scene scene, SceneElement el) {
                        Intrinsics.checkNotNullParameter(scene, "scene");
                        Intrinsics.checkNotNullParameter(el, "el");
                        return (SceneElement) this.f65985n.t(el, new C0908j(scene, el, this.f65986t, this.f65984O));
                    }
                }

                public o(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, Fragment fragment, oA.j jVar) {
                    this.f65980n = objectRef;
                    this.f65983t = uGc;
                    this.f65979O = obj;
                    this.J2 = userParameter;
                    this.f65982r = fragment;
                    this.f65981o = jVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((List) obj);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r1v13, types: [LdY.Ml$j, T] */
                public final void n(List valueList) {
                    Vector2D vector2D;
                    Intrinsics.checkNotNullParameter(valueList, "valueList");
                    Ref.ObjectRef objectRef = this.f65980n;
                    if (objectRef.element == 0) {
                        objectRef.element = HW.C.xMQ(this.f65983t);
                    }
                    Object obj = this.f65979O;
                    UserParameter userParameter = this.J2;
                    if (obj instanceof Quaternion) {
                        Object objFromEulerAngles = Quaternion.INSTANCE.fromEulerAngles(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                        if (objFromEulerAngles == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                        }
                        vector2D = (Vector2D) objFromEulerAngles;
                    } else if (obj instanceof Vector2D) {
                        vector2D = new Vector2D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue());
                    } else if (obj instanceof Vector3D) {
                        vector2D = (Vector2D) new Vector3D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                    } else if (!(obj instanceof Float)) {
                        Object obj2 = valueList.get(0);
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                        }
                        vector2D = (Vector2D) obj2;
                    } else if (userParameter instanceof UserParameter.Spinner) {
                        UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                        vector2D = (Vector2D) Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(spinner.getSliderType(), ((Number) valueList.get(0)).floatValue() / spinner.getMultiplier()));
                    } else if (userParameter instanceof UserParameter.Slider) {
                        vector2D = (Vector2D) Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(((UserParameter.Slider) userParameter).getSliderType(), ((Number) valueList.get(0)).floatValue()));
                    } else {
                        Object obj3 = valueList.get(0);
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                        }
                        vector2D = (Vector2D) obj3;
                    }
                    Fragment fragment = this.f65982r;
                    HW.C.D(fragment, new C0907j(this.f65981o, fragment, vector2D));
                }
            }

            /* JADX INFO: renamed from: f0P.oU$j$j$qz */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class qz implements Function1 {
                final /* synthetic */ UserParameter J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Object f65990O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef f65991n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ oA.j f65992o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Fragment f65993r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ r.UGc f65994t;

                /* JADX INFO: renamed from: f0P.oU$j$j$qz$j, reason: collision with other inner class name */
                public static final class C0909j implements Function2 {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ Object f65995O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ oA.j f65996n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Fragment f65997t;

                    /* JADX INFO: renamed from: f0P.oU$j$j$qz$j$j, reason: collision with other inner class name */
                    public static final class C0910j implements Function1 {
                        final /* synthetic */ Object J2;

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ Fragment f65998O;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        final /* synthetic */ Scene f65999n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ SceneElement f66000t;

                        public C0910j(Scene scene, SceneElement sceneElement, Fragment fragment, Object obj) {
                            this.f65999n = scene;
                            this.f66000t = sceneElement;
                            this.f65998O = fragment;
                            this.J2 = obj;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Keyable invoke(Keyable it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return KeyableKt.copyWithValueForTime(it, this.f65999n, this.f66000t, HW.C.aYN(this.f65998O), this.J2);
                        }
                    }

                    public C0909j(oA.j jVar, Fragment fragment, Object obj) {
                        this.f65996n = jVar;
                        this.f65997t = fragment;
                        this.f65995O = obj;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final SceneElement invoke(Scene scene, SceneElement el) {
                        Intrinsics.checkNotNullParameter(scene, "scene");
                        Intrinsics.checkNotNullParameter(el, "el");
                        return (SceneElement) this.f65996n.t(el, new C0910j(scene, el, this.f65997t, this.f65995O));
                    }
                }

                public qz(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, Fragment fragment, oA.j jVar) {
                    this.f65991n = objectRef;
                    this.f65994t = uGc;
                    this.f65990O = obj;
                    this.J2 = userParameter;
                    this.f65993r = fragment;
                    this.f65992o = jVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((List) obj);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r1v13, types: [LdY.Ml$j, T] */
                public final void n(List valueList) {
                    Vector2D vector2D;
                    Intrinsics.checkNotNullParameter(valueList, "valueList");
                    Ref.ObjectRef objectRef = this.f65991n;
                    if (objectRef.element == 0) {
                        objectRef.element = HW.C.xMQ(this.f65994t);
                    }
                    Object obj = this.f65990O;
                    UserParameter userParameter = this.J2;
                    if (obj instanceof Quaternion) {
                        Object objFromEulerAngles = Quaternion.INSTANCE.fromEulerAngles(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                        if (objFromEulerAngles == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                        }
                        vector2D = (Vector2D) objFromEulerAngles;
                    } else if (obj instanceof Vector2D) {
                        vector2D = new Vector2D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue());
                    } else if (obj instanceof Vector3D) {
                        vector2D = (Vector2D) new Vector3D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                    } else if (!(obj instanceof Float)) {
                        Object obj2 = valueList.get(0);
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                        }
                        vector2D = (Vector2D) obj2;
                    } else if (userParameter instanceof UserParameter.Spinner) {
                        UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                        vector2D = (Vector2D) Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(spinner.getSliderType(), ((Number) valueList.get(0)).floatValue() / spinner.getMultiplier()));
                    } else if (userParameter instanceof UserParameter.Slider) {
                        vector2D = (Vector2D) Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(((UserParameter.Slider) userParameter).getSliderType(), ((Number) valueList.get(0)).floatValue()));
                    } else {
                        Object obj3 = valueList.get(0);
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                        }
                        vector2D = (Vector2D) obj3;
                    }
                    Fragment fragment = this.f65993r;
                    HW.C.D(fragment, new C0909j(this.f65992o, fragment, vector2D));
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit fcU(float f3, final UserParameter userParameter, final C2065oU c2065oU, C0898j c0898j, AppCompatTextView appCompatTextView, final j jVar, int i2) {
                float f4 = i2 * f3;
                UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                final float fCoerceIn = RangesKt.coerceIn(f4, spinner.getMinValue(), spinner.getMaxValue());
                mYa(c2065oU, userParameter, c0898j, appCompatTextView, fCoerceIn);
                HW.C.D(c2065oU, new Function2() { // from class: f0P.px
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2065oU.j.C0898j.eWT(jVar, userParameter, c2065oU, fCoerceIn, (Scene) obj, (SceneElement) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: f0P.oU$j$j$j, reason: collision with other inner class name */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public /* synthetic */ class C0906j {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                public static final /* synthetic */ int[] $EnumSwitchMapping$1;
                public static final /* synthetic */ int[] $EnumSwitchMapping$2;

                static {
                    int[] iArr = new int[SelectorStyle.values().length];
                    try {
                        iArr[SelectorStyle.DROPDOWN.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SelectorStyle.RADIO.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                    int[] iArr2 = new int[StaticTextStyle.values().length];
                    try {
                        iArr2[StaticTextStyle.TIP.ordinal()] = 1;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr2[StaticTextStyle.SECTION.ordinal()] = 2;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$1 = iArr2;
                    int[] iArr3 = new int[SliderType.values().length];
                    try {
                        iArr3[SliderType.FLOAT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr3[SliderType.RELATIVE_FLOAT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr3[SliderType.ANGLE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr3[SliderType.ANGLE_RANGE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr3[SliderType.INTEGER.ordinal()] = 5;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr3[SliderType.RPM.ordinal()] = 6;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr3[SliderType.f46339HZ.ordinal()] = 7;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr3[SliderType.PERCENT.ordinal()] = 8;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr3[SliderType.RELATIVE_PERCENT.ordinal()] = 9;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr3[SliderType.SECONDS.ordinal()] = 10;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr3[SliderType.FRAMES.ordinal()] = 11;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr3[SliderType.KELVIN.ordinal()] = 12;
                    } catch (NoSuchFieldError unused16) {
                    }
                    $EnumSwitchMapping$2 = iArr3;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0898j(j jVar, ViewBinding itemBinding) {
                super(itemBinding.getRoot());
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                this.rl = jVar;
                this.f65939n = itemBinding;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit B(C2065oU c2065oU, final j jVar, final UserParameter userParameter, final ChoiceInfo choiceInfo) {
                HW.C.D(c2065oU, new Function2() { // from class: f0P.FU2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2065oU.j.C0898j.J(jVar, userParameter, choiceInfo, (Scene) obj, (SceneElement) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void C(C2065oU c2065oU, UserParameter userParameter, j jVar, TextView textView, View view, View view2) {
                String string;
                CharSequence text;
                Keyable<Float> floatValue;
                Rl(c2065oU, userParameter, jVar, textView, view);
                if (c2065oU.getContext() != null) {
                    oA.j jVarHI = jVar.HI();
                    UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                    Pair pair = TuplesKt.to(spinner.getName(), new KeyableUserParameterValue(0.0f));
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type = jVarHI.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type);
                    oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, jVarHI, pair.getFirst(), pair.getSecond());
                    Ml ml = new PropertyReference1Impl() { // from class: f0P.oU.j.j.Ml
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableUserParameterValue) obj).getFloatValue();
                        }
                    };
                    oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), ml.getReturnType(), i28, ml);
                    KeyableUserParameterValue keyableUserParameterValue = (KeyableUserParameterValue) jVar.ck().get(spinner.getName());
                    float defaultValue = (keyableUserParameterValue == null || (floatValue = keyableUserParameterValue.getFloatValue()) == null) ? spinner.getDefaultValue() : ((Number) KeyableKt.valueAtTime(floatValue, HW.C.aYN(c2065oU))).floatValue();
                    Float fValueOf = Float.valueOf(defaultValue);
                    TextView textViewR = jVar.r();
                    if (textViewR == null || (text = textViewR.getText()) == null || (string = text.toString()) == null) {
                        string = "";
                    }
                    List listListOf = CollectionsKt.listOf(string);
                    ArrayList arrayList = new ArrayList();
                    if (userParameter instanceof UserParameter.FloatValue) {
                        arrayList.add(new C2348n(defaultValue, ((UserParameter.FloatValue) userParameter).getValue(), -1.0f, -1.0f, listListOf.isEmpty() ? "" : (String) listListOf.get(0), true));
                    } else if (userParameter instanceof UserParameter.Angle) {
                        UserParameter.Angle angle = (UserParameter.Angle) userParameter;
                        arrayList.add(new C2348n(defaultValue, angle.getDefaultValue(), angle.getMinValue(), angle.getMaxValue(), listListOf.isEmpty() ? "" : (String) listListOf.get(0), true));
                    } else if (!(userParameter instanceof UserParameter.Point) && !(userParameter instanceof UserParameter.Orientation) && !(userParameter instanceof UserParameter.XYZ)) {
                        if (userParameter instanceof UserParameter.Spinner) {
                            UserParameter.Spinner spinner2 = (UserParameter.Spinner) userParameter;
                            float fFloatValue = fValueOf.floatValue() * spinner2.getMultiplier();
                            SliderType sliderType = spinner2.getSliderType();
                            arrayList.add(new C2348n(UserParameterKt.calcSliderTypeValueForViewing(sliderType, fFloatValue), UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner2.getDefaultValue() * spinner2.getMultiplier()), UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner2.getMinValue() * spinner2.getMultiplier()), UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner2.getMaxValue() * spinner2.getMultiplier()), listListOf.isEmpty() ? spinner2.getLabel() : (String) listListOf.get(0), true));
                        } else if (userParameter instanceof UserParameter.Slider) {
                            UserParameter.Slider slider = (UserParameter.Slider) userParameter;
                            arrayList.add(new C2348n(UserParameterKt.calcSliderTypeValueForViewing(slider.getSliderType(), fValueOf.floatValue()), UserParameterKt.calcSliderTypeValueForViewing(slider.getSliderType(), slider.getDefaultValue()), UserParameterKt.calcSliderTypeValueForViewing(slider.getSliderType(), slider.getMinValue()), UserParameterKt.calcSliderTypeValueForViewing(slider.getSliderType(), slider.getMaxValue()), listListOf.isEmpty() ? slider.getLabel() : (String) listListOf.get(0), true));
                        }
                    }
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    r.UGc uGc = new r.UGc();
                    uGc.v(arrayList);
                    uGc.bzg(new Pl(objectRef, uGc, fValueOf, userParameter, c2065oU, aCVar));
                    uGc.rV9(new r.Ln(objectRef));
                    FragmentActivity activity = c2065oU.getActivity();
                    SurfaceView surfaceView = activity != null ? (SurfaceView) activity.findViewById(2131363442) : null;
                    if (surfaceView != null) {
                        Resources resources = c2065oU.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        int[] iArr = new int[2];
                        surfaceView.getLocationInWindow(iArr);
                        int identifier = resources.getIdentifier("status_bar_height", "dimen", AppLovinBridge.f61290h);
                        float dimensionPixelSize = iArr[1];
                        if (identifier > 0) {
                            dimensionPixelSize -= resources.getDimensionPixelSize(identifier);
                        }
                        uGc.Xw(RectKt.t(Offset.O((((long) Float.floatToRawIntBits(iArr[0])) << 32) | (((long) Float.floatToRawIntBits(dimensionPixelSize)) & 4294967295L)), Size.nr((((long) Float.floatToRawIntBits(surfaceView.getWidth())) << 32) | (((long) Float.floatToRawIntBits(surfaceView.getHeight())) & 4294967295L))));
                    }
                    c2065oU.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Map D(UserParameter userParameter, ChoiceInfo choiceInfo, Map it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return MapsKt.plus(it, new Pair(((UserParameter.Selector) userParameter).getName(), new KeyableUserParameterValue(choiceInfo.getValue())));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement E(j jVar, final UserParameter userParameter, final C0898j c0898j, Scene scene, SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "<unused var>");
                Intrinsics.checkNotNullParameter(el, "el");
                return (SceneElement) jVar.HI().t(el, new Function1() { // from class: f0P.Yr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2065oU.j.C0898j.M(userParameter, c0898j, (Map) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Keyable ER(Scene scene, SceneElement sceneElement, C2065oU c2065oU, Vector3D vector3D, Keyable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(c2065oU), vector3D);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void FX(final j jVar, final UserParameter userParameter, C0898j c0898j, final C2065oU c2065oU, View view) {
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(context, jVar.az(), false, 4, null);
                for (final ChoiceInfo choiceInfo : ((UserParameter.Selector) userParameter).getChoices()) {
                    Iy.n nVarTy = jVar.ty();
                    Context context2 = c0898j.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    com.alightcreative.widget.nKK.ck(nkk, Iy.w6.n(nVarTy, context2, choiceInfo.getLabel()), null, false, null, new Function0() { // from class: f0P.V97
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C2065oU.j.C0898j.B(c2065oU, jVar, userParameter, choiceInfo);
                        }
                    }, 14, null);
                }
                View itemView = c0898j.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                com.alightcreative.widget.nKK.N(nkk, itemView, 0, 0, null, 14, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit G7(Ref.ObjectRef objectRef, C2065oU c2065oU) {
                Ml.j jVar = (Ml.j) objectRef.element;
                if (jVar != null) {
                    jVar.n();
                }
                c2065oU.gestureInProgress = false;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Map GR(UserParameter userParameter, ChoiceInfo choiceInfo, Map it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return MapsKt.plus(it, new Pair(((UserParameter.Selector) userParameter).getName(), new KeyableUserParameterValue(choiceInfo.getValue())));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit How(YBiasView yBiasView, final C2065oU c2065oU, final UserParameter.HueDisc hueDisc, AppCompatTextView appCompatTextView, final j jVar, float f3, float f4) {
                final Vector3D vector3D = new Vector3D(f3, f4, yBiasView.getValue());
                i(hueDisc, appCompatTextView, vector3D);
                HW.C.D(c2065oU, new Function2() { // from class: f0P.wJC
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2065oU.j.C0898j.tUK(jVar, hueDisc, c2065oU, vector3D, (Scene) obj, (SceneElement) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement I(j jVar, final UserParameter userParameter, final ChoiceInfo choiceInfo, Scene scene, SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "<unused var>");
                Intrinsics.checkNotNullParameter(el, "el");
                return (SceneElement) jVar.HI().t(el, new Function1() { // from class: f0P.Z9T
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2065oU.j.C0898j.GR(userParameter, choiceInfo, (Map) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement J(j jVar, final UserParameter userParameter, final ChoiceInfo choiceInfo, Scene scene, SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, LHbnkhI.gcQwlPmCDHbxr);
                Intrinsics.checkNotNullParameter(el, "el");
                return (SceneElement) jVar.HI().t(el, new Function1() { // from class: f0P.Tr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2065oU.j.C0898j.D(userParameter, choiceInfo, (Map) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void Jk(C2065oU c2065oU, UserParameter userParameter, j jVar, TextView textView, View view, View view2) {
                String string;
                CharSequence text;
                Keyable<Float> floatValue;
                Rl(c2065oU, userParameter, jVar, textView, view);
                if (c2065oU.getContext() != null) {
                    oA.j jVarHI = jVar.HI();
                    UserParameter.Slider slider = (UserParameter.Slider) userParameter;
                    Pair pair = TuplesKt.to(slider.getName(), new KeyableUserParameterValue(0.0f));
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type = jVarHI.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type);
                    oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, jVarHI, pair.getFirst(), pair.getSecond());
                    Wre wre = new PropertyReference1Impl() { // from class: f0P.oU.j.j.Wre
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableUserParameterValue) obj).getFloatValue();
                        }
                    };
                    oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), wre.getReturnType(), i28, wre);
                    KeyableUserParameterValue keyableUserParameterValue = (KeyableUserParameterValue) jVar.ck().get(slider.getName());
                    float defaultValue = (keyableUserParameterValue == null || (floatValue = keyableUserParameterValue.getFloatValue()) == null) ? slider.getDefaultValue() : ((Number) KeyableKt.valueAtTime(floatValue, HW.C.aYN(c2065oU))).floatValue();
                    Float fValueOf = Float.valueOf(defaultValue);
                    TextView textViewR = jVar.r();
                    if (textViewR == null || (text = textViewR.getText()) == null || (string = text.toString()) == null) {
                        string = "";
                    }
                    List listListOf = CollectionsKt.listOf(string);
                    ArrayList arrayList = new ArrayList();
                    if (userParameter instanceof UserParameter.FloatValue) {
                        arrayList.add(new C2348n(defaultValue, ((UserParameter.FloatValue) userParameter).getValue(), -1.0f, -1.0f, listListOf.isEmpty() ? "" : (String) listListOf.get(0), true));
                    } else if (userParameter instanceof UserParameter.Angle) {
                        UserParameter.Angle angle = (UserParameter.Angle) userParameter;
                        arrayList.add(new C2348n(defaultValue, angle.getDefaultValue(), angle.getMinValue(), angle.getMaxValue(), listListOf.isEmpty() ? "" : (String) listListOf.get(0), true));
                    } else if (!(userParameter instanceof UserParameter.Point) && !(userParameter instanceof UserParameter.Orientation) && !(userParameter instanceof UserParameter.XYZ)) {
                        if (userParameter instanceof UserParameter.Spinner) {
                            UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                            float fFloatValue = fValueOf.floatValue() * spinner.getMultiplier();
                            SliderType sliderType = spinner.getSliderType();
                            arrayList.add(new C2348n(UserParameterKt.calcSliderTypeValueForViewing(sliderType, fFloatValue), UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner.getDefaultValue() * spinner.getMultiplier()), UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner.getMinValue() * spinner.getMultiplier()), UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner.getMaxValue() * spinner.getMultiplier()), listListOf.isEmpty() ? spinner.getLabel() : (String) listListOf.get(0), true));
                        } else if (userParameter instanceof UserParameter.Slider) {
                            UserParameter.Slider slider2 = (UserParameter.Slider) userParameter;
                            arrayList.add(new C2348n(UserParameterKt.calcSliderTypeValueForViewing(slider2.getSliderType(), fValueOf.floatValue()), UserParameterKt.calcSliderTypeValueForViewing(slider2.getSliderType(), slider2.getDefaultValue()), UserParameterKt.calcSliderTypeValueForViewing(slider2.getSliderType(), slider2.getMinValue()), UserParameterKt.calcSliderTypeValueForViewing(slider2.getSliderType(), slider2.getMaxValue()), listListOf.isEmpty() ? slider2.getLabel() : (String) listListOf.get(0), true));
                        }
                    }
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    r.UGc uGc = new r.UGc();
                    uGc.v(arrayList);
                    uGc.bzg(new Xo(objectRef, uGc, fValueOf, userParameter, c2065oU, aCVar));
                    uGc.rV9(new r.Ln(objectRef));
                    FragmentActivity activity = c2065oU.getActivity();
                    SurfaceView surfaceView = activity != null ? (SurfaceView) activity.findViewById(2131363442) : null;
                    if (surfaceView != null) {
                        Resources resources = c2065oU.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        int[] iArr = new int[2];
                        surfaceView.getLocationInWindow(iArr);
                        int identifier = resources.getIdentifier("status_bar_height", "dimen", AppLovinBridge.f61290h);
                        float dimensionPixelSize = iArr[1];
                        if (identifier > 0) {
                            dimensionPixelSize -= resources.getDimensionPixelSize(identifier);
                        }
                        uGc.Xw(RectKt.t(Offset.O((((long) Float.floatToRawIntBits(iArr[0])) << 32) | (((long) Float.floatToRawIntBits(dimensionPixelSize)) & 4294967295L)), Size.nr((((long) Float.floatToRawIntBits(surfaceView.getWidth())) << 32) | (((long) Float.floatToRawIntBits(surfaceView.getHeight())) & 4294967295L))));
                    }
                    c2065oU.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Map M(UserParameter userParameter, C0898j c0898j, Map it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return MapsKt.plus(it, new Pair(((UserParameter.Switch) userParameter).getName(), new KeyableUserParameterValue(((SJ0.g9) c0898j.f65939n).f9449t.isChecked())));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Keyable W(Scene scene, SceneElement sceneElement, C2065oU c2065oU, Vector3D vector3D, Keyable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(c2065oU), vector3D);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void eF(C2065oU c2065oU, final j jVar, final UserParameter userParameter, final C0898j c0898j, View view) {
                HW.C.D(c2065oU, new Function2() { // from class: f0P.Olx
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2065oU.j.C0898j.E(jVar, userParameter, c0898j, (Scene) obj, (SceneElement) obj2);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement eWT(j jVar, UserParameter userParameter, final C2065oU c2065oU, final float f3, final Scene scene, final SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "scene");
                Intrinsics.checkNotNullParameter(el, "el");
                oA.j jVarHI = jVar.HI();
                Pair pair = TuplesKt.to(((UserParameter.Spinner) userParameter).getName(), new KeyableUserParameterValue(0.0f));
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = jVarHI.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, jVarHI, pair.getFirst(), pair.getSecond());
                I28 i282 = new PropertyReference1Impl() { // from class: f0P.oU.j.j.I28
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getFloatValue();
                    }
                };
                return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), i282.getReturnType(), i28, i282).t(el, new Function1() { // from class: f0P.RT
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2065oU.j.C0898j.ul(scene, el, c2065oU, f3, (Keyable) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void k(C0898j c0898j) {
                ((SJ0.kO4) c0898j.f65939n).nr.setColorWidget(null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement kSg(HueDiscView hueDiscView, float f3, j jVar, UserParameter.HueDisc hueDisc, AppCompatTextView appCompatTextView, final C2065oU c2065oU, final Scene scene, final SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "scene");
                Intrinsics.checkNotNullParameter(el, "el");
                final Vector3D vector3D = new Vector3D(hueDiscView.getHue(), hueDiscView.getStrength(), f3);
                i(hueDisc, appCompatTextView, vector3D);
                oA.j jVarHI = jVar.HI();
                Pair pair = TuplesKt.to(hueDisc.getName(), new KeyableUserParameterValue(0.0f));
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = jVarHI.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, jVarHI, pair.getFirst(), pair.getSecond());
                z zVar = new PropertyReference1Impl() { // from class: f0P.oU.j.j.z
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getVec3DValue();
                    }
                };
                return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), zVar.getReturnType(), i28, zVar).t(el, new Function1() { // from class: f0P.Aal
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2065oU.j.C0898j.W(scene, el, c2065oU, vector3D, (Keyable) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit lLA(final C2065oU c2065oU, final HueDiscView hueDiscView, final j jVar, final UserParameter.HueDisc hueDisc, final AppCompatTextView appCompatTextView, final float f3) {
                HW.C.D(c2065oU, new Function2() { // from class: f0P.Sti
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2065oU.j.C0898j.kSg(hueDiscView, f3, jVar, hueDisc, appCompatTextView, c2065oU, (Scene) obj, (SceneElement) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit m(Ref.ObjectRef objectRef, C2065oU c2065oU) {
                Ml.j jVar = (Ml.j) objectRef.element;
                if (jVar != null) {
                    jVar.n();
                }
                c2065oU.gestureInProgress = false;
                return Unit.INSTANCE;
            }

            private static final void mYa(C2065oU c2065oU, UserParameter userParameter, C0898j c0898j, AppCompatTextView appCompatTextView, float f3) {
                String strValueOf;
                double d2;
                String str;
                StringBuilder sb;
                Scene sceneIF = HW.C.iF(c2065oU);
                int framesPerHundredSeconds = sceneIF != null ? sceneIF.getFramesPerHundredSeconds() : 30;
                UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                float multiplier = spinner.getMultiplier() * f3;
                float step = spinner.getStep() * spinner.getMultiplier();
                AppCompatTextView appCompatTextView2 = ((SJ0.c7r) c0898j.f65939n).f9418O;
                switch (C0906j.$EnumSwitchMapping$2[spinner.getSliderType().ordinal()]) {
                    case 1:
                        double d4 = step;
                        if (d4 < 9.0E-5d) {
                            strValueOf = String.format("%.5f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d4 < 9.0E-4d) {
                            strValueOf = String.format("%.4f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d4 < 0.009d) {
                            strValueOf = String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d4 < 0.09d) {
                            strValueOf = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d4 >= 0.9d) {
                            strValueOf = String.valueOf(MathKt.roundToInt(multiplier));
                        } else {
                            strValueOf = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        }
                        break;
                    case 2:
                        double d5 = step;
                        if (d5 < 9.0E-5d) {
                            strValueOf = String.format((f3 >= 0.0f ? "+" : "") + "%.5f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d5 < 9.0E-4d) {
                            strValueOf = String.format((f3 >= 0.0f ? "+" : "") + "%.4f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d5 < 0.009d) {
                            strValueOf = String.format((f3 >= 0.0f ? "+" : "") + "%.3f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d5 < 0.09d) {
                            strValueOf = String.format((f3 >= 0.0f ? "+" : "") + "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d5 >= 0.9d) {
                            strValueOf = (f3 >= 0.0f ? "+" : "") + MathKt.roundToInt(multiplier);
                        } else {
                            strValueOf = String.format((f3 >= 0.0f ? "+" : "") + "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        }
                        break;
                    case 3:
                    case 4:
                        SliderType sliderType = spinner.getSliderType();
                        SliderType sliderType2 = SliderType.ANGLE_RANGE;
                        String str2 = (sliderType != sliderType2 || multiplier < -360.0f || multiplier > 360.0f) ? "" : "±";
                        if (multiplier > 360.0f) {
                            float f4 = multiplier % 360;
                            d2 = 9.0E-4d;
                            int iFloor = (int) Math.floor(multiplier / r8);
                            appCompatTextView.setVisibility(0);
                            if (spinner.getSliderType() == sliderType2) {
                                sb = new StringBuilder();
                                sb.append("±");
                            } else {
                                sb = new StringBuilder();
                            }
                            sb.append(iFloor);
                            sb.append("× + ");
                            appCompatTextView.setText(sb.toString());
                            multiplier = f4;
                        } else {
                            d2 = 9.0E-4d;
                            if (multiplier < -360.0f) {
                                appCompatTextView.setVisibility(0);
                                appCompatTextView.setText("-" + ((int) Math.floor(r2 / r3)) + "×");
                                multiplier = -((-multiplier) % 360);
                            } else {
                                appCompatTextView.setVisibility(8);
                            }
                        }
                        double d6 = step;
                        if (d6 < 9.0E-5d) {
                            str = String.format("%.5fº", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        } else if (d6 < d2) {
                            str = String.format("%.4fº", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        } else if (d6 < 0.009d) {
                            str = String.format("%.3fº", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        } else if (d6 < 0.09d) {
                            str = String.format("%.2fº", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        } else if (d6 < 0.9d) {
                            str = String.format("%.1fº", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        } else {
                            str = MathKt.roundToInt(multiplier) + "º";
                        }
                        strValueOf = str2 + str;
                        break;
                    case 5:
                        strValueOf = String.valueOf(MathKt.roundToInt(multiplier));
                        break;
                    case 6:
                        strValueOf = String.valueOf(MathKt.roundToInt(multiplier));
                        break;
                    case 7:
                        strValueOf = String.format("%.2fhz", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                        Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        break;
                    case 8:
                        double d7 = step;
                        if (d7 >= 0.009d) {
                            strValueOf = d7 >= 0.09d ? d7 >= 9.9d ? MathKt.roundToInt(multiplier) + "%" : MathKt.roundToInt(multiplier * 10.0f) + "%" : MathKt.roundToInt(multiplier * 100.0f) + "%";
                        } else {
                            strValueOf = String.format("%.1f%%", Arrays.copyOf(new Object[]{Float.valueOf(multiplier * 100.0f)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        }
                        break;
                    case 9:
                        double d8 = step;
                        if (d8 < 0.009d) {
                            strValueOf = String.format((f3 >= 0.0f ? "+" : "") + "%.1f%%", Arrays.copyOf(new Object[]{Float.valueOf(multiplier * 100.0f)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d8 < 0.09d) {
                            strValueOf = (f3 >= 0.0f ? "+" : "") + MathKt.roundToInt(multiplier * 100.0f) + "%";
                        } else if (d8 >= 9.9d) {
                            strValueOf = (f3 >= 0.0f ? "+" : "") + MathKt.roundToInt(multiplier) + "%";
                        } else {
                            strValueOf = (f3 >= 0.0f ? "+" : "") + MathKt.roundToInt(multiplier * 10.0f) + "%";
                        }
                        break;
                    case 10:
                        strValueOf = String.format("%.2fs", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                        Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        break;
                    case 11:
                        strValueOf = TimeKt.formatFrameNumber(MathKt.roundToInt((multiplier * framesPerHundredSeconds) / 100.0f), framesPerHundredSeconds, "s:ff");
                        break;
                    case 12:
                        strValueOf = MathKt.roundToInt(multiplier * 1000.0f) + "K";
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                appCompatTextView2.setText(strValueOf);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Keyable pJg(Scene scene, SceneElement sceneElement, C2065oU c2065oU, Vector2D vector2D, Keyable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(c2065oU), vector2D);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public static final void piY(j jVar, UserParameter userParameter, C2065oU c2065oU, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ValueSpinner valueSpinner, TextView textView, View view, View view2) {
                Vector2D defaultValue;
                Keyable<Vector2D> vec2DValue;
                UserParameter.Point point = (UserParameter.Point) userParameter;
                KeyableUserParameterValue keyableUserParameterValue = (KeyableUserParameterValue) jVar.ck().get(point.getName());
                if (keyableUserParameterValue == null || (vec2DValue = keyableUserParameterValue.getVec2DValue()) == null || (defaultValue = (Vector2D) KeyableKt.valueAtTime(vec2DValue, HW.C.aYN(c2065oU))) == null) {
                    defaultValue = point.getDefaultValue();
                }
                Vector2D vector2D = defaultValue;
                if (!appCompatTextView.isActivated()) {
                    appCompatTextView2.setActivated(false);
                    appCompatTextView.setActivated(true);
                    valueSpinner.setNeedleColor(-1);
                    valueSpinner.setValue(MathKt.roundToInt(vector2D.getY()));
                    valueSpinner.invalidate();
                    return;
                }
                Rl(c2065oU, userParameter, jVar, textView, view);
                oA.j jVarHI = jVar.HI();
                Pair pair = TuplesKt.to(point.getName(), new KeyableUserParameterValue(point.getDefaultValue()));
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = jVarHI.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, jVarHI, pair.getFirst(), pair.getSecond());
                n nVar = new PropertyReference1Impl() { // from class: f0P.oU.j.j.n
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getVec2DValue();
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), nVar.getReturnType(), i28, nVar);
                if (c2065oU.getContext() != null) {
                    List listEmptyList = CollectionsKt.emptyList();
                    ArrayList arrayList = new ArrayList();
                    if (userParameter instanceof UserParameter.FloatValue) {
                        Intrinsics.checkNotNull(vector2D, "null cannot be cast to non-null type kotlin.Float");
                        arrayList.add(new C2348n(((Float) vector2D).floatValue(), ((UserParameter.FloatValue) userParameter).getValue(), -1.0f, -1.0f, listEmptyList.isEmpty() ? "" : (String) listEmptyList.get(0), false));
                    } else if (userParameter instanceof UserParameter.Angle) {
                        Intrinsics.checkNotNull(vector2D, "null cannot be cast to non-null type kotlin.Float");
                        UserParameter.Angle angle = (UserParameter.Angle) userParameter;
                        arrayList.add(new C2348n(((Float) vector2D).floatValue(), angle.getDefaultValue(), angle.getMinValue(), angle.getMaxValue(), listEmptyList.isEmpty() ? "" : (String) listEmptyList.get(0), false));
                    } else {
                        if (userParameter instanceof UserParameter.Point) {
                            if (vector2D != 0) {
                                UserParameter.Point point2 = (UserParameter.Point) userParameter;
                                arrayList.add(new C2348n(vector2D.getX(), point2.getDefaultValue().getX(), point2.getMinOffset().getX(), point2.getMaxOffset().getX(), listEmptyList.isEmpty() ? "X" : (String) listEmptyList.get(0), false));
                                arrayList.add(new C2348n(vector2D.getY(), point2.getDefaultValue().getY(), point2.getMinOffset().getY(), point2.getMaxOffset().getY(), listEmptyList.size() >= 2 ? (String) listEmptyList.get(1) : "Y", true));
                            }
                        } else if (!(userParameter instanceof UserParameter.Orientation) && !(userParameter instanceof UserParameter.XYZ) && !(userParameter instanceof UserParameter.Spinner)) {
                            boolean z2 = userParameter instanceof UserParameter.Slider;
                        }
                    }
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    r.UGc uGc = new r.UGc();
                    uGc.v(arrayList);
                    uGc.bzg(new qz(objectRef, uGc, vector2D, userParameter, c2065oU, aCVar));
                    uGc.rV9(new r.Ln(objectRef));
                    FragmentActivity activity = c2065oU.getActivity();
                    SurfaceView surfaceView = activity != null ? (SurfaceView) activity.findViewById(2131363442) : null;
                    if (surfaceView != null) {
                        Resources resources = c2065oU.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        int[] iArr = new int[2];
                        surfaceView.getLocationInWindow(iArr);
                        int identifier = resources.getIdentifier("status_bar_height", "dimen", AppLovinBridge.f61290h);
                        float dimensionPixelSize = iArr[1];
                        if (identifier > 0) {
                            dimensionPixelSize -= resources.getDimensionPixelSize(identifier);
                        }
                        uGc.Xw(RectKt.t(Offset.O((((long) Float.floatToRawIntBits(iArr[0])) << 32) | (((long) Float.floatToRawIntBits(dimensionPixelSize)) & 4294967295L)), Size.nr((((long) Float.floatToRawIntBits(surfaceView.getWidth())) << 32) | (((long) Float.floatToRawIntBits(surfaceView.getHeight())) & 4294967295L))));
                    }
                    c2065oU.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement tUK(j jVar, UserParameter.HueDisc hueDisc, final C2065oU c2065oU, final Vector3D vector3D, final Scene scene, final SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "scene");
                Intrinsics.checkNotNullParameter(el, "el");
                oA.j jVarHI = jVar.HI();
                Pair pair = TuplesKt.to(hueDisc.getName(), new KeyableUserParameterValue(0.0f));
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = jVarHI.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, jVarHI, pair.getFirst(), pair.getSecond());
                eO eOVar = new PropertyReference1Impl() { // from class: f0P.oU.j.j.eO
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getVec3DValue();
                    }
                };
                return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), eOVar.getReturnType(), i28, eOVar).t(el, new Function1() { // from class: f0P.GJC
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2065oU.j.C0898j.ER(scene, el, c2065oU, vector3D, (Keyable) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Keyable ul(Scene scene, SceneElement sceneElement, C2065oU c2065oU, float f3, Keyable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(c2065oU), Float.valueOf(f3));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement xg(oA.j jVar, final C2065oU c2065oU, final Vector2D vector2D, final Scene scene, final SceneElement newEl) {
                Intrinsics.checkNotNullParameter(scene, "scene");
                Intrinsics.checkNotNullParameter(newEl, "newEl");
                return (SceneElement) jVar.t(newEl, new Function1() { // from class: f0P.is
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2065oU.j.C0898j.pJg(scene, newEl, c2065oU, vector2D, (Keyable) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void z(j jVar, UserParameter userParameter, C2065oU c2065oU, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ValueSpinner valueSpinner, int i2, TextView textView, View view, View view2) {
                Vector2D defaultValue;
                Keyable<Vector2D> vec2DValue;
                UserParameter.Point point = (UserParameter.Point) userParameter;
                KeyableUserParameterValue keyableUserParameterValue = (KeyableUserParameterValue) jVar.ck().get(point.getName());
                if (keyableUserParameterValue == null || (vec2DValue = keyableUserParameterValue.getVec2DValue()) == null || (defaultValue = (Vector2D) KeyableKt.valueAtTime(vec2DValue, HW.C.aYN(c2065oU))) == null) {
                    defaultValue = point.getDefaultValue();
                }
                if (!appCompatTextView.isActivated()) {
                    appCompatTextView.setActivated(true);
                    appCompatTextView2.setActivated(false);
                    valueSpinner.setNeedleColor(i2);
                    valueSpinner.setValue(MathKt.roundToInt(defaultValue.getX()));
                    valueSpinner.invalidate();
                    return;
                }
                Rl(c2065oU, userParameter, jVar, textView, view);
                oA.j jVarHI = jVar.HI();
                Pair pair = TuplesKt.to(point.getName(), new KeyableUserParameterValue(point.getDefaultValue()));
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = jVarHI.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, jVarHI, pair.getFirst(), pair.getSecond());
                C c2 = new PropertyReference1Impl() { // from class: f0P.oU.j.j.C
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getVec2DValue();
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2.getReturnType(), i28, c2);
                if (c2065oU.getContext() != null) {
                    List listEmptyList = CollectionsKt.emptyList();
                    ArrayList arrayList = new ArrayList();
                    if (userParameter instanceof UserParameter.FloatValue) {
                        Intrinsics.checkNotNull(defaultValue, "null cannot be cast to non-null type kotlin.Float");
                        arrayList.add(new C2348n(((Float) defaultValue).floatValue(), ((UserParameter.FloatValue) userParameter).getValue(), -1.0f, -1.0f, listEmptyList.isEmpty() ? "" : (String) listEmptyList.get(0), true));
                    } else if (userParameter instanceof UserParameter.Angle) {
                        Intrinsics.checkNotNull(defaultValue, "null cannot be cast to non-null type kotlin.Float");
                        UserParameter.Angle angle = (UserParameter.Angle) userParameter;
                        arrayList.add(new C2348n(((Float) defaultValue).floatValue(), angle.getDefaultValue(), angle.getMinValue(), angle.getMaxValue(), listEmptyList.isEmpty() ? "" : (String) listEmptyList.get(0), true));
                    } else {
                        if (userParameter instanceof UserParameter.Point) {
                            if (defaultValue != null) {
                                UserParameter.Point point2 = (UserParameter.Point) userParameter;
                                arrayList.add(new C2348n(defaultValue.getX(), point2.getDefaultValue().getX(), point2.getMinOffset().getX(), point2.getMaxOffset().getX(), listEmptyList.isEmpty() ? "X" : (String) listEmptyList.get(0), true));
                                arrayList.add(new C2348n(defaultValue.getY(), point2.getDefaultValue().getY(), point2.getMinOffset().getY(), point2.getMaxOffset().getY(), listEmptyList.size() >= 2 ? (String) listEmptyList.get(1) : "Y", false));
                            }
                        } else if (!(userParameter instanceof UserParameter.Orientation) && !(userParameter instanceof UserParameter.XYZ) && !(userParameter instanceof UserParameter.Spinner)) {
                            boolean z2 = userParameter instanceof UserParameter.Slider;
                        }
                    }
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    r.UGc uGc = new r.UGc();
                    uGc.v(arrayList);
                    uGc.bzg(new o(objectRef, uGc, defaultValue, userParameter, c2065oU, aCVar));
                    uGc.rV9(new r.Ln(objectRef));
                    FragmentActivity activity = c2065oU.getActivity();
                    SurfaceView surfaceView = activity != null ? (SurfaceView) activity.findViewById(2131363442) : null;
                    if (surfaceView != null) {
                        Resources resources = c2065oU.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        int[] iArr = new int[2];
                        surfaceView.getLocationInWindow(iArr);
                        int identifier = resources.getIdentifier("status_bar_height", "dimen", AppLovinBridge.f61290h);
                        float dimensionPixelSize = iArr[1];
                        if (identifier > 0) {
                            dimensionPixelSize -= resources.getDimensionPixelSize(identifier);
                        }
                        uGc.Xw(RectKt.t(Offset.O((((long) Float.floatToRawIntBits(iArr[0])) << 32) | (((long) Float.floatToRawIntBits(dimensionPixelSize)) & 4294967295L)), Size.nr((((long) Float.floatToRawIntBits(surfaceView.getWidth())) << 32) | (((long) Float.floatToRawIntBits(surfaceView.getHeight())) & 4294967295L))));
                    }
                    c2065oU.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
                }
            }

            public final void Org(List userParameters) {
                Vector3D defaultValue;
                final View view;
                UserParameter.HueDisc hueDisc;
                Keyable<Vector3D> vec3DValue;
                C0898j c0898j = this;
                Intrinsics.checkNotNullParameter(userParameters, "userParameters");
                if (userParameters == null || !userParameters.isEmpty()) {
                    Iterator it = userParameters.iterator();
                    while (it.hasNext()) {
                        if (!(((UserParameter) it.next()) instanceof UserParameter.HueDisc)) {
                            return;
                        }
                    }
                }
                ViewBinding viewBinding = c0898j.f65939n;
                Intrinsics.checkNotNull(viewBinding, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingHueDiscBinding");
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(userParameters, 10));
                Iterator it2 = userParameters.iterator();
                while (it2.hasNext()) {
                    UserParameter userParameter = (UserParameter) it2.next();
                    Intrinsics.checkNotNull(userParameter, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.userparam.UserParameter.HueDisc");
                    arrayList.add((UserParameter.HueDisc) userParameter);
                }
                ViewBinding viewBinding2 = c0898j.f65939n;
                List listListOf = CollectionsKt.listOf((Object[]) new AppCompatTextView[]{((SJ0.hQ) viewBinding2).Uo, ((SJ0.hQ) viewBinding2).KN, ((SJ0.hQ) viewBinding2).xMQ, ((SJ0.hQ) viewBinding2).mUb});
                ViewBinding viewBinding3 = c0898j.f65939n;
                List listListOf2 = CollectionsKt.listOf((Object[]) new AppCompatImageView[]{((SJ0.hQ) viewBinding3).f9481t, ((SJ0.hQ) viewBinding3).nr, ((SJ0.hQ) viewBinding3).f9479O, ((SJ0.hQ) viewBinding3).J2});
                ViewBinding viewBinding4 = c0898j.f65939n;
                List listListOf3 = CollectionsKt.listOf((Object[]) new AppCompatTextView[]{((SJ0.hQ) viewBinding4).gh, ((SJ0.hQ) viewBinding4).qie, ((SJ0.hQ) viewBinding4).az, ((SJ0.hQ) viewBinding4).ty});
                HueDiscView hueDisc2 = ((SJ0.hQ) c0898j.f65939n).rl;
                Intrinsics.checkNotNullExpressionValue(hueDisc2, "hueDisc");
                YBiasView ybias = ((SJ0.hQ) c0898j.f65939n).HI;
                Intrinsics.checkNotNullExpressionValue(ybias, "ybias");
                Iterator it3 = CollectionsKt.plus((Collection) listListOf, (Iterable) listListOf3).iterator();
                while (it3.hasNext()) {
                    ((AppCompatTextView) it3.next()).setVisibility(8);
                }
                final j jVar = c0898j.rl;
                final C2065oU c2065oU = jVar.xMQ;
                int i2 = 0;
                for (Object obj : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    UserParameter.HueDisc hueDisc3 = (UserParameter.HueDisc) obj;
                    Object obj2 = listListOf.get(i2);
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    AppCompatTextView appCompatTextView = (AppCompatTextView) obj2;
                    Object obj3 = listListOf3.get(i2);
                    Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                    final AppCompatTextView appCompatTextView2 = (AppCompatTextView) obj3;
                    View view2 = (View) listListOf2.get(i2);
                    Iy.n nVarTy = jVar.ty();
                    Context context = c0898j.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    String strN = Iy.w6.n(nVarTy, context, hueDisc3.getLabel());
                    Resources resources = c2065oU.getResources();
                    Context context2 = c2065oU.getContext();
                    List list = listListOf;
                    appCompatTextView.setBackground(resources.getDrawable(2131232235, context2 != null ? context2.getTheme() : null));
                    appCompatTextView.setText(strN);
                    appCompatTextView.setVisibility(0);
                    appCompatTextView2.setVisibility(0);
                    if (Intrinsics.areEqual(hueDisc3.getName(), c2065oU.paramName)) {
                        appCompatTextView.setActivated(true);
                        if (view2 != null) {
                            view2.setActivated(true);
                        }
                        jVar.WPU(appCompatTextView);
                        jVar.S(view2);
                    } else {
                        appCompatTextView.setActivated(false);
                        if (Intrinsics.areEqual(jVar.r(), appCompatTextView)) {
                            jVar.WPU(null);
                            jVar.S(null);
                        }
                    }
                    KeyableUserParameterValue keyableUserParameterValue = (KeyableUserParameterValue) jVar.ck().get(hueDisc3.getName());
                    if (keyableUserParameterValue == null || (vec3DValue = keyableUserParameterValue.getVec3DValue()) == null || (defaultValue = (Vector3D) KeyableKt.valueAtTime(vec3DValue, HW.C.aYN(c2065oU))) == null) {
                        defaultValue = hueDisc3.getDefaultValue();
                    }
                    i(hueDisc3, appCompatTextView2, defaultValue);
                    if (c2065oU.paramName == null) {
                        HueDiscView hueDiscView = hueDisc2;
                        C2065oU c2065oU2 = c2065oU;
                        YBiasView yBiasView = ybias;
                        j jVar2 = jVar;
                        UhV(c2065oU2, hueDisc3, jVar2, appCompatTextView, view2, yBiasView, hueDiscView, appCompatTextView2);
                        c2065oU = c2065oU2;
                        hueDisc = hueDisc3;
                        jVar = jVar2;
                        ybias = yBiasView;
                        view = view2;
                        hueDisc2 = hueDiscView;
                        appCompatTextView = appCompatTextView;
                        appCompatTextView2 = appCompatTextView2;
                    } else {
                        view = view2;
                        hueDisc = hueDisc3;
                    }
                    final HueDiscView hueDiscView2 = hueDisc2;
                    final AppCompatTextView appCompatTextView3 = appCompatTextView;
                    final YBiasView yBiasView2 = ybias;
                    final UserParameter.HueDisc hueDisc4 = hueDisc;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: f0P.Oz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            C2065oU.j.C0898j.hRu(c2065oU, hueDisc4, jVar, appCompatTextView3, view, yBiasView2, hueDiscView2, appCompatTextView2, view3);
                        }
                    };
                    ybias = yBiasView2;
                    hueDisc2 = hueDiscView2;
                    appCompatTextView3.setOnClickListener(onClickListener);
                    hueDisc2.setOnStartTrackingTouchListener(new Function0() { // from class: f0P.JrN
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C2065oU.j.C0898j.HV(c2065oU);
                        }
                    });
                    hueDisc2.setOnStopTrackingTouchListener(new Function0() { // from class: f0P.aI
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C2065oU.j.C0898j.GD(c2065oU);
                        }
                    });
                    ybias.setOnStartTrackingTouchListener(new Function0() { // from class: f0P.d1e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C2065oU.j.C0898j.Po6(c2065oU);
                        }
                    });
                    ybias.setOnStopTrackingTouchListener(new Function0() { // from class: f0P.qm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C2065oU.j.C0898j.EWS(c2065oU);
                        }
                    });
                    K(hueDisc4, c2065oU, ybias, jVar, hueDisc2, appCompatTextView2);
                    c0898j = this;
                    i2 = i3;
                    listListOf = list;
                }
            }

            public final ViewBinding RQ() {
                return this.f65939n;
            }

            public final void p5(final UserParameter userParameter) {
                Keyable<Float> floatValue;
                Keyable<Float> floatValue2;
                Vector2D defaultValue;
                Keyable<Vector2D> vec2DValue;
                SolidColor defaultValue2;
                Keyable<SolidColor> colorValue;
                KeyableUserParameterValue defaultKeyableUserParameterValue;
                DataType dataType;
                Intrinsics.checkNotNullParameter(userParameter, "userParameter");
                final TextView textView = (TextView) this.itemView.findViewById(2131363477);
                final View viewFindViewById = this.itemView.findViewById(2131363060);
                if (viewFindViewById != null) {
                    Keyable keyableO9 = this.rl.xMQ.o9(userParameter);
                    viewFindViewById.setVisibility((keyableO9 == null || !keyableO9.getKeyed()) ? 4 : 0);
                    Unit unit = Unit.INSTANCE;
                }
                Iy.n nVarTy = this.rl.ty();
                Context context = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                String strN = Iy.w6.n(nVarTy, context, userParameter.getLabel());
                textView.setText(strN);
                if (StringsKt.isBlank(strN) && ((defaultKeyableUserParameterValue = UserParameterKt.getDefaultKeyableUserParameterValue(userParameter)) == null || (dataType = defaultKeyableUserParameterValue.getDataType()) == null || !dataType.getIsKeyable())) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                }
                if (Intrinsics.areEqual(userParameter.getName(), this.rl.xMQ.paramName)) {
                    textView.setActivated(true);
                    if (viewFindViewById != null) {
                        viewFindViewById.setActivated(true);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    this.rl.WPU(textView);
                    this.rl.S(viewFindViewById);
                } else {
                    textView.setActivated(false);
                    if (viewFindViewById != null) {
                        viewFindViewById.setActivated(false);
                        Unit unit3 = Unit.INSTANCE;
                    }
                    if (Intrinsics.areEqual(this.rl.r(), textView)) {
                        this.rl.WPU(null);
                        this.rl.S(null);
                    }
                }
                if (this.rl.xMQ.paramName == null) {
                    j jVar = this.rl;
                    Rl(jVar.xMQ, userParameter, jVar, textView, viewFindViewById);
                }
                if (userParameter instanceof UserParameter.Switch) {
                    ViewBinding viewBinding = this.f65939n;
                    Intrinsics.checkNotNull(viewBinding, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingSwitchBinding");
                    Switch r02 = ((SJ0.g9) this.f65939n).f9449t;
                    UserParameter.Switch r42 = (UserParameter.Switch) userParameter;
                    KeyableUserParameterValue keyableUserParameterValue = (KeyableUserParameterValue) this.rl.ck().get(r42.getName());
                    r02.setChecked(keyableUserParameterValue != null ? keyableUserParameterValue.getBooleanValue() : r42.getDefaultValue());
                    Switch r03 = ((SJ0.g9) this.f65939n).f9449t;
                    final j jVar2 = this.rl;
                    final C2065oU c2065oU = jVar2.xMQ;
                    r03.setOnClickListener(new View.OnClickListener() { // from class: f0P.Iz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C2065oU.j.C0898j.eF(c2065oU, jVar2, userParameter, this, view);
                        }
                    });
                    return;
                }
                if (userParameter instanceof UserParameter.Selector) {
                    ViewBinding viewBinding2 = this.f65939n;
                    Intrinsics.checkNotNull(viewBinding2, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingSelectorBinding");
                    UserParameter.Selector selector = (UserParameter.Selector) userParameter;
                    int i2 = C0906j.$EnumSwitchMapping$0[selector.getStyle().ordinal()];
                    if (i2 == 1) {
                        ((SJ0.B) this.f65939n).gh.setVisibility(8);
                        ((SJ0.B) this.f65939n).f9086t.setVisibility(0);
                        KeyableUserParameterValue keyableUserParameterValue2 = (KeyableUserParameterValue) this.rl.ck().get(selector.getName());
                        int intValue = keyableUserParameterValue2 != null ? keyableUserParameterValue2.getIntValue() : selector.getDefaultChoice();
                        TextView textView2 = ((SJ0.B) this.f65939n).f9086t;
                        Iy.n nVarTy2 = this.rl.ty();
                        Context context2 = this.itemView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        for (ChoiceInfo choiceInfo : selector.getChoices()) {
                            if (choiceInfo.getValue() == intValue) {
                                textView2.setText(Iy.w6.n(nVarTy2, context2, choiceInfo.getLabel()));
                                TextView textView3 = ((SJ0.B) this.f65939n).f9086t;
                                final j jVar3 = this.rl;
                                final C2065oU c2065oU2 = jVar3.xMQ;
                                textView3.setOnClickListener(new View.OnClickListener() { // from class: f0P.NH
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        C2065oU.j.C0898j.FX(jVar3, userParameter, this, c2065oU2, view);
                                    }
                                });
                                Unit unit4 = Unit.INSTANCE;
                                return;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((SJ0.B) this.f65939n).gh.setVisibility(0);
                    ((SJ0.B) this.f65939n).f9086t.setVisibility(8);
                    ViewBinding viewBinding3 = this.f65939n;
                    Button[] buttonArr = {((SJ0.B) viewBinding3).nr, ((SJ0.B) viewBinding3).f9084O, ((SJ0.B) viewBinding3).J2, ((SJ0.B) viewBinding3).Uo, ((SJ0.B) viewBinding3).KN, ((SJ0.B) viewBinding3).xMQ, ((SJ0.B) viewBinding3).mUb};
                    for (int i3 = 0; i3 < 7; i3++) {
                        buttonArr[i3].setVisibility(8);
                    }
                    KeyableUserParameterValue keyableUserParameterValue3 = (KeyableUserParameterValue) this.rl.ck().get(selector.getName());
                    final int intValue2 = keyableUserParameterValue3 != null ? keyableUserParameterValue3.getIntValue() : selector.getDefaultChoice();
                    List<ChoiceInfo> choices = selector.getChoices();
                    final j jVar4 = this.rl;
                    final C2065oU c2065oU3 = jVar4.xMQ;
                    int i5 = 0;
                    for (Object obj : choices) {
                        int i7 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        final ChoiceInfo choiceInfo2 = (ChoiceInfo) obj;
                        Button button = buttonArr[i5];
                        Intrinsics.checkNotNullExpressionValue(button, "get(...)");
                        button.setVisibility(0);
                        button.setActivated(choiceInfo2.getValue() == intValue2);
                        Iy.n nVarTy3 = jVar4.ty();
                        Context context3 = this.itemView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        button.setText(Iy.w6.n(nVarTy3, context3, choiceInfo2.getLabel()));
                        button.setOnClickListener(new View.OnClickListener() { // from class: f0P.Fov
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C2065oU.j.C0898j.a(choiceInfo2, intValue2, c2065oU3, jVar4, userParameter, view);
                            }
                        });
                        i5 = i7;
                    }
                    Unit unit5 = Unit.INSTANCE;
                    return;
                }
                if (userParameter instanceof UserParameter.Color) {
                    ViewBinding viewBinding4 = this.f65939n;
                    Intrinsics.checkNotNull(viewBinding4, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingColorBinding");
                    final j jVar5 = this.rl;
                    final C2065oU c2065oU4 = jVar5.xMQ;
                    textView.setOnClickListener(new View.OnClickListener() { // from class: f0P.BJN
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C2065oU.j.C0898j.Nxk(c2065oU4, userParameter, jVar5, textView, viewFindViewById, view);
                        }
                    });
                    UserParameter.Color color = (UserParameter.Color) userParameter;
                    KeyableUserParameterValue keyableUserParameterValue4 = (KeyableUserParameterValue) this.rl.ck().get(color.getName());
                    if (keyableUserParameterValue4 == null || (colorValue = keyableUserParameterValue4.getColorValue()) == null || (defaultValue2 = (SolidColor) KeyableKt.valueAtTime(colorValue, HW.C.aYN(this.rl.xMQ))) == null) {
                        defaultValue2 = color.getDefaultValue();
                    }
                    ((SJ0.kO4) this.f65939n).nr.setColor(ColorKt.toInt(defaultValue2));
                    float f3 = 255;
                    ((SJ0.kO4) this.f65939n).rl.setText(((int) (defaultValue2.getR() * f3)) + " " + ((int) (defaultValue2.getG() * f3)) + " " + ((int) (defaultValue2.getB() * f3)));
                    ColorView colorView = ((SJ0.kO4) this.f65939n).nr;
                    final j jVar6 = this.rl;
                    final C2065oU c2065oU5 = jVar6.xMQ;
                    colorView.setOnClickListener(new View.OnClickListener() { // from class: f0P.s7M
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C2065oU.j.C0898j.Y(jVar6, c2065oU5, this, userParameter, textView, viewFindViewById, view);
                        }
                    });
                    return;
                }
                if (userParameter instanceof UserParameter.StaticText) {
                    UserParameter.StaticText staticText = (UserParameter.StaticText) userParameter;
                    int i8 = C0906j.$EnumSwitchMapping$1[staticText.getStyle().ordinal()];
                    if (i8 != 1 && i8 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TextView textView4 = (TextView) this.itemView.findViewById(2131363481);
                    Iy.n nVarTy4 = this.rl.ty();
                    Context context4 = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    textView4.setText(Iy.w6.n(nVarTy4, context4, staticText.getText()));
                    Unit unit6 = Unit.INSTANCE;
                    return;
                }
                if (userParameter instanceof UserParameter.Point) {
                    ViewBinding viewBinding5 = this.f65939n;
                    Intrinsics.checkNotNull(viewBinding5, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingPosBinding");
                    final j jVar7 = this.rl;
                    final C2065oU c2065oU6 = jVar7.xMQ;
                    textView.setOnClickListener(new View.OnClickListener() { // from class: f0P.fT
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C2065oU.j.C0898j.dR0(c2065oU6, userParameter, jVar7, textView, viewFindViewById, view);
                        }
                    });
                    UserParameter.Point point = (UserParameter.Point) userParameter;
                    KeyableUserParameterValue keyableUserParameterValue5 = (KeyableUserParameterValue) this.rl.ck().get(point.getName());
                    if (keyableUserParameterValue5 == null || (vec2DValue = keyableUserParameterValue5.getVec2DValue()) == null || (defaultValue = (Vector2D) KeyableKt.valueAtTime(vec2DValue, HW.C.aYN(this.rl.xMQ))) == null) {
                        defaultValue = point.getDefaultValue();
                    }
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    final AppCompatTextView propertyValueX = ((SJ0.RGN) this.f65939n).f9292O;
                    Intrinsics.checkNotNullExpressionValue(propertyValueX, "propertyValueX");
                    final AppCompatTextView propertyValueY = ((SJ0.RGN) this.f65939n).J2;
                    Intrinsics.checkNotNullExpressionValue(propertyValueY, "propertyValueY");
                    final ValueSpinner pointSpinner = ((SJ0.RGN) this.f65939n).f9294t;
                    Intrinsics.checkNotNullExpressionValue(pointSpinner, "pointSpinner");
                    final int color2 = this.itemView.getResources().getColor(2131099798, this.itemView.getContext().getTheme());
                    propertyValueX.setText(String.valueOf(MathKt.roundToInt(defaultValue.getX())));
                    propertyValueY.setText(String.valueOf(MathKt.roundToInt(defaultValue.getY())));
                    pointSpinner.setShowZeroLine(true);
                    if (propertyValueX.isActivated() == propertyValueY.isActivated()) {
                        propertyValueX.setActivated(true);
                        propertyValueY.setActivated(false);
                    }
                    if (propertyValueX.isActivated()) {
                        pointSpinner.setValue(MathKt.roundToInt(defaultValue.getX()));
                    } else {
                        pointSpinner.setValue(MathKt.roundToInt(defaultValue.getY()));
                    }
                    final j jVar8 = this.rl;
                    final C2065oU c2065oU7 = jVar8.xMQ;
                    propertyValueX.setOnClickListener(new View.OnClickListener() { // from class: f0P.QQ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C2065oU.j.C0898j.z(jVar8, userParameter, c2065oU7, propertyValueX, propertyValueY, pointSpinner, color2, textView, viewFindViewById, view);
                        }
                    });
                    final j jVar9 = this.rl;
                    final C2065oU c2065oU8 = jVar9.xMQ;
                    propertyValueY.setOnClickListener(new View.OnClickListener() { // from class: f0P.S9
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C2065oU.j.C0898j.piY(jVar9, userParameter, c2065oU8, propertyValueY, propertyValueX, pointSpinner, textView, viewFindViewById, view);
                        }
                    });
                    final j jVar10 = this.rl;
                    final C2065oU c2065oU9 = jVar10.xMQ;
                    pointSpinner.setOnStartTrackingTouch(new Function0() { // from class: f0P.ipE
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C2065oU.j.C0898j.ijL(objectRef, c2065oU9, userParameter, jVar10, textView, viewFindViewById);
                        }
                    });
                    final C2065oU c2065oU10 = this.rl.xMQ;
                    pointSpinner.setOnStopTrackingTouch(new Function0() { // from class: f0P.DA
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C2065oU.j.C0898j.m(objectRef, c2065oU10);
                        }
                    });
                    final j jVar11 = this.rl;
                    final C2065oU c2065oU11 = jVar11.xMQ;
                    pointSpinner.setOnSpinAbs(new Function1() { // from class: f0P.u5X
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C2065oU.j.C0898j.eTf(jVar11, userParameter, c2065oU11, propertyValueX, propertyValueY, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                if (!(userParameter instanceof UserParameter.Spinner)) {
                    if (userParameter instanceof UserParameter.Slider) {
                        ViewBinding viewBinding6 = this.f65939n;
                        Intrinsics.checkNotNull(viewBinding6, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingSliderBinding");
                        final j jVar12 = this.rl;
                        final C2065oU c2065oU12 = jVar12.xMQ;
                        textView.setOnClickListener(new View.OnClickListener() { // from class: f0P.rp
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C2065oU.j.C0898j.n1(c2065oU12, userParameter, jVar12, textView, viewFindViewById, view);
                            }
                        });
                        AlightSlider propertyValueSlider = ((SJ0.xuv) this.f65939n).f9684O;
                        Intrinsics.checkNotNullExpressionValue(propertyValueSlider, "propertyValueSlider");
                        UserParameter.Slider slider = (UserParameter.Slider) userParameter;
                        KeyableUserParameterValue keyableUserParameterValue6 = (KeyableUserParameterValue) this.rl.ck().get(slider.getName());
                        float defaultValue3 = (keyableUserParameterValue6 == null || (floatValue = keyableUserParameterValue6.getFloatValue()) == null) ? slider.getDefaultValue() : ((Number) KeyableKt.valueAtTime(floatValue, HW.C.aYN(this.rl.xMQ))).floatValue();
                        ((SJ0.xuv) this.f65939n).nr.setText(UserParameterKt.format(slider.getSliderType(), defaultValue3));
                        AppCompatTextView appCompatTextView = ((SJ0.xuv) this.f65939n).nr;
                        final j jVar13 = this.rl;
                        final C2065oU c2065oU13 = jVar13.xMQ;
                        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: f0P.Ez
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C2065oU.j.C0898j.Jk(c2065oU13, userParameter, jVar13, textView, viewFindViewById, view);
                            }
                        });
                        propertyValueSlider.setMaxValue((int) (slider.getMaxValue() * 1000.0f));
                        propertyValueSlider.setMinValue((int) (slider.getMinValue() * 1000.0f));
                        propertyValueSlider.setStepSize((int) (slider.getStep() * 1000.0f));
                        propertyValueSlider.setValue((int) (defaultValue3 * 1000.0f));
                        propertyValueSlider.setLogScale(slider.getLogScale());
                        propertyValueSlider.setOriginValue((int) (slider.getOriginValue() * 1000.0f));
                        List<Float> tickMarks = slider.getTickMarks();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tickMarks, 10));
                        Iterator<T> it = tickMarks.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf((int) (((Number) it.next()).floatValue() * 1000.0f)));
                        }
                        propertyValueSlider.setTickMarkValues(arrayList);
                        List<Float> snapValues = slider.getSnapValues();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(snapValues, 10));
                        Iterator<T> it2 = snapValues.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(Integer.valueOf((int) (((Number) it2.next()).floatValue() * 1000.0f)));
                        }
                        propertyValueSlider.setSnapValues(arrayList2);
                        j jVar14 = this.rl;
                        propertyValueSlider.setOnSeekBarChangeListener(new CN3(jVar14.xMQ, this, userParameter, jVar14, textView, viewFindViewById));
                        return;
                    }
                    return;
                }
                ViewBinding viewBinding7 = this.f65939n;
                Intrinsics.checkNotNull(viewBinding7, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingSpinnerBinding");
                final j jVar15 = this.rl;
                final C2065oU c2065oU14 = jVar15.xMQ;
                textView.setOnClickListener(new View.OnClickListener() { // from class: f0P.kX7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C2065oU.j.C0898j.ofS(c2065oU14, userParameter, jVar15, textView, viewFindViewById, view);
                    }
                });
                UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                KeyableUserParameterValue keyableUserParameterValue7 = (KeyableUserParameterValue) this.rl.ck().get(spinner.getName());
                float defaultValue4 = (keyableUserParameterValue7 == null || (floatValue2 = keyableUserParameterValue7.getFloatValue()) == null) ? spinner.getDefaultValue() : ((Number) KeyableKt.valueAtTime(floatValue2, HW.C.aYN(this.rl.xMQ))).floatValue();
                final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                final AppCompatTextView propertyValueAux = ((SJ0.c7r) this.f65939n).J2;
                Intrinsics.checkNotNullExpressionValue(propertyValueAux, "propertyValueAux");
                if (spinner.getSliderType() != SliderType.ANGLE && spinner.getSliderType() != SliderType.ANGLE_RANGE) {
                    propertyValueAux.setVisibility(8);
                }
                mYa(this.rl.xMQ, userParameter, this, propertyValueAux, defaultValue4);
                AppCompatTextView appCompatTextView2 = ((SJ0.c7r) this.f65939n).f9418O;
                final j jVar16 = this.rl;
                final C2065oU c2065oU15 = jVar16.xMQ;
                appCompatTextView2.setOnClickListener(new View.OnClickListener() { // from class: f0P.rC
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C2065oU.j.C0898j.C(c2065oU15, userParameter, jVar16, textView, viewFindViewById, view);
                    }
                });
                final float step = spinner.getStep();
                ValueSpinner valueSpinner = (ValueSpinner) this.itemView.findViewById(2131363492);
                valueSpinner.setValue(MathKt.roundToInt(defaultValue4 / step));
                valueSpinner.setMinValue(MathKt.roundToInt(spinner.getMinValue() / step));
                valueSpinner.setMaxValue(MathKt.roundToInt(spinner.getMaxValue() / step));
                valueSpinner.setLimitRange(true);
                List<Float> tickMarks2 = spinner.getTickMarks();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(tickMarks2, 10));
                Iterator<T> it3 = tickMarks2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Integer.valueOf(MathKt.roundToInt(((Number) it3.next()).floatValue() / step)));
                }
                valueSpinner.setBrightMarks(arrayList3);
                final j jVar17 = this.rl;
                final C2065oU c2065oU16 = jVar17.xMQ;
                valueSpinner.setOnStartTrackingTouch(new Function0() { // from class: f0P.SP
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C2065oU.j.C0898j.Mx(objectRef2, c2065oU16, userParameter, jVar17, textView, viewFindViewById);
                    }
                });
                final C2065oU c2065oU17 = this.rl.xMQ;
                valueSpinner.setOnStopTrackingTouch(new Function0() { // from class: f0P.Kyu
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C2065oU.j.C0898j.G7(objectRef2, c2065oU17);
                    }
                });
                final j jVar18 = this.rl;
                final C2065oU c2065oU18 = jVar18.xMQ;
                valueSpinner.setOnSpinAbs(new Function1() { // from class: f0P.MO6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C2065oU.j.C0898j.fcU(step, userParameter, c2065oU18, this, propertyValueAux, jVar18, ((Integer) obj2).intValue());
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit EWS(C2065oU c2065oU) {
                c2065oU.undoBatch.n();
                c2065oU.gestureInProgress = false;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit GD(C2065oU c2065oU) {
                c2065oU.undoBatch.n();
                c2065oU.gestureInProgress = false;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit HV(C2065oU c2065oU) {
                c2065oU.undoBatch = HW.C.xMQ(c2065oU);
                c2065oU.gestureInProgress = true;
                return Unit.INSTANCE;
            }

            private static final void K(final UserParameter.HueDisc hueDisc, final C2065oU c2065oU, final YBiasView yBiasView, final j jVar, final HueDiscView hueDiscView, final AppCompatTextView appCompatTextView) {
                int i2;
                Vector3D defaultValue;
                Keyable<Vector3D> vec3DValue;
                if (Intrinsics.areEqual(hueDisc.getName(), c2065oU.paramName)) {
                    if (hueDisc.getBias()) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    yBiasView.setVisibility(i2);
                    KeyableUserParameterValue keyableUserParameterValue = (KeyableUserParameterValue) jVar.ck().get(hueDisc.getName());
                    if (keyableUserParameterValue == null || (vec3DValue = keyableUserParameterValue.getVec3DValue()) == null || (defaultValue = (Vector3D) KeyableKt.valueAtTime(vec3DValue, HW.C.aYN(c2065oU))) == null) {
                        defaultValue = hueDisc.getDefaultValue();
                    }
                    hueDiscView.n(defaultValue.getX(), defaultValue.getY());
                    yBiasView.setValue(defaultValue.getZ());
                    i(hueDisc, appCompatTextView, defaultValue);
                    hueDiscView.setOnValueChangedListener(new Function2() { // from class: f0P.ow1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return C2065oU.j.C0898j.How(yBiasView, c2065oU, hueDisc, appCompatTextView, jVar, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                        }
                    });
                    yBiasView.setOnValueChangedListener(new Function1() { // from class: f0P.uF
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C2065oU.j.C0898j.lLA(c2065oU, hueDiscView, jVar, hueDisc, appCompatTextView, ((Float) obj).floatValue());
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Type inference failed for: r2v1, types: [LdY.Ml$j, T] */
            public static final Unit Mx(Ref.ObjectRef objectRef, C2065oU c2065oU, UserParameter userParameter, j jVar, TextView textView, View view) {
                Rl(c2065oU, userParameter, jVar, textView, view);
                objectRef.element = HW.C.xMQ(c2065oU);
                c2065oU.gestureInProgress = true;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void Nxk(C2065oU c2065oU, UserParameter userParameter, j jVar, TextView textView, View view, View view2) {
                Rl(c2065oU, userParameter, jVar, textView, view);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit Po6(C2065oU c2065oU) {
                c2065oU.undoBatch = HW.C.xMQ(c2065oU);
                c2065oU.gestureInProgress = true;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void Rl(C2065oU c2065oU, final UserParameter userParameter, final j jVar, TextView textView, View view) {
                KeyableUserParameterValue defaultKeyableUserParameterValue;
                DataType dataType;
                if (!Intrinsics.areEqual(c2065oU.paramName, userParameter.getName()) && (defaultKeyableUserParameterValue = UserParameterKt.getDefaultKeyableUserParameterValue(userParameter)) != null && (dataType = defaultKeyableUserParameterValue.getDataType()) != null && dataType.getIsKeyable()) {
                    c2065oU.paramName = userParameter.getName();
                    TextView textViewR = jVar.r();
                    if (textViewR != null) {
                        textViewR.setActivated(false);
                    }
                    View viewIk = jVar.Ik();
                    if (viewIk != null) {
                        viewIk.setActivated(false);
                    }
                    jVar.WPU(textView);
                    jVar.S(view);
                    textView.setActivated(true);
                    if (view != null) {
                        view.setActivated(true);
                    }
                    textView.post(new Runnable() { // from class: f0P.Vd
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2065oU.j.C0898j.qm(jVar, userParameter);
                        }
                    });
                    c2065oU.W();
                }
            }

            private static final void UhV(C2065oU c2065oU, UserParameter.HueDisc hueDisc, j jVar, AppCompatTextView appCompatTextView, View view, YBiasView yBiasView, HueDiscView hueDiscView, AppCompatTextView appCompatTextView2) {
                KeyableUserParameterValue defaultKeyableUserParameterValue;
                DataType dataType;
                if (!Intrinsics.areEqual(c2065oU.paramName, hueDisc.getName()) && (defaultKeyableUserParameterValue = UserParameterKt.getDefaultKeyableUserParameterValue(hueDisc)) != null && (dataType = defaultKeyableUserParameterValue.getDataType()) != null && dataType.getIsKeyable()) {
                    c2065oU.paramName = hueDisc.getName();
                    TextView textViewR = jVar.r();
                    if (textViewR != null) {
                        textViewR.setActivated(false);
                    }
                    View viewIk = jVar.Ik();
                    if (viewIk != null) {
                        viewIk.setActivated(false);
                    }
                    jVar.WPU(appCompatTextView);
                    jVar.S(view);
                    appCompatTextView.setActivated(true);
                    if (view != null) {
                        view.setActivated(true);
                    }
                    c2065oU.W();
                    K(hueDisc, c2065oU, yBiasView, jVar, hueDiscView, appCompatTextView2);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void Y(j jVar, C2065oU c2065oU, final C0898j c0898j, UserParameter userParameter, TextView textView, View view, View view2) {
                Rl(c2065oU, userParameter, jVar, textView, view);
                Intrinsics.checkNotNull(view2);
                yU.Ml ml = new yU.Ml(view2, ((ColorView) view2).getAndroidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_COLOR java.lang.String());
                if (StringsKt.endsWith$default(jVar.qie(), "chromakey", false, 2, (Object) null)) {
                    ml.nr().setAllowAlpha(false);
                }
                ml.nr().setOnColorChangeListener(new fuX(view2, c2065oU, jVar, userParameter));
                ml.nr().setPalletteClickListener(new Dsr(c2065oU, ml, jVar, userParameter));
                ml.nr().setSpoidEventListener(new aC(c2065oU));
                ml.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: f0P.GQ
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        C2065oU.j.C0898j.k(this.f64240n);
                    }
                });
                ml.nr().setSceneHolder(HW.C.e(c2065oU));
                ((SJ0.kO4) c0898j.f65939n).nr.setColorWidget(ml.nr());
                ml.KN(view2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void a(final ChoiceInfo choiceInfo, int i2, C2065oU c2065oU, final j jVar, final UserParameter userParameter, View view) {
                if (choiceInfo.getValue() != i2) {
                    HW.C.D(c2065oU, new Function2() { // from class: f0P.Ws6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return C2065oU.j.C0898j.I(jVar, userParameter, choiceInfo, (Scene) obj, (SceneElement) obj2);
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void dR0(C2065oU c2065oU, UserParameter userParameter, j jVar, TextView textView, View view, View view2) {
                Rl(c2065oU, userParameter, jVar, textView, view);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit eTf(j jVar, UserParameter userParameter, final C2065oU c2065oU, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, int i2) {
                final Vector2D vector2D;
                oA.j jVarHI = jVar.HI();
                UserParameter.Point point = (UserParameter.Point) userParameter;
                Pair pair = TuplesKt.to(point.getName(), new KeyableUserParameterValue(point.getDefaultValue()));
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = jVarHI.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, jVarHI, pair.getFirst(), pair.getSecond());
                w6 w6Var = new PropertyReference1Impl() { // from class: f0P.oU.j.j.w6
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getVec2DValue();
                    }
                };
                final oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), w6Var.getReturnType(), i28, w6Var);
                SceneElement sceneElementNHg = HW.C.nHg(c2065oU);
                if (sceneElementNHg == null) {
                    return Unit.INSTANCE;
                }
                Vector2D vector2D2 = (Vector2D) KeyableKt.valueAtTime((Keyable) aCVar.get(sceneElementNHg), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(c2065oU)));
                if (appCompatTextView.isActivated()) {
                    vector2D = new Vector2D(i2, vector2D2.getY());
                } else {
                    vector2D = new Vector2D(vector2D2.getX(), i2);
                }
                appCompatTextView.setText(String.valueOf(MathKt.roundToInt(vector2D.getX())));
                appCompatTextView2.setText(String.valueOf(MathKt.roundToInt(vector2D.getY())));
                HW.C.D(c2065oU, new Function2() { // from class: f0P.a3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2065oU.j.C0898j.xg(aCVar, c2065oU, vector2D, (Scene) obj, (SceneElement) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void hRu(C2065oU c2065oU, UserParameter.HueDisc hueDisc, j jVar, AppCompatTextView appCompatTextView, View view, YBiasView yBiasView, HueDiscView hueDiscView, AppCompatTextView appCompatTextView2, View view2) {
                UhV(c2065oU, hueDisc, jVar, appCompatTextView, view, yBiasView, hueDiscView, appCompatTextView2);
            }

            private static final void i(UserParameter.HueDisc hueDisc, AppCompatTextView appCompatTextView, Vector3D vector3D) {
                if (hueDisc.getBias()) {
                    String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(vector3D.getX())}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    String str2 = String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(vector3D.getY())}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                    String str3 = String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(vector3D.getZ())}, 1));
                    Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                    appCompatTextView.setText(str + "º\n" + str2 + "\n" + str3);
                    return;
                }
                String str4 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(vector3D.getX())}, 1));
                Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                String str5 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(vector3D.getY() * 100)}, 1));
                Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                appCompatTextView.setText(str4 + "º\n" + str5 + "%");
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Type inference failed for: r2v1, types: [LdY.Ml$j, T] */
            public static final Unit ijL(Ref.ObjectRef objectRef, C2065oU c2065oU, UserParameter userParameter, j jVar, TextView textView, View view) {
                Rl(c2065oU, userParameter, jVar, textView, view);
                objectRef.element = HW.C.xMQ(c2065oU);
                c2065oU.gestureInProgress = true;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void n1(C2065oU c2065oU, UserParameter userParameter, j jVar, TextView textView, View view, View view2) {
                Rl(c2065oU, userParameter, jVar, textView, view);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void ofS(C2065oU c2065oU, UserParameter userParameter, j jVar, TextView textView, View view, View view2) {
                Rl(c2065oU, userParameter, jVar, textView, view);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void qm(j jVar, UserParameter userParameter) {
                yc.Ji jiO = jVar.o();
                if (jiO != null) {
                    jiO.az(userParameter.getName());
                }
            }
        }

        /* JADX INFO: renamed from: f0P.oU$j$n */
        public /* synthetic */ class n {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StaticTextStyle.values().length];
                try {
                    iArr[StaticTextStyle.TIP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StaticTextStyle.SECTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public j(C2065oU c2065oU, List rawParameters, oA.j paramLens, Iy.n localizedStrings, String effectOrShapeId, yc.Ji ji, kgE.fuX iapManager) {
            Intrinsics.checkNotNullParameter(rawParameters, "rawParameters");
            Intrinsics.checkNotNullParameter(paramLens, "paramLens");
            Intrinsics.checkNotNullParameter(localizedStrings, "localizedStrings");
            Intrinsics.checkNotNullParameter(effectOrShapeId, "effectOrShapeId");
            Intrinsics.checkNotNullParameter(iapManager, "iapManager");
            this.xMQ = c2065oU;
            this.f65937n = paramLens;
            this.rl = localizedStrings;
            this.f65938t = effectOrShapeId;
            this.nr = ji;
            this.f65936O = iapManager;
            ArrayList arrayList = new ArrayList();
            for (Object obj : rawParameters) {
                if (UserParameterKt.getHasUI((UserParameter) obj)) {
                    arrayList.add(obj);
                }
            }
            List arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (arrayList2.isEmpty()) {
                    arrayList2.add(obj2);
                } else {
                    if (arrayList2.size() < 4) {
                        UserParameter userParameter = (UserParameter) obj2;
                        if ((((UserParameter) CollectionsKt.last(arrayList2)) instanceof UserParameter.HueDisc) && (userParameter instanceof UserParameter.HueDisc)) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList3.add(arrayList2);
                    arrayList2 = CollectionsKt.mutableListOf(obj2);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList3.add(arrayList2);
            }
            this.J2 = arrayList3;
        }

        public final oA.j HI() {
            return this.f65937n;
        }

        public final View Ik() {
            return this.KN;
        }

        public final void S(View view) {
            this.KN = view;
        }

        public final void WPU(TextView textView) {
            this.Uo = textView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: XQ, reason: merged with bridge method [inline-methods] */
        public C0898j onCreateViewHolder(ViewGroup parent, int i2) {
            ViewBinding viewBindingT;
            Intrinsics.checkNotNullParameter(parent, "parent");
            switch (i2) {
                case 2131558553:
                    viewBindingT = SJ0.kO4.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                case 2131558554:
                    viewBindingT = SJ0.hQ.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                case 2131558555:
                default:
                    throw new UnsupportedOperationException();
                case 2131558556:
                    viewBindingT = SJ0.RGN.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                case 2131558557:
                    viewBindingT = SJ0.B.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                case 2131558558:
                    viewBindingT = SJ0.xuv.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                case 2131558559:
                    viewBindingT = SJ0.c7r.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                case 2131558560:
                    viewBindingT = C1464t.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                case 2131558561:
                    viewBindingT = SJ0.cA.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                case 2131558562:
                    viewBindingT = SJ0.g9.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
            }
            return new C0898j(this, viewBindingT);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C0898j holder, int i2) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            List list = (List) this.J2.get(i2);
            if (CollectionsKt.firstOrNull(list) instanceof UserParameter.HueDisc) {
                holder.Org(list);
            } else if (list.size() > 1) {
                holder.Org(list);
            } else if (list.size() == 1) {
                holder.p5((UserParameter) ((List) this.J2.get(i2)).get(0));
            }
        }

        public final kgE.fuX az() {
            return this.f65936O;
        }

        public final Map ck() {
            Map map;
            SceneElement sceneElementNHg = HW.C.nHg(this.xMQ);
            return (sceneElementNHg == null || (map = (Map) this.f65937n.get(sceneElementNHg)) == null) ? MapsKt.emptyMap() : map;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.J2.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i2) {
            UserParameter userParameter = (UserParameter) CollectionsKt.first((List) this.J2.get(i2));
            if (userParameter instanceof UserParameter.Switch) {
                return 2131558562;
            }
            if (userParameter instanceof UserParameter.Slider) {
                return 2131558558;
            }
            if (userParameter instanceof UserParameter.Spinner) {
                return 2131558559;
            }
            if (userParameter instanceof UserParameter.HueDisc) {
                return 2131558554;
            }
            if (userParameter instanceof UserParameter.HueRing) {
                throw new NotImplementedError(null, 1, null);
            }
            if (userParameter instanceof UserParameter.Color) {
                return 2131558553;
            }
            if (userParameter instanceof UserParameter.Selector) {
                return 2131558557;
            }
            if (userParameter instanceof UserParameter.Point) {
                return 2131558556;
            }
            if (!(userParameter instanceof UserParameter.StaticText)) {
                throw new UnsupportedOperationException();
            }
            int i3 = n.$EnumSwitchMapping$0[((UserParameter.StaticText) userParameter).getStyle().ordinal()];
            if (i3 == 1) {
                return 2131558561;
            }
            if (i3 == 2) {
                return 2131558560;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final yc.Ji o() {
            return this.nr;
        }

        public final String qie() {
            return this.f65938t;
        }

        public final TextView r() {
            return this.Uo;
        }

        public final Iy.n ty() {
            return this.rl;
        }
    }

    /* JADX INFO: renamed from: f0P.oU$n */
    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DataType.values().length];
            try {
                iArr[DataType.FLOAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataType.SOLID_COLOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataType.VEC2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DataType.VEC3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DataType.VEC4.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DataType.QUAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DataType.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DataType.TEXTURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DataType.STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DataType.NONE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Aum(C2065oU c2065oU, String newParamName) {
        Intrinsics.checkNotNullParameter(newParamName, "newParamName");
        if (!Intrinsics.areEqual(c2065oU.paramName, newParamName)) {
            c2065oU.paramName = newParamName;
            j jVar = c2065oU.adapter;
            if (jVar != null) {
                jVar.notifyDataSetChanged();
            }
        }
        return Unit.INSTANCE;
    }

    private final C1456dT vl() {
        return (C1456dT) this.contentBinding.getValue();
    }

    @Override // f0P.Ny
    /* JADX INFO: renamed from: M7, reason: from getter */
    protected int getLayoutResource() {
        return this.layoutResource;
    }

    @Override // yc.Buf
    public boolean n(yc.a motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (motionEvent.n().getActionMasked() == 0) {
            yc.Ji ji = this.shapeEditHelper;
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            ji.HI(jVar.getLiveShapeLockAspect());
            this.shapeEditHelper.ty(jVar.getLiveShapeSizeFromCenter());
        }
        return this.shapeEditHelper.Uo(motionEvent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 100) {
            HW.C.v(this, resultCode, data, false, 4, null);
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // com.alightcreative.app.motion.activities.edit.fragments.n, f0P.sK, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        jB().n(new j.fuX("edit_live_shape", null, 2, null));
    }

    @Override // f0P.Ny, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        LiveShapeRef liveShape;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        nr();
        SceneElement sceneElementNHg = HW.C.nHg(this);
        LiveShape shape = (sceneElementNHg == null || (liveShape = sceneElementNHg.getLiveShape()) == null) ? null : LiveShapeKt.getShape(liveShape);
        Intrinsics.checkNotNull(shape);
        List<UserParameter> parameters = shape.getParameters();
        Z z2 = new PropertyReference1Impl() { // from class: f0P.oU.Z
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getLiveShape();
            }
        };
        Ew ew = new PropertyReference1Impl() { // from class: f0P.oU.Ew
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((LiveShapeRef) obj).getParamValues();
            }
        };
        this.adapter = new j(this, parameters, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), ew.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), z2.getReturnType(), z2), ew), shape.getLocalizedStrings(), shape.getId(), this.shapeEditHelper, v0j());
        vl().rl.setAdapter(this.adapter);
    }

    @Override // f0P.Ny
    protected void piY(SceneElement el) {
        j jVar;
        Intrinsics.checkNotNullParameter(el, "el");
        if (el.getLiveShape().getId() != null) {
            if (this.gestureInProgress || vl().rl.isComputingLayout() || (jVar = this.adapter) == null) {
                return;
            }
            jVar.notifyDataSetChanged();
            return;
        }
        if (this.popped) {
            return;
        }
        this.popped = true;
        if (isAdded()) {
            getParentFragmentManager().Zmq();
        }
    }

    public final kgE.fuX v0j() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    private final oA.j n7b(UserParameter param) {
        switch (n.$EnumSwitchMapping$0[param.getDataType().ordinal()]) {
            case 1:
                o oVar = new PropertyReference1Impl() { // from class: f0P.oU.o
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((SceneElement) obj).getLiveShape();
                    }
                };
                oA.n nVar = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), oVar.getReturnType(), oVar);
                qz qzVar = new PropertyReference1Impl() { // from class: f0P.oU.qz
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((LiveShapeRef) obj).getParamValues();
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), qzVar.getReturnType(), nVar, qzVar);
                String name = param.getName();
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = aCVar.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.Ml ml = new oA.Ml(orCreateKotlinClass, type, aCVar, name);
                Pl pl = new PropertyReference1Impl() { // from class: f0P.oU.Pl
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getFloatValue();
                    }
                };
                return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), pl.getReturnType(), ml, pl);
            case 2:
                return null;
            case 3:
                Xo xo = new PropertyReference1Impl() { // from class: f0P.oU.Xo
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((SceneElement) obj).getLiveShape();
                    }
                };
                oA.n nVar2 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), xo.getReturnType(), xo);
                eO eOVar = new PropertyReference1Impl() { // from class: f0P.oU.eO
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((LiveShapeRef) obj).getParamValues();
                    }
                };
                oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), eOVar.getReturnType(), nVar2, eOVar);
                String name2 = param.getName();
                KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type2 = aCVar2.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type2);
                oA.Ml ml2 = new oA.Ml(orCreateKotlinClass2, type2, aCVar2, name2);
                C2067z c2067z = new PropertyReference1Impl() { // from class: f0P.oU.z
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getColorValue();
                    }
                };
                return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2067z.getReturnType(), ml2, c2067z);
            case 4:
                QJ qj = new PropertyReference1Impl() { // from class: f0P.oU.QJ
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((SceneElement) obj).getLiveShape();
                    }
                };
                oA.n nVar3 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), qj.getReturnType(), qj);
                l3D l3d = new PropertyReference1Impl() { // from class: f0P.oU.l3D
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((LiveShapeRef) obj).getParamValues();
                    }
                };
                oA.aC aCVar3 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), l3d.getReturnType(), nVar3, l3d);
                String name3 = param.getName();
                KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type3 = aCVar3.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type3);
                oA.Ml ml3 = new oA.Ml(orCreateKotlinClass3, type3, aCVar3, name3);
                C2066c c2066c = new PropertyReference1Impl() { // from class: f0P.oU.c
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getVec2DValue();
                    }
                };
                return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2066c.getReturnType(), ml3, c2066c);
            case 5:
                w6 w6Var = new PropertyReference1Impl() { // from class: f0P.oU.w6
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((SceneElement) obj).getLiveShape();
                    }
                };
                oA.n nVar4 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), w6Var.getReturnType(), w6Var);
                Ml ml4 = new PropertyReference1Impl() { // from class: f0P.oU.Ml
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((LiveShapeRef) obj).getParamValues();
                    }
                };
                oA.aC aCVar4 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), ml4.getReturnType(), nVar4, ml4);
                String name4 = param.getName();
                KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type4 = aCVar4.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type4);
                oA.Ml ml5 = new oA.Ml(orCreateKotlinClass4, type4, aCVar4, name4);
                I28 i28 = new PropertyReference1Impl() { // from class: f0P.oU.I28
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getVec3DValue();
                    }
                };
                return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), i28.getReturnType(), ml5, i28);
            case 6:
                Wre wre = new PropertyReference1Impl() { // from class: f0P.oU.Wre
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((SceneElement) obj).getLiveShape();
                    }
                };
                oA.n nVar5 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), wre.getReturnType(), wre);
                CN3 cn3 = new PropertyReference1Impl() { // from class: f0P.oU.CN3
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((LiveShapeRef) obj).getParamValues();
                    }
                };
                oA.aC aCVar5 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), cn3.getReturnType(), nVar5, cn3);
                String name5 = param.getName();
                KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type5 = aCVar5.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type5);
                oA.Ml ml6 = new oA.Ml(orCreateKotlinClass5, type5, aCVar5, name5);
                fuX fux = new PropertyReference1Impl() { // from class: f0P.oU.fuX
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getVec4DValue();
                    }
                };
                return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), fux.getReturnType(), ml6, fux);
            case 7:
                Dsr dsr = new PropertyReference1Impl() { // from class: f0P.oU.Dsr
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((SceneElement) obj).getLiveShape();
                    }
                };
                oA.n nVar6 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), dsr.getReturnType(), dsr);
                aC aCVar6 = new PropertyReference1Impl() { // from class: f0P.oU.aC
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((LiveShapeRef) obj).getParamValues();
                    }
                };
                oA.aC aCVar7 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), aCVar6.getReturnType(), nVar6, aCVar6);
                String name6 = param.getName();
                KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type6 = aCVar7.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type6);
                oA.Ml ml7 = new oA.Ml(orCreateKotlinClass6, type6, aCVar7, name6);
                C c2 = new PropertyReference1Impl() { // from class: f0P.oU.C
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getQuatValue();
                    }
                };
                return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2.getReturnType(), ml7, c2);
            case 8:
            case 9:
            case 10:
            case 11:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1456dT nO(C2065oU c2065oU) {
        C1456dT c1456dTN = C1456dT.n(c2065oU.hRu().getChildAt(0));
        Intrinsics.checkNotNullExpressionValue(c1456dTN, "bind(...)");
        return c1456dTN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Keyable o9(UserParameter param) {
        oA.j jVarN7b;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null || (jVarN7b = n7b(param)) == null) {
            return null;
        }
        return (Keyable) jVarN7b.get(sceneElementNHg);
    }

    @Override // f0P.NO
    /* JADX INFO: renamed from: lLA */
    protected List getKeyableSettings() {
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null) {
            return CollectionsKt.emptyList();
        }
        if (sceneElementNHg.getLiveShape().getId() == null) {
            return CollectionsKt.emptyList();
        }
        LiveShape shape = LiveShapeKt.getShape(sceneElementNHg.getLiveShape());
        if (shape == null) {
            return CollectionsKt.emptyList();
        }
        List<UserParameter> parameters = shape.getParameters();
        ArrayList<UserParameter> arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (Intrinsics.areEqual(((UserParameter) obj).getName(), this.paramName)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (UserParameter userParameter : arrayList) {
            g9s g9sVar = new PropertyReference1Impl() { // from class: f0P.oU.g9s
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj2) {
                    return ((SceneElement) obj2).getLiveShape();
                }
            };
            oA.n nVar = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), g9sVar.getReturnType(), g9sVar);
            afx afxVar = new PropertyReference1Impl() { // from class: f0P.oU.afx
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj2) {
                    return ((LiveShapeRef) obj2).getParamValues();
                }
            };
            oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), afxVar.getReturnType(), nVar, afxVar);
            String name = userParameter.getName();
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
            KType type = aCVar.nr().getArguments().get(0).getType();
            Intrinsics.checkNotNull(type);
            oA.Ml ml = new oA.Ml(orCreateKotlinClass, type, aCVar, name);
            F8 f8 = null;
            switch (n.$EnumSwitchMapping$0[userParameter.getDataType().ordinal()]) {
                case 1:
                    AnimatorOf animatorOf = AnimatorOf.Float;
                    s4 s4Var = new PropertyReference1Impl() { // from class: f0P.oU.s4
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableUserParameterValue) obj2).getFloatValue();
                        }
                    };
                    f8 = new F8(animatorOf, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), s4Var.getReturnType(), ml, s4Var), null, 4, null);
                    break;
                case 2:
                case 8:
                case 9:
                case 10:
                case 11:
                    break;
                case 3:
                    AnimatorOf animatorOf2 = AnimatorOf.Color;
                    UGc uGc = new PropertyReference1Impl() { // from class: f0P.oU.UGc
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableUserParameterValue) obj2).getColorValue();
                        }
                    };
                    f8 = new F8(animatorOf2, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), uGc.getReturnType(), ml, uGc), null, 4, null);
                    break;
                case 4:
                    AnimatorOf animatorOf3 = AnimatorOf.Location;
                    Q q2 = new PropertyReference1Impl() { // from class: f0P.oU.Q
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableUserParameterValue) obj2).getVec2DValue();
                        }
                    };
                    f8 = new F8(animatorOf3, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), q2.getReturnType(), ml, q2), null, 4, null);
                    break;
                case 5:
                    AnimatorOf animatorOf4 = AnimatorOf.Location;
                    r rVar = new PropertyReference1Impl() { // from class: f0P.oU.r
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableUserParameterValue) obj2).getVec3DValue();
                        }
                    };
                    f8 = new F8(animatorOf4, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), rVar.getReturnType(), ml, rVar), null, 4, null);
                    break;
                case 6:
                    AnimatorOf animatorOf5 = AnimatorOf.Location;
                    SPz sPz = new PropertyReference1Impl() { // from class: f0P.oU.SPz
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableUserParameterValue) obj2).getVec4DValue();
                        }
                    };
                    f8 = new F8(animatorOf5, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sPz.getReturnType(), ml, sPz), null, 4, null);
                    break;
                case 7:
                    AnimatorOf animatorOf6 = AnimatorOf.Orientation;
                    ci ciVar = new PropertyReference1Impl() { // from class: f0P.oU.ci
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableUserParameterValue) obj2).getQuatValue();
                        }
                    };
                    f8 = new F8(animatorOf6, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), ciVar.getReturnType(), ml, ciVar), null, 4, null);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (f8 != null) {
                arrayList2.add(f8);
            }
        }
        return arrayList2;
    }

    @Override // yc.QhI
    public int t() {
        return 2131362617;
    }
}
