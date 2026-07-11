package com.alightcreative.app.motion.templates;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface w6 {

    public static final class n implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Set f46419n;
        private final int rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f46419n, nVar.f46419n) && this.rl == nVar.rl;
        }

        public int hashCode() {
            return (this.f46419n.hashCode() * 31) + Integer.hashCode(this.rl);
        }

        public String toString() {
            return "UnseenFirst(seenTemplatesIDs=" + this.f46419n + ", minTemplates=" + this.rl + ")";
        }

        public n(Set seenTemplatesIDs, int i2) {
            Intrinsics.checkNotNullParameter(seenTemplatesIDs, "seenTemplatesIDs");
            this.f46419n = seenTemplatesIDs;
            this.rl = i2;
        }

        public final int n() {
            return this.rl;
        }

        public final Set rl() {
            return this.f46419n;
        }
    }

    public static final class j implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f46418n = new j();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return -1347638639;
        }

        public String toString() {
            return "Alphabetical";
        }

        private j() {
        }
    }
}
