package yF6;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Ml {

    public static final class j extends Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f75588n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f75588n, jVar.f75588n) && Intrinsics.areEqual(this.rl, jVar.rl);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String title, String description) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f75588n = title;
            this.rl = description;
        }

        public int hashCode() {
            return (this.f75588n.hashCode() * 31) + this.rl.hashCode();
        }

        public final String n() {
            return this.rl;
        }

        public final String rl() {
            return this.f75588n;
        }

        public String toString() {
            return "Error(title=" + this.f75588n + ", description=" + this.rl + ")";
        }
    }

    public static final class n extends Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f75589n = new n();

        private n() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return 960656587;
        }
    }

    public /* synthetic */ Ml(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Ml() {
    }
}
