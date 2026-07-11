package com.alightcreative.app.motion.activities.main.newfeature;

import SJ0.m8h;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.alightcreative.app.motion.activities.main.newfeature.NewFeaturePagerActivity;
import com.google.android.material.tabs.Ml;
import com.google.android.material.tabs.TabLayout;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0003R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/alightcreative/app/motion/activities/main/newfeature/NewFeaturePagerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "Lcom/alightcreative/app/motion/activities/main/newfeature/NewFeatureInfo;", "Mx", "()Ljava/util/List;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "C", "LSJ0/m8h;", "r", "LSJ0/m8h;", "binding", "o", c.f62177j, "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NewFeaturePagerActivity extends j {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private m8h binding;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final int f45456Z = 8;

    private final class n extends FragmentStateAdapter {
        private final List gh;
        private final List mUb;
        final /* synthetic */ NewFeaturePagerActivity qie;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(NewFeaturePagerActivity newFeaturePagerActivity, FragmentManager fm2, Lifecycle lifecycle, List newFeatureInfoList) {
            super(fm2, lifecycle);
            Intrinsics.checkNotNullParameter(fm2, "fm");
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(newFeatureInfoList, "newFeatureInfoList");
            this.qie = newFeaturePagerActivity;
            this.mUb = newFeatureInfoList;
            this.gh = new ArrayList();
        }

        public final Fragment e(int i2) {
            return (Fragment) CollectionsKt.getOrNull(this.gh, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.mUb.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment ty(int i2) {
            TX.n nVar = new TX.n();
            nVar.te((NewFeatureInfo) this.mUb.get(i2));
            this.gh.add(nVar);
            return nVar;
        }
    }

    public static final class w6 extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ViewPager2 f45459n;

        w6(ViewPager2 viewPager2) {
            this.f45459n = viewPager2;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void t(int i2) {
            Fragment fragmentE;
            RecyclerView.Adapter adapter = this.f45459n.getAdapter();
            int i3 = 0;
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            while (true) {
                if (i3 >= itemCount) {
                    break;
                }
                RecyclerView.Adapter adapter2 = this.f45459n.getAdapter();
                n nVar = adapter2 instanceof n ? (n) adapter2 : null;
                fragmentE = nVar != null ? nVar.e(i3) : null;
                if (fragmentE instanceof TX.n) {
                    ((TX.n) fragmentE).g();
                }
                i3++;
            }
            RecyclerView.Adapter adapter3 = this.f45459n.getAdapter();
            n nVar2 = adapter3 instanceof n ? (n) adapter3 : null;
            fragmentE = nVar2 != null ? nVar2.e(i2) : null;
            if (fragmentE instanceof TX.n) {
                ((TX.n) fragmentE).iF();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G7(TabLayout.CN3 cn3, int i2) {
        Intrinsics.checkNotNullParameter(cn3, "<unused var>");
    }

    private final List Mx() {
        ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? getIntent().getParcelableArrayListExtra("NEW_FEATURE_INFO_LIST_KEY", NewFeatureInfo.class) : getIntent().getParcelableArrayListExtra("NEW_FEATURE_INFO_LIST_KEY");
        if (parcelableArrayListExtra != null) {
            return CollectionsKt.toList(parcelableArrayListExtra);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fcU(NewFeaturePagerActivity newFeaturePagerActivity, View view) {
        newFeaturePagerActivity.C();
    }

    public final void C() {
        finish();
    }

    @Override // com.alightcreative.app.motion.activities.main.newfeature.j, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m8h m8hVarT = m8h.t(getLayoutInflater());
        this.binding = m8hVarT;
        m8h m8hVar = null;
        if (m8hVarT == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8hVarT = null;
        }
        setContentView(m8hVarT.getRoot());
        List listMx = Mx();
        if (listMx == null) {
            C();
            return;
        }
        m8h m8hVar2 = this.binding;
        if (m8hVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8hVar2 = null;
        }
        ViewPager2 viewPager2 = m8hVar2.nr;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        viewPager2.setAdapter(new n(this, supportFragmentManager, getLifecycle(), listMx));
        m8h m8hVar3 = this.binding;
        if (m8hVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8hVar3 = null;
        }
        m8hVar3.nr.mUb(0, false);
        m8h m8hVar4 = this.binding;
        if (m8hVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8hVar4 = null;
        }
        m8hVar4.nr.setPageTransformer(null);
        m8h m8hVar5 = this.binding;
        if (m8hVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8hVar5 = null;
        }
        m8hVar5.nr.setOffscreenPageLimit(2);
        m8h m8hVar6 = this.binding;
        if (m8hVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8hVar6 = null;
        }
        m8hVar6.nr.requestDisallowInterceptTouchEvent(false);
        m8h m8hVar7 = this.binding;
        if (m8hVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8hVar7 = null;
        }
        m8hVar7.nr.setUserInputEnabled(true);
        m8h m8hVar8 = this.binding;
        if (m8hVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8hVar8 = null;
        }
        TabLayout tabLayout = m8hVar8.f9527t;
        m8h m8hVar9 = this.binding;
        if (m8hVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8hVar9 = null;
        }
        new Ml(tabLayout, m8hVar9.nr, new Ml.n() { // from class: TX.Wre
            @Override // com.google.android.material.tabs.Ml.n
            public final void n(TabLayout.CN3 cn3, int i2) {
                NewFeaturePagerActivity.G7(cn3, i2);
            }
        }).n();
        m8h m8hVar10 = this.binding;
        if (m8hVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m8hVar10 = null;
        }
        ViewPager2 newFeatureViewPager = m8hVar10.nr;
        Intrinsics.checkNotNullExpressionValue(newFeatureViewPager, "newFeatureViewPager");
        newFeatureViewPager.Uo(new w6(newFeatureViewPager));
        m8h m8hVar11 = this.binding;
        if (m8hVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            m8hVar = m8hVar11;
        }
        m8hVar.rl.setOnClickListener(new View.OnClickListener() { // from class: TX.CN3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewFeaturePagerActivity.fcU(this.f10509n, view);
            }
        });
    }
}
