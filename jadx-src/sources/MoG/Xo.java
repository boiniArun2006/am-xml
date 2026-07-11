package MoG;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Xo {

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f6760n;

        public static String J2(String str) {
            return "Id(value=" + str + ')';
        }

        public static final /* synthetic */ j n(String str) {
            return new j(str);
        }

        public static String rl(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        public static boolean t(String str, Object obj) {
            return (obj instanceof j) && Intrinsics.areEqual(str, ((j) obj).Uo());
        }

        public final /* synthetic */ String Uo() {
            return this.f6760n;
        }

        public boolean equals(Object obj) {
            return t(this.f6760n, obj);
        }

        public int hashCode() {
            return O(this.f6760n);
        }

        public String toString() {
            return J2(this.f6760n);
        }

        private /* synthetic */ j(String str) {
            this.f6760n = str;
        }

        public static int O(String str) {
            return str.hashCode();
        }

        public static final boolean nr(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }
    }

    public /* synthetic */ Xo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String n();

    private Xo() {
    }
}
