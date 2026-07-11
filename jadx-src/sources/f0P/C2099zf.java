package f0P;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.activities.EditActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: f0P.zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0004R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lf0P/zf;", "Lf0P/wl0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "LSJ0/V;", "o", "LSJ0/V;", "_binding", "LkgE/fuX;", "Z", "LkgE/fuX;", "E2", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "fD", "()LSJ0/V;", "binding", "S", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSettingActionBarFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingActionBarFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/SettingActionBarFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n11188#2:107\n11523#2,3:108\n1863#3,2:111\n*S KotlinDebug\n*F\n+ 1 SettingActionBarFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/SettingActionBarFragment\n*L\n50#1:107\n50#1:108,3\n69#1:111,2\n*E\n"})
public class C2099zf extends HD implements wl0 {

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f66417g = 8;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private SJ0.V _binding;

    /* JADX INFO: renamed from: f0P.zf$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final C2099zf n(int i2, int... overflowOptions) {
            Intrinsics.checkNotNullParameter(overflowOptions, "overflowOptions");
            C2099zf c2099zf = new C2099zf();
            Bundle bundle = new Bundle();
            bundle.putInt("setting_name_rsrc", i2);
            bundle.putIntArray("overflow_options", ArraysKt.toIntArray(ArraysKt.toTypedArray(overflowOptions)));
            c2099zf.setArguments(bundle);
            return c2099zf;
        }
    }

    private final SJ0.V fD() {
        SJ0.V v2 = this._binding;
        Intrinsics.checkNotNull(v2);
        return v2;
    }

    public final kgE.fuX E2() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = SJ0.V.t(inflater, container, false);
        LinearLayout root = fD().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String string;
        final List listEmptyList;
        int[] intArray;
        Pair pair;
        Intrinsics.checkNotNullParameter(view, "view");
        HI0.o7q.gh(view);
        fD().rl.setOnClickListener(new View.OnClickListener() { // from class: f0P.N8l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C2099zf.e(this.f64504n, view2);
            }
        });
        Bundle arguments = getArguments();
        int i2 = arguments != null ? arguments.getInt("setting_name_rsrc", 0) : 0;
        if (i2 != 0) {
            fD().nr.setText(i2);
        } else {
            TextView textView = fD().nr;
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (string = arguments2.getString("setting_name")) == null) {
                string = "";
            }
            textView.setText(string);
        }
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (intArray = arguments3.getIntArray("overflow_options")) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(intArray.length);
            for (int i3 : intArray) {
                if (i3 == 2131361898) {
                    pair = TuplesKt.to(Integer.valueOf(i3), 2132017665);
                } else if (i3 != 2131361903) {
                    switch (i3) {
                        case 2131361957:
                            pair = TuplesKt.to(Integer.valueOf(i3), 2132020040);
                            break;
                        case 2131361958:
                            pair = TuplesKt.to(Integer.valueOf(i3), 2132020041);
                            break;
                        case 2131361959:
                            pair = TuplesKt.to(Integer.valueOf(i3), 2132020042);
                            break;
                        case 2131361960:
                            pair = TuplesKt.to(Integer.valueOf(i3), 2132020043);
                            break;
                        case 2131361961:
                            pair = TuplesKt.to(Integer.valueOf(i3), 2132020044);
                            break;
                        case 2131361962:
                            pair = TuplesKt.to(Integer.valueOf(i3), 2132020046);
                            break;
                        default:
                            pair = null;
                            break;
                    }
                } else {
                    pair = TuplesKt.to(Integer.valueOf(i3), 2132017713);
                }
                arrayList.add(pair);
            }
            listEmptyList = CollectionsKt.filterNotNull(arrayList);
            if (listEmptyList == null) {
            }
        }
        if (listEmptyList.isEmpty()) {
            fD().f9371t.setVisibility(8);
        } else {
            fD().f9371t.setVisibility(0);
            fD().f9371t.setOnClickListener(new View.OnClickListener() { // from class: f0P.Vn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C2099zf.X(this.f64930n, listEmptyList, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(C2099zf c2099zf, int i2) {
        EditActivity editActivity;
        FragmentActivity activity = c2099zf.getActivity();
        if (activity instanceof EditActivity) {
            editActivity = (EditActivity) activity;
        } else {
            editActivity = null;
        }
        if (editActivity != null) {
            editActivity.rV9(i2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(final C2099zf c2099zf, List list, View view) {
        FragmentActivity activity = c2099zf.getActivity();
        if (activity != null) {
            com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(activity, c2099zf.E2(), false, 4, null);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                com.alightcreative.widget.nKK.ty(nkk, ((Number) pair.component2()).intValue(), ((Number) pair.component1()).intValue(), 0, false, null, 28, null);
            }
            nkk.fD(new Function1() { // from class: f0P.R0N
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C2099zf.T(this.f64645n, ((Integer) obj).intValue());
                }
            });
            nkk.X(c2099zf.getResources().getDimensionPixelSize(2131166272));
            Intrinsics.checkNotNull(view);
            com.alightcreative.widget.nKK.N(nkk, view, 0, 0, null, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C2099zf c2099zf, View view) {
        if (c2099zf.isAdded()) {
            c2099zf.getParentFragmentManager().Zmq();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }
}
