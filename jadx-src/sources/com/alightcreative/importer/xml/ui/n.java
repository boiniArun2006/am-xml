package com.alightcreative.importer.xml.ui;

import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class n {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class j extends n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f46670n;
        public final boolean rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f46670n, jVar.f46670n) && this.rl == jVar.rl;
        }

        public int hashCode() {
            return (this.f46670n.hashCode() * 31) + Boolean.hashCode(this.rl);
        }

        public String toString() {
            return "CloseWithError(message=" + this.f46670n + ", isSingleImport=" + this.rl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String message, boolean z2) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.f46670n = message;
            this.rl = z2;
        }

        public final String n() {
            return this.f46670n;
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.importer.xml.ui.n$n, reason: collision with other inner class name */
    public static final class C0663n extends n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f46671n;
        public final Pair rl;

        public C0663n(String str, Pair pair) {
            super(null);
            this.f46671n = str;
            this.rl = pair;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0663n)) {
                return false;
            }
            C0663n c0663n = (C0663n) obj;
            return Intrinsics.areEqual(this.f46671n, c0663n.f46671n) && Intrinsics.areEqual(this.rl, c0663n.rl);
        }

        public int hashCode() {
            String str = this.f46671n;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Pair pair = this.rl;
            return iHashCode + (pair != null ? pair.hashCode() : 0);
        }

        public String toString() {
            return "CloseWithSuccess(id=" + this.f46671n + ", pair=" + this.rl + ")";
        }

        public final String n() {
            return this.f46671n;
        }

        public final Pair rl() {
            return this.rl;
        }
    }

    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public n() {
    }
}
