package f0P;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.SceneElement;
import com.fyber.inneractive.sdk.player.exoplayer2.util.LU.LHbnkhI;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0011\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001^B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H$¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001b\u0010\u0004J\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\u00072\b\b\u0001\u0010\u001e\u001a\u00020\nH\u0004¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\nH\u0015¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\"\u0010\tJ\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\u0004J\r\u0010$\u001a\u00020\u0007¢\u0006\u0004\b$\u0010\u0004R\u001b\u0010*\u001a\u00020%8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R \u0010A\u001a\b\u0012\u0004\u0012\u00020<0;8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R \u0010D\u001a\b\u0012\u0004\u0012\u00020<0;8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bB\u0010>\u001a\u0004\bC\u0010@R\"\u0010I\u001a\u00020\n8\u0004@\u0004X\u0085\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010\f\"\u0004\bH\u0010 R$\u0010M\u001a\u00020\n2\u0006\u0010J\u001a\u00020\n8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bK\u0010F\u001a\u0004\bL\u0010\fR\"\u0010T\u001a\u00020N8\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\bO\u0010,\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u0010W\u001a\u00020N8\u0014X\u0094D¢\u0006\f\n\u0004\bU\u0010,\u001a\u0004\bV\u0010QR\u0014\u0010Y\u001a\u00020\n8eX¤\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\fR\u0014\u0010[\u001a\u00020N8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010QR\u0014\u0010]\u001a\u00020N8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010Q¨\u0006_"}, d2 = {"Lf0P/Ny;", "Lyc/H;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lcom/alightcreative/app/motion/scene/SceneElement;", "el", "", "piY", "(Lcom/alightcreative/app/motion/scene/SceneElement;)V", "", "p5", "()I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "FX", "B", "J", "D", "(Landroid/view/View;)V", "tabId", "wTp", "(I)V", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "nHg", "nr", "s7N", "LSJ0/Qik;", "o", "Lkotlin/Lazy;", "rV9", "()LSJ0/Qik;", "baseBinding", "LQmE/iF;", "Z", "LQmE/iF;", "jB", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LxAo/I28;", "S", "LxAo/I28;", "bzg", "()LxAo/I28;", "setCrisperManager", "(LxAo/I28;)V", "crisperManager", "", "Lf0P/Ny$j;", "g", "Ljava/util/List;", "M", "()Ljava/util/List;", "tabs", "E2", "U", "extraTabs", "e", "I", "Xw", "setCurrentTabId", "currentTabId", "value", "X", "getKeyframeSelectMargin", "keyframeSelectMargin", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "v", "()Z", "setAutoTabSpacing", "(Z)V", "autoTabSpacing", "N", "E", "supportsAnimation", "M7", "layoutResource", "P5", "hasMultipleTabs", "eF", "showOverflow", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSettingFragmentBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingFragmentBase.kt\ncom/alightcreative/app/motion/activities/edit/fragments/SettingFragmentBase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,658:1\n1872#2,3:659\n1872#2,3:662\n1872#2,3:665\n1872#2,3:668\n*S KotlinDebug\n*F\n+ 1 SettingFragmentBase.kt\ncom/alightcreative/app/motion/activities/edit/fragments/SettingFragmentBase\n*L\n121#1:659,3\n150#1:662,3\n178#1:665,3\n132#1:668,3\n*E\n"})
public abstract class Ny extends sK implements yc.H {

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final boolean supportsAnimation;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public xAo.I28 crisperManager;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private boolean autoTabSpacing;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private int keyframeSelectMargin;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int currentTabId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Lazy baseBinding = LazyKt.lazy(new Function0() { // from class: f0P.nL
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Ny.N(this.f65813n);
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List tabs = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final List extraTabs = CollectionsKt.emptyList();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    public static final class j {
        private final boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Integer f64531O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f64532n;
        private final int nr;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f64533t;

        public j(int i2, int i3, int i5, int i7, Integer num, boolean z2) {
            this.f64532n = i2;
            this.rl = i3;
            this.f64533t = i5;
            this.nr = i7;
            this.f64531O = num;
            this.J2 = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f64532n == jVar.f64532n && this.rl == jVar.rl && this.f64533t == jVar.f64533t && this.nr == jVar.nr && Intrinsics.areEqual(this.f64531O, jVar.f64531O) && this.J2 == jVar.J2;
        }

        public final int J2() {
            return this.f64532n;
        }

        public final Integer O() {
            return this.f64531O;
        }

        public int hashCode() {
            int iHashCode = ((((((Integer.hashCode(this.f64532n) * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.f64533t)) * 31) + Integer.hashCode(this.nr)) * 31;
            Integer num = this.f64531O;
            return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.J2);
        }

        public final int n() {
            return this.nr;
        }

        public final int nr() {
            return this.rl;
        }

        public final int rl() {
            return this.f64533t;
        }

        public final boolean t() {
            return this.J2;
        }

        public String toString() {
            return "Tab(tabId=" + this.f64532n + ", iconRsrc=" + this.rl + ", altTabId=" + this.f64533t + ", altIconRsrc=" + this.nr + ", normalIconRsrc=" + this.f64531O + ", applyTint=" + this.J2 + ")";
        }

        public /* synthetic */ j(int i2, int i3, int i5, int i7, Integer num, boolean z2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
            this(i2, i3, (i8 & 4) != 0 ? 0 : i5, (i8 & 8) != 0 ? 0 : i7, (i8 & 16) != 0 ? null : num, (i8 & 32) != 0 ? true : z2);
        }
    }

    protected void B() {
    }

    protected void D(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    protected void FX() {
    }

    protected void J() {
    }

    protected abstract int M7();

    protected void a(int tabId) {
    }

    protected boolean eF() {
        return false;
    }

    protected abstract void piY(SceneElement el);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(Ny ny, SJ0.Qik qik, View view) {
        ImageButton overflow = qik.KN;
        Intrinsics.checkNotNullExpressionValue(overflow, "overflow");
        ny.D(overflow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(Ny ny, j jVar, List list, int i2, View view) {
        if (ny.currentTabId == jVar.J2() && jVar.rl() != 0) {
            ((ImageButton) list.get(i2)).setImageResource(jVar.n());
            ny.wTp(jVar.rl());
            return;
        }
        if (ny.currentTabId == jVar.rl() && jVar.rl() != 0) {
            ((ImageButton) list.get(i2)).setImageResource(jVar.nr());
            ny.wTp(jVar.J2());
            return;
        }
        int i3 = 0;
        for (Object obj : list) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ImageButton imageButton = (ImageButton) obj;
            imageButton.setActivated(false);
            if (i3 >= 0 && i3 < ny.getTabs().size()) {
                if (Intrinsics.areEqual(imageButton, view)) {
                    imageButton.setImageResource(((j) ny.getTabs().get(i3)).nr());
                } else {
                    Integer numO = ((j) ny.getTabs().get(i3)).O();
                    imageButton.setImageResource(numO != null ? numO.intValue() : ((j) ny.getTabs().get(i3)).nr());
                }
            }
            i3 = i5;
        }
        view.setActivated(true);
        ny.wTp(jVar.J2());
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    protected boolean getSupportsAnimation() {
        return this.supportsAnimation;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    protected List getTabs() {
        return this.tabs;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    protected List getExtraTabs() {
        return this.extraTabs;
    }

    /* JADX INFO: renamed from: Xw, reason: from getter */
    protected final int getCurrentTabId() {
        return this.currentTabId;
    }

    public final xAo.I28 bzg() {
        xAo.I28 i28 = this.crisperManager;
        if (i28 != null) {
            return i28;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crisperManager");
        return null;
    }

    public final QmE.iF jB() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    protected void nHg(SceneElement el) {
        Intrinsics.checkNotNullParameter(el, LHbnkhI.CqwFmDFOxlqKU);
        piY(el);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(p5(), container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final SJ0.Qik qikRV9 = rV9();
        this.keyframeSelectMargin = getResources().getDimensionPixelSize(2131165564);
        ConstraintLayout root = qikRV9.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        HI0.o7q.gh(root);
        int i2 = 0;
        if (getSupportsAnimation()) {
            ListView multiTabAnimatorList = qikRV9.Uo;
            Intrinsics.checkNotNullExpressionValue(multiTabAnimatorList, "multiTabAnimatorList");
            HI0.o7q.gh(multiTabAnimatorList);
            ListView singleTabAnimatorList = qikRV9.ty;
            Intrinsics.checkNotNullExpressionValue(singleTabAnimatorList, "singleTabAnimatorList");
            HI0.o7q.gh(singleTabAnimatorList);
            qikRV9.az.setImageResource(2131230998);
            qikRV9.az.setOnClickListener(new View.OnClickListener() { // from class: f0P.bgz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Ny.I(this.f65393n, view2);
                }
            });
            qikRV9.az.setOnLongClickListener(new View.OnLongClickListener() { // from class: f0P.NI
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return Ny.Nxk(this.f64511n, view2);
                }
            });
            qikRV9.KN.setVisibility(eF() ? 0 : 4);
            qikRV9.KN.setOnClickListener(new View.OnClickListener() { // from class: f0P.Uu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Ny.Y(this.f64779n, qikRV9, view2);
                }
            });
            qikRV9.nr.setOnClickListener(new View.OnClickListener() { // from class: f0P.CSx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Ny.k(this.f64111n, view2);
                }
            });
        }
        if (P5()) {
            qikRV9.Ik.setVisibility(0);
            LayoutInflater.from(getContext()).inflate(M7(), (ViewGroup) qikRV9.Ik, true);
        } else {
            qikRV9.ck.setVisibility(0);
            LayoutInflater.from(getContext()).inflate(M7(), (ViewGroup) qikRV9.ck, true);
        }
        qikRV9.f9288t.setOnClickListener(new View.OnClickListener() { // from class: f0P.aha
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Ny.dR0(this.f65359n, view2);
            }
        });
        final List listListOf = getSupportsAnimation() ? CollectionsKt.listOf((Object[]) new ImageButton[]{qikRV9.xMQ, qikRV9.mUb, qikRV9.gh, qikRV9.qie}) : CollectionsKt.listOf((Object[]) new ImageButton[]{qikRV9.xMQ, qikRV9.mUb, qikRV9.gh, qikRV9.qie, qikRV9.az});
        final int i3 = 0;
        for (Object obj : getTabs()) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final j jVar = (j) obj;
            ImageButton imageButton = (ImageButton) listListOf.get(i3);
            Integer numO = jVar.O();
            imageButton.setImageResource(numO != null ? numO.intValue() : jVar.nr());
            if (!jVar.t()) {
                ((ImageButton) listListOf.get(i3)).setImageTintList(null);
            }
            ((ImageButton) listListOf.get(i3)).setOnClickListener(new View.OnClickListener() { // from class: f0P.kD
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Ny.z(this.f65705n, jVar, listListOf, i3, view2);
                }
            });
            i3 = i5;
        }
        if (getAutoTabSpacing()) {
            for (Object obj2 : listListOf) {
                int i7 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ImageButton imageButton2 = (ImageButton) obj2;
                if (i2 >= getTabs().size()) {
                    imageButton2.setVisibility(8);
                }
                i2 = i7;
            }
        }
        qikRV9.getRoot().post(new Runnable() { // from class: f0P.VT7
            @Override // java.lang.Runnable
            public final void run() {
                Ny.GR(this.f64921n, listListOf);
            }
        });
    }

    protected final SJ0.Qik rV9() {
        return (SJ0.Qik) this.baseBinding.getValue();
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    protected boolean getAutoTabSpacing() {
        return this.autoTabSpacing;
    }

    protected final void wTp(int tabId) {
        if (this.currentTabId != tabId) {
            this.currentTabId = tabId;
            a(tabId);
            return;
        }
        int i2 = 0;
        for (Object obj : getTabs()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ((ImageButton) (getSupportsAnimation() ? CollectionsKt.listOf((Object[]) new ImageButton[]{rV9().xMQ, rV9().mUb, rV9().gh, rV9().qie}) : CollectionsKt.listOf((Object[]) new ImageButton[]{rV9().xMQ, rV9().mUb, rV9().gh, rV9().qie, rV9().az})).get(i2)).setImageResource(((j) obj).nr());
            i2 = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GR(Ny ny, List list) {
        ny.s7N();
        j jVar = (j) CollectionsKt.firstOrNull(ny.getTabs());
        if (jVar != null) {
            ((ImageButton) list.get(0)).setActivated(true);
            ((ImageButton) list.get(0)).setImageResource(jVar.nr());
            ny.wTp(jVar.J2());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(Ny ny, View view) {
        ny.FX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SJ0.Qik N(Ny ny) {
        SJ0.Qik qikN = SJ0.Qik.n(ny.requireView());
        Intrinsics.checkNotNullExpressionValue(qikN, "bind(...)");
        return qikN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Nxk(Ny ny, View view) {
        ny.B();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dR0(Ny ny, View view) {
        if (ny.isAdded()) {
            ny.getParentFragmentManager().Zmq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Ny ny, View view) {
        ny.J();
    }

    protected final boolean P5() {
        if (getTabs().size() + getExtraTabs().size() > 1) {
            return true;
        }
        return false;
    }

    @Override // yc.H
    public void nr() {
        s7N();
    }

    public int p5() {
        return 2131558607;
    }

    public final void s7N() {
        SceneElement sceneElementNHg;
        if (isAdded() && getView() != null && (sceneElementNHg = HW.C.nHg(this)) != null) {
            nHg(sceneElementNHg);
        }
    }
}
