package KC;

import QmE.j;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.KeyEventDispatcher;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.view.ComponentActivity;
import androidx.view.LifecycleOwnerKt;
import com.alightcreative.app.motion.activities.ColorDropdown;
import com.alightcreative.app.motion.activities.EditActivity;
import com.alightcreative.app.motion.activities.FpsDropdown;
import com.alightcreative.app.motion.activities.ResolutionDropdown;
import com.alightcreative.app.motion.activities.w6O;
import com.alightcreative.app.motion.persist.j;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.SolidColor;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kP.InterfaceC2210n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 y2\u00020\u0001:\u0001zB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0004*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0004*\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\nJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\nJ+\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0003J!\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010\u0003R\u0018\u00100\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u00102R\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010b\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010e\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010g\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bf\u0010dR\u001c\u0010l\u001a\b\u0012\u0004\u0012\u00020i0h8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bj\u0010kR\u001c\u0010q\u001a\b\u0012\u0004\u0012\u00020n0m8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010x\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bv\u0010w¨\u0006{"}, d2 = {"LKC/Q;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "ofS", "Mx", "Landroid/content/Context;", "context", "Y", "(Landroid/content/Context;)V", "", "width", "height", "", "projectTitle", "FX", "(Landroid/content/Context;IILjava/lang/String;)V", "LSJ0/mz;", "C", "(LSJ0/mz;)V", "resolutionShortDimension", "dR0", "(I)V", "Lcom/alightcreative/app/motion/activities/FpsDropdown;", "pJg", "(Lcom/alightcreative/app/motion/activities/FpsDropdown;)V", "", "Nxk", "(II)Z", "eTf", "ijL", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onStop", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "o", "LSJ0/mz;", "_binding", "LQmE/iF;", "Z", "LQmE/iF;", "D", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LkgE/fuX;", "S", "LkgE/fuX;", "I", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LxAo/I28;", "g", "LxAo/I28;", "J", "()LxAo/I28;", "setCrisperManager", "(LxAo/I28;)V", "crisperManager", "LnYs/Ml;", "E2", "LnYs/Ml;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "()LnYs/Ml;", "setGetAlightSettingsUseCase", "(LnYs/Ml;)V", "getAlightSettingsUseCase", "LkP/n;", "e", "LkP/n;", "GR", "()LkP/n;", "setInjet", "(LkP/n;)V", "injet", "X", "wasCreationHookTriggered", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "F", "newProjectCustomWidthRatio", "Lcom/alightcreative/app/motion/scene/SceneType;", "N", "Lcom/alightcreative/app/motion/scene/SceneType;", "sceneType", "v", "Ljava/lang/String;", "defaultProjectName", "Xw", "defaultElementName", "", "Lcom/alightcreative/account/LicenseInfo;", "jB", "Ljava/util/List;", "currentLicenses", "", "LkgE/K;", "U", "Ljava/util/Set;", "currentBenefits", "LkgE/l4Z;", "P5", "LkgE/l4Z;", "purchaseStateObserver", "B", "()LSJ0/mz;", "binding", "M7", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCreateProjectFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateProjectFragment.kt\ncom/alightcreative/app/motion/activities/main/CreateProjectFragment\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ContextUtil.kt\ncom/alightcreative/ext/ContextUtilKt\n+ 6 ViewUtils.kt\ncom/alightcreative/ext/ViewUtilsKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,609:1\n127#2,2:610\n127#2,2:612\n1557#3:614\n1628#3,3:615\n1863#3,2:618\n1062#3:620\n230#3,2:622\n360#3,7:624\n360#3,7:631\n1557#3:638\n1628#3,3:639\n1557#3:650\n1628#3,3:651\n1863#3:655\n1864#3:657\n1863#3:659\n1864#3:661\n360#3,7:662\n774#3:669\n865#3,2:670\n1863#3,2:672\n1863#3,2:674\n1#4:621\n98#5:642\n93#5,7:643\n33#6:654\n25#6:656\n33#6:658\n25#6:660\n1137#7,2:676\n*S KotlinDebug\n*F\n+ 1 CreateProjectFragment.kt\ncom/alightcreative/app/motion/activities/main/CreateProjectFragment\n*L\n160#1:610,2\n163#1:612,2\n291#1:614\n291#1:615,3\n322#1:618,2\n334#1:620\n347#1:622,2\n355#1:624,7\n379#1:631,7\n391#1:638\n391#1:639,3\n506#1:650\n506#1:651,3\n508#1:655\n508#1:657\n509#1:659\n509#1:661\n523#1:662,7\n559#1:669\n559#1:670,2\n318#1:672,2\n325#1:674,2\n481#1:642\n481#1:643,7\n508#1:654\n508#1:656\n509#1:658\n509#1:660\n382#1:676,2\n*E\n"})
public final class Q extends DAz {
    public static final int p5 = 8;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    public nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private Set currentBenefits;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private boolean wasCreationHookTriggered;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private String defaultElementName;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public InterfaceC2210n injet;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public xAo.I28 crisperManager;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private List currentLicenses;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private SJ0.mz _binding;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private String defaultProjectName;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private float newProjectCustomWidthRatio = 1.0f;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private SceneType sceneType = SceneType.SCENE;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private final kgE.l4Z purchaseStateObserver = new kgE.l4Z() { // from class: KC.Dsr
        @Override // kgE.l4Z
        public final void n(com.alightcreative.account.o oVar) {
            Q.z(this.f5069n, oVar);
        }
    };

    public static final class I28 implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        }

        I28() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s2) {
            Integer intOrNull;
            Intrinsics.checkNotNullParameter(s2, "s");
            if (!Q.this.B().fD.hasFocus() || (intOrNull = StringsKt.toIntOrNull(s2.toString())) == null || intOrNull.intValue() <= 0) {
                return;
            }
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            if (!jVar.getNewProjectCustomSizeLink()) {
                jVar.setNewProjectCustomHeight(intOrNull.intValue());
                return;
            }
            int iRoundToInt = MathKt.roundToInt(intOrNull.intValue() * Q.this.newProjectCustomWidthRatio);
            Q.this.B().s7N.setText(String.valueOf(iRoundToInt));
            jVar.setNewProjectCustomHeight(intOrNull.intValue());
            jVar.setNewProjectCustomWidth(iRoundToInt);
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
            if (!Q.this.B().s7N.hasFocus() || (intOrNull = StringsKt.toIntOrNull(s2.toString())) == null || intOrNull.intValue() <= 0) {
                return;
            }
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            if (!jVar.getNewProjectCustomSizeLink()) {
                jVar.setNewProjectCustomWidth(intOrNull.intValue());
                return;
            }
            int iRoundToInt = MathKt.roundToInt(intOrNull.intValue() / Q.this.newProjectCustomWidthRatio);
            Q.this.B().fD.setText(String.valueOf(iRoundToInt));
            jVar.setNewProjectCustomHeight(iRoundToInt);
            jVar.setNewProjectCustomWidth(intOrNull.intValue());
        }
    }

    public static final class Wre implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((w6O) obj2).t()), Integer.valueOf(((w6O) obj).t()));
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {
        final /* synthetic */ int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f5125O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5126n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f5127r;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(int i2, int i3, String str, Continuation continuation) {
            super(2, continuation);
            this.f5125O = i2;
            this.J2 = i3;
            this.f5127r = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Q.this.new w6(this.f5125O, this.J2, this.f5127r, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f5126n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC2210n interfaceC2210nGR = Q.this.GR();
                Eu.I28 i28 = Eu.I28.f2388r;
                this.f5126n = 1;
                obj = Eu.Wre.n(interfaceC2210nGR, i28, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            Q q2 = Q.this;
            int i3 = this.f5125O;
            int i5 = this.J2;
            String str = this.f5127r;
            if (!(nVar instanceof n.C1266n)) {
                if (nVar instanceof n.w6) {
                    boolean zBooleanValue = ((Boolean) ((n.w6) nVar).n()).booleanValue();
                    q2.wasCreationHookTriggered = true;
                    if (zBooleanValue) {
                        Context contextRequireContext = q2.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        q2.FX(contextRequireContext, i3, i5, str);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[kgE.Zs.values().length];
            try {
                iArr[kgE.Zs.J2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kgE.Zs.f70101O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kgE.Zs.f70102n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kgE.Zs.f70105t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SceneType.values().length];
            try {
                iArr2[SceneType.SCENE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SceneType.ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SJ0.mz B() {
        SJ0.mz mzVar = this._binding;
        Intrinsics.checkNotNull(mzVar);
        return mzVar;
    }

    private final void C(SJ0.mz mzVar) {
        int iIntValue;
        Pair pair;
        Button button = mzVar.nHg;
        SceneType sceneType = this.sceneType;
        SceneType sceneType2 = SceneType.SCENE;
        int i2 = 0;
        button.setActivated(sceneType == sceneType2);
        Button sceneTypeButtonProject = mzVar.nHg;
        Intrinsics.checkNotNullExpressionValue(sceneTypeButtonProject, "sceneTypeButtonProject");
        HI0.o7q.az(sceneTypeButtonProject, this.sceneType == sceneType2 ? 3.0f : 0.0f);
        Button button2 = mzVar.f9536N;
        SceneType sceneType3 = this.sceneType;
        SceneType sceneType4 = SceneType.ELEMENT;
        button2.setActivated(sceneType3 == sceneType4);
        Button sceneTypeButtonElement = mzVar.f9536N;
        Intrinsics.checkNotNullExpressionValue(sceneTypeButtonElement, "sceneTypeButtonElement");
        HI0.o7q.az(sceneTypeButtonElement, this.sceneType == sceneType4 ? 3.0f : 0.0f);
        List listSplit$default = StringsKt.split$default((CharSequence) com.alightcreative.app.motion.persist.j.INSTANCE.getNewProjectAspect(), new String[]{":"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (true) {
            iIntValue = -1;
            if (!it.hasNext()) {
                break;
            }
            Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
            if (intOrNull != null) {
                iIntValue = intOrNull.intValue();
            }
            arrayList.add(Integer.valueOf(iIntValue));
        }
        int iIntValue2 = ((Number) arrayList.get(0)).intValue();
        int iIntValue3 = ((Number) arrayList.get(1)).intValue();
        boolean z2 = iIntValue2 <= 0 || iIntValue3 <= 0;
        Iterator it2 = CollectionsKt.listOf(mzVar.f9543g).iterator();
        while (true) {
            int i3 = 4;
            if (!it2.hasNext()) {
                break;
            }
            View view = (View) it2.next();
            if (z2) {
                i3 = 0;
            }
            view.setVisibility(i3);
        }
        Iterator it3 = CollectionsKt.listOf(mzVar.f9539T).iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).setVisibility(!z2 ? 0 : 4);
        }
        mzVar.f9541Z.setAlpha(this.sceneType == SceneType.ELEMENT ? 0.3f : 1.0f);
        EditText editText = mzVar.s7N;
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        editText.setText(String.valueOf(jVar.getNewProjectCustomWidth()));
        mzVar.fD.setText(String.valueOf(jVar.getNewProjectCustomHeight()));
        if (jVar.getNewProjectRes() > jVar.getMaxRes() && jVar.getMaxRes() > 0) {
            jVar.setNewProjectRes(jVar.getMaxRes());
        }
        if (jVar.getNewProjectFps() >= 35 && jVar.getNewProjectRes() >= jVar.getMaxResWithVideo()) {
            jVar.setNewProjectFps(30);
        }
        ResolutionDropdown resolutionDropdown = mzVar.f9539T;
        Iterator<Object> it4 = resolutionDropdown.getItems().iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            if (((w6O) it4.next()).t() == com.alightcreative.app.motion.persist.j.INSTANCE.getNewProjectRes()) {
                iIntValue = i2;
                break;
            }
            i2++;
        }
        resolutionDropdown.setSelectedIndex(iIntValue);
        if (z2) {
            TextView textView = mzVar.nY;
            com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
            textView.setText(jVar2.getNewProjectCustomWidth() + " ⨉ " + jVar2.getNewProjectCustomHeight());
        } else {
            if (iIntValue2 < iIntValue3) {
                com.alightcreative.app.motion.persist.j jVar3 = com.alightcreative.app.motion.persist.j.INSTANCE;
                pair = TuplesKt.to(Integer.valueOf(jVar3.getNewProjectRes()), Integer.valueOf((jVar3.getNewProjectRes() * iIntValue3) / iIntValue2));
            } else {
                com.alightcreative.app.motion.persist.j jVar4 = com.alightcreative.app.motion.persist.j.INSTANCE;
                pair = TuplesKt.to(Integer.valueOf((jVar4.getNewProjectRes() * iIntValue2) / iIntValue3), Integer.valueOf(jVar4.getNewProjectRes()));
            }
            int iIntValue4 = ((Number) pair.component1()).intValue();
            int iIntValue5 = ((Number) pair.component2()).intValue();
            mzVar.nY.setText(iIntValue4 + " ⨉ " + iIntValue5);
        }
        mzVar.WPU.setActivated(com.alightcreative.app.motion.persist.j.INSTANCE.getNewProjectCustomSizeLink());
        Button button3 = mzVar.f9538S;
        int i5 = n.$EnumSwitchMapping$1[this.sceneType.ordinal()];
        button3.setText(i5 != 1 ? i5 != 2 ? "" : getResources().getText(2132017534) : getResources().getText(2132017540));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EWS(Q q2, View view) {
        q2.sceneType = SceneType.ELEMENT;
        String string = StringsKt.trim((CharSequence) q2.B().E2.getText().toString()).toString();
        String str = q2.defaultProjectName;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("defaultProjectName");
            str = null;
        }
        if (Intrinsics.areEqual(string, str)) {
            EditText editText = q2.B().E2;
            String str3 = q2.defaultElementName;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("defaultElementName");
            } else {
                str2 = str3;
            }
            editText.setText(str2);
        }
        SJ0.mz mzVar = q2._binding;
        if (mzVar != null) {
            q2.C(mzVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void FX(Context context, int width, int height, String projectTitle) {
        String str;
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        int iCoerceIn = RangesKt.coerceIn(jVar.getNewProjectFps() * 100, 1200, 12000);
        SolidColor solidColorO = com.alightcreative.app.motion.persist.n.O(jVar.getNewProjectBg());
        SceneType sceneType = this.sceneType;
        SceneType sceneType2 = SceneType.ELEMENT;
        int i2 = ColorKt.toInt(sceneType == sceneType2 ? SolidColor.INSTANCE.getTRANSPARENT() : solidColorO);
        jVar.setProjectsCreated(jVar.getProjectsCreated() + 1);
        QmE.iF iFVarD = D();
        String str2 = this.sceneType == sceneType2 ? "create_element" : "create_project";
        Bundle bundle = new Bundle();
        bundle.putInt("width", width);
        bundle.putInt("height", height);
        bundle.putInt("fphs", iCoerceIn);
        bundle.putString("bgcolor", HI0.qf.rl(i2));
        Unit unit = Unit.INSTANCE;
        iFVarD.n(new j.fuX(str2, bundle));
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (this.sceneType == sceneType2) {
            D().n(new j.KH(string, width, height, iCoerceIn / 100));
            str = string;
        } else {
            str = string;
            D().n(new j.rrk(str, width, height, iCoerceIn / 100, solidColorO.toString()));
        }
        KeyEventDispatcher.Component activity = getActivity();
        M.V1 v1 = activity instanceof M.V1 ? (M.V1) activity : null;
        if (v1 != null) {
            v1.fD(M.CN3.f6253S);
        }
        KeyEventDispatcher.Component activity2 = getActivity();
        M.Um um = activity2 instanceof M.Um ? (M.Um) activity2 : null;
        if (um != null) {
            um.wTp(six.CN3.f73281n.rl(this.sceneType));
        }
        Pair pair = TuplesKt.to("projectTitle", projectTitle);
        Pair pair2 = TuplesKt.to("projectID", str);
        Pair pair3 = TuplesKt.to("projectWidth", Integer.valueOf(width));
        Pair pair4 = TuplesKt.to("projectHeight", Integer.valueOf(height));
        Pair pair5 = TuplesKt.to("projectFPHS", Integer.valueOf(iCoerceIn));
        String strName = this.sceneType.name();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = strName.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Pair[] pairArr = (Pair[]) Arrays.copyOf(new Pair[]{pair, pair2, pair3, pair4, pair5, TuplesKt.to("projectType", lowerCase), TuplesKt.to("projectBGColor", Integer.valueOf(i2))}, 7);
        Intent intent = new Intent(context, (Class<?>) EditActivity.class);
        intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        if (isAdded()) {
            getParentFragmentManager().uG();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G7(Q q2, View view) {
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        jVar.setNewProjectCustomSizeLink(!jVar.getNewProjectCustomSizeLink());
        q2.B().WPU.setActivated(jVar.getNewProjectCustomSizeLink());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HV(String str, int i2) {
        if (i2 == 0) {
            return str;
        }
        return str + " " + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Jk(String str, int i2) {
        if (i2 == 0) {
            return str;
        }
        return str + " " + i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[PHI: r3
      0x00b6: PHI (r3v14 java.lang.String) = (r3v12 java.lang.String), (r3v88 java.lang.String) binds: [B:32:0x00ba, B:28:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void Mx() {
        String str;
        int i2;
        nYs.j jVarInvoke;
        Integer numQie;
        final View view = getView();
        if (view == null) {
            return;
        }
        HI0.o7q.gh(view);
        KeyEventDispatcher.Component activity = getActivity();
        String str2 = null;
        Vi.CN3 cn3 = activity instanceof Vi.CN3 ? (Vi.CN3) activity : null;
        Set projectTitles = cn3 != null ? cn3.getProjectTitles() : null;
        Intrinsics.checkNotNull(projectTitles);
        final String string = getString(2132019726);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        final String string2 = getString(2132019717);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        for (String str3 : SequencesKt.map(CollectionsKt.asSequence(new IntRange(0, 10000)), new Function1() { // from class: KC.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Q.Jk(string, ((Integer) obj).intValue());
            }
        })) {
            if (!projectTitles.contains(str3)) {
                this.defaultProjectName = str3;
                for (String str4 : SequencesKt.map(CollectionsKt.asSequence(new IntRange(0, 10000)), new Function1() { // from class: KC.l3D
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Q.HV(string2, ((Integer) obj).intValue());
                    }
                })) {
                    if (!projectTitles.contains(str4)) {
                        this.defaultElementName = str4;
                        EditText editText = B().E2;
                        int i3 = n.$EnumSwitchMapping$1[this.sceneType.ordinal()];
                        boolean z2 = true;
                        if (i3 == 1) {
                            str = this.defaultProjectName;
                            if (str == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("defaultProjectName");
                            }
                        } else if (i3 != 2) {
                            str2 = "";
                        } else {
                            str = this.defaultElementName;
                            if (str == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("defaultElementName");
                            } else {
                                str2 = str;
                            }
                        }
                        editText.setText(str2);
                        B().XQ.setOnClickListener(new View.OnClickListener() { // from class: KC.c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Q.GD(this.f5167n, view2);
                            }
                        });
                        B().nHg.setOnClickListener(new View.OnClickListener() { // from class: KC.s4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Q.Po6(this.f5231n, view2);
                            }
                        });
                        B().f9536N.setOnClickListener(new View.OnClickListener() { // from class: KC.UGc
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Q.EWS(this.f5152n, view2);
                            }
                        });
                        B().aYN.setOnClickListener(new View.OnClickListener() { // from class: KC.Ml
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Q.hRu(this.f5101n, view2);
                            }
                        });
                        B().WPU.setOnClickListener(new View.OnClickListener() { // from class: KC.I28
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Q.G7(this.f5076n, view2);
                            }
                        });
                        B().s7N.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: KC.Wre
                            @Override // android.view.View.OnFocusChangeListener
                            public final void onFocusChange(View view2, boolean z3) {
                                Q.fcU(this.f5156n, view2, z3);
                            }
                        });
                        B().fD.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: KC.CN3
                            @Override // android.view.View.OnFocusChangeListener
                            public final void onFocusChange(View view2, boolean z3) {
                                Q.eWT(this.f5044n, view2, z3);
                            }
                        });
                        B().s7N.addTextChangedListener(new Ml());
                        B().fD.addTextChangedListener(new I28());
                        ImageButton aspect16x9 = B().rl;
                        Intrinsics.checkNotNullExpressionValue(aspect16x9, "aspect16x9");
                        j jVar = new j(aspect16x9, 16, 9, CollectionsKt.listOf(B().f9547t));
                        ImageButton aspect9x16 = B().az;
                        Intrinsics.checkNotNullExpressionValue(aspect9x16, "aspect9x16");
                        j jVar2 = new j(aspect9x16, 9, 16, CollectionsKt.listOf((Object[]) new View[]{B().ty, B().HI}));
                        ImageButton aspect4x5 = B().mUb;
                        Intrinsics.checkNotNullExpressionValue(aspect4x5, "aspect4x5");
                        j jVar3 = new j(aspect4x5, 4, 5, CollectionsKt.listOf((Object[]) new View[]{B().gh, B().qie}));
                        ImageButton aspect1x1 = B().nr;
                        Intrinsics.checkNotNullExpressionValue(aspect1x1, "aspect1x1");
                        j jVar4 = new j(aspect1x1, 1, 1, CollectionsKt.listOf((Object[]) new View[]{B().f9537O, B().J2}));
                        ImageButton aspect4x3 = B().Uo;
                        Intrinsics.checkNotNullExpressionValue(aspect4x3, "aspect4x3");
                        j jVar5 = new j(aspect4x3, 4, 3, CollectionsKt.listOf((Object[]) new View[]{B().KN, B().xMQ}));
                        ImageButton aspectCustom = B().ck;
                        Intrinsics.checkNotNullExpressionValue(aspectCustom, "aspectCustom");
                        final List<j> listListOf = CollectionsKt.listOf((Object[]) new j[]{jVar, jVar2, jVar3, jVar4, jVar5, new j(aspectCustom, -1, -1, CollectionsKt.listOf(B().Ik))});
                        List listSplit$default = StringsKt.split$default((CharSequence) com.alightcreative.app.motion.persist.j.INSTANCE.getNewProjectAspect(), new String[]{":"}, false, 0, 6, (Object) null);
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
                        Iterator it = listSplit$default.iterator();
                        while (it.hasNext()) {
                            Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
                            arrayList.add(Integer.valueOf(intOrNull != null ? intOrNull.intValue() : -1));
                        }
                        int iIntValue = ((Number) arrayList.get(0)).intValue();
                        int iIntValue2 = ((Number) arrayList.get(1)).intValue();
                        for (final j jVar6 : listListOf) {
                            boolean z3 = z2;
                            jVar6.t().setImageDrawable(new Vi.fuX(jVar6.nr(), jVar6.rl(), getResources().getDimension(2131166284), getResources().getDimension(2131166285), getResources().getDimension(2131166283), 0.0f, getResources().getDimension(2131166282), true, ResourcesCompat.J2(view.getContext().getResources(), 2131231020, jVar6.t().getContext().getTheme()), getResources().getColor(2131099755, jVar6.t().getContext().getTheme()), getResources().getColor(2131099769, jVar6.t().getContext().getTheme()), getResources().getColor(2131099654, jVar6.t().getContext().getTheme()), false, 4096, null));
                            jVar6.t().setActivated((jVar6.nr() == iIntValue && jVar6.rl() == iIntValue2) ? z3 : false);
                            jVar6.t().setOnClickListener(new View.OnClickListener() { // from class: KC.fuX
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    Q.ul(jVar6, listListOf, this, view2);
                                }
                            });
                            Iterator it2 = jVar6.n().iterator();
                            while (it2.hasNext()) {
                                ((View) it2.next()).setOnClickListener(new View.OnClickListener() { // from class: KC.Pl
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        Q.n1(jVar6, listListOf, this, view2);
                                    }
                                });
                            }
                            z2 = z3;
                        }
                        ResolutionDropdown resolutionDropdown = B().f9539T;
                        List<w6O> listSortedWith = CollectionsKt.sortedWith(r.rl(), new Wre());
                        resolutionDropdown.setItems(listSortedWith);
                        if (com.alightcreative.app.motion.persist.j.INSTANCE.getProjectsCreated() == 0) {
                            Iterator it3 = j.Pl.f69244n.n().iterator();
                            if (!it3.hasNext()) {
                                throw new NoSuchElementException();
                            }
                            int iT = ((kPg.aC) it3.next()).t();
                            while (it3.hasNext()) {
                                int iT2 = ((kPg.aC) it3.next()).t();
                                if (iT < iT2) {
                                    iT = iT2;
                                }
                            }
                            int iIntValue3 = 1080;
                            if (iT < 1440 && (jVarInvoke = a().invoke()) != null && (numQie = jVarInvoke.qie()) != null) {
                                iIntValue3 = numQie.intValue();
                            }
                            com.alightcreative.app.motion.persist.j jVar7 = com.alightcreative.app.motion.persist.j.INSTANCE;
                            for (w6O w6o : listSortedWith) {
                                if (w6o.t() <= iIntValue3) {
                                    jVar7.setNewProjectRes(w6o.t());
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        resolutionDropdown.setOnItemSelectedListener(new Function1() { // from class: KC.Xo
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Q.Rl(this.f5157n, (w6O) obj);
                            }
                        });
                        FpsDropdown fpsDropdown = B().iF;
                        Intrinsics.checkNotNull(fpsDropdown);
                        pJg(fpsDropdown);
                        Iterator<Integer> it4 = SceneKt.getSTANDARD_FRAME_RATES().iterator();
                        int i5 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                i5 = -1;
                                break;
                            } else if (it4.next().intValue() == com.alightcreative.app.motion.persist.j.INSTANCE.getNewProjectFps()) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        fpsDropdown.setSelectedIndex(RangesKt.coerceAtMost(i5, fpsDropdown.getItems().size() - 1));
                        fpsDropdown.setOnItemSelectedListener(new Function1() { // from class: KC.eO
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Q.qm(this.f5171n, ((Integer) obj).intValue());
                            }
                        });
                        ColorDropdown colorDropdown = B().f9541Z;
                        SolidColor solidColorO = com.alightcreative.app.motion.persist.n.O(j.n.f45862n);
                        String string3 = getString(2132017311);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        com.alightcreative.app.motion.activities.FKk fKk = new com.alightcreative.app.motion.activities.FKk(solidColorO, string3);
                        SolidColor solidColorO2 = com.alightcreative.app.motion.persist.n.O(j.n.f45865t);
                        String string4 = getString(2132017316);
                        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                        com.alightcreative.app.motion.activities.FKk fKk2 = new com.alightcreative.app.motion.activities.FKk(solidColorO2, string4);
                        SolidColor solidColorO3 = com.alightcreative.app.motion.persist.n.O(j.n.f45859O);
                        String string5 = getString(2132017314);
                        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                        com.alightcreative.app.motion.activities.FKk fKk3 = new com.alightcreative.app.motion.activities.FKk(solidColorO3, string5);
                        SolidColor solidColorO4 = com.alightcreative.app.motion.persist.n.O(j.n.J2);
                        String string6 = getString(2132017313);
                        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                        com.alightcreative.app.motion.activities.FKk fKk4 = new com.alightcreative.app.motion.activities.FKk(solidColorO4, string6);
                        SolidColor solidColorO5 = com.alightcreative.app.motion.persist.n.O(j.n.f45864r);
                        String string7 = getString(2132017312);
                        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                        com.alightcreative.app.motion.activities.FKk fKk5 = new com.alightcreative.app.motion.activities.FKk(solidColorO5, string7);
                        SolidColor solidColorO6 = com.alightcreative.app.motion.persist.n.O(j.n.f45863o);
                        String string8 = getString(2132017315);
                        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                        List listListOf2 = CollectionsKt.listOf((Object[]) new com.alightcreative.app.motion.activities.FKk[]{fKk, fKk2, fKk3, fKk4, fKk5, new com.alightcreative.app.motion.activities.FKk(solidColorO6, string8)});
                        colorDropdown.setItems(listListOf2);
                        Iterator it5 = listListOf2.iterator();
                        int i7 = 0;
                        while (true) {
                            if (!it5.hasNext()) {
                                i2 = -1;
                                break;
                            } else {
                                if (Intrinsics.areEqual(((com.alightcreative.app.motion.activities.FKk) it5.next()).n(), com.alightcreative.app.motion.persist.n.O(com.alightcreative.app.motion.persist.j.INSTANCE.getNewProjectBg()))) {
                                    i2 = i7;
                                    break;
                                }
                                i7++;
                            }
                        }
                        colorDropdown.setSelectedIndex(i2);
                        colorDropdown.setOnItemSelectedListener(new Function1() { // from class: KC.z
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Q.mYa(this.f5251n, (com.alightcreative.app.motion.activities.FKk) obj);
                            }
                        });
                        B().f9538S.setOnClickListener(new View.OnClickListener() { // from class: KC.QJ
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Q.Org(this.f5129n, view, view2);
                            }
                        });
                        C(B());
                        return;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    private final boolean Nxk(int width, int height) {
        return width >= 32 && height >= 32 && width <= 4096 && height <= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Po6(Q q2, View view) {
        q2.sceneType = SceneType.SCENE;
        String string = StringsKt.trim((CharSequence) q2.B().E2.getText().toString()).toString();
        String str = q2.defaultElementName;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("defaultElementName");
            str = null;
        }
        if (Intrinsics.areEqual(string, str)) {
            EditText editText = q2.B().E2;
            String str3 = q2.defaultProjectName;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("defaultProjectName");
            } else {
                str2 = str3;
            }
            editText.setText(str2);
        }
        SJ0.mz mzVar = q2._binding;
        if (mzVar != null) {
            q2.C(mzVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Rl(Q q2, w6O it) {
        Intrinsics.checkNotNullParameter(it, "it");
        q2.dR0(it.t());
        return Unit.INSTANCE;
    }

    private final void Y(Context context) {
        Pair pair;
        List listSplit$default = StringsKt.split$default((CharSequence) com.alightcreative.app.motion.persist.j.INSTANCE.getNewProjectAspect(), new String[]{":"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
            arrayList.add(Integer.valueOf(intOrNull != null ? intOrNull.intValue() : -1));
        }
        int iIntValue = ((Number) arrayList.get(0)).intValue();
        int iIntValue2 = ((Number) arrayList.get(1)).intValue();
        if (iIntValue <= 0 || iIntValue2 <= 0) {
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            pair = TuplesKt.to(Integer.valueOf(jVar.getNewProjectCustomWidth()), Integer.valueOf(jVar.getNewProjectCustomHeight()));
        } else if (iIntValue < iIntValue2) {
            com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
            pair = TuplesKt.to(Integer.valueOf(jVar2.getNewProjectRes()), Integer.valueOf((jVar2.getNewProjectRes() * iIntValue2) / iIntValue));
        } else {
            com.alightcreative.app.motion.persist.j jVar3 = com.alightcreative.app.motion.persist.j.INSTANCE;
            pair = TuplesKt.to(Integer.valueOf((jVar3.getNewProjectRes() * iIntValue) / iIntValue2), Integer.valueOf(jVar3.getNewProjectRes()));
        }
        final int iIntValue3 = ((Number) pair.component1()).intValue();
        final int iIntValue4 = ((Number) pair.component2()).intValue();
        if (!Nxk(iIntValue3, iIntValue4)) {
            ijL(context);
            return;
        }
        final String string = StringsKt.trim((CharSequence) B().E2.getText().toString()).toString();
        if (StringsKt.isBlank(string)) {
            eTf(context);
            return;
        }
        EditText projectName = B().E2;
        Intrinsics.checkNotNullExpressionValue(projectName, "projectName");
        HI0.o7q.KN(projectName);
        if (this.wasCreationHookTriggered) {
            FX(context, iIntValue3, iIntValue4, string);
            return;
        }
        nYs.j jVarInvoke = a().invoke();
        if (jVarInvoke == null || !jVarInvoke.Xw()) {
            J().r(xAo.eO.f75275n, new Function1() { // from class: KC.C
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Q.k(this.f5039n, iIntValue3, iIntValue4, string, (ComponentActivity) obj);
                }
            });
        } else {
            GJW.C.nr(LifecycleOwnerKt.n(this), null, null, new w6(iIntValue3, iIntValue4, string, null), 3, null);
        }
    }

    private final void dR0(int resolutionShortDimension) {
        FpsDropdown fpsDropdown;
        com.alightcreative.app.motion.persist.j.INSTANCE.setNewProjectRes(resolutionShortDimension);
        SJ0.mz mzVar = this._binding;
        if (mzVar != null) {
            C(mzVar);
        }
        SJ0.mz mzVar2 = this._binding;
        if (mzVar2 == null || (fpsDropdown = mzVar2.iF) == null) {
            return;
        }
        pJg(fpsDropdown);
        fpsDropdown.setSelectedIndex(RangesKt.coerceAtMost(fpsDropdown.getSelectedIndex(), fpsDropdown.getItems().size() - 1));
    }

    private final void eTf(Context context) {
        com.alightcreative.app.motion.activities.R6 r6 = new com.alightcreative.app.motion.activities.R6(context);
        int i2 = n.$EnumSwitchMapping$1[this.sceneType.ordinal()];
        int i3 = 2132019968;
        if (i2 != 1 && i2 == 2) {
            i3 = 2132018941;
        }
        r6.mUb(i3).nr(2132017536).xMQ(2132017378, new Function1() { // from class: KC.qz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Q.xg((DialogInterface) obj);
            }
        }).gh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eWT(Q q2, View view, boolean z2) {
        if (z2) {
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            q2.newProjectCustomWidthRatio = jVar.getNewProjectCustomWidth() / jVar.getNewProjectCustomHeight();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fcU(Q q2, View view, boolean z2) {
        if (z2) {
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            q2.newProjectCustomWidthRatio = jVar.getNewProjectCustomWidth() / jVar.getNewProjectCustomHeight();
        }
    }

    private final void ijL(Context context) {
        com.alightcreative.app.motion.activities.R6 r6 = new com.alightcreative.app.motion.activities.R6(context);
        int i2 = n.$EnumSwitchMapping$1[this.sceneType.ordinal()];
        int i3 = 2132019968;
        if (i2 != 1 && i2 == 2) {
            i3 = 2132018941;
        }
        r6.mUb(i3).nr(2132017535).xMQ(2132017378, new Function1() { // from class: KC.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Q.m((DialogInterface) obj);
            }
        }).gh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Q q2, int i2, int i3, String str, ComponentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        q2.wasCreationHookTriggered = true;
        q2.FX(activity, i2, i3, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mYa(Q q2, com.alightcreative.app.motion.activities.FKk item) {
        Intrinsics.checkNotNullParameter(item, "item");
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        for (j.n nVar : j.n.values()) {
            if (Intrinsics.areEqual(com.alightcreative.app.motion.persist.n.O(nVar), item.n())) {
                jVar.setNewProjectBg(nVar);
                SJ0.mz mzVar = q2._binding;
                if (mzVar != null) {
                    q2.C(mzVar);
                }
                return Unit.INSTANCE;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n1(j jVar, List list, Q q2, View view) {
        com.alightcreative.app.motion.persist.j.INSTANCE.setNewProjectAspect(jVar.nr() + ":" + jVar.rl());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((j) it.next()).t().setActivated(false);
        }
        jVar.t().setActivated(true);
        SJ0.mz mzVar = q2._binding;
        if (mzVar != null) {
            q2.C(mzVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String piY() {
        return "Failed to query the purchase state.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qm(Q q2, int i2) {
        com.alightcreative.app.motion.persist.j.INSTANCE.setNewProjectFps(i2);
        SJ0.mz mzVar = q2._binding;
        if (mzVar != null) {
            q2.C(mzVar);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ul(j jVar, List list, Q q2, View view) {
        com.alightcreative.app.motion.persist.j.INSTANCE.setNewProjectAspect(jVar.nr() + ":" + jVar.rl());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((j) it.next()).t().setActivated(false);
        }
        jVar.t().setActivated(true);
        SJ0.mz mzVar = q2._binding;
        if (mzVar != null) {
            q2.C(mzVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xg(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(Q q2, com.alightcreative.account.o it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i2 = n.$EnumSwitchMapping$0[it.xMQ().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                XoT.C.mUb(q2, new Function0() { // from class: KC.aC
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Q.piY();
                    }
                });
                return;
            } else {
                if (i2 != 3 && i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        Set setUo = q2.I().Uo();
        Set set = q2.currentBenefits;
        List list = null;
        if (set == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentBenefits");
            set = null;
        }
        if (Intrinsics.areEqual(setUo, set)) {
            List listIk = q2.I().Ik();
            List list2 = q2.currentLicenses;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentLicenses");
            } else {
                list = list2;
            }
            if (Intrinsics.areEqual(listIk, list)) {
                return;
            }
        }
        q2.ofS();
        q2.Mx();
    }

    public final QmE.iF D() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final InterfaceC2210n GR() {
        InterfaceC2210n interfaceC2210n = this.injet;
        if (interfaceC2210n != null) {
            return interfaceC2210n;
        }
        Intrinsics.throwUninitializedPropertyAccessException("injet");
        return null;
    }

    public final kgE.fuX I() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    public final xAo.I28 J() {
        xAo.I28 i28 = this.crisperManager;
        if (i28 != null) {
            return i28;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crisperManager");
        return null;
    }

    public final nYs.Ml a() {
        nYs.Ml ml = this.getAlightSettingsUseCase;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getAlightSettingsUseCase");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        SceneType sceneTypeNr;
        six.CN3 cn3N;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = SJ0.mz.t(inflater, container, false);
        KeyEventDispatcher.Component activity = getActivity();
        M.Um um = activity instanceof M.Um ? (M.Um) activity : null;
        if (um == null || (cn3N = um.n()) == null || (sceneTypeNr = cn3N.nr()) == null) {
            sceneTypeNr = SceneType.SCENE;
        }
        this.sceneType = sceneTypeNr;
        ConstraintLayout root = B().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ofS();
        Mx();
        kgE.Sis.gh(this.purchaseStateObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GD(Q q2, View view) {
        if (q2.isAdded()) {
            q2.getParentFragmentManager().Zmq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Org(Q q2, View view, View view2) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        q2.Y(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hRu(Q q2, View view) {
        q2.B().E2.setText("");
        q2.B().E2.requestFocus();
        EditText projectName = q2.B().E2;
        Intrinsics.checkNotNullExpressionValue(projectName, "projectName");
        HI0.o7q.ck(projectName);
    }

    private final void ofS() {
        this.currentBenefits = I().Uo();
        this.currentLicenses = I().Ik();
    }

    private final void pJg(FpsDropdown fpsDropdown) {
        List<Integer> standard_frame_rates = SceneKt.getSTANDARD_FRAME_RATES();
        ArrayList arrayList = new ArrayList();
        for (Object obj : standard_frame_rates) {
            if (((Number) obj).intValue() >= 35) {
                com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                if (jVar.getNewProjectRes() < jVar.getMaxResWithVideo()) {
                }
            }
            arrayList.add(obj);
        }
        fpsDropdown.setItems(arrayList);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        kgE.Sis.ty(this.purchaseStateObserver);
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EditText projectName = B().E2;
        Intrinsics.checkNotNullExpressionValue(projectName, "projectName");
        HI0.o7q.KN(projectName);
    }
}
