package com.alightcreative.app.motion.activities.effectbrowser;

import HI0.Ew;
import HI0.o7q;
import Q.fuX;
import QmE.iF;
import QmE.j;
import SJ0.I7;
import SJ0.nr;
import SJ0.xZD;
import WJ.phkN.HFAkacKHsU;
import XoT.C;
import Y.Lu;
import Y.Zs;
import Y.l3D;
import Y.qYU;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.activities.EditActivity;
import com.alightcreative.app.motion.activities.edit.NoScrollGridLayoutManager;
import com.alightcreative.app.motion.activities.effectbrowser.j;
import com.alightcreative.app.motion.scene.visualeffect.EffectPreset;
import com.alightcreative.app.motion.scene.visualeffect.EffectType;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;
import com.google.android.material.tabs.Ml;
import com.google.android.material.tabs.TabLayout;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kgE.K;
import kgE.Md;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import yc.DT;
import yc.S;
import yc.xq;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0003^_`B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\r\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u0019\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\fH\u0016¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010\u0004J#\u0010+\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010P\u001a\b\u0012\u0004\u0012\u00020M0\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010OR\u001c\u0010S\u001a\b\u0012\u0004\u0012\u00020Q0\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010OR\u001c\u0010T\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010OR*\u0010V\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\n0U0\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010OR*\u0010X\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\n0U0\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010OR\u0014\u0010Z\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010YR\u0016\u0010]\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006a"}, d2 = {"Lcom/alightcreative/app/motion/activities/effectbrowser/j;", "Landroidx/fragment/app/Fragment;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "<init>", "()V", "", "Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;", "effects", "", "position", "", "source", "", "bzg", "(Ljava/util/List;ILjava/lang/String;)V", "Xw", "(I)V", "jB", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onDetach", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onResume", "onPause", "Landroid/content/SharedPreferences;", "sharedPreferences", "key", "onSharedPreferenceChanged", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", "LSJ0/xZD;", "o", "LSJ0/xZD;", "_binding", "LkgE/fuX;", "Z", "LkgE/fuX;", "nHg", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LQ/fuX;", "S", "LQ/fuX;", "N", "()LQ/fuX;", "setFeatureUnlockManager", "(LQ/fuX;)V", "featureUnlockManager", "LQmE/iF;", "g", "LQmE/iF;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LY/Ml;", "E2", "LY/Ml;", "addEffectListener", "Lyc/S;", "e", "Ljava/util/List;", "categories", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectType;", "X", "effectTypes", "recommendListIds", "Lkotlin/Pair;", "recentList", "v", "favoriteList", "()LSJ0/xZD;", "binding", "s7N", "()Ljava/lang/String;", "projectId", "j", c.f62177j, "w6", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEffectCategoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EffectCategoryFragment.kt\ncom/alightcreative/app/motion/activities/effectbrowser/EffectCategoryFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,656:1\n11476#2,9:657\n13402#2:666\n13403#2:668\n11485#2:669\n1#3:667\n1#3:693\n1#3:708\n1#3:723\n1#3:763\n774#4:670\n865#4:671\n1755#4,3:672\n866#4:675\n230#4,2:676\n774#4:678\n865#4,2:679\n1611#4,9:681\n1863#4:690\n295#4,2:691\n1864#4:694\n1620#4:695\n1611#4,9:696\n1863#4:705\n295#4,2:706\n1864#4:709\n1620#4:710\n1611#4,9:711\n1863#4:720\n295#4,2:721\n1864#4:724\n1620#4:725\n1557#4:726\n1628#4,3:727\n1557#4:734\n1628#4,3:735\n1557#4:738\n1628#4,3:739\n230#4,2:746\n774#4:748\n865#4,2:749\n1611#4,9:751\n1863#4:760\n295#4,2:761\n1864#4:764\n1620#4:765\n37#5:730\n36#5,3:731\n37#5:742\n36#5,3:743\n*S KotlinDebug\n*F\n+ 1 EffectCategoryFragment.kt\ncom/alightcreative/app/motion/activities/effectbrowser/EffectCategoryFragment\n*L\n119#1:657,9\n119#1:666\n119#1:668\n119#1:669\n119#1:667\n147#1:693\n156#1:708\n191#1:723\n299#1:763\n133#1:670\n133#1:671\n134#1:672,3\n133#1:675\n141#1:676,2\n143#1:678\n143#1:679,2\n147#1:681,9\n147#1:690\n152#1:691,2\n147#1:694\n147#1:695\n156#1:696,9\n156#1:705\n160#1:706,2\n156#1:709\n156#1:710\n191#1:711,9\n191#1:720\n191#1:721,2\n191#1:724\n191#1:725\n236#1:726\n236#1:727,3\n289#1:734\n289#1:735,3\n290#1:738\n290#1:739,3\n297#1:746,2\n298#1:748\n298#1:749,2\n299#1:751,9\n299#1:760\n303#1:761,2\n299#1:764\n299#1:765\n236#1:730\n236#1:731,3\n290#1:742\n290#1:743,3\n*E\n"})
public final class j extends com.alightcreative.app.motion.activities.effectbrowser.w6 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int jB = 8;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private Y.Ml addEffectListener;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public fuX featureUnlockManager;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private List recommendListIds;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private List effectTypes;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List categories;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public iF eventLogger;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private xZD _binding;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private List recentList = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private List favoriteList = CollectionsKt.emptyList();

    public static final class CN3 extends RecyclerView.OnScrollListener {
        CN3() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void rl(RecyclerView recyclerView, int i2, int i3) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.rl(recyclerView, i2, i3);
            j.this.X().KN.setVisibility(recyclerView.canScrollHorizontally(-1) ? 0 : 4);
            j.this.X().Uo.setVisibility(recyclerView.canScrollHorizontally(1) ? 0 : 4);
        }
    }

    /* synthetic */ class I28 extends FunctionReferenceImpl implements Function3 {
        I28(Object obj) {
            super(3, obj, j.class, "showEffectDetail", "showEffectDetail(Ljava/util/List;ILjava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((List) obj, ((Number) obj2).intValue(), (String) obj3);
            return Unit.INSTANCE;
        }

        public final void n(List p0, int i2, String p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p2, "p2");
            ((j) this.receiver).bzg(p0, i2, p2);
        }
    }

    /* synthetic */ class Ml extends FunctionReferenceImpl implements Function1 {
        Ml(Object obj) {
            super(1, obj, j.class, "showSubEffectList", "showSubEffectList(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void n(int i2) {
            ((j) this.receiver).Xw(i2);
        }
    }

    /* synthetic */ class Wre extends FunctionReferenceImpl implements Function3 {
        Wre(Object obj) {
            super(3, obj, j.class, "showEffectDetail", "showEffectDetail(Ljava/util/List;ILjava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((List) obj, ((Number) obj2).intValue(), (String) obj3);
            return Unit.INSTANCE;
        }

        public final void n(List p0, int i2, String p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p2, "p2");
            ((j) this.receiver).bzg(p0, i2, p2);
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.effectbrowser.j$j, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final j n(List effectTypes, List recommendList) {
            Intrinsics.checkNotNullParameter(effectTypes, "effectTypes");
            Intrinsics.checkNotNullParameter(recommendList, "recommendList");
            j jVar = new j();
            Bundle bundle = new Bundle();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(effectTypes, 10));
            Iterator it = effectTypes.iterator();
            while (it.hasNext()) {
                arrayList.add(((EffectType) it.next()).name());
            }
            bundle.putStringArray("effectTypes", (String[]) arrayList.toArray(new String[0]));
            bundle.putStringArray("recommendList", (String[]) recommendList.toArray(new String[0]));
            jVar.setArguments(bundle);
            return jVar;
        }
    }

    private static final class n extends RecyclerView.Adapter {
        private final Y.Ml J2;
        private final kgE.fuX KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Function3 f45209O;
        private final fuX Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List f45210n;
        private final int nr;
        private final List rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f45211t;

        /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.effectbrowser.j$n$j, reason: collision with other inner class name */
        public final class C0635j extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final I7 f45212n;
            final /* synthetic */ n rl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0635j(n nVar, I7 itemBinding) {
                super(itemBinding.getRoot());
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                this.rl = nVar;
                this.f45212n = itemBinding;
            }

            public final I7 O() {
                return this.f45212n;
            }

            public final void nr(int i2) {
                int iAz;
                int size;
                boolean z2 = !this.rl.r().isEmpty() && i2 == 0;
                if (z2) {
                    size = this.rl.r().size() <= 8 ? this.rl.r().size() : 8;
                    iAz = 0;
                } else {
                    iAz = (i2 == 0 ? 0 : i2 - 1) * this.rl.az();
                    size = i2 == this.rl.getItemCount() - 1 ? this.rl.HI().size() : this.rl.az() + iAz;
                }
                n nVar = this.rl;
                List listR = z2 ? nVar.r() : nVar.HI();
                this.f45212n.rl.setVisibility(0);
                this.f45212n.rl.setAdapter(new w6(listR.subList(iAz, size), this.rl.ck(), this.rl.ty(), this.rl.qie(), z2, this.rl.Ik()));
                ViewCompat.mYa(this.f45212n.rl, false);
            }
        }

        public n(List favoriteList, List recentList, int i2, int i3, Function3 function3, Y.Ml ml, fuX featureUnlockManager, kgE.fuX iapManager) {
            Intrinsics.checkNotNullParameter(favoriteList, "favoriteList");
            Intrinsics.checkNotNullParameter(recentList, "recentList");
            Intrinsics.checkNotNullParameter(featureUnlockManager, "featureUnlockManager");
            Intrinsics.checkNotNullParameter(iapManager, "iapManager");
            this.f45210n = favoriteList;
            this.rl = recentList;
            this.f45211t = i2;
            this.nr = i3;
            this.f45209O = function3;
            this.J2 = ml;
            this.Uo = featureUnlockManager;
            this.KN = iapManager;
        }

        public final List HI() {
            return this.f45210n;
        }

        public final kgE.fuX Ik() {
            return this.KN;
        }

        public final void XQ(List list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f45210n = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public C0635j onCreateViewHolder(ViewGroup parent, int i2) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            I7 i7T = I7.t(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(i7T, "inflate(...)");
            C0635j c0635j = new C0635j(this, i7T);
            c0635j.O().rl.setLayoutManager(new NoScrollGridLayoutManager(c0635j.itemView.getContext(), 2, 0, false));
            if (this.nr > 0) {
                RecyclerView recyclerView = c0635j.O().rl;
                int i3 = this.nr;
                recyclerView.addItemDecoration(new xq(i3, i3, 0, 0));
            }
            return c0635j;
        }

        public final int az() {
            return this.f45211t;
        }

        public final fuX ck() {
            return this.Uo;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            int i2 = !this.rl.isEmpty() ? 1 : 0;
            int size = 0;
            if (!this.f45210n.isEmpty()) {
                size = (this.f45210n.size() / this.f45211t) + (this.f45210n.size() % this.f45211t <= 0 ? 0 : 1);
            }
            return i2 + size;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C0635j holder, int i2) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.nr(i2);
        }

        public final Y.Ml qie() {
            return this.J2;
        }

        public final List r() {
            return this.rl;
        }

        public final Function3 ty() {
            return this.f45209O;
        }
    }

    public static final class w6 extends RecyclerView.Adapter {
        private final kgE.fuX J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final boolean f45213O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f45214n;
        private final Y.Ml nr;
        private final fuX rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Function3 f45215t;

        /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.effectbrowser.j$w6$j, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
        public final class C0636j extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final nr f45216n;
            final /* synthetic */ w6 rl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0636j(w6 w6Var, nr itemBinding) {
                super(itemBinding.getRoot());
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                this.rl = w6Var;
                this.f45216n = itemBinding;
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x0147  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void Uo(final int i2, Pair data) {
                Object next;
                final Uri thumbnail;
                Intrinsics.checkNotNullParameter(data, "data");
                final VisualEffect visualEffect = (VisualEffect) data.getFirst();
                Iterator<T> it = VisualEffectKt.getPresets(visualEffect).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (Intrinsics.areEqual(((EffectPreset) next).getId(), data.getSecond())) {
                            break;
                        }
                    }
                }
                final EffectPreset effectPreset = (EffectPreset) next;
                boolean z2 = this.rl.J2.Uo().contains(K.f70072S) || this.rl.rl.t(visualEffect.getId());
                this.f45216n.f9570O.setVisibility((Md.n().contains(visualEffect.getId()) && z2) ? 0 : 8);
                this.f45216n.nr.setVisibility((!Md.n().contains(visualEffect.getId()) || z2) ? 8 : 0);
                this.f45216n.f9570O.setImageDrawable(AppCompatResources.rl(this.itemView.getContext(), 2131231824));
                AppCompatTextView appCompatTextView = this.f45216n.f9572t;
                Iy.n localizedStrings = visualEffect.getLocalizedStrings();
                Context context = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, wDgKoYAES.FdLDmI);
                appCompatTextView.setText(Iy.w6.n(localizedStrings, context, visualEffect.getName()));
                if (effectPreset != null) {
                    this.f45216n.J2.setVisibility(0);
                    this.f45216n.J2.setText(effectPreset.getShortCode());
                } else {
                    this.f45216n.J2.setVisibility(8);
                }
                if (visualEffect.getThumbnail() == null) {
                    this.f45216n.Uo.setVisibility(8);
                } else if (Intrinsics.areEqual(visualEffect.getThumbnail().getScheme(), FileUploadManager.f61570h)) {
                    List<String> pathSegments = visualEffect.getThumbnail().getPathSegments();
                    Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
                    if (Intrinsics.areEqual(CollectionsKt.firstOrNull((List) pathSegments), "android_asset")) {
                        Uri.Builder builderScheme = visualEffect.getThumbnail().buildUpon().scheme("asset");
                        List<String> pathSegments2 = visualEffect.getThumbnail().getPathSegments();
                        Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
                        thumbnail = builderScheme.path(CollectionsKt.joinToString$default(CollectionsKt.drop(pathSegments2, 1), "/", null, null, 0, null, null, 62, null)).build();
                    } else {
                        thumbnail = visualEffect.getThumbnail();
                    }
                    C.Uo(this, new Function0() { // from class: Y.Q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return j.w6.C0636j.KN(visualEffect, thumbnail);
                        }
                    });
                    this.f45216n.Uo.setVisibility(0);
                    SY6.j jVarBuild = ((Hwc.I28) Hwc.w6.Uo().rl(thumbnail).nY(true)).build();
                    Intrinsics.checkNotNullExpressionValue(jVarBuild, HFAkacKHsU.FJDh);
                    this.f45216n.Uo.setController(jVarBuild);
                }
                final String id = visualEffect.getId();
                if (effectPreset != null) {
                    id = id + "/" + effectPreset.getId();
                }
                View view = this.itemView;
                final w6 w6Var = this.rl;
                view.setOnClickListener(new View.OnClickListener() { // from class: Y.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        j.w6.C0636j.xMQ(w6Var, id, effectPreset, view2);
                    }
                });
                View view2 = this.itemView;
                final w6 w6Var2 = this.rl;
                view2.setOnLongClickListener(new View.OnLongClickListener() { // from class: Y.SPz
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view3) {
                        return j.w6.C0636j.mUb(w6Var2, i2, view3);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String KN(VisualEffect visualEffect, Uri uri) {
                return "FXThumbnail: " + visualEffect.getThumbnail() + " -> " + uri;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean mUb(w6 w6Var, int i2, View view) {
                String str;
                List list = w6Var.f45214n;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((VisualEffect) ((Pair) it.next()).getFirst());
                }
                Function3 function3 = w6Var.f45215t;
                if (function3 != null) {
                    Integer numValueOf = Integer.valueOf(i2);
                    if (w6Var.f45213O) {
                        str = "recent";
                    } else {
                        str = "favorite";
                    }
                    function3.invoke(arrayList, numValueOf, str);
                    return true;
                }
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void xMQ(w6 w6Var, String str, EffectPreset effectPreset, View view) {
                String shortCode;
                String str2;
                Y.Ml ml = w6Var.nr;
                if (ml != null) {
                    if (effectPreset != null) {
                        shortCode = effectPreset.getShortCode();
                    } else {
                        shortCode = null;
                    }
                    if (w6Var.f45213O) {
                        str2 = "recent";
                    } else {
                        str2 = "favorite";
                    }
                    ml.t(str, shortCode, str2);
                }
            }
        }

        public w6(List list, fuX featureUnlockManager, Function3 function3, Y.Ml ml, boolean z2, kgE.fuX iapManager) {
            Intrinsics.checkNotNullParameter(list, "list");
            Intrinsics.checkNotNullParameter(featureUnlockManager, "featureUnlockManager");
            Intrinsics.checkNotNullParameter(iapManager, "iapManager");
            this.f45214n = list;
            this.rl = featureUnlockManager;
            this.f45215t = function3;
            this.nr = ml;
            this.f45213O = z2;
            this.J2 = iapManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f45214n.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public C0636j onCreateViewHolder(ViewGroup parent, int i2) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            nr nrVarT = nr.t(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(nrVarT, "inflate(...)");
            return new C0636j(this, nrVarT);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C0636j holder, int i2) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.Uo(i2, (Pair) this.f45214n.get(i2));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        this.addEffectListener = null;
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xZD X() {
        xZD xzd = this._binding;
        Intrinsics.checkNotNull(xzd);
        return xzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bzg(List effects, int position, String source) {
        Lu lu = new Lu();
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(effects, 10));
        Iterator it = effects.iterator();
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

    private final void jB() {
        Object next;
        boolean experimentalEffects = com.alightcreative.app.motion.persist.j.INSTANCE.getExperimentalEffects();
        for (S s2 : DT.E2()) {
            if (s2.n() == 1) {
                List<VisualEffect> visualEffects = VisualEffectKt.getVisualEffects();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = visualEffects.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next2 = it.next();
                    VisualEffect visualEffect = (VisualEffect) next2;
                    if (!visualEffect.getInternal() && !visualEffect.getDeprecated() && (!visualEffect.getExperimental() || experimentalEffects)) {
                        if (((Boolean) s2.rl().invoke(visualEffect, null, Boolean.valueOf(nHg().rl()))).booleanValue()) {
                            arrayList.add(next2);
                        }
                    }
                }
                Set<String> mutableSet = CollectionsKt.toMutableSet(com.alightcreative.app.motion.persist.j.INSTANCE.getFavoriteEffects());
                ArrayList arrayList2 = new ArrayList();
                for (String str : mutableSet) {
                    boolean zContains$default = StringsKt.contains$default((CharSequence) str, (CharSequence) "/", false, 2, (Object) null);
                    String strSubstringBefore$default = zContains$default ? StringsKt.substringBefore$default(str, "/", (String) null, 2, (Object) null) : str;
                    String strSubstringAfter$default = zContains$default ? StringsKt.substringAfter$default(str, "/", (String) null, 2, (Object) null) : null;
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.areEqual(((VisualEffect) next).getId(), strSubstringBefore$default)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    VisualEffect visualEffect2 = (VisualEffect) next;
                    Pair pair = visualEffect2 != null ? TuplesKt.to(visualEffect2, strSubstringAfter$default) : null;
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                }
                this.favoriteList = arrayList2;
                if (arrayList2.size() + this.recentList.size() <= 0) {
                    X().f9681t.setVisibility(8);
                    return;
                }
                if (X().f9681t.getVisibility() == 8) {
                    X().f9681t.setVisibility(0);
                }
                RecyclerView.Adapter adapter = X().nr.getAdapter();
                n nVar = adapter instanceof n ? (n) adapter : null;
                if (nVar != null) {
                    int itemCount = nVar.getItemCount();
                    nVar.XQ(this.favoriteList);
                    if (itemCount > nVar.getItemCount()) {
                        nVar.notifyItemRemoved(itemCount);
                    }
                    nVar.notifyDataSetChanged();
                    return;
                }
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(j jVar, TabLayout.CN3 tab, int i2) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        Context context = jVar.getContext();
        if (context != null) {
            tab.xMQ.setBackground(AppCompatResources.rl(context, (jVar.recentList.isEmpty() || i2 != 0) ? 2131232292 : 2131232293));
        }
    }

    public final fuX N() {
        fuX fux = this.featureUnlockManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("featureUnlockManager");
        return null;
    }

    public final iF T() {
        iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final kgE.fuX nHg() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alightcreative.app.motion.activities.effectbrowser.w6, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (context instanceof Y.Ml) {
            this.addEffectListener = (Y.Ml) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = xZD.t(inflater, container, false);
        VerticalNestedScrollView verticalNestedScrollViewRl = X().getRoot();
        Intrinsics.checkNotNullExpressionValue(verticalNestedScrollViewRl, "getRoot(...)");
        return verticalNestedScrollViewRl;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        if (key == null || !StringsKt.endsWith$default(key, "favoriteEffects", false, 2, (Object) null)) {
            return;
        }
        jB();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Object next;
        Object next2;
        Object next3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        List<VisualEffect> visualEffects = VisualEffectKt.getVisualEffects();
        boolean experimentalEffects = com.alightcreative.app.motion.persist.j.INSTANCE.getExperimentalEffects();
        List listE2 = DT.E2();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE2) {
            S s2 = (S) obj;
            if (visualEffects == null || !visualEffects.isEmpty()) {
                Iterator<T> it = visualEffects.iterator();
                while (true) {
                    if (it.hasNext()) {
                        VisualEffect visualEffect = (VisualEffect) it.next();
                        if (s2.n() != 1 && !visualEffect.getInternal() && !visualEffect.getDeprecated() && (experimentalEffects || !visualEffect.getExperimental())) {
                            if (((Boolean) s2.rl().invoke(visualEffect, null, Boolean.valueOf(nHg().rl()))).booleanValue()) {
                                arrayList.add(obj);
                                break;
                            }
                        }
                    }
                }
            }
        }
        this.categories = arrayList;
        X().rl.setLayoutManager(new NoScrollGridLayoutManager(getContext(), 2, 1, false));
        RecyclerView recyclerView = X().rl;
        List list = this.categories;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categories");
            list = null;
        }
        recyclerView.setAdapter(new l3D(list, new Ml(this)));
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131165283);
        X().rl.addItemDecoration(new xq(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
        for (S s3 : DT.E2()) {
            if (s3.n() == 1) {
                List<VisualEffect> visualEffects2 = VisualEffectKt.getVisualEffects();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : visualEffects2) {
                    VisualEffect visualEffect2 = (VisualEffect) obj2;
                    if (!visualEffect2.getInternal() && !visualEffect2.getDeprecated() && (!visualEffect2.getExperimental() || experimentalEffects)) {
                        if (((Boolean) s3.rl().invoke(visualEffect2, null, Boolean.valueOf(nHg().rl()))).booleanValue()) {
                            arrayList2.add(obj2);
                        }
                    }
                }
                List<String> listT = com.alightcreative.app.motion.persist.j.INSTANCE.getRecentlyUsedEffects().t();
                ArrayList arrayList3 = new ArrayList();
                for (String str : listT) {
                    boolean zContains$default = StringsKt.contains$default((CharSequence) str, (CharSequence) "/", false, 2, (Object) null);
                    String strSubstringBefore$default = zContains$default ? StringsKt.substringBefore$default(str, "/", (String) null, 2, (Object) null) : str;
                    String strSubstringAfter$default = zContains$default ? StringsKt.substringAfter$default(str, "/", (String) null, 2, (Object) null) : null;
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next3 = it2.next();
                            if (Intrinsics.areEqual(((VisualEffect) next3).getId(), strSubstringBefore$default)) {
                                break;
                            }
                        } else {
                            next3 = null;
                            break;
                        }
                    }
                    VisualEffect visualEffect3 = (VisualEffect) next3;
                    Pair pair = visualEffect3 != null ? TuplesKt.to(visualEffect3, strSubstringAfter$default) : null;
                    if (pair != null) {
                        arrayList3.add(pair);
                    }
                }
                this.recentList = arrayList3;
                Set<String> mutableSet = CollectionsKt.toMutableSet(com.alightcreative.app.motion.persist.j.INSTANCE.getFavoriteEffects());
                ArrayList arrayList4 = new ArrayList();
                for (String str2 : mutableSet) {
                    boolean zContains$default2 = StringsKt.contains$default((CharSequence) str2, (CharSequence) "/", false, 2, (Object) null);
                    String strSubstringBefore$default2 = zContains$default2 ? StringsKt.substringBefore$default(str2, "/", (String) null, 2, (Object) null) : str2;
                    String strSubstringAfter$default2 = zContains$default2 ? StringsKt.substringAfter$default(str2, "/", (String) null, 2, (Object) null) : null;
                    Iterator it3 = arrayList2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (Intrinsics.areEqual(((VisualEffect) next2).getId(), strSubstringBefore$default2)) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    VisualEffect visualEffect4 = (VisualEffect) next2;
                    Pair pair2 = visualEffect4 != null ? TuplesKt.to(visualEffect4, strSubstringAfter$default2) : null;
                    if (pair2 != null) {
                        arrayList4.add(pair2);
                    }
                }
                this.favoriteList = arrayList4;
                FrameLayout recentAndFavHolder = X().f9681t;
                Intrinsics.checkNotNullExpressionValue(recentAndFavHolder, "recentAndFavHolder");
                o7q.mUb(recentAndFavHolder, new Function0() { // from class: Y.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.alightcreative.app.motion.activities.effectbrowser.j.wTp(this.f11939n);
                    }
                });
                List<String> list2 = this.recommendListIds;
                if (list2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recommendListIds");
                    list2 = null;
                }
                final ArrayList arrayList5 = new ArrayList();
                for (String str3 : list2) {
                    Iterator it4 = arrayList2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (Intrinsics.areEqual(((VisualEffect) next).getId(), str3)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    VisualEffect visualEffect5 = (VisualEffect) next;
                    if (visualEffect5 != null) {
                        arrayList5.add(visualEffect5);
                    }
                }
                RecyclerView recommandList = X().J2;
                Intrinsics.checkNotNullExpressionValue(recommandList, "recommandList");
                o7q.mUb(recommandList, new Function0() { // from class: Y.s4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.alightcreative.app.motion.activities.effectbrowser.j.rV9(this.f11990n, arrayList5);
                    }
                });
                X().J2.addOnScrollListener(new CN3());
                ViewCompat.mYa(X().J2, false);
                ViewCompat.mYa(X().nr, false);
                ViewCompat.mYa(X().f9679O, false);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Xw(int position) {
        EffectBrowserActivity effectBrowserActivity;
        if (isAdded()) {
            List list = this.categories;
            List list2 = null;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("categories");
                list = null;
            }
            S s2 = (S) CollectionsKt.getOrNull(list, position);
            if (s2 != null) {
                int iN = s2.n();
                if (iN != 0) {
                    if (iN != 111) {
                        if (iN != 112) {
                            switch (iN) {
                                case 101:
                                    T().n(new j.gnv(s7N()));
                                    break;
                                case 102:
                                    T().n(new j.Sis(s7N()));
                                    break;
                                case 103:
                                    T().n(new j.yg(s7N()));
                                    break;
                                case 104:
                                    T().n(new j.C1442m(s7N()));
                                    break;
                                case 105:
                                    T().n(new j.O(s7N()));
                                    break;
                                case 106:
                                    T().n(new j.pO(s7N()));
                                    break;
                                case 107:
                                    T().n(new j.mz(s7N()));
                                    break;
                                case 108:
                                    T().n(new j.l4Z(s7N()));
                                    break;
                                case 109:
                                    T().n(new j.OU(s7N()));
                                    break;
                            }
                        } else {
                            T().n(new j.P(s7N()));
                        }
                    } else {
                        T().n(new j.LEl(s7N()));
                    }
                } else {
                    T().n(new j.C1445p(s7N()));
                }
            }
            qYU qyu = new qYU();
            Bundle bundle = new Bundle();
            bundle.putInt("currentCatePosition", position);
            List list3 = this.categories;
            if (list3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("categories");
                list3 = null;
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((S) it.next()).n()));
            }
            bundle.putIntArray("effectCategoryIds", CollectionsKt.toIntArray(arrayList));
            List list4 = this.effectTypes;
            if (list4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("effectTypes");
                list4 = null;
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((EffectType) it2.next()).name());
            }
            bundle.putStringArray("effectTypes", (String[]) arrayList2.toArray(new String[0]));
            qyu.setArguments(bundle);
            FragmentActivity activity = getActivity();
            if (activity instanceof EffectBrowserActivity) {
                effectBrowserActivity = (EffectBrowserActivity) activity;
            } else {
                effectBrowserActivity = null;
            }
            if (effectBrowserActivity != null) {
                Resources resources = getResources();
                List list5 = this.categories;
                if (list5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("categories");
                } else {
                    list2 = list5;
                }
                effectBrowserActivity.F(qyu, "SubEffectList", resources.getString(((S) list2.get(position)).t()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rV9(j jVar, List list) {
        jVar.X().J2.setLayoutManager(new LinearLayoutManager(jVar.getContext(), 0, false));
        jVar.X().J2.setAdapter(new Zs(list, jVar.N(), new Wre(jVar), jVar.nHg()));
        int height = (jVar.X().J2.getHeight() - jVar.getResources().getDimensionPixelOffset(2131165431)) / 2;
        int dimensionPixelOffset = jVar.getResources().getDimensionPixelOffset(2131165962) / 2;
        jVar.X().J2.addItemDecoration(new xq(dimensionPixelOffset, dimensionPixelOffset, height, height));
        return Unit.INSTANCE;
    }

    private final String s7N() {
        EffectBrowserActivity effectBrowserActivity;
        EditActivity editActivity;
        FragmentActivity activity = getActivity();
        if (activity instanceof EditActivity) {
            FragmentActivity activity2 = getActivity();
            if (activity2 instanceof EditActivity) {
                editActivity = (EditActivity) activity2;
            } else {
                editActivity = null;
            }
            if (editActivity == null) {
                return null;
            }
            return editActivity.Uo();
        }
        if (activity instanceof EffectBrowserActivity) {
            FragmentActivity activity3 = getActivity();
            if (activity3 instanceof EffectBrowserActivity) {
                effectBrowserActivity = (EffectBrowserActivity) activity3;
            } else {
                effectBrowserActivity = null;
            }
            if (effectBrowserActivity != null) {
                return effectBrowserActivity.Po6();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wTp(final j jVar) {
        int itemCount;
        int width = ((jVar.X().f9681t.getWidth() - (jVar.getResources().getDimensionPixelOffset(2131165960) * 2)) / ((jVar.getResources().getDimensionPixelOffset(2131166323) / 2) + jVar.getResources().getDimensionPixelOffset(2131166324))) * 2;
        int i2 = width / 2;
        jVar.X().nr.setAdapter(new n(jVar.favoriteList, jVar.recentList, width, (((r1 - (r0 * i2)) / i2) - 1) / 2, new I28(jVar), jVar.addEffectListener, jVar.N(), jVar.nHg()));
        new com.google.android.material.tabs.Ml(jVar.X().f9679O, jVar.X().nr, new Ml.n() { // from class: Y.UGc
            @Override // com.google.android.material.tabs.Ml.n
            public final void n(TabLayout.CN3 cn3, int i3) {
                com.alightcreative.app.motion.activities.effectbrowser.j.v(this.f11925n, cn3, i3);
            }
        }).n();
        RecyclerView.Adapter adapter = jVar.X().nr.getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = 0;
        }
        int effectRecentFavSelectedPos = com.alightcreative.app.motion.persist.j.INSTANCE.getEffectRecentFavSelectedPos();
        if (itemCount - 1 < effectRecentFavSelectedPos) {
            effectRecentFavSelectedPos = 0;
        }
        jVar.X().nr.mUb(effectRecentFavSelectedPos, false);
        if (jVar.favoriteList.size() + jVar.recentList.size() > 0) {
            jVar.X().f9681t.setVisibility(0);
        } else {
            jVar.X().f9681t.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        List listListOf;
        List listSubList;
        String[] stringArray;
        String[] stringArray2;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null && (stringArray2 = arguments.getStringArray("effectTypes")) != null) {
            listListOf = new ArrayList();
            for (String str : stringArray2) {
                EffectType[] effectTypeArrValues = EffectType.values();
                Intrinsics.checkNotNull(str);
                EffectType effectType = (EffectType) Ew.n(effectTypeArrValues, str);
                if (effectType != null) {
                    listListOf.add(effectType);
                }
            }
        } else {
            listListOf = CollectionsKt.listOf(EffectType.SHADER);
        }
        this.effectTypes = listListOf;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (stringArray = arguments2.getStringArray("recommendList")) == null || (listSubList = ArraysKt.toList(stringArray)) == null) {
            listSubList = DT.e().subList(0, 6);
        }
        this.recommendListIds = listSubList;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.alightcreative.app.motion.persist.j.INSTANCE.setEffectRecentFavSelectedPos(X().f9679O.getSelectedTabPosition());
        PreferenceManager.getDefaultSharedPreferences(getContext()).unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        PreferenceManager.getDefaultSharedPreferences(getContext()).registerOnSharedPreferenceChangeListener(this);
    }
}
