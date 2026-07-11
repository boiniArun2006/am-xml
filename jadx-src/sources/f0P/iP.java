package f0P;

import QmE.j;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.activities.EditActivity;
import com.alightcreative.app.motion.persist.j;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.PrecomposeType;
import com.alightcreative.app.motion.scene.ReTimingMethod;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.widget.SettingEditText;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInObject;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import z8.AbstractC2487Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 a2\u00020\u0001:\u0001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010!\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\u0003J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\u0003J\u000f\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010\u0003R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010B\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000f0C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER(\u0010J\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u000f0G0C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010ER\"\u0010O\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\u00060K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010NR\"\u0010R\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u00060K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010NR\"\u0010T\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u00060K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010NR\u0016\u0010W\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010-R\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010]\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010-R\u0014\u0010`\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006c"}, d2 = {"Lf0P/iP;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "v0j", "", "title", "msg", "uG", "(Ljava/lang/String;Ljava/lang/String;)V", "Lp6", "oldAspect", "Aum", "(Ljava/lang/String;)V", "", "res", CmcdData.STREAMING_FORMAT_SS, "(I)V", "n7b", "Landroid/view/View;", "view", "y", "(Landroid/view/View;)V", "nO", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onPause", "onResume", "LSJ0/Kk1;", "o", "LSJ0/Kk1;", "_binding", "LkgE/fuX;", "Z", "LkgE/fuX;", "n1", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LQmE/iF;", "S", "LQmE/iF;", "ul", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "", "g", "F", "customResolutionWidthRatio", "E2", "Ljava/lang/String;", "projectAspect", "", "e", "Ljava/util/List;", "resolutionIntList", "Lkotlin/Pair;", "Lcom/alightcreative/app/motion/persist/j$n;", "X", "bgColorOptions", "", "Lcom/alightcreative/app/motion/scene/PrecomposeType;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/util/Map;", "precomposeOptions", "Lcom/alightcreative/app/motion/scene/ReTimingMethod;", "N", "retimingOptions", "v", "groupRetimingOptions", "", "Xw", "isEditingNestedScene", "Ljava/lang/Runnable;", "jB", "Ljava/lang/Runnable;", "updateEditTimeRunnable", "U", "isAnimRunning", "eWT", "()LSJ0/Kk1;", "binding", "P5", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProjectSettingsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectSettingsFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/ProjectSettingsFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtil.kt\ncom/alightcreative/ext/ListUtilKt\n+ 4 ViewUtils.kt\ncom/alightcreative/ext/ViewUtilsKt\n*L\n1#1,702:1\n1863#2,2:703\n1863#2,2:705\n1557#2:722\n1628#2,3:723\n1863#2,2:726\n1557#2:728\n1628#2,3:729\n1557#2:732\n1628#2,3:733\n1557#2:736\n1628#2,3:737\n1557#2:740\n1628#2,3:741\n1863#2:745\n1864#2:747\n1863#2:749\n1864#2:751\n230#2,2:752\n230#2,2:754\n1863#2,2:756\n1863#2,2:758\n1863#2,2:760\n1863#2,2:762\n1863#2,2:764\n101#3:707\n101#3:708\n101#3:709\n101#3:710\n109#4,11:711\n33#4:744\n25#4:746\n33#4:748\n25#4:750\n*S KotlinDebug\n*F\n+ 1 ProjectSettingsFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/ProjectSettingsFragment\n*L\n151#1:703,2\n154#1:705,2\n235#1:722\n235#1:723,3\n246#1:726,2\n554#1:728\n554#1:729,3\n555#1:732\n555#1:733,3\n567#1:736\n567#1:737,3\n586#1:740\n586#1:741,3\n588#1:745\n588#1:747\n589#1:749\n589#1:751\n595#1:752,2\n614#1:754,2\n172#1:756,2\n241#1:758,2\n250#1:760,2\n316#1:762,2\n444#1:764,2\n164#1:707\n165#1:708\n166#1:709\n167#1:710\n186#1:711,11\n588#1:744\n588#1:746\n589#1:748\n589#1:750\n*E\n"})
public final class iP extends cX {

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private Map retimingOptions;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private Map precomposeOptions;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private boolean isAnimRunning;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private List bgColorOptions;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private boolean isEditingNestedScene;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List resolutionIntList;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private SJ0.Kk1 _binding;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Map groupRetimingOptions;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int M7 = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float customResolutionWidthRatio = 1.0f;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private String projectAspect = "";

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final Runnable updateEditTimeRunnable = new Runnable() { // from class: f0P.RS
        @Override // java.lang.Runnable
        public final void run() {
            iP.o9(this.f64656n);
        }
    };

    public static final class I28 implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        I28() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            iP.this.isAnimRunning = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            iP.this.isAnimRunning = false;
            if (iP.this.isAdded()) {
                iP.this.getParentFragmentManager().Zmq();
            }
        }
    }

    public static final class Ml implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        }

        Ml() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s2) {
            Integer intOrNull;
            Intrinsics.checkNotNullParameter(s2, "s");
            SceneHolder sceneHolderE = HW.C.e(iP.this);
            if (sceneHolderE == null || sceneHolderE.getRootScene() == null || !iP.this.eWT().s7N.hasFocus() || (intOrNull = StringsKt.toIntOrNull(s2.toString())) == null || intOrNull.intValue() <= 0 || !com.alightcreative.app.motion.persist.j.INSTANCE.getNewProjectCustomSizeLink()) {
                return;
            }
            iP.this.eWT().p5.setText(String.valueOf(MathKt.roundToInt(intOrNull.intValue() * iP.this.customResolutionWidthRatio)));
        }
    }

    public static final class Wre implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        Wre() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            iP.this.isAnimRunning = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            iP.this.isAnimRunning = false;
        }
    }

    /* JADX INFO: renamed from: f0P.iP$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ iP rl(Companion companion, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            return companion.n(z2);
        }

        public final iP n(boolean z2) {
            iP iPVar = new iP();
            Bundle bundle = new Bundle();
            bundle.putBoolean("isEditingNestedScene", z2);
            iPVar.setArguments(bundle);
            return iPVar;
        }
    }

    public static final class n implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ View f65648n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ iP f65649t;

        public n(View view, iP iPVar) {
            this.f65648n = view;
            this.f65649t = iPVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f65648n.getMeasuredWidth() <= 0 || this.f65648n.getMeasuredHeight() <= 0) {
                return;
            }
            this.f65648n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            iP iPVar = this.f65649t;
            ConstraintLayout projectSettingsPanel = iPVar.eWT().rV9;
            Intrinsics.checkNotNullExpressionValue(projectSettingsPanel, "projectSettingsPanel");
            iPVar.nO(projectSettingsPanel);
        }
    }

    public static final class w6 implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        }

        w6() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s2) {
            Integer intOrNull;
            Intrinsics.checkNotNullParameter(s2, "s");
            SceneHolder sceneHolderE = HW.C.e(iP.this);
            if (sceneHolderE == null || sceneHolderE.getRootScene() == null || !iP.this.eWT().p5.hasFocus() || (intOrNull = StringsKt.toIntOrNull(s2.toString())) == null || intOrNull.intValue() <= 0 || !com.alightcreative.app.motion.persist.j.INSTANCE.getNewProjectCustomSizeLink()) {
                return;
            }
            iP.this.eWT().s7N.setText(String.valueOf(MathKt.roundToInt(intOrNull.intValue() / iP.this.customResolutionWidthRatio)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jk(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VwL(iP iPVar, TextView textView, int i2, KeyEvent keyEvent) {
        if (i2 != 6) {
            return false;
        }
        textView.clearFocus();
        iPVar.Lp6();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mI(iP iPVar, TextView textView, int i2, KeyEvent keyEvent) {
        if (i2 != 6) {
            return false;
        }
        textView.clearFocus();
        iPVar.Lp6();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ER(iP iPVar) {
        lLA(iPVar, 180);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EWS(iP iPVar) {
        lLA(iPVar, 1080);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(iP iPVar, View view) {
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        jVar.setNewProjectCustomSizeLink(!jVar.getNewProjectCustomSizeLink());
        iPVar.eWT().f9180S.setActivated(jVar.getNewProjectCustomSizeLink());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GD(iP iPVar) {
        lLA(iPVar, 1440);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HBN(iP iPVar, TextView textView, int i2, KeyEvent keyEvent) {
        Scene scene;
        if (i2 == 6) {
            textView.clearFocus();
            SceneHolder sceneHolderE = HW.C.e(iPVar);
            if (sceneHolderE != null && (scene = sceneHolderE.getScene()) != null) {
                Integer intOrNull = StringsKt.toIntOrNull(String.valueOf(iPVar.eWT().iF.getText()));
                int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
                if (iIntValue <= 0 || iIntValue > 99999) {
                    iPVar.eWT().iF.setText(String.valueOf(scene.getHeight()));
                    String string = iPVar.getString(2132019351);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String string2 = iPVar.getString(2132019350);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    iPVar.uG(string, string2);
                } else {
                    SceneHolder sceneHolderE2 = HW.C.e(iPVar);
                    if (sceneHolderE2 != null) {
                        sceneHolderE2.setScene(Scene.copy$default(scene, null, 0, 0, iIntValue, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048567, null));
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HV(iP iPVar) {
        lLA(iPVar, 2160);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit How(iP iPVar) {
        lLA(iPVar, 360);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(iP iPVar) {
        lLA(iPVar, 540);
        return Unit.INSTANCE;
    }

    private final void Lp6() {
        Scene rootScene;
        Scene rootScene2;
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE == null || (rootScene = sceneHolderE.getRootScene()) == null) {
            return;
        }
        Integer intOrNull = StringsKt.toIntOrNull(String.valueOf(eWT().s7N.getText()));
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
        Integer intOrNull2 = StringsKt.toIntOrNull(String.valueOf(eWT().p5.getText()));
        int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
        if (iIntValue2 >= 32 && iIntValue >= 32 && iIntValue2 <= 4096 && iIntValue <= 4096) {
            SceneHolder sceneHolderE2 = HW.C.e(this);
            if (sceneHolderE2 != null) {
                sceneHolderE2.setRootScene(Scene.copy$default(rootScene, null, 0, iIntValue2, iIntValue, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048563, null));
                return;
            }
            return;
        }
        eWT().p5.setText(String.valueOf(rootScene.getWidth()));
        eWT().s7N.setText(String.valueOf(rootScene.getHeight()));
        SceneHolder sceneHolderE3 = HW.C.e(this);
        String string = getString(((sceneHolderE3 == null || (rootScene2 = sceneHolderE3.getRootScene()) == null) ? null : rootScene2.getType()) == SceneType.ELEMENT ? 2132018943 : 2132019980);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(2132019970);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        uG(string, string2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Org(iP iPVar) {
        lLA(iPVar, 2160);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Po6(iP iPVar) {
        lLA(iPVar, 1440);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Qu(iP iPVar, TextView textView, int i2, KeyEvent keyEvent) {
        Scene scene;
        if (i2 == 6) {
            textView.clearFocus();
            SceneHolder sceneHolderE = HW.C.e(iPVar);
            if (sceneHolderE != null && (scene = sceneHolderE.getScene()) != null) {
                Integer intOrNull = StringsKt.toIntOrNull(String.valueOf(iPVar.eWT().f9178N.getText()));
                int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
                if (iIntValue <= 0 || iIntValue > 99999) {
                    iPVar.eWT().f9178N.setText(String.valueOf(scene.getWidth()));
                    String string = iPVar.getString(2132019351);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String string2 = iPVar.getString(2132019350);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    iPVar.uG(string, string2);
                } else {
                    SceneHolder sceneHolderE2 = HW.C.e(iPVar);
                    if (sceneHolderE2 != null) {
                        sceneHolderE2.setScene(Scene.copy$default(scene, null, 0, iIntValue, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048571, null));
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Rl(iP iPVar, KC.j jVar, List list, View view) {
        String str = iPVar.projectAspect;
        iPVar.projectAspect = jVar.nr() + ":" + jVar.rl();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((KC.j) it.next()).t().setActivated(false);
        }
        jVar.t().setActivated(true);
        iPVar.Aum(str);
        iPVar.n7b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UhV(iP iPVar) {
        lLA(iPVar, 720);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Zn(iP iPVar, View view, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        iPVar.isAnimRunning = true;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setTop(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SJ0.Kk1 eWT() {
        SJ0.Kk1 kk1 = this._binding;
        Intrinsics.checkNotNull(kk1);
        return kk1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hRu(iP iPVar) {
        lLA(iPVar, 1080);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(iP iPVar) {
        lLA(iPVar, 720);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void n7b() {
        Scene scene;
        Scene rootScene;
        List<Pair> list = null;
        Map map = null;
        if (this.isEditingNestedScene) {
            SceneHolder sceneHolderE = HW.C.e(this);
            if (sceneHolderE == null || (scene = sceneHolderE.getScene()) == null) {
                return;
            }
            eWT().f9178N.setText(String.valueOf(scene.getWidth()));
            eWT().iF.setText(String.valueOf(scene.getHeight()));
            TextView textView = eWT().f9181T;
            Map map2 = this.groupRetimingOptions;
            if (map2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("groupRetimingOptions");
                map2 = null;
            }
            textView.setText((CharSequence) map2.get(scene.getReTimingMethod()));
            TextView textView2 = eWT().f9185e;
            Map map3 = this.precomposeOptions;
            if (map3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("precomposeOptions");
                map3 = null;
            }
            textView2.setText((CharSequence) map3.get(scene.getPrecompose()));
            List list2 = this.bgColorOptions;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bgColorOptions");
            } else {
                list = list2;
            }
            for (Pair pair : list) {
                if (ColorKt.toInt(scene.getBackground()) == ColorKt.toInt(com.alightcreative.app.motion.persist.n.O((j.n) pair.component1()))) {
                    j.n nVar = (j.n) pair.getFirst();
                    eWT().f9186g.setText(getString(com.alightcreative.app.motion.persist.n.nr(nVar)));
                    eWT().te.setImageBitmap(ColorKt.makeSwatch$default(com.alightcreative.app.motion.persist.n.O(nVar), 60, 60, 0.0f, 8.0f, 3, 1140850688, 4, null));
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        SceneHolder sceneHolderE2 = HW.C.e(this);
        if (sceneHolderE2 == null || (rootScene = sceneHolderE2.getRootScene()) == null) {
            return;
        }
        List listSplit$default = StringsKt.split$default((CharSequence) this.projectAspect, new String[]{":"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
            arrayList.add(Integer.valueOf(intOrNull != null ? intOrNull.intValue() : -1));
        }
        Object[] objArr = ((Number) arrayList.get(0)).intValue() <= 0 || ((Number) arrayList.get(1)).intValue() <= 0;
        Iterator it2 = CollectionsKt.listOf((Object[]) new View[]{eWT().p5, eWT().s7N, eWT().f9180S}).iterator();
        while (true) {
            int i2 = 4;
            if (!it2.hasNext()) {
                break;
            }
            View view = (View) it2.next();
            if (objArr != false) {
                i2 = 0;
            }
            view.setVisibility(i2);
        }
        Iterator it3 = CollectionsKt.listOf(eWT().jB).iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).setVisibility(objArr == false ? 0 : 4);
        }
        eWT().p5.setText(String.valueOf(rootScene.getWidth()));
        eWT().s7N.setText(String.valueOf(rootScene.getHeight()));
        List<Pair> list3 = this.bgColorOptions;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bgColorOptions");
            list3 = null;
        }
        for (Pair pair2 : list3) {
            if (ColorKt.toInt(rootScene.getBackground()) == ColorKt.toInt(com.alightcreative.app.motion.persist.n.O((j.n) pair2.component1()))) {
                j.n nVar2 = (j.n) pair2.getFirst();
                eWT().jB.setText(Math.min(rootScene.getWidth(), rootScene.getHeight()) + TtmlNode.TAG_P);
                eWT().ViF.setText((rootScene.getFramesPerHundredSeconds() / 100) + " fps");
                eWT().f9188o.setText(getString(com.alightcreative.app.motion.persist.n.nr(nVar2)));
                eWT().f9184Z.setImageBitmap(ColorKt.makeSwatch$default(com.alightcreative.app.motion.persist.n.O(nVar2), 60, 60, 0.0f, 8.0f, 3, 1140850688, 4, null));
                eWT().f9180S.setActivated(com.alightcreative.app.motion.persist.j.INSTANCE.getNewProjectCustomSizeLink());
                TextView textView3 = eWT().P5;
                Map map4 = this.retimingOptions;
                if (map4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("retimingOptions");
                    map4 = null;
                }
                textView3.setText((CharSequence) map4.get(rootScene.getReTimingMethod()));
                TextView textView4 = eWT().f9191v;
                Map map5 = this.precomposeOptions;
                if (map5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("precomposeOptions");
                } else {
                    map = map5;
                }
                textView4.setText((CharSequence) map.get(rootScene.getPrecompose()));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nO(final View view) {
        if (this.isAnimRunning) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(view.getBottom(), view.getTop());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f0P.lvN
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                iP.vl(this.f65766n, view, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new Wre());
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qm(iP iPVar, KC.j jVar, List list, View view) {
        String str = iPVar.projectAspect;
        iPVar.projectAspect = jVar.nr() + ":" + jVar.rl();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((KC.j) it.next()).t().setActivated(false);
        }
        jVar.t().setActivated(true);
        iPVar.Aum(str);
        iPVar.n7b();
    }

    private final void s(int res) {
        Scene rootScene;
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE == null || (rootScene = sceneHolderE.getRootScene()) == null) {
            return;
        }
        List listSplit$default = StringsKt.split$default((CharSequence) this.projectAspect, new String[]{":"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
            arrayList.add(Integer.valueOf(intOrNull != null ? intOrNull.intValue() : -1));
        }
        int iIntValue = ((Number) arrayList.get(0)).intValue();
        int iIntValue2 = ((Number) arrayList.get(1)).intValue();
        Pair pair = iIntValue < iIntValue2 ? TuplesKt.to(Integer.valueOf(res), Integer.valueOf((iIntValue2 * res) / iIntValue)) : TuplesKt.to(Integer.valueOf((iIntValue * res) / iIntValue2), Integer.valueOf(res));
        int iIntValue3 = ((Number) pair.component1()).intValue();
        int iIntValue4 = ((Number) pair.component2()).intValue();
        if (res < com.alightcreative.app.motion.persist.j.INSTANCE.getMaxResWithVideo() || rootScene.getFramesPerHundredSeconds() <= 3500) {
            SceneHolder sceneHolderE2 = HW.C.e(this);
            if (sceneHolderE2 != null) {
                sceneHolderE2.setRootScene(Scene.copy$default(rootScene, null, 0, iIntValue3, iIntValue4, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048563, null));
            }
        } else {
            SceneHolder sceneHolderE3 = HW.C.e(this);
            if (sceneHolderE3 != null) {
                sceneHolderE3.setRootScene(Scene.copy$default(rootScene, null, 0, iIntValue3, iIntValue4, 0, 0, null, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048435, null));
            }
        }
        n7b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tUK(iP iPVar) {
        lLA(iPVar, 270);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vl(iP iPVar, View view, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        iPVar.isAnimRunning = true;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setTop(((Integer) animatedValue).intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void y(final View view) {
        Scene scene;
        String str;
        Scene rootScene;
        if (this.isAnimRunning) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(view.getTop(), view.getBottom());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f0P.bkl
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                iP.Zn(this.f65396n, view, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new I28());
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.start();
        Map map = null;
        if (this.isEditingNestedScene) {
            SceneHolder sceneHolderE = HW.C.e(this);
            if (sceneHolderE != null) {
                scene = sceneHolderE.getScene();
            }
        } else {
            SceneHolder sceneHolderE2 = HW.C.e(this);
            scene = sceneHolderE2 != null ? sceneHolderE2.getRootScene() : null;
        }
        if (scene == null) {
            return;
        }
        QmE.iF iFVarUl = ul();
        Bundle bundle = new Bundle();
        if (this.isEditingNestedScene) {
            str = "group";
        } else {
            SceneHolder sceneHolderE3 = HW.C.e(this);
            str = ((sceneHolderE3 == null || (rootScene = sceneHolderE3.getRootScene()) == null) ? null : rootScene.getType()) == SceneType.ELEMENT ? "element" : "project";
        }
        bundle.putString("type", str);
        Map map2 = this.precomposeOptions;
        if (map2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("precomposeOptions");
        } else {
            map = map2;
        }
        bundle.putString("precompose", (String) map.get(scene.getPrecompose()));
        bundle.putString("retiming", (String) MapsKt.mapOf(TuplesKt.to(ReTimingMethod.OFF, "off"), TuplesKt.to(ReTimingMethod.FREEZE, V8ValueBuiltInObject.FUNCTION_FREEZE), TuplesKt.to(ReTimingMethod.STRETCH, "stretch"), TuplesKt.to(ReTimingMethod.LOOP, "loop"), TuplesKt.to(ReTimingMethod.LOOP_STRETCH, "loop_stretch"), TuplesKt.to(ReTimingMethod.BLANK, "blank")).get(scene.getReTimingMethod()));
        Unit unit = Unit.INSTANCE;
        iFVarUl.n(new j.fuX("comp_settings", bundle));
    }

    public final kgE.fuX n1() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.isEditingNestedScene = arguments != null ? arguments.getBoolean("isEditingNestedScene") : false;
        ReTimingMethod reTimingMethod = ReTimingMethod.FREEZE;
        Pair pair = TuplesKt.to(reTimingMethod, getString(2132020056));
        ReTimingMethod reTimingMethod2 = ReTimingMethod.STRETCH;
        Pair pair2 = TuplesKt.to(reTimingMethod2, getString(2132020059));
        ReTimingMethod reTimingMethod3 = ReTimingMethod.LOOP;
        Pair pair3 = TuplesKt.to(reTimingMethod3, getString(2132020057));
        ReTimingMethod reTimingMethod4 = ReTimingMethod.LOOP_STRETCH;
        Pair pair4 = TuplesKt.to(reTimingMethod4, getString(2132020058));
        ReTimingMethod reTimingMethod5 = ReTimingMethod.BLANK;
        this.retimingOptions = MapsKt.mapOf(pair, pair2, pair3, pair4, TuplesKt.to(reTimingMethod5, getString(2132020055)));
        this.bgColorOptions = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(j.n.f45862n, 2132017311), TuplesKt.to(j.n.f45865t, 2132017316), TuplesKt.to(j.n.f45859O, 2132017314), TuplesKt.to(j.n.J2, 2132017313), TuplesKt.to(j.n.f45864r, 2132017312), TuplesKt.to(j.n.f45863o, 2132017315)});
        this.groupRetimingOptions = MapsKt.mapOf(TuplesKt.to(ReTimingMethod.OFF, getString(2132019766)), TuplesKt.to(reTimingMethod, getString(2132020056)), TuplesKt.to(reTimingMethod2, getString(2132020059)), TuplesKt.to(reTimingMethod3, getString(2132020057)), TuplesKt.to(reTimingMethod4, getString(2132020058)), TuplesKt.to(reTimingMethod5, getString(2132020055)));
        this.precomposeOptions = MapsKt.mapOf(TuplesKt.to(PrecomposeType.DYNAMIC, getString(2132019884)), TuplesKt.to(PrecomposeType.FIXED, getString(2132019885)));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = SJ0.Kk1.t(inflater, container, false);
        ConstraintLayout constraintLayoutRl = eWT().getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutRl, "getRoot(...)");
        return constraintLayoutRl;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        char c2;
        int dimensionPixelSize;
        Scene rootScene;
        Scene rootScene2;
        Scene rootScene3;
        Scene rootScene4;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ConstraintLayout constraintLayout = eWT().rV9;
        SceneType type = null;
        if (this.isEditingNestedScene) {
            c2 = '\b';
            dimensionPixelSize = getResources().getDimensionPixelSize(2131166288);
        } else {
            c2 = '\b';
            SceneHolder sceneHolderE = HW.C.e(this);
            dimensionPixelSize = ((sceneHolderE == null || (rootScene = sceneHolderE.getRootScene()) == null) ? null : rootScene.getType()) == SceneType.ELEMENT ? getResources().getDimensionPixelSize(2131166287) : getResources().getDimensionPixelSize(2131166289);
        }
        constraintLayout.setMaxHeight(dimensionPixelSize);
        TextView textView = eWT().nHg;
        SettingEditText settingEditText = eWT().f9178N;
        TextView textView2 = eWT().fD;
        SettingEditText settingEditText2 = eWT().iF;
        TextView textView3 = eWT().E2;
        TextView textView4 = eWT().f9185e;
        int i2 = 0;
        TextView textView5 = eWT().nY;
        int i3 = 10;
        TextView textView6 = eWT().f9186g;
        ImageView imageView = eWT().te;
        TextView textView7 = eWT().f9183X;
        TextView textView8 = eWT().f9181T;
        View[] viewArr = new View[11];
        viewArr[0] = textView;
        viewArr[1] = settingEditText;
        viewArr[2] = textView2;
        viewArr[3] = settingEditText2;
        viewArr[4] = textView3;
        viewArr[5] = textView4;
        viewArr[6] = textView5;
        viewArr[7] = textView6;
        viewArr[c2] = imageView;
        viewArr[9] = textView7;
        viewArr[10] = textView8;
        List listListOf = CollectionsKt.listOf((Object[]) viewArr);
        LinearLayout linearLayout = eWT().bzg;
        TextView textView9 = eWT().Xw;
        TextView textView10 = eWT().jB;
        SettingEditText settingEditText3 = eWT().p5;
        ImageButton imageButton = eWT().f9180S;
        SettingEditText settingEditText4 = eWT().s7N;
        TextView textView11 = eWT().aYN;
        TextView textView12 = eWT().ViF;
        TextView textView13 = eWT().f9189r;
        TextView textView14 = eWT().f9188o;
        ImageView imageView2 = eWT().f9184Z;
        TextView textView15 = eWT().wTp;
        TextView textView16 = eWT().f9191v;
        TextView textView17 = eWT().f9182U;
        TextView textView18 = eWT().P5;
        TextView textView19 = eWT().M7;
        View[] viewArr2 = new View[16];
        viewArr2[0] = linearLayout;
        viewArr2[1] = textView9;
        viewArr2[2] = textView10;
        viewArr2[3] = settingEditText3;
        viewArr2[4] = imageButton;
        viewArr2[5] = settingEditText4;
        viewArr2[6] = textView11;
        viewArr2[7] = textView12;
        viewArr2[c2] = textView13;
        viewArr2[9] = textView14;
        viewArr2[10] = imageView2;
        viewArr2[11] = textView15;
        viewArr2[12] = textView16;
        viewArr2[13] = textView17;
        viewArr2[14] = textView18;
        viewArr2[15] = textView19;
        List listListOf2 = CollectionsKt.listOf((Object[]) viewArr2);
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(this.isEditingNestedScene ? 0 : 4);
        }
        Iterator it2 = listListOf2.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setVisibility(this.isEditingNestedScene ? 4 : 0);
        }
        List listListOf3 = CollectionsKt.listOf((Object[]) new Integer[]{540, 360, 270, 180});
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (jVar.getMaxLayers2160() >= 0) {
            listListOf3 = CollectionsKt.plus((Collection<? extends int>) listListOf3, 2160);
        }
        if (jVar.getMaxLayers1440() >= 0) {
            listListOf3 = CollectionsKt.plus((Collection<? extends int>) listListOf3, 1440);
        }
        if (jVar.getMaxLayers1080() >= 0) {
            listListOf3 = CollectionsKt.plus((Collection<? extends int>) listListOf3, 1080);
        }
        if (jVar.getMaxLayers720() >= 0) {
            listListOf3 = CollectionsKt.plus((Collection<? extends int>) listListOf3, 720);
        }
        this.resolutionIntList = listListOf3;
        eWT().XQ.setOnClickListener(new View.OnClickListener() { // from class: f0P.NG
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                iP.xVH(this.f64507n, view2);
            }
        });
        eWT().WPU.setOnClickListener(new View.OnClickListener() { // from class: f0P.b8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                iP.EF(this.f65371n, view2);
            }
        });
        eWT().rV9.setOnClickListener(new View.OnClickListener() { // from class: f0P.Yo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                iP.Jk(view2);
            }
        });
        ConstraintLayout constraintLayout2 = eWT().rV9;
        constraintLayout2.getViewTreeObserver().addOnGlobalLayoutListener(new n(constraintLayout2, this));
        if (this.isEditingNestedScene) {
            eWT().f9186g.setOnClickListener(new View.OnClickListener() { // from class: f0P.hj8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    iP.f(this.f65623n, view2);
                }
            });
            eWT().f9178N.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: f0P.Ok
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView20, int i5, KeyEvent keyEvent) {
                    return iP.Qu(this.f64569n, textView20, i5, keyEvent);
                }
            });
            eWT().iF.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: f0P.su
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView20, int i5, KeyEvent keyEvent) {
                    return iP.HBN(this.f66179n, textView20, i5, keyEvent);
                }
            });
            eWT().f9185e.setOnClickListener(new View.OnClickListener() { // from class: f0P.TZ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    iP.UF(this.f64746n, view2);
                }
            });
            eWT().f9181T.setOnClickListener(new View.OnClickListener() { // from class: f0P.QRk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    iP.Zmq(this.f64634n, view2);
                }
            });
        } else {
            SceneHolder sceneHolderE2 = HW.C.e(this);
            int height = (sceneHolderE2 == null || (rootScene4 = sceneHolderE2.getRootScene()) == null) ? 0 : rootScene4.getHeight();
            SceneHolder sceneHolderE3 = HW.C.e(this);
            int width = (sceneHolderE3 == null || (rootScene3 = sceneHolderE3.getRootScene()) == null) ? 0 : rootScene3.getWidth();
            int iMin = Math.min(height, width);
            List list = this.resolutionIntList;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resolutionIntList");
                list = null;
            }
            boolean zContains = list.contains(Integer.valueOf(iMin));
            String str = "-1:-1";
            if (zContains) {
                if ((height * 16) / 9 == width) {
                    str = "16:9";
                } else if ((height * 9) / 16 == width) {
                    str = "9:16";
                } else {
                    int i5 = height * 4;
                    if (i5 / 3 == width) {
                        str = "4:3";
                    } else if (width == height) {
                        str = "1:1";
                    } else if (i5 / 5 == width) {
                        str = "4:5";
                    }
                }
            }
            this.projectAspect = str;
            ImageButton aspect16x9 = eWT().rl;
            Intrinsics.checkNotNullExpressionValue(aspect16x9, "aspect16x9");
            KC.j jVar2 = new KC.j(aspect16x9, 16, 9, CollectionsKt.listOf(eWT().f9190t));
            ImageButton aspect9x16 = eWT().az;
            Intrinsics.checkNotNullExpressionValue(aspect9x16, "aspect9x16");
            KC.j jVar3 = new KC.j(aspect9x16, 9, 16, CollectionsKt.listOf((Object[]) new View[]{eWT().ty, eWT().HI}));
            ImageButton aspect4x5 = eWT().mUb;
            Intrinsics.checkNotNullExpressionValue(aspect4x5, "aspect4x5");
            KC.j jVar4 = new KC.j(aspect4x5, 4, 5, CollectionsKt.listOf((Object[]) new View[]{eWT().gh, eWT().qie}));
            ImageButton aspect1x1 = eWT().nr;
            Intrinsics.checkNotNullExpressionValue(aspect1x1, "aspect1x1");
            KC.j jVar5 = new KC.j(aspect1x1, 1, 1, CollectionsKt.listOf((Object[]) new View[]{eWT().f9179O, eWT().J2}));
            ImageButton aspect4x3 = eWT().Uo;
            Intrinsics.checkNotNullExpressionValue(aspect4x3, "aspect4x3");
            KC.j jVar6 = new KC.j(aspect4x3, 4, 3, CollectionsKt.listOf((Object[]) new View[]{eWT().KN, eWT().xMQ}));
            ImageButton aspectCustom = eWT().ck;
            Intrinsics.checkNotNullExpressionValue(aspectCustom, "aspectCustom");
            final List<KC.j> listListOf4 = CollectionsKt.listOf((Object[]) new KC.j[]{jVar2, jVar3, jVar4, jVar5, jVar6, new KC.j(aspectCustom, -1, -1, CollectionsKt.listOf(eWT().Ik))});
            for (final KC.j jVar7 : listListOf4) {
                jVar7.t().setImageDrawable(new Vi.fuX(jVar7.nr(), jVar7.rl(), getResources().getDimension(2131166284), getResources().getDimension(2131166285), getResources().getDimension(2131166283), 0.0f, getResources().getDimension(2131166282), true, getResources().getDrawable(2131231020, jVar7.t().getContext().getTheme()), getResources().getColor(2131099755, jVar7.t().getContext().getTheme()), getResources().getColor(2131099769, jVar7.t().getContext().getTheme()), getResources().getColor(2131099654, jVar7.t().getContext().getTheme()), false));
                List listSplit$default = StringsKt.split$default((CharSequence) this.projectAspect, new String[]{":"}, false, 0, 6, (Object) null);
                int i7 = i3;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, i7));
                Iterator it3 = listSplit$default.iterator();
                while (it3.hasNext()) {
                    Integer intOrNull = StringsKt.toIntOrNull((String) it3.next());
                    arrayList.add(Integer.valueOf(intOrNull != null ? intOrNull.intValue() : -1));
                }
                jVar7.t().setActivated(jVar7.nr() == ((Number) arrayList.get(i2)).intValue() && jVar7.rl() == ((Number) arrayList.get(1)).intValue());
                jVar7.t().setOnClickListener(new View.OnClickListener() { // from class: f0P.ZQ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        iP.Rl(this.f65326n, jVar7, listListOf4, view2);
                    }
                });
                Iterator it4 = jVar7.n().iterator();
                while (it4.hasNext()) {
                    ((View) it4.next()).setOnClickListener(new View.OnClickListener() { // from class: f0P.TeH
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            iP.qm(this.f64748n, jVar7, listListOf4, view2);
                        }
                    });
                }
                i3 = i7;
                i2 = 0;
            }
            eWT().jB.setOnClickListener(new View.OnClickListener() { // from class: f0P.yv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    iP.mYa(this.f66385n, view2);
                }
            });
            eWT().ViF.setOnClickListener(new View.OnClickListener() { // from class: f0P.Ow
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    iP.kSg(this.f64573n, view2);
                }
            });
            eWT().f9188o.setOnClickListener(new View.OnClickListener() { // from class: f0P.Pc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    iP.RQ(this.f64611n, view2);
                }
            });
            eWT().f9180S.setOnClickListener(new View.OnClickListener() { // from class: f0P.VJ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    iP.F(this.f64920n, view2);
                }
            });
            if (HW.C.e(this) != null) {
                this.customResolutionWidthRatio = r1.getRootScene().getWidth() / r1.getRootScene().getHeight();
                Unit unit = Unit.INSTANCE;
            }
            eWT().p5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: f0P.wc
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z2) {
                    iP.QZ6(this.f66299n, view2, z2);
                }
            });
            eWT().s7N.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: f0P.Ym
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z2) {
                    iP.tFV(this.f65126n, view2, z2);
                }
            });
            eWT().p5.addTextChangedListener(new w6());
            eWT().s7N.addTextChangedListener(new Ml());
            eWT().p5.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: f0P.GQt
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView20, int i8, KeyEvent keyEvent) {
                    return iP.VwL(this.f64241n, textView20, i8, keyEvent);
                }
            });
            eWT().s7N.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: f0P.UZd
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView20, int i8, KeyEvent keyEvent) {
                    return iP.mI(this.f64774n, textView20, i8, keyEvent);
                }
            });
            SceneHolder sceneHolderE4 = HW.C.e(this);
            if (sceneHolderE4 != null && (rootScene2 = sceneHolderE4.getRootScene()) != null) {
                type = rootScene2.getType();
            }
            if (type == SceneType.ELEMENT) {
                eWT().f9182U.setVisibility(0);
                eWT().P5.setVisibility(0);
                eWT().P5.setOnClickListener(new View.OnClickListener() { // from class: f0P.yyp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        iP.T3L(this.f66387n, view2);
                    }
                });
                eWT().wTp.setVisibility(0);
                eWT().f9191v.setVisibility(0);
                eWT().f9191v.setOnClickListener(new View.OnClickListener() { // from class: f0P.QFt
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        iP.p0N(this.f64621n, view2);
                    }
                });
            } else {
                eWT().f9182U.setVisibility(4);
                eWT().P5.setVisibility(4);
                eWT().wTp.setVisibility(4);
                eWT().f9191v.setVisibility(4);
            }
        }
        n7b();
        v0j();
    }

    public final QmE.iF ul() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    private final void Aum(String oldAspect) {
        Scene rootScene;
        int iMin;
        int iIntValue;
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE != null && (rootScene = sceneHolderE.getRootScene()) != null) {
            List listSplit$default = StringsKt.split$default((CharSequence) oldAspect, new String[]{":"}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (true) {
                int iIntValue2 = -1;
                if (!it.hasNext()) {
                    break;
                }
                Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
                if (intOrNull != null) {
                    iIntValue2 = intOrNull.intValue();
                }
                arrayList.add(Integer.valueOf(iIntValue2));
            }
            int iIntValue3 = ((Number) arrayList.get(0)).intValue();
            int iIntValue4 = ((Number) arrayList.get(1)).intValue();
            List listSplit$default2 = StringsKt.split$default((CharSequence) this.projectAspect, new String[]{":"}, false, 0, 6, (Object) null);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default2, 10));
            Iterator it2 = listSplit$default2.iterator();
            while (it2.hasNext()) {
                Integer intOrNull2 = StringsKt.toIntOrNull((String) it2.next());
                if (intOrNull2 != null) {
                    iIntValue = intOrNull2.intValue();
                } else {
                    iIntValue = -1;
                }
                arrayList2.add(Integer.valueOf(iIntValue));
            }
            int iIntValue5 = ((Number) arrayList2.get(0)).intValue();
            int iIntValue6 = ((Number) arrayList2.get(1)).intValue();
            if (iIntValue3 != iIntValue5 || iIntValue4 != iIntValue6) {
                if (iIntValue3 == -1 && iIntValue4 == -1) {
                    List list = this.resolutionIntList;
                    if (list == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("resolutionIntList");
                        list = null;
                    }
                    if (list.contains(Integer.valueOf(Math.min(rootScene.getWidth(), rootScene.getHeight())))) {
                        iMin = Math.min(rootScene.getWidth(), rootScene.getHeight());
                    } else {
                        iMin = Math.min(1080, AbstractC2487Wre.mUb().J2());
                    }
                    s(iMin);
                    return;
                }
                s(Math.min(rootScene.getWidth(), rootScene.getHeight()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Bu(iP iPVar, Scene scene, Map.Entry entry) {
        SceneHolder sceneHolderE = HW.C.e(iPVar);
        if (sceneHolderE != null) {
            sceneHolderE.setRootScene(Scene.copy$default(scene, null, 0, 0, 0, 0, 0, null, 0, null, null, null, null, (ReTimingMethod) entry.getKey(), 0, 0, 0, false, 0L, null, null, 1044479, null));
        }
        iPVar.n7b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EF(iP iPVar, View view) {
        ConstraintLayout projectSettingsPanel = iPVar.eWT().rV9;
        Intrinsics.checkNotNullExpressionValue(projectSettingsPanel, "projectSettingsPanel");
        iPVar.y(projectSettingsPanel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JVN(iP iPVar, Scene scene, Map.Entry entry) {
        SceneHolder sceneHolderE = HW.C.e(iPVar);
        if (sceneHolderE != null) {
            sceneHolderE.setScene(Scene.copy$default(scene, null, 0, 0, 0, 0, 0, null, 0, null, null, null, null, (ReTimingMethod) entry.getKey(), 0, 0, 0, false, 0L, null, null, 1044479, null));
        }
        iPVar.n7b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void QZ6(iP iPVar, View view, boolean z2) {
        Scene rootScene;
        SceneHolder sceneHolderE = HW.C.e(iPVar);
        if (sceneHolderE != null && (rootScene = sceneHolderE.getRootScene()) != null && z2) {
            iPVar.customResolutionWidthRatio = rootScene.getWidth() / rootScene.getHeight();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RQ(final iP iPVar, View view) {
        final Scene rootScene;
        boolean z2;
        SceneHolder sceneHolderE = HW.C.e(iPVar);
        if (sceneHolderE != null && (rootScene = sceneHolderE.getRootScene()) != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(context, iPVar.n1(), false);
            nkk.X(view.getWidth());
            List<Pair> list = iPVar.bgColorOptions;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bgColorOptions");
                list = null;
            }
            for (Pair pair : list) {
                final j.n nVar = (j.n) pair.component1();
                int iIntValue = ((Number) pair.component2()).intValue();
                if (ColorKt.toInt(rootScene.getBackground()) == ColorKt.toInt(com.alightcreative.app.motion.persist.n.O(nVar))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                com.alightcreative.widget.nKK.HI(nkk, iIntValue, 0, z2, com.alightcreative.app.motion.persist.n.O(nVar), new Function0() { // from class: f0P.Ec
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return iP.a63(this.f64175n, rootScene, nVar);
                    }
                }, 2, null);
            }
            Intrinsics.checkNotNull(view);
            com.alightcreative.widget.nKK.N(nkk, view, 0, 0, null, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3L(final iP iPVar, View view) {
        SceneHolder sceneHolderE;
        final Scene rootScene;
        boolean z2;
        Context context = iPVar.getContext();
        if (context != null && (sceneHolderE = HW.C.e(iPVar)) != null && (rootScene = sceneHolderE.getRootScene()) != null) {
            com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(context, iPVar.n1(), false);
            nkk.X(view.getWidth());
            Map map = iPVar.retimingOptions;
            if (map == null) {
                Intrinsics.throwUninitializedPropertyAccessException("retimingOptions");
                map = null;
            }
            for (final Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getValue();
                if (entry.getKey() == rootScene.getReTimingMethod()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                com.alightcreative.widget.nKK.ck(nkk, str, null, z2, null, new Function0() { // from class: f0P.Vq3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return iP.Bu(this.f64935n, rootScene, entry);
                    }
                }, 10, null);
            }
            Intrinsics.checkNotNull(view);
            com.alightcreative.widget.nKK.N(nkk, view, 0, 0, null, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UF(final iP iPVar, View view) {
        SceneHolder sceneHolderE;
        final Scene scene;
        boolean z2;
        Context context = iPVar.getContext();
        if (context != null && (sceneHolderE = HW.C.e(iPVar)) != null && (scene = sceneHolderE.getScene()) != null) {
            com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(context, iPVar.n1(), false);
            nkk.X(view.getWidth());
            Map map = iPVar.precomposeOptions;
            if (map == null) {
                Intrinsics.throwUninitializedPropertyAccessException("precomposeOptions");
                map = null;
            }
            for (final Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getValue();
                if (entry.getKey() == scene.getPrecompose()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                com.alightcreative.widget.nKK.ck(nkk, str, null, z2, null, new Function0() { // from class: f0P.zF
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return iP.X4T(this.f66395n, scene, entry);
                    }
                }, 10, null);
            }
            Intrinsics.checkNotNull(view);
            com.alightcreative.widget.nKK.N(nkk, view, 0, 0, null, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uf(iP iPVar, Scene scene, Map.Entry entry) {
        SceneHolder sceneHolderE = HW.C.e(iPVar);
        if (sceneHolderE != null) {
            sceneHolderE.setRootScene(Scene.copy$default(scene, null, 0, 0, 0, 0, 0, null, 0, null, (PrecomposeType) entry.getKey(), null, null, null, 0, 0, 0, false, 0L, null, null, 1048063, null));
        }
        iPVar.n7b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Vvq(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(iP iPVar, Scene scene, int i2) {
        SceneHolder sceneHolderE = HW.C.e(iPVar);
        if (sceneHolderE != null) {
            sceneHolderE.setRootScene(Scene.copy$default(scene, null, 0, 0, 0, 0, 0, null, i2 * 100, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048447, null));
        }
        iPVar.n7b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X4T(iP iPVar, Scene scene, Map.Entry entry) {
        SceneHolder sceneHolderE = HW.C.e(iPVar);
        if (sceneHolderE != null) {
            sceneHolderE.setScene(Scene.copy$default(scene, null, 0, 0, 0, 0, 0, null, 0, null, (PrecomposeType) entry.getKey(), null, null, null, 0, 0, 0, false, 0L, null, null, 1048063, null));
        }
        iPVar.n7b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Zmq(final iP iPVar, View view) {
        SceneHolder sceneHolderE;
        final Scene scene;
        boolean z2;
        Context context = iPVar.getContext();
        if (context != null && (sceneHolderE = HW.C.e(iPVar)) != null && (scene = sceneHolderE.getScene()) != null) {
            com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(context, iPVar.n1(), false);
            nkk.X(view.getWidth());
            Map map = iPVar.groupRetimingOptions;
            if (map == null) {
                Intrinsics.throwUninitializedPropertyAccessException("groupRetimingOptions");
                map = null;
            }
            for (final Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getValue();
                if (entry.getKey() == scene.getReTimingMethod()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                com.alightcreative.widget.nKK.ck(nkk, str, null, z2, null, new Function0() { // from class: f0P.vM
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return iP.JVN(this.f66262n, scene, entry);
                    }
                }, 10, null);
            }
            Intrinsics.checkNotNull(view);
            com.alightcreative.widget.nKK.N(nkk, view, 0, 0, null, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a63(iP iPVar, Scene scene, j.n nVar) {
        SceneHolder sceneHolderE = HW.C.e(iPVar);
        if (sceneHolderE != null) {
            sceneHolderE.setRootScene(Scene.copy$default(scene, null, 0, 0, 0, 0, 0, null, 0, com.alightcreative.app.motion.persist.n.O(nVar), null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048319, null));
        }
        iPVar.n7b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final iP iPVar, View view) {
        final Scene scene;
        boolean z2;
        SceneHolder sceneHolderE = HW.C.e(iPVar);
        if (sceneHolderE != null && (scene = sceneHolderE.getScene()) != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(context, iPVar.n1(), false);
            nkk.X(view.getWidth());
            List<Pair> list = iPVar.bgColorOptions;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bgColorOptions");
                list = null;
            }
            for (Pair pair : list) {
                final j.n nVar = (j.n) pair.component1();
                int iIntValue = ((Number) pair.component2()).intValue();
                if (ColorKt.toInt(scene.getBackground()) == ColorKt.toInt(com.alightcreative.app.motion.persist.n.O(nVar))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                com.alightcreative.widget.nKK.HI(nkk, iIntValue, 0, z2, com.alightcreative.app.motion.persist.n.O(nVar), new Function0() { // from class: f0P.BJx
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return iP.ub(this.f64089n, scene, nVar);
                    }
                }, 2, null);
            }
            Intrinsics.checkNotNull(view);
            com.alightcreative.widget.nKK.N(nkk, view, 0, 0, null, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kSg(final iP iPVar, View view) {
        SceneHolder sceneHolderE;
        final Scene rootScene;
        boolean z2;
        Context context = iPVar.getContext();
        if (context != null && (sceneHolderE = HW.C.e(iPVar)) != null && (rootScene = sceneHolderE.getRootScene()) != null) {
            int iMin = Math.min(rootScene.getWidth(), rootScene.getHeight());
            com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(context, iPVar.n1(), false);
            nkk.X(view.getWidth());
            Iterator<Integer> it = SceneKt.getSTANDARD_FRAME_RATES().iterator();
            while (it.hasNext()) {
                final int iIntValue = it.next().intValue();
                if (iIntValue < 35 || iMin < com.alightcreative.app.motion.persist.j.INSTANCE.getMaxResWithVideo()) {
                    String str = iIntValue + " fps";
                    if (iIntValue * 100 == rootScene.getFramesPerHundredSeconds()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    com.alightcreative.widget.nKK.ck(nkk, str, null, z2, null, new Function0() { // from class: f0P.dw
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return iP.W(this.f65504n, rootScene, iIntValue);
                        }
                    }, 10, null);
                }
            }
            Intrinsics.checkNotNull(view);
            com.alightcreative.widget.nKK.N(nkk, view, 0, 0, null, 14, null);
        }
    }

    private static final void lLA(iP iPVar, int i2) {
        iPVar.s(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mYa(final iP iPVar, View view) {
        Scene rootScene;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        SceneHolder sceneHolderE = HW.C.e(iPVar);
        if (sceneHolderE != null && (rootScene = sceneHolderE.getRootScene()) != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(context, iPVar.n1(), false);
            nkk.X(view.getWidth());
            int iMin = Math.min(rootScene.getWidth(), rootScene.getHeight());
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            if (jVar.getMaxLayers2160() > 0) {
                if (iMin == 2160) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                com.alightcreative.widget.nKK.ck(nkk, "2160p (4k)", null, z14, null, new Function0() { // from class: f0P.dEF
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return iP.Org(this.f65484n);
                    }
                }, 10, null);
            } else if (jVar.getMaxLayers2160() >= 0) {
                if (iMin == 2160) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                com.alightcreative.widget.nKK.ck(nkk, "2160p (No Video)", null, z2, null, new Function0() { // from class: f0P.Mw
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return iP.HV(this.f64501n);
                    }
                }, 10, null);
            }
            if (jVar.getMaxLayers1440() > 0) {
                if (iMin == 1440) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                com.alightcreative.widget.nKK.ck(nkk, "1440p (QHD)", null, z13, null, new Function0() { // from class: f0P.T0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return iP.GD(this.f64738n);
                    }
                }, 10, null);
            } else if (jVar.getMaxLayers1440() >= 0) {
                if (iMin == 1440) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                com.alightcreative.widget.nKK.ck(nkk, "1440p (No Video)", null, z3, null, new Function0() { // from class: f0P.iM
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return iP.Po6(this.f65634n);
                    }
                }, 10, null);
            }
            if (jVar.getMaxLayers1080() > 0) {
                if (iMin == 1080) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                com.alightcreative.widget.nKK.ck(nkk, "1080p (FHD)", null, z12, null, new Function0() { // from class: f0P.sq
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return iP.EWS(this.f66177n);
                    }
                }, 10, null);
            } else if (jVar.getMaxLayers1080() >= 0) {
                if (iMin == 1080) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                com.alightcreative.widget.nKK.ck(nkk, "1080p (No Video)", null, z4, null, new Function0() { // from class: f0P.RL
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return iP.hRu(this.f64651n);
                    }
                }, 10, null);
            }
            if (jVar.getMaxLayers720() > 0) {
                if (iMin == 720) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                com.alightcreative.widget.nKK.ck(nkk, "720p (HD)", null, z11, null, new Function0() { // from class: f0P.MXJ
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return iP.UhV(this.f64483n);
                    }
                }, 10, null);
            } else if (jVar.getMaxLayers720() >= 0) {
                if (iMin == 720) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                com.alightcreative.widget.nKK.ck(nkk, "720p (No Video)", null, z5, null, new Function0() { // from class: f0P.jfr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return iP.i(this.f65694n);
                    }
                }, 10, null);
            }
            if (iMin == 540) {
                z6 = true;
            } else {
                z6 = false;
            }
            com.alightcreative.widget.nKK.ck(nkk, "540p (SD)", null, z6, null, new Function0() { // from class: f0P.VcI
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return iP.K(this.f64925n);
                }
            }, 10, null);
            if (iMin == 360) {
                z7 = true;
            } else {
                z7 = false;
            }
            com.alightcreative.widget.nKK.ck(nkk, "360p", null, z7, null, new Function0() { // from class: f0P.iT
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return iP.How(this.f65651n);
                }
            }, 10, null);
            if (iMin == 270) {
                z9 = true;
            } else {
                z9 = false;
            }
            com.alightcreative.widget.nKK.ck(nkk, "270p", null, z9, null, new Function0() { // from class: f0P.fU
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return iP.tUK(this.f65546n);
                }
            }, 10, null);
            if (iMin == 180) {
                z10 = true;
            } else {
                z10 = false;
            }
            com.alightcreative.widget.nKK.ck(nkk, "180p", null, z10, null, new Function0() { // from class: f0P.at
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return iP.ER(this.f65365n);
                }
            }, 10, null);
            Intrinsics.checkNotNull(view);
            com.alightcreative.widget.nKK.N(nkk, view, 0, 0, null, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o9(iP iPVar) {
        iPVar.v0j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0N(final iP iPVar, View view) {
        SceneHolder sceneHolderE;
        final Scene rootScene;
        boolean z2;
        Context context = iPVar.getContext();
        if (context != null && (sceneHolderE = HW.C.e(iPVar)) != null && (rootScene = sceneHolderE.getRootScene()) != null) {
            com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(context, iPVar.n1(), false);
            nkk.X(view.getWidth());
            Map map = iPVar.precomposeOptions;
            if (map == null) {
                Intrinsics.throwUninitializedPropertyAccessException("precomposeOptions");
                map = null;
            }
            for (final Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getValue();
                if (entry.getKey() == rootScene.getPrecompose()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                com.alightcreative.widget.nKK.ck(nkk, str, null, z2, null, new Function0() { // from class: f0P.buM
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return iP.Uf(this.f65399n, rootScene, entry);
                    }
                }, 10, null);
            }
            Intrinsics.checkNotNull(view);
            com.alightcreative.widget.nKK.N(nkk, view, 0, 0, null, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tFV(iP iPVar, View view, boolean z2) {
        Scene rootScene;
        SceneHolder sceneHolderE = HW.C.e(iPVar);
        if (sceneHolderE != null && (rootScene = sceneHolderE.getRootScene()) != null && z2) {
            iPVar.customResolutionWidthRatio = rootScene.getWidth() / rootScene.getHeight();
        }
    }

    private final void uG(String title, String msg) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        new AlertDialog.Builder(context).setTitle(title).KN(msg).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: f0P.Pa
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                iP.Vvq(dialogInterface, i2);
            }
        }).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ub(iP iPVar, Scene scene, j.n nVar) {
        SceneHolder sceneHolderE = HW.C.e(iPVar);
        if (sceneHolderE != null) {
            sceneHolderE.setScene(Scene.copy$default(scene, null, 0, 0, 0, 0, 0, null, 0, com.alightcreative.app.motion.persist.n.O(nVar), null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048319, null));
        }
        iPVar.n7b();
        return Unit.INSTANCE;
    }

    private final void v0j() {
        EditActivity editActivity;
        FragmentActivity activity = getActivity();
        if (activity instanceof EditActivity) {
            editActivity = (EditActivity) activity;
        } else {
            editActivity = null;
        }
        if (editActivity != null) {
            long jKWB = editActivity.KWB();
            eWT().M7.setText(getResources().getString(2132020344) + ": " + TimeKt.formatTimeMillis$default((int) jKWB, "hh:mm:ss", false, 4, null));
            eWT().M7.removeCallbacks(this.updateEditTimeRunnable);
            eWT().M7.postDelayed(this.updateEditTimeRunnable, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xVH(iP iPVar, View view) {
        Object systemService;
        for (SettingEditText settingEditText : CollectionsKt.listOf((Object[]) new SettingEditText[]{iPVar.eWT().p5, iPVar.eWT().s7N, iPVar.eWT().f9178N, iPVar.eWT().iF})) {
            if (settingEditText.hasFocus()) {
                settingEditText.onEditorAction(6);
                settingEditText.clearFocus();
                Context context = iPVar.getContext();
                InputMethodManager inputMethodManager = null;
                if (context != null) {
                    systemService = context.getSystemService("input_method");
                } else {
                    systemService = null;
                }
                if (systemService instanceof InputMethodManager) {
                    inputMethodManager = (InputMethodManager) systemService;
                }
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(settingEditText.getWindowToken(), 0);
                    return;
                }
                return;
            }
        }
        ConstraintLayout projectSettingsPanel = iPVar.eWT().rV9;
        Intrinsics.checkNotNullExpressionValue(projectSettingsPanel, "projectSettingsPanel");
        iPVar.y(projectSettingsPanel);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        eWT().M7.removeCallbacks(this.updateEditTimeRunnable);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        v0j();
        super.onResume();
    }
}
