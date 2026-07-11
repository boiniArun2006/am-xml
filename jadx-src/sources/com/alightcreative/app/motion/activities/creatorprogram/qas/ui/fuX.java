package com.alightcreative.app.motion.activities.creatorprogram.qas.ui;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class fuX {

    public static final class j extends fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final F2p.Ml f44952n;
        private final List rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f44952n == jVar.f44952n && Intrinsics.areEqual(this.rl, jVar.rl);
        }

        public int hashCode() {
            return (this.f44952n.hashCode() * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "Content(qaType=" + this.f44952n + ", qas=" + this.rl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(F2p.Ml qaType, List qas) {
            super(null);
            Intrinsics.checkNotNullParameter(qaType, "qaType");
            Intrinsics.checkNotNullParameter(qas, "qas");
            this.f44952n = qaType;
            this.rl = qas;
        }

        public final F2p.Ml n() {
            return this.f44952n;
        }

        public final List rl() {
            return this.rl;
        }
    }

    public static final class n extends fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f44953n = new n();

        private n() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public int hashCode() {
            return -320570289;
        }

        public String toString() {
            return "Error";
        }
    }

    public /* synthetic */ fuX(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private fuX() {
    }
}
