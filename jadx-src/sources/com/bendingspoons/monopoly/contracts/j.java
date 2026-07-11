package com.bendingspoons.monopoly.contracts;

import YV.QJ;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pq.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface j {

    /* JADX INFO: renamed from: com.bendingspoons.monopoly.contracts.j$j, reason: collision with other inner class name */
    public static final class C0725j implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f51398n;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Ml f51399t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0725j)) {
                return false;
            }
            C0725j c0725j = (C0725j) obj;
            return Intrinsics.areEqual(this.f51398n, c0725j.f51398n) && Intrinsics.areEqual(this.rl, c0725j.rl) && Intrinsics.areEqual(this.f51399t, c0725j.f51399t);
        }

        public int hashCode() {
            return (((this.f51398n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f51399t.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.f51398n + ", errorType=" + this.rl + ", info=" + this.f51399t + ")";
        }

        public C0725j(String message, String errorType, Ml info) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(errorType, "errorType");
            Intrinsics.checkNotNullParameter(info, "info");
            this.f51398n = message;
            this.rl = errorType;
            this.f51399t = info;
        }

        public final String n() {
            return this.rl;
        }

        public final Ml rl() {
            return this.f51399t;
        }

        public final String t() {
            return this.f51398n;
        }
    }

    public static final class w6 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final QJ f51401n;
        private final YV.n rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w6)) {
                return false;
            }
            w6 w6Var = (w6) obj;
            return Intrinsics.areEqual(this.f51401n, w6Var.f51401n) && Intrinsics.areEqual(this.rl, w6Var.rl);
        }

        public int hashCode() {
            return (this.f51401n.hashCode() * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "Success(userInfo=" + this.f51401n + ", availableProducts=" + this.rl + ")";
        }

        public w6(QJ userInfo, YV.n availableProducts) {
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            Intrinsics.checkNotNullParameter(availableProducts, "availableProducts");
            this.f51401n = userInfo;
            this.rl = availableProducts;
        }

        public final QJ n() {
            return this.f51401n;
        }
    }

    public static final class n implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f51400n;
        private final Ml rl;

        public n(String message, Ml info) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(info, "info");
            this.f51400n = message;
            this.rl = info;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f51400n, nVar.f51400n) && Intrinsics.areEqual(this.rl, nVar.rl);
        }

        public int hashCode() {
            return (this.f51400n.hashCode() * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "InvalidPurchases(message=" + this.f51400n + ", info=" + this.rl + ")";
        }

        public /* synthetic */ n(String str, Ml ml, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? new Ml() : ml);
        }
    }
}
