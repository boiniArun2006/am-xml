package KC;

import android.R;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.view.Observer;
import com.alightcreative.app.motion.activities.main.MainActivity;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class s6u {

    static final class j implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final /* synthetic */ Function1 f5232n;

        j(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f5232n = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f5232n;
        }

        @Override // androidx.view.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f5232n.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final void HI(MainActivity mainActivity) {
        Intrinsics.checkNotNullParameter(mainActivity, "<this>");
        jEU.n nVar = new jEU.n();
        FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        FragmentTransaction fragmentTransactionO = supportFragmentManager.o();
        fragmentTransactionO.t(R.id.content, nVar, "AlightPrivacyBanner_fragment");
        fragmentTransactionO.mUb();
    }

    public static final void J2(MainActivity mainActivity, boolean z2) {
        Intrinsics.checkNotNullParameter(mainActivity, "<this>");
        Fl.Wre wreRl = Fl.Wre.INSTANCE.rl(z2);
        FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        FragmentTransaction fragmentTransactionO = supportFragmentManager.o();
        fragmentTransactionO.t(R.id.content, wreRl, "PPTOS_fragment");
        fragmentTransactionO.mUb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(MainActivity mainActivity, Function0 function0, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "<unused var>");
        FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        FragmentTransaction fragmentTransactionO = supportFragmentManager.o();
        Fragment fragmentPJg = mainActivity.getSupportFragmentManager().pJg("app_setup_fragment");
        if (fragmentPJg != null) {
            fragmentTransactionO.r(fragmentPJg);
        }
        fragmentTransactionO.mUb();
        function0.invoke();
    }

    public static final void O(MainActivity mainActivity) {
        Intrinsics.checkNotNullParameter(mainActivity, "<this>");
        i6.Ml ml = new i6.Ml();
        FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        FragmentTransaction fragmentTransactionO = supportFragmentManager.o();
        fragmentTransactionO.t(R.id.content, ml, "app_setup_fragment");
        fragmentTransactionO.mUb();
    }

    public static final void Uo(final MainActivity mainActivity, final Function0 onInitialized) {
        Intrinsics.checkNotNullParameter(mainActivity, "<this>");
        Intrinsics.checkNotNullParameter(onInitialized, "onInitialized");
        mainActivity.getSupportFragmentManager().QgZ("setup_key", mainActivity, new FragmentResultListener() { // from class: KC.VoU
            @Override // androidx.fragment.app.FragmentResultListener
            public final void n(String str, Bundle bundle) {
                s6u.KN(mainActivity, onInitialized, str, bundle);
            }
        });
    }

    public static final void az(MainActivity mainActivity, final Function2 onResult) {
        Intrinsics.checkNotNullParameter(mainActivity, "<this>");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        mainActivity.getSupportFragmentManager().QgZ("requestPrivacySettings", mainActivity, new FragmentResultListener() { // from class: KC.HcS
            @Override // androidx.fragment.app.FragmentResultListener
            public final void n(String str, Bundle bundle) {
                s6u.ty(onResult, str, bundle);
            }
        });
    }

    public static final void ck(MainActivity mainActivity, boolean z2) {
        Intrinsics.checkNotNullParameter(mainActivity, "<this>");
        jEU.Dsr dsrN = jEU.Dsr.INSTANCE.n(z2);
        FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        FragmentTransaction fragmentTransactionO = supportFragmentManager.o();
        Fragment fragmentPJg = mainActivity.getSupportFragmentManager().pJg("AlightPrivacySettings_fragment");
        if (fragmentPJg != null) {
            fragmentTransactionO.r(fragmentPJg);
        }
        fragmentTransactionO.KN(null);
        if (!z2) {
            fragmentTransactionO.WPU(2130772033, 2130772027, 2130772027, 2130772036);
        }
        fragmentTransactionO.t(R.id.content, dsrN, "AlightPrivacySettings_fragment");
        fragmentTransactionO.mUb();
    }

    public static final void gh(final MainActivity mainActivity, final Function1 onResult) {
        Intrinsics.checkNotNullParameter(mainActivity, "<this>");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        mainActivity.getSupportFragmentManager().QgZ("requestPrivacyBanner", mainActivity, new FragmentResultListener() { // from class: KC.OA
            @Override // androidx.fragment.app.FragmentResultListener
            public final void n(String str, Bundle bundle) {
                s6u.qie(mainActivity, onResult, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(MainActivity mainActivity, Function1 function1, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        FragmentTransaction fragmentTransactionO = supportFragmentManager.o();
        Fragment fragmentPJg = mainActivity.getSupportFragmentManager().pJg("PPTOS_fragment");
        if (fragmentPJg != null) {
            fragmentTransactionO.r(fragmentPJg);
        }
        fragmentTransactionO.mUb();
        function1.invoke(Boolean.valueOf(bundle.getBoolean("resultPPTOSKey", false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qie(MainActivity mainActivity, Function1 function1, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        FragmentTransaction fragmentTransactionO = supportFragmentManager.o();
        Fragment fragmentPJg = mainActivity.getSupportFragmentManager().pJg("AlightPrivacyBanner_fragment");
        if (fragmentPJg != null) {
            fragmentTransactionO.r(fragmentPJg);
        }
        fragmentTransactionO.mUb();
        if (bundle.containsKey("resultPrivacyBannerKeyOpenSettings")) {
            function1.invoke(Boolean.valueOf(bundle.getBoolean("resultPrivacyBannerKeyOpenSettings")));
        } else {
            mainActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ty(Function2 function2, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        boolean z2 = false;
        boolean z3 = bundle.getBoolean("resultPrivacySettingsKeyDidSaveChanges", false);
        boolean z4 = bundle.getBoolean("resultPrivacySettingsKeyIsFromIntroFlow", false);
        if (z4 && !z3) {
            z2 = true;
        }
        function2.invoke(Boolean.valueOf(z2), Boolean.valueOf(z4));
    }

    public static final void xMQ(final MainActivity mainActivity, final Function1 onResult) {
        Intrinsics.checkNotNullParameter(mainActivity, "<this>");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        mainActivity.getSupportFragmentManager().QgZ("requestPPTOS", mainActivity, new FragmentResultListener() { // from class: KC.Mo
            @Override // androidx.fragment.app.FragmentResultListener
            public final void n(String str, Bundle bundle) {
                s6u.mUb(mainActivity, onResult, str, bundle);
            }
        });
    }
}
