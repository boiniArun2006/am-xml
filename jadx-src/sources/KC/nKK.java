package KC;

import Gu.C1368c;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.safedk.android.analytics.AppLovinBridge;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LKC/nKK;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "LSJ0/VoU;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "LSJ0/VoU;", "_binding", "aYN", "()LSJ0/VoU;", "binding", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class nKK extends Fragment {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private SJ0.VoU _binding;

    private final SJ0.VoU aYN() {
        SJ0.VoU voU = this._binding;
        Intrinsics.checkNotNull(voU);
        return voU;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = SJ0.VoU.t(inflater, container, false);
        LinearLayout root = aYN().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        String string = getResources().getString(2132019362);
        String string2 = getResources().getString(2132019361);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Gu.l3D l3d = new Gu.l3D(string, string2, null, Integer.valueOf(getResources().getColor(2131099661, null)), null);
        String string3 = getResources().getString(2132019353);
        String string4 = getResources().getString(2132019352);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        Gu.l3D l3d2 = new Gu.l3D(string3, string4, 2131951649, null, null);
        String string5 = getResources().getString(2132019355);
        String string6 = getResources().getString(2132019354);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        Gu.l3D l3d3 = new Gu.l3D(string5, string6, 2131951650, null, null);
        String string7 = getResources().getString(2132019357);
        String string8 = getResources().getString(2132019356);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        Gu.l3D l3d4 = new Gu.l3D(string7, string8, 2131951651, null, null);
        String string9 = getResources().getString(2132019359);
        String string10 = getResources().getString(2132019358);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(l3d, l3d2, l3d3, l3d4, new Gu.l3D(string9, string10, 2131951652, null, getResources().getString(2132019360)));
        if (aYN().nr.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = aYN().nr.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int identifier = getResources().getIdentifier("status_bar_height", "dimen", AppLovinBridge.f61290h);
            if (identifier > 0) {
                marginLayoutParams.topMargin = getResources().getDimensionPixelSize(identifier);
                aYN().nr.setLayoutParams(marginLayoutParams);
            }
        }
        Context context = getContext();
        if (context != null) {
            aYN().rl.setAdapter(new C1368c(arrayListArrayListOf, context));
            aYN().rl.setLayoutManager(new LinearLayoutManager(context));
            aYN().rl.addItemDecoration(new yc.xq(0, 0, 0, getResources().getDimensionPixelOffset(2131166415)));
        }
        aYN().f9376t.setOnClickListener(new View.OnClickListener() { // from class: KC.Ew
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                nKK.ViF(this.f5070n, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ViF(nKK nkk, View view) {
        if (nkk.isAdded()) {
            nkk.getParentFragmentManager().o().r(nkk).mUb();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }
}
