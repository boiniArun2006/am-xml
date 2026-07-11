package DTN;

import android.content.Context;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface CN3 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j {
        private static final /* synthetic */ j[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f1463r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f1462n = new j("SUCCESS", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f1464t = new j("FAILURE", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final j f1461O = new j("RETRY", 2);

        static {
            j[] jVarArrN = n();
            J2 = jVarArrN;
            f1463r = EnumEntriesKt.enumEntries(jVarArrN);
        }

        private static final /* synthetic */ j[] n() {
            return new j[]{f1462n, f1464t, f1461O};
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) J2.clone();
        }

        private j(String str, int i2) {
        }
    }

    Object n(Context context, Continuation continuation);
}
