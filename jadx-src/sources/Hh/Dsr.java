package Hh;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Dsr {

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f3930n;
        private boolean nr;
        private final C0136j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private C0136j f3931t;

        /* JADX INFO: renamed from: Hh.Dsr$j$j, reason: collision with other inner class name */
        private static final class C0136j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            String f3932n;
            Object rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            C0136j f3933t;

            private C0136j() {
            }
        }

        private j(String str) {
            C0136j c0136j = new C0136j();
            this.rl = c0136j;
            this.f3931t = c0136j;
            this.nr = false;
            this.f3930n = (String) C.Uo(str);
        }

        private C0136j nr() {
            C0136j c0136j = new C0136j();
            this.f3931t.f3933t = c0136j;
            this.f3931t = c0136j;
            return c0136j;
        }

        public String toString() {
            boolean z2 = this.nr;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f3930n);
            sb.append('{');
            String str = "";
            for (C0136j c0136j = this.rl.f3933t; c0136j != null; c0136j = c0136j.f3933t) {
                Object obj = c0136j.rl;
                if (!z2 || obj != null) {
                    sb.append(str);
                    String str2 = c0136j.f3932n;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private j O(String str, Object obj) {
            C0136j c0136jNr = nr();
            c0136jNr.rl = obj;
            c0136jNr.f3932n = (String) C.Uo(str);
            return this;
        }

        public j n(String str, int i2) {
            return O(str, String.valueOf(i2));
        }

        public j rl(String str, Object obj) {
            return O(str, obj);
        }

        public j t(String str, boolean z2) {
            return O(str, String.valueOf(z2));
        }
    }

    public static boolean n(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static j rl(Object obj) {
        return new j(obj.getClass().getSimpleName());
    }
}
