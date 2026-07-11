package v8;

import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public interface j {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: v8.j$j, reason: collision with other inner class name */
    public static final class EnumC1241j {

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f74665Z;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ EnumC1241j[] f74667o;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final EnumC1241j f74666n = new EnumC1241j("VERBOSE", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final EnumC1241j f74669t = new EnumC1241j("DEBUG", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final EnumC1241j f74664O = new EnumC1241j("INFO", 2);
        public static final EnumC1241j J2 = new EnumC1241j(YmsTEL.CCZYUrwCWrvRh, 3);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final EnumC1241j f74668r = new EnumC1241j("ERROR", 4);

        static {
            EnumC1241j[] enumC1241jArrN = n();
            f74667o = enumC1241jArrN;
            f74665Z = EnumEntriesKt.enumEntries(enumC1241jArrN);
        }

        private static final /* synthetic */ EnumC1241j[] n() {
            return new EnumC1241j[]{f74666n, f74669t, f74664O, J2, f74668r};
        }

        public static EnumC1241j valueOf(String str) {
            return (EnumC1241j) Enum.valueOf(EnumC1241j.class, str);
        }

        public static EnumC1241j[] values() {
            return (EnumC1241j[]) f74667o.clone();
        }

        private EnumC1241j(String str, int i2) {
        }
    }

    void n(EnumC1241j enumC1241j, Function1 function1);

    void rl(EnumC1241j enumC1241j, Function0 function0);
}
