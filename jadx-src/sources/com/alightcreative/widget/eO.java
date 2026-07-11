package com.alightcreative.widget;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface eO {

    public static final class j {
        public static /* synthetic */ void n(eO eOVar, boolean z2, boolean z3, boolean z4, Function1 function1, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: group");
            }
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            if ((i2 & 2) != 0) {
                z3 = false;
            }
            if ((i2 & 4) != 0) {
                z4 = false;
            }
            eOVar.KN(z2, z3, z4, function1);
        }
    }

    void J2(Function1 function1);

    void KN(boolean z2, boolean z3, boolean z4, Function1 function1);

    void O(int i2, Function1 function1);

    void Uo();

    void n(int i2);

    void nr(Function1 function1);

    void rl(Function1 function1);

    void t(boolean z2);

    void xMQ(boolean z2);
}
