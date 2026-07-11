package androidx.fragment.app;

import Hr.CQ.USEaHtCMH;
import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.database.sqlite.cL.PtsLKY;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.fragment.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.view.BackEventCompat;
import androidx.view.Lifecycle;
import androidx.view.LifecycleEventObserver;
import androidx.view.LifecycleOwner;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.SavedStateRegistry;
import androidx.view.SavedStateRegistryOwner;
import androidx.view.ViewModelStore;
import androidx.view.ViewModelStoreOwner;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.ActivityResultRegistry;
import androidx.view.result.ActivityResultRegistryOwner;
import androidx.view.result.IntentSenderRequest;
import androidx.view.result.contract.ActivityResultContract;
import androidx.view.result.contract.ActivityResultContracts;
import com.caoccao.javet.values.primitive.V8ValueNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class FragmentManager implements FragmentResultOwner {
    static boolean eF = true;
    private static boolean p5;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ArrayList f38563O;
    private FragmentStrictMode.Policy P5;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private ActivityResultLauncher f38565T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private FragmentManagerViewModel f38566U;
    private OnBackPressedDispatcher Uo;
    private FragmentContainer ViF;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private ActivityResultLauncher f38567X;
    private ArrayList Xw;
    private FragmentHostCallback aYN;
    private ArrayList bzg;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ActivityResultLauncher f38569e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Fragment f38570g;
    private ArrayList jB;
    private boolean nHg;
    private Fragment nY;
    private boolean rV9;
    private boolean rl;
    private boolean s7N;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f38575v;
    private boolean wTp;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f38571n = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final FragmentStore f38574t = new FragmentStore();
    ArrayList nr = new ArrayList();
    private final FragmentLayoutInflaterFactory J2 = new FragmentLayoutInflaterFactory(this);
    BackStackRecord KN = null;
    boolean xMQ = false;
    private final OnBackPressedCallback mUb = new OnBackPressedCallback(false) { // from class: androidx.fragment.app.FragmentManager.1
        @Override // androidx.view.OnBackPressedCallback
        public void J2() {
            if (FragmentManager.F(3)) {
                Log.d(pTYaLzzmJSGAPQ.XqGMSRgnKtBZlZo, "handleOnBackCancelled. PREDICTIVE_BACK = " + FragmentManager.eF + " fragment manager " + FragmentManager.this);
            }
            if (FragmentManager.eF) {
                FragmentManager.this.Z();
            }
        }

        @Override // androidx.view.OnBackPressedCallback
        public void KN(BackEventCompat backEventCompat) {
            if (FragmentManager.F(2)) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = " + FragmentManager.eF + " fragment manager " + FragmentManager.this);
            }
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.KN != null) {
                Iterator it = fragmentManager.te(new ArrayList(Collections.singletonList(FragmentManager.this.KN)), 0, 1).iterator();
                while (it.hasNext()) {
                    ((SpecialEffectsController) it.next()).g(backEventCompat);
                }
                Iterator it2 = FragmentManager.this.HI.iterator();
                while (it2.hasNext()) {
                    ((OnBackStackChangedListener) it2.next()).n(backEventCompat);
                }
            }
        }

        @Override // androidx.view.OnBackPressedCallback
        public void Uo() {
            if (FragmentManager.F(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = " + FragmentManager.eF + " fragment manager " + FragmentManager.this);
            }
            FragmentManager.this.kSg();
        }

        @Override // androidx.view.OnBackPressedCallback
        public void xMQ(BackEventCompat backEventCompat) {
            if (FragmentManager.F(3)) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = " + FragmentManager.eF + " fragment manager " + FragmentManager.this);
            }
            if (FragmentManager.eF) {
                FragmentManager.this.GR();
                FragmentManager.this.vl();
            }
        }
    };
    private final AtomicInteger gh = new AtomicInteger();
    private final Map qie = Collections.synchronizedMap(new HashMap());
    private final Map az = Collections.synchronizedMap(new HashMap());
    private final Map ty = Collections.synchronizedMap(new HashMap());
    ArrayList HI = new ArrayList();
    private final FragmentLifecycleCallbacksDispatcher ck = new FragmentLifecycleCallbacksDispatcher(this);
    private final CopyOnWriteArrayList Ik = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Consumer f38573r = new Consumer() { // from class: androidx.fragment.app.eO
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            FragmentManager.J2(this.f38738n, (Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Consumer f38572o = new Consumer() { // from class: androidx.fragment.app.z
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            FragmentManager.n(this.f38771n, (Integer) obj);
        }
    };

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final Consumer f38568Z = new Consumer() { // from class: androidx.fragment.app.QJ
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            FragmentManager.O(this.f38713n, (MultiWindowModeChangedInfo) obj);
        }
    };
    private final Consumer XQ = new Consumer() { // from class: androidx.fragment.app.l3D
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            FragmentManager.nr(this.f38742n, (PictureInPictureModeChangedInfo) obj);
        }
    };

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final MenuProvider f38564S = new MenuProvider() { // from class: androidx.fragment.app.FragmentManager.2
        @Override // androidx.core.view.MenuProvider
        public void n(Menu menu) {
            FragmentManager.this.U(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public void nr(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.nHg(menu, menuInflater);
        }

        @Override // androidx.core.view.MenuProvider
        public void rl(Menu menu) {
            FragmentManager.this.eF(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public boolean t(MenuItem menuItem) {
            return FragmentManager.this.jB(menuItem);
        }
    };
    int WPU = -1;
    private FragmentFactory te = null;
    private FragmentFactory iF = new FragmentFactory() { // from class: androidx.fragment.app.FragmentManager.3
        @Override // androidx.fragment.app.FragmentFactory
        public Fragment n(ClassLoader classLoader, String str) {
            return FragmentManager.this.EWS().rl(FragmentManager.this.EWS().getContext(), str, null);
        }
    };
    private SpecialEffectsControllerFactory fD = null;
    private SpecialEffectsControllerFactory E2 = new SpecialEffectsControllerFactory() { // from class: androidx.fragment.app.FragmentManager.4
        @Override // androidx.fragment.app.SpecialEffectsControllerFactory
        public SpecialEffectsController n(ViewGroup viewGroup) {
            return new DefaultSpecialEffectsController(viewGroup);
        }
    };

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    ArrayDeque f38562N = new ArrayDeque();
    private Runnable M7 = new Runnable() { // from class: androidx.fragment.app.FragmentManager.5
        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.k(true);
        }
    };

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public interface BackStackEntry {
        int getId();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private class ClearBackStackState implements OpGenerator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f38587n;
        final /* synthetic */ FragmentManager rl;

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean n(ArrayList arrayList, ArrayList arrayList2) {
            return this.rl.aYN(arrayList, arrayList2, this.f38587n);
        }
    }

    static class FragmentIntentSenderContract extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        @Override // androidx.view.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent(USEaHtCMH.fRLIRYpMCDo);
            Intent intentN = intentSenderRequest.getFillInIntent();
            if (intentN != null && (bundleExtra = intentN.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentN.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentN.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.Builder(intentSenderRequest.getIntentSender()).rl(null).t(intentSenderRequest.getFlagsValues(), intentSenderRequest.getFlagsMask()).n();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.F(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public ActivityResult parseResult(int i2, Intent intent) {
            return new ActivityResult(i2, intent);
        }

        FragmentIntentSenderContract() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static abstract class FragmentLifecycleCallbacks {
        public void J2(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void KN(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void O(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void Uo(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void az(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        public void gh(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void mUb(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void n(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void nr(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void qie(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void rl(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void t(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void ty(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void xMQ(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new Parcelable.Creator<LaunchedFragmentInfo>() { // from class: androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i2) {
                return new LaunchedFragmentInfo[i2];
            }
        };

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f38588n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f38589t;

        LaunchedFragmentInfo(String str, int i2) {
            this.f38588n = str;
            this.f38589t = i2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f38588n);
            parcel.writeInt(this.f38589t);
        }

        LaunchedFragmentInfo(Parcel parcel) {
            this.f38588n = parcel.readString();
            this.f38589t = parcel.readInt();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private static class LifecycleAwareResultListener implements FragmentResultListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Lifecycle f38590n;
        private final FragmentResultListener rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final LifecycleEventObserver f38591t;

        @Override // androidx.fragment.app.FragmentResultListener
        public void n(String str, Bundle bundle) {
            this.rl.n(str, bundle);
        }

        public boolean rl(Lifecycle.State state) {
            return this.f38590n.getState().rl(state);
        }

        public void t() {
            this.f38590n.nr(this.f38591t);
        }

        LifecycleAwareResultListener(Lifecycle lifecycle, FragmentResultListener fragmentResultListener, LifecycleEventObserver lifecycleEventObserver) {
            this.f38590n = lifecycle;
            this.rl = fragmentResultListener;
            this.f38591t = lifecycleEventObserver;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public interface OnBackStackChangedListener {
        void O();

        default void n(BackEventCompat backEventCompat) {
        }

        default void nr() {
        }

        default void rl(Fragment fragment, boolean z2) {
        }

        default void t(Fragment fragment, boolean z2) {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    interface OpGenerator {
        boolean n(ArrayList arrayList, ArrayList arrayList2);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private class PopBackStackState implements OpGenerator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final String f38592n;
        final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final int f38593t;

        PopBackStackState(String str, int i2, int i3) {
            this.f38592n = str;
            this.rl = i2;
            this.f38593t = i3;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean n(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = FragmentManager.this.f38570g;
            if (fragment == null || this.rl >= 0 || this.f38592n != null || !fragment.getChildFragmentManager().uG()) {
                return FragmentManager.this.Zn(arrayList, arrayList2, this.f38592n, this.rl, this.f38593t);
            }
            return false;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class PrepareBackStackTransitionState implements OpGenerator {
        PrepareBackStackTransitionState() {
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean n(ArrayList arrayList, ArrayList arrayList2) {
            boolean zNO = FragmentManager.this.nO(arrayList, arrayList2);
            if (!FragmentManager.this.HI.isEmpty() && arrayList.size() > 0) {
                boolean zBooleanValue = ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(FragmentManager.this.fcU((BackStackRecord) it.next()));
                }
                for (OnBackStackChangedListener onBackStackChangedListener : FragmentManager.this.HI) {
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        onBackStackChangedListener.t((Fragment) it2.next(), zBooleanValue);
                    }
                }
            }
            return zNO;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private class RestoreBackStackState implements OpGenerator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f38595n;

        RestoreBackStackState(String str) {
            this.f38595n = str;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean n(ArrayList arrayList, ArrayList arrayList2) {
            return FragmentManager.this.jO(arrayList, arrayList2, this.f38595n);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private class SaveBackStackState implements OpGenerator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f38596n;

        SaveBackStackState(String str) {
            this.f38596n = str;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean n(ArrayList arrayList, ArrayList arrayList2) {
            return FragmentManager.this.XNZ(arrayList, arrayList2, this.f38596n);
        }
    }

    private void B(int i2) {
        try {
            this.rl = true;
            this.f38574t.nr(i2);
            Qu(i2, false);
            Iterator it = g().iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).Ik();
            }
            this.rl = false;
            k(true);
        } catch (Throwable th) {
            this.rl = false;
            throw th;
        }
    }

    static Fragment Mx(View view) {
        while (view != null) {
            Fragment fragmentER = ER(view);
            if (fragmentER != null) {
                return fragmentER;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void WPU() {
        this.rl = false;
        this.Xw.clear();
        this.bzg.clear();
    }

    private void g6() {
        for (int i2 = 0; i2 < this.HI.size(); i2++) {
            ((OnBackStackChangedListener) this.HI.get(i2)).O();
        }
    }

    static int wKp(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 == 8194) {
            return 4097;
        }
        if (i2 == 8197) {
            return 4100;
        }
        if (i2 != 4099) {
            return i2 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    private boolean y(String str, int i2, int i3) {
        k(false);
        Y(true);
        Fragment fragment = this.f38570g;
        if (fragment != null && i2 < 0 && str == null && fragment.getChildFragmentManager().uG()) {
            return true;
        }
        boolean zZn = Zn(this.bzg, this.Xw, str, i2, i3);
        if (zZn) {
            this.rl = true;
            try {
                s(this.bzg, this.Xw);
            } finally {
                WPU();
            }
        }
        SR();
        a();
        this.f38574t.rl();
        return zZn;
    }

    void D() {
        B(2);
    }

    void E2() {
        this.s7N = false;
        this.wTp = false;
        this.f38566U.az(false);
        B(4);
    }

    void FX() {
        this.s7N = false;
        this.wTp = false;
        this.f38566U.az(false);
        B(5);
    }

    void J() {
        this.wTp = true;
        this.f38566U.az(true);
        B(4);
    }

    public void JVN(int i2, int i3) {
        xVH(i2, i3, false);
    }

    void LPV(Fragment fragment) {
        if (F(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    void M() {
        this.s7N = false;
        this.wTp = false;
        this.f38566U.az(false);
        B(7);
    }

    void M7() {
        B(5);
    }

    void N() {
        this.s7N = false;
        this.wTp = false;
        this.f38566U.az(false);
        B(1);
    }

    boolean T3L(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.K()) && T3L(fragmentManager.nY);
    }

    void W(Fragment fragment) {
        if (F(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        waP(fragment);
    }

    void Z() {
        if (F(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + this.KN);
        }
        BackStackRecord backStackRecord = this.KN;
        if (backStackRecord != null) {
            backStackRecord.XQ = false;
            backStackRecord.iF();
            this.KN.XQ(true, new Runnable() { // from class: androidx.fragment.app.s4
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentManager.t(this.f38748n);
                }
            });
            this.KN.mUb();
            this.xMQ = true;
            ijL();
            this.xMQ = false;
            this.KN = null;
        }
    }

    boolean Zn(ArrayList arrayList, ArrayList arrayList2, String str, int i2, int i3) {
        int iETf = eTf(str, i2, (i3 & 1) != 0);
        if (iETf < 0) {
            return false;
        }
        for (int size = this.nr.size() - 1; size >= iETf; size--) {
            arrayList.add((BackStackRecord) this.nr.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    void e() {
        this.s7N = false;
        this.wTp = false;
        this.f38566U.az(false);
        B(0);
    }

    void fD(Fragment fragment) {
        if (F(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (F(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f38574t.XQ(fragment);
            if (QZ6(fragment)) {
                this.nHg = true;
            }
            waP(fragment);
        }
    }

    public boolean ijL() {
        boolean zK = k(true);
        G7();
        return zK;
    }

    void kSg() {
        this.xMQ = true;
        k(true);
        this.xMQ = false;
        if (!eF || this.KN == null) {
            if (this.mUb.getIsEnabled()) {
                if (F(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                uG();
                return;
            } else {
                if (F(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                this.Uo.az();
                return;
            }
        }
        if (!this.HI.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(fcU(this.KN));
            for (OnBackStackChangedListener onBackStackChangedListener : this.HI) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    onBackStackChangedListener.rl((Fragment) it.next(), true);
                }
            }
        }
        Iterator it2 = this.KN.f38646t.iterator();
        while (it2.hasNext()) {
            Fragment fragment = ((FragmentTransaction.Op) it2.next()).rl;
            if (fragment != null) {
                fragment.mTransitioning = false;
            }
        }
        Iterator it3 = te(new ArrayList(Collections.singletonList(this.KN)), 0, 1).iterator();
        while (it3.hasNext()) {
            ((SpecialEffectsController) it3.next()).J2();
        }
        Iterator it4 = this.KN.f38646t.iterator();
        while (it4.hasNext()) {
            Fragment fragment2 = ((FragmentTransaction.Op) it4.next()).rl;
            if (fragment2 != null && fragment2.mContainer == null) {
                iF(fragment2).az();
            }
        }
        this.KN = null;
        SR();
        if (F(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + this.mUb.getIsEnabled() + " for  FragmentManager " + this);
        }
    }

    void n7b(Fragment fragment) {
        if (F(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        this.f38574t.XQ(fragment);
        if (QZ6(fragment)) {
            this.nHg = true;
        }
        fragment.mRemoving = true;
        waP(fragment);
    }

    boolean nO(ArrayList arrayList, ArrayList arrayList2) {
        if (F(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + this.f38571n);
        }
        if (this.nr.isEmpty()) {
            Log.i("FragmentManager", PtsLKY.XImyCAF);
            return false;
        }
        ArrayList arrayList3 = this.nr;
        BackStackRecord backStackRecord = (BackStackRecord) arrayList3.get(arrayList3.size() - 1);
        this.KN = backStackRecord;
        Iterator it = backStackRecord.f38646t.iterator();
        while (it.hasNext()) {
            Fragment fragment = ((FragmentTransaction.Op) it.next()).rl;
            if (fragment != null) {
                fragment.mTransitioning = true;
            }
        }
        return Zn(arrayList, arrayList2, null, -1, 0);
    }

    void r(Fragment fragment) {
        if (F(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f38574t.n(fragment);
            if (F(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (QZ6(fragment)) {
                this.nHg = true;
            }
        }
    }

    void s7N() {
        this.f38575v = true;
        k(true);
        GR();
        ViF();
        B(-1);
        Object obj = this.aYN;
        if (obj instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj).removeOnTrimMemoryListener(this.f38572o);
        }
        Object obj2 = this.aYN;
        if (obj2 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj2).removeOnConfigurationChangedListener(this.f38573r);
        }
        Object obj3 = this.aYN;
        if (obj3 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj3).removeOnMultiWindowModeChangedListener(this.f38568Z);
        }
        Object obj4 = this.aYN;
        if (obj4 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj4).removeOnPictureInPictureModeChangedListener(this.XQ);
        }
        Object obj5 = this.aYN;
        if ((obj5 instanceof MenuHost) && this.nY == null) {
            ((MenuHost) obj5).removeMenuProvider(this.f38564S);
        }
        this.aYN = null;
        this.ViF = null;
        this.nY = null;
        if (this.Uo != null) {
            this.mUb.gh();
            this.Uo = null;
        }
        ActivityResultLauncher activityResultLauncher = this.f38569e;
        if (activityResultLauncher != null) {
            activityResultLauncher.t();
            this.f38567X.t();
            this.f38565T.t();
        }
    }

    public boolean uG() {
        return y(null, -1, 0);
    }

    void wTp() {
        B(1);
    }

    static Fragment ER(View view) {
        Object tag = view.getTag(R.id.f38462n);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean F(int i2) {
        return p5 || Log.isLoggable("FragmentManager", i2);
    }

    private ViewGroup Org(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.ViF.nr()) {
            View viewT = this.ViF.t(fragment.mContainerId);
            if (viewT instanceof ViewGroup) {
                return (ViewGroup) viewT;
            }
        }
        return null;
    }

    private void P5(Fragment fragment) {
        if (fragment == null || !fragment.equals(m(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    private boolean QZ6(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.XQ();
    }

    private FragmentManagerViewModel Rl(Fragment fragment) {
        return this.f38566U.Uo(fragment);
    }

    private void SR() {
        synchronized (this.f38571n) {
            try {
                if (!this.f38571n.isEmpty()) {
                    this.mUb.az(true);
                    if (F(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z2 = Jk() > 0 && T3L(this.nY);
                if (F(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z2);
                }
                this.mUb.az(z2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void ViF() {
        FragmentHostCallback fragmentHostCallback = this.aYN;
        if (fragmentHostCallback instanceof ViewModelStoreOwner ? this.f38574t.ck().gh() : fragmentHostCallback.getContext() instanceof Activity ? !((Activity) this.aYN.getContext()).isChangingConfigurations() : true) {
            Iterator it = this.qie.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((BackStackState) it.next()).f38481n.iterator();
                while (it2.hasNext()) {
                    this.f38574t.ck().nr((String) it2.next(), false);
                }
            }
        }
    }

    private void Y(boolean z2) {
        if (this.rl) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.aYN == null) {
            if (!this.f38575v) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.aYN.getHandler().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2) {
            S();
        }
        if (this.bzg == null) {
            this.bzg = new ArrayList();
            this.Xw = new ArrayList();
        }
    }

    private void a() {
        if (this.rV9) {
            this.rV9 = false;
            rxp();
        }
    }

    private int eTf(String str, int i2, boolean z2) {
        if (this.nr.isEmpty()) {
            return -1;
        }
        if (str == null && i2 < 0) {
            if (z2) {
                return 0;
            }
            return this.nr.size() - 1;
        }
        int size = this.nr.size() - 1;
        while (size >= 0) {
            BackStackRecord backStackRecord = (BackStackRecord) this.nr.get(size);
            if ((str != null && str.equals(backStackRecord.nHg())) || (i2 >= 0 && i2 == backStackRecord.f38467S)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z2) {
            if (size == this.nr.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            BackStackRecord backStackRecord2 = (BackStackRecord) this.nr.get(size - 1);
            if ((str == null || !str.equals(backStackRecord2.nHg())) && (i2 < 0 || i2 != backStackRecord2.f38467S)) {
                break;
            }
            size--;
        }
        return size;
    }

    private boolean eWT(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f38571n) {
            if (this.f38571n.isEmpty()) {
                return false;
            }
            try {
                int size = this.f38571n.size();
                boolean zN = false;
                for (int i2 = 0; i2 < size; i2++) {
                    zN |= ((OpGenerator) this.f38571n.get(i2)).n(arrayList, arrayList2);
                }
                return zN;
            } finally {
                this.f38571n.clear();
                this.aYN.getHandler().removeCallbacks(this.M7);
            }
        }
    }

    private Set g() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f38574t.gh().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((FragmentStateManager) it.next()).gh().mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.S(viewGroup, How()));
            }
        }
        return hashSet;
    }

    private void rxp() {
        Iterator it = this.f38574t.gh().iterator();
        while (it.hasNext()) {
            X4T((FragmentStateManager) it.next());
        }
    }

    public static /* synthetic */ void t(FragmentManager fragmentManager) {
        Iterator it = fragmentManager.HI.iterator();
        while (it.hasNext()) {
            ((OnBackStackChangedListener) it.next()).nr();
        }
    }

    private boolean tFV() {
        Fragment fragment = this.nY;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.nY.getParentFragmentManager().tFV();
    }

    private static void z(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        while (i2 < i3) {
            BackStackRecord backStackRecord = (BackStackRecord) arrayList.get(i2);
            if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                backStackRecord.te(-1);
                backStackRecord.T();
            } else {
                backStackRecord.te(1);
                backStackRecord.X();
            }
            i2++;
        }
    }

    public void Aum(OnBackStackChangedListener onBackStackChangedListener) {
        this.HI.remove(onBackStackChangedListener);
    }

    boolean Bu(int i2) {
        return this.WPU >= i2;
    }

    public void EF(String str, int i2) {
        Nxk(new PopBackStackState(str, -1, i2), false);
    }

    public FragmentHostCallback EWS() {
        return this.aYN;
    }

    FragmentStore GD() {
        return this.f38574t;
    }

    void H(Fragment fragment) {
        if (fragment == null || (fragment.equals(m(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f38570g;
            this.f38570g = fragment;
            P5(fragment2);
            P5(this.f38570g);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void HBN() {
        if (this.aYN == null) {
            return;
        }
        this.s7N = false;
        this.wTp = false;
        this.f38566U.az(false);
        for (Fragment fragment : this.f38574t.HI()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    void HI(Fragment fragment) {
        this.f38566U.rl(fragment);
    }

    public FragmentFactory HV() {
        FragmentFactory fragmentFactory = this.te;
        if (fragmentFactory != null) {
            return fragmentFactory;
        }
        Fragment fragment = this.nY;
        return fragment != null ? fragment.mFragmentManager.HV() : this.iF;
    }

    SpecialEffectsControllerFactory How() {
        SpecialEffectsControllerFactory specialEffectsControllerFactory = this.fD;
        if (specialEffectsControllerFactory != null) {
            return specialEffectsControllerFactory;
        }
        Fragment fragment = this.nY;
        return fragment != null ? fragment.mFragmentManager.How() : this.E2;
    }

    public void I(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f38574t.O(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f38563O;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = (Fragment) this.f38563O.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        int size2 = this.nr.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size2; i3++) {
                BackStackRecord backStackRecord = (BackStackRecord) this.nr.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(backStackRecord.toString());
                backStackRecord.E2(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.gh.get());
        synchronized (this.f38571n) {
            try {
                int size3 = this.f38571n.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size3; i5++) {
                        OpGenerator opGenerator = (OpGenerator) this.f38571n.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(opGenerator);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.aYN);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.ViF);
        if (this.nY != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.nY);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.WPU);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.s7N);
        printWriter.print(" mStopped=");
        printWriter.print(this.wTp);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f38575v);
        if (this.nHg) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.nHg);
        }
    }

    void I9f() {
        synchronized (this.f38571n) {
            try {
                if (this.f38571n.size() == 1) {
                    this.aYN.getHandler().removeCallbacks(this.M7);
                    this.aYN.getHandler().post(this.M7);
                    SR();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void Ik(FragmentHostCallback fragmentHostCallback, FragmentContainer fragmentContainer, final Fragment fragment) {
        String str;
        if (this.aYN != null) {
            throw new IllegalStateException("Already attached");
        }
        this.aYN = fragmentHostCallback;
        this.ViF = fragmentContainer;
        this.nY = fragment;
        if (fragment != null) {
            az(new FragmentOnAttachListener() { // from class: androidx.fragment.app.FragmentManager.7
                @Override // androidx.fragment.app.FragmentOnAttachListener
                public void n(FragmentManager fragmentManager, Fragment fragment2) {
                    fragment.onAttachFragment(fragment2);
                }
            });
        } else if (fragmentHostCallback instanceof FragmentOnAttachListener) {
            az((FragmentOnAttachListener) fragmentHostCallback);
        }
        if (this.nY != null) {
            SR();
        }
        if (fragmentHostCallback instanceof OnBackPressedDispatcherOwner) {
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) fragmentHostCallback;
            OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher();
            this.Uo = onBackPressedDispatcher;
            LifecycleOwner lifecycleOwner = onBackPressedDispatcherOwner;
            if (fragment != null) {
                lifecycleOwner = fragment;
            }
            onBackPressedDispatcher.xMQ(lifecycleOwner, this.mUb);
        }
        if (fragment != null) {
            this.f38566U = fragment.mFragmentManager.Rl(fragment);
        } else if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            this.f38566U = FragmentManagerViewModel.KN(((ViewModelStoreOwner) fragmentHostCallback).getViewModelStore());
        } else {
            this.f38566U = new FragmentManagerViewModel(false);
        }
        this.f38566U.az(p0N());
        this.f38574t.g(this.f38566U);
        Object obj = this.aYN;
        if ((obj instanceof SavedStateRegistryOwner) && fragment == null) {
            SavedStateRegistry savedStateRegistry = ((SavedStateRegistryOwner) obj).getSavedStateRegistry();
            savedStateRegistry.t("android:support:fragments", new SavedStateRegistry.SavedStateProvider() { // from class: androidx.fragment.app.c
                @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                public final Bundle n() {
                    return this.f38737n.Th();
                }
            });
            Bundle bundleN = savedStateRegistry.n("android:support:fragments");
            if (bundleN != null) {
                Toy(bundleN);
            }
        }
        Object obj2 = this.aYN;
        if (obj2 instanceof ActivityResultRegistryOwner) {
            ActivityResultRegistry activityResultRegistry = ((ActivityResultRegistryOwner) obj2).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f38569e = activityResultRegistry.qie(str2 + "StartActivityForResult", new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.8
                @Override // androidx.view.result.ActivityResultCallback
                /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
                public void n(ActivityResult activityResult) {
                    LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f38562N.pollLast();
                    if (launchedFragmentInfo == null) {
                        Log.w("FragmentManager", "No Activities were started for result for " + this);
                        return;
                    }
                    String str3 = launchedFragmentInfo.f38588n;
                    int i2 = launchedFragmentInfo.f38589t;
                    Fragment fragmentXMQ = FragmentManager.this.f38574t.xMQ(str3);
                    if (fragmentXMQ != null) {
                        fragmentXMQ.onActivityResult(i2, activityResult.getResultCode(), activityResult.getData());
                        return;
                    }
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str3);
                }
            });
            this.f38567X = activityResultRegistry.qie(str2 + "StartIntentSenderForResult", new FragmentIntentSenderContract(), new ActivityResultCallback<ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.9
                @Override // androidx.view.result.ActivityResultCallback
                /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
                public void n(ActivityResult activityResult) {
                    LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f38562N.pollFirst();
                    if (launchedFragmentInfo == null) {
                        Log.w("FragmentManager", "No IntentSenders were started for " + this);
                        return;
                    }
                    String str3 = launchedFragmentInfo.f38588n;
                    int i2 = launchedFragmentInfo.f38589t;
                    Fragment fragmentXMQ = FragmentManager.this.f38574t.xMQ(str3);
                    if (fragmentXMQ != null) {
                        fragmentXMQ.onActivityResult(i2, activityResult.getResultCode(), activityResult.getData());
                        return;
                    }
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                }
            });
            this.f38565T = activityResultRegistry.qie(str2 + "RequestPermissions", new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback<Map<String, Boolean>>() { // from class: androidx.fragment.app.FragmentManager.10
                @Override // androidx.view.result.ActivityResultCallback
                /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
                public void n(Map map) {
                    int i2;
                    String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                    ArrayList arrayList = new ArrayList(map.values());
                    int[] iArr = new int[arrayList.size()];
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if (((Boolean) arrayList.get(i3)).booleanValue()) {
                            i2 = 0;
                        } else {
                            i2 = -1;
                        }
                        iArr[i3] = i2;
                    }
                    LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f38562N.pollFirst();
                    if (launchedFragmentInfo == null) {
                        Log.w("FragmentManager", "No permissions were requested for " + this);
                        return;
                    }
                    String str3 = launchedFragmentInfo.f38588n;
                    int i5 = launchedFragmentInfo.f38589t;
                    Fragment fragmentXMQ = FragmentManager.this.f38574t.xMQ(str3);
                    if (fragmentXMQ == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str3);
                        return;
                    }
                    fragmentXMQ.onRequestPermissionsResult(i5, strArr, iArr);
                }
            });
        }
        Object obj3 = this.aYN;
        if (obj3 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj3).addOnConfigurationChangedListener(this.f38573r);
        }
        Object obj4 = this.aYN;
        if (obj4 instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj4).addOnTrimMemoryListener(this.f38572o);
        }
        Object obj5 = this.aYN;
        if (obj5 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj5).addOnMultiWindowModeChangedListener(this.f38568Z);
        }
        Object obj6 = this.aYN;
        if (obj6 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj6).addOnPictureInPictureModeChangedListener(this.XQ);
        }
        Object obj7 = this.aYN;
        if ((obj7 instanceof MenuHost) && fragment == null) {
            ((MenuHost) obj7).addMenuProvider(this.f38564S);
        }
    }

    public int Jk() {
        return this.nr.size() + (this.KN != null ? 1 : 0);
    }

    public Fragment K() {
        return this.f38570g;
    }

    void Lp6(Fragment fragment) {
        this.f38566U.qie(fragment);
    }

    public void Mh(String str) {
        Nxk(new RestoreBackStackState(str), false);
    }

    public final void NP(String str, Bundle bundle) {
        LifecycleAwareResultListener lifecycleAwareResultListener = (LifecycleAwareResultListener) this.ty.get(str);
        if (lifecycleAwareResultListener == null || !lifecycleAwareResultListener.rl(Lifecycle.State.J2)) {
            this.az.put(str, bundle);
        } else {
            lifecycleAwareResultListener.n(str, bundle);
        }
        if (F(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    void Nxk(OpGenerator opGenerator, boolean z2) {
        if (!z2) {
            if (this.aYN == null) {
                if (!this.f38575v) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            S();
        }
        synchronized (this.f38571n) {
            try {
                if (this.aYN == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f38571n.add(opGenerator);
                    I9f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List Po6() {
        return this.f38574t.HI();
    }

    void Qu(int i2, boolean z2) {
        FragmentHostCallback fragmentHostCallback;
        if (this.aYN == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i2 != this.WPU) {
            this.WPU = i2;
            this.f38574t.Z();
            rxp();
            if (this.nHg && (fragmentHostCallback = this.aYN) != null && this.WPU == 7) {
                fragmentHostCallback.ck();
                this.nHg = false;
            }
        }
    }

    void RQ(Fragment fragment) {
        if (fragment.mAdded && QZ6(fragment)) {
            this.nHg = true;
        }
    }

    public void Ro(FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        this.ck.ck(fragmentLifecycleCallbacks);
    }

    boolean T(MenuItem menuItem) {
        if (this.WPU < 1) {
            return false;
        }
        for (Fragment fragment : this.f38574t.HI()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle Th() {
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle = new Bundle();
        G7();
        GR();
        k(true);
        this.s7N = true;
        this.f38566U.az(true);
        ArrayList arrayListViF = this.f38574t.ViF();
        HashMap mapAz = this.f38574t.az();
        if (!mapAz.isEmpty()) {
            ArrayList arrayListNY = this.f38574t.nY();
            int size = this.nr.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i2 = 0; i2 < size; i2++) {
                    backStackRecordStateArr[i2] = new BackStackRecordState((BackStackRecord) this.nr.get(i2));
                    if (F(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.nr.get(i2));
                    }
                }
            } else {
                backStackRecordStateArr = null;
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f38600n = arrayListViF;
            fragmentManagerState.f38603t = arrayListNY;
            fragmentManagerState.f38597O = backStackRecordStateArr;
            fragmentManagerState.J2 = this.gh.get();
            Fragment fragment = this.f38570g;
            if (fragment != null) {
                fragmentManagerState.f38602r = fragment.mWho;
            }
            fragmentManagerState.f38601o.addAll(this.qie.keySet());
            fragmentManagerState.f38599Z.addAll(this.qie.values());
            fragmentManagerState.f38598S = new ArrayList(this.f38562N);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.az.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.az.get(str));
            }
            for (String str2 : mapAz.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) mapAz.get(str2));
            }
        } else if (F(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    void Toy(Parcelable parcelable) {
        FragmentStateManager fragmentStateManager;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.aYN.getContext().getClassLoader());
                this.az.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.aYN.getContext().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f38574t.aYN(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.f38574t.S();
        Iterator it = fragmentManagerState.f38600n.iterator();
        while (it.hasNext()) {
            Bundle bundleTe = this.f38574t.te((String) it.next(), null);
            if (bundleTe != null) {
                Fragment fragmentJ2 = this.f38566U.J2(((FragmentState) bundleTe.getParcelable("state")).f38620t);
                if (fragmentJ2 != null) {
                    if (F(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentJ2);
                    }
                    fragmentStateManager = new FragmentStateManager(this.ck, this.f38574t, fragmentJ2, bundleTe);
                } else {
                    fragmentStateManager = new FragmentStateManager(this.ck, this.f38574t, this.aYN.getContext().getClassLoader(), HV(), bundleTe);
                }
                Fragment fragmentGh = fragmentStateManager.gh();
                fragmentGh.mSavedFragmentState = bundleTe;
                fragmentGh.mFragmentManager = this;
                if (F(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentGh.mWho + "): " + fragmentGh);
                }
                fragmentStateManager.HI(this.aYN.getContext().getClassLoader());
                this.f38574t.r(fragmentStateManager);
                fragmentStateManager.Z(this.WPU);
            }
        }
        for (Fragment fragment : this.f38566U.xMQ()) {
            if (!this.f38574t.t(fragment.mWho)) {
                if (F(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f38600n);
                }
                this.f38566U.qie(fragment);
                fragment.mFragmentManager = this;
                FragmentStateManager fragmentStateManager2 = new FragmentStateManager(this.ck, this.f38574t, fragment);
                fragmentStateManager2.Z(1);
                fragmentStateManager2.az();
                fragment.mRemoving = true;
                fragmentStateManager2.az();
            }
        }
        this.f38574t.WPU(fragmentManagerState.f38603t);
        if (fragmentManagerState.f38597O != null) {
            this.nr = new ArrayList(fragmentManagerState.f38597O.length);
            int i2 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f38597O;
                if (i2 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecord backStackRecordRl = backStackRecordStateArr[i2].rl(this);
                if (F(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + backStackRecordRl.f38467S + "): " + backStackRecordRl);
                    PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
                    backStackRecordRl.e("  ", printWriter, false);
                    printWriter.close();
                }
                this.nr.add(backStackRecordRl);
                i2++;
            }
        } else {
            this.nr = new ArrayList();
        }
        this.gh.set(fragmentManagerState.J2);
        String str3 = fragmentManagerState.f38602r;
        if (str3 != null) {
            Fragment fragmentM = m(str3);
            this.f38570g = fragmentM;
            P5(fragmentM);
        }
        ArrayList arrayList = fragmentManagerState.f38601o;
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                this.qie.put((String) arrayList.get(i3), (BackStackState) fragmentManagerState.f38599Z.get(i3));
            }
        }
        this.f38562N = new ArrayDeque(fragmentManagerState.f38598S);
    }

    void U(Menu menu) {
        if (this.WPU < 1) {
            return;
        }
        for (Fragment fragment : this.f38574t.HI()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void UF(FragmentContainerView fragmentContainerView) {
        View view;
        for (FragmentStateManager fragmentStateManager : this.f38574t.gh()) {
            Fragment fragmentGh = fragmentStateManager.gh();
            if (fragmentGh.mContainerId == fragmentContainerView.getId() && (view = fragmentGh.mView) != null && view.getParent() == null) {
                fragmentGh.mContainer = fragmentContainerView;
                fragmentStateManager.rl();
                fragmentStateManager.az();
            }
        }
    }

    void Uf(Fragment fragment, String[] strArr, int i2) {
        if (this.f38565T == null) {
            this.aYN.qie(fragment, strArr, i2);
            return;
        }
        this.f38562N.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
        this.f38565T.n(strArr);
    }

    FragmentLifecycleCallbacksDispatcher UhV() {
        return this.ck;
    }

    public boolean Vvq(int i2, int i3) {
        if (i2 >= 0) {
            return y(null, i2, i3);
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    boolean VwL(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    void X(Configuration configuration, boolean z2) {
        if (z2 && (this.aYN instanceof OnConfigurationChangedProvider)) {
            Fp(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f38574t.HI()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z2) {
                    fragment.mChildFragmentManager.X(configuration, true);
                }
            }
        }
    }

    boolean XNZ(ArrayList arrayList, ArrayList arrayList2, String str) {
        int i2;
        int iETf = eTf(str, -1, true);
        if (iETf < 0) {
            return false;
        }
        for (int i3 = iETf; i3 < this.nr.size(); i3++) {
            BackStackRecord backStackRecord = (BackStackRecord) this.nr.get(i3);
            if (!backStackRecord.f38645r) {
                Fp(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + backStackRecord + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i5 = iETf; i5 < this.nr.size(); i5++) {
            BackStackRecord backStackRecord2 = (BackStackRecord) this.nr.get(i5);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            for (FragmentTransaction.Op op : backStackRecord2.f38646t) {
                Fragment fragment = op.rl;
                if (fragment != null) {
                    if (!op.f38649t || (i2 = op.f38648n) == 1 || i2 == 2 || i2 == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i7 = op.f38648n;
                    if (i7 == 1 || i7 == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("saveBackStack(\"");
                sb.append(str);
                sb.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                sb.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                sb.append(" in ");
                sb.append(backStackRecord2);
                sb.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                Fp(new IllegalArgumentException(sb.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.mRetainInstance) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("saveBackStack(\"");
                sb2.append(str);
                sb2.append("\") must not contain retained fragments. Found ");
                sb2.append(hashSet.contains(fragment2) ? "direct reference to retained " : "retained child ");
                sb2.append("fragment ");
                sb2.append(fragment2);
                Fp(new IllegalArgumentException(sb2.toString()));
            }
            for (Fragment fragment3 : fragment2.mChildFragmentManager.ul()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Fragment) it.next()).mWho);
        }
        ArrayList arrayList4 = new ArrayList(this.nr.size() - iETf);
        for (int i8 = iETf; i8 < this.nr.size(); i8++) {
            arrayList4.add(null);
        }
        BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
        for (int size = this.nr.size() - 1; size >= iETf; size--) {
            BackStackRecord backStackRecord3 = (BackStackRecord) this.nr.remove(size);
            BackStackRecord backStackRecord4 = new BackStackRecord(backStackRecord3);
            backStackRecord4.iF();
            arrayList4.set(size - iETf, new BackStackRecordState(backStackRecord4));
            backStackRecord3.WPU = true;
            arrayList.add(backStackRecord3);
            arrayList2.add(Boolean.TRUE);
        }
        this.qie.put(str, backStackState);
        return true;
    }

    boolean XQ() {
        boolean zQZ6 = false;
        for (Fragment fragment : this.f38574t.qie()) {
            if (fragment != null) {
                zQZ6 = QZ6(fragment);
            }
            if (zQZ6) {
                return true;
            }
        }
        return false;
    }

    void Xw() {
        for (Fragment fragment : this.f38574t.qie()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.Xw();
            }
        }
    }

    public void Zmq() {
        Nxk(new PopBackStackState(null, -1, 0), false);
    }

    public boolean a63() {
        return this.f38575v;
    }

    public void az(FragmentOnAttachListener fragmentOnAttachListener) {
        this.Ik.add(fragmentOnAttachListener);
    }

    void bzg(Fragment fragment) {
        Iterator it = this.Ik.iterator();
        while (it.hasNext()) {
            ((FragmentOnAttachListener) it.next()).n(this, fragment);
        }
    }

    int ck() {
        return this.gh.getAndIncrement();
    }

    void dR0(OpGenerator opGenerator, boolean z2) {
        if (z2 && (this.aYN == null || this.f38575v)) {
            return;
        }
        Y(z2);
        BackStackRecord backStackRecord = this.KN;
        boolean z3 = false;
        if (backStackRecord != null) {
            backStackRecord.XQ = false;
            backStackRecord.iF();
            if (F(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.KN + " as part of execSingleAction for action " + opGenerator);
            }
            this.KN.fD(false, false);
            boolean zN = this.KN.n(this.bzg, this.Xw);
            Iterator it = this.KN.f38646t.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((FragmentTransaction.Op) it.next()).rl;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.KN = null;
            z3 = zN;
        }
        boolean zN2 = opGenerator.n(this.bzg, this.Xw);
        if (z3 || zN2) {
            this.rl = true;
            try {
                s(this.bzg, this.Xw);
            } finally {
                WPU();
            }
        }
        SR();
        a();
        this.f38574t.rl();
    }

    boolean eF(Menu menu) {
        boolean z2 = false;
        if (this.WPU < 1) {
            return false;
        }
        for (Fragment fragment : this.f38574t.HI()) {
            if (fragment != null && mI(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    void f(Fragment fragment, Intent intent, int i2, Bundle bundle) {
        if (this.f38569e == null) {
            this.aYN.ty(fragment, intent, i2, bundle);
            return;
        }
        this.f38562N.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f38569e.n(intent);
    }

    Set fcU(BackStackRecord backStackRecord) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < backStackRecord.f38646t.size(); i2++) {
            Fragment fragment = ((FragmentTransaction.Op) backStackRecord.f38646t.get(i2)).rl;
            if (fragment != null && backStackRecord.xMQ) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    void gh(BackStackRecord backStackRecord) {
        this.nr.add(backStackRecord);
    }

    LayoutInflater.Factory2 hRu() {
        return this.J2;
    }

    Fragment i() {
        return this.nY;
    }

    FragmentStateManager iF(Fragment fragment) {
        FragmentStateManager fragmentStateManagerTy = this.f38574t.ty(fragment.mWho);
        if (fragmentStateManagerTy != null) {
            return fragmentStateManagerTy;
        }
        FragmentStateManager fragmentStateManager = new FragmentStateManager(this.ck, this.f38574t, fragment);
        fragmentStateManager.HI(this.aYN.getContext().getClassLoader());
        fragmentStateManager.Z(this.WPU);
        return fragmentStateManager;
    }

    void j(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(m(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    boolean jB(MenuItem menuItem) {
        if (this.WPU < 1) {
            return false;
        }
        for (Fragment fragment : this.f38574t.HI()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean jO(ArrayList arrayList, ArrayList arrayList2, String str) {
        BackStackState backStackState = (BackStackState) this.qie.remove(str);
        if (backStackState == null) {
            return false;
        }
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BackStackRecord backStackRecord = (BackStackRecord) it.next();
            if (backStackRecord.WPU) {
                Iterator it2 = backStackRecord.f38646t.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = ((FragmentTransaction.Op) it2.next()).rl;
                    if (fragment != null) {
                        map.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        Iterator it3 = backStackState.n(this, map).iterator();
        while (true) {
            boolean z2 = false;
            while (it3.hasNext()) {
                if (((BackStackRecord) it3.next()).n(arrayList, arrayList2) || z2) {
                    z2 = true;
                }
            }
            return z2;
        }
    }

    ViewModelStore lLA(Fragment fragment) {
        return this.f38566U.mUb(fragment);
    }

    public Fragment.SavedState lNy(Fragment fragment) {
        FragmentStateManager fragmentStateManagerTy = this.f38574t.ty(fragment.mWho);
        if (fragmentStateManagerTy == null || !fragmentStateManagerTy.gh().equals(fragment)) {
            Fp(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return fragmentStateManagerTy.Ik();
    }

    Fragment m(String str) {
        return this.f38574t.J2(str);
    }

    boolean mI(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public BackStackEntry n1(int i2) {
        if (i2 != this.nr.size()) {
            return (BackStackEntry) this.nr.get(i2);
        }
        BackStackRecord backStackRecord = this.KN;
        if (backStackRecord != null) {
            return backStackRecord;
        }
        throw new IndexOutOfBoundsException();
    }

    boolean nHg(Menu menu, MenuInflater menuInflater) {
        if (this.WPU < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (Fragment fragment : this.f38574t.HI()) {
            if (fragment != null && mI(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z2 = true;
            }
        }
        if (this.f38563O != null) {
            for (int i2 = 0; i2 < this.f38563O.size(); i2++) {
                Fragment fragment2 = (Fragment) this.f38563O.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f38563O = arrayList;
        return z2;
    }

    public final void nY(String str) {
        this.az.remove(str);
        if (F(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    public FragmentTransaction o() {
        return new BackStackRecord(this);
    }

    public void o9(FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z2) {
        this.ck.HI(fragmentLifecycleCallbacks, z2);
    }

    Fragment ofS(String str) {
        return this.f38574t.xMQ(str);
    }

    public boolean p0N() {
        return this.s7N || this.wTp;
    }

    void p5(boolean z2, boolean z3) {
        if (z3 && (this.aYN instanceof OnPictureInPictureModeChangedProvider)) {
            Fp(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f38574t.HI()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z2);
                if (z3) {
                    fragment.mChildFragmentManager.p5(z2, true);
                }
            }
        }
    }

    public Fragment pJg(String str) {
        return this.f38574t.KN(str);
    }

    FragmentStateManager qie(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.KN(fragment, str);
        }
        if (F(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        FragmentStateManager fragmentStateManagerIF = iF(fragment);
        fragment.mFragmentManager = this;
        this.f38574t.r(fragmentStateManagerIF);
        if (!fragment.mDetached) {
            this.f38574t.n(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (QZ6(fragment)) {
                this.nHg = true;
            }
        }
        return fragmentStateManagerIF;
    }

    FragmentContainer qm() {
        return this.ViF;
    }

    void rV9(boolean z2, boolean z3) {
        if (z3 && (this.aYN instanceof OnMultiWindowModeChangedProvider)) {
            Fp(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f38574t.HI()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z2);
                if (z3) {
                    fragment.mChildFragmentManager.rV9(z2, true);
                }
            }
        }
    }

    public FragmentStrictMode.Policy tUK() {
        return this.P5;
    }

    Set te(ArrayList arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator it = ((BackStackRecord) arrayList.get(i2)).f38646t.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((FragmentTransaction.Op) it.next()).rl;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(SpecialEffectsController.XQ(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.nY;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.nY)));
            sb.append("}");
        } else {
            FragmentHostCallback fragmentHostCallback = this.aYN;
            if (fragmentHostCallback != null) {
                sb.append(fragmentHostCallback.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.aYN)));
                sb.append("}");
            } else {
                sb.append(V8ValueNull.NULL);
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public void ty(OnBackStackChangedListener onBackStackChangedListener) {
        this.HI.add(onBackStackChangedListener);
    }

    void ub(Fragment fragment, IntentSender intentSender, int i2, Intent intent, int i3, int i5, int i7, Bundle bundle) {
        if (this.f38567X == null) {
            this.aYN.HI(fragment, intentSender, i2, intent, i3, i5, i7, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (F(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + fragment);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        IntentSenderRequest intentSenderRequestN = new IntentSenderRequest.Builder(intentSender).rl(intent).t(i5, i3).n();
        this.f38562N.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
        if (F(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.f38567X.n(intentSenderRequestN);
    }

    List ul() {
        return this.f38574t.qie();
    }

    void v(boolean z2) {
        if (z2 && (this.aYN instanceof OnTrimMemoryProvider)) {
            Fp(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f38574t.HI()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z2) {
                    fragment.mChildFragmentManager.v(true);
                }
            }
        }
    }

    public void v0j(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            Fp(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    void vl() {
        Nxk(new PrepareBackStackTransitionState(), false);
    }

    void xVH(int i2, int i3, boolean z2) {
        if (i2 >= 0) {
            Nxk(new PopBackStackState(null, i2, i3), z2);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public Fragment xg(int i2) {
        return this.f38574t.Uo(i2);
    }

    public void xzo(String str) {
        Nxk(new SaveBackStackState(str), false);
    }

    public static FragmentManager C(View view) {
        FragmentActivity fragmentActivity;
        Fragment fragmentMx = Mx(view);
        if (fragmentMx != null) {
            if (fragmentMx.isAdded()) {
                return fragmentMx.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + fragmentMx + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                fragmentActivity = null;
                break;
            }
        }
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    private void Fp(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
        FragmentHostCallback fragmentHostCallback = this.aYN;
        if (fragmentHostCallback != null) {
            try {
                fragmentHostCallback.xMQ("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw runtimeException;
            }
        }
        try {
            I("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    private void G7() {
        Iterator it = g().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void GR() {
        Iterator it = g().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).Ik();
        }
    }

    public static /* synthetic */ void J2(FragmentManager fragmentManager, Configuration configuration) {
        if (fragmentManager.tFV()) {
            fragmentManager.X(configuration, false);
        }
    }

    public static /* synthetic */ void O(FragmentManager fragmentManager, MultiWindowModeChangedInfo multiWindowModeChangedInfo) {
        if (fragmentManager.tFV()) {
            fragmentManager.rV9(multiWindowModeChangedInfo.getIsInMultiWindowMode(), false);
        }
    }

    private void S() {
        if (!p0N()) {
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public static /* synthetic */ void n(FragmentManager fragmentManager, Integer num) {
        if (fragmentManager.tFV() && num.intValue() == 80) {
            fragmentManager.v(false);
        }
    }

    public static /* synthetic */ void nr(FragmentManager fragmentManager, PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo) {
        if (fragmentManager.tFV()) {
            fragmentManager.p5(pictureInPictureModeChangedInfo.getIsInPictureInPictureMode(), false);
        }
    }

    private void piY(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        boolean z2 = ((BackStackRecord) arrayList.get(i2)).f38645r;
        ArrayList arrayList3 = this.jB;
        if (arrayList3 == null) {
            this.jB = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.jB.addAll(this.f38574t.HI());
        Fragment fragmentK = K();
        boolean z3 = false;
        for (int i5 = i2; i5 < i3; i5++) {
            BackStackRecord backStackRecord = (BackStackRecord) arrayList.get(i5);
            if (!((Boolean) arrayList2.get(i5)).booleanValue()) {
                fragmentK = backStackRecord.N(this.jB, fragmentK);
            } else {
                fragmentK = backStackRecord.wTp(this.jB, fragmentK);
            }
            if (!z3 && !backStackRecord.xMQ) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        this.jB.clear();
        if (!z2 && this.WPU >= 1) {
            for (int i7 = i2; i7 < i3; i7++) {
                Iterator it = ((BackStackRecord) arrayList.get(i7)).f38646t.iterator();
                while (it.hasNext()) {
                    Fragment fragment = ((FragmentTransaction.Op) it.next()).rl;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f38574t.r(iF(fragment));
                    }
                }
            }
        }
        z(arrayList, arrayList2, i2, i3);
        boolean zBooleanValue = ((Boolean) arrayList2.get(i3 - 1)).booleanValue();
        if (z3 && !this.HI.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(fcU((BackStackRecord) it2.next()));
            }
            if (this.KN == null) {
                for (OnBackStackChangedListener onBackStackChangedListener : this.HI) {
                    Iterator it3 = linkedHashSet.iterator();
                    while (it3.hasNext()) {
                        onBackStackChangedListener.t((Fragment) it3.next(), zBooleanValue);
                    }
                }
                for (OnBackStackChangedListener onBackStackChangedListener2 : this.HI) {
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        onBackStackChangedListener2.rl((Fragment) it4.next(), zBooleanValue);
                    }
                }
            }
        }
        for (int i8 = i2; i8 < i3; i8++) {
            BackStackRecord backStackRecord2 = (BackStackRecord) arrayList.get(i8);
            if (zBooleanValue) {
                for (int size = backStackRecord2.f38646t.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = ((FragmentTransaction.Op) backStackRecord2.f38646t.get(size)).rl;
                    if (fragment2 != null) {
                        iF(fragment2).az();
                    }
                }
            } else {
                Iterator it5 = backStackRecord2.f38646t.iterator();
                while (it5.hasNext()) {
                    Fragment fragment3 = ((FragmentTransaction.Op) it5.next()).rl;
                    if (fragment3 != null) {
                        iF(fragment3).az();
                    }
                }
            }
        }
        Qu(this.WPU, true);
        for (SpecialEffectsController specialEffectsController : te(arrayList, i2, i3)) {
            specialEffectsController.fD(zBooleanValue);
            specialEffectsController.nY();
            specialEffectsController.ty();
        }
        while (i2 < i3) {
            BackStackRecord backStackRecord3 = (BackStackRecord) arrayList.get(i2);
            if (((Boolean) arrayList2.get(i2)).booleanValue() && backStackRecord3.f38467S >= 0) {
                backStackRecord3.f38467S = -1;
            }
            backStackRecord3.s7N();
            i2++;
        }
        if (z3) {
            g6();
        }
    }

    private void s(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    if (!((BackStackRecord) arrayList.get(i2)).f38645r) {
                        if (i3 != i2) {
                            piY(arrayList, arrayList2, i3, i2);
                        }
                        i3 = i2 + 1;
                        if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                            while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((BackStackRecord) arrayList.get(i3)).f38645r) {
                                i3++;
                            }
                        }
                        piY(arrayList, arrayList2, i2, i3);
                        i2 = i3 - 1;
                    }
                    i2++;
                }
                if (i3 != size) {
                    piY(arrayList, arrayList2, i3, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    private void waP(Fragment fragment) {
        ViewGroup viewGroupOrg = Org(fragment);
        if (viewGroupOrg != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            int i2 = R.id.f38463t;
            if (viewGroupOrg.getTag(i2) == null) {
                viewGroupOrg.setTag(i2, fragment);
            }
            ((Fragment) viewGroupOrg.getTag(i2)).setPopDirection(fragment.getPopDirection());
        }
    }

    void D76(Fragment fragment, boolean z2) {
        ViewGroup viewGroupOrg = Org(fragment);
        if (viewGroupOrg != null && (viewGroupOrg instanceof FragmentContainerView)) {
            ((FragmentContainerView) viewGroupOrg).setDrawDisappearingViewsLast(!z2);
        }
    }

    void E() {
        SR();
        P5(this.f38570g);
    }

    public final void QgZ(final String str, LifecycleOwner lifecycleOwner, final FragmentResultListener fragmentResultListener) {
        final Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getState() == Lifecycle.State.f38882n) {
            return;
        }
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.view.LifecycleEventObserver
            public void Z(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                Bundle bundle;
                if (event == Lifecycle.Event.ON_START && (bundle = (Bundle) FragmentManager.this.az.get(str)) != null) {
                    fragmentResultListener.n(str, bundle);
                    FragmentManager.this.nY(str);
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycle.nr(this);
                    FragmentManager.this.ty.remove(str);
                }
            }
        };
        LifecycleAwareResultListener lifecycleAwareResultListener = (LifecycleAwareResultListener) this.ty.put(str, new LifecycleAwareResultListener(lifecycle, fragmentResultListener, lifecycleEventObserver));
        if (lifecycleAwareResultListener != null) {
            lifecycleAwareResultListener.t();
        }
        if (F(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + fragmentResultListener);
        }
        lifecycle.n(lifecycleEventObserver);
    }

    void X4T(FragmentStateManager fragmentStateManager) {
        Fragment fragmentGh = fragmentStateManager.gh();
        if (fragmentGh.mDeferStart) {
            if (this.rl) {
                this.rV9 = true;
            } else {
                fragmentGh.mDeferStart = false;
                fragmentStateManager.az();
            }
        }
    }

    boolean aYN(ArrayList arrayList, ArrayList arrayList2, String str) {
        if (!jO(arrayList, arrayList2, str)) {
            return false;
        }
        return Zn(arrayList, arrayList2, str, -1, 1);
    }

    boolean k(boolean z2) {
        BackStackRecord backStackRecord;
        Y(z2);
        boolean z3 = false;
        if (!this.xMQ && (backStackRecord = this.KN) != null) {
            backStackRecord.XQ = false;
            backStackRecord.iF();
            if (F(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.KN + " as part of execPendingActions for actions " + this.f38571n);
            }
            this.KN.fD(false, false);
            this.f38571n.add(0, this.KN);
            Iterator it = this.KN.f38646t.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((FragmentTransaction.Op) it.next()).rl;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.KN = null;
        }
        while (eWT(this.bzg, this.Xw)) {
            z3 = true;
            this.rl = true;
            try {
                s(this.bzg, this.Xw);
            } finally {
                WPU();
            }
        }
        SR();
        a();
        this.f38574t.rl();
        return z3;
    }

    public Fragment mYa(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentM = m(string);
        if (fragmentM == null) {
            Fp(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentM;
    }
}
