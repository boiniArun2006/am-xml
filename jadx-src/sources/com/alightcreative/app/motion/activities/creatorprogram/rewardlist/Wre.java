package com.alightcreative.app.motion.activities.creatorprogram.rewardlist;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface Wre {

    public static final class j implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f45022n;
        private final List rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f45022n == jVar.f45022n && Intrinsics.areEqual(this.rl, jVar.rl);
        }

        public int hashCode() {
            return (Long.hashCode(this.f45022n) * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "RewardList(tokenCount=" + this.f45022n + ", rewards=" + this.rl + ")";
        }

        public j(long j2, List rewards) {
            Intrinsics.checkNotNullParameter(rewards, "rewards");
            this.f45022n = j2;
            this.rl = rewards;
        }

        public final List n() {
            return this.rl;
        }

        public final long rl() {
            return this.f45022n;
        }
    }
}
