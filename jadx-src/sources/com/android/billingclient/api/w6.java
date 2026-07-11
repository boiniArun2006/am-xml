package com.android.billingclient.api;

import android.text.TextUtils;
import com.android.billingclient.api.Wre;
import com.android.billingclient.api.w6;
import com.google.android.gms.internal.play_billing.zzbe;
import com.google.android.gms.internal.play_billing.zzco;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class w6 {
    private ArrayList J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private zzco f47645O;
    private boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f47646n;
    private C0689w6 nr;
    private String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f47647t;

    public static class j {
        private C0689w6.j J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f47648O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f47649n;
        private ArrayList nr;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List f47650t;

        public w6 n() {
            ArrayList arrayList = this.nr;
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f47650t;
            boolean z3 = (list == null || list.isEmpty()) ? false : true;
            if (!z2 && !z3) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z2 && z3) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            OS.qf qfVar = null;
            if (!z2) {
                this.f47650t.forEach(new Consumer() { // from class: OS.u
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        if (((w6.n) obj) == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        }
                    }
                });
            } else {
                if (this.nr.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.nr.size() > 1) {
                    android.support.v4.media.j.n(this.nr.get(0));
                    throw null;
                }
            }
            w6 w6Var = new w6(qfVar);
            if (z2) {
                android.support.v4.media.j.n(this.nr.get(0));
                throw null;
            }
            w6Var.f47646n = z3 && !((n) this.f47650t.get(0)).rl().KN().isEmpty();
            w6Var.rl = this.f47649n;
            w6Var.f47647t = this.rl;
            w6Var.nr = this.J2.n();
            ArrayList arrayList2 = this.nr;
            w6Var.J2 = arrayList2 != null ? new ArrayList(arrayList2) : new ArrayList();
            w6Var.Uo = this.f47648O;
            List list2 = this.f47650t;
            w6Var.f47645O = list2 != null ? zzco.zzk(list2) : zzco.zzl();
            return w6Var;
        }

        public j rl(List list) {
            this.f47650t = new ArrayList(list);
            return this;
        }

        /* synthetic */ j(OS.qf qfVar) {
            C0689w6.j jVarN = C0689w6.n();
            C0689w6.j.O(jVarN);
            this.J2 = jVarN;
        }

        public j t(C0689w6 c0689w6) {
            this.J2 = C0689w6.t(c0689w6);
            return this;
        }
    }

    public final boolean Ik() {
        return this.Uo;
    }

    public final String O() {
        return this.f47647t;
    }

    public final String nr() {
        return this.rl;
    }

    public final List xMQ() {
        return this.f47645O;
    }

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Wre f47651n;
        private final String rl;

        public static class j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private Wre f47652n;
            private String rl;

            public n n() {
                zzbe.zzc(this.f47652n, "ProductDetails is required for constructing ProductDetailsParams.");
                if (this.f47652n.J2() != null) {
                    zzbe.zzc(this.rl, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                }
                return new n(this, null);
            }

            public j t(Wre wre) {
                this.f47652n = wre;
                if (wre.t() != null) {
                    wre.t().getClass();
                    Wre.n nVarT = wre.t();
                    if (nVarT.rl() != null) {
                        this.rl = nVarT.rl();
                    }
                }
                return this;
            }

            /* synthetic */ j(OS.qf qfVar) {
            }

            public j rl(String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.rl = str;
                    return this;
                }
                throw new IllegalArgumentException("offerToken can not be empty");
            }
        }

        public static j n() {
            return new j(null);
        }

        public final Wre rl() {
            return this.f47651n;
        }

        public final String t() {
            return this.rl;
        }

        /* synthetic */ n(j jVar, OS.qf qfVar) {
            this.f47651n = jVar.f47652n;
            this.rl = jVar.rl;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.w6$w6, reason: collision with other inner class name */
    public static class C0689w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f47653n;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f47654t = 0;

        /* JADX INFO: renamed from: com.android.billingclient.api.w6$w6$j */
        public static class j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private String f47655n;
            private int nr = 0;
            private String rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private boolean f47656t;

            static /* synthetic */ j O(j jVar) {
                jVar.f47656t = true;
                return jVar;
            }

            public final j J2(String str) {
                this.f47655n = str;
                return this;
            }

            public j nr(int i2) {
                this.nr = i2;
                return this;
            }

            public j rl(String str) {
                this.f47655n = str;
                return this;
            }

            public j t(String str) {
                this.rl = str;
                return this;
            }

            public C0689w6 n() {
                boolean z2 = true;
                OS.qf qfVar = null;
                if (TextUtils.isEmpty(this.f47655n) && TextUtils.isEmpty(null)) {
                    z2 = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.rl);
                if (z2 && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f47656t && !z2 && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                C0689w6 c0689w6 = new C0689w6(qfVar);
                c0689w6.f47653n = this.f47655n;
                c0689w6.f47654t = this.nr;
                c0689w6.rl = this.rl;
                return c0689w6;
            }

            /* synthetic */ j(OS.qf qfVar) {
            }
        }

        public static j n() {
            return new j(null);
        }

        final String O() {
            return this.rl;
        }

        final String nr() {
            return this.f47653n;
        }

        final int rl() {
            return this.f47654t;
        }

        /* synthetic */ C0689w6(OS.qf qfVar) {
        }

        static /* bridge */ /* synthetic */ j t(C0689w6 c0689w6) {
            j jVarN = n();
            jVarN.J2(c0689w6.f47653n);
            jVarN.nr(c0689w6.f47654t);
            jVarN.t(c0689w6.rl);
            return jVarN;
        }
    }

    public static j n() {
        return new j(null);
    }

    public final String J2() {
        return this.nr.nr();
    }

    public final ArrayList KN() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.J2);
        return arrayList;
    }

    public final String Uo() {
        return this.nr.O();
    }

    final boolean r() {
        return (this.rl == null && this.f47647t == null && this.nr.O() == null && this.nr.rl() == 0 && !this.f47645O.stream().anyMatch(new Predicate() { // from class: OS.DAz
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return false;
            }
        }) && !this.f47646n && !this.Uo) ? false : true;
    }

    public final int rl() {
        return this.nr.rl();
    }

    final Ml t() {
        if (this.f47645O.isEmpty()) {
            return Ln.qie;
        }
        n nVar = (n) this.f47645O.get(0);
        for (int i2 = 1; i2 < this.f47645O.size(); i2++) {
            n nVar2 = (n) this.f47645O.get(i2);
            if (!nVar2.rl().O().equals(nVar.rl().O()) && !nVar2.rl().O().equals("play_pass_subs")) {
                return Ln.n(5, "All products should have same ProductType.");
            }
        }
        String strKN = nVar.rl().KN();
        HashSet hashSet = new HashSet();
        HashSet<String> hashSet2 = new HashSet();
        zzco zzcoVar = this.f47645O;
        int size = zzcoVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar3 = (n) zzcoVar.get(i3);
            nVar3.rl().O().equals("subs");
            if (hashSet.contains(nVar3.rl().nr())) {
                return Ln.n(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", nVar3.rl().nr()));
            }
            hashSet.add(nVar3.rl().nr());
            if (!nVar.rl().O().equals("play_pass_subs") && !nVar3.rl().O().equals("play_pass_subs") && !strKN.equals(nVar3.rl().KN())) {
                return Ln.n(5, "All products must have the same package name.");
            }
        }
        for (String str : hashSet2) {
            if (hashSet.contains(str)) {
                return Ln.n(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", str));
            }
        }
        Wre.n nVarT = nVar.rl().t();
        return (nVarT == null || nVarT.n() == null) ? Ln.qie : Ln.n(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
    }

    /* synthetic */ w6(OS.qf qfVar) {
    }
}
