package Y;

import KC.rrk;
import SJ0.H;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.activities.edit.NoScrollGridLayoutManager;
import com.alightcreative.app.motion.activities.effectbrowser.EffectBrowserActivity;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.visualeffect.EffectType;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import com.google.android.gms.ads.RequestConfiguration;
import f0P.ZJ;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import yc.DT;
import yc.S;
import yc.xq;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u0003R\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u0006028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010;\u001a\b\u0012\u0004\u0012\u000209028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00104R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020<028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u00104R\u0014\u0010?\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010>¨\u0006@"}, d2 = {"LY/qYU;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "bzg", "", "position", "", "source", "v", "(ILjava/lang/String;)V", "title", "rV9", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "LSJ0/H;", "o", "LSJ0/H;", "_binding", "LkgE/fuX;", "Z", "LkgE/fuX;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LQ/fuX;", "S", "LQ/fuX;", "X", "()LQ/fuX;", "setFeatureUnlockManager", "(LQ/fuX;)V", "featureUnlockManager", "", "g", "Ljava/util/List;", "effectCategoryIds", "E2", "I", "currentCatePosition", "Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;", "e", "effects", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectType;", "effectTypes", "()LSJ0/H;", "binding", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSubEffectListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubEffectListFragment.kt\ncom/alightcreative/app/motion/activities/effectbrowser/SubEffectListFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,210:1\n11476#2,9:211\n13402#2:220\n13403#2:222\n11485#2:223\n1#3:221\n230#4,2:224\n774#4:226\n865#4,2:227\n1053#4:229\n1557#4:230\n1628#4,3:231\n37#5:234\n36#5,3:235\n*S KotlinDebug\n*F\n+ 1 SubEffectListFragment.kt\ncom/alightcreative/app/motion/activities/effectbrowser/SubEffectListFragment\n*L\n62#1:211,9\n62#1:220\n62#1:222\n62#1:223\n62#1:221\n121#1:224,2\n125#1:226\n125#1:227,2\n127#1:229\n135#1:230\n135#1:231,3\n135#1:234\n135#1:235,3\n*E\n"})
public final class qYU extends Fl {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private int currentCatePosition;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public Q.fuX featureUnlockManager;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private List effectTypes;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List effects = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private List effectCategoryIds;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private H _binding;

    public static final class j implements Comparator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Context f11985n;

        public j(Context context) {
            this.f11985n = context;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            VisualEffect visualEffect = (VisualEffect) obj;
            Iy.n localizedStrings = visualEffect.getLocalizedStrings();
            Intrinsics.checkNotNull(this.f11985n);
            String strN = Iy.w6.n(localizedStrings, this.f11985n, visualEffect.getName());
            VisualEffect visualEffect2 = (VisualEffect) obj2;
            Iy.n localizedStrings2 = visualEffect2.getLocalizedStrings();
            Intrinsics.checkNotNull(this.f11985n);
            return ComparisonsKt.compareValues(strN, Iy.w6.n(localizedStrings2, this.f11985n, visualEffect2.getName()));
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function2 {
        n(Object obj) {
            super(2, obj, qYU.class, "showEffectDetail", "showEffectDetail(ILjava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n(((Number) obj).intValue(), (String) obj2);
            return Unit.INSTANCE;
        }

        public final void n(int i2, String p1) {
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((qYU) this.receiver).v(i2, p1);
        }
    }

    private final H e() {
        H h2 = this._binding;
        Intrinsics.checkNotNull(h2);
        return h2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nHg(qYU qyu, View view) {
        int i2 = qyu.currentCatePosition;
        if (i2 > 0) {
            qyu.currentCatePosition = i2 - 1;
            qyu.bzg();
        }
        qyu.e().J2.setEnabled(qyu.currentCatePosition > 0);
        AppCompatImageButton appCompatImageButton = qyu.e().f9137O;
        int i3 = qyu.currentCatePosition;
        List list = qyu.effectCategoryIds;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("effectCategoryIds");
            list = null;
        }
        appCompatImageButton.setEnabled(i3 < list.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s7N(qYU qyu, View view) {
        int i2 = qyu.currentCatePosition;
        List list = qyu.effectCategoryIds;
        List list2 = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("effectCategoryIds");
            list = null;
        }
        if (i2 < list.size() - 1) {
            qyu.currentCatePosition++;
            qyu.bzg();
        }
        qyu.e().J2.setEnabled(qyu.currentCatePosition > 0);
        AppCompatImageButton appCompatImageButton = qyu.e().f9137O;
        int i3 = qyu.currentCatePosition;
        List list3 = qyu.effectCategoryIds;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("effectCategoryIds");
        } else {
            list2 = list3;
        }
        appCompatImageButton.setEnabled(i3 < list2.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(int position, String source) {
        Lu lu = new Lu();
        Bundle bundle = new Bundle();
        List list = this.effects;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((VisualEffect) it.next()).getId());
        }
        bundle.putStringArray("effectListIds", (String[]) arrayList.toArray(new String[0]));
        bundle.putInt("currentEffectPosition", position);
        bundle.putString("source", source);
        lu.setArguments(bundle);
        FragmentActivity activity = getActivity();
        EffectBrowserActivity effectBrowserActivity = activity instanceof EffectBrowserActivity ? (EffectBrowserActivity) activity : null;
        if (effectBrowserActivity != null) {
            effectBrowserActivity.RQ(lu);
        }
    }

    public final kgE.fuX T() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    public final Q.fuX X() {
        Q.fuX fux = this.featureUnlockManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("featureUnlockManager");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = H.t(inflater, container, false);
        NestedScrollView root = e().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ConstraintLayout holder = e().f9139t;
        Intrinsics.checkNotNullExpressionValue(holder, "holder");
        HI0.o7q.mUb(holder, new Function0() { // from class: Y.RzR
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qYU.N(this.f11921n);
            }
        });
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            e().J2.setRotation(180.0f);
            e().f9137O.setRotation(180.0f);
        }
        e().J2.setEnabled(this.currentCatePosition > 0);
        AppCompatImageButton appCompatImageButton = e().f9137O;
        int i2 = this.currentCatePosition;
        List list = this.effectCategoryIds;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("effectCategoryIds");
            list = null;
        }
        appCompatImageButton.setEnabled(i2 < list.size() - 1);
        e().J2.setOnClickListener(new View.OnClickListener() { // from class: Y.pq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                qYU.nHg(this.f11976n, view2);
            }
        });
        e().f9137O.setOnClickListener(new View.OnClickListener() { // from class: Y.kO4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                qYU.s7N(this.f11960n, view2);
            }
        });
        e().nr.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: Y.hQ
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i3, int i5, int i7, int i8) {
                qYU.wTp(this.f11951n, view2, i3, i5, i7, i8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(qYU qyu) {
        int dimensionPixelOffset = qyu.getResources().getDimensionPixelOffset(2131165427);
        int width = qyu.e().f9139t.getWidth() - (dimensionPixelOffset * 2);
        int dimensionPixelOffset2 = qyu.getResources().getDimensionPixelOffset(2131165429);
        int i2 = width / (dimensionPixelOffset + dimensionPixelOffset2);
        qyu.e().rl.setLayoutManager(new NoScrollGridLayoutManager(qyu.getContext(), i2, 1, false));
        int i3 = ((width - (dimensionPixelOffset2 * i2)) / i2) / 2;
        qyu.e().rl.addItemDecoration(new xq(i3, i3, 0, 0));
        qyu.bzg();
        return Unit.INSTANCE;
    }

    private final void bzg() {
        Fragment fragmentPJg;
        ZJ zj;
        FragmentManager supportFragmentManager;
        for (S s2 : DT.E2()) {
            int iN = s2.n();
            List list = this.effectCategoryIds;
            SceneElement sceneElementNHg = null;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("effectCategoryIds");
                list = null;
            }
            if (iN == ((Number) list.get(this.currentCatePosition)).intValue()) {
                List<VisualEffect> visualEffects = VisualEffectKt.getVisualEffects();
                FragmentActivity activity = getActivity();
                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                    fragmentPJg = supportFragmentManager.pJg("effects");
                } else {
                    fragmentPJg = null;
                }
                if (fragmentPJg instanceof ZJ) {
                    zj = (ZJ) fragmentPJg;
                } else {
                    zj = null;
                }
                if (zj != null) {
                    sceneElementNHg = HW.C.nHg(zj);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : visualEffects) {
                    VisualEffect visualEffect = (VisualEffect) obj;
                    if (!visualEffect.getInternal() && !visualEffect.getDeprecated() && (!visualEffect.getExperimental() || com.alightcreative.app.motion.persist.j.INSTANCE.getExperimentalEffects())) {
                        if (((Boolean) s2.rl().invoke(visualEffect, sceneElementNHg, Boolean.valueOf(T().rl()))).booleanValue()) {
                            arrayList.add(obj);
                        }
                    }
                }
                Context activity2 = getActivity();
                if (activity2 == null) {
                    activity2 = IvA.n.rl().getApplicationContext();
                }
                Context context = activity2;
                this.effects = CollectionsKt.sortedWith(arrayList, new j(context));
                RecyclerView recyclerView = e().rl;
                List list2 = this.effects;
                Intrinsics.checkNotNull(context);
                recyclerView.setAdapter(new K(list2, context, X(), T(), new n(this)));
                String string = getResources().getString(s2.t());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                rV9(string);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final void rV9(String title) {
        EffectBrowserActivity effectBrowserActivity;
        FragmentActivity activity = getActivity();
        if (activity instanceof EffectBrowserActivity) {
            effectBrowserActivity = (EffectBrowserActivity) activity;
        } else {
            effectBrowserActivity = null;
        }
        if (effectBrowserActivity != null) {
            effectBrowserActivity.VwL(title);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wTp(qYU qyu, View view, int i2, int i3, int i5, int i7) {
        rrk rrkVar;
        KeyEventDispatcher.Component activity = qyu.getActivity();
        if (activity instanceof rrk) {
            rrkVar = (rrk) activity;
        } else {
            rrkVar = null;
        }
        if (rrkVar != null) {
            rrkVar.XQ(i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        int i2;
        List listListOf;
        List<Integer> listEmptyList;
        int[] intArray;
        String[] stringArray;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            i2 = arguments.getInt("currentCatePosition");
        } else {
            i2 = 0;
        }
        this.currentCatePosition = i2;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (stringArray = arguments2.getStringArray("effectTypes")) != null) {
            listListOf = new ArrayList();
            for (String str : stringArray) {
                EffectType[] effectTypeArrValues = EffectType.values();
                Intrinsics.checkNotNull(str);
                EffectType effectType = (EffectType) HI0.Ew.n(effectTypeArrValues, str);
                if (effectType != null) {
                    listListOf.add(effectType);
                }
            }
        } else {
            listListOf = CollectionsKt.listOf(EffectType.SHADER);
        }
        this.effectTypes = listListOf;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (intArray = arguments3.getIntArray("effectCategoryIds")) == null || (listEmptyList = ArraysKt.asList(intArray)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        this.effectCategoryIds = listEmptyList;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }
}
