package androidx.fragment.app;

import android.util.Log;
import androidx.view.ViewModel;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class FragmentManagerViewModel extends ViewModel {
    private static final ViewModelProvider.Factory KN = new ViewModelProvider.Factory() { // from class: androidx.fragment.app.FragmentManagerViewModel.1
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel t(Class cls) {
            return new FragmentManagerViewModel(true);
        }
    };
    private final boolean nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HashMap f38605n = new HashMap();
    private final HashMap rl = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final HashMap f38606t = new HashMap();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f38604O = false;
    private boolean J2 = false;
    private boolean Uo = false;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FragmentManagerViewModel.class == obj.getClass()) {
            FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) obj;
            if (this.f38605n.equals(fragmentManagerViewModel.f38605n) && this.rl.equals(fragmentManagerViewModel.rl) && this.f38606t.equals(fragmentManagerViewModel.f38606t)) {
                return true;
            }
        }
        return false;
    }

    void nr(String str, boolean z2) {
        if (FragmentManager.F(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        O(str, z2);
    }

    @Override // androidx.view.ViewModel
    protected void onCleared() {
        if (FragmentManager.F(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f38604O = true;
    }

    void t(Fragment fragment, boolean z2) {
        if (FragmentManager.F(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        O(fragment.mWho, z2);
    }

    static FragmentManagerViewModel KN(ViewModelStore viewModelStore) {
        return (FragmentManagerViewModel) new ViewModelProvider(viewModelStore, KN).n(FragmentManagerViewModel.class);
    }

    private void O(String str, boolean z2) {
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) this.rl.get(str);
        if (fragmentManagerViewModel != null) {
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(fragmentManagerViewModel.rl.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    fragmentManagerViewModel.nr((String) it.next(), true);
                }
            }
            fragmentManagerViewModel.onCleared();
            this.rl.remove(str);
        }
        ViewModelStore viewModelStore = (ViewModelStore) this.f38606t.get(str);
        if (viewModelStore != null) {
            viewModelStore.n();
            this.f38606t.remove(str);
        }
    }

    Fragment J2(String str) {
        return (Fragment) this.f38605n.get(str);
    }

    FragmentManagerViewModel Uo(Fragment fragment) {
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) this.rl.get(fragment.mWho);
        if (fragmentManagerViewModel != null) {
            return fragmentManagerViewModel;
        }
        FragmentManagerViewModel fragmentManagerViewModel2 = new FragmentManagerViewModel(this.nr);
        this.rl.put(fragment.mWho, fragmentManagerViewModel2);
        return fragmentManagerViewModel2;
    }

    void az(boolean z2) {
        this.Uo = z2;
    }

    boolean gh() {
        return this.f38604O;
    }

    public int hashCode() {
        return (((this.f38605n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f38606t.hashCode();
    }

    ViewModelStore mUb(Fragment fragment) {
        ViewModelStore viewModelStore = (ViewModelStore) this.f38606t.get(fragment.mWho);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        this.f38606t.put(fragment.mWho, viewModelStore2);
        return viewModelStore2;
    }

    void qie(Fragment fragment) {
        if (this.Uo) {
            if (FragmentManager.F(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f38605n.remove(fragment.mWho) == null || !FragmentManager.F(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    void rl(Fragment fragment) {
        if (this.Uo) {
            if (FragmentManager.F(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f38605n.containsKey(fragment.mWho)) {
                return;
            }
            this.f38605n.put(fragment.mWho, fragment);
            if (FragmentManager.F(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f38605n.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.rl.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f38606t.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    boolean ty(Fragment fragment) {
        if (this.f38605n.containsKey(fragment.mWho)) {
            return this.nr ? this.f38604O : !this.J2;
        }
        return true;
    }

    Collection xMQ() {
        return new ArrayList(this.f38605n.values());
    }

    FragmentManagerViewModel(boolean z2) {
        this.nr = z2;
    }
}
