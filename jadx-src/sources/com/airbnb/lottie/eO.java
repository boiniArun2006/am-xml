package com.airbnb.lottie;

import FQq.s4;
import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HashSet f43961n = new HashSet();

    public boolean n(s4 s4Var, boolean z2) {
        if (!z2) {
            return this.f43961n.remove(s4Var);
        }
        if (Build.VERSION.SDK_INT >= s4Var.f2585n) {
            return this.f43961n.add(s4Var);
        }
        x0.CN3.t(String.format("%s is not supported pre SDK %d", s4Var.name(), Integer.valueOf(s4Var.f2585n)));
        return false;
    }

    public boolean rl(s4 s4Var) {
        return this.f43961n.contains(s4Var);
    }

    eO() {
    }
}
