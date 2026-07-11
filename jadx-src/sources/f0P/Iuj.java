package f0P;

import SJ0.C1458i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0004R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lf0P/Iuj;", "Lf0P/wl0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "LSJ0/i;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "LSJ0/i;", "_binding", "ViF", "()LSJ0/i;", "binding", "Lf0P/J2L;", "nY", "()Lf0P/J2L;", "drawingFragment", "t", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDrawingActionBarFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawingActionBarFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/DrawingActionBarFragment\n+ 2 FragmentTrackingActivity.kt\ncom/alightcreative/app/motion/activities/interfaces/FragmentTrackingActivityKt\n*L\n1#1,69:1\n12#2:70\n*S KotlinDebug\n*F\n+ 1 DrawingActionBarFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/DrawingActionBarFragment\n*L\n25#1:70\n*E\n"})
public final class Iuj extends Fragment implements wl0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private C1458i _binding;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f64364O = 8;

    /* JADX INFO: renamed from: f0P.Iuj$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Iuj n(int i2, int... overflowOptions) {
            Intrinsics.checkNotNullParameter(overflowOptions, "overflowOptions");
            Iuj iuj = new Iuj();
            Bundle bundle = new Bundle();
            bundle.putInt("setting_name_rsrc", i2);
            bundle.putIntArray("overflow_options", ArraysKt.toIntArray(ArraysKt.toTypedArray(overflowOptions)));
            iuj.setArguments(bundle);
            return iuj;
        }
    }

    private final C1458i ViF() {
        C1458i c1458i = this._binding;
        Intrinsics.checkNotNull(c1458i);
        return c1458i;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = C1458i.t(inflater, container, false);
        LinearLayout root = ViF().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        HI0.o7q.gh(view);
        ViF().rl.setOnClickListener(new View.OnClickListener() { // from class: f0P.QUT
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Iuj.g(this.f64635n, view2);
            }
        });
        Bundle arguments = getArguments();
        int i2 = arguments != null ? arguments.getInt("setting_name_rsrc", 0) : 0;
        if (i2 != 0) {
            ViF().nr.setText(i2);
        } else {
            TextView textView = ViF().nr;
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (string = arguments2.getString("setting_name")) == null) {
                string = "";
            }
            textView.setText(string);
        }
        ViF().f9483t.setOnClickListener(new View.OnClickListener() { // from class: f0P.wb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Iuj.te(this.f66298n, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Iuj iuj, View view) {
        if (iuj.isAdded()) {
            iuj.getParentFragmentManager().Zmq();
        }
    }

    private final J2L nY() {
        HW.n nVar;
        KeyEventDispatcher.Component activity = getActivity();
        Fragment fragmentHI = null;
        if (activity == null) {
            return null;
        }
        if (activity instanceof HW.n) {
            nVar = (HW.n) activity;
        } else {
            nVar = null;
        }
        if (nVar != null) {
            fragmentHI = nVar.HI(J2L.class);
        }
        return (J2L) fragmentHI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void te(Iuj iuj, View view) {
        J2L j2lNY = iuj.nY();
        if (j2lNY != null) {
            Intrinsics.checkNotNull(view);
            j2lNY.v(view);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }
}
