package Y;

import QmE.j;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alightcreative.app.motion.activities.effectbrowser.EffectBrowserActivity;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import yc.V;
import yc.xq;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 V2\u00020\u0001:\u0001WB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J!\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000bJ-\u0010\u0014\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\u0003J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R>\u0010G\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060C0Bj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060C`D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010IR$\u0010R\u001a\u00020\u00132\u0006\u0010M\u001a\u00020\u00138\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006X"}, d2 = {"LY/LEl;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "eTf", "Lyc/V;", "tag", "LY/c7r;", "source", "E", "(Lyc/V;LY/c7r;)V", "Y", "U", "", "Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;", "effects", "", "position", "", "ijL", "(Ljava/util/List;ILjava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onPause", "onDestroyView", "eF", "(Lyc/V;)V", "LSJ0/RzR;", "o", "LSJ0/RzR;", "_binding", "LkgE/fuX;", "Z", "LkgE/fuX;", "J", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LQ/fuX;", "S", "LQ/fuX;", "B", "()LQ/fuX;", "setFeatureUnlockManager", "(LQ/fuX;)V", "featureUnlockManager", "LQmE/iF;", "g", "LQmE/iF;", "FX", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "Lkotlin/collections/ArrayList;", "E2", "Ljava/util/ArrayList;", "searchTagList", "e", "Ljava/util/List;", "allVisualEffect", "X", "allTag", "value", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/String;", "piY", "(Ljava/lang/String;)V", "searchText", "M", "()LSJ0/RzR;", "binding", "N", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEffectSearchFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EffectSearchFragment.kt\ncom/alightcreative/app/motion/activities/effectbrowser/EffectSearchFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,527:1\n3829#2:528\n4344#2:529\n4345#2:533\n1310#2,2:534\n1755#3,3:530\n774#3:536\n865#3,2:537\n1368#3:539\n1454#3,2:540\n1557#3:542\n1628#3,3:543\n1456#3,3:546\n1557#3:549\n1628#3,2:550\n1782#3,4:552\n1630#3:556\n1062#3:557\n1557#3:558\n1628#3,3:559\n774#3:562\n865#3,2:563\n1053#3:565\n1557#3:566\n1628#3,3:567\n774#3:570\n865#3,2:571\n774#3:573\n865#3,2:574\n774#3:576\n865#3,2:577\n1062#3:579\n1755#3,3:580\n1782#3,4:583\n1557#3:587\n1628#3,3:588\n37#4:591\n36#4,3:592\n*S KotlinDebug\n*F\n+ 1 EffectSearchFragment.kt\ncom/alightcreative/app/motion/activities/effectbrowser/EffectSearchFragment\n*L\n74#1:528\n74#1:529\n74#1:533\n100#1:534,2\n74#1:530,3\n103#1:536\n103#1:537,2\n129#1:539\n129#1:540,2\n129#1:542\n129#1:543,3\n129#1:546,3\n131#1:549\n131#1:550,2\n131#1:552,4\n131#1:556\n131#1:557\n132#1:558\n132#1:559,3\n204#1:562\n204#1:563,2\n209#1:565\n231#1:566\n231#1:567,3\n240#1:570\n240#1:571,2\n245#1:573\n245#1:574,2\n247#1:576\n247#1:577,2\n273#1:579\n302#1:580,3\n256#1:583,4\n346#1:587\n346#1:588,3\n346#1:591\n346#1:592,3\n*E\n"})
public final class LEl extends FKk {

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f11860v = 8;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private ArrayList searchTagList = new ArrayList();

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public Q.fuX featureUnlockManager;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private String searchText;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private final List allTag;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List allVisualEffect;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private SJ0.RzR _binding;

    public static final class CN3 implements Comparator {
        public CN3() {
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String string = LEl.this.getResources().getString(((V) obj).t());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Integer numValueOf = Integer.valueOf(StringsKt.indexOf((CharSequence) string, LEl.this.searchText, 0, true));
            String string2 = LEl.this.getResources().getString(((V) obj2).t());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(StringsKt.indexOf((CharSequence) string2, LEl.this.searchText, 0, true)));
        }
    }

    public static final class I28 implements Comparator {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ LEl f11869O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Context f11870n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f11871t;

        public I28(Context context, List list, LEl lEl) {
            this.f11870n = context;
            this.f11871t = list;
            this.f11869O = lEl;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            VisualEffect visualEffect = (VisualEffect) obj2;
            String strN = Iy.w6.n(visualEffect.getLocalizedStrings(), this.f11870n, visualEffect.getName());
            Iy.n localizedStrings = visualEffect.getLocalizedStrings();
            Context contextAz = XoT.fuX.az(this.f11870n);
            Intrinsics.checkNotNullExpressionValue(contextAz, "getEnglishContext(...)");
            Integer numValueOf = Integer.valueOf(LEl.dR0(7, this.f11871t, visualEffect.getTags()) + LEl.z(3, this.f11869O.searchText, strN) + LEl.z(2, this.f11869O.searchText, Iy.w6.n(localizedStrings, contextAz, visualEffect.getName())) + LEl.z(1, this.f11869O.searchText, Iy.w6.n(visualEffect.getLocalizedStrings(), this.f11870n, visualEffect.getDesc())));
            VisualEffect visualEffect2 = (VisualEffect) obj;
            String strN2 = Iy.w6.n(visualEffect2.getLocalizedStrings(), this.f11870n, visualEffect2.getName());
            Iy.n localizedStrings2 = visualEffect2.getLocalizedStrings();
            Context contextAz2 = XoT.fuX.az(this.f11870n);
            Intrinsics.checkNotNullExpressionValue(contextAz2, "getEnglishContext(...)");
            return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(LEl.dR0(7, this.f11871t, visualEffect2.getTags()) + LEl.z(3, this.f11869O.searchText, strN2) + LEl.z(2, this.f11869O.searchText, Iy.w6.n(localizedStrings2, contextAz2, visualEffect2.getName())) + LEl.z(1, this.f11869O.searchText, Iy.w6.n(visualEffect2.getLocalizedStrings(), this.f11870n, visualEffect2.getDesc()))));
        }
    }

    public static final class Ml implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues((Integer) ((Pair) obj2).getFirst(), (Integer) ((Pair) obj).getFirst());
        }
    }

    /* synthetic */ class Wre extends FunctionReferenceImpl implements Function3 {
        Wre(Object obj) {
            super(3, obj, LEl.class, "showEffectDetail", "showEffectDetail(Ljava/util/List;ILjava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((List) obj, ((Number) obj2).intValue(), (String) obj3);
            return Unit.INSTANCE;
        }

        public final void n(List p0, int i2, String p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p2, "p2");
            ((LEl) this.receiver).ijL(p0, i2, p2);
        }
    }

    /* synthetic */ class fuX extends FunctionReferenceImpl implements Function2 {
        fuX(Object obj) {
            super(2, obj, LEl.class, "conversionToTag", "conversionToTag(Lcom/alightcreative/app/motion/activities/edit/EffectTag;Lcom/alightcreative/app/motion/activities/effectbrowser/TagSource;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((V) obj, (c7r) obj2);
            return Unit.INSTANCE;
        }

        public final void n(V p0, c7r p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((LEl) this.receiver).E(p0, p1);
        }
    }

    /* JADX INFO: renamed from: Y.LEl$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LEl n(V tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            LEl lEl = new LEl();
            Bundle bundle = new Bundle();
            bundle.putString("TAG_ID", tag.rl());
            lEl.setArguments(bundle);
            return lEl;
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function2 {
        n(Object obj) {
            super(2, obj, LEl.class, "addTagToSearch", "addTagToSearch(Lcom/alightcreative/app/motion/activities/edit/EffectTag;Lcom/alightcreative/app/motion/activities/effectbrowser/TagSource;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((V) obj, (c7r) obj2);
            return Unit.INSTANCE;
        }

        public final void n(V p0, c7r p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((LEl) this.receiver).U(p0, p1);
        }
    }

    public static final class w6 implements TextWatcher {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Integer f11872n;

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s2, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(s2, "s");
        }

        w6() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s2) throws IOException {
            Object next;
            Intrinsics.checkNotNullParameter(s2, "s");
            if (this.f11872n != null) {
                if (LEl.this.searchTagList.size() > 0) {
                    Iterator it = LEl.this.searchTagList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        int iIntValue = ((Number) ((Pair) next).getFirst()).intValue();
                        Integer num = this.f11872n;
                        if (num != null && iIntValue == num.intValue()) {
                            break;
                        }
                    }
                    TypeIntrinsics.asMutableCollection(LEl.this.searchTagList).remove((Pair) next);
                }
                this.f11872n = null;
            }
            LEl lEl = LEl.this;
            String string = s2.toString();
            StringBuilder sb = new StringBuilder();
            int length = string.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = string.charAt(i2);
                if (!(57344 <= cCharAt && cCharAt < 63744)) {
                    sb.append(cCharAt);
                }
            }
            lEl.piY(StringsKt.trim((CharSequence) sb.toString()).toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s2, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(s2, "s");
            if (i3 > i5) {
                Editable text = LEl.this.M().Uo.getText();
                ImageSpan[] imageSpanArr = text != null ? (ImageSpan[]) text.getSpans(i2, i2 + 1, ImageSpan.class) : null;
                if (imageSpanArr == null || imageSpanArr.length == 0) {
                    return;
                }
                this.f11872n = Integer.valueOf(i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Nxk(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dR0(int i2, List list, List list2) {
        int i3 = 0;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (list.contains((V) it.next()) && (i3 = i3 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i3 * i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LEl lEl, EditText it) {
        Intrinsics.checkNotNullParameter(it, "it");
        lEl.searchTagList.clear();
        lEl.piY("");
        it.getText().clear();
        lEl.M().xMQ.setVisibility(0);
        lEl.M().KN.setVisibility(4);
        AppCompatEditText searchEdit = lEl.M().Uo;
        Intrinsics.checkNotNullExpressionValue(searchEdit, "searchEdit");
        HI0.o7q.ck(searchEdit);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(V tag, c7r source) {
        String str = this.searchText;
        int length = M().Uo.length();
        Editable text = M().Uo.getText();
        if (text != null) {
            text.delete(length - str.length(), length);
        }
        U(tag, source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GR(LEl lEl, View view, int i2, int i3, int i5, int i7) {
        SJ0.RzR rzR;
        AppCompatEditText appCompatEditText;
        if (i7 == 0 || (rzR = lEl._binding) == null || (appCompatEditText = rzR.Uo) == null) {
            return;
        }
        HI0.o7q.KN(appCompatEditText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SJ0.RzR M() {
        SJ0.RzR rzR = this._binding;
        Intrinsics.checkNotNull(rzR);
        return rzR;
    }

    static /* synthetic */ void P5(LEl lEl, V v2, c7r c7rVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c7rVar = c7r.f11943t;
        }
        lEl.U(v2, c7rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(LEl lEl, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (motionEvent.getAction() == 1) {
            AppCompatEditText searchEdit = lEl.M().Uo;
            Intrinsics.checkNotNullExpressionValue(searchEdit, "searchEdit");
            HI0.o7q.ck(searchEdit);
        }
        if (motionEvent.getAction() == 0) {
            lEl.M().Uo.requestFocus();
            lEl.M().Uo.setSelection(lEl.M().Uo.length());
        }
        return Unit.INSTANCE;
    }

    private static final boolean k(LEl lEl, Context context, VisualEffect visualEffect) {
        if (lEl.searchText.length() == 0) {
            return true;
        }
        String strN = Iy.w6.n(visualEffect.getLocalizedStrings(), context, visualEffect.getName());
        Iy.n localizedStrings = visualEffect.getLocalizedStrings();
        Context contextAz = XoT.fuX.az(context);
        Intrinsics.checkNotNullExpressionValue(contextAz, "getEnglishContext(...)");
        return StringsKt.contains((CharSequence) strN, (CharSequence) lEl.searchText, true) || StringsKt.contains((CharSequence) Iy.w6.n(localizedStrings, contextAz, visualEffect.getName()), (CharSequence) lEl.searchText, true) || StringsKt.contains((CharSequence) Iy.w6.n(visualEffect.getLocalizedStrings(), context, visualEffect.getDesc()), (CharSequence) lEl.searchText, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(LEl lEl, List list, int i2, String str) {
        Lu lu = new Lu();
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((VisualEffect) it.next()).getId());
        }
        bundle.putStringArray("effectListIds", (String[]) arrayList.toArray(new String[0]));
        bundle.putInt("currentEffectPosition", i2);
        bundle.putString("source", str);
        lu.setArguments(bundle);
        FragmentActivity activity = lEl.getActivity();
        EffectBrowserActivity effectBrowserActivity = activity instanceof EffectBrowserActivity ? (EffectBrowserActivity) activity : null;
        if (effectBrowserActivity != null) {
            effectBrowserActivity.RQ(lu);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void piY(String str) {
        if (Intrinsics.areEqual(this.searchText, str)) {
            return;
        }
        this.searchText = str;
        eTf();
        Y();
    }

    public final Q.fuX B() {
        Q.fuX fux = this.featureUnlockManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("featureUnlockManager");
        return null;
    }

    public final QmE.iF FX() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final kgE.fuX J() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    public final void eF(V tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.searchTagList.clear();
        piY("");
        Editable text = M().Uo.getText();
        if (text != null) {
            text.clear();
        }
        P5(this, tag, null, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = SJ0.RzR.t(inflater, container, false);
        ConstraintLayout constraintLayoutRl = M().getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutRl, "getRoot(...)");
        return constraintLayoutRl;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        V v2;
        int i2;
        Collection collectionEmptyList;
        List<V> tags;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        V[] vArrValues = V.values();
        int length = vArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                v2 = null;
                break;
            }
            v2 = vArrValues[i3];
            String strRl = v2.rl();
            Bundle arguments = getArguments();
            if (Intrinsics.areEqual(strRl, arguments != null ? arguments.getString("TAG_ID") : null)) {
                break;
            } else {
                i3++;
            }
        }
        M().J2.setOnClickListener(new View.OnClickListener() { // from class: Y.yg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LEl.Nxk(view2);
            }
        });
        List<VisualEffect> visualEffects = VisualEffectKt.getVisualEffects();
        ArrayList arrayList = new ArrayList();
        for (Object obj : visualEffects) {
            VisualEffect visualEffect = (VisualEffect) obj;
            if (!visualEffect.getInternal() && !visualEffect.getDeprecated() && (!visualEffect.getExperimental() || com.alightcreative.app.motion.persist.j.INSTANCE.getExperimentalEffects())) {
                arrayList.add(obj);
            }
        }
        this.allVisualEffect = arrayList;
        Context context = getContext();
        if (context != null) {
            M().Uo.clearFocus();
            M().Uo.requestFocus();
            AppCompatEditText searchEdit = M().Uo;
            Intrinsics.checkNotNullExpressionValue(searchEdit, "searchEdit");
            HI0.o7q.ck(searchEdit);
            AppCompatEditText appCompatEditText = M().Uo;
            Intrinsics.checkNotNull(appCompatEditText, "null cannot be cast to non-null type android.widget.EditText");
            fg.rl(appCompatEditText, new Function1() { // from class: Y.pO
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return LEl.D(this.f11975n, (EditText) obj2);
                }
            }, new Function1() { // from class: Y.Sis
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return LEl.a(this.f11924n, (MotionEvent) obj2);
                }
            });
            List listT = com.alightcreative.app.motion.persist.j.INSTANCE.getRecentlyUsedEffects().t();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listT.iterator();
            while (it.hasNext()) {
                VisualEffect visualEffectVisualEffectById = VisualEffectKt.visualEffectById((String) it.next());
                if (visualEffectVisualEffectById == null || (tags = visualEffectVisualEffectById.getTags()) == null) {
                    collectionEmptyList = CollectionsKt.emptyList();
                } else {
                    collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tags, 10));
                    Iterator<T> it2 = tags.iterator();
                    while (it2.hasNext()) {
                        collectionEmptyList.add(((V) it2.next()).rl());
                    }
                }
                CollectionsKt.addAll(arrayList2, collectionEmptyList);
            }
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            List listPlus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) arrayList2, (Iterable) jVar.getRecentlyUsedEffectTags().t()), (Iterable) CollectionsKt.take(jVar.getRecentlyUsedEffectTags().t(), 2)), (Iterable) CollectionsKt.take(jVar.getRecentlyUsedEffectTags().t(), 1));
            List<V> list = this.allTag;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (V v3 : list) {
                if (listPlus == null || !listPlus.isEmpty()) {
                    Iterator it3 = listPlus.iterator();
                    i2 = 0;
                    while (it3.hasNext()) {
                        if (Intrinsics.areEqual((String) it3.next(), v3.rl()) && (i2 = i2 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                } else {
                    i2 = 0;
                }
                arrayList3.add(TuplesKt.to(Integer.valueOf(i2), v3));
            }
            List listTake = CollectionsKt.take(CollectionsKt.sortedWith(arrayList3, new Ml()), 5);
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
            Iterator it4 = listTake.iterator();
            while (it4.hasNext()) {
                arrayList4.add((V) ((Pair) it4.next()).getSecond());
            }
            M().xMQ.setLayoutManager(new LinearLayoutManager(context, 1, false));
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131165960);
            M().xMQ.addItemDecoration(new xq(0, 0, dimensionPixelOffset, dimensionPixelOffset));
            M().xMQ.setAdapter(new M5(arrayList4, new n(this), true, c7r.f11940O));
        }
        M().rl.setOnClickListener(new View.OnClickListener() { // from class: Y.l4Z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LEl.I(this.f11963n, view2);
            }
        });
        M().Uo.addTextChangedListener(new w6());
        M().KN.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        M().KN.addItemDecoration(new xq(0, 0, 0, getResources().getDimensionPixelOffset(2131165972)));
        M().f9295O.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        M().f9295O.addItemDecoration(new xq(0, getResources().getDimensionPixelOffset(2131165960), 0, 0));
        if (v2 != null) {
            P5(this, v2, null, 2, null);
        }
        M().KN.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: Y.mz
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i5, int i7, int i8, int i9) {
                LEl.GR(this.f11967n, view2, i5, i7, i8, i9);
            }
        });
    }

    public LEl() {
        V[] vArrValues = V.values();
        ArrayList arrayList = new ArrayList();
        for (V v2 : vArrValues) {
            List<VisualEffect> visualEffects = VisualEffectKt.getVisualEffects();
            if (visualEffects == null || !visualEffects.isEmpty()) {
                Iterator<T> it = visualEffects.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    List<V> tags = ((VisualEffect) it.next()).getTags();
                    if (tags == null || !tags.isEmpty()) {
                        Iterator<T> it2 = tags.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.areEqual(((V) it2.next()).rl(), v2.rl())) {
                                arrayList.add(v2);
                                break;
                            }
                        }
                    }
                }
            }
        }
        this.allTag = arrayList;
        this.searchText = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(LEl lEl, View view) {
        lEl.M().Uo.clearFocus();
        if (lEl.isAdded()) {
            lEl.getParentFragmentManager().Zmq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String M7(V v2) {
        return "addTagToSearch: " + v2.rl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(final V tag, c7r source) {
        Context context = getContext();
        if (context != null) {
            ArrayList arrayList = this.searchTagList;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).getSecond() == tag) {
                        return;
                    }
                }
            }
            XoT.C.Uo(this, new Function0() { // from class: Y.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LEl.M7(tag);
                }
            });
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar.setRecentlyUsedEffectTags(com.alightcreative.app.motion.persist.n.J2(jVar.getRecentlyUsedEffectTags(), tag.rl()));
            final Editable text = M().Uo.getText();
            if (text != null) {
                int selectionEnd = M().Uo.getSelectionEnd();
                Pair pair = new Pair(Integer.valueOf(selectionEnd), tag);
                this.searchTagList.add(pair);
                String strValueOf = String.valueOf((char) (this.searchTagList.indexOf(pair) + 57344));
                String string = getResources().getString(tag.t());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                text.insert(M().Uo.getSelectionEnd(), strValueOf);
                SpannableString spannableString = new SpannableString(text);
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                spannableString.setSpan(new ImageSpan(context, fg.nr(string, resources)), selectionEnd, strValueOf.length() + selectionEnd, 33);
                M().Uo.setText(spannableString);
                M().Uo.post(new Runnable() { // from class: Y.O
                    @Override // java.lang.Runnable
                    public final void run() {
                        LEl.p5(this.f11899n, text);
                    }
                });
                QmE.iF iFVarFX = FX();
                Bundle bundle = new Bundle();
                bundle.putString("tag_id", tag.rl());
                bundle.putString("source", source.rl());
                Unit unit = Unit.INSTANCE;
                iFVarFX.n(new j.fuX("effect_tag_tap", bundle));
                Y();
            }
        }
    }

    private final void Y() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.searchTagList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add((V) ((Pair) it.next()).getSecond());
        }
        Iterator it2 = arrayList3.iterator();
        while (true) {
            List list = null;
            if (!it2.hasNext()) {
                break;
            }
            V v2 = (V) it2.next();
            List list2 = this.allVisualEffect;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allVisualEffect");
            } else {
                list = list2;
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : list) {
                VisualEffect visualEffect = (VisualEffect) obj;
                if (!arrayList.contains(visualEffect) && visualEffect.getTags().contains(v2)) {
                    arrayList4.add(obj);
                }
            }
            CollectionsKt.addAll(arrayList, arrayList4);
        }
        Collection collectionEmptyList = CollectionsKt.emptyList();
        if (this.searchText.length() > 0 && !arrayList.isEmpty()) {
            collectionEmptyList = new ArrayList();
            for (Object obj2 : arrayList) {
                if (k(this, context, (VisualEffect) obj2)) {
                    collectionEmptyList.add(obj2);
                }
            }
        } else if (this.searchText.length() > 0 && arrayList.isEmpty()) {
            List list3 = this.allVisualEffect;
            if (list3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allVisualEffect");
                list3 = null;
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : list3) {
                VisualEffect visualEffect2 = (VisualEffect) obj3;
                String strN = Iy.w6.n(visualEffect2.getLocalizedStrings(), context, visualEffect2.getName());
                Iy.n localizedStrings = visualEffect2.getLocalizedStrings();
                Context contextAz = XoT.fuX.az(context);
                Intrinsics.checkNotNullExpressionValue(contextAz, "getEnglishContext(...)");
                String strN2 = Iy.w6.n(localizedStrings, contextAz, visualEffect2.getName());
                String strN3 = Iy.w6.n(visualEffect2.getLocalizedStrings(), context, visualEffect2.getDesc());
                if (!arrayList.contains(visualEffect2) && (StringsKt.contains((CharSequence) strN, (CharSequence) this.searchText, true) || StringsKt.contains((CharSequence) strN2, (CharSequence) this.searchText, true) || StringsKt.contains((CharSequence) strN3, (CharSequence) this.searchText, true))) {
                    arrayList5.add(obj3);
                }
            }
            collectionEmptyList = CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList5);
        }
        List listSortedWith = CollectionsKt.sortedWith(collectionEmptyList, new I28(context, arrayList3, this));
        if (!listSortedWith.isEmpty()) {
            M().xMQ.setVisibility(4);
            M().KN.setVisibility(0);
            M().KN.setAdapter(new iF(listSortedWith, this.searchText, B(), J(), new Wre(this)));
            return;
        }
        M().KN.setAdapter(null);
    }

    private final void eTf() {
        List listEmptyList = CollectionsKt.emptyList();
        if (this.searchText.length() > 0) {
            List list = this.allTag;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String string = getResources().getString(((V) obj).t());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                if (StringsKt.contains((CharSequence) string, (CharSequence) this.searchText, true)) {
                    arrayList.add(obj);
                }
            }
            listEmptyList = CollectionsKt.sortedWith(arrayList, new CN3());
        }
        if (!listEmptyList.isEmpty()) {
            M().f9295O.setVisibility(0);
            M().f9295O.setAdapter(new M5(listEmptyList, new fuX(this), false, c7r.J2));
        } else {
            M().f9295O.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ijL(final List effects, final int position, final String source) {
        M().Uo.clearFocus();
        AppCompatEditText searchEdit = M().Uo;
        Intrinsics.checkNotNullExpressionValue(searchEdit, "searchEdit");
        HI0.o7q.KN(searchEdit);
        M().Uo.postDelayed(new Runnable() { // from class: Y.OU
            @Override // java.lang.Runnable
            public final void run() {
                LEl.m(this.f11902n, effects, position, source);
            }
        }, 50L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p5(LEl lEl, Editable editable) {
        lEl.M().Uo.setSelection(editable.length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int z(int i2, String str, String str2) {
        R6 r6;
        if (str.length() == 0) {
            r6 = R6.f11918r;
        } else if (StringsKt.equals(str2, str, true)) {
            r6 = R6.f11919t;
        } else if (StringsKt.startsWith(str2, str, true)) {
            r6 = R6.f11915O;
        } else if (StringsKt.contains((CharSequence) str2, (CharSequence) str, true)) {
            r6 = R6.J2;
        } else {
            r6 = R6.f11918r;
        }
        return r6.rl() * i2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        AppCompatEditText searchEdit = M().Uo;
        Intrinsics.checkNotNullExpressionValue(searchEdit, "searchEdit");
        HI0.o7q.KN(searchEdit);
        super.onPause();
    }
}
