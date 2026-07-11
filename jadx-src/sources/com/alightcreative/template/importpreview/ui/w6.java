package com.alightcreative.template.importpreview.ui;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class w6 {

    public static final class j extends w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f46950n;
        private final long rl;

        public j(long j2, long j3) {
            super(null);
            this.f46950n = j2;
            this.rl = j3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f46950n == jVar.f46950n && this.rl == jVar.rl;
        }

        public int hashCode() {
            return (Long.hashCode(this.f46950n) * 31) + Long.hashCode(this.rl);
        }

        public String toString() {
            return "NeedsTrimming(usageLengthMillis=" + this.f46950n + ", mediaLengthMillis=" + this.rl + ")";
        }

        public final long n() {
            return this.rl;
        }

        public final long rl() {
            return this.f46950n;
        }
    }

    public static final class n extends w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f46951n = new n();

        private n() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public int hashCode() {
            return -1109578998;
        }

        public String toString() {
            return "ReplaceDirectly";
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.template.importpreview.ui.w6$w6, reason: collision with other inner class name */
    public static final class C0683w6 extends w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0683w6 f46952n = new C0683w6();

        private C0683w6() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0683w6);
        }

        public int hashCode() {
            return -498415026;
        }

        public String toString() {
            return "ReplaceWithFreezing";
        }
    }

    public /* synthetic */ w6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private w6() {
    }
}
