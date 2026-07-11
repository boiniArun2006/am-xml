package six;

import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.SceneType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class CN3 {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f73280Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f73281n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ CN3[] f73282o;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final CN3 f73284t = new CN3("SCENE", 0);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final CN3 f73279O = new CN3("TEMPLATE", 1);
    public static final CN3 J2 = new CN3("ELEMENT", 2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final CN3 f73283r = new CN3("CLOUD", 3);

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: six.CN3$j$j, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
        public /* synthetic */ class C1173j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SceneType.values().length];
                try {
                    iArr[SceneType.SCENE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SceneType.ELEMENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SceneType.PRESET.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private j() {
        }

        public final CN3 n(ProjectInfo projectInfo) {
            Intrinsics.checkNotNullParameter(projectInfo, QiDPjiOCZHDS.XaI);
            if (!(projectInfo instanceof ProjectInfo.n)) {
                if (projectInfo instanceof ProjectInfo.j) {
                    return CN3.f73283r;
                }
                throw new NoWhenBranchMatchedException();
            }
            boolean zIsTemplate = projectInfo.isTemplate();
            if (zIsTemplate) {
                return CN3.f73279O;
            }
            if (zIsTemplate) {
                throw new NoWhenBranchMatchedException();
            }
            return rl(((ProjectInfo.n) projectInfo).getType());
        }

        public final CN3 rl(SceneType sceneType) {
            Intrinsics.checkNotNullParameter(sceneType, "sceneType");
            int i2 = C1173j.$EnumSwitchMapping$0[sceneType.ordinal()];
            if (i2 == 1) {
                return CN3.f73284t;
            }
            if (i2 == 2) {
                return CN3.J2;
            }
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            throw new UnsupportedOperationException();
        }
    }

    public static EnumEntries rl() {
        return f73280Z;
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CN3.values().length];
            try {
                iArr[CN3.f73284t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CN3.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CN3.f73283r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CN3.f73279O.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        CN3[] cn3ArrN = n();
        f73282o = cn3ArrN;
        f73280Z = EnumEntriesKt.enumEntries(cn3ArrN);
        f73281n = new j(null);
    }

    private static final /* synthetic */ CN3[] n() {
        return new CN3[]{f73284t, f73279O, J2, f73283r};
    }

    public static CN3 valueOf(String str) {
        return (CN3) Enum.valueOf(CN3.class, str);
    }

    public static CN3[] values() {
        return (CN3[]) f73282o.clone();
    }

    public final SceneType nr() {
        int i2 = n.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1) {
            return SceneType.SCENE;
        }
        if (i2 == 2) {
            return SceneType.ELEMENT;
        }
        if (i2 == 3) {
            return SceneType.SCENE;
        }
        if (i2 == 4) {
            return SceneType.SCENE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final fuX t() {
        int i2 = n.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1) {
            return fuX.f73290n;
        }
        if (i2 == 2) {
            return fuX.f73293t;
        }
        if (i2 == 3) {
            return fuX.f73292r;
        }
        if (i2 == 4) {
            return fuX.f73288O;
        }
        throw new NoWhenBranchMatchedException();
    }

    private CN3(String str, int i2) {
    }
}
