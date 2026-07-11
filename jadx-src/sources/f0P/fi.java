package f0P;

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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0004J-\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u0004\u0018\u00010!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lf0P/fi;", "Lf0P/wl0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "editKeyframeMode", "firstContour", "lastContour", "canAddContour", "N", "(ZZZZ)V", "LSJ0/IG;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "LSJ0/IG;", "_binding", "te", "()LSJ0/IG;", "binding", "Lf0P/Wqz;", "iF", "()Lf0P/Wqz;", "editPointsFragment", "t", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEditPointsActionBarFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditPointsActionBarFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/EditPointsActionBarFragment\n+ 2 FragmentTrackingActivity.kt\ncom/alightcreative/app/motion/activities/interfaces/FragmentTrackingActivityKt\n*L\n1#1,118:1\n12#2:119\n*S KotlinDebug\n*F\n+ 1 EditPointsActionBarFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/EditPointsActionBarFragment\n*L\n27#1:119\n*E\n"})
public class fi extends Fragment implements wl0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private SJ0.IG _binding;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f65560O = 8;

    /* JADX INFO: renamed from: f0P.fi$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final fi n(int i2, int... overflowOptions) {
            Intrinsics.checkNotNullParameter(overflowOptions, "overflowOptions");
            fi fiVar = new fi();
            Bundle bundle = new Bundle();
            bundle.putInt("setting_name_rsrc", i2);
            bundle.putIntArray("overflow_options", ArraysKt.toIntArray(ArraysKt.toTypedArray(overflowOptions)));
            fiVar.setArguments(bundle);
            return fiVar;
        }
    }

    public final void N(boolean editKeyframeMode, boolean firstContour, boolean lastContour, boolean canAddContour) {
        if (editKeyframeMode) {
            te().rl.setActivated(true);
            te().f9155t.setActivated(false);
        } else {
            te().rl.setActivated(false);
            te().f9155t.setActivated(true);
        }
        if (firstContour) {
            te().J2.setEnabled(false);
            te().J2.setAlpha(0.3f);
        } else {
            te().J2.setEnabled(true);
            te().J2.setAlpha(1.0f);
        }
        if (!lastContour) {
            te().f9153O.setEnabled(true);
            te().f9153O.setAlpha(1.0f);
            te().f9153O.setImageResource(2131231843);
        } else if (canAddContour) {
            te().f9153O.setEnabled(true);
            te().f9153O.setAlpha(1.0f);
            te().f9153O.setImageResource(2131231469);
        } else {
            te().f9153O.setEnabled(false);
            te().f9153O.setAlpha(0.3f);
            te().f9153O.setImageResource(2131231843);
        }
    }

    private final SJ0.IG te() {
        SJ0.IG ig = this._binding;
        Intrinsics.checkNotNull(ig);
        return ig;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = SJ0.IG.t(inflater, container, false);
        LinearLayout root = te().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        HI0.o7q.gh(view);
        te().J2.setOnClickListener(new View.OnClickListener() { // from class: f0P.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                fi.fD(this.f65530n, view2);
            }
        });
        te().f9153O.setOnClickListener(new View.OnClickListener() { // from class: f0P.Vgd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                fi.E2(this.f64928n, view2);
            }
        });
        te().rl.setOnClickListener(new View.OnClickListener() { // from class: f0P.tB
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                fi.e(this.f66194n, view2);
            }
        });
        te().f9155t.setOnClickListener(new View.OnClickListener() { // from class: f0P.tce
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                fi.X(this.f66224n, view2);
            }
        });
        te().nr.setOnClickListener(new View.OnClickListener() { // from class: f0P.xx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                fi.T(this.f66355n, view2);
            }
        });
        Bundle arguments = getArguments();
        int i2 = arguments != null ? arguments.getInt("setting_name_rsrc", 0) : 0;
        if (i2 != 0) {
            te().Uo.setText(i2);
        } else {
            TextView textView = te().Uo;
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (string = arguments2.getString("setting_name")) == null) {
                string = "";
            }
            textView.setText(string);
        }
        Wqz wqzIF = iF();
        if (wqzIF != null) {
            wqzIF.Bha();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E2(fi fiVar, View view) {
        Wqz wqzIF = fiVar.iF();
        if (wqzIF != null) {
            wqzIF.WH();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(fi fiVar, View view) {
        if (fiVar.isAdded()) {
            fiVar.getParentFragmentManager().Zmq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(fi fiVar, View view) {
        Wqz wqzIF = fiVar.iF();
        if (wqzIF != null) {
            wqzIF.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(fi fiVar, View view) {
        Wqz wqzIF = fiVar.iF();
        if (wqzIF != null) {
            wqzIF.q9();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fD(fi fiVar, View view) {
        Wqz wqzIF = fiVar.iF();
        if (wqzIF != null) {
            wqzIF.w();
        }
    }

    private final Wqz iF() {
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
            fragmentHI = nVar.HI(Wqz.class);
        }
        return (Wqz) fragmentHI;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }
}
