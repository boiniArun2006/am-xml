package xAo;

import kgE.K;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Wre {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[K.values().length];
            try {
                iArr[K.f70079o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[K.f70072S.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[K.f70078g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[K.E2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[K.f70077e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[K.f70075X.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[K.f70073T.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[K.f70070N.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[K.f70081v.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[K.Xw.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[K.f70076Z.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String n(K k2) {
        Intrinsics.checkNotNullParameter(k2, "<this>");
        switch (j.$EnumSwitchMapping$0[k2.ordinal()]) {
            case 1:
                return "remove_watermark";
            case 2:
                return "member_effects";
            case 3:
                return "project_package_sharing";
            case 4:
                return "future_member_features";
            case 5:
                return "infinite_project_sharing";
            case 6:
                return "advanced_easing";
            case 7:
                return "layer_parenting";
            case 8:
                return "camera_objects";
            case 9:
                return "cloud_storage_low";
            case 10:
                return "cloud_storage_high";
            case 11:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
