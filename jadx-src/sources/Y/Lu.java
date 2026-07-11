package Y;

import Y.M;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\r\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"LY/Lu;", "Landroidx/fragment/app/Fragment;", "LY/xuv;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "aYN", "", "enabled", "xMQ", "(Z)V", "LSJ0/YzO;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "LSJ0/YzO;", "_binding", "", "", "t", "Ljava/util/List;", "effectIds", "ViF", "()LSJ0/YzO;", "binding", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Lu extends Fragment implements xuv {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private SJ0.YzO _binding;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private List effectIds = CollectionsKt.emptyList();

    private final class j extends FragmentStateAdapter {
        private final String gh;
        private int mUb;
        final /* synthetic */ Lu qie;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Lu lu, int i2, Fragment fa, String source) {
            super(fa);
            Intrinsics.checkNotNullParameter(fa, "fa");
            Intrinsics.checkNotNullParameter(source, "source");
            this.qie = lu;
            this.mUb = i2;
            this.gh = source;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.qie.effectIds.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment ty(int i2) {
            M mRl = M.Companion.rl(M.INSTANCE, (String) this.qie.effectIds.get(i2), i2, this.mUb, this.gh, false, 16, null);
            mRl.Y(this.qie);
            if (this.mUb != -1) {
                this.mUb = -1;
            }
            return mRl;
        }
    }

    private final SJ0.YzO ViF() {
        SJ0.YzO yzO = this._binding;
        Intrinsics.checkNotNull(yzO);
        return yzO;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = SJ0.YzO.t(inflater, container, false);
        ViewPager2 root = ViF().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        List listEmptyList;
        String string;
        String[] stringArray;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (stringArray = arguments.getStringArray("effectListIds")) == null || (listEmptyList = ArraysKt.toList(stringArray)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        this.effectIds = listEmptyList;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("source")) == null) {
            string = "";
        }
        Bundle arguments3 = getArguments();
        int i2 = arguments3 != null ? arguments3.getInt("currentEffectPosition", 0) : 0;
        ViF().rl.setAdapter(new j(this, i2, this, string));
        ViF().rl.mUb(i2, false);
        ViF().rl.setPageTransformer(null);
        ViF().rl.setOffscreenPageLimit(2);
        ViF().rl.requestDisallowInterceptTouchEvent(false);
        ViF().rl.setUserInputEnabled(true);
    }

    public final void aYN() {
        if (isAdded()) {
            getParentFragmentManager().Zmq();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // Y.xuv
    public void xMQ(boolean enabled) {
        ViF().rl.setUserInputEnabled(enabled);
    }
}
