package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.view.Lifecycle;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class BackStackRecord extends FragmentTransaction implements FragmentManager.BackStackEntry, FragmentManager.OpGenerator {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f38467S;
    boolean WPU;
    boolean XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final FragmentManager f38468Z;

    BackStackRecord(FragmentManager fragmentManager) {
        super(fragmentManager.HV(), fragmentManager.EWS() != null ? fragmentManager.EWS().getContext().getClassLoader() : null);
        this.f38467S = -1;
        this.WPU = false;
        this.f38468Z = fragmentManager;
    }

    public void E2(String str, PrintWriter printWriter) {
        e(str, printWriter, true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int gh() {
        return fD(true, true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int mUb() {
        return fD(false, true);
    }

    @Override // androidx.fragment.app.FragmentManager.OpGenerator
    public boolean n(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.F(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.xMQ) {
            return true;
        }
        this.f38468Z.gh(this);
        return true;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public boolean Ik() {
        return this.f38646t.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Fragment N(ArrayList arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i2 = 0;
        while (i2 < this.f38646t.size()) {
            FragmentTransaction.Op op = (FragmentTransaction.Op) this.f38646t.get(i2);
            int i3 = op.f38648n;
            if (i3 == 1) {
                arrayList.add(op.rl);
            } else if (i3 == 2) {
                Fragment fragment3 = op.rl;
                int i5 = fragment3.mContainerId;
                boolean z2 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = (Fragment) arrayList.get(size);
                    if (fragment4.mContainerId == i5) {
                        if (fragment4 == fragment3) {
                            z2 = true;
                        } else {
                            if (fragment4 == fragment2) {
                                this.f38646t.add(i2, new FragmentTransaction.Op(9, fragment4, true));
                                i2++;
                                fragment2 = null;
                            }
                            FragmentTransaction.Op op2 = new FragmentTransaction.Op(3, fragment4, true);
                            op2.nr = op.nr;
                            op2.J2 = op.J2;
                            op2.f38647O = op.f38647O;
                            op2.Uo = op.Uo;
                            this.f38646t.add(i2, op2);
                            arrayList.remove(fragment4);
                            i2++;
                        }
                    }
                }
                if (z2) {
                    this.f38646t.remove(i2);
                    i2--;
                } else {
                    op.f38648n = 1;
                    op.f38649t = true;
                    arrayList.add(fragment3);
                }
            } else if (i3 == 3 || i3 == 6) {
                arrayList.remove(op.rl);
                Fragment fragment5 = op.rl;
                if (fragment5 == fragment2) {
                    this.f38646t.add(i2, new FragmentTransaction.Op(9, fragment5));
                    i2++;
                    fragment2 = null;
                }
            } else if (i3 != 7) {
                if (i3 == 8) {
                    this.f38646t.add(i2, new FragmentTransaction.Op(9, fragment2, true));
                    op.f38649t = true;
                    i2++;
                    fragment2 = op.rl;
                }
            }
            i2++;
        }
        return fragment2;
    }

    void T() {
        for (int size = this.f38646t.size() - 1; size >= 0; size--) {
            FragmentTransaction.Op op = (FragmentTransaction.Op) this.f38646t.get(size);
            Fragment fragment = op.rl;
            if (fragment != null) {
                fragment.mBeingSaved = this.WPU;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.wKp(this.KN));
                fragment.setSharedElementNames(this.Ik, this.ck);
            }
            switch (op.f38648n) {
                case 1:
                    fragment.setAnimations(op.nr, op.f38647O, op.J2, op.Uo);
                    this.f38468Z.D76(fragment, true);
                    this.f38468Z.n7b(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.f38648n);
                case 3:
                    fragment.setAnimations(op.nr, op.f38647O, op.J2, op.Uo);
                    this.f38468Z.qie(fragment);
                    break;
                case 4:
                    fragment.setAnimations(op.nr, op.f38647O, op.J2, op.Uo);
                    this.f38468Z.LPV(fragment);
                    break;
                case 5:
                    fragment.setAnimations(op.nr, op.f38647O, op.J2, op.Uo);
                    this.f38468Z.D76(fragment, true);
                    this.f38468Z.W(fragment);
                    break;
                case 6:
                    fragment.setAnimations(op.nr, op.f38647O, op.J2, op.Uo);
                    this.f38468Z.r(fragment);
                    break;
                case 7:
                    fragment.setAnimations(op.nr, op.f38647O, op.J2, op.Uo);
                    this.f38468Z.D76(fragment, true);
                    this.f38468Z.fD(fragment);
                    break;
                case 8:
                    this.f38468Z.H(null);
                    break;
                case 9:
                    this.f38468Z.H(fragment);
                    break;
                case 10:
                    this.f38468Z.j(fragment, op.KN);
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction ViF(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.f38468Z) {
            return super.ViF(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void X() {
        int size = this.f38646t.size();
        for (int i2 = 0; i2 < size; i2++) {
            FragmentTransaction.Op op = (FragmentTransaction.Op) this.f38646t.get(i2);
            Fragment fragment = op.rl;
            if (fragment != null) {
                fragment.mBeingSaved = this.WPU;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.KN);
                fragment.setSharedElementNames(this.ck, this.Ik);
            }
            switch (op.f38648n) {
                case 1:
                    fragment.setAnimations(op.nr, op.f38647O, op.J2, op.Uo);
                    this.f38468Z.D76(fragment, false);
                    this.f38468Z.qie(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.f38648n);
                case 3:
                    fragment.setAnimations(op.nr, op.f38647O, op.J2, op.Uo);
                    this.f38468Z.n7b(fragment);
                    break;
                case 4:
                    fragment.setAnimations(op.nr, op.f38647O, op.J2, op.Uo);
                    this.f38468Z.W(fragment);
                    break;
                case 5:
                    fragment.setAnimations(op.nr, op.f38647O, op.J2, op.Uo);
                    this.f38468Z.D76(fragment, false);
                    this.f38468Z.LPV(fragment);
                    break;
                case 6:
                    fragment.setAnimations(op.nr, op.f38647O, op.J2, op.Uo);
                    this.f38468Z.fD(fragment);
                    break;
                case 7:
                    fragment.setAnimations(op.nr, op.f38647O, op.J2, op.Uo);
                    this.f38468Z.D76(fragment, false);
                    this.f38468Z.r(fragment);
                    break;
                case 8:
                    this.f38468Z.H(fragment);
                    break;
                case 9:
                    this.f38468Z.H(null);
                    break;
                case 10:
                    this.f38468Z.j(fragment, op.xMQ);
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction aYN(Fragment fragment, Lifecycle.State state) {
        if (fragment.mFragmentManager != this.f38468Z) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f38468Z);
        }
        if (state == Lifecycle.State.f38885t && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state != Lifecycle.State.f38882n) {
            return super.aYN(fragment, state);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    public void e(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.gh);
            printWriter.print(" mIndex=");
            printWriter.print(this.f38467S);
            printWriter.print(" mCommitted=");
            printWriter.println(this.XQ);
            if (this.KN != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.KN));
            }
            if (this.nr != 0 || this.f38642O != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.nr));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f38642O));
            }
            if (this.J2 != 0 || this.Uo != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.J2));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.Uo));
            }
            if (this.qie != 0 || this.az != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.qie));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.az);
            }
            if (this.ty != 0 || this.HI != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.ty));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.HI);
            }
        }
        if (this.f38646t.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f38646t.size();
        for (int i2 = 0; i2 < size; i2++) {
            FragmentTransaction.Op op = (FragmentTransaction.Op) this.f38646t.get(i2);
            switch (op.f38648n) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + op.f38648n;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(op.rl);
            if (z2) {
                if (op.nr != 0 || op.f38647O != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(op.nr));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(op.f38647O));
                }
                if (op.J2 != 0 || op.Uo != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(op.J2));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(op.Uo));
                }
            }
        }
    }

    int fD(boolean z2, boolean z3) {
        if (this.XQ) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.F(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
            E2("  ", printWriter);
            printWriter.close();
        }
        this.XQ = true;
        if (this.xMQ) {
            this.f38467S = this.f38468Z.ck();
        } else {
            this.f38467S = -1;
        }
        if (z3) {
            this.f38468Z.Nxk(this, z2);
        }
        return this.f38467S;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getId() {
        return this.f38467S;
    }

    void iF() {
        int size = this.f38646t.size() - 1;
        while (size >= 0) {
            FragmentTransaction.Op op = (FragmentTransaction.Op) this.f38646t.get(size);
            if (op.f38649t) {
                if (op.f38648n == 8) {
                    op.f38649t = false;
                    this.f38646t.remove(size - 1);
                    size--;
                } else {
                    int i2 = op.rl.mContainerId;
                    op.f38648n = 2;
                    op.f38649t = false;
                    for (int i3 = size - 1; i3 >= 0; i3--) {
                        FragmentTransaction.Op op2 = (FragmentTransaction.Op) this.f38646t.get(i3);
                        if (op2.f38649t && op2.rl.mContainerId == i2) {
                            this.f38646t.remove(i3);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public String nHg() {
        return this.gh;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction r(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f38468Z) {
            return super.r(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public void s7N() {
        if (this.f38644o != null) {
            for (int i2 = 0; i2 < this.f38644o.size(); i2++) {
                ((Runnable) this.f38644o.get(i2)).run();
            }
            this.f38644o = null;
        }
    }

    void te(int i2) {
        if (this.xMQ) {
            if (FragmentManager.F(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.f38646t.size();
            for (int i3 = 0; i3 < size; i3++) {
                FragmentTransaction.Op op = (FragmentTransaction.Op) this.f38646t.get(i3);
                Fragment fragment = op.rl;
                if (fragment != null) {
                    fragment.mBackStackNesting += i2;
                    if (FragmentManager.F(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + op.rl + " to " + op.rl.mBackStackNesting);
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f38467S >= 0) {
            sb.append(" #");
            sb.append(this.f38467S);
        }
        if (this.gh != null) {
            sb.append(" ");
            sb.append(this.gh);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction ty(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f38468Z) {
            return super.ty(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Fragment wTp(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f38646t.size() - 1; size >= 0; size--) {
            FragmentTransaction.Op op = (FragmentTransaction.Op) this.f38646t.get(size);
            int i2 = op.f38648n;
            if (i2 == 1) {
                arrayList.remove(op.rl);
            } else if (i2 != 3) {
                switch (i2) {
                    case 6:
                        arrayList.add(op.rl);
                        break;
                    case 8:
                        fragment = null;
                        break;
                    case 9:
                        fragment = op.rl;
                        break;
                    case 10:
                        op.xMQ = op.KN;
                        break;
                }
            }
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void az() {
        HI();
        this.f38468Z.dR0(this, true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    void ck(int i2, Fragment fragment, String str, int i3) {
        super.ck(i2, fragment, str, i3);
        fragment.mFragmentManager = this.f38468Z;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void qie() {
        HI();
        this.f38468Z.dR0(this, false);
    }

    BackStackRecord(BackStackRecord backStackRecord) {
        super(backStackRecord.f38468Z.HV(), backStackRecord.f38468Z.EWS() != null ? backStackRecord.f38468Z.EWS().getContext().getClassLoader() : null, backStackRecord);
        this.f38467S = -1;
        this.WPU = false;
        this.f38468Z = backStackRecord.f38468Z;
        this.XQ = backStackRecord.XQ;
        this.f38467S = backStackRecord.f38467S;
        this.WPU = backStackRecord.WPU;
    }
}
