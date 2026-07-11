package com.google.firebase.perf.application;

import O2.CN3;
import O2.aC;
import R0.Wre;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import jMi.C;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class w6 extends FragmentManager.FragmentLifecycleCallbacks {
    private static final yMa.j J2 = yMa.j.O();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Ml f60585O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WeakHashMap f60586n = new WeakHashMap();
    private final j nr;
    private final O2.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C f60587t;

    public String HI(Fragment fragment) {
        return "_st_" + fragment.getClass().getSimpleName();
    }

    public w6(O2.j jVar, C c2, j jVar2, Ml ml) {
        this.rl = jVar;
        this.f60587t = c2;
        this.nr = jVar2;
        this.f60585O = ml;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void J2(FragmentManager fragmentManager, Fragment fragment) {
        super.J2(fragmentManager, fragment);
        yMa.j jVar = J2;
        jVar.rl("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f60586n.containsKey(fragment)) {
            jVar.gh("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) this.f60586n.get(fragment);
        this.f60586n.remove(fragment);
        CN3 cn3J2 = this.f60585O.J2(fragment);
        if (!cn3J2.nr()) {
            jVar.gh("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            aC.n(trace, (Wre.j) cn3J2.t());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void xMQ(FragmentManager fragmentManager, Fragment fragment) {
        String simpleName;
        super.xMQ(fragmentManager, fragment);
        J2.rl("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(HI(fragment), this.f60587t, this.rl, this.nr);
        trace.start();
        if (fragment.getParentFragment() == null) {
            simpleName = "No parent";
        } else {
            simpleName = fragment.getParentFragment().getClass().getSimpleName();
        }
        trace.putAttribute("Parent_fragment", simpleName);
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.f60586n.put(fragment, trace);
        this.f60585O.nr(fragment);
    }
}
