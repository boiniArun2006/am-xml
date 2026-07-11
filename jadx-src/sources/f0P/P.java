package f0P;

import LdY.Ml;
import QmE.j;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.view.ComponentActivity;
import com.alightcreative.app.motion.activities.edit.TryIcon;
import com.alightcreative.app.motion.easing.BounceEasing;
import com.alightcreative.app.motion.easing.CubicBezierEasing;
import com.alightcreative.app.motion.easing.CyclicEasing;
import com.alightcreative.app.motion.easing.Easing;
import com.alightcreative.app.motion.easing.EasingKt;
import com.alightcreative.app.motion.easing.EasingUtilsKt;
import com.alightcreative.app.motion.easing.ElasticEasing;
import com.alightcreative.app.motion.easing.ElasticStepEasing;
import com.alightcreative.app.motion.easing.LinearEasing;
import com.alightcreative.app.motion.easing.RandomEasing;
import com.alightcreative.app.motion.easing.SplittableEasing;
import com.alightcreative.app.motion.easing.StepEasing;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.Keyframe;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import yc.InterfaceC2452g;
import yc.tpM;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0007\u0018\u0000 \u0084\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006\u0085\u0001\u0086\u0001\u0087\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\t*\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\t*\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\t*\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\t*\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\t*\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u0006J\u0019\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J+\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020&2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010\u0006J)\u00102\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020/\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u000201000.0-H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u0010\u0006J\u000f\u00105\u001a\u00020\tH\u0016¢\u0006\u0004\b5\u0010\u0006R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R0\u0010d\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020/\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u000201000.0-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bb\u0010cR\u001c\u0010g\u001a\b\u0012\u0004\u0012\u00020e0-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010cR\u0016\u0010j\u001a\u00020h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010;R\u0016\u0010l\u001a\u00020h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010;R\u0016\u0010n\u001a\u00020h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010;R\u0018\u0010r\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010v\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010z\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010|\u001a\u00020h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010;R\u0017\u0010\u0080\u0001\u001a\u00020}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0017\u0010\u0083\u0001\u001a\u0002068BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0088\u0001"}, d2 = {"Lf0P/P;", "Lyc/g;", "Lyc/H;", "Lyc/tpM;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lcom/alightcreative/app/motion/easing/Easing;", "defaultEasing", "", "o9", "(Lcom/alightcreative/app/motion/easing/Easing;)V", "Landroid/app/Activity;", "easing", "v0j", "(Landroid/app/Activity;Lcom/alightcreative/app/motion/easing/Easing;)V", "Aum", "g6", "vl", "mYa", "HV", "ul", "()Lcom/alightcreative/app/motion/easing/Easing;", "JVN", "(Landroid/app/Activity;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onStop", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "LoA/j;", "Lcom/alightcreative/app/motion/scene/SceneElement;", "Lcom/alightcreative/app/motion/scene/Keyable;", "", "rl", "()Ljava/util/List;", "gh", "nr", "LSJ0/h6y;", "o", "LSJ0/h6y;", "_binding", "LkgE/fuX;", "Z", "LkgE/fuX;", "qm", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LQ/fuX;", "S", "LQ/fuX;", "Rl", "()LQ/fuX;", "setFeatureUnlockManager", "(LQ/fuX;)V", "featureUnlockManager", "LQmE/iF;", "g", "LQmE/iF;", "Jk", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LxAo/I28;", "E2", "LxAo/I28;", "eWT", "()LxAo/I28;", "setCrisperManager", "(LxAo/I28;)V", "crisperManager", "LnYs/Ml;", "e", "LnYs/Ml;", "getGetAlightSettingsUseCase", "()LnYs/Ml;", "setGetAlightSettingsUseCase", "(LnYs/Ml;)V", "getAlightSettingsUseCase", "X", "Ljava/util/List;", "keyableRefs", "Lf0P/P$w6;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "easingTypes", "", "N", "showedTrialPopup", "v", "disableNonSplittableEasing", "Xw", "disableOvershoot", "LLdY/Ml$j;", "jB", "LLdY/Ml$j;", "undoBatch", "", "U", "I", "startDragSelectedKeyframeIndex", "", "P5", "Ljava/lang/String;", "updatedEasingDebugLabel", "M7", "lockOvershootOn", "", "p5", "F", "segmentEndTime", "fcU", "()LSJ0/h6y;", "binding", "eF", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "w6", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimationCurveFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationCurveFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/AnimationCurveFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,751:1\n1#2:752\n11158#3:753\n11493#3,3:754\n1863#4,2:757\n1557#4:759\n1628#4,3:760\n774#4:763\n865#4,2:764\n230#4,2:766\n230#4,2:768\n1557#4:770\n1628#4,3:771\n774#4:774\n865#4,2:775\n230#4,2:777\n230#4,2:779\n1863#4,2:781\n1863#4,2:783\n1863#4,2:785\n1863#4,2:787\n295#4:789\n1755#4,3:790\n296#4:793\n1863#4,2:794\n295#4,2:796\n1557#4:798\n1628#4,3:799\n774#4:802\n865#4,2:803\n1557#4:805\n1628#4,3:806\n774#4:809\n865#4,2:810\n360#4,7:812\n1797#4,3:821\n1797#4,3:824\n1069#5,2:819\n*S KotlinDebug\n*F\n+ 1 AnimationCurveFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/AnimationCurveFragment\n*L\n154#1:753\n154#1:754,3\n286#1:757,2\n560#1:759\n560#1:760,3\n560#1:763\n560#1:764,2\n563#1:766,2\n564#1:768,2\n574#1:770\n574#1:771,3\n574#1:774\n574#1:775,2\n577#1:777,2\n578#1:779,2\n621#1:781,2\n622#1:783,2\n645#1:785,2\n686#1:787,2\n688#1:789\n689#1:790,3\n688#1:793\n697#1:794,2\n723#1:796,2\n732#1:798\n732#1:799,3\n732#1:802\n732#1:803,2\n733#1:805\n733#1:806,3\n733#1:809\n733#1:810,2\n310#1:812,7\n519#1:821,3\n534#1:824,3\n347#1:819,2\n*E\n"})
public final class P extends tM implements InterfaceC2452g, yc.H, yc.tpM {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    public xAo.I28 crisperManager;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private boolean lockOvershootOn;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private boolean showedTrialPopup;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private String updatedEasingDebugLabel;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public Q.fuX featureUnlockManager;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private List keyableRefs;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private boolean disableOvershoot;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Ml.j undoBatch;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private SJ0.h6y _binding;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean disableNonSplittableEasing;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f64581E = 8;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private List easingTypes = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private int startDragSelectedKeyframeIndex = -1;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private float segmentEndTime = Float.MIN_VALUE;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    /* synthetic */ class Ml extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ml f64592n = new Ml();

        Ml() {
            super(1, CharsKt.class, "isWhitespace", "isWhitespace(C)Z", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n(((Character) obj).charValue());
        }

        public final Boolean n(char c2) {
            return Boolean.valueOf(CharsKt.isWhitespace(c2));
        }
    }

    /* JADX INFO: renamed from: f0P.P$j, reason: from kotlin metadata */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ P rl(Companion companion, List list, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                z2 = false;
            }
            if ((i2 & 4) != 0) {
                z3 = false;
            }
            return companion.n(list, z2, z3);
        }

        public final P n(List keyableRefs, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(keyableRefs, "keyableRefs");
            P p2 = new P();
            Bundle bundle = new Bundle();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyableRefs, 10));
            Iterator it = keyableRefs.iterator();
            while (it.hasNext()) {
                arrayList.add(((oA.j) it.next()).toString());
            }
            bundle.putStringArray("keyableRefs", (String[]) arrayList.toArray(new String[0]));
            bundle.putBoolean("disableNonSplittableEasing", z2);
            bundle.putBoolean("disableOvershoot", z3);
            p2.setArguments(bundle);
            return p2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class n {
        private final Easing J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final boolean f64593O;
        private final Function1 Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final View f64594n;
        private final AppCompatImageView nr;
        private final ImageButton rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f64595t;

        public n(View holder, ImageButton button, int i2, AppCompatImageView badge, boolean z2, Easing defaultEasing, Function1 predicate) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(defaultEasing, "defaultEasing");
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            this.f64594n = holder;
            this.rl = button;
            this.f64595t = i2;
            this.nr = badge;
            this.f64593O = z2;
            this.J2 = defaultEasing;
            this.Uo = predicate;
        }

        public final Function1 J2() {
            return this.Uo;
        }

        public final int O() {
            return this.f64595t;
        }

        public final boolean Uo() {
            return this.f64593O;
        }

        public final AppCompatImageView n() {
            return this.nr;
        }

        public final View nr() {
            return this.f64594n;
        }

        public final ImageButton rl() {
            return this.rl;
        }

        public final Easing t() {
            return this.J2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final View f64596n;
        private final List nr;
        private final View rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final View f64597t;

        public w6(View button, View cue, View view, List buttons) {
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(cue, "cue");
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            this.f64596n = button;
            this.rl = cue;
            this.f64597t = view;
            this.nr = buttons;
        }

        public final View n() {
            return this.f64596n;
        }

        public final View nr() {
            return this.f64597t;
        }

        public final List rl() {
            return this.nr;
        }

        public final View t() {
            return this.rl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T3L(P p2) {
        p2.lockOvershootOn = false;
        com.alightcreative.app.motion.persist.j.INSTANCE.setEasingOvershoot(false);
        FragmentActivity activity = p2.getActivity();
        if (activity != null) {
            p2.JVN(activity);
        }
        return Unit.INSTANCE;
    }

    private final void Aum(final Activity activity, final Easing easing) {
        HW.C.J(activity, new Function2() { // from class: f0P.g9s
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return P.s(activity, this, easing, (Scene) obj, (SceneElement) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Bu(P p2) {
        com.alightcreative.app.motion.persist.j.INSTANCE.setEasingOvershoot(true);
        FragmentActivity activity = p2.getActivity();
        if (activity != null) {
            p2.JVN(activity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyframe EF(float f3, Keyable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Keyframe) KeyableKt.closestSurroundingTime(it, f3).getSecond();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String EWS(P p2) {
        List list = p2.keyableRefs;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyableRefs");
            list = null;
        }
        return "onCreate: keyableRefs=" + list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable GD(SceneElement sceneElement, oA.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Keyable) it.O(sceneElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HBN(Easing it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it, CubicBezierEasing.INSTANCE.getEASE_IN())) {
            return true;
        }
        if (!(it instanceof CubicBezierEasing)) {
            return false;
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) it;
        return cubicBezierEasing.getP1x() > 0.0f && Math.abs(cubicBezierEasing.getP1y()) < 1.0E-4f && Math.abs(cubicBezierEasing.getP2x() - 1.0f) < 0.001f && cubicBezierEasing.getP2y() <= 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean How(Easing it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof StepEasing;
    }

    private final void JVN(Activity activity) {
        Pair pairClosestSurroundingTime;
        Object next;
        Object next2;
        if (!isAdded() || getView() == null) {
            return;
        }
        Iterator it = CollectionsKt.listOf((Object[]) new RelativeLayout[]{fcU().J2, fcU().xMQ, fcU().qie, fcU().HI}).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            RelativeLayout relativeLayout = (RelativeLayout) it.next();
            relativeLayout.setActivated(false);
            relativeLayout.setVisibility(8);
            relativeLayout.setEnabled(false);
        }
        Iterator it2 = this.easingTypes.iterator();
        while (true) {
            int i2 = 4;
            if (!it2.hasNext()) {
                break;
            }
            w6 w6Var = (w6) it2.next();
            w6Var.n().setActivated(false);
            w6Var.t().setVisibility(4);
            boolean zJ2 = Rl().J2();
            View viewNr = w6Var.nr();
            if (viewNr != null) {
                if (!qm().Uo().contains(kgE.K.f70075X) && !zJ2 && !this.disableNonSplittableEasing) {
                    i2 = 0;
                }
                viewNr.setVisibility(i2);
            }
        }
        final SceneElement sceneElementT = HW.C.T(activity);
        if (sceneElementT == null) {
            return;
        }
        final float fFractionalTime = SceneElementKt.fractionalTime(sceneElementT, HW.C.XQ(activity));
        List list = this.keyableRefs;
        List list2 = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyableRefs");
            list = null;
        }
        Sequence map = SequencesKt.map(SequencesKt.filterNotNull(SequencesKt.map(CollectionsKt.asSequence(list), new Function1() { // from class: f0P.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P.xVH(sceneElementT, (oA.j) obj);
            }
        })), new Function1() { // from class: f0P.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P.EF(fFractionalTime, (Keyable) obj);
            }
        });
        if (!p4.ty(HW.C.fD(activity)) || this.startDragSelectedKeyframeIndex < 0) {
            List list3 = this.keyableRefs;
            if (list3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("keyableRefs");
                list3 = null;
            }
            Keyable keyable = (Keyable) SequencesKt.firstOrNull(SequencesKt.filterNotNull(SequencesKt.map(CollectionsKt.asSequence(list3), new Function1() { // from class: f0P.Q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P.uG(sceneElementT, (oA.j) obj);
                }
            })));
            if (keyable == null || (pairClosestSurroundingTime = KeyableKt.closestSurroundingTime(keyable, fFractionalTime)) == null) {
                pairClosestSurroundingTime = TuplesKt.to(null, null);
            }
        } else {
            pairClosestSurroundingTime = TuplesKt.to(CollectionsKt.getOrNull(sceneElementT.getTimeMapping().getItemKeyable().getKeyframes(), this.startDragSelectedKeyframeIndex - 1), sceneElementT.getTimeMapping().getItemKeyable().getKeyframes().get(this.startDragSelectedKeyframeIndex));
        }
        Keyframe keyframe = (Keyframe) pairClosestSurroundingTime.component1();
        final Keyframe keyframe2 = (Keyframe) pairClosestSurroundingTime.component2();
        float time = keyframe2 != null ? keyframe2.getTime() : Float.MAX_VALUE;
        boolean z2 = this.segmentEndTime == time;
        this.segmentEndTime = time;
        if (keyframe2 == null || keyframe == null) {
            fcU().Ik.setEnabled(false);
            Iterator it3 = this.easingTypes.iterator();
            while (it3.hasNext()) {
                ((w6) it3.next()).n().setEnabled(false);
            }
            fcU().ck.setText("");
            fcU().f9470T.setEnabled(false);
            fcU().f9470T.setAlpha(0.5f);
            fcU().f9470T.setActivated(false);
        } else {
            ClosedFloatingPointRange<Float> uIVisualRange = EasingKt.getUIVisualRange(keyframe2.getEasing());
            fcU().Ik.setEnabled(true);
            fcU().Ik.setT((fFractionalTime - keyframe.getTime()) / (keyframe2.getTime() - keyframe.getTime()));
            fcU().Ik.setOtherEasings(SequencesKt.toList(SequencesKt.filter(SequencesKt.mapNotNull(SequencesKt.drop(map, 1), new Function1() { // from class: f0P.qf
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P.Vvq((Keyframe) obj);
                }
            }), new Function1() { // from class: f0P.Lu
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(P.y(keyframe2, (Easing) obj));
                }
            })));
            fcU().Ik.setEasing(keyframe2.getEasing());
            if (!EasingKt.isBasic(keyframe2.getEasing()) || (!(com.alightcreative.app.motion.persist.j.INSTANCE.getEasingOvershoot() || EasingKt.getRequiresManualOvershoot(keyframe2.getEasing()) || (this.lockOvershootOn && z2)) || this.disableOvershoot)) {
                this.lockOvershootOn = false;
                fcU().Ik.setMinValue(uIVisualRange.getStart().floatValue());
                fcU().Ik.setMaxValue(uIVisualRange.getEndInclusive().floatValue());
                fcU().Ik.setAllowOvershoot(false);
            } else {
                this.lockOvershootOn = true;
                fcU().Ik.setMinValue(-2.0f);
                fcU().Ik.setMaxValue(3.0f);
                fcU().Ik.setAllowOvershoot(true);
            }
            if (EasingKt.isReversible(keyframe2.getEasing())) {
                fcU().f9470T.setEnabled(true);
                fcU().f9470T.setAlpha(1.0f);
                fcU().f9470T.setActivated(EasingKt.isReversed(keyframe2.getEasing()));
            } else {
                fcU().f9470T.setEnabled(false);
                fcU().f9470T.setAlpha(0.5f);
                fcU().f9470T.setActivated(false);
            }
            int labelResource = EasingKt.getLabelResource(keyframe2.getEasing());
            if (labelResource != 0) {
                fcU().ck.setText(labelResource);
            } else {
                fcU().ck.setText("");
            }
            Iterator it4 = this.easingTypes.iterator();
            while (it4.hasNext()) {
                ((w6) it4.next()).n().setEnabled(true);
            }
            Iterator it5 = this.easingTypes.iterator();
            loop3: while (true) {
                if (!it5.hasNext()) {
                    next = null;
                    break;
                }
                next = it5.next();
                List listRl = ((w6) next).rl();
                if (listRl == null || !listRl.isEmpty()) {
                    Iterator it6 = listRl.iterator();
                    while (it6.hasNext()) {
                        if (((Boolean) ((n) it6.next()).J2().invoke(EasingKt.getUnwrapped(keyframe2.getEasing()))).booleanValue()) {
                            break loop3;
                        }
                    }
                }
            }
            w6 w6Var2 = (w6) next;
            if (w6Var2 != null) {
                w6Var2.n().setActivated(true);
                View viewNr2 = w6Var2.nr();
                if (viewNr2 != null) {
                    viewNr2.setVisibility(4);
                }
                w6Var2.t().setVisibility(0);
                for (final n nVar : w6Var2.rl()) {
                    nVar.nr().setEnabled(true);
                    nVar.rl().setImageResource(nVar.O());
                    nVar.nr().setVisibility(0);
                    nVar.nr().setOnClickListener(new View.OnClickListener() { // from class: f0P.h
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            P.Zn(this.f65603n, nVar, view);
                        }
                    });
                    Set setUo = qm().Uo();
                    kgE.K k2 = kgE.K.f70075X;
                    nVar.n().setVisibility((!nVar.Uo() || (setUo.contains(k2) || Rl().J2())) ? 4 : 0);
                    Context context = getContext();
                    if (context != null) {
                        nVar.n().setImageDrawable(AppCompatResources.rl(context, !qm().Uo().contains(k2) ? 2131231825 : 2131231824));
                    }
                }
                if (!Intrinsics.areEqual(EasingKt.getUnwrapped(keyframe2.getEasing()), LinearEasing.INSTANCE) && !(EasingKt.getUnwrapped(keyframe2.getEasing()) instanceof CubicBezierEasing)) {
                    Iterator it7 = w6Var2.rl().iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            next2 = it7.next();
                            if (((Boolean) ((n) next2).J2().invoke(EasingKt.getUnwrapped(keyframe2.getEasing()))).booleanValue()) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    n nVar2 = (n) next2;
                    if (nVar2 != null && w6Var2.n().getId() != fcU().f9477r.getId()) {
                        nVar2.nr().setActivated(true);
                    }
                }
            }
        }
        List list4 = this.keyableRefs;
        if (list4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyableRefs");
        } else {
            list2 = list4;
        }
        Keyable keyable2 = (Keyable) SequencesKt.firstOrNull(SequencesKt.filterNotNull(SequencesKt.map(CollectionsKt.asSequence(list2), new Function1() { // from class: f0P.K
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P.nO(sceneElementT, (oA.j) obj);
            }
        })));
        if (keyable2 != null) {
            List keyframes = keyable2.getKeyframes();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
            Iterator it8 = keyframes.iterator();
            while (it8.hasNext()) {
                arrayList.add(Float.valueOf(((Keyframe) it8.next()).getTime()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Number) obj).floatValue() < fFractionalTime) {
                    arrayList2.add(obj);
                }
            }
            List listSorted = CollectionsKt.sorted(arrayList2);
            List keyframes2 = keyable2.getKeyframes();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes2, 10));
            Iterator it9 = keyframes2.iterator();
            while (it9.hasNext()) {
                arrayList3.add(Float.valueOf(((Keyframe) it9.next()).getTime()));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                if (((Number) obj2).floatValue() > fFractionalTime) {
                    arrayList4.add(obj2);
                }
            }
            List listSorted2 = CollectionsKt.sorted(arrayList4);
            fcU().f9473e.setEnabled(listSorted.size() >= 2);
            fcU().E2.setEnabled(listSorted2.size() >= 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K(Easing it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof RandomEasing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable Lp6(P p2, Easing easing, Keyable speedValue) {
        Intrinsics.checkNotNullParameter(speedValue, "speedValue");
        return KeyableKt.copyWithEasingForTime(speedValue, p2.startDragSelectedKeyframeIndex > 0 ? ((Keyframe) speedValue.getKeyframes().get(p2.startDragSelectedKeyframeIndex - 1)).getTime() : p4.qie(p2), easing);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement Mh(Activity activity, P p2, final Easing easing, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        if (p4.ty(HW.C.fD(activity))) {
            return p4.ck(el, new Function1() { // from class: f0P.rv6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P.jO(easing, (Keyable) obj);
                }
            });
        }
        List list = p2.keyableRefs;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyableRefs");
            list = null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            el = (SceneElement) ((oA.j) it.next()).t(el, new Function1() { // from class: f0P.vd
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P.Toy(easing, (Keyable) obj);
                }
            });
        }
        return el;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable Org(SceneElement sceneElement, oA.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Keyable) it.O(sceneElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Po6(String[] strArr) {
        return "onCreate: ref=[" + ArraysKt.joinToString$default(strArr, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean QZ6(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return !StringsKt.isBlank(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Qu(Easing it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof LinearEasing) {
            return true;
        }
        if (!(it instanceof CubicBezierEasing)) {
            return false;
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) it;
        return cubicBezierEasing.getP1x() == cubicBezierEasing.getP1y() && cubicBezierEasing.getP2x() == cubicBezierEasing.getP2y() && cubicBezierEasing.getP2x() > cubicBezierEasing.getP1x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable Toy(Easing easing, Keyable keyable) {
        Intrinsics.checkNotNullParameter(keyable, "keyable");
        return KeyableKt.copyWithEasingToAllKeyframe(keyable, easing);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UF(Easing it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it, CubicBezierEasing.INSTANCE.getEASE_OUT())) {
            return true;
        }
        if (!(it instanceof CubicBezierEasing)) {
            return false;
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) it;
        return Math.abs(cubicBezierEasing.getP2y() - 1.0f) < 1.0E-4f && Math.abs(cubicBezierEasing.getP1x()) < 0.001f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uf(P p2, ComponentActivity activity) {
        String strSerializeToString;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Easing easing = p2.fcU().Ik.getEasing();
        if (Intrinsics.areEqual(easing, LinearEasing.INSTANCE)) {
            strSerializeToString = "0.25 0.25 0.75 0.75";
        } else if (easing instanceof CubicBezierEasing) {
            CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) easing;
            strSerializeToString = String.format(Locale.US, "%.02f %.02f %.02f %.02f", Arrays.copyOf(new Object[]{Float.valueOf(cubicBezierEasing.getP1x()), Float.valueOf(cubicBezierEasing.getP1y()), Float.valueOf(cubicBezierEasing.getP2x()), Float.valueOf(cubicBezierEasing.getP2y())}, 4));
            Intrinsics.checkNotNullExpressionValue(strSerializeToString, "format(...)");
        } else {
            strSerializeToString = easing.serializeToString();
        }
        HI0.afx.O(activity).setPrimaryClip(ClipData.newPlainText(p2.getString(2132017725), strSerializeToString));
        Toast.makeText(activity, "Copied '" + strSerializeToString + "'", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UhV(Easing it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof ElasticEasing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Easing Vvq(Keyframe keyframe) {
        if (keyframe != null) {
            return keyframe.getEasing();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable VwL(SceneElement sceneElement, oA.j lens) {
        Intrinsics.checkNotNullParameter(lens, "lens");
        return (Keyable) lens.O(sceneElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean X4T(Easing it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it, CubicBezierEasing.INSTANCE.getEASE_IN_OUT()) || (it instanceof CubicBezierEasing);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Zmq(Easing it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof BounceEasing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Zn(P p2, n nVar, View view) {
        if (p2.showedTrialPopup || !nVar.Uo()) {
            FragmentActivity activity = p2.getActivity();
            if (activity != null) {
                p2.vl(activity, nVar.t());
                return;
            }
            return;
        }
        if (!p2.qm().Uo().contains(kgE.K.f70075X) && !p2.Rl().J2()) {
            p2.o9(nVar.t());
            return;
        }
        FragmentActivity activity2 = p2.getActivity();
        if (activity2 != null) {
            p2.vl(activity2, nVar.t());
        }
    }

    private final SJ0.h6y fcU() {
        SJ0.h6y h6yVar = this._binding;
        Intrinsics.checkNotNull(h6yVar);
        return h6yVar;
    }

    private final void g6(final Activity activity, final Easing easing) {
        HW.C.J(activity, new Function2() { // from class: f0P.M
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return P.Mh(activity, this, easing, (Scene) obj, (SceneElement) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String hRu(String str) {
        return "easing_applied: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(Easing it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof CyclicEasing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable jO(Easing easing, Keyable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return KeyableKt.copyWithEasingToAllKeyframe(it, easing);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mI(P p2) {
        com.alightcreative.app.motion.persist.j.INSTANCE.setEasingOvershoot(true);
        FragmentActivity activity = p2.getActivity();
        if (activity != null) {
            p2.JVN(activity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable n1(SceneElement sceneElement, oA.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Keyable) it.O(sceneElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable nO(SceneElement sceneElement, oA.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Keyable) it.O(sceneElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement s(Activity activity, final P p2, final Easing easing, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        if (p4.ty(HW.C.fD(activity))) {
            return p4.ck(el, new Function1() { // from class: f0P.lej
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P.Lp6(this.f65763n, easing, (Keyable) obj);
                }
            });
        }
        List<oA.j> list = p2.keyableRefs;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyableRefs");
            list = null;
        }
        for (oA.j jVar : list) {
            el = (SceneElement) jVar.rl(el, KeyableKt.copyWithEasingForTime((Keyable) jVar.get(el), HW.C.aYN(p2), easing));
        }
        return el;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float tFV(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return StringsKt.toFloatOrNull(StringsKt.trim((CharSequence) string).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean tUK(Easing it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof ElasticStepEasing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable uG(SceneElement sceneElement, oA.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Keyable) it.O(sceneElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable xVH(SceneElement sceneElement, oA.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Keyable) it.O(sceneElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y(Keyframe keyframe, Easing it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !Intrinsics.areEqual(it, keyframe.getEasing());
    }

    public final QmE.iF Jk() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final Q.fuX Rl() {
        Q.fuX fux = this.featureUnlockManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("featureUnlockManager");
        return null;
    }

    public final xAo.I28 eWT() {
        xAo.I28 i28 = this.crisperManager;
        if (i28 != null) {
            return i28;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crisperManager");
        return null;
    }

    @Override // f0P.tM, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Jk().n(new j.fuX("edit_animation_timing_curve", null, 2, null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = SJ0.h6y.t(inflater, container, false);
        ConstraintLayout constraintLayoutRl = fcU().getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutRl, "getRoot(...)");
        return constraintLayoutRl;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        HI0.o7q.gh(view);
        ImageButton easingTypeBezier = fcU().f9477r;
        Intrinsics.checkNotNullExpressionValue(easingTypeBezier, "easingTypeBezier");
        AppCompatImageView easingTypeBezierCue = fcU().f9476o;
        Intrinsics.checkNotNullExpressionValue(easingTypeBezierCue, "easingTypeBezierCue");
        RelativeLayout curve0Holder = fcU().J2;
        Intrinsics.checkNotNullExpressionValue(curve0Holder, "curve0Holder");
        ImageButton curve0 = fcU().nr;
        Intrinsics.checkNotNullExpressionValue(curve0, "curve0");
        AppCompatImageView curve0Badge = fcU().f9468O;
        Intrinsics.checkNotNullExpressionValue(curve0Badge, "curve0Badge");
        n nVar = new n(curve0Holder, curve0, 2131231680, curve0Badge, false, LinearEasing.INSTANCE, new Function1() { // from class: f0P.psW
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(P.Qu((Easing) obj));
            }
        });
        RelativeLayout curve1Holder = fcU().xMQ;
        Intrinsics.checkNotNullExpressionValue(curve1Holder, "curve1Holder");
        ImageButton curve1 = fcU().Uo;
        Intrinsics.checkNotNullExpressionValue(curve1, "curve1");
        AppCompatImageView curve1Badge = fcU().KN;
        Intrinsics.checkNotNullExpressionValue(curve1Badge, "curve1Badge");
        CubicBezierEasing.Companion companion = CubicBezierEasing.INSTANCE;
        n nVar2 = new n(curve1Holder, curve1, 2131231671, curve1Badge, false, companion.getEASE_IN(), new Function1() { // from class: f0P.Dsr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(P.HBN((Easing) obj));
            }
        });
        RelativeLayout curve2Holder = fcU().qie;
        Intrinsics.checkNotNullExpressionValue(curve2Holder, "curve2Holder");
        ImageButton curve2 = fcU().mUb;
        Intrinsics.checkNotNullExpressionValue(curve2, "curve2");
        AppCompatImageView curve2Badge = fcU().gh;
        Intrinsics.checkNotNullExpressionValue(curve2Badge, "curve2Badge");
        n nVar3 = new n(curve2Holder, curve2, 2131231673, curve2Badge, false, companion.getEASE_OUT(), new Function1() { // from class: f0P.aC
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(P.UF((Easing) obj));
            }
        });
        RelativeLayout curve3Holder = fcU().HI;
        Intrinsics.checkNotNullExpressionValue(curve3Holder, "curve3Holder");
        ImageButton curve3 = fcU().az;
        Intrinsics.checkNotNullExpressionValue(curve3, "curve3");
        AppCompatImageView curve3Badge = fcU().ty;
        Intrinsics.checkNotNullExpressionValue(curve3Badge, "curve3Badge");
        w6 w6Var = new w6(easingTypeBezier, easingTypeBezierCue, null, CollectionsKt.listOf((Object[]) new n[]{nVar, nVar2, nVar3, new n(curve3Holder, curve3, 2131231672, curve3Badge, false, companion.getEASE_IN_OUT(), new Function1() { // from class: f0P.C
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(P.X4T((Easing) obj));
            }
        })}));
        RelativeLayout easingTypeBounceHolder = fcU().f9469S;
        Intrinsics.checkNotNullExpressionValue(easingTypeBounceHolder, "easingTypeBounceHolder");
        AppCompatImageView easingTypeBounceCue = fcU().XQ;
        Intrinsics.checkNotNullExpressionValue(easingTypeBounceCue, "easingTypeBounceCue");
        TryIcon tryIcon = fcU().f9467N;
        RelativeLayout curve0Holder2 = fcU().J2;
        Intrinsics.checkNotNullExpressionValue(curve0Holder2, "curve0Holder");
        ImageButton curve02 = fcU().nr;
        Intrinsics.checkNotNullExpressionValue(curve02, "curve0");
        AppCompatImageView curve0Badge2 = fcU().f9468O;
        Intrinsics.checkNotNullExpressionValue(curve0Badge2, "curve0Badge");
        n nVar4 = new n(curve0Holder2, curve02, 2131231674, curve0Badge2, true, BounceEasing.INSTANCE.getDEFAULT(), new Function1() { // from class: f0P.qz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(P.Zmq((Easing) obj));
            }
        });
        RelativeLayout curve1Holder2 = fcU().xMQ;
        Intrinsics.checkNotNullExpressionValue(curve1Holder2, "curve1Holder");
        ImageButton curve12 = fcU().Uo;
        Intrinsics.checkNotNullExpressionValue(curve12, "curve1");
        AppCompatImageView curve1Badge2 = fcU().KN;
        Intrinsics.checkNotNullExpressionValue(curve1Badge2, "curve1Badge");
        n nVar5 = new n(curve1Holder2, curve12, 2131231677, curve1Badge2, true, ElasticEasing.INSTANCE.getDEFAULT(), new Function1() { // from class: f0P.Pl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(P.UhV((Easing) obj));
            }
        });
        RelativeLayout curve2Holder2 = fcU().qie;
        Intrinsics.checkNotNullExpressionValue(curve2Holder2, "curve2Holder");
        ImageButton curve22 = fcU().mUb;
        Intrinsics.checkNotNullExpressionValue(curve22, "curve2");
        AppCompatImageView curve2Badge2 = fcU().gh;
        Intrinsics.checkNotNullExpressionValue(curve2Badge2, "curve2Badge");
        n nVar6 = new n(curve2Holder2, curve22, 2131231681, curve2Badge2, true, CyclicEasing.INSTANCE.getDEFAULT(), new Function1() { // from class: f0P.Xo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(P.i((Easing) obj));
            }
        });
        RelativeLayout curve3Holder2 = fcU().HI;
        Intrinsics.checkNotNullExpressionValue(curve3Holder2, "curve3Holder");
        ImageButton curve32 = fcU().az;
        Intrinsics.checkNotNullExpressionValue(curve32, "curve3");
        AppCompatImageView curve3Badge2 = fcU().ty;
        Intrinsics.checkNotNullExpressionValue(curve3Badge2, "curve3Badge");
        w6 w6Var2 = new w6(easingTypeBounceHolder, easingTypeBounceCue, tryIcon, CollectionsKt.listOf((Object[]) new n[]{nVar4, nVar5, nVar6, new n(curve3Holder2, curve32, 2131231682, curve3Badge2, true, RandomEasing.INSTANCE.getDEFAULT(), new Function1() { // from class: f0P.eO
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(P.K((Easing) obj));
            }
        })}));
        RelativeLayout easingTypeStepsHolder = fcU().f9474g;
        Intrinsics.checkNotNullExpressionValue(easingTypeStepsHolder, "easingTypeStepsHolder");
        AppCompatImageView appCompatImageView = fcU().nY;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, YmsTEL.jdBgJ);
        TryIcon tryIcon2 = fcU().nHg;
        RelativeLayout curve0Holder3 = fcU().J2;
        Intrinsics.checkNotNullExpressionValue(curve0Holder3, "curve0Holder");
        ImageButton curve03 = fcU().nr;
        Intrinsics.checkNotNullExpressionValue(curve03, "curve0");
        AppCompatImageView curve0Badge3 = fcU().f9468O;
        Intrinsics.checkNotNullExpressionValue(curve0Badge3, "curve0Badge");
        n nVar7 = new n(curve0Holder3, curve03, 2131231685, curve0Badge3, true, StepEasing.INSTANCE.getDEFAULT(), new Function1() { // from class: f0P.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(P.How((Easing) obj));
            }
        });
        RelativeLayout curve1Holder3 = fcU().xMQ;
        Intrinsics.checkNotNullExpressionValue(curve1Holder3, "curve1Holder");
        ImageButton curve13 = fcU().Uo;
        Intrinsics.checkNotNullExpressionValue(curve13, "curve1");
        AppCompatImageView curve1Badge3 = fcU().KN;
        Intrinsics.checkNotNullExpressionValue(curve1Badge3, "curve1Badge");
        this.easingTypes = CollectionsKt.listOf((Object[]) new w6[]{w6Var, w6Var2, new w6(easingTypeStepsHolder, appCompatImageView, tryIcon2, CollectionsKt.listOf((Object[]) new n[]{nVar7, new n(curve1Holder3, curve13, 2131231684, curve1Badge3, true, ElasticStepEasing.INSTANCE.getDEFAULT(), new Function1() { // from class: f0P.QJ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(P.tUK((Easing) obj));
            }
        })}))});
        fcU().WPU.setVisibility(8);
        fcU().aYN.setVisibility(8);
        for (final w6 w6Var3 : this.easingTypes) {
            w6Var3.n().setOnClickListener(new View.OnClickListener() { // from class: f0P.Md
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    P.ER(this.f64487n, w6Var3, view2);
                }
            });
            if (this.disableNonSplittableEasing && w6Var3.n().getId() != fcU().f9477r.getId()) {
                w6Var3.n().setClickable(false);
                w6Var3.n().setAlpha(0.25f);
            }
        }
        fcU().f9478t.setOnClickListener(new View.OnClickListener() { // from class: f0P.Zs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                P.lLA(this.f65340n, view2);
            }
        });
        fcU().Ik.setOnStartTrackingTouch(new Function0() { // from class: f0P.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.kSg(this.f65805n);
            }
        });
        fcU().Ik.setOnStopTrackingTouch(new Function0() { // from class: f0P.w6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.W(this.f66285n);
            }
        });
        fcU().Ik.setOnValueChange(new Function0() { // from class: f0P.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.RQ(this.f64491n);
            }
        });
        fcU().f9470T.setOnClickListener(new View.OnClickListener() { // from class: f0P.I28
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                P.a63(this.f64344n, view2);
            }
        });
        fcU().f9471X.setOnClickListener(new View.OnClickListener() { // from class: f0P.Wre
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                P.F(this.f65072n, view2);
            }
        });
        fcU().E2.setOnClickListener(new View.OnClickListener() { // from class: f0P.CN3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                P.f(this.f64109n, view2);
            }
        });
        fcU().f9473e.setOnClickListener(new View.OnClickListener() { // from class: f0P.fuX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                P.ub(this.f65565n, view2);
            }
        });
        FragmentActivity activity = getActivity();
        if (activity != null) {
            JVN(activity);
        }
    }

    public final kgE.fuX qm() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    @Override // yc.tpM
    public List rl() {
        List list = this.keyableRefs;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("keyableRefs");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ER(P p2, w6 w6Var, View view) {
        boolean zContains = p2.qm().Uo().contains(kgE.K.f70075X);
        if (!p2.showedTrialPopup && w6Var.nr() != null) {
            if (!zContains && !p2.Rl().J2()) {
                p2.o9(((n) CollectionsKt.first(w6Var.rl())).t());
                return;
            }
            FragmentActivity activity = p2.getActivity();
            if (activity != null) {
                p2.vl(activity, ((n) CollectionsKt.first(w6Var.rl())).t());
                return;
            }
            return;
        }
        FragmentActivity activity2 = p2.getActivity();
        if (activity2 != null) {
            p2.vl(activity2, ((n) CollectionsKt.first(w6Var.rl())).t());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void F(final P p2, View view) {
        final Easing cubicBezierEasing;
        int size;
        List keyframes;
        String string;
        ClipboardManager clipboardManagerO;
        ClipData primaryClip;
        ClipData.Item itemAt;
        CharSequence text;
        FragmentActivity activity = p2.getActivity();
        if (activity != null) {
            com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(activity, p2.qm(), false, 4, null);
            List list = null;
            if (HI0.afx.O(activity).hasPrimaryClip()) {
                FragmentActivity activity2 = p2.getActivity();
                if (activity2 != null && (clipboardManagerO = HI0.afx.O(activity2)) != null && (primaryClip = clipboardManagerO.getPrimaryClip()) != null && (itemAt = primaryClip.getItemAt(0)) != null && (text = itemAt.getText()) != null) {
                    string = text.toString();
                } else {
                    string = null;
                }
                if (string != null) {
                    if (Intrinsics.areEqual(string, "0.25 0.25 0.75 0.75")) {
                        cubicBezierEasing = LinearEasing.INSTANCE;
                    } else {
                        int i2 = 0;
                        while (true) {
                            if (i2 < string.length()) {
                                char cCharAt = string.charAt(i2);
                                if (!CharsKt.isWhitespace(cCharAt) && !Character.isDigit(cCharAt) && cCharAt != '.' && cCharAt != ',' && cCharAt != '-') {
                                    cubicBezierEasing = EasingUtilsKt.easingFromSerializedString(string, false);
                                    break;
                                }
                                i2++;
                            } else {
                                List list2 = SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.filter(HI0.gnv.Ik(StringsKt.trim((CharSequence) string).toString(), Ml.f64592n, 0, 2, null), new Function1() { // from class: f0P.afx
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Boolean.valueOf(P.QZ6((String) obj));
                                    }
                                }), new Function1() { // from class: f0P.Z
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return P.tFV((String) obj);
                                    }
                                }));
                                if (list2.size() >= 4) {
                                    if (((Number) list2.get(0)).floatValue() == ((Number) list2.get(1)).floatValue() && ((Number) list2.get(2)).floatValue() == ((Number) list2.get(3)).floatValue()) {
                                        cubicBezierEasing = LinearEasing.INSTANCE;
                                    } else {
                                        cubicBezierEasing = new CubicBezierEasing(((Number) list2.get(0)).floatValue(), ((Number) list2.get(1)).floatValue(), ((Number) list2.get(2)).floatValue(), ((Number) list2.get(3)).floatValue());
                                    }
                                }
                            }
                        }
                        cubicBezierEasing = null;
                    }
                }
            } else {
                cubicBezierEasing = null;
            }
            if (EasingKt.getAdvanced(p2.ul())) {
                Set setUo = p2.qm().Uo();
                kgE.K k2 = kgE.K.f70075X;
                if (!setUo.contains(k2)) {
                    com.alightcreative.widget.nKK.XQ(nkk, SetsKt.setOf(k2), 2132017508, 2131361896, 0, 8, null);
                } else {
                    com.alightcreative.widget.nKK.ty(nkk, 2132017508, 2131361894, 0, false, null, 28, null);
                }
            }
            com.alightcreative.widget.nKK.ty(nkk, 2132019828, 2131361944, 0, false, null, 28, null);
            if (cubicBezierEasing == null || ((p2.disableNonSplittableEasing && !(cubicBezierEasing instanceof SplittableEasing)) || (p2.disableOvershoot && EasingKt.getRequiresManualOvershoot(cubicBezierEasing)))) {
                nkk.nY();
            }
            final SceneElement sceneElementNHg = HW.C.nHg(p2);
            if (sceneElementNHg != null) {
                List list3 = p2.keyableRefs;
                if (list3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("keyableRefs");
                } else {
                    list = list3;
                }
                Keyable keyable = (Keyable) SequencesKt.firstOrNull(SequencesKt.filterNotNull(SequencesKt.map(CollectionsKt.asSequence(list), new Function1() { // from class: f0P.Ew
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return P.VwL(sceneElementNHg, (oA.j) obj);
                    }
                })));
                if (keyable != null && (keyframes = keyable.getKeyframes()) != null) {
                    size = keyframes.size();
                }
            } else {
                size = 0;
            }
            com.alightcreative.widget.nKK.ty(nkk, 2132019829, 2131361945, 0, false, null, 28, null);
            if (cubicBezierEasing == null || size <= 2 || ((p2.disableNonSplittableEasing && !(cubicBezierEasing instanceof SplittableEasing)) || (p2.disableOvershoot && EasingKt.getRequiresManualOvershoot(cubicBezierEasing)))) {
                nkk.nY();
            }
            Easing easingUl = p2.ul();
            if (EasingKt.isBasic(easingUl)) {
                if (EasingKt.getRequiresManualOvershoot(easingUl)) {
                    com.alightcreative.widget.nKK.HI(nkk, 2132017685, 0, false, null, new Function0() { // from class: f0P.nKK
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return P.mI(this.f65812n);
                        }
                    }, 14, null);
                    nkk.nY();
                } else {
                    if (p2.disableOvershoot) {
                        com.alightcreative.app.motion.persist.j.INSTANCE.setEasingOvershoot(false);
                    }
                    if (com.alightcreative.app.motion.persist.j.INSTANCE.getEasingOvershoot()) {
                        com.alightcreative.widget.nKK.HI(nkk, 2132017685, 0, false, null, new Function0() { // from class: f0P.DAz
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return P.T3L(this.f64135n);
                            }
                        }, 14, null);
                    } else {
                        com.alightcreative.widget.nKK.HI(nkk, 2132018952, 0, false, null, new Function0() { // from class: f0P.u
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return P.Bu(this.f66240n);
                            }
                        }, 14, null);
                    }
                    if (p2.disableOvershoot) {
                        nkk.nY();
                    }
                }
            }
            nkk.fD(new Function1() { // from class: f0P.Ln
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P.p0N(this.f64456n, cubicBezierEasing, ((Integer) obj).intValue());
                }
            });
            nkk.X(p2.getResources().getDimensionPixelSize(2131166272));
            Intrinsics.checkNotNull(view);
            com.alightcreative.widget.nKK.N(nkk, view, 0, 0, null, 14, null);
        }
    }

    private final void HV() {
        final SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null) {
            float fFractionalTime = SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this));
            List list = this.keyableRefs;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("keyableRefs");
                list = null;
            }
            Keyable keyable = (Keyable) SequencesKt.firstOrNull(SequencesKt.filterNotNull(SequencesKt.map(CollectionsKt.asSequence(list), new Function1() { // from class: f0P.SPz
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P.GD(sceneElementNHg, (oA.j) obj);
                }
            })));
            if (keyable != null) {
                List keyframes = keyable.getKeyframes();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
                Iterator it = keyframes.iterator();
                while (it.hasNext()) {
                    arrayList.add(Float.valueOf(((Keyframe) it.next()).getTime()));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((Number) obj).floatValue() < fFractionalTime) {
                        arrayList2.add(obj);
                    }
                }
                List listSorted = CollectionsKt.sorted(arrayList2);
                if (listSorted.size() >= 2) {
                    for (Keyframe keyframe : keyable.getKeyframes()) {
                        if (keyframe.getTime() == ((Number) listSorted.get(listSorted.size() - 1)).floatValue()) {
                            for (Keyframe keyframe2 : keyable.getKeyframes()) {
                                if (keyframe2.getTime() == ((Number) listSorted.get(listSorted.size() - 2)).floatValue()) {
                                    HW.C.FX(this, SceneElementKt.sceneTime(sceneElementNHg, (keyframe.getTime() + keyframe2.getTime()) / 2.0f));
                                    return;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RQ(P p2) {
        FragmentActivity activity = p2.getActivity();
        if (activity != null) {
            p2.Aum(activity, p2.fcU().Ik.getEasing());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(P p2) {
        rWZ.C cRl;
        QmE.iF iFVarJk = p2.Jk();
        String strViF = HW.C.ViF(p2);
        SceneElement sceneElementNHg = HW.C.nHg(p2);
        if (sceneElementNHg != null) {
            cRl = rWZ.j.rl(sceneElementNHg);
        } else {
            cRl = null;
        }
        iFVarJk.n(new j.DC(strViF, cRl, EasingKt.getExportSnapshotLabel(p2.fcU().Ik.getEasing())));
        Ml.j jVar = p2.undoBatch;
        if (jVar != null) {
            jVar.n();
        }
        if (p2.startDragSelectedKeyframeIndex != -1) {
            p2.startDragSelectedKeyframeIndex = -1;
            FragmentActivity activity = p2.getActivity();
            if (activity != null) {
                p2.JVN(activity);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a63(P p2, View view) {
        FragmentActivity activity = p2.getActivity();
        if (activity != null) {
            p2.vl(activity, EasingKt.reversed(p2.ul()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(P p2, View view) {
        p2.mYa();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit kSg(P p2) {
        p2.undoBatch = HW.C.xMQ(p2);
        SceneElement sceneElementNHg = HW.C.nHg(p2);
        if (sceneElementNHg != null) {
            float fQie = p4.qie(p2);
            Iterator<Keyframe<Float>> it = sceneElementNHg.getSpeedMap().getKeyframes().iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getTime() >= fQie) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            p2.startDragSelectedKeyframeIndex = i2;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lLA(P p2, View view) {
        if (p2.isAdded()) {
            p2.getParentFragmentManager().Zmq();
        }
    }

    private final void mYa() {
        final SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null) {
            float fFractionalTime = SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this));
            List list = this.keyableRefs;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("keyableRefs");
                list = null;
            }
            Keyable keyable = (Keyable) SequencesKt.firstOrNull(SequencesKt.filterNotNull(SequencesKt.map(CollectionsKt.asSequence(list), new Function1() { // from class: f0P.ci
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P.Org(sceneElementNHg, (oA.j) obj);
                }
            })));
            if (keyable != null) {
                List keyframes = keyable.getKeyframes();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
                Iterator it = keyframes.iterator();
                while (it.hasNext()) {
                    arrayList.add(Float.valueOf(((Keyframe) it.next()).getTime()));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((Number) obj).floatValue() > fFractionalTime) {
                        arrayList2.add(obj);
                    }
                }
                List listSortedDescending = CollectionsKt.sortedDescending(arrayList2);
                if (listSortedDescending.size() >= 2) {
                    for (Keyframe keyframe : keyable.getKeyframes()) {
                        if (keyframe.getTime() == ((Number) listSortedDescending.get(listSortedDescending.size() - 1)).floatValue()) {
                            for (Keyframe keyframe2 : keyable.getKeyframes()) {
                                if (keyframe2.getTime() == ((Number) listSortedDescending.get(listSortedDescending.size() - 2)).floatValue()) {
                                    HW.C.FX(this, SceneElementKt.sceneTime(sceneElementNHg, (keyframe.getTime() + keyframe2.getTime()) / 2.0f));
                                    return;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n7b(P p2, Easing easing) {
        FragmentActivity activity = p2.getActivity();
        if (activity != null) {
            p2.vl(activity, easing);
        }
        return Unit.INSTANCE;
    }

    private final void o9(final Easing defaultEasing) {
        Q.fuX fuxRl = Rl();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        fuxRl.n(fragmentActivityRequireActivity, new Function0() { // from class: f0P.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.n7b(this.f66085n, defaultEasing);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0N(final P p2, Easing easing, int i2) {
        String strSerializeToString;
        ClipboardManager clipboardManagerO;
        FragmentActivity activity;
        FragmentActivity activity2;
        switch (i2) {
            case 2131361894:
                Easing easing2 = p2.fcU().Ik.getEasing();
                if (Intrinsics.areEqual(easing2, LinearEasing.INSTANCE)) {
                    strSerializeToString = "0.25 0.25 0.75 0.75";
                } else if (easing2 instanceof CubicBezierEasing) {
                    CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) easing2;
                    strSerializeToString = String.format(Locale.US, "%.02f %.02f %.02f %.02f", Arrays.copyOf(new Object[]{Float.valueOf(cubicBezierEasing.getP1x()), Float.valueOf(cubicBezierEasing.getP1y()), Float.valueOf(cubicBezierEasing.getP2x()), Float.valueOf(cubicBezierEasing.getP2y())}, 4));
                    Intrinsics.checkNotNullExpressionValue(strSerializeToString, "format(...)");
                } else {
                    strSerializeToString = easing2.serializeToString();
                }
                FragmentActivity activity3 = p2.getActivity();
                if (activity3 != null && (clipboardManagerO = HI0.afx.O(activity3)) != null) {
                    clipboardManagerO.setPrimaryClip(ClipData.newPlainText(p2.getString(2132017725), strSerializeToString));
                }
                Toast.makeText(p2.getActivity(), "Copied '" + strSerializeToString + "'", 0).show();
                break;
            case 2131361896:
                p2.eWT().r(xAo.C.f75216n, new Function1() { // from class: f0P.iwV
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return P.Uf(this.f65671n, (ComponentActivity) obj);
                    }
                });
                break;
            case 2131361944:
                if (easing != null && (activity = p2.getActivity()) != null) {
                    p2.vl(activity, easing);
                }
                break;
            case 2131361945:
                if (easing != null && (activity2 = p2.getActivity()) != null) {
                    p2.v0j(activity2, easing);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ub(P p2, View view) {
        p2.HV();
    }

    private final Easing ul() {
        Pair pairClosestSurroundingTime;
        Easing easing;
        final SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null) {
            return LinearEasing.INSTANCE;
        }
        if (p4.ty(HW.C.e(this)) && this.startDragSelectedKeyframeIndex >= 0) {
            return sceneElementNHg.getSpeedMap().getKeyframes().get(this.startDragSelectedKeyframeIndex).getEasing();
        }
        float fFractionalTime = SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this));
        List list = this.keyableRefs;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyableRefs");
            list = null;
        }
        Keyable keyable = (Keyable) SequencesKt.firstOrNull(SequencesKt.filterNotNull(SequencesKt.map(CollectionsKt.asSequence(list), new Function1() { // from class: f0P.UGc
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P.n1(sceneElementNHg, (oA.j) obj);
            }
        })));
        if (keyable == null || (pairClosestSurroundingTime = KeyableKt.closestSurroundingTime(keyable, fFractionalTime)) == null) {
            pairClosestSurroundingTime = TuplesKt.to(null, null);
        }
        Keyframe keyframe = (Keyframe) pairClosestSurroundingTime.component2();
        if (keyframe != null && (easing = keyframe.getEasing()) != null) {
            return easing;
        }
        return LinearEasing.INSTANCE;
    }

    private final void v0j(Activity activity, Easing easing) {
        SceneElement sceneElementT = HW.C.T(activity);
        if (sceneElementT == null) {
            return;
        }
        Jk().n(new j.Ogx(HW.C.ViF(this), rWZ.j.rl(sceneElementT), EasingKt.getExportSnapshotLabel(easing)));
        g6(activity, easing);
        this.updatedEasingDebugLabel = EasingKt.getDebugLabel(easing);
        JVN(activity);
    }

    private final void vl(Activity activity, Easing easing) {
        SceneElement sceneElementT = HW.C.T(activity);
        if (sceneElementT == null) {
            return;
        }
        Jk().n(new j.Ogx(HW.C.ViF(this), rWZ.j.rl(sceneElementT), EasingKt.getExportSnapshotLabel(easing)));
        Aum(activity, easing);
        this.updatedEasingDebugLabel = EasingKt.getDebugLabel(easing);
        JVN(activity);
    }

    @Override // yc.tpM
    public int O() {
        return tpM.j.n(this);
    }

    @Override // yc.InterfaceC2452g
    public void gh() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            JVN(activity);
        }
    }

    @Override // yc.H
    public void nr() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            JVN(activity);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        final String[] stringArray;
        boolean z2;
        boolean z3;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (stringArray = arguments.getStringArray("keyableRefs")) == null) {
            stringArray = new String[0];
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z2 = arguments2.getBoolean("disableNonSplittableEasing");
        } else {
            z2 = false;
        }
        this.disableNonSplittableEasing = z2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            z3 = arguments3.getBoolean("disableOvershoot");
        } else {
            z3 = false;
        }
        this.disableOvershoot = z3;
        XoT.C.Uo(this, new Function0() { // from class: f0P.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.Po6(stringArray);
            }
        });
        ArrayList arrayList = new ArrayList(stringArray.length);
        for (String str : stringArray) {
            Intrinsics.checkNotNull(str);
            arrayList.add(oA.fuX.nr(str));
        }
        this.keyableRefs = arrayList;
        XoT.C.Uo(this, new Function0() { // from class: f0P.s4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.EWS(this.f66152n);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        final String str = this.updatedEasingDebugLabel;
        if (str != null) {
            XoT.C.Uo(this, new Function0() { // from class: f0P.l3D
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P.hRu(str);
                }
            });
            QmE.iF iFVarJk = Jk();
            Bundle bundle = new Bundle();
            bundle.putString("easing_type", str);
            Unit unit = Unit.INSTANCE;
            iFVarJk.n(new j.fuX("easing_applied", bundle));
        }
    }
}
