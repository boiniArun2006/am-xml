package Y;

import QmE.j;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.activities.EditActivity;
import com.alightcreative.app.motion.activities.effectbrowser.EffectBrowserActivity;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.visualeffect.EffectPreset;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.utils.Logger;
import java.text.Collator;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import yc.V;
import yc.xq;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\f*\u0001V\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001`B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J#\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0003J\u0019\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\"\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\u0003J!\u0010&\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00060@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010-R$\u0010R\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0016\u0010_\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006a"}, d2 = {"LY/M;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "jB", "", "effectId", "presetCode", "Xw", "(Ljava/lang/String;Ljava/lang/String;)V", "Lyc/V;", "tag", "E", "(Lyc/V;)V", "z", "Landroid/view/View;", "view", "dR0", "(Landroid/view/View;)V", "k", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onDestroy", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "onStart", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LSJ0/M5;", "o", "LSJ0/M5;", "_binding", "LQmE/iF;", "Z", "LQmE/iF;", "P5", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LkgE/fuX;", "S", "LkgE/fuX;", "M7", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;", "g", "Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;", "effect", "", "E2", "Ljava/util/Set;", "favoriteEffects", "LY/Ml;", "e", "LY/Ml;", "addEffectListener", "", "X", "animateSlideUp", "LY/xuv;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LY/xuv;", "eF", "()LY/xuv;", "Y", "(LY/xuv;)V", "testListener", "N", "Ljava/lang/String;", "source", "Y/M$n", "v", "LY/M$n;", "onThumbnailAnimation", "U", "()LSJ0/M5;", "binding", "p5", "()Ljava/lang/String;", "projectId", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEffectDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EffectDetailFragment.kt\ncom/alightcreative/app/motion/activities/effectbrowser/EffectDetailFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ViewUtils.kt\ncom/alightcreative/ext/ViewUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,441:1\n230#2,2:442\n109#3,11:444\n1#4:455\n*S KotlinDebug\n*F\n+ 1 EffectDetailFragment.kt\ncom/alightcreative/app/motion/activities/effectbrowser/EffectDetailFragment\n*L\n107#1:442,2\n190#1:444,11\n*E\n"})
public final class M extends QaP {

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int jB = 8;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private String source;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private xuv testListener;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Y.Ml addEffectListener;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private VisualEffect effect;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private SJ0.M5 _binding;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private Set favoriteEffects = com.alightcreative.app.motion.persist.j.INSTANCE.getFavoriteEffects();

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private boolean animateSlideUp = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final n onThumbnailAnimation = new n();

    public static final class CN3 implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f11886O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ View f11887n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ M f11888t;

        public CN3(View view, M m2, int i2, int i3) {
            this.f11887n = view;
            this.f11888t = m2;
            this.f11886O = i2;
            this.J2 = i3;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f11887n.getMeasuredWidth() <= 0 || this.f11887n.getMeasuredHeight() <= 0) {
                return;
            }
            this.f11887n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.f11888t.isAdded()) {
                if (this.f11886O != this.J2) {
                    this.f11888t.U().nr.setAlpha(1.0f);
                    return;
                }
                this.f11888t.U().nr.animate().alpha(1.0f).setDuration(200L).withEndAction(this.f11888t.new I28()).start();
                M m2 = this.f11888t;
                LinearLayout detailContainer = m2.U().J2;
                Intrinsics.checkNotNullExpressionValue(detailContainer, "detailContainer");
                m2.dR0(detailContainer);
            }
        }
    }

    static final class I28 implements Runnable {
        I28() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SJ0.M5 m5;
            View view;
            if (!M.this.isAdded() || (m5 = M.this._binding) == null || (view = m5.nr) == null) {
                return;
            }
            view.setAlpha(1.0f);
        }
    }

    /* synthetic */ class Ml extends FunctionReferenceImpl implements Function2 {
        Ml(Object obj) {
            super(2, obj, M.class, "updateFavoriteList", "updateFavoriteList(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((String) obj, (String) obj2);
            return Unit.INSTANCE;
        }

        public final void n(String p0, String str) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((M) this.receiver).z(p0, str);
        }
    }

    public static final class Wre implements RecyclerView.OnItemTouchListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float f11890n;
        private final int rl;

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void O(boolean z2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void n(RecyclerView rv, MotionEvent e2) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(e2, "e");
        }

        Wre() {
            this.rl = ViewConfiguration.get(M.this.requireContext()).getScaledTouchSlop();
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean t(RecyclerView rv, MotionEvent e2) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(e2, "e");
            int action = e2.getAction();
            if (action == 0) {
                this.f11890n = e2.getRawX();
            } else if (action == 1) {
                xuv testListener = M.this.getTestListener();
                if (testListener != null) {
                    testListener.xMQ(true);
                }
            } else if (action != 2) {
                if (action == 3) {
                }
            } else if (Math.abs(e2.getRawX() - this.f11890n) > this.rl) {
                xuv testListener2 = M.this.getTestListener();
                if (testListener2 != null) {
                    testListener2.xMQ(false);
                }
            } else {
                xuv testListener3 = M.this.getTestListener();
                if (testListener3 != null) {
                    testListener3.xMQ(true);
                }
            }
            return false;
        }
    }

    public static final class fuX extends ViewOutlineProvider {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f11892n;

        fuX(int i2) {
            this.f11892n = i2;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            int width = view.getWidth();
            int height = view.getHeight();
            int i2 = this.f11892n;
            outline.setRoundRect(0, 0, width, height + i2, i2);
        }
    }

    /* JADX INFO: renamed from: Y.M$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ M rl(Companion companion, String str, int i2, int i3, String str2, boolean z2, int i5, Object obj) {
            if ((i5 & 16) != 0) {
                z2 = false;
            }
            return companion.n(str, i2, i3, str2, z2);
        }

        public final M n(String effectId, int i2, int i3, String source, boolean z2) {
            Intrinsics.checkNotNullParameter(effectId, "effectId");
            Intrinsics.checkNotNullParameter(source, "source");
            M m2 = new M();
            Bundle bundle = new Bundle();
            bundle.putString("effectId", effectId);
            bundle.putInt("position", i2);
            bundle.putInt("animatePosition", i3);
            bundle.putBoolean("hideAddList", z2);
            bundle.putString("source", source);
            m2.setArguments(bundle);
            return m2;
        }
    }

    public static final class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!M.this.isAdded() || M.this.getView() == null) {
                return;
            }
            M.this.U().ty.removeCallbacks(this);
            ViewCompat.P5(M.this.U().qie);
        }
    }

    /* synthetic */ class w6 extends FunctionReferenceImpl implements Function2 {
        w6(Object obj) {
            super(2, obj, M.class, "addEffect", "addEffect(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((String) obj, (String) obj2);
            return Unit.INSTANCE;
        }

        public final void n(String str, String str2) {
            ((M) this.receiver).Xw(str, str2);
        }
    }

    public static void safedk_Fragment_startActivity_d519b2d71bdac81b1d20f350086c68e6(Fragment p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(M m2, V tag, c7r c7rVar) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(c7rVar, "<unused var>");
        m2.E(tag);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String I(M m2, Uri uri) {
        VisualEffect visualEffect = m2.effect;
        if (visualEffect == null) {
            Intrinsics.throwUninitializedPropertyAccessException("effect");
            visualEffect = null;
        }
        return "FXThumbnail: " + visualEffect.getThumbnail() + " -> " + uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SJ0.M5 U() {
        SJ0.M5 m5 = this._binding;
        Intrinsics.checkNotNull(m5);
        return m5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Xw(String effectId, String presetCode) {
        Y.Ml ml = this.addEffectListener;
        if (ml != null) {
            String str = this.source;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("source");
                str = null;
            }
            ml.t(effectId, presetCode, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(String effectId, String presetCode) {
        EffectPreset effectPreset;
        String strRl;
        String label;
        String label2;
        Object next;
        if (this.favoriteEffects.contains(effectId)) {
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar.setFavoriteEffects(SetsKt.minus(jVar.getFavoriteEffects(), effectId));
            this.favoriteEffects = SetsKt.minus((Set<? extends String>) this.favoriteEffects, effectId);
        } else {
            String str = null;
            if (presetCode != null) {
                VisualEffect visualEffect = this.effect;
                if (visualEffect == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("effect");
                    visualEffect = null;
                }
                Iterator<T> it = VisualEffectKt.getPresets(visualEffect).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (Intrinsics.areEqual(((EffectPreset) next).getShortCode(), presetCode)) {
                            break;
                        }
                    }
                }
                effectPreset = (EffectPreset) next;
            } else {
                effectPreset = null;
            }
            Context context = getContext();
            if (context != null) {
                QmE.iF iFVarP5 = P5();
                Bundle bundle = new Bundle();
                VisualEffect visualEffect2 = this.effect;
                if (visualEffect2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("effect");
                    visualEffect2 = null;
                }
                bundle.putString("effect_id", visualEffect2.getId());
                VisualEffect visualEffect3 = this.effect;
                if (visualEffect3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("effect");
                    visualEffect3 = null;
                }
                Iy.n localizedStrings = visualEffect3.getLocalizedStrings();
                VisualEffect visualEffect4 = this.effect;
                if (visualEffect4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("effect");
                    visualEffect4 = null;
                }
                bundle.putString("effect_name", Iy.w6.n(localizedStrings, context, visualEffect4.getName()));
                VisualEffect visualEffect5 = this.effect;
                if (visualEffect5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("effect");
                    visualEffect5 = null;
                }
                Iy.n localizedStrings2 = visualEffect5.getLocalizedStrings();
                Context contextAz = XoT.fuX.az(context);
                Intrinsics.checkNotNullExpressionValue(contextAz, "getEnglishContext(...)");
                VisualEffect visualEffect6 = this.effect;
                if (visualEffect6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("effect");
                    visualEffect6 = null;
                }
                bundle.putString("effect_name", Iy.w6.n(localizedStrings2, contextAz, visualEffect6.getName()));
                if (presetCode == null) {
                    presetCode = "default";
                }
                bundle.putString("preset_id", presetCode);
                String str2 = "";
                if (effectPreset == null || (label2 = effectPreset.getLabel()) == null || (strRl = Iy.w6.rl(label2, context)) == null) {
                    strRl = "";
                }
                bundle.putString("preset_name", strRl);
                if (effectPreset != null && (label = effectPreset.getLabel()) != null) {
                    Context contextAz2 = XoT.fuX.az(context);
                    Intrinsics.checkNotNullExpressionValue(contextAz2, "getEnglishContext(...)");
                    String strRl2 = Iy.w6.rl(label, contextAz2);
                    if (strRl2 != null) {
                        str2 = strRl2;
                    }
                }
                bundle.putString("preset_name_en", str2);
                String str3 = this.source;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("source");
                } else {
                    str = str3;
                }
                bundle.putString("source", str);
                Unit unit = Unit.INSTANCE;
                iFVarP5.n(new j.fuX("effect_favorite", bundle));
            }
            com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar2.setFavoriteEffects(SetsKt.plus(jVar2.getFavoriteEffects(), effectId));
            this.favoriteEffects = SetsKt.plus((Set<? extends String>) this.favoriteEffects, effectId);
        }
        RecyclerView.Adapter adapter = U().rl.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final kgE.fuX M7() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    public final QmE.iF P5() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void Y(xuv xuvVar) {
        this.testListener = xuvVar;
    }

    /* JADX INFO: renamed from: eF, reason: from getter */
    public final xuv getTestListener() {
        return this.testListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y.QaP, androidx.fragment.app.Fragment
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
        this._binding = SJ0.M5.t(inflater, container, false);
        ConstraintLayout constraintLayoutRl = U().getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutRl, "getRoot(...)");
        return constraintLayoutRl;
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x02f0  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String string;
        final Uri thumbnail;
        Drawable drawableRl;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        boolean z2 = arguments != null ? arguments.getBoolean("hideAddList") : false;
        Bundle arguments2 = getArguments();
        int i2 = arguments2 != null ? arguments2.getInt("position") : 0;
        Bundle arguments3 = getArguments();
        int i3 = arguments3 != null ? arguments3.getInt("animatePosition") : 0;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string = arguments4.getString("source")) == null) {
            string = "";
        }
        this.source = string;
        if (getContext() != null) {
            ViewGroup.LayoutParams layoutParams = U().J2.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams).p5 = (int) (r5.getResources().getDisplayMetrics().heightPixels * 0.8f);
            ViewGroup.LayoutParams layoutParams2 = U().xMQ.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams2).p5 = (int) (r5.getResources().getDisplayMetrics().widthPixels * 0.75f);
        }
        U().nr.setOnClickListener(new View.OnClickListener() { // from class: Y.afx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                M.D(this.f11938n, view2);
            }
        });
        U().f9204O.setOnClickListener(new View.OnClickListener() { // from class: Y.Z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                M.a(this.f11933n, view2);
            }
        });
        Context context = getContext();
        VisualEffect visualEffect = null;
        if (context != null) {
            U().rl.setVisibility(z2 ? 8 : 0);
            VisualEffect visualEffect2 = this.effect;
            if (visualEffect2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("effect");
                visualEffect2 = null;
            }
            Iy.n localizedStrings = visualEffect2.getLocalizedStrings();
            VisualEffect visualEffect3 = this.effect;
            if (visualEffect3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("effect");
                visualEffect3 = null;
            }
            String strN = Iy.w6.n(localizedStrings, context, visualEffect3.getName());
            VisualEffect visualEffect4 = this.effect;
            if (visualEffect4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("effect");
                visualEffect4 = null;
            }
            Iy.n localizedStrings2 = visualEffect4.getLocalizedStrings();
            Context contextAz = XoT.fuX.az(context);
            Intrinsics.checkNotNullExpressionValue(contextAz, "getEnglishContext(...)");
            VisualEffect visualEffect5 = this.effect;
            if (visualEffect5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("effect");
                visualEffect5 = null;
            }
            String strN2 = Iy.w6.n(localizedStrings2, contextAz, visualEffect5.getName());
            if (Intrinsics.areEqual(strN, strN2)) {
                U().gh.setText(strN);
                U().mUb.setVisibility(8);
            } else {
                U().gh.setText(strN);
                U().mUb.setText(strN2);
                U().mUb.setVisibility(0);
            }
            List listN = kgE.Md.n();
            VisualEffect visualEffect6 = this.effect;
            if (visualEffect6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("effect");
                visualEffect6 = null;
            }
            if (listN.contains(visualEffect6.getId()) && M7().Uo().contains(kgE.K.f70072S)) {
                drawableRl = AppCompatResources.rl(context, 2131231824);
            } else {
                List listN2 = kgE.Md.n();
                VisualEffect visualEffect7 = this.effect;
                if (visualEffect7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("effect");
                    visualEffect7 = null;
                }
                drawableRl = (!listN2.contains(visualEffect7.getId()) || M7().Uo().contains(kgE.K.f70072S)) ? null : AppCompatResources.rl(context, 2131231825);
            }
            U().gh.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableRl, (Drawable) null);
            AppCompatTextView appCompatTextView = U().KN;
            VisualEffect visualEffect8 = this.effect;
            if (visualEffect8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("effect");
                visualEffect8 = null;
            }
            Iy.n localizedStrings3 = visualEffect8.getLocalizedStrings();
            VisualEffect visualEffect9 = this.effect;
            if (visualEffect9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("effect");
                visualEffect9 = null;
            }
            appCompatTextView.setText(Iy.w6.n(localizedStrings3, context, visualEffect9.getDesc()));
            VisualEffect visualEffect10 = this.effect;
            if (visualEffect10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("effect");
                visualEffect10 = null;
            }
            List listListOf = CollectionsKt.listOf(new o7q(visualEffect10.getId(), strN, null));
            VisualEffect visualEffect11 = this.effect;
            if (visualEffect11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("effect");
                visualEffect11 = null;
            }
            for (EffectPreset effectPreset : VisualEffectKt.getPresets(visualEffect11)) {
                VisualEffect visualEffect12 = this.effect;
                if (visualEffect12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("effect");
                    visualEffect12 = null;
                }
                listListOf = CollectionsKt.plus((Collection<? extends o7q>) listListOf, new o7q(visualEffect12.getId() + "/" + effectPreset.getId(), Iy.w6.rl(effectPreset.getLabel(), context), effectPreset.getShortCode()));
            }
            U().rl.setLayoutManager(new LinearLayoutManager(context, 1, false));
            U().rl.setAdapter(new Y.w6(listListOf, new w6(this), new Ml(this)));
            if (this.animateSlideUp && i2 == i3) {
                U().nr.setAlpha(0.0f);
            }
            LinearLayout linearLayout = U().J2;
            linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new CN3(linearLayout, this, i2, i3));
            this.animateSlideUp = false;
        }
        Resources resources = getResources();
        Context context2 = getContext();
        int color = resources.getColor(2131099746, context2 != null ? context2.getTheme() : null);
        VisualEffect visualEffect13 = this.effect;
        if (visualEffect13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("effect");
            visualEffect13 = null;
        }
        Uri backgroundImage = visualEffect13.getBackgroundImage();
        if (backgroundImage != null) {
            if (Intrinsics.areEqual(backgroundImage.getScheme(), FileUploadManager.f61570h)) {
                List<String> pathSegments = backgroundImage.getPathSegments();
                Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
                if (Intrinsics.areEqual(CollectionsKt.firstOrNull((List) pathSegments), "android_asset")) {
                    Uri.Builder builderScheme = backgroundImage.buildUpon().scheme("asset");
                    List<String> pathSegments2 = backgroundImage.getPathSegments();
                    Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
                    thumbnail = builderScheme.path(CollectionsKt.joinToString$default(CollectionsKt.drop(pathSegments2, 1), "/", null, null, 0, null, null, 62, null)).build();
                } else {
                    VisualEffect visualEffect14 = this.effect;
                    if (visualEffect14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("effect");
                        visualEffect14 = null;
                    }
                    thumbnail = visualEffect14.getThumbnail();
                }
                XoT.C.Uo(this, new Function0() { // from class: Y.Ew
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return M.I(this.f11845n, thumbnail);
                    }
                });
                U().qie.setVisibility(0);
                SY6.j jVarBuild = ((Hwc.I28) Hwc.w6.Uo().te(ImageRequestBuilder.aYN(thumbnail).N(new YzO(color, ColorKt.toInt(SolidColor.copy$default(HI0.qf.t(color), 0.0f, 0.0f, 0.0f, 0.7f, 7, null)))).n())).build();
                Intrinsics.checkNotNullExpressionValue(jVarBuild, "build(...)");
                U().qie.setController(jVarBuild);
                U().ty.postOnAnimation(this.onThumbnailAnimation);
            }
        }
        final Collator collator = Collator.getInstance(new Locale(Locale.getDefault().getLanguage()));
        VisualEffect visualEffect15 = this.effect;
        if (visualEffect15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("effect");
        } else {
            visualEffect = visualEffect15;
        }
        List<V> tags = visualEffect.getTags();
        final Function2 function2 = new Function2() { // from class: Y.nKK
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(M.GR(this.f11970n, (V) obj, (V) obj2));
            }
        };
        List listSortedWith = CollectionsKt.sortedWith(tags, new Comparator() { // from class: Y.DAz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return M.Nxk(function2, obj, obj2);
            }
        });
        final Function2 function22 = new Function2() { // from class: Y.u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(M.M(this.f11992n, collator, (V) obj, (V) obj2));
            }
        };
        List listSortedWith2 = CollectionsKt.sortedWith(listSortedWith, new Comparator() { // from class: Y.qf
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return M.FX(function22, obj, obj2);
            }
        });
        U().f9206r.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        U().f9206r.setAdapter(new M5(listSortedWith2, new Function2() { // from class: Y.Ln
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return M.B(this.f11874n, (V) obj, (c7r) obj2);
            }
        }, false, null, 12, null));
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131165971);
        U().f9206r.addItemDecoration(new xq(0, dimensionPixelOffset * 2, dimensionPixelOffset, dimensionPixelOffset));
        U().f9206r.setNestedScrollingEnabled(false);
        U().f9206r.addOnItemTouchListener(new Wre());
        U().Ik.setOutlineProvider(new fuX(getResources().getDimensionPixelOffset(2131166316)));
        U().Ik.setClipToOutline(true);
        U().az.setOnClickListener(new View.OnClickListener() { // from class: Y.lej
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                M.J(this.f11964n, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(M m2, View view) {
        LinearLayout detailContainer = m2.U().J2;
        Intrinsics.checkNotNullExpressionValue(detailContainer, "detailContainer");
        m2.k(detailContainer);
    }

    private final void E(V tag) {
        EffectBrowserActivity effectBrowserActivity;
        FragmentActivity activity = getActivity();
        if (activity instanceof EffectBrowserActivity) {
            effectBrowserActivity = (EffectBrowserActivity) activity;
        } else {
            effectBrowserActivity = null;
        }
        if (effectBrowserActivity != null) {
            LEl lElHV = effectBrowserActivity.HV();
            if (lElHV != null && lElHV.isAdded()) {
                lElHV.eF(tag);
                jB();
            } else {
                LEl lElN = LEl.INSTANCE.n(tag);
                jB();
                effectBrowserActivity.a63(lElN);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FX(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int GR(M m2, V v2, V v3) {
        String string = m2.getResources().getString(v2.t());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = m2.getResources().getString(v3.t());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return StringsKt.compareTo(string, string2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(M m2, View view) {
        QmE.iF iFVarP5 = m2.P5();
        String strP5 = m2.p5();
        VisualEffect visualEffect = m2.effect;
        VisualEffect visualEffect2 = null;
        if (visualEffect == null) {
            Intrinsics.throwUninitializedPropertyAccessException("effect");
            visualEffect = null;
        }
        iFVarP5.n(new j.Md(strP5, visualEffect.getName()));
        Context context = m2.getContext();
        if (context != null) {
            QmE.iF iFVarP52 = m2.P5();
            Bundle bundle = new Bundle();
            VisualEffect visualEffect3 = m2.effect;
            if (visualEffect3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("effect");
                visualEffect3 = null;
            }
            bundle.putString("effect_id", visualEffect3.getId());
            VisualEffect visualEffect4 = m2.effect;
            if (visualEffect4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("effect");
                visualEffect4 = null;
            }
            Iy.n localizedStrings = visualEffect4.getLocalizedStrings();
            VisualEffect visualEffect5 = m2.effect;
            if (visualEffect5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("effect");
                visualEffect5 = null;
            }
            bundle.putString("effect_name", Iy.w6.n(localizedStrings, context, visualEffect5.getName()));
            VisualEffect visualEffect6 = m2.effect;
            if (visualEffect6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("effect");
                visualEffect6 = null;
            }
            Iy.n localizedStrings2 = visualEffect6.getLocalizedStrings();
            Context contextAz = XoT.fuX.az(context);
            Intrinsics.checkNotNullExpressionValue(contextAz, "getEnglishContext(...)");
            VisualEffect visualEffect7 = m2.effect;
            if (visualEffect7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("effect");
                visualEffect7 = null;
            }
            bundle.putString("effect_name", Iy.w6.n(localizedStrings2, contextAz, visualEffect7.getName()));
            Unit unit = Unit.INSTANCE;
            iFVarP52.n(new j.fuX("effect_guide", bundle));
            Regex regex = new Regex("[^A-Za-z0-9]");
            Regex regex2 = new Regex("-{2,}");
            VisualEffect visualEffect8 = m2.effect;
            if (visualEffect8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("effect");
                visualEffect8 = null;
            }
            Iy.n localizedStrings3 = visualEffect8.getLocalizedStrings();
            Context contextAz2 = XoT.fuX.az(context);
            Intrinsics.checkNotNullExpressionValue(contextAz2, "getEnglishContext(...)");
            VisualEffect visualEffect9 = m2.effect;
            if (visualEffect9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("effect");
            } else {
                visualEffect2 = visualEffect9;
            }
            String strTrim = StringsKt.trim(regex2.replace(regex.replace(StringsKt.trim((CharSequence) Iy.w6.n(localizedStrings3, contextAz2, visualEffect2.getName())).toString(), "-"), "-"), '-');
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = strTrim.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            safedk_Fragment_startActivity_d519b2d71bdac81b1d20f350086c68e6(m2, new Intent("android.intent.action.VIEW", Uri.parse("https://guide.alightmotion.com/effects/" + lowerCase + "?l=" + Locale.getDefault().getLanguage())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int M(M m2, Collator collator, V v2, V v3) {
        String string = m2.getResources().getString(v2.t());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = m2.getResources().getString(v3.t());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return collator.compare(string, string2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Nxk(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(M m2, View view) {
        LinearLayout detailContainer = m2.U().J2;
        Intrinsics.checkNotNullExpressionValue(detailContainer, "detailContainer");
        m2.k(detailContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dR0(View view) {
        view.setTranslationY(view.getHeight());
        view.animate().translationY(0.0f).setDuration(200L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jB() {
        Lu lu;
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof Lu) {
            lu = (Lu) parentFragment;
        } else {
            lu = null;
        }
        if (lu != null) {
            lu.aYN();
        } else if (isAdded()) {
            getParentFragmentManager().Zmq();
        }
    }

    private final void k(View view) {
        U().nr.animate().alpha(0.0f).setDuration(200L).start();
        view.animate().translationY(view.getHeight()).setDuration(200L).withEndAction(new Runnable() { // from class: Y.iwV
            @Override // java.lang.Runnable
            public final void run() {
                this.f11957n.jB();
            }
        }).start();
    }

    private final String p5() {
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

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("effectId");
        } else {
            string = null;
        }
        for (VisualEffect visualEffect : VisualEffectKt.getVisualEffects()) {
            if (Intrinsics.areEqual(visualEffect.getId(), string)) {
                this.effect = visualEffect;
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.addEffectListener = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        U().ty.postOnAnimation(this.onThumbnailAnimation);
    }
}
