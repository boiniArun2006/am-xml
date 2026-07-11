package com.alightcreative.app.motion.activities.creatorprogram.rewardlist;

import cg.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface Ml {

    public static final class n implements Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final o.C f45021n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f45021n == ((n) obj).f45021n;
        }

        public int hashCode() {
            return this.f45021n.hashCode();
        }

        public String toString() {
            return "OpenRedeemTokens(rewardType=" + this.f45021n + ")";
        }

        public n(o.C rewardType) {
            Intrinsics.checkNotNullParameter(rewardType, "rewardType");
            this.f45021n = rewardType;
        }

        public final o.C n() {
            return this.f45021n;
        }
    }

    public static final class j implements Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f45020n = new j();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return -83545056;
        }

        public String toString() {
            return "Close";
        }

        private j() {
        }
    }
}
