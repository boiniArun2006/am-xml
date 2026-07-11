package com.alightcreative.account;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kgE.Sis;
import kgE.Zs;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class o {
    public static final j gh = new j(null);
    public static final int qie = 8;
    private final kgE.Wre J2;
    private final List KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f44298O;
    private final Long Uo;
    private final boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f44299n;
    private final Zs nr;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f44300t;
    private final List xMQ;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final o n() {
            return Sis.f70091t;
        }
    }

    public o(Set activeBenefits, List activeLicenses, Map availablePurchases, Zs queryState, boolean z2, kgE.Wre accountInfoSource, Long l2, List errors, List pendingPurchases, boolean z3) {
        Intrinsics.checkNotNullParameter(activeBenefits, "activeBenefits");
        Intrinsics.checkNotNullParameter(activeLicenses, "activeLicenses");
        Intrinsics.checkNotNullParameter(availablePurchases, "availablePurchases");
        Intrinsics.checkNotNullParameter(queryState, "queryState");
        Intrinsics.checkNotNullParameter(accountInfoSource, "accountInfoSource");
        Intrinsics.checkNotNullParameter(errors, "errors");
        Intrinsics.checkNotNullParameter(pendingPurchases, "pendingPurchases");
        this.f44299n = activeBenefits;
        this.rl = activeLicenses;
        this.f44300t = availablePurchases;
        this.nr = queryState;
        this.f44298O = z2;
        this.J2 = accountInfoSource;
        this.Uo = l2;
        this.KN = errors;
        this.xMQ = pendingPurchases;
        this.mUb = z3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f44299n, oVar.f44299n) && Intrinsics.areEqual(this.rl, oVar.rl) && Intrinsics.areEqual(this.f44300t, oVar.f44300t) && this.nr == oVar.nr && this.f44298O == oVar.f44298O && this.J2 == oVar.J2 && Intrinsics.areEqual(this.Uo, oVar.Uo) && Intrinsics.areEqual(this.KN, oVar.KN) && Intrinsics.areEqual(this.xMQ, oVar.xMQ) && this.mUb == oVar.mUb;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.f44299n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f44300t.hashCode()) * 31) + this.nr.hashCode()) * 31) + Boolean.hashCode(this.f44298O)) * 31) + this.J2.hashCode()) * 31;
        Long l2 = this.Uo;
        return ((((((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + this.KN.hashCode()) * 31) + this.xMQ.hashCode()) * 31) + Boolean.hashCode(this.mUb);
    }

    public String toString() {
        return "PurchaseState(activeBenefits=" + this.f44299n + ", activeLicenses=" + this.rl + ", availablePurchases=" + this.f44300t + ", queryState=" + this.nr + ", accountSignedIn=" + this.f44298O + ", accountInfoSource=" + this.J2 + ", accountCreated=" + this.Uo + ", errors=" + this.KN + ", pendingPurchases=" + this.xMQ + ", isEligibleToFreeTrial=" + this.mUb + ")";
    }

    public final Map J2() {
        return this.f44300t;
    }

    public final List KN() {
        return this.xMQ;
    }

    public final List O() {
        return this.rl;
    }

    public final List Uo() {
        return this.KN;
    }

    public final boolean mUb() {
        return this.mUb;
    }

    public final Long n() {
        return this.Uo;
    }

    public final Set nr() {
        return this.f44299n;
    }

    public final kgE.Wre rl() {
        return this.J2;
    }

    public final boolean t() {
        return this.f44298O;
    }

    public final Zs xMQ() {
        return this.nr;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ o(java.util.Set r2, java.util.List r3, java.util.Map r4, kgE.Zs r5, boolean r6, kgE.Wre r7, java.lang.Long r8, java.util.List r9, java.util.List r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r1 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L8
            java.util.Set r2 = kotlin.collections.SetsKt.emptySet()
        L8:
            r13 = r12 & 2
            if (r13 == 0) goto L10
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        L10:
            r13 = r12 & 4
            if (r13 == 0) goto L18
            java.util.Map r4 = kotlin.collections.MapsKt.emptyMap()
        L18:
            r13 = r12 & 8
            if (r13 == 0) goto L1e
            kgE.Zs r5 = kgE.Zs.f70102n
        L1e:
            r13 = r12 & 16
            r0 = 0
            if (r13 == 0) goto L24
            r6 = r0
        L24:
            r13 = r12 & 32
            if (r13 == 0) goto L2a
            kgE.Wre r7 = kgE.Wre.f70097n
        L2a:
            r13 = r12 & 64
            if (r13 == 0) goto L2f
            r8 = 0
        L2f:
            r13 = r12 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L37
            java.util.List r9 = kotlin.collections.CollectionsKt.emptyList()
        L37:
            r13 = r12 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L3f
            java.util.List r10 = kotlin.collections.CollectionsKt.emptyList()
        L3f:
            r12 = r12 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L4f
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L5a
        L4f:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L5a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alightcreative.account.o.<init>(java.util.Set, java.util.List, java.util.Map, kgE.Zs, boolean, kgE.Wre, java.lang.Long, java.util.List, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
