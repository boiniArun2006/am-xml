package juU;

import TFv.Wre;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public interface Ml {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j {
        private static final /* synthetic */ EnumEntries J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ j[] f69626O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f69627n = new j("START", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f69628t = new j("END", 1);

        static {
            j[] jVarArrN = n();
            f69626O = jVarArrN;
            J2 = EnumEntriesKt.enumEntries(jVarArrN);
        }

        private static final /* synthetic */ j[] n() {
            return new j[]{f69627n, f69628t};
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f69626O.clone();
        }

        private j(String str, int i2) {
        }
    }

    Wre n();
}
