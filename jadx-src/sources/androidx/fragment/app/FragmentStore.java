package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import com.caoccao.javet.values.primitive.V8ValueNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class FragmentStore {
    private FragmentManagerViewModel nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f38630n = new ArrayList();
    private final HashMap rl = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final HashMap f38631t = new HashMap();

    List HI() {
        ArrayList arrayList;
        if (this.f38630n.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f38630n) {
            arrayList = new ArrayList(this.f38630n);
        }
        return arrayList;
    }

    Bundle Ik(String str) {
        return (Bundle) this.f38631t.get(str);
    }

    Fragment J2(String str) {
        FragmentStateManager fragmentStateManager = (FragmentStateManager) this.rl.get(str);
        if (fragmentStateManager != null) {
            return fragmentStateManager.gh();
        }
        return null;
    }

    Fragment KN(String str) {
        if (str != null) {
            for (int size = this.f38630n.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f38630n.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (FragmentStateManager fragmentStateManager : this.rl.values()) {
            if (fragmentStateManager != null) {
                Fragment fragmentGh = fragmentStateManager.gh();
                if (str.equals(fragmentGh.mTag)) {
                    return fragmentGh;
                }
            }
        }
        return null;
    }

    void O(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.rl.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (FragmentStateManager fragmentStateManager : this.rl.values()) {
                printWriter.print(str);
                if (fragmentStateManager != null) {
                    Fragment fragmentGh = fragmentStateManager.gh();
                    printWriter.println(fragmentGh);
                    fragmentGh.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(V8ValueNull.NULL);
                }
            }
        }
        int size = this.f38630n.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = (Fragment) this.f38630n.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    void S() {
        this.rl.clear();
    }

    Fragment Uo(int i2) {
        for (int size = this.f38630n.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f38630n.get(size);
            if (fragment != null && fragment.mFragmentId == i2) {
                return fragment;
            }
        }
        for (FragmentStateManager fragmentStateManager : this.rl.values()) {
            if (fragmentStateManager != null) {
                Fragment fragmentGh = fragmentStateManager.gh();
                if (fragmentGh.mFragmentId == i2) {
                    return fragmentGh;
                }
            }
        }
        return null;
    }

    ArrayList ViF() {
        ArrayList arrayList = new ArrayList(this.rl.size());
        for (FragmentStateManager fragmentStateManager : this.rl.values()) {
            if (fragmentStateManager != null) {
                Fragment fragmentGh = fragmentStateManager.gh();
                te(fragmentGh.mWho, fragmentStateManager.r());
                arrayList.add(fragmentGh.mWho);
                if (FragmentManager.F(2)) {
                    Log.v(qfEYuUHwj.Xxj, "Saved state of " + fragmentGh + ": " + fragmentGh.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    void WPU(List list) {
        this.f38630n.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment fragmentJ2 = J2(str);
                if (fragmentJ2 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.F(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentJ2);
                }
                n(fragmentJ2);
            }
        }
    }

    void XQ(Fragment fragment) {
        synchronized (this.f38630n) {
            this.f38630n.remove(fragment);
        }
        fragment.mAdded = false;
    }

    void Z() {
        Iterator it = this.f38630n.iterator();
        while (it.hasNext()) {
            FragmentStateManager fragmentStateManager = (FragmentStateManager) this.rl.get(((Fragment) it.next()).mWho);
            if (fragmentStateManager != null) {
                fragmentStateManager.az();
            }
        }
        for (FragmentStateManager fragmentStateManager2 : this.rl.values()) {
            if (fragmentStateManager2 != null) {
                fragmentStateManager2.az();
                Fragment fragmentGh = fragmentStateManager2.gh();
                if (fragmentGh.mRemoving && !fragmentGh.isInBackStack()) {
                    if (fragmentGh.mBeingSaved && !this.f38631t.containsKey(fragmentGh.mWho)) {
                        te(fragmentGh.mWho, fragmentStateManager2.r());
                    }
                    o(fragmentStateManager2);
                }
            }
        }
    }

    void aYN(HashMap map) {
        this.f38631t.clear();
        this.f38631t.putAll(map);
    }

    HashMap az() {
        return this.f38631t;
    }

    FragmentManagerViewModel ck() {
        return this.nr;
    }

    void g(FragmentManagerViewModel fragmentManagerViewModel) {
        this.nr = fragmentManagerViewModel;
    }

    List gh() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : this.rl.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager);
            }
        }
        return arrayList;
    }

    int mUb(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f38630n.indexOf(fragment);
        for (int i2 = iIndexOf - 1; i2 >= 0; i2--) {
            Fragment fragment2 = (Fragment) this.f38630n.get(i2);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f38630n.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f38630n.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    void n(Fragment fragment) {
        if (this.f38630n.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f38630n) {
            this.f38630n.add(fragment);
        }
        fragment.mAdded = true;
    }

    ArrayList nY() {
        synchronized (this.f38630n) {
            try {
                if (this.f38630n.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f38630n.size());
                for (Fragment fragment : this.f38630n) {
                    arrayList.add(fragment.mWho);
                    if (FragmentManager.F(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.mWho + "): " + fragment);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void nr(int i2) {
        for (FragmentStateManager fragmentStateManager : this.rl.values()) {
            if (fragmentStateManager != null) {
                fragmentStateManager.Z(i2);
            }
        }
    }

    List qie() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : this.rl.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager.gh());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    void rl() {
        this.rl.values().removeAll(Collections.singleton(null));
    }

    boolean t(String str) {
        return this.rl.get(str) != null;
    }

    Bundle te(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.f38631t.put(str, bundle) : (Bundle) this.f38631t.remove(str);
    }

    FragmentStateManager ty(String str) {
        return (FragmentStateManager) this.rl.get(str);
    }

    Fragment xMQ(String str) {
        Fragment fragmentFindFragmentByWho;
        for (FragmentStateManager fragmentStateManager : this.rl.values()) {
            if (fragmentStateManager != null && (fragmentFindFragmentByWho = fragmentStateManager.gh().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    FragmentStore() {
    }

    void o(FragmentStateManager fragmentStateManager) {
        Fragment fragmentGh = fragmentStateManager.gh();
        if (fragmentGh.mRetainInstance) {
            this.nr.qie(fragmentGh);
        }
        if (this.rl.get(fragmentGh.mWho) == fragmentStateManager && ((FragmentStateManager) this.rl.put(fragmentGh.mWho, null)) != null && FragmentManager.F(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentGh);
        }
    }

    void r(FragmentStateManager fragmentStateManager) {
        Fragment fragmentGh = fragmentStateManager.gh();
        if (!t(fragmentGh.mWho)) {
            this.rl.put(fragmentGh.mWho, fragmentStateManager);
            if (fragmentGh.mRetainInstanceChangedWhileDetached) {
                if (fragmentGh.mRetainInstance) {
                    this.nr.rl(fragmentGh);
                } else {
                    this.nr.qie(fragmentGh);
                }
                fragmentGh.mRetainInstanceChangedWhileDetached = false;
            }
            if (FragmentManager.F(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + fragmentGh);
            }
        }
    }
}
